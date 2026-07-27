package dev.xiaoyu.insatiable_hunger.client.model.entity.boss.gluttony;

// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.xiaoyu.insatiable_hunger.common.entity.boss.Gluttony;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import dev.xiaoyu.insatiable_hunger.InsatiableHunger;
import org.jetbrains.annotations.NotNull;

public class OneModel<T extends Gluttony> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	@SuppressWarnings("removal")
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(InsatiableHunger.MOD_ID, "gluttony_one"), "main");

    private final ModelPart Root;
	private final ModelPart Body;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart LegL;
	private final ModelPart KneeL;
	private final ModelPart FootL;
	private final ModelPart LegR;
	private final ModelPart KneeR;
	private final ModelPart FootR;
	private final ModelPart Chest;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart ClawR;
	private final ModelPart ClawT;
	private final ModelPart ClawL;
	private final ModelPart ArmR;
	private final ModelPart ForearmR;
	private final ModelPart HandR;
	private final ModelPart ArmL;
	private final ModelPart ForearmL;
	private final ModelPart HandL;

	public OneModel(ModelPart root) {
		this.Root = root.getChild("Root");
		this.Body = this.Root.getChild("Body");
		this.Tail1 = this.Body.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.LegL = this.Body.getChild("LegL");
		this.KneeL = this.LegL.getChild("KneeL");
		this.FootL = this.KneeL.getChild("FootL");
		this.LegR = this.Body.getChild("LegR");
		this.KneeR = this.LegR.getChild("KneeR");
		this.FootR = this.KneeR.getChild("FootR");
		this.Chest = this.Root.getChild("Chest");
		this.Head = this.Chest.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.ClawR = this.Head.getChild("ClawR");
		this.ClawT = this.Head.getChild("ClawT");
		this.ClawL = this.Head.getChild("ClawL");
		this.ArmR = this.Chest.getChild("ArmR");
		this.ForearmR = this.ArmR.getChild("ForearmR");
		this.HandR = this.ForearmR.getChild("HandR");
		this.ArmL = this.Chest.getChild("ArmL");
		this.ForearmL = this.ArmL.getChild("ForearmL");
		this.HandL = this.ForearmL.getChild("HandL");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = Root.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(25, 37).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 3.0F));

		PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(50, 37).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(62, 0).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, 7.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 37).addBox(0.0F, -3.5F, 0.0F, 0.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 7.0F));

		PartDefinition LegL = Body.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offset(3.6F, 1.0F, 3.5F));

		PartDefinition LegL_r1 = LegL.addOrReplaceChild("LegL_r1", CubeListBuilder.create().texOffs(9, 70).addBox(0.0F, -0.5F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.44F, 2.112F, 0.372F, 0.0F, 0.0F, -1.5708F));

		PartDefinition KneeL = LegL.addOrReplaceChild("KneeL", CubeListBuilder.create(), PartPose.offset(2.06F, 0.512F, 1.372F));

		PartDefinition KneeL_r1 = KneeL.addOrReplaceChild("KneeL_r1", CubeListBuilder.create().texOffs(58, 70).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.1F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition FootL = KneeL.addOrReplaceChild("FootL", CubeListBuilder.create().texOffs(41, 70).addBox(-1.0F, 0.0F, -1.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, 1.0F, -4.5F, 8.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9F, 0.6F, 0.9F, 1.5708F, 1.5708F, 0.0F));

		PartDefinition LegR = Body.addOrReplaceChild("LegR", CubeListBuilder.create(), PartPose.offset(-3.6F, 1.0F, 3.5F));

		PartDefinition LegR_r1 = LegR.addOrReplaceChild("LegR_r1", CubeListBuilder.create().texOffs(9, 70).mirror().addBox(-3.0F, -0.5F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.44F, 2.112F, 0.372F, 0.0F, 0.0F, 1.5708F));

		PartDefinition KneeR = LegR.addOrReplaceChild("KneeR", CubeListBuilder.create(), PartPose.offset(-2.06F, 0.512F, 1.372F));

		PartDefinition KneeR_r1 = KneeR.addOrReplaceChild("KneeR_r1", CubeListBuilder.create().texOffs(58, 70).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.1F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition FootR = KneeR.addOrReplaceChild("FootR", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-7.0F, 1.0F, -4.5F, 8.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(41, 70).mirror().addBox(-3.0F, 0.0F, -1.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9F, 0.6F, 0.9F, 1.5708F, -1.5708F, 0.0F));

		PartDefinition Chest = Root.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 3.0F));

		PartDefinition Chest_r1 = Chest.addOrReplaceChild("Chest_r1", CubeListBuilder.create().texOffs(0, 11).addBox(-4.0F, -4.0F, -7.0F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Head = Chest.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(50, 49).addBox(-2.0F, -1.0F, -12.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.08F))
		.texOffs(58, 11).addBox(-2.0F, 3.0F, -12.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.04F)), PartPose.offset(0.0F, -1.0F, -7.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(31, 11).addBox(-3.0F, -4.939F, -6.305F, 6.0F, 4.0F, 7.0F, new CubeDeformation(0.08F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(50, 60).addBox(-2.0F, -2.0F, -10.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(21, 61).addBox(-2.0F, 1.0F, -10.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(37, 0).addBox(-3.0F, -1.0F, -4.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(62, 21).addBox(-3.0F, -4.0F, -1.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, -2.0F));

		PartDefinition ClawR = Head.addOrReplaceChild("ClawR", CubeListBuilder.create(), PartPose.offset(-3.0F, 0.0F, -1.0F));

		PartDefinition ClawR_r1 = ClawR.addOrReplaceChild("ClawR_r1", CubeListBuilder.create().texOffs(25, 50).addBox(-12.0F, -4.954F, 0.0F, 12.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6545F, 0.0F));

		PartDefinition ClawT = Head.addOrReplaceChild("ClawT", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition ClawT_r1 = ClawT.addOrReplaceChild("ClawT_r1", CubeListBuilder.create().texOffs(37, 23).addBox(-6.0F, -12.954F, 0.0F, 12.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1345F, 0.0F, 0.0F));

		PartDefinition ClawL = Head.addOrReplaceChild("ClawL", CubeListBuilder.create(), PartPose.offset(3.0F, 1.0F, -1.0F));

		PartDefinition ClawL_r1 = ClawL.addOrReplaceChild("ClawL_r1", CubeListBuilder.create().texOffs(25, 50).mirror().addBox(0.0F, -3.954F, 0.0F, 12.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, -0.6545F, 0.0F));

		PartDefinition ArmR = Chest.addOrReplaceChild("ArmR", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-4.0F, -3.0F, -3.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-4.0F, 2.0F, -5.0F));

		PartDefinition ForearmR = ArmR.addOrReplaceChild("ForearmR", CubeListBuilder.create().texOffs(24, 70).mirror().addBox(-4.942F, -1.5F, -1.368F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-3.0F, -0.5F, -0.5F));

		PartDefinition HandR = ForearmR.addOrReplaceChild("HandR", CubeListBuilder.create().texOffs(62, 28).mirror().addBox(-2.4F, -0.135F, -3.974F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 27).mirror().addBox(-4.4F, 0.835F, -8.526F, 9.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.026F, 0.435F, 0.2F, 0.0F, 1.5708F, 0.0F));

		PartDefinition ArmL = Chest.addOrReplaceChild("ArmL", CubeListBuilder.create().texOffs(0, 56).addBox(-1.0F, -3.0F, -3.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 2.0F, -5.0F));

		PartDefinition ForearmL = ArmL.addOrReplaceChild("ForearmL", CubeListBuilder.create().texOffs(24, 70).addBox(-0.058F, -1.5F, -1.368F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -0.5F, -0.5F));

		PartDefinition HandL = ForearmL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(62, 28).addBox(-2.5F, 0.0F, -4.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 27).addBox(-4.5F, 0.97F, -8.552F, 9.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.3F, 0.1F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

    @Override
    public void setupAnim(@NotNull T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
    }

	@Override
	public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

    @Override
    public @NotNull ModelPart root() {
        return this.Root;
    }
}