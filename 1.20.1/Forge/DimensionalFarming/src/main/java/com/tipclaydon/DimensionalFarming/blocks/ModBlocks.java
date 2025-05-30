package com.tipclaydon.DimensionalFarming.blocks;

import com.tipclaydon.DimensionalFarming.util.ModWoodTypes;
import com.tipclaydon.DimensionalFarming.DimensionalFarming;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DimensionalFarming.MODID);

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DimensionalFarming.MODID);

    public static final RegistryObject<Block> BLOODBARK_LOG = registerBlock("bloodbark_log",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
            
    public static final RegistryObject<Block> BLOODBARK_FENCE_GATE = registerBlock("bloodbark_fence_gate",
                () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodTypes.BLOODBARK_WOOD_TYPE));

    public static final RegistryObject<Block> BLOODBARK_BUTTON = registerBlock("bloodbark_button",
                () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), ModWoodTypes.BLOODBARK_SET_TYPE, 30, true));

    public static final RegistryObject<Block> BLOODBARK_PRESSURE_PLATE = registerBlock("bloodbark_pressure_plate",
                () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), ModWoodTypes.BLOODBARK_SET_TYPE));

    public static final RegistryObject<Block> BLOODBARK_DOOR = registerBlock("bloodbark_door",
                () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), ModWoodTypes.BLOODBARK_SET_TYPE));

    public static final RegistryObject<Block> BLOODBARK_TRAPDOOR = registerBlock("bloodbark_trapdoor",
                () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), ModWoodTypes.BLOODBARK_SET_TYPE));

    public static final RegistryObject<Block> BLOODBARK_SIGN = BLOCKS.register("bloodbark_sign",
                () -> new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.BLOODBARK_WOOD_TYPE));

    public static final RegistryObject<Block> BLOODBARK_HANGING_SIGN = BLOCKS.register("bloodbark_hanging_sign",
                () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BLOODBARK_WOOD_TYPE));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, java.util.function.Supplier<T> blockSupplier) {
        RegistryObject<T> block = BLOCKS.register(name, blockSupplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
