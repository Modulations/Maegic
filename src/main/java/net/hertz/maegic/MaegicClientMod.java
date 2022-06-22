package net.hertz.maegic;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.hertz.maegic.block.Blocks;
import net.minecraft.client.render.RenderLayer;

public class MaegicClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //BlockRenderLayerMap.INSTANCE.putBlock(Blocks.ASSEMBLY_TABLE, RenderLayer.getCutout());
    }
}
