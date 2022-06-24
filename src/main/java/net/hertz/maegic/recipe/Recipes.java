package net.hertz.maegic.recipe;

import net.hertz.maegic.Maegic;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Recipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Maegic.MOD_ID, AssemblyTableRecipe.Serializer.ID),
                AssemblyTableRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Maegic.MOD_ID, AssemblyTableRecipe.Type.ID),
                AssemblyTableRecipe.Type.INSTANCE);
    }
}
