package com.tipclaydon.DimensionalFarming.blocks;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.level.block.Block;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class StrippableUtil {
    @SuppressWarnings("unchecked")
    public static void registerStrippable(Block from, Block to) {
        try {
            Field field = AxeItem.class.getDeclaredField("STRIPPABLES");
            field.setAccessible(true);

            Map<Block, Block> map = (Map<Block, Block>) field.get(null);
            Map<Block, Block> newMap = new HashMap<>(map);
            newMap.put(from, to);
            field.set(null, newMap);
        } catch (Exception e) {
            throw new RuntimeException("Failed to register strippable block: " + from, e);
        }
    }
}
