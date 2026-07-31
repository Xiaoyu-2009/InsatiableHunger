package dev.xiaoyu.insatiable_hunger.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.xiaoyu.insatiable_hunger.InsatiableHunger;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.BossEvent;
import net.minecraftforge.client.event.CustomizeGuiOverlayEvent;

@SuppressWarnings("removal")
public class CustomBossBar {
    public static final CustomBossBar GLUTTONY_BAR = new CustomBossBar(
            new ResourceLocation(InsatiableHunger.MOD_ID, "textures/gui/boss_bar/gltbar_base.png"),
            new ResourceLocation(InsatiableHunger.MOD_ID, "textures/gui/boss_bar/gltbar_overlay.png"),
            5, 16, 0, 6, -4, -15, 256, 32, 25, 182, ChatFormatting.DARK_AQUA
    );

    private final ResourceLocation baseTexture;
    private final ResourceLocation overlayTexture;
    private final boolean hasOverlay;
    private final int baseHeight;
    private final int baseTextureHeight;
    private final int baseOffsetX;
    private final int baseOffsetY;
    private final int overlayOffsetX;
    private final int overlayOffsetY;
    private final int overlayWidth;
    private final int overlayHeight;
    private final int verticalIncrement;
    private final int getProgress;
    private final ChatFormatting textColor;

    public CustomBossBar(ResourceLocation baseTexture, ResourceLocation overlayTexture, int baseHeight, int baseTextureHeight, int baseOffsetX, int baseOffsetY, int overlayOffsetX, int overlayOffsetY, int overlayWidth, int overlayHeight, int verticalIncrement, int getProgress, ChatFormatting textColor) {
        this.baseTexture = baseTexture;
        this.overlayTexture = overlayTexture;
        this.hasOverlay = overlayTexture != null;
        this.baseHeight = baseHeight;
        this.baseTextureHeight = baseTextureHeight;
        this.baseOffsetX = baseOffsetX;
        this.baseOffsetY = baseOffsetY;
        this.overlayOffsetX = overlayOffsetX;
        this.overlayOffsetY = overlayOffsetY;
        this.overlayWidth = overlayWidth;
        this.overlayHeight = overlayHeight;
        this.verticalIncrement = verticalIncrement;
        this.getProgress = getProgress;
        this.textColor = textColor;
    }

    public void renderBossBar(CustomizeGuiOverlayEvent.BossEventProgress event) {
        GuiGraphics guiGraphics = event.getGuiGraphics();
        int y = event.getY();
        int i = Minecraft.getInstance().getWindow().getGuiScaledWidth();
        int j = y - -16;

        Minecraft.getInstance().getProfiler().push("IHBossBarBase");
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, getBaseTexture());
        drawBar(guiGraphics, event.getX() + getBaseOffsetX(), y + getBaseOffsetY(), event.getBossEvent());
        Component component = event.getBossEvent().getName().copy().withStyle(getTextColor());
        Minecraft.getInstance().getProfiler().pop();

        int l = Minecraft.getInstance().font.width(component);
        int i1 = i / 2 - l / 2;
        /*guiGraphics.drawString(Minecraft.getInstance().font, component, i1, j, 16777215);*/

        if (hasOverlay()) {
            Minecraft.getInstance().getProfiler().push("IHBossBarOverlay");
            RenderSystem.setShaderTexture(0, getOverlayTexture());
            event.getGuiGraphics().blit(getOverlayTexture(), event.getX() + getBaseOffsetX() + getOverlayOffsetX(), y + getOverlayOffsetY() + getBaseOffsetY(), 0, 0, getOverlayWidth(), getOverlayHeight(), getOverlayWidth(), getOverlayHeight());
            Minecraft.getInstance().getProfiler().pop();
        }

        event.setIncrement(getVerticalIncrement());
    }

    private void drawBar(GuiGraphics guiGraphics, int x, int y, BossEvent event) {
        guiGraphics.blit(getBaseTexture(), x, y, 0, 0, getProgress(), getBaseHeight(), 256, getBaseTextureHeight());
        int i = (int) (event.getProgress() * (getProgress() + 1));
        if (i > 0) {
            guiGraphics.blit(getBaseTexture(), x, y, 0, getBaseHeight(), i, getBaseHeight(), 256, getBaseTextureHeight());
        }
    }

    public ResourceLocation getBaseTexture() {
        return baseTexture;
    }

    public ResourceLocation getOverlayTexture() {
        return overlayTexture;
    }

    public boolean hasOverlay() {
        return hasOverlay;
    }

    public int getBaseHeight() {
        return baseHeight;
    }

    public int getBaseTextureHeight() {
        return baseTextureHeight;
    }

    public int getBaseOffsetX() {
        return baseOffsetX;
    }

    public int getBaseOffsetY() {
        return baseOffsetY;
    }

    public int getOverlayOffsetX() {
        return overlayOffsetX;
    }

    public int getOverlayOffsetY() {
        return overlayOffsetY;
    }

    public int getOverlayWidth() {
        return overlayWidth;
    }

    public int getOverlayHeight() {
        return overlayHeight;
    }

    public int getProgress() {
        return getProgress;
    }

    public int getVerticalIncrement() {
        return verticalIncrement;
    }

    public ChatFormatting getTextColor() {
        return textColor;
    }
}