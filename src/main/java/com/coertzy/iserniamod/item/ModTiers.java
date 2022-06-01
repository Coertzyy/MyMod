package com.coertzy.iserniamod.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier ICE = new ForgeTier(6, 281, 1f, 0,
            23, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ModItems.ICE_DROOP.get()));

    public static final ForgeTier HERO = new ForgeTier(8, 4000, 1f, 2,
            23, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(Items.NETHER_STAR.asItem()));

    public static final ForgeTier STARGLITTER = new ForgeTier(7, 3054, 2f, 0,
            23, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(Items.NETHER_STAR.asItem()));

    public static final ForgeTier AETHER = new ForgeTier(6, 2806, 9f, 0,
            10, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ModItems.AETHERINITE.get()));

    public static final ForgeTier NIGHTMARE = new ForgeTier(7, 2032, -15f, 4,
            16, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ModItems.ISERBIAN_INGOT.get()));

    public static final ForgeTier CRESCENT = new ForgeTier(8, 3626, 9f, 0,
            21, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ModItems.CRESCENT_GEM.get()));

    public static final ForgeTier SOUL = new ForgeTier(8, 3348, 1.5f, 0,
            17, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ModItems.VITALEOUSCEUM.get()));

    public static final ForgeTier RUBY = new ForgeTier(5, 1987, 7f, 0,
            10, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ModItems.RUBY.get()));

    public static final ForgeTier ERBIAN = new ForgeTier(4, 1641, 6f, 0,
            10, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ModItems.ERBIAN_INGOT.get()));
}
