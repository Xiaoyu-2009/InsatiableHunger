package dev.xiaoyu.insatiable_hunger.client.renderer.entity.boss;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.xiaoyu.insatiable_hunger.client.model.entity.boss.gluttony.OneModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import dev.xiaoyu.insatiable_hunger.InsatiableHunger;
import dev.xiaoyu.insatiable_hunger.common.entity.boss.Gluttony;
import org.jetbrains.annotations.NotNull;

public class GluttonyRenderer extends MobRenderer<Gluttony, OneModel<Gluttony>> {
    @SuppressWarnings("removal")
    private static final ResourceLocation GLUTTONY_LOCATION = new ResourceLocation(InsatiableHunger.MOD_ID, "textures/entity/gluttony/one.png");

    public GluttonyRenderer(EntityRendererProvider.Context context) {
        super(context, new OneModel<>(context.bakeLayer(OneModel.LAYER_LOCATION)), 0.5F);
    }

    @Override
    public void render(@NotNull Gluttony entity, float entityYaw, float partialTicks, @NotNull PoseStack matrixStack, @NotNull MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull Gluttony entity) {
        return GLUTTONY_LOCATION;
    }
}