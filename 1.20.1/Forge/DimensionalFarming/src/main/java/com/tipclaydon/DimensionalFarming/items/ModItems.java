package com.tipclaydon.DimensionalFarming.items;

import com.tipclaydon.DimensionalFarming.DimensionalFarming;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@net.minecraftforge.fml.common.Mod.EventBusSubscriber(modid = DimensionalFarming.MODID, bus = net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    /** Shared item register — used by blocks as well */
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DimensionalFarming.MODID);

    /** Example standalone item */
    public static final RegistryObject<Item> BLOODBARK_STICK = ITEMS.register("bloodbark_stick",
            () -> new Item(new Item.Properties()));

    // More items can go here, for example:
    // public static final RegistryObject<Item> RAW_SOUL_FRUIT = ...

    public static final net.minecraft.world.item.CreativeModeTab BUILDING_TAB = CreativeModeTabs.BUILDING_BLOCKS;

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
