package net.hertz.maegic.entity;

import net.hertz.maegic.api.ICyberware;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CyberwareUserData implements ICyberwareUserData {
    @Override
    public List<ItemStack> getInstalledCyberware(ICyberware.EnumRegion slot) {
        return null;
    }

    @Override
    public void setInstalledCyberware(LivingEntity livingEntity, ICyberware.EnumRegion slot, List<ItemStack> cyberware) {

    }

    @Override
    public boolean isCyberwareInstalled(ItemStack cyberware) {
        return false;
    }

    @Override
    public int getCyberwareRank(ItemStack cyberware) {
        return 0;
    }

    @Override
    public NbtCompound serializeNBT() {
        return null;
    }

    @Override
    public void deserializeNBT(NbtCompound nbtTag) {

    }

    @Override
    public boolean hasEssential(ICyberware.EnumRegion slot) {
        return false;
    }

    @Override
    public void setHasEssential(ICyberware.EnumRegion slot, boolean hasLeft, boolean hasRight) {

    }

    @Override
    public ItemStack getCyberware(ItemStack cyberware) {
        return null;
    }

    @Override
    public void updateCapacity() {

    }

    @Override
    public void resetBuffer() {

    }

    @Override
    public void addPower(int amount, ItemStack inputter) {

    }

    @Override
    public boolean isAtCapacity(ItemStack stack) {
        return false;
    }

    @Override
    public boolean isAtCapacity(ItemStack stack, int buffer) {
        return false;
    }

    @Override
    public float getPercentFull() {
        return 0;
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public int getStoredPower() {
        return 0;
    }

    @Override
    public int getProduction() {
        return 0;
    }

    @Override
    public int getConsumption() {
        return 0;
    }

    @Override
    public boolean usePower(ItemStack stack, int amount) {
        return false;
    }

    @Override
    public List<ItemStack> getPowerOutages() {
        return null;
    }

    @Override
    public List<Integer> getPowerOutageTimes() {
        return null;
    }

    @Override
    public void setImmune() {

    }

    @Override
    public boolean usePower(ItemStack stack, int amount, boolean isPassive) {
        return false;
    }

    @Override
    public boolean hasEssential(ICyberware.EnumRegion slot, ICyberware.ISidedLimb.EnumSide side) {
        return false;
    }

    @Override
    public void resetWare(LivingEntity livingEntity) {

    }

    @Override
    public int getNumActiveItems() {
        return 0;
    }

    @Override
    public List<ItemStack> getActiveItems() {
        return null;
    }

    @Override
    public void removeHotkey(int i) {

    }

    @Override
    public void addHotkey(int i, ItemStack stack) {

    }

    @Override
    public ItemStack getHotkey(int i) {
        return null;
    }

    @Override
    public Iterable<Integer> getHotkeys() {
        return null;
    }

    @Override
    public List<ItemStack> getHudjackItems() {
        return null;
    }

    @Override
    public void setHudData(NbtCompound nbtTag) {

    }

    @Override
    public NbtCompound getHudData() {
        return null;
    }

    @Override
    public boolean hasOpenedRadialMenu() {
        return false;
    }

    @Override
    public void setOpenedRadialMenu(boolean hasOpenedRadialMenu) {

    }

    @Override
    public void setHudColor(int color) {

    }

    @Override
    public void setHudColor(float[] color) {

    }

    @Override
    public int getHudColorHex() {
        return 0;
    }

    @Override
    public float[] getHudColor() {
        return new float[0];
    }

    @Override
    public int getMaxTolerance(@NotNull LivingEntity livingEntity) {
        return 0;
    }

    @Override
    public void setTolerance(@NotNull LivingEntity livingEntity, int amount) {

    }

    @Override
    public int getTolerance(@NotNull LivingEntity livingEntity) {
        return 0;
    }

    @Override
    public int getEssence() {
        return 0;
    }

    @Override
    public void setEssence(int essence) {

    }

    @Override
    public int getMaxEssence() {
        return 0;
    }
}
