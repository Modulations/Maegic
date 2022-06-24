package net.hertz.maegic.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.hertz.maegic.Maegic;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MaegicItem {
    public static final Item SOUL_DUST = registerItem("soul_dust", new Item(new FabricItemSettings().group(MaegicItemGroup.MAEGIC)));
    public static final Item BLUEPRINT = registerItem("blueprint", new Item(new FabricItemSettings().group(MaegicItemGroup.MAEGIC)));
    //public static final Item CYBEREYES = registerItem("cybereyes", new Item(new FabricItemSettings().group(MaegicItemGroup.MAEGIC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Maegic.MOD_ID, name), item);
    }
    public static void registerItems() {
        Maegic.LOGGER.info("Registering Items for " + Maegic.MOD_ID);
    }
}
