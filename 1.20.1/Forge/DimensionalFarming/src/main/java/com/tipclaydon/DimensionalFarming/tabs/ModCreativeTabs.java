package com.tipclaydon.DimensionalFarming.tabs;

import com.tipclaydon.DimensionalFarming.DimensionalFarming;
import com.tipclaydon.DimensionalFarming.blocks.ModBlocks;
import com.tipclaydon.DimensionalFarming.items.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.core.registries.Registries;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DimensionalFarming.MODID);

    public static final RegistryObject<CreativeModeTab> NETHER_FARMING_TAB = CREATIVE_MODE_TABS.register("nether_farming_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.BLOODBARK_LOG.get())) // 🔥 Replace with Nether-themed block/item
                    .title(Component.translatable("itemGroup.dimensionalfarming.nether"))
                    .displayItems((params, output) -> {
                        output.accept(ModBlocks.BLOODBARK_LOG.get());
                        output.accept(ModItems.BLOODBARK_STICK.get());
                        // Add more Nether blocks/items here
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> END_FARMING_TAB = CREATIVE_MODE_TABS.register("end_farming_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.BLOODBARK_LOG.get())) // 🟣 Replace with End-themed block/item
                    .title(Component.translatable("itemGroup.dimensionalfarming.end"))
                    .displayItems((params, output) -> {
                        output.accept(ModBlocks.BLOODBARK_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.BLOODBARK_BUTTON.get());
                        // Add more End blocks/items here
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
