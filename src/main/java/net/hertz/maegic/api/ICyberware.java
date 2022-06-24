package net.hertz.maegic.api;

import net.minecraft.item.ItemStack;

import java.util.List;

public interface ICyberware {
    EnumRegion getRegion(ItemStack stack);
    int installedStackSize(ItemStack stack);
    boolean isIncompatible(ItemStack stack, ItemStack comparison);
    boolean isEssential(ItemStack stack);
    List<String> getInfo(ItemStack stack);
    int getCapacity(ItemStack wareStack);

    public enum EnumRegion
    {
        EYES(12, "eyes"),
        CRANIUM(11, "cranium"),
        HEART(14, "heart"),
        LUNGS(15, "lungs"),
        LOWER_ORGANS(17, "lower_organs"),
        SKIN(18, "skin"),
        MUSCLE(19, "muscle"),
        BONE(20, "bone"),
        ARM(21, "arm", true, true),
        HAND(22, "hand", true, false),
        LEG(23, "leg", true, true),
        FOOT(24, "foot", true, false);

        private final int slotNumber;
        private final String name;
        private final boolean sidedSlot;
        private final boolean hasEssential;

        private EnumRegion(int slot, String name, boolean sidedSlot, boolean hasEssential)
        {
            this.slotNumber = slot;
            this.name = name;
            this.sidedSlot = sidedSlot;
            this.hasEssential = hasEssential;
        }

        private EnumRegion(int slot, String name)
        {
            this(slot, name, false, true);
        }

        public int getSlotNumber()
        {
            return slotNumber;
        }

        public static EnumRegion getSlotByPage(int page)
        {
            for (EnumRegion slot : values())
            {
                if (slot.getSlotNumber() == page)
                {
                    return slot;
                }
            }
            return null;
        }

        public String getName()
        {
            return name;
        }

        public boolean isSided()
        {
            return sidedSlot;
        }

        public boolean hasEssential()
        {
            return hasEssential;
        }
    }

    //public void onAdded(EntityLivingBase entityLivingBase, ItemStack stack);
    //public void onRemoved(EntityLivingBase entityLivingBase, ItemStack stack);

    public interface ISidedLimb
    {
        public EnumSide getSide(ItemStack stack);

        public enum EnumSide
        {
            LEFT,
            RIGHT;
        }
    }

    public int getEssenceCost(ItemStack stack);
}
