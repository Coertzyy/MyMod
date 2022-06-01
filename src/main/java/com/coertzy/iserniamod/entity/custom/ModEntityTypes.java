package com.coertzy.iserniamod.entity.custom;

import com.coertzy.iserniamod.IserniaMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, IserniaMod.MOD_ID);

    public static final RegistryObject<EntityType<PenguinEntity>> PENGUIN =
            ENTITY_TYPES.register("penguin",
            () -> EntityType.Builder.of(PenguinEntity::new, MobCategory.CREATURE)
                    .sized(0.8f,0.8f)
                    .build(new ResourceLocation(IserniaMod.MOD_ID,"penguin.animatedtexture").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
