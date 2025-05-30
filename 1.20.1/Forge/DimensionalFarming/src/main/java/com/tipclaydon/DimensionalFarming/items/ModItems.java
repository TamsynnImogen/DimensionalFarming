package com.tipclaydon.DimensionalFarming.items;

import com.tipclaydon.DimensionalFarming.DimensionalFarming;
import com.tipclaydon.DimensionalFarming.blocks.ModBlocks;

import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DimensionalFarming.MODID);

    public static final RegistryObject<Item> END_FARMING_ICON = ITEMS.register("end_farming_icon",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLOODBARK_SIGN_ITEM = ITEMS.register("bloodbark_sign",
            () -> new SignItem(new Item.Properties(), ModBlocks.BLOODBARK_SIGN.get(), ModBlocks.BLOODBARK_WALL_SIGN.get()));

     public static final RegistryObject<Item> BLOODBARK_HANGING_SIGN_ITEM = ITEMS.register("bloodbark_hanging_sign",
            () -> new HangingSignItem(ModBlocks.BLOODBARK_HANGING_SIGN.get(), ModBlocks.BLOODBARK_WALL_HANGING_SIGN.get(),
                        new Item.Properties()));

    public static final RegistryObject<Item> NETHER_FARMING_ICON = ITEMS.register("nether_farming_icon",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
