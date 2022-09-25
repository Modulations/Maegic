package net.hertz.maegic;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.hertz.maegic.screen.AssemblyTableScreen;
import net.hertz.maegic.screen.MaegicScreenHandlers;
import net.hertz.maegic.screen.SurgeryBlockScreen;

public class MaegicClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(MaegicScreenHandlers.ASSEMBLY_TABLE_SCREEN_HANDLER, AssemblyTableScreen::new);
        ScreenRegistry.register(MaegicScreenHandlers.SURGERY_BLOCK_SCREEN_HANDLER, SurgeryBlockScreen::new);
    }
}
