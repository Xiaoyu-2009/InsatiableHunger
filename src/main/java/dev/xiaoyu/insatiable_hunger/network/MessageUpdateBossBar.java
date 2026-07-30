package dev.xiaoyu.insatiable_hunger.network;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.network.NetworkEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Supplier;

public record MessageUpdateBossBar(UUID bossBar, int renderType) {
    public static MessageUpdateBossBar read(FriendlyByteBuf buf) {
        return new MessageUpdateBossBar(buf.readUUID(), buf.readInt());
    }

    public static void write(MessageUpdateBossBar message, FriendlyByteBuf buf) {
        buf.writeUUID(message.bossBar);
        buf.writeInt(message.renderType);
    }

    public static void handle(MessageUpdateBossBar message, Supplier<NetworkEvent.Context> context) {
        context.get().setPacketHandled(true);
        if (context.get().getDirection().getReceptionSide() == LogicalSide.CLIENT) {
            if (message.renderType == -1) {
                bossBarRenderTypes.remove(message.bossBar);
            } else {
                bossBarRenderTypes.put(message.bossBar, message.renderType);
            }
        }
    }

    public static final Map<UUID, Integer> bossBarRenderTypes = new HashMap<>();
}