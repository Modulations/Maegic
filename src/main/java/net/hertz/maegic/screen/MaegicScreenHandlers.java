package net.hertz.maegic.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.hertz.maegic.Maegic;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class MaegicScreenHandlers {
    public static ScreenHandlerType<AssemblyTableScreenHandler> ASSEMBLY_TABLE_SCREEN_HANDLER;
    public static ScreenHandlerType<SurgeryBlockScreenHandler> SURGERY_BLOCK_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        ASSEMBLY_TABLE_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Maegic.MOD_ID, "assembly_table"),
                AssemblyTableScreenHandler::new);
        SURGERY_BLOCK_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Maegic.MOD_ID, "surgery_block"),
                SurgeryBlockScreenHandler::new);
    }
}
