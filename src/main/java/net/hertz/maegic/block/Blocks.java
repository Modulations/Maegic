package net.hertz.maegic.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hertz.maegic.Maegic;
import net.hertz.maegic.item.MaegicItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {

    public static final Block SOUL_SHIT = registerBlock("soul_shit",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT)), MaegicItemGroup.MAEGIC);
    public static final Block ASSEMBLY_TABLE = registerBlock("assembly_table",
            new Block(FabricBlockSettings.of(Material.METAL)), MaegicItemGroup.MAEGIC);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Maegic.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Maegic.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerBlocks() {
        Maegic.LOGGER.info("Registering Blocks for " + Maegic.MOD_ID);
    }
}
