package com.ilanlansh.firstmod.tools;

import com.ilanlansh.firstmod.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum FirstmodItemTier implements IItemTier
{
    RUBY(2, 768, 7.0f, 3.0f, 15, () ->
    {
        return Ingredient.fromItems(RegistryHandler.RUBY_SWORD.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    FirstmodItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
    {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses()
    {
        return this.maxUses;
    }

    @Override
    public float getEfficiency()
    {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage()
    {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel()
    {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability()
    {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return this.repairMaterial.get();
    }
}
