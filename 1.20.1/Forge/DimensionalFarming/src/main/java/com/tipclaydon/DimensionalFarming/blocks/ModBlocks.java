package com.tipclaydon.DimensionalFarming.blocks;

import com.tipclaydon.DimensionalFarming.DimensionalFarming;
import com.tipclaydon.DimensionalFarming.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = DimensionalFarming.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DimensionalFarming.MODID);

    // This shares the ITEMS registry from ModItems (you mentioned you wanted that)
    public static final DeferredRegister<Item> ITEMS = ModItems.ITEMS;

    // Example block: Bloodbark Log
    public static final RegistryObject<Block> BLOODBARK_LOG = registerBlock("bloodbark_log",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModItems.BUILDING_TAB);

    // Add more block declarations like this:
    public static final RegistryObject<Block> BLOODBARK_LEAVES = registerBlock("bloodbark_leaves",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModItems.BUILDING_TAB);

    // Add others like doors, trapdoors, planks, etc. here...

    /** Helper method to register block and corresponding item */
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
