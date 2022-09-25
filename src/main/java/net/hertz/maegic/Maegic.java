package net.hertz.maegic;

import net.fabricmc.api.ModInitializer;
import net.hertz.maegic.block.MaegicBlocks;
import net.hertz.maegic.block.EntityBlock;
import net.hertz.maegic.item.MaegicItem;
import net.hertz.maegic.recipe.Recipes;
import net.hertz.maegic.registries.MaegicFuelReg;
import net.hertz.maegic.screen.MaegicScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Maegic implements ModInitializer {
	public static final String MOD_ID = "maegic";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MaegicItem.registerItems();
		MaegicBlocks.registerBlocks();

		EntityBlock.registerAllBlockEntities();
		MaegicScreenHandlers.registerAllScreenHandlers();

		MaegicFuelReg.registerFuels();
		Recipes.registerRecipes();
	}
}
