package net.mythical.testspace.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.mythical.testspace.TestSpaceMod;
import net.mythical.testspace.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        System.out.println("Registering Fuels for + " + TestSpaceMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        //400 / 20 = 20 Seconds
        registry.add(ModItems.COAL_SLIVER, 400);
        registry.add(Items.BLAZE_ROD, 1200);
        registry.add(Items.BLAZE_POWDER, 800);
    }
}
