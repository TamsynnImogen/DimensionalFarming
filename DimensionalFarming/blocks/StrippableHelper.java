package com.tipclaydon.DimensionalFarming.blocks;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.level.block.Block;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class StrippableHelper {
    private static Map<Block, Block> strippables = null;

    @SuppressWarnings("unchecked")
    public static void registerStrippable(Block input, Block result) {
        try {
            if (strippables == null) {
                Field field = AxeItem.class.getDeclaredField("STRIPPABLES");
                field.setAccessible(true);
                Map<Block, Block> original = (Map<Block, Block>) field.get(null);
                Map<Block, Block> modifiable = new HashMap<>(original);
                field.set(null, modifiable);
                strippables = modifiable;
            }

            strippables.put(input, result);
        } catch (Exception e) {
            throw new RuntimeException("Failed to register strippable block", e);
        }
    }
}

