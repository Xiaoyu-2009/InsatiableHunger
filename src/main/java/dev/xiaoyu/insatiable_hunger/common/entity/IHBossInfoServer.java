package dev.xiaoyu.insatiable_hunger.common.entity;

import dev.xiaoyu.insatiable_hunger.init.registry.NetworkRegistry;
import dev.xiaoyu.insatiable_hunger.network.MessageUpdateBossBar;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import org.jetbrains.annotations.NotNull;

public class IHBossInfoServer extends ServerBossEvent {
    private final int renderType;

    public IHBossInfoServer(Component component, BossBarColor bossBarColor, boolean dark, int renderType) {
        super(component, bossBarColor, BossBarOverlay.PROGRESS);
        this.setDarkenScreen(dark);
        this.renderType = renderType;
    }

    @Override
    public void addPlayer(@NotNull ServerPlayer serverPlayer) {
        NetworkRegistry.sendNonLocal(new MessageUpdateBossBar(this.getId(), renderType), serverPlayer);
        super.addPlayer(serverPlayer);
    }

    @Override
    public void removePlayer(@NotNull ServerPlayer serverPlayer) {
        NetworkRegistry.sendNonLocal(new MessageUpdateBossBar(this.getId(), -1), serverPlayer);
        super.removePlayer(serverPlayer);
    }
}