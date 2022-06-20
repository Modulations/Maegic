package net.hertz.maegic.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.hertz.maegic.Main;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MaterialItem {
    public static final Item SOUL_DUST = registerItem("soul_dust", new Item(new FabricItemSettings().group(MaegicItemGroup.MAEGIC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name), item);
    }
    public static void registerItems() {
        Main.LOGGER.info("Registering Items for " + Main.MOD_ID);
    }
}
