package net.hertz.maegic.block;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.hertz.maegic.Maegic;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EntityBlock {
    public static BlockEntityType<AssemblyTableBlockEntity> ASSEMBLY_TABLE;
    public static BlockEntityType<SurgeryBlockEntity> SURGERY_BLOCK;

    public static void registerAllBlockEntities() {
        ASSEMBLY_TABLE = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Maegic.MOD_ID, "assembly_table"),
                FabricBlockEntityTypeBuilder.create(AssemblyTableBlockEntity::new,
                        MaegicBlocks.ASSEMBLY_TABLE).build(null));

        SURGERY_BLOCK = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Maegic.MOD_ID, "surgery_block"),
                FabricBlockEntityTypeBuilder.create(SurgeryBlockEntity::new,
                        MaegicBlocks.SURGERY_BLOCK).build(null));
    }
}
