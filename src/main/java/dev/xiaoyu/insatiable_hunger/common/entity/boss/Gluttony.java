package dev.xiaoyu.insatiable_hunger.common.entity.boss;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.entity.PartEntity;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Gluttony extends Monster {
    private static final EntityDataAccessor<Integer> GROWTH_STAGE = SynchedEntityData.defineId(Gluttony.class, EntityDataSerializers.INT);

    // 五阶段多段碰撞箱[尾巴]
    public final GluttonyPart tailPart;
    public final GluttonyPart tailMidPart;
    public final GluttonyPart tailBottomPart;
    public final GluttonyPart tailTipPart;
    public final GluttonyPart bone7Part;
    public final GluttonyPart[] fiveParts;

    public Gluttony(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);

        // 尾巴
        this.tailPart = new GluttonyPart(this, 3.7F, 2.4F);
        this.tailMidPart = new GluttonyPart(this, 3.5F, 2.0F);
        this.tailBottomPart = new GluttonyPart(this, 3.3F, 1.5F);
        this.tailTipPart = new GluttonyPart(this, 3.45F, 0.9F);
        this.bone7Part = new GluttonyPart(this, 3.2F, 0.7F);

        this.fiveParts = new GluttonyPart[]{
                this.tailPart, this.tailMidPart, this.tailBottomPart, this.tailTipPart, this.bone7Part
        };

        this.setId(Entity.ENTITY_COUNTER.getAndAdd(this.fiveParts.length + 1) + 1);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 8.0D)
                .add(Attributes.ATTACK_DAMAGE, 4.0D);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(GROWTH_STAGE, 1);
    }

    public int getGrowthStage() {
        return this.entityData.get(GROWTH_STAGE);
    }

    private void setGrowthStage(int stage) {
        this.entityData.set(GROWTH_STAGE, stage);
    }

    @Override
    public void addAdditionalSaveData(@NotNull CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putInt("growth_stage", this.getGrowthStage());
    }

    @Override
    public void readAdditionalSaveData(@NotNull CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        if (tag.contains("growth_stage")) {
            this.setGrowthStage(tag.getInt("growth_stage"));
        }
        Objects.requireNonNull(this.getAttribute(Attributes.MAX_HEALTH)).setBaseValue(getStageMaxHealth());
        Objects.requireNonNull(this.getAttribute(Attributes.ATTACK_DAMAGE)).setBaseValue(getStageAttackDamage());
        this.setHealth(this.getMaxHealth());
        this.refreshDimensions();
    }

    @Override
    public void onSyncedDataUpdated(@NotNull EntityDataAccessor<?> key) {
        super.onSyncedDataUpdated(key);
        if (GROWTH_STAGE.equals(key)) {
            this.refreshDimensions();
        }
    }

    private double getStageMaxHealth() {
        return switch (this.getGrowthStage()) {
            case 3 -> 80.0D;
            case 5 -> 600.0D;
            default -> 8.0D;
        };
    }

    private double getStageAttackDamage() {
        return switch (this.getGrowthStage()) {
            case 3 -> 11.0D;
            case 5 -> 30.0D;
            default -> 4.0D;
        };
    }

    @Override
    public @NotNull EntityDimensions getDimensions(@NotNull Pose pose) {
        return switch (this.getGrowthStage()) {
            case 3 -> EntityDimensions.fixed(2.5F, 3F);
            case 5 -> EntityDimensions.fixed(4F, 7F);
            default -> EntityDimensions.fixed(1.5F, 1F);
        };
    }

    @Override
    public void setId(int id) {
        super.setId(id);
        
        for (int i = 0; i < this.fiveParts.length; i++) {
            this.fiveParts[i].setId(id + i + 1);
        }
    }

    @Override
    public boolean isMultipartEntity() {
        return true;
    }

    @Override
    public PartEntity<?>[] getParts() {
        return this.fiveParts;
    }

    @Override
    public void recreateFromPacket(@NotNull ClientboundAddEntityPacket packet) {
        super.recreateFromPacket(packet);
    }

    @Override
    public void tick() {
        super.tick();

        if (this.getGrowthStage() == 5 && !this.isNoAi()) {
            float yaw = this.yBodyRot * Mth.DEG_TO_RAD;
            float sin = Mth.sin(yaw);
            float cos = Mth.cos(yaw);

            Vec3[] avector3d = new Vec3[this.fiveParts.length];
            for (int j = 0; j < this.fiveParts.length; ++j) {
                avector3d[j] = new Vec3(this.fiveParts[j].getX(), this.fiveParts[j].getY(), this.fiveParts[j].getZ());
            }

            // Tail
            setPartPos(this.tailPart, 50, -123, sin, cos);
            // Tailmid
            setPartPos(this.tailMidPart, 56, -182, sin, cos);
            // Tailbottom
            setPartPos(this.tailBottomPart, 58, -240, sin, cos);
            // Tailtip
            setPartPos(this.tailTipPart, 61, -295, sin, cos);
            // bone7
            setPartPos(this.bone7Part, 62, -348, sin, cos);

            for (int l = 0; l < this.fiveParts.length; ++l) {
                this.fiveParts[l].xo = avector3d[l].x;
                this.fiveParts[l].yo = avector3d[l].y;
                this.fiveParts[l].zo = avector3d[l].z;
                this.fiveParts[l].xOld = avector3d[l].x;
                this.fiveParts[l].yOld = avector3d[l].y;
                this.fiveParts[l].zOld = avector3d[l].z;
            }
        }
    }

    private void setPartPos(GluttonyPart part, float dy, float dz, float sin, float cos) {
        float rx = (float) 0 * cos - dz * sin;
        float rz = (float) 0 * sin + dz * cos;
        part.setPos(this.getX() + rx / 16.0F, this.getY() + dy / 16.0F, this.getZ() + rz / 16.0F);
    }
}