package com.tipclaydon.DimensionalFarming.items;

import com.tipclaydon.DimensionalFarming.DimensionalFarming;
import com.tipclaydon.DimensionalFarming.blocks.ModBlocks;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DimensionalFarming.MODID);

    public static final RegistryObject<Item> NETHER_ICON = ITEMS.register("nether_farming_icon",
            () -> new Item(new Properties()));
    
    public static final RegistryObject<Item> BLOODBARK_PLANKS = ITEMS.register("bloodbark_planks",
            () -> new BlockItem(ModBlocks.BLOODBARK_PLANKS.get(), new Item.Properties()));

    public static final RegistryObject<Item> BLOODBARK_HYPHAE = ITEMS.register("bloodbark_hyphae",
            () -> new BlockItem(ModBlocks.BLOODBARK_HYPHAE.get(), new Item.Properties()));
        
    public static final RegistryObject<Item> STRIPPED_BLOODBARK_HYPHAE = ITEMS.register("stripped_bloodbark_hyphae",
            () -> new BlockItem(ModBlocks.STRIPPED_BLOODBARK_HYPHAE.get(), new Item.Properties()));
                
    public static final RegistryObject<Item> BLOODBARK_STEM = ITEMS.register("bloodbark_stem",
            () -> new BlockItem(ModBlocks.BLOODBARK_STEM.get(), new Item.Properties()));
                
    public static final RegistryObject<Item> STRIPPED_BLOODBARK_STEM = ITEMS.register("stripped_bloodbark_stem",
            () -> new BlockItem(ModBlocks.STRIPPED_BLOODBARK_STEM.get(), new Item.Properties()));

    public static final RegistryObject<Item> BLOODBARK_SLAB = ITEMS.register("bloodbark_slab",
            () -> new BlockItem(ModBlocks.BLOODBARK_SLAB.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BLOODBARK_STAIRS = ITEMS.register("bloodbark_stairs",
            () -> new BlockItem(ModBlocks.BLOODBARK_STAIRS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BLOODBARK_DOOR = ITEMS.register("bloodbark_door",
            () -> new BlockItem(ModBlocks.BLOODBARK_DOOR.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BLOODBARK_TRAPDOOR = ITEMS.register("bloodbark_trapdoor",
            () -> new BlockItem(ModBlocks.BLOODBARK_TRAPDOOR.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BLOODBARK_FENCE = ITEMS.register("bloodbark_fence",
            () -> new BlockItem(ModBlocks.BLOODBARK_FENCE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BLOODBARK_FENCE_GATE = ITEMS.register("bloodbark_fence_gate",
            () -> new BlockItem(ModBlocks.BLOODBARK_FENCE_GATE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BLOODBARK_PRESSURE_PLATE = ITEMS.register("bloodbark_pressure_plate",
            () -> new BlockItem(ModBlocks.BLOODBARK_PRESSURE_PLATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BLOODBARK_BUTTON = ITEMS.register("bloodbark_button",
            () -> new BlockItem(ModBlocks.BLOODBARK_BUTTON.get(), new Item.Properties()));

    public static final RegistryObject<Item> END_ICON = ITEMS.register("end_farming_icon",
            () -> new Item(new Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
