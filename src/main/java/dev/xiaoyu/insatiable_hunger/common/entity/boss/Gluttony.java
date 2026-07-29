package dev.xiaoyu.insatiable_hunger.common.entity.boss;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Gluttony extends Monster {
    private static final EntityDataAccessor<Integer> GROWTH_STAGE = SynchedEntityData.defineId(Gluttony.class, EntityDataSerializers.INT);

    public Gluttony(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
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
            case 3 -> EntityDimensions.fixed(2.5F, 3.0F);
            case 5 -> EntityDimensions.fixed(5.0F, 6.0F);
            default -> EntityDimensions.fixed(1.5F, 1.0F);
        };
    }
}