package dev.xiaoyu.insatiable_hunger.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import dev.xiaoyu.insatiable_hunger.InsatiableHunger;
import dev.xiaoyu.insatiable_hunger.common.entity.boss.Gluttony;
import dev.xiaoyu.insatiable_hunger.init.registry.EntityRegistry;

@Mod.EventBusSubscriber(modid = InsatiableHunger.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityAttributeEvent {

    @SubscribeEvent
    public static void onRegisterAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityRegistry.GLUTTONY.get(), Gluttony.createAttributes().build());
    }
}