package net.hertz.maegic.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.hertz.maegic.Maegic;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class MaegicItemGroup {
    public static final ItemGroup MAEGIC = FabricItemGroupBuilder.build(new Identifier(Maegic.MOD_ID, "maegic"),
            () -> new ItemStack(MaegicItem.SOUL_DUST));
}
