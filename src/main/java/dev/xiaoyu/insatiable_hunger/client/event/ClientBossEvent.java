package dev.xiaoyu.insatiable_hunger.client.event;

import dev.xiaoyu.insatiable_hunger.InsatiableHunger;
import dev.xiaoyu.insatiable_hunger.client.gui.CustomBossBar;
import dev.xiaoyu.insatiable_hunger.network.MessageUpdateBossBar;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.CustomizeGuiOverlayEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = InsatiableHunger.MOD_ID, value = Dist.CLIENT)
public class ClientBossEvent {

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void renderBossOverlay(CustomizeGuiOverlayEvent.BossEventProgress event) {
        if (MessageUpdateBossBar.bossBarRenderTypes.containsKey(event.getBossEvent().getId())) {
            event.setCanceled(true);
            CustomBossBar.GLUTTONY_BAR.renderBossBar(event);
        }
    }
}