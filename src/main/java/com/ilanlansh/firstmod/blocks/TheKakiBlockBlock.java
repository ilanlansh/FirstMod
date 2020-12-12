package com.ilanlansh.firstmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TheKakiBlockBlock extends Block
{
    public TheKakiBlockBlock()
    {
        super(Block.Properties.create(Material.WOOD)
                .harvestTool(ToolType.AXE)
                .harvestLevel(0)
                .sound(SoundType.WOOD)
                .hardnessAndResistance(2.5f,2.5f)
                .setRequiresTool()
        );
    }
}
