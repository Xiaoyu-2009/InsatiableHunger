package dev.xiaoyu.insatiable_hunger.client.renderer.entity.boss;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.xiaoyu.insatiable_hunger.InsatiableHunger;
import dev.xiaoyu.insatiable_hunger.client.model.entity.boss.gluttony.FiveModel;
import dev.xiaoyu.insatiable_hunger.client.model.entity.boss.gluttony.OneModel;
import dev.xiaoyu.insatiable_hunger.client.model.entity.boss.gluttony.ThreeModel;
import dev.xiaoyu.insatiable_hunger.common.entity.boss.Gluttony;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class GluttonyRenderer extends MobRenderer<Gluttony, EntityModel<Gluttony>> {
    private static final ResourceLocation ONE_TEXTURE = new ResourceLocation(InsatiableHunger.MOD_ID, "textures/entity/gluttony/one.png");
    private static final ResourceLocation THREE_TEXTURE = new ResourceLocation(InsatiableHunger.MOD_ID, "textures/entity/gluttony/three.png");
    private static final ResourceLocation FIVE_TEXTURE = new ResourceLocation(InsatiableHunger.MOD_ID, "textures/entity/gluttony/five.png");

    private final EntityModel<Gluttony> oneModel;
    private final EntityModel<Gluttony> threeModel;
    private final EntityModel<Gluttony> fiveModel;

    public GluttonyRenderer(EntityRendererProvider.Context context) {
        super(context, new OneModel<>(context.bakeLayer(OneModel.LAYER_LOCATION)), 0.5F);
        this.oneModel = new OneModel<>(context.bakeLayer(OneModel.LAYER_LOCATION));
        this.threeModel = new ThreeModel<>(context.bakeLayer(ThreeModel.LAYER_LOCATION));
        this.fiveModel = new FiveModel<>(context.bakeLayer(FiveModel.LAYER_LOCATION));
    }

    @Override
    public void render(@NotNull Gluttony entity, float entityYaw, float partialTicks, @NotNull PoseStack poseStack, @NotNull MultiBufferSource buffer, int packedLight) {
        this.model = switch (entity.getGrowthStage()) {
            case 3 -> this.threeModel;
            case 5 -> this.fiveModel;
            default -> this.oneModel;
        };
        this.shadowRadius = switch (entity.getGrowthStage()) {
            case 3 -> 1.0F;
            case 5 -> 2.0F;
            default -> 0.5F;
        };
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull Gluttony entity) {
        return switch (entity.getGrowthStage()) {
            case 3 -> THREE_TEXTURE;
            case 5 -> FIVE_TEXTURE;
            default -> ONE_TEXTURE;
        };
    }
}