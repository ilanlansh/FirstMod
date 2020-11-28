package com.ilanlansh.firstmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class DavidBlockBlock extends Block
{
    public DavidBlockBlock()
    {
        super(Block.Properties.create(Material.IRON)
                .setLightLevel(value -> 5)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(3)
                .sound(SoundType.METAL)
                .hardnessAndResistance(60.0f, 2000.0f)
        );
    }
}
