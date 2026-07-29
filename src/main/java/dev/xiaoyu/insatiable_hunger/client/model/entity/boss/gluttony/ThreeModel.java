package dev.xiaoyu.insatiable_hunger.client.model.entity.boss.gluttony;

// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.xiaoyu.insatiable_hunger.InsatiableHunger;
import dev.xiaoyu.insatiable_hunger.common.entity.boss.Gluttony;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class ThreeModel<T extends Gluttony> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	@SuppressWarnings("removal")
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(InsatiableHunger.MOD_ID, "gluttony_three"), "main");

	private final ModelPart Root;
	private final ModelPart Leg;
	private final ModelPart Legbottom;
	private final ModelPart bone3;
	private final ModelPart Foot;
	private final ModelPart Toe;
	private final ModelPart Toe3;
	private final ModelPart Toe4;
	private final ModelPart Body;
	private final ModelPart Tail;
	private final ModelPart Tailmid;
	private final ModelPart Tailbottom;
	private final ModelPart bone4;
	private final ModelPart Chest;
	private final ModelPart tendrils_in_shoulder;
	private final ModelPart tendrils_in_shoulder1;
	private final ModelPart Tendrils_in_body;
	private final ModelPart tendrils_in_body2;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart tendrils;
	private final ModelPart Jaw;
	private final ModelPart tendrils2;
	private final ModelPart Arm;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart Finger;
	private final ModelPart Finger5;
	private final ModelPart Finger6;
	private final ModelPart Arm2;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart Finger2;
	private final ModelPart Finger3;
	private final ModelPart Finger4;
	private final ModelPart tendrils_in_shoulder2;
	private final ModelPart tendrils_in_shoulder3;
	private final ModelPart Leg2;
	private final ModelPart Legbottom2;
	private final ModelPart bone7;
	private final ModelPart Foot2;
	private final ModelPart Toe2;
	private final ModelPart Toe5;
	private final ModelPart Toe6;
	private final ModelPart bb_main;

	public ThreeModel(ModelPart root) {
		this.Root = root.getChild("Root");
		this.Leg = this.Root.getChild("Leg");
		this.Legbottom = this.Leg.getChild("Legbottom");
		this.bone3 = this.Legbottom.getChild("bone3");
		this.Foot = this.bone3.getChild("Foot");
		this.Toe = this.Foot.getChild("Toe");
		this.Toe3 = this.Foot.getChild("Toe3");
		this.Toe4 = this.Foot.getChild("Toe4");
		this.Body = this.Root.getChild("Body");
		this.Tail = this.Body.getChild("Tail");
		this.Tailmid = this.Tail.getChild("Tailmid");
		this.Tailbottom = this.Tailmid.getChild("Tailbottom");
		this.bone4 = this.Tailbottom.getChild("bone4");
		this.Chest = this.Body.getChild("Chest");
		this.tendrils_in_shoulder = this.Chest.getChild("tendrils_in_shoulder");
		this.tendrils_in_shoulder1 = this.Chest.getChild("tendrils_in_shoulder1");
		this.Tendrils_in_body = this.Chest.getChild("Tendrils_in_body");
		this.tendrils_in_body2 = this.Chest.getChild("tendrils_in_body2");
		this.Neck = this.Chest.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.tendrils = this.Head.getChild("tendrils");
		this.Jaw = this.Head.getChild("Jaw");
		this.tendrils2 = this.Head.getChild("tendrils2");
		this.Arm = this.Chest.getChild("Arm");
		this.bone = this.Arm.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.Finger = this.bone2.getChild("Finger");
		this.Finger5 = this.bone2.getChild("Finger5");
		this.Finger6 = this.bone2.getChild("Finger6");
		this.Arm2 = this.Chest.getChild("Arm2");
		this.bone5 = this.Arm2.getChild("bone5");
		this.bone6 = this.bone5.getChild("bone6");
		this.Finger2 = this.bone6.getChild("Finger2");
		this.Finger3 = this.bone6.getChild("Finger3");
		this.Finger4 = this.bone6.getChild("Finger4");
		this.tendrils_in_shoulder2 = this.Chest.getChild("tendrils_in_shoulder2");
		this.tendrils_in_shoulder3 = this.Chest.getChild("tendrils_in_shoulder3");
		this.Leg2 = this.Root.getChild("Leg2");
		this.Legbottom2 = this.Leg2.getChild("Legbottom2");
		this.bone7 = this.Legbottom2.getChild("bone7");
		this.Foot2 = this.bone7.getChild("Foot2");
		this.Toe2 = this.Foot2.getChild("Toe2");
		this.Toe5 = this.Foot2.getChild("Toe5");
		this.Toe6 = this.Foot2.getChild("Toe6");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Leg = Root.addOrReplaceChild("Leg", CubeListBuilder.create(), PartPose.offset(-5.0F, -26.0F, 14.0F));

		PartDefinition cube_r1 = Leg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 120).addBox(-6.0F, -2.0F, -3.0F, 6.0F, 15.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Legbottom = Leg.addOrReplaceChild("Legbottom", CubeListBuilder.create(), PartPose.offset(-3.0F, 10.0F, 2.0F));

		PartDefinition cube_r2 = Legbottom.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(115, 108).addBox(-2.5F, -3.0F, -4.0F, 5.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone3 = Legbottom.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(149, 0).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 6.0F));

		PartDefinition Foot = bone3.addOrReplaceChild("Foot", CubeListBuilder.create().texOffs(150, 108).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, 1.0F));

		PartDefinition Toe = Foot.addOrReplaceChild("Toe", CubeListBuilder.create().texOffs(152, 128).addBox(-1.5F, -1.0F, -6.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 0.0F, -3.0F));

		PartDefinition cube_r3 = Toe.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(41, 70).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Toe3 = Foot.addOrReplaceChild("Toe3", CubeListBuilder.create().texOffs(152, 128).addBox(-1.5F, -1.0F, -6.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, -3.0F));

		PartDefinition cube_r4 = Toe3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(41, 70).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Toe4 = Foot.addOrReplaceChild("Toe4", CubeListBuilder.create().texOffs(152, 128).addBox(-1.5F, -1.0F, -6.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -3.0F));

		PartDefinition cube_r5 = Toe4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(41, 70).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Body = Root.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(55, 33).addBox(-5.0F, -6.0F, -11.0F, 10.0F, 12.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -26.0F, 15.0F));

		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(63, 0).addBox(-3.0F, -5.0F, 0.0F, 6.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(84, 110).addBox(0.0F, -13.0F, 2.0F, 0.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));

		PartDefinition Tailmid = Tail.addOrReplaceChild("Tailmid", CubeListBuilder.create().texOffs(0, 97).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 6.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(112, 41).addBox(0.0F, -10.0F, 2.0F, 0.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 14.0F));

		PartDefinition Tailbottom = Tailmid.addOrReplaceChild("Tailbottom", CubeListBuilder.create().texOffs(0, 73).addBox(0.0F, -8.0F, 2.0F, 0.0F, 6.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(55, 63).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 14.0F));

		PartDefinition bone4 = Tailbottom.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(41, 88).addBox(0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 20.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -10.0F));

		PartDefinition cube_r6 = Chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(1.0F, -7.0F, -18.0F, 8.0F, 17.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 33).addBox(-9.0F, -7.0F, -18.0F, 8.0F, 17.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -7.9829F, -17.261F, 14.0F, 15.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tendrils_in_shoulder = Chest.addOrReplaceChild("tendrils_in_shoulder", CubeListBuilder.create(), PartPose.offset(-7.0F, -7.0F, -15.0F));

		PartDefinition cube_r8 = tendrils_in_shoulder.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(136, 143).addBox(-12.0F, -9.0F, 0.0F, 12.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition tendrils_in_shoulder1 = Chest.addOrReplaceChild("tendrils_in_shoulder1", CubeListBuilder.create(), PartPose.offset(-7.0F, -9.0F, -11.0F));

		PartDefinition cube_r9 = tendrils_in_shoulder1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(127, 86).addBox(-15.0F, -12.0F, 0.0F, 15.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0333F, 0.4197F, 0.4509F));

		PartDefinition Tendrils_in_body = Chest.addOrReplaceChild("Tendrils_in_body", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0F, -9.0F));

		PartDefinition cube_r10 = Tendrils_in_body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(107, 143).addBox(-5.7644F, -15.5603F, 0.2673F, 14.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0392F, 0.0338F, 0.2597F));

		PartDefinition tendrils_in_body2 = Chest.addOrReplaceChild("tendrils_in_body2", CubeListBuilder.create(), PartPose.offset(-5.0F, -8.0F, -4.0F));

		PartDefinition cube_r11 = tendrils_in_body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(29, 138).addBox(-5.7644F, -22.5603F, 0.2673F, 14.0F, 22.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3815F, -0.0817F, -0.0234F));

		PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, -17.0F));

		PartDefinition cube_r12 = Neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(100, 63).addBox(-4.0F, -3.0F, -11.0F, 8.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(108, 0).addBox(-4.0F, -4.0F, -22.0F, 8.0F, 7.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(185, 28).addBox(-4.0F, 3.0F, -22.0F, 8.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, -11.0F));

		PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(82, 88).addBox(-5.0F, -4.0F, -11.0F, 10.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tendrils = Head.addOrReplaceChild("tendrils", CubeListBuilder.create(), PartPose.offset(-5.0F, -3.0F, 0.0F));

		PartDefinition cube_r14 = tendrils.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(58, 150).addBox(-12.0F, -8.0F, 0.0F, 12.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(72, 133).addBox(-3.0F, 0.0F, -21.0F, 6.0F, 5.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(110, 20).addBox(-3.0F, -4.0F, -21.0F, 6.0F, 4.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(115, 127).addBox(-4.0F, 0.0F, -10.0F, 8.0F, 5.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 144).addBox(-4.0F, -5.0F, -6.0F, 8.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition tendrils2 = Head.addOrReplaceChild("tendrils2", CubeListBuilder.create(), PartPose.offset(5.0F, -3.0F, 0.0F));

		PartDefinition cube_r15 = tendrils2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(58, 150).mirror().addBox(0.0F, -8.0F, 0.0F, 12.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition Arm = Chest.addOrReplaceChild("Arm", CubeListBuilder.create(), PartPose.offset(-9.0F, 0.0F, -11.0F));

		PartDefinition cube_r16 = Arm.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(41, 112).addBox(-4.0F, -4.0F, -5.0F, 6.0F, 16.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone = Arm.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-1.0F, 9.0F, 1.0F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(143, 39).addBox(-2.0F, -3.6353F, -2.8665F, 4.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 156).addBox(-1.0F, 0.3647F, 1.1335F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(63, 25).addBox(0.0F, 0.3647F, 1.1335F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(149, 20).addBox(-3.0F, -1.0F, -4.0F, 6.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.0F, -6.0F));

		PartDefinition Finger = bone2.addOrReplaceChild("Finger", CubeListBuilder.create(), PartPose.offset(-2.0F, 0.0F, -4.0F));

		PartDefinition cube_r20 = Finger.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(74, 25).addBox(-1.5F, 0.0F, -6.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, -10.0F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Finger.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(83, 150).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -6.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r22 = Finger.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(152, 118).addBox(-2.5F, -1.0F, -6.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Finger5 = bone2.addOrReplaceChild("Finger5", CubeListBuilder.create(), PartPose.offset(2.0F, 0.0F, -4.0F));

		PartDefinition cube_r23 = Finger5.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(74, 25).addBox(-1.5F, 0.0F, -6.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, -10.0F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Finger5.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(83, 150).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -6.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Finger5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(152, 118).addBox(-2.5F, -1.0F, -6.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Finger6 = bone2.addOrReplaceChild("Finger6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0F));

		PartDefinition cube_r26 = Finger6.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(74, 25).addBox(-1.5F, 0.0F, -6.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, -10.0F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Finger6.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(83, 150).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -6.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r28 = Finger6.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(152, 118).addBox(-2.5F, -1.0F, -6.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Arm2 = Chest.addOrReplaceChild("Arm2", CubeListBuilder.create(), PartPose.offset(9.0F, 0.0F, -11.0F));

		PartDefinition cube_r29 = Arm2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(41, 112).mirror().addBox(-2.0F, -4.0F, -5.0F, 6.0F, 16.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone5 = Arm2.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(1.0F, 9.0F, 1.0F));

		PartDefinition cube_r30 = bone5.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(143, 39).mirror().addBox(-2.0F, -3.6353F, -2.8665F, 4.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r31 = bone5.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 156).mirror().addBox(-1.0F, 0.3647F, 1.1335F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone5.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(63, 25).mirror().addBox(-2.0F, 0.3647F, 1.1335F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(149, 20).mirror().addBox(-3.0F, -1.0F, -4.0F, 6.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 14.0F, -6.0F));

		PartDefinition Finger2 = bone6.addOrReplaceChild("Finger2", CubeListBuilder.create(), PartPose.offset(2.0F, 0.0F, -4.0F));

		PartDefinition cube_r33 = Finger2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(74, 25).mirror().addBox(0.5F, 0.0F, -6.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0F, -10.0F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r34 = Finger2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(83, 150).mirror().addBox(-1.0F, -1.0F, -6.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, -6.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Finger2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(152, 118).mirror().addBox(-0.5F, -1.0F, -6.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Finger3 = bone6.addOrReplaceChild("Finger3", CubeListBuilder.create(), PartPose.offset(-2.0F, 0.0F, -4.0F));

		PartDefinition cube_r36 = Finger3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(74, 25).mirror().addBox(0.5F, 0.0F, -6.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0F, -10.0F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r37 = Finger3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(83, 150).mirror().addBox(-1.0F, -1.0F, -6.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, -6.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r38 = Finger3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(152, 118).mirror().addBox(-0.5F, -1.0F, -6.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Finger4 = bone6.addOrReplaceChild("Finger4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0F));

		PartDefinition cube_r39 = Finger4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(74, 25).mirror().addBox(0.5F, 0.0F, -6.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0F, -10.0F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r40 = Finger4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(83, 150).mirror().addBox(-1.0F, -1.0F, -6.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, -6.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r41 = Finger4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(152, 118).mirror().addBox(-0.5F, -1.0F, -6.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tendrils_in_shoulder2 = Chest.addOrReplaceChild("tendrils_in_shoulder2", CubeListBuilder.create(), PartPose.offset(7.0F, -7.0F, -15.0F));

		PartDefinition cube_r42 = tendrils_in_shoulder2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(136, 143).mirror().addBox(0.0F, -9.0F, 0.0F, 12.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition tendrils_in_shoulder3 = Chest.addOrReplaceChild("tendrils_in_shoulder3", CubeListBuilder.create(), PartPose.offset(7.0F, -9.0F, -11.0F));

		PartDefinition cube_r43 = tendrils_in_shoulder3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(127, 86).mirror().addBox(0.0F, -12.0F, 0.0F, 15.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0333F, -0.4197F, -0.4509F));

		PartDefinition Leg2 = Root.addOrReplaceChild("Leg2", CubeListBuilder.create(), PartPose.offset(5.0F, -26.0F, 14.0F));

		PartDefinition cube_r44 = Leg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 120).mirror().addBox(0.0F, -2.0F, -3.0F, 6.0F, 15.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Legbottom2 = Leg2.addOrReplaceChild("Legbottom2", CubeListBuilder.create(), PartPose.offset(3.0F, 10.0F, 2.0F));

		PartDefinition cube_r45 = Legbottom2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(115, 108).mirror().addBox(-2.5F, -3.0F, -4.0F, 5.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone7 = Legbottom2.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(149, 0).mirror().addBox(-2.0F, -3.0F, 0.0F, 4.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 3.0F, 6.0F));

		PartDefinition Foot2 = bone7.addOrReplaceChild("Foot2", CubeListBuilder.create().texOffs(150, 108).mirror().addBox(-3.0F, 0.0F, -4.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 10.0F, 1.0F));

		PartDefinition Toe2 = Foot2.addOrReplaceChild("Toe2", CubeListBuilder.create().texOffs(152, 128).mirror().addBox(-1.5F, -1.0F, -6.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, 0.0F, -3.0F));

		PartDefinition cube_r46 = Toe2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(41, 70).mirror().addBox(-1.0F, -1.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Toe5 = Foot2.addOrReplaceChild("Toe5", CubeListBuilder.create().texOffs(152, 128).mirror().addBox(-1.5F, -1.0F, -6.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, 0.0F, -3.0F));

		PartDefinition cube_r47 = Toe5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(41, 70).mirror().addBox(-1.0F, -1.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Toe6 = Foot2.addOrReplaceChild("Toe6", CubeListBuilder.create().texOffs(152, 128).mirror().addBox(-1.5F, -1.0F, -6.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, -3.0F));

		PartDefinition cube_r48 = Toe6.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(41, 70).mirror().addBox(-1.0F, -1.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(@NotNull T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public @NotNull ModelPart root() {
		return this.Root;
	}
}