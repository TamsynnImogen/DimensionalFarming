package com.tipclaydon.DimensionalFarming;

import com.mojang.logging.LogUtils;
import com.tipclaydon.DimensionalFarming.blocks.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.slf4j.Logger;

@Mod.EventBusSubscriber(modid = DimensionalFarming.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientModEvents {

    private static final Logger LOGGER = LogUtils.getLogger();

    @SubscribeEvent
    @SuppressWarnings("removal")
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            // Set cutout render layer for see-through blocks
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLOODBARK_TRAPDOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLOODBARK_DOOR.get(), RenderType.cutout());

            // Add any other blocks like crops, glass, etc. here
        });

        LOGGER.info("Client setup complete for Dimensional Farming.");
    }
}
