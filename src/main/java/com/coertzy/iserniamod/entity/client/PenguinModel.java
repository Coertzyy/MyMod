package com.coertzy.iserniamod.entity.client;

import com.coertzy.iserniamod.IserniaMod;
import com.coertzy.iserniamod.entity.custom.PenguinEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PenguinModel extends AnimatedGeoModel<PenguinEntity> {

    @Override
    public ResourceLocation getModelLocation(PenguinEntity object) {
        return new ResourceLocation(IserniaMod.MOD_ID, "geo/penguinanimated.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PenguinEntity object) {
        return new ResourceLocation(IserniaMod.MOD_ID, "textures/entity/penguin/penguinanimated.geo.json");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(PenguinEntity animatable) {
        return new ResourceLocation(IserniaMod.MOD_ID, "animations/penguinoff.geo.json");
    }
}
