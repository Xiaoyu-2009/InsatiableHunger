package dev.xiaoyu.insatiable_hunger.init.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import dev.xiaoyu.insatiable_hunger.InsatiableHunger;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InsatiableHunger.MOD_ID);

    public static final RegistryObject<Item> GLUTTONY_SPAWN_EGG = ITEMS.register("gluttony_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityRegistry.GLUTTONY, 0x3B2F2A, 0x8B0000, new Item.Properties()));
}