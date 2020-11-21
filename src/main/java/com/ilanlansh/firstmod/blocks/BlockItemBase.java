package com.ilanlansh.firstmod.blocks;

import com.ilanlansh.firstmod.FirstMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem
{
    public BlockItemBase(Block block)
    {
        super(block, new Item.Properties().group(FirstMod.TAB));
    }
}
