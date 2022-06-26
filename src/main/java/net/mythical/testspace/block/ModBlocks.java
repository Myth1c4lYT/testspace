package net.mythical.testspace.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mythical.testspace.TestSpaceMod;
import net.mythical.testspace.block.custom.ModStairsBlock;
import net.mythical.testspace.block.custom.SpeedyBlock;
import net.mythical.testspace.item.ModItemGroups;


public class ModBlocks {

    public static final Block MYTHITE_BLOCK = registerBlock("mythite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroups.MYTHICALS_TEST_SPACE);

    public static final Block MYTHITE_ORE = registerBlock("mythite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.MYTHICALS_TEST_SPACE);

    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroups.MYTHICALS_TEST_SPACE);

    public static final Block MYTHITE_STAIRS = registerBlock("mythite_stairs",
            new ModStairsBlock(ModBlocks.MYTHITE_BLOCK.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroups.MYTHICALS_TEST_SPACE);

    public static final Block MYTHITE_SLAB = registerBlock("mythite_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroups.MYTHICALS_TEST_SPACE);

    public static final Block SALB = registerBlock("salb",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(9999).requiresTool()), ModItemGroups.MYTHICALS_TEST_SPACE);

    public static final Block BLOK = registerBlock("blok",
            new Block(FabricBlockSettings.of(Material.STONE).strength(9999).requiresTool()), ModItemGroups.MYTHICALS_TEST_SPACE);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TestSpaceMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TestSpaceMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for " + TestSpaceMod.MOD_ID);
    }

}
