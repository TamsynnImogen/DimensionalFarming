package com.tipclaydon.DimensionalFarming;

import com.tipclaydon.DimensionalFarming.blocks.ModBlocks;
import com.tipclaydon.DimensionalFarming.items.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(ForgeRegistries.CREATIVE_MODE_TAB, DimensionalFarming.MODID);

    public static final RegistryObject<CreativeModeTab> DIMENSIONAL_TAB = CREATIVE_MODE_TABS.register("dimensional_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.BLOODBARK_LOG.get()))
                    .title(Component.translatable("itemGroup.dimensionalfarming"))
                    .displayItems((params, output) -> {
                        // Add blocks and items to the tab
                        output.accept(ModBlocks.BLOODBARK_LOG.get());
                        output.accept(ModBlocks.BLOODBARK_LEAVES.get());
                        output.accept(ModItems.BLOODBARK_STICK.get());

                        // Add more as needed
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
