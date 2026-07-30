package dev.xiaoyu.insatiable_hunger;

import dev.xiaoyu.insatiable_hunger.init.registry.CreativeTabRegistry;
import dev.xiaoyu.insatiable_hunger.init.registry.EntityRegistry;
import dev.xiaoyu.insatiable_hunger.init.registry.ItemRegistry;
import dev.xiaoyu.insatiable_hunger.init.registry.NetworkRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(InsatiableHunger.MOD_ID)
public class InsatiableHunger {
    public static final String MOD_ID = "insatiable_hunger";
    public static final String MODID = MOD_ID;
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @SuppressWarnings("removal")
    public InsatiableHunger() {
        EntityRegistry.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        CreativeTabRegistry.CREATIVE_MODE_TABS.register(FMLJavaModLoadingContext.get().getModEventBus());
        NetworkRegistry.register();
    }
}