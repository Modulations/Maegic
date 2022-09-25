package net.hertz.maegic.util;

import net.minecraft.nbt.NbtCompound;

public class ToleranceData {
    public static int addTolerance(IEntityDataSaver player, int amount) {
        NbtCompound nbt = player.getPersistentData();
        int tolerance = nbt.getInt("tolerance");
        if (tolerance + amount >= 100) {
            tolerance = 100;
        } else {
            tolerance += amount;
        }
        nbt.putInt("tolerance", tolerance);
        // sync data
        return tolerance;
    }

    public static int removeTolerance(IEntityDataSaver player, int amount) {
        NbtCompound nbt = player.getPersistentData();
        int tolerance = nbt.getInt("tolerance");
        if (tolerance - amount <= 0) {
            tolerance = 0;
        } else {
            tolerance -= amount;
        }
        nbt.putInt("tolerance", tolerance);
        // sync data
        return tolerance;
    }
}
