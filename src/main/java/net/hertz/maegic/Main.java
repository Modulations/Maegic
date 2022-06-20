package net.hertz.maegic;

import net.fabricmc.api.ModInitializer;
import net.hertz.maegic.block.Blocks;
import net.hertz.maegic.item.MaterialItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MOD_ID = "maegic";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MaterialItem.registerItems();
		Blocks.registerBlocks();
	}
}
