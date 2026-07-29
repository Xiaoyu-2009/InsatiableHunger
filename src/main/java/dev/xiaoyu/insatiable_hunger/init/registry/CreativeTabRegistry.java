package dev.xiaoyu.insatiable_hunger.init.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import dev.xiaoyu.insatiable_hunger.InsatiableHunger;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InsatiableHunger.MOD_ID);

    public static final RegistryObject<CreativeModeTab> INSATIABLE_HUNGER_TAB = CREATIVE_MODE_TABS.register("insatiable_hunger_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + InsatiableHunger.MOD_ID))
                    .icon(() -> new ItemStack(ItemRegistry.GLUTTONY_SPAWN_EGG.get()))
                    .displayItems((parameters, output) -> {
                        ItemRegistry.ITEMS.getEntries().forEach(registryObject -> {
                            output.accept(registryObject.get());
                        });
                    })
                    .build());
}