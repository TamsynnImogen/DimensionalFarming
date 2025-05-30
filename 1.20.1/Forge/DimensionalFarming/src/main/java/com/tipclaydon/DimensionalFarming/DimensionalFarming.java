package com.tipclaydon.DimensionalFarming;

import com.tipclaydon.DimensionalFarming.blocks.ModBlocks;
import com.tipclaydon.DimensionalFarming.items.ModItems;
import com.tipclaydon.DimensionalFarming.tabs.ModCreativeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DimensionalFarming.MODID)
public class DimensionalFarming {
    public static final String MODID = "dimensionalfarming";

    @SuppressWarnings("removal")
    public DimensionalFarming() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
    }
}
