package net.hertz.maegic.block;

import net.hertz.maegic.item.MaterialItem;
import net.hertz.maegic.item.inventory.ImplementedInventory;
import net.hertz.maegic.screen.AssemblyTableScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.LiteralTextContent;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class AssemblyTableBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(4, ItemStack.EMPTY);
    public AssemblyTableBlockEntity(BlockPos pos, BlockState state) {
        super(EntityBlock.ASSEMBLY_TABLE, pos, state);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("container.assembly");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new AssemblyTableScreenHandler(syncId, inv, this);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
    }

    public static void tick(World world, BlockPos pos, BlockState state, AssemblyTableBlockEntity entity) {
        if(hasRecipe(entity) && hasNotReachedStackLimit(entity)) {
            craftItem(entity);
        }
    }

    private static void craftItem(AssemblyTableBlockEntity entity) {
        entity.removeStack(0, 1);
        entity.removeStack(1, 1);
        entity.removeStack(2, 1);

        entity.setStack(3, new ItemStack(MaterialItem.SOUL_DUST,
                entity.getStack(3).getCount() + 1));
    }

    private static boolean hasRecipe(AssemblyTableBlockEntity entity) {
        boolean hasItemInFirstSlot = entity.getStack(0).getItem() == MaterialItem.SOUL_DUST;
        boolean hasItemInSecondSlot = entity.getStack(1).getItem() == Items.BOOK;
        boolean hasItemInThirdSlot = entity.getStack(2).getItem() == Items.NETHERITE_INGOT;

        return hasItemInFirstSlot && hasItemInSecondSlot && hasItemInThirdSlot;
    }

    private static boolean hasNotReachedStackLimit(AssemblyTableBlockEntity entity) {
        return entity.getStack(3).getCount() < entity.getStack(3).getMaxCount();
    }
}
