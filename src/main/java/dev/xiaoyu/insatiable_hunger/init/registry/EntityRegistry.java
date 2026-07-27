package dev.xiaoyu.insatiable_hunger.init.registry;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import dev.xiaoyu.insatiable_hunger.InsatiableHunger;
import dev.xiaoyu.insatiable_hunger.common.entity.boss.Gluttony;

public class EntityRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, InsatiableHunger.MOD_ID);

    public static final RegistryObject<EntityType<Gluttony>> GLUTTONY = ENTITY_TYPES.register("gluttony",
            () -> EntityType.Builder.of(Gluttony::new, MobCategory.MONSTER)
                    .sized(1.5F, 1F)
                    .build("gluttony"));
}