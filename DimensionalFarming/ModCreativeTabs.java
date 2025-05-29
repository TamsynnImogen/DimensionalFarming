package com.tipclaydon.DimensionalFarming;

import com.tipclaydon.DimensionalFarming.blocks.ModBlocks;
import com.tipclaydon.DimensionalFarming.items.ModItems;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DimensionalFarming.MODID);

    public static final RegistryObject<CreativeModeTab> NETHER_TAB = TABS.register("nether_tab", () ->
        CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.dimensionalfarming.nether_tab"))
            .icon(() -> new ItemStack(ModItems.NETHER_ICON.get()))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.BLOODBARK_HYPHAE.get());
                output.accept(ModItems.STRIPPED_BLOODBARK_HYPHAE.get());
                output.accept(ModItems.BLOODBARK_STEM.get());
                output.accept(ModItems.STRIPPED_BLOODBARK_STEM.get());
                output.accept(ModItems.BLOODBARK_PLANKS.get());
                output.accept(ModItems.BLOODBARK_SLAB.get());
                output.accept(ModItems.BLOODBARK_STAIRS.get());
                output.accept(ModItems.BLOODBARK_DOOR.get());
                output.accept(ModItems.BLOODBARK_TRAPDOOR.get());
                output.accept(ModItems.BLOODBARK_FENCE.get());
                output.accept(ModItems.BLOODBARK_FENCE_GATE.get());
                output.accept(ModItems.BLOODBARK_PRESSURE_PLATE.get());
                output.accept(ModItems.BLOODBARK_BUTTON.get());
            })
            .build()
    );

    public static final RegistryObject<CreativeModeTab> END_TAB = TABS.register("end_tab", () ->
        CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.dimensionalfarming.end_tab"))
            .icon(() -> new ItemStack(ModItems.END_ICON.get()))
            .displayItems((parameters, output) -> {
                output.accept(Items.CHORUS_FRUIT);
            })
            .build()
    );

    public static void register(IEventBus bus) {
        TABS.register(bus);
    }
}
