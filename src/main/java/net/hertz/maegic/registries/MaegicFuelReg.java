package net.hertz.maegic.registries;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.hertz.maegic.Maegic;
import net.hertz.maegic.item.MaegicItem;

public class MaegicFuelReg {
    public static void registerFuels() {
        Maegic.LOGGER.info("Now registering Fuels for " + Maegic.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(MaegicItem.SOUL_DUST, 300); // x / 20
    }
}
