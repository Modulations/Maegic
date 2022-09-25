package net.hertz.maegic.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.hertz.maegic.Maegic;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class SurgeryBlockScreen extends HandledScreen<SurgeryBlockScreenHandler> {
    private static final Identifier TEXTURE = new Identifier(Maegic.MOD_ID, "textures/gui/surgerygui.png");

    public SurgeryBlockScreen(SurgeryBlockScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth);
        int y = (height - backgroundHeight);
        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);
    }
}
