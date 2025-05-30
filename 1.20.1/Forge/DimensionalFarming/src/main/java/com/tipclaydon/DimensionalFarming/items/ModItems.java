package com.tipclaydon.DimensionalFarming.items;

import com.tipclaydon.DimensionalFarming.DimensionalFarming;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DimensionalFarming.MODID);

    public static final RegistryObject<Item> BLOODBARK_STICK = ITEMS.register("bloodbark_stick",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
