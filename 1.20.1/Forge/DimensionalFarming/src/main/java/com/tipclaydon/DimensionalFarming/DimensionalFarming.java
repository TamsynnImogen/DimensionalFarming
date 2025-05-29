package com.tipclaydon.DimensionalFarming;

import com.mojang.logging.LogUtils;
import com.tipclaydon.DimensionalFarming.blocks.ModBlocks;
import com.tipclaydon.DimensionalFarming.items.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(DimensionalFarming.MOD_ID)
public class DimensionalFarming {
    public static final String MOD_ID = "dimensionalfarming";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DimensionalFarming() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register content
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Event listeners
        modEventBus.addListener(DimensionalFarming::commonSetup);
        modEventBus.addListener(this::addCreative);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private static void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Common setup for Dimensional Farming");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.BLOODBARK_LOG);
            event.accept(ModBlocks.BLOODBARK_LEAVES);
        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.BLOODBARK_PLANKS);
            event.accept(ModBlocks.BLOODBARK_STAIRS);
            event.accept(ModBlocks.BLOODBARK_SLAB);
            event.accept(ModBlocks.BLOODBARK_FENCE);
            event.accept(ModBlocks.BLOODBARK_FENCE_GATE);
            event.accept(ModBlocks.BLOODBARK_BUTTON);
            event.accept(ModBlocks.BLOODBARK_PRESSURE_PLATE);
            event.accept(ModBlocks.BLOODBARK_DOOR);
            event.accept(ModBlocks.BLOODBARK_TRAPDOOR);
        }

        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModBlocks.BLOODBARK_SIGN);
            event.accept(ModBlocks.BLOODBARK_HANGING_SIGN);
        }
    }
}
