package com.coertzy.iserniamod.item;

import com.coertzy.iserniamod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ISERNIA_ITEMS = new CreativeModeTab("iserniaitemsModtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FROSTBORNE.get());
        }
    };

    public static final CreativeModeTab ISERNIA_BLOCKS = new CreativeModeTab("iserniablocksModtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.AETHER_ORE.get());
        }
    };
}
