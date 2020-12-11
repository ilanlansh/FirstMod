package com.ilanlansh.firstmod.util;

import com.ilanlansh.firstmod.FirstMod;
import com.ilanlansh.firstmod.armor.FirstmodArmorMaterial;
import com.ilanlansh.firstmod.blocks.*;
import com.ilanlansh.firstmod.items.ItemBase;
import com.ilanlansh.firstmod.items.Persimmon;
import com.ilanlansh.firstmod.tools.FirstmodItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FirstMod.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> ILAN = ITEMS.register("ilan", ItemBase::new);
    public static final RegistryObject<Item> GILBAR = ITEMS.register("gilbar", ItemBase::new);
    public static final RegistryObject<Item> SHOVAL = ITEMS.register("shoval", ItemBase::new);
    public static final RegistryObject<Item> KAKI = ITEMS.register("kaki", ItemBase::new);
    public static final RegistryObject<Item> LIOR = ITEMS.register("lior", ItemBase::new);
    public static final RegistryObject<Item> VLADI = ITEMS.register("vladi", ItemBase::new);
    public static final RegistryObject<Persimmon> PERSIMMON = ITEMS.register("persimmon", Persimmon::new);
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> RUBY_NUGGET = ITEMS.register("ruby_nugget", ItemBase::new);

    // Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(FirstmodItemTier.RUBY, 2, -2.4f, new Item.Properties().group(FirstMod.TAB))
    );
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(FirstmodItemTier.RUBY, 0, -2.8f, new Item.Properties().group(FirstMod.TAB))
    );
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new AxeItem(FirstmodItemTier.RUBY, 5, -3.0f, new Item.Properties().group(FirstMod.TAB))
    );
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new ShovelItem(FirstmodItemTier.RUBY, 1, -3.0f, new Item.Properties().group(FirstMod.TAB))
    );
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () ->
            new HoeItem(FirstmodItemTier.RUBY, -3, 0, new Item.Properties().group(FirstMod.TAB))
    );

    // Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () ->
            new ArmorItem(FirstmodArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(FirstMod.TAB))
    );
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () ->
            new ArmorItem(FirstmodArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(FirstMod.TAB))
    );
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () ->
            new ArmorItem(FirstmodArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(FirstMod.TAB))
    );
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () ->
            new ArmorItem(FirstmodArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(FirstMod.TAB))
    );

    // Blocks
    public static final RegistryObject<Block> RUBY_BLOCK_BLOCK = BLOCKS.register("ruby_block", RubyBlockBlock::new);
    public static final RegistryObject<Block> ALON_BLOCK_BLOCK = BLOCKS.register("alon_block", AlonBlockBlock::new);
    public static final RegistryObject<Block> RUBY_ORE_BLOCK = BLOCKS.register("ruby_ore", RubyOreBlock::new);
    public static final RegistryObject<Block> THE_KAKI_BLOCK_BLOCK = BLOCKS.register("the_kaki_block", TheKakiBlockBlock::new);
    public static final RegistryObject<Block> DAVID_BLOCK_BLOCK = BLOCKS.register("david_block", DavidBlockBlock::new);

    // Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK_BLOCK.get()));
    public static final RegistryObject<Item> ALON_BLOCK_ITEM = ITEMS.register("alon_block", () -> new BlockItemBase(ALON_BLOCK_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE_BLOCK.get()));
    public static final RegistryObject<Item> THE_KAKI_BLOCK_ITEM = ITEMS.register("the_kaki_block", () -> new BlockItemBase(THE_KAKI_BLOCK_BLOCK.get()));
    public static final RegistryObject<Item> DAVID_BLOCK_ITEM = ITEMS.register("david_block", () -> new BlockItemBase(DAVID_BLOCK_BLOCK.get()));
}
