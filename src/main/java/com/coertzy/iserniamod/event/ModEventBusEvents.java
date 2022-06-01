package com.coertzy.iserniamod.event;

import com.coertzy.iserniamod.entity.custom.ModEntityTypes;
import com.coertzy.iserniamod.entity.custom.PenguinEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.PENGUIN.get(), PenguinEntity.setAttributes());
    }
}
