package net.mythical.testspace.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mythical.testspace.TestSpaceMod;


public class ModItems {

    public static final Item MYTHITE_INGOT = registerItem("mythite_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item MYTHITE_NUGGET = registerItem("mythite_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TestSpaceMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + TestSpaceMod.MOD_ID);
    }

}
