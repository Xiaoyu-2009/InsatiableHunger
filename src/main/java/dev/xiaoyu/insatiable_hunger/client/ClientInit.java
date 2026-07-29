package dev.xiaoyu.insatiable_hunger.client;

import dev.xiaoyu.insatiable_hunger.InsatiableHunger;
import dev.xiaoyu.insatiable_hunger.client.model.entity.boss.gluttony.FiveModel;
import dev.xiaoyu.insatiable_hunger.client.model.entity.boss.gluttony.OneModel;
import dev.xiaoyu.insatiable_hunger.client.model.entity.boss.gluttony.ThreeModel;
import dev.xiaoyu.insatiable_hunger.client.renderer.entity.boss.GluttonyRenderer;
import dev.xiaoyu.insatiable_hunger.init.registry.EntityRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = InsatiableHunger.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientInit {

    @SubscribeEvent
    public static void onRegisterEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityRegistry.GLUTTONY.get(), GluttonyRenderer::new);
    }

    @SubscribeEvent
    public static void onRegisterLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(OneModel.LAYER_LOCATION, OneModel::createBodyLayer);
        event.registerLayerDefinition(ThreeModel.LAYER_LOCATION, ThreeModel::createBodyLayer);
        event.registerLayerDefinition(FiveModel.LAYER_LOCATION, FiveModel::createBodyLayer);
    }
}