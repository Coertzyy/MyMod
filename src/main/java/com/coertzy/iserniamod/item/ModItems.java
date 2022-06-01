package com.coertzy.iserniamod.item;

import com.coertzy.iserniamod.IserniaMod;
import com.coertzy.iserniamod.entity.custom.ModEntityTypes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, IserniaMod.MOD_ID);

    public static final RegistryObject<Item> AETHERINITE = ITEMS.register("aetherinite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> VITALEOUSCEUM = ITEMS.register("vitaleousceum",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> CRESCENT_GEM = ITEMS.register("crescent_gem",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> ICE_DROOP = ITEMS.register("ice_droop",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> ISERBIAN_INGOT = ITEMS.register("iserbian_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> ERBIAN_INGOT = ITEMS.register("erbian_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> FROSTBORNE = ITEMS.register("frostborne",
            () -> new SwordItem(ModTiers.ICE, 21, 6f,
                    new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> HEROS_SWORD = ITEMS.register("heros_sword",
            () -> new SwordItem(ModTiers.HERO, 26, 7.1f,
                    new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> STARGLITTER_SWORD = ITEMS.register("starglitter_sword",
            () -> new SwordItem(ModTiers.STARGLITTER, 19, 6f,
                    new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> AETHER_SWORD = ITEMS.register("aether_sword",
            () -> new SwordItem(ModTiers.AETHER, 11, 2.2f,
                    new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> CRESCENT_SWORD = ITEMS.register("crescent_sword",
            () -> new SwordItem(ModTiers.CRESCENT, 13, 3.4f,
                    new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> PROTOTYPE_NIGHTMARE = ITEMS.register("prototype_nightmare",
            () -> new SwordItem(ModTiers.NIGHTMARE, 31, -10f,
                    new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> SOUL = ITEMS.register("soul",
            () -> new SwordItem(ModTiers.SOUL, 22, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> ERBIAN_SWORD = ITEMS.register("erbian_sword",
            () -> new SwordItem(ModTiers.ERBIAN, 21, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModTiers.RUBY, 10, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModTiers.RUBY, 5, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> CRESCENT_PICKAXE = ITEMS.register("crescent_pickaxe",
            () -> new PickaxeItem(ModTiers.CRESCENT, 7, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> AETHER_PICKAXE = ITEMS.register("aether_pickaxe",
            () -> new PickaxeItem(ModTiers.AETHER, 7, 0.5f,
                    new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));

    public static final RegistryObject<Item> PENGUIN_SPAWN_EGG = ITEMS.register("penguin_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.PENGUIN,646464,00000,
                    new Item.Properties().tab(ModCreativeModeTab.ISERNIA_ITEMS)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
