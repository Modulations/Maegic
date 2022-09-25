package net.hertz.maegic.api;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;

import javax.annotation.Nonnull;
import java.util.List;

public interface ICyberwareUserData {
    ImmutableList<ItemStack> getInstalledCyberware(ICyberware.EnumRegion slot);
    void setInstalledCyberware(LivingEntity entityLivingBase, ICyberware.EnumRegion slot, List<ItemStack> cyberware);
    void setInstalledCyberware(LivingEntity entityLivingBase, ICyberware.EnumRegion slot, ImmutableList<ItemStack> cyberware);
    boolean isCyberwareInstalled(ItemStack cyberware);
    int getCyberwareRank(ItemStack cyberware);

    NbtCompound serializeNBT();
    void deserializeNBT(NbtCompound tagCompound);


    boolean hasEssential(ICyberware.EnumRegion slot);
    void setHasEssential(ICyberware.EnumRegion slot, boolean hasLeft, boolean hasRight);
    ItemStack getCyberware(ItemStack cyberware);
    void updateCapacity();
    void resetBuffer();
    void addPower(int amount, ItemStack inputter);
    boolean isAtCapacity(ItemStack stack);
    boolean isAtCapacity(ItemStack stack, int buffer);
    float getPercentFull();
    int getCapacity();
    int getStoredPower();
    int getProduction();
    int getConsumption();
    boolean usePower(ItemStack stack, int amount);
    List<ItemStack> getPowerOutages();
    List<Integer> getPowerOutageTimes();
    void setImmune();
    boolean usePower(ItemStack stack, int amount, boolean isPassive);
    boolean hasEssential(ICyberware.EnumRegion slot, ICyberware.ISidedLimb.EnumSide side);
    void resetWare(LivingEntity entityLivingBase);
    int getNumActiveItems();
    List<ItemStack> getActiveItems();
    void removeHotkey(int i);
    void addHotkey(int i, ItemStack stack);
    ItemStack getHotkey(int i);
    Iterable<Integer> getHotkeys();
    List<ItemStack> getHudjackItems();
    void setHudData(NbtCompound tagCompound);
    NbtCompound getHudData();
    boolean hasOpenedRadialMenu();
    void setOpenedRadialMenu(boolean hasOpenedRadialMenu);
    void setHudColor(int color);
    void setHudColor(float[] color);
    int getHudColorHex();
    float[] getHudColor();
    int getMaxTolerance(@Nonnull LivingEntity entityLivingBase);
    void setTolerance(@Nonnull LivingEntity entityLivingBase, int amount);
    int getTolerance(@Nonnull LivingEntity entityLivingBase);

    @Deprecated
    int getEssence();
    @Deprecated
    void setEssence(int essence);
    @Deprecated
    int getMaxEssence();
}
