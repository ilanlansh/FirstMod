package com.ilanlansh.firstmod;

import com.ilanlansh.firstmod.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * Simple Minecraft 1.16.4 Forge mod made by ilanlansh.
 * Made using TechnoVision's Forge modding tutorial on YouTube.
 * This mod adds simple items and blocks and was made just for fun with no goal.
 * I plan to use this mod as a practice or as a framework for future mods I will be working on.
 *
 */

@Mod("firstmod")
public class FirstMod {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "firstmod";

    public FirstMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    public static final ItemGroup TAB = new ItemGroup("firstmodItems") {
        @Override
        public ItemStack createIcon() {
            final ItemStack ICON = new ItemStack(RegistryHandler.ILAN.get());
            return ICON;
        }
    };
}