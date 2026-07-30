package dev.xiaoyu.insatiable_hunger.init.registry;

import dev.xiaoyu.insatiable_hunger.InsatiableHunger;
import dev.xiaoyu.insatiable_hunger.network.MessageUpdateBossBar;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.simple.SimpleChannel;

@SuppressWarnings("removal")
public class NetworkRegistry {
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel NETWORK = net.minecraftforge.network.NetworkRegistry.ChannelBuilder
            .named(new ResourceLocation(InsatiableHunger.MOD_ID, "main"))
            .clientAcceptedVersions(PROTOCOL_VERSION::equals)
            .serverAcceptedVersions(PROTOCOL_VERSION::equals)
            .networkProtocolVersion(() -> PROTOCOL_VERSION)
            .simpleChannel();

    public static void register() {
        NETWORK.registerMessage(0, MessageUpdateBossBar.class, MessageUpdateBossBar::write, MessageUpdateBossBar::read, MessageUpdateBossBar::handle);
    }

    public static <MSG> void sendNonLocal(MSG msg, ServerPlayer player) {
        NETWORK.sendTo(msg, player.connection.connection, NetworkDirection.PLAY_TO_CLIENT);
    }
}