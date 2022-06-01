package com.coertzy.iserniamod.block;

import com.coertzy.iserniamod.IserniaMod;
import com.coertzy.iserniamod.item.ModCreativeModeTab;
import com.coertzy.iserniamod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, IserniaMod.MOD_ID);

    public static final RegistryObject<Block> AETHER_ORE = registerBlock("aether_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(10f)));

    public static final RegistryObject<Block> PRISMATIC_PLANKS = registerBlock("prismatic_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(1f, 12f)));

    public static final RegistryObject<Block> CRESCENT_LOG = registerBlock("crescent_log",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(1f, 12f)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTab.ISERNIA_BLOCKS)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
    }
