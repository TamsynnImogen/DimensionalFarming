package com.tipclaydon.DimensionalFarming.util;

import net.minecraft.client.renderer.Sheets;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.common.Mod;

public class ModWoodTypes {
    public static final BlockSetType BLOODBARK_SET_TYPE = new BlockSetType("bloodbark");
    public static final WoodType BLOODBARK_WOOD_TYPE = WoodType.register(new WoodType("bloodbark", BLOODBARK_SET_TYPE));
}
