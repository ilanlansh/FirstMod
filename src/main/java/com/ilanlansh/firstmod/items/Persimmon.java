package com.ilanlansh.firstmod.items;

import com.ilanlansh.firstmod.FirstMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Persimmon extends Item
{
    public Persimmon() {
        super(new Item.Properties()
                .group(FirstMod.TAB)
                .food(new Food.Builder()
                        .saturation(1.4f)
                        .hunger(3)
                        .build()
                )
        );
    }
}
