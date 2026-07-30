package dev.xiaoyu.insatiable_hunger.common.entity.boss;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.AnimationState;
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

    // 五阶段碰撞箱[尾部]
    public final GluttonyPart tailPart;
    public final GluttonyPart tailMidPart;
    public final GluttonyPart tailBottomPart;
    public final GluttonyPart tailTipPart;
    public final GluttonyPart bone7Part;
    public final GluttonyPart[] fiveParts;

    // 五阶段碰撞箱[头部]
    public final GluttonyPart headPart;
    public final GluttonyPart[] allParts;

    public final AnimationState idleAnimationState = new AnimationState();

    public Gluttony(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);

        // 尾部
        this.tailPart = new GluttonyPart(this, 3.7F, 2.4F);
        this.tailMidPart = new GluttonyPart(this, 3.5F, 2.0F);
        this.tailBottomPart = new GluttonyPart(this, 3.3F, 1.5F);
        this.tailTipPart = new GluttonyPart(this, 3.45F, 0.9F);
        this.bone7Part = new GluttonyPart(this, 3.2F, 0.7F);

        this.fiveParts = new GluttonyPart[]{
            this.tailPart, this.tailMidPart, this.tailBottomPart, this.tailTipPart, this.bone7Part
        };

        // 头部
        this.headPart = new GluttonyPart(this, 3.0F, 2.5F);

        this.allParts = new GluttonyPart[]{
            this.tailPart, this.tailMidPart, this.tailBottomPart, this.tailTipPart, this.bone7Part,
            this.headPart
        };

        this.setId(Entity.ENTITY_COUNTER.getAndAdd(this.allParts.length + 1) + 1);
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

        for (int i = 0; i < this.allParts.length; i++) {
            this.allParts[i].setId(id + i + 1);
        }
    }

    @Override
    public boolean isMultipartEntity() {
        return true;
    }

    @Override
    public PartEntity<?>[] getParts() {
        return this.allParts;
    }

    @Override
    public void recreateFromPacket(@NotNull ClientboundAddEntityPacket packet) {
        super.recreateFromPacket(packet);
    }

    @Override
    public void tick() {
        super.tick();

        if (this.level().isClientSide) {
            if (this.getGrowthStage() == 5) {
                this.idleAnimationState.startIfStopped(this.tickCount);
            } else {
                this.idleAnimationState.stop();
            }
        }

        if (this.getGrowthStage() == 5 && !this.isNoAi()) {
            float yaw = this.yBodyRot * Mth.DEG_TO_RAD;
            float sin = Mth.sin(yaw);
            float cos = Mth.cos(yaw);

            Vec3[] avector3d = new Vec3[this.allParts.length];
            for (int j = 0; j < this.allParts.length; ++j) {
                avector3d[j] = new Vec3(this.allParts[j].getX(), this.allParts[j].getY(), this.allParts[j].getZ());
            }

            // 尾部
            setPartPos(this.tailPart, 50, -123, sin, cos);
            setPartPos(this.tailMidPart, 56, -182, sin, cos);
            setPartPos(this.tailBottomPart, 58, -240, sin, cos);
            setPartPos(this.tailTipPart, 61, -295, sin, cos);
            setPartPos(this.bone7Part, 62, -348, sin, cos);

            // 头部
            setPartPos(this.headPart, 37, 118, sin, cos);

            for (int l = 0; l < this.allParts.length; ++l) {
                this.allParts[l].xo = avector3d[l].x;
                this.allParts[l].yo = avector3d[l].y;
                this.allParts[l].zo = avector3d[l].z;
                this.allParts[l].xOld = avector3d[l].x;
                this.allParts[l].yOld = avector3d[l].y;
                this.allParts[l].zOld = avector3d[l].z;
            }
        }
    }

    private void setPartPos(GluttonyPart part, float dy, float dz, float sin, float cos) {
        float rx = (float) 0 * cos - dz * sin;
        float rz = (float) 0 * sin + dz * cos;
        part.setPos(this.getX() + rx / 16.0F, this.getY() + dy / 16.0F, this.getZ() + rz / 16.0F);
    }
}