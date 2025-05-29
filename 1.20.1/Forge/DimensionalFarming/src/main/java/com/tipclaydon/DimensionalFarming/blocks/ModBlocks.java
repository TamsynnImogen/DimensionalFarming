package com.tipclaydon.DimensionalFarming.blocks;

import com.tipclaydon.DimensionalFarming.DimensionalFarming;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.common.extensions.IForgeBlock;
import com.tipclaydon.DimensionalFarming.blocks.StrippableUtil;

@Mod.EventBusSubscriber(modid = DimensionalFarming.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DimensionalFarming.MODID);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DimensionalFarming.MODID);

    // Bloodbark Wood Set
    public static final RegistryObject<Block> BLOODBARK_PLANKS = registerBlock("bloodbark_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> BLOODBARK_SLAB = registerBlock("bloodbark_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));

    public static final RegistryObject<Block> BLOODBARK_HYPHAE = registerBlock("bloodbark_hyphae",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_HYPHAE)));

    public static final RegistryObject<Block> STRIPPED_BLOODBARK_HYPHAE = registerBlock("stripped_bloodbark_hyphae",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_HYPHAE)));

    public static final RegistryObject<Block> BLOODBARK_STEM = registerBlock("bloodbark_stem",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM)));

    public static final RegistryObject<Block> STRIPPED_BLOODBARK_STEM = registerBlock("stripped_bloodbark_stem",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_STEM)));

    public static final RegistryObject<Block> BLOODBARK_STAIRS = registerBlock("bloodbark_stairs",
            () -> new StairBlock(() -> BLOODBARK_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));

    public static final RegistryObject<Block> BLOODBARK_FENCE = registerBlock("bloodbark_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> BLOODBARK_FENCE_GATE = registerBlock("bloodbark_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BLOODBARK_DOOR = registerBlock("bloodbark_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));

    public static final RegistryObject<Block> BLOODBARK_TRAPDOOR = registerBlock("bloodbark_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final RegistryObject<Block> BLOODBARK_PRESSURE_PLATE = registerBlock("bloodbark_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));

    public static final RegistryObject<Block> BLOODBARK_BUTTON = registerBlock("bloodbark_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));

    // Unified block registration helper (with auto BlockItem)
    private static RegistryObject<Block> registerBlock(String name, java.util.function.Supplier<Block> blockSupplier) {
        RegistryObject<Block> block = BLOCKS.register(name, blockSupplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Properties()));
        return block;
    }

    // Call during common setup enqueueWork to ensure strippables are modifiable
    public static void setupStrippables() {
        StrippableUtil.registerStrippable(BLOODBARK_STEM.get(), STRIPPED_BLOODBARK_STEM.get());
        StrippableUtil.registerStrippable(BLOODBARK_HYPHAE.get(), STRIPPED_BLOODBARK_HYPHAE.get());
    }

    // Register all block/item entries during mod construction
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
