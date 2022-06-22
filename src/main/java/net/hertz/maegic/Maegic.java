package net.hertz.maegic;

import net.fabricmc.api.ModInitializer;
import net.hertz.maegic.block.Blocks;
import net.hertz.maegic.block.EntityBlock;
import net.hertz.maegic.item.MaterialItem;
import net.hertz.maegic.screen.MaegicScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Maegic implements ModInitializer {
	public static final String MOD_ID = "maegic";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MaterialItem.registerItems();
		Blocks.registerBlocks();

		EntityBlock.registerAllBlockEntities();
		MaegicScreenHandlers.registerAllScreenHandlers();
	}
}
