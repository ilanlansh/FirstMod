package com.ilanlansh.firstmod.util;

import com.ilanlansh.firstmod.FirstMod;
import com.ilanlansh.firstmod.blocks.AlonBlockBlock;
import com.ilanlansh.firstmod.blocks.BlockItemBase;
import com.ilanlansh.firstmod.blocks.RubyBlockBlock;
import com.ilanlansh.firstmod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
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
    public static final RegistryObject<Item> KAKI = ITEMS.register("kaki", ItemBase::new);
    public static final RegistryObject<Item> SHOVAL = ITEMS.register("shoval", ItemBase::new);
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> LIOR = ITEMS.register("lior", ItemBase::new);
    public static final RegistryObject<Item> VLADI = ITEMS.register("vladi", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> RUBY_BLOCK_BLOCK = BLOCKS.register("ruby_block", RubyBlockBlock::new);
    public static final RegistryObject<Block> ALON_BLOCK_BLOCK = BLOCKS.register("alon_block", AlonBlockBlock::new);

    // Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK_BLOCK.get()));
    public static final RegistryObject<Item> ALON_BLOCK_ITEM = ITEMS.register("alon_block", () -> new BlockItemBase(ALON_BLOCK_BLOCK.get()));
}
