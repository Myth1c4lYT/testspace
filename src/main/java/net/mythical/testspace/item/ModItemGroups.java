package net.mythical.testspace.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.mythical.testspace.TestSpaceMod;
import net.mythical.testspace.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup MYTHICALS_TEST_SPACE = FabricItemGroupBuilder.build(new Identifier(TestSpaceMod.MOD_ID, "mythical_test_space"),
            () -> new ItemStack(ModBlocks.MYTHITE_BLOCK));

}
