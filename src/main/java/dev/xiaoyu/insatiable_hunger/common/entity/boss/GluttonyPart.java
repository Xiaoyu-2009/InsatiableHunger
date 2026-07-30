package dev.xiaoyu.insatiable_hunger.common.entity.boss;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraftforge.entity.PartEntity;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class GluttonyPart extends PartEntity<Gluttony> {
    private final EntityDimensions size;

    public GluttonyPart(Gluttony parent, float sizeX, float sizeY) {
        super(parent);
        this.size = EntityDimensions.scalable(sizeX, sizeY);
        this.refreshDimensions();
    }

    @Override
    protected void defineSynchedData() {}

    @Override
    public boolean canBeCollidedWith() {
        return true;
    }

    @Override
    public boolean isPickable() {
        return this.getParent().isAlive();
    }

    @Override
    public boolean hurt(@NotNull DamageSource source, float amount) {
        boolean flag = this.getParent() != null && this.getParent().hurt(source, amount);
        if (flag) {
            this.gameEvent(GameEvent.ENTITY_DAMAGE);
        }
        return flag;
    }

    @Override
    protected void readAdditionalSaveData(@NotNull CompoundTag compound) {}

    @Override
    protected void addAdditionalSaveData(@NotNull CompoundTag compound) {}

    @Override
    public boolean is(@NotNull Entity entity) {
        return this == entity || this.getParent() == entity;
    }

    @Override
    protected boolean canRide(@NotNull Entity entity) {
        return false;
    }

    @Override
    public boolean canChangeDimensions() {
        return false;
    }

    @Override
    public @NotNull Packet<ClientGamePacketListener> getAddEntityPacket() {
        throw new UnsupportedOperationException();
    }

    @Override
    public @NotNull EntityDimensions getDimensions(@NotNull Pose pose) {
        return this.size;
    }

    @Override
    public void setId(int id) {
        super.setId(id + 1);
    }

    public static void assignPartIDs(Gluttony parent) {
        PartEntity<?>[] parts = parent.getParts();
        for (int i = 0, partsLength = Objects.requireNonNull(parts).length; i < partsLength; i++) {
            PartEntity<?> part = parts[i];
            part.setId(parent.getId() + i);
        }
    }
}