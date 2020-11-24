package com.ilanlansh.firstmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class AlonBlockBlock extends Block
{
    public AlonBlockBlock()
    {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(50.0f,1200.0f)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
