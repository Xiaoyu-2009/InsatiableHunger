package dev.xiaoyu.insatiable_hunger.client.model.entity.boss.gluttony;

// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.xiaoyu.insatiable_hunger.InsatiableHunger;
import dev.xiaoyu.insatiable_hunger.client.animation.entity.boss.gluttony.GluttonyAnimation;
import dev.xiaoyu.insatiable_hunger.common.entity.boss.Gluttony;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class FiveModel<T extends Gluttony> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	@SuppressWarnings("removal")
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(InsatiableHunger.MOD_ID, "gluttony"), "main");

    private final ModelPart Root;
	private final ModelPart Backleg;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart Foot;
	private final ModelPart bone6;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart Body;
	private final ModelPart Tail;
	private final ModelPart Tailmid;
	private final ModelPart Tailbottom;
	private final ModelPart Tailtip;
	private final ModelPart bone7;
	private final ModelPart Chest;
	private final ModelPart Tendrils_in_body5;
	private final ModelPart Tendrils_in_body;
	private final ModelPart Tendrils_in_body4;
	private final ModelPart Tendrils_in_body3;
	private final ModelPart Tendrils_in_body6;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart Arm;
	private final ModelPart bone;
	private final ModelPart Hand;
	private final ModelPart fingersright;
	private final ModelPart Finger;
	private final ModelPart bone3;
	private final ModelPart Finger2;
	private final ModelPart bone2;
	private final ModelPart Finger3;
	private final ModelPart bone8;
	private final ModelPart Finger4;
	private final ModelPart bone9;
	private final ModelPart Arm2;
	private final ModelPart bone12;
	private final ModelPart Hand2;
	private final ModelPart fingersleft;
	private final ModelPart Finger5;
	private final ModelPart bone13;
	private final ModelPart Finger6;
	private final ModelPart bone14;
	private final ModelPart Finger7;
	private final ModelPart bone15;
	private final ModelPart Finger8;
	private final ModelPart bone16;
	private final ModelPart Backleg2;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart Foot2;
	private final ModelPart bone19;
	private final ModelPart bone20;
	private final ModelPart bone21;

	public FiveModel(ModelPart root) {
		this.Root = root.getChild("Root");
		this.Backleg = this.Root.getChild("Backleg");
		this.bone4 = this.Backleg.getChild("bone4");
		this.bone5 = this.bone4.getChild("bone5");
		this.Foot = this.bone5.getChild("Foot");
		this.bone6 = this.Foot.getChild("bone6");
		this.bone10 = this.Foot.getChild("bone10");
		this.bone11 = this.Foot.getChild("bone11");
		this.Body = this.Root.getChild("Body");
		this.Tail = this.Body.getChild("Tail");
		this.Tailmid = this.Tail.getChild("Tailmid");
		this.Tailbottom = this.Tailmid.getChild("Tailbottom");
		this.Tailtip = this.Tailbottom.getChild("Tailtip");
		this.bone7 = this.Tailtip.getChild("bone7");
		this.Chest = this.Body.getChild("Chest");
		this.Tendrils_in_body5 = this.Chest.getChild("Tendrils_in_body5");
		this.Tendrils_in_body = this.Chest.getChild("Tendrils_in_body");
		this.Tendrils_in_body4 = this.Chest.getChild("Tendrils_in_body4");
		this.Tendrils_in_body3 = this.Chest.getChild("Tendrils_in_body3");
		this.Tendrils_in_body6 = this.Chest.getChild("Tendrils_in_body6");
		this.Neck = this.Chest.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.Arm = this.Chest.getChild("Arm");
		this.bone = this.Arm.getChild("bone");
		this.Hand = this.bone.getChild("Hand");
		this.fingersright = this.Hand.getChild("fingersright");
		this.Finger = this.fingersright.getChild("Finger");
		this.bone3 = this.Finger.getChild("bone3");
		this.Finger2 = this.fingersright.getChild("Finger2");
		this.bone2 = this.Finger2.getChild("bone2");
		this.Finger3 = this.fingersright.getChild("Finger3");
		this.bone8 = this.Finger3.getChild("bone8");
		this.Finger4 = this.fingersright.getChild("Finger4");
		this.bone9 = this.Finger4.getChild("bone9");
		this.Arm2 = this.Chest.getChild("Arm2");
		this.bone12 = this.Arm2.getChild("bone12");
		this.Hand2 = this.bone12.getChild("Hand2");
		this.fingersleft = this.Hand2.getChild("fingersleft");
		this.Finger5 = this.fingersleft.getChild("Finger5");
		this.bone13 = this.Finger5.getChild("bone13");
		this.Finger6 = this.fingersleft.getChild("Finger6");
		this.bone14 = this.Finger6.getChild("bone14");
		this.Finger7 = this.fingersleft.getChild("Finger7");
		this.bone15 = this.Finger7.getChild("bone15");
		this.Finger8 = this.fingersleft.getChild("Finger8");
		this.bone16 = this.Finger8.getChild("bone16");
		this.Backleg2 = this.Root.getChild("Backleg2");
		this.bone17 = this.Backleg2.getChild("bone17");
		this.bone18 = this.bone17.getChild("bone18");
		this.Foot2 = this.bone18.getChild("Foot2");
		this.bone19 = this.Foot2.getChild("bone19");
		this.bone20 = this.Foot2.getChild("bone20");
		this.bone21 = this.Foot2.getChild("bone21");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offsetAndRotation(38.0F, 17.0F, 81.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition Backleg = Root.addOrReplaceChild("Backleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-38.3747F, -62.0F, -17.1631F, 0.0499F, 0.3027F, 0.0411F));

		PartDefinition cube_r1 = Backleg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(155, 487).addBox(-18.0F, -12.0F, -20.0F, 27.0F, 47.0F, 37.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, 3.0F, -0.2986F, 0.0651F, 0.2084F));

		PartDefinition bone4 = Backleg.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.0F, 26.0F, 9.0F, 0.4363F, 0.0F, 0.1745F));

		PartDefinition cube_r2 = bone4.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(643, 495).addBox(-13.0F, -5.0F, -8.0F, 18.0F, 42.0F, 25.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -7.0F, -14.0F, 0.7852F, 0.0F, 0.0F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 15.0F, 13.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone5.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(155, 415).addBox(-7.008F, -12.2402F, -5.148F, 16.0F, 42.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3032F, 0.0F, 0.0F));

		PartDefinition Foot = bone5.addOrReplaceChild("Foot", CubeListBuilder.create().texOffs(656, 447).addBox(-15.0F, -2.0F, -10.0F, 21.0F, 13.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 23.0F, -11.0F, -0.3134F, 0.2683F, -0.366F));

		PartDefinition bone6 = Foot.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(682, 107).addBox(-4.0F, -5.0F, -19.0F, 7.0F, 10.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0F, 0.0F, -10.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r4 = bone6.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(95, 575).addBox(-3.0F, 0.0F, -24.0F, 5.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone10 = Foot.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(682, 107).addBox(-4.0F, -5.0F, -19.0F, 7.0F, 10.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, -10.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r5 = bone10.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(95, 575).addBox(-3.0F, 0.0F, -24.0F, 5.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone11 = Foot.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(682, 107).addBox(-4.0F, -5.0F, -19.0F, 7.0F, 10.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 1.0F, -10.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone11.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(95, 575).addBox(-3.0F, 0.0F, -24.0F, 5.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Body = Root.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(299, 0).addBox(0.0F, -51.0F, -57.0F, 0.0F, 32.0F, 83.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.3747F, -72.0F, -8.1631F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(522, 500).addBox(-26.0F, -50.0F, 31.0F, 22.0F, 34.0F, 43.0F, new CubeDeformation(0.0F))
		.texOffs(522, 500).mirror().addBox(4.0F, -50.0F, 31.0F, 22.0F, 34.0F, 43.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 18.0F, -88.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 143).addBox(-24.0F, -22.4026F, -55.0092F, 48.0F, 47.0F, 77.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(569, 63).addBox(0.0F, -43.0F, 11.0F, 0.0F, 21.0F, 56.0F, new CubeDeformation(0.0F))
		.texOffs(227, 291).addBox(-16.0F, -22.0F, 2.0F, 32.0F, 38.0F, 65.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 14.0F, 0.0803F, -0.0549F, -0.0723F));

		PartDefinition Tailmid = Tail.addOrReplaceChild("Tailmid", CubeListBuilder.create().texOffs(401, 500).addBox(0.0F, -41.0F, 0.0F, 0.0F, 22.0F, 60.0F, new CubeDeformation(0.0F))
		.texOffs(227, 395).addBox(-12.0F, -19.0F, 0.0F, 24.0F, 31.0F, 60.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 67.0F, -0.1346F, 0.0086F, 0.0159F));

		PartDefinition Tailbottom = Tailmid.addOrReplaceChild("Tailbottom", CubeListBuilder.create().texOffs(569, 201).addBox(0.0F, -34.0F, 0.0F, 0.0F, 19.0F, 55.0F, new CubeDeformation(0.0F))
		.texOffs(422, 291).addBox(-9.0F, -15.0F, 0.0F, 18.0F, 22.0F, 55.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 60.0F, -0.389F, -0.0111F, 0.1245F));

		PartDefinition Tailtip = Tailbottom.addOrReplaceChild("Tailtip", CubeListBuilder.create().texOffs(0, 504).addBox(-5.0F, -7.0F, 0.0F, 10.0F, 15.0F, 55.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 55.0F, -0.1682F, 0.0609F, -0.1538F));

		PartDefinition bone7 = Tailtip.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(522, 578).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 10.0F, 50.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 54.0F, 0.0837F, -0.0298F, -0.0123F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.0F, -52.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(251, 143).mirror().addBox(4.0F, -62.0F, -30.0F, 32.0F, 66.0F, 81.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(251, 143).addBox(-36.0F, -62.0F, -30.0F, 32.0F, 66.0F, 81.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 40.0F, -40.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-35.0F, -27.5536F, -75.3382F, 70.0F, 63.0F, 79.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Tendrils_in_body5 = Chest.addOrReplaceChild("Tendrils_in_body5", CubeListBuilder.create(), PartPose.offset(-16.0F, -24.0F, -39.0F));

		PartDefinition cube_r11 = Tendrils_in_body5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(478, 124).addBox(-0.1038F, -65.1704F, -27.24F, 0.0F, 78.0F, 45.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -2.0F, 3.0F, -0.4259F, -1.0563F, 0.3962F));

		PartDefinition Tendrils_in_body = Chest.addOrReplaceChild("Tendrils_in_body", CubeListBuilder.create(), PartPose.offset(-24.0F, -19.0F, -54.0F));

		PartDefinition cube_r12 = Tendrils_in_body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(343, 639).addBox(0.0343F, -51.0368F, -14.6441F, 0.0F, 56.0F, 37.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 4.0F, 0.0F, 0.1833F, -0.3721F, -0.2682F));

		PartDefinition Tendrils_in_body4 = Chest.addOrReplaceChild("Tendrils_in_body4", CubeListBuilder.create(), PartPose.offset(24.0F, -23.0F, -24.0F));

		PartDefinition cube_r13 = Tendrils_in_body4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(466, 0).addBox(-0.8917F, -68.7155F, -19.5953F, 0.0F, 78.0F, 45.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -1.0F, -2.0F, -0.8994F, 0.9326F, -0.9399F));

		PartDefinition Tendrils_in_body3 = Chest.addOrReplaceChild("Tendrils_in_body3", CubeListBuilder.create(), PartPose.offset(24.0F, -21.0F, -52.0F));

		PartDefinition cube_r14 = Tendrils_in_body3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(635, 578).addBox(0.885F, -51.6891F, -19.617F, 0.0F, 56.0F, 37.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.0F, -3.0F, -1.1937F, 1.1068F, -1.2215F));

		PartDefinition Tendrils_in_body6 = Chest.addOrReplaceChild("Tendrils_in_body6", CubeListBuilder.create(), PartPose.offset(-20.0F, -27.0F, -23.0F));

		PartDefinition cube_r15 = Tendrils_in_body6.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(418, 639).addBox(-2.4083F, -52.4807F, -12.7055F, 0.0F, 56.0F, 37.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 3.0F, 2.0F, -1.2897F, -0.7552F, 1.3227F));

		PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 415).addBox(-17.0F, -19.0F, -32.0F, 34.0F, 45.0F, 43.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 24.0F, -63.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(401, 583).addBox(-12.0F, -20.0F, -68.0F, 24.0F, 21.0F, 34.0F, new CubeDeformation(0.0F))
		.texOffs(226, 591).addBox(-12.0F, 1.0F, -68.0F, 24.0F, 14.0F, 34.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -31.0F, 0.542F, -0.3074F, -0.3237F));

		PartDefinition cube_r16 = Head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(131, 572).mirror().addBox(-24.0F, -29.0F, -29.0F, 0.0F, 36.0F, 47.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-25.0F, -14.0F, 20.0F, -0.3814F, -0.9777F, 0.7868F));

		PartDefinition cube_r17 = Head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(343, 591).addBox(-12.4817F, -43.6405F, -1.5503F, 23.0F, 44.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, -11.0F, -7.0F, -0.7151F, -0.7273F, -1.7961F));

		PartDefinition cube_r18 = Head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(343, 591).mirror().addBox(-10.5183F, -43.6405F, -1.5503F, 23.0F, 44.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(11.0F, -11.0F, -7.0F, -0.7151F, 0.7273F, 1.7961F));

		PartDefinition cube_r19 = Head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(343, 591).mirror().addBox(-10.5183F, -43.6405F, -1.5503F, 23.0F, 44.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(14.0F, -9.0F, -5.0F, -0.0989F, 0.3652F, 1.085F));

		PartDefinition cube_r20 = Head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(131, 572).mirror().addBox(-7.0573F, -27.1266F, 0.5709F, 0.0F, 36.0F, 47.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0F, -14.0F, -2.0F, 0.2291F, -0.7716F, 0.6742F));

		PartDefinition cube_r21 = Head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(131, 572).addBox(7.0573F, -27.1266F, 0.5709F, 0.0F, 36.0F, 47.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -14.0F, -2.0F, 0.2291F, 0.7716F, -0.6742F));

		PartDefinition cube_r22 = Head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(131, 572).addBox(24.0F, -29.0F, -29.0F, 0.0F, 36.0F, 47.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.0F, -14.0F, 20.0F, -0.3814F, 0.9777F, -0.7868F));

		PartDefinition cube_r23 = Head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(343, 591).addBox(-12.4817F, -43.6405F, -1.5503F, 23.0F, 44.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.0F, -9.0F, -5.0F, -0.0989F, -0.3652F, -1.085F));

		PartDefinition cube_r24 = Head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(606, 672).addBox(-14.0F, -75.0F, -17.0F, 27.0F, 49.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 6.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(569, 141).addBox(-15.0F, -24.0F, -34.0F, 30.0F, 24.0F, 35.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(493, 639).addBox(-10.0F, 0.0F, -65.0F, 20.0F, 15.0F, 36.0F, new CubeDeformation(0.0F))
		.texOffs(557, 0).addBox(-10.0F, -11.0F, -65.0F, 20.0F, 11.0F, 45.0F, new CubeDeformation(0.0F))
		.texOffs(537, 447).addBox(-14.0F, 0.0F, -30.0F, 28.0F, 16.0F, 31.0F, new CubeDeformation(0.0F))
		.texOffs(478, 248).addBox(-13.0F, -20.0F, -17.0F, 26.0F, 20.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Arm = Chest.addOrReplaceChild("Arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-40.0F, 6.0F, -30.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Arm.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(289, 646).addBox(-19.0F, -2.0F, 5.0F, 12.0F, 56.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -26.0F, 11.0F, -0.2934F, -0.0345F, 0.5112F));

		PartDefinition cube_r27 = Arm.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(688, 0).addBox(-19.0F, 34.0F, 0.0F, 10.0F, 28.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(27.0F, 9.0F, -54.0F, 0.7055F, -0.2473F, 0.8918F));

		PartDefinition cube_r28 = Arm.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(226, 646).addBox(-19.0F, -2.0F, -5.0F, 12.0F, 56.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -26.0F, -21.0F, 0.3158F, -0.0481F, 0.5527F));

		PartDefinition cube_r29 = Arm.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(661, 672).addBox(-9.1978F, -31.9093F, -8.0102F, 7.0F, 46.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.0F, 1.0F, 5.0F, -0.1162F, -0.18F, 0.3251F));

		PartDefinition cube_r30 = Arm.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(396, 395).addBox(-32.0F, -10.0F, -19.0F, 34.0F, 79.0F, 36.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 14.0F, -2.0F, 0.1596F, -0.103F, 0.8989F));

		PartDefinition cube_r31 = Arm.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-19.0F, 20.0F, 1.0F, 10.0F, 34.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.0F, -14.0F, -49.0F, 0.6161F, -0.075F, 0.6359F));

		PartDefinition bone = Arm.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-58.0F, 31.0F, 6.0F, 0.2648F, -0.6451F, 0.1192F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(219, 0).mirror().addBox(-10.0F, -6.0F, 13.0F, 5.0F, 7.0F, 35.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(14.0F, 42.0F, -31.0F, -0.7903F, -0.681F, 0.9724F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(173, 142).mirror().addBox(-10.0F, -6.0F, 13.0F, 5.0F, 7.0F, 35.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(11.0F, 29.0F, -22.0F, -0.7903F, -0.681F, 0.9724F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(658, 347).addBox(-10.0F, -3.0F, 13.0F, 5.0F, 11.0F, 38.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, 24.0F, -21.0F, -0.427F, -0.6414F, 0.9491F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(658, 347).addBox(-10.0F, -3.0F, 13.0F, 5.0F, 11.0F, 38.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 18.0F, -5.0F, -0.2274F, -0.7543F, 1.0865F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(284, 500).addBox(-24.0F, -3.0F, -10.0F, 28.0F, 60.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 9.0F, 5.0F, -1.0565F, -0.7543F, 1.0865F));

		PartDefinition Hand = bone.addOrReplaceChild("Hand", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.0F, 48.0F, -37.0F, -0.1309F, 0.0F, -0.3054F));

		PartDefinition cube_r37 = Hand.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(569, 276).addBox(-12.0F, -8.0F, -16.0F, 21.0F, 36.0F, 34.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5428F, 0.0005F, 1.5374F));

		PartDefinition fingersright = Hand.addOrReplaceChild("fingersright", CubeListBuilder.create(), PartPose.offset(6.0F, -1.0F, -20.0F));

		PartDefinition Finger = fingersright.addOrReplaceChild("Finger", CubeListBuilder.create(), PartPose.offsetAndRotation(-21.0F, 0.0F, -5.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r38 = Finger.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(682, 63).addBox(-7.3149F, -5.7358F, -4.162F, 12.0F, 33.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -4.0F, -1.5423F, 0.1749F, 1.5423F));

		PartDefinition bone3 = Finger.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.0F, -7.0F, -28.0F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(422, 369).addBox(14.6851F, 8.2642F, -0.162F, 6.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 29.0F, 5.0F, -1.4102F, 1.3945F, 1.6955F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(370, 116).addBox(-4.4498F, -3.7523F, -2.5295F, 25.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5328F, 0.7419F, 1.5631F));

		PartDefinition Finger2 = fingersright.addOrReplaceChild("Finger2", CubeListBuilder.create(), PartPose.offsetAndRotation(-13.0F, 0.0F, -9.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r41 = Finger2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(683, 63).addBox(-9.3149F, -5.7358F, -4.162F, 11.0F, 33.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -1.5423F, 0.1749F, 1.5423F));

		PartDefinition bone2 = Finger2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.0F, -10.0F, -28.0F));

		PartDefinition cube_r42 = bone2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(227, 268).addBox(14.6851F, 7.2642F, -2.162F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 27.0F, 6.0F, -1.4889F, 1.2211F, 1.6144F));

		PartDefinition cube_r43 = bone2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(299, 116).addBox(-6.7913F, -1.323F, -2.6026F, 29.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -1.5342F, 0.6983F, 1.5609F));

		PartDefinition Finger3 = fingersright.addOrReplaceChild("Finger3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, -9.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r44 = Finger3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(683, 63).addBox(-9.3149F, -5.7358F, -5.162F, 11.0F, 33.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -1.5423F, 0.1749F, 1.5423F));

		PartDefinition bone8 = Finger3.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(-1.0F, -10.0F, -28.0F));

		PartDefinition cube_r45 = bone8.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(227, 268).addBox(14.6851F, 7.2642F, -2.162F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 27.0F, 6.0F, -1.4889F, 1.2211F, 1.6144F));

		PartDefinition cube_r46 = bone8.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(299, 116).addBox(-6.7913F, -1.323F, -2.6026F, 29.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -1.5342F, 0.6983F, 1.5609F));

		PartDefinition Finger4 = fingersright.addOrReplaceChild("Finger4", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 0.0F, -5.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r47 = Finger4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(682, 63).addBox(-7.3149F, -5.7358F, -4.162F, 12.0F, 33.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -4.0F, -1.5423F, 0.1749F, 1.5423F));

		PartDefinition bone9 = Finger4.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(-1.0F, -7.0F, -28.0F));

		PartDefinition cube_r48 = bone9.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(422, 369).addBox(14.6851F, 8.2642F, -0.162F, 6.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 29.0F, 5.0F, -1.4102F, 1.3945F, 1.6955F));

		PartDefinition cube_r49 = bone9.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(370, 116).addBox(-4.4498F, -3.7523F, -2.5295F, 25.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5328F, 0.7419F, 1.5631F));

		PartDefinition Arm2 = Chest.addOrReplaceChild("Arm2", CubeListBuilder.create(), PartPose.offset(36.0F, -5.0F, -30.0F));

		PartDefinition cube_r50 = Arm2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(396, 395).mirror().addBox(-2.0F, -10.0F, -19.0F, 34.0F, 79.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.0F, 14.0F, -2.0F, 0.1596F, 0.103F, -0.8989F));

		PartDefinition cube_r51 = Arm2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(289, 646).mirror().addBox(7.0F, -2.0F, 5.0F, 12.0F, 56.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.0F, -26.0F, 11.0F, -0.2934F, 0.0345F, -0.5112F));

		PartDefinition cube_r52 = Arm2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(688, 0).mirror().addBox(9.0F, 34.0F, 0.0F, 10.0F, 28.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-27.0F, 9.0F, -54.0F, 0.7055F, 0.2473F, -0.8918F));

		PartDefinition cube_r53 = Arm2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(226, 646).mirror().addBox(7.0F, -2.0F, -5.0F, 12.0F, 56.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.0F, -26.0F, -21.0F, 0.3158F, 0.0481F, -0.5527F));

		PartDefinition cube_r54 = Arm2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(661, 672).mirror().addBox(2.1978F, -31.9093F, -8.0102F, 7.0F, 46.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(24.0F, 1.0F, 5.0F, -0.1162F, 0.18F, -0.3251F));

		PartDefinition cube_r55 = Arm2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 0).addBox(9.0F, 20.0F, 1.0F, 10.0F, 34.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -14.0F, -49.0F, 0.6161F, 0.075F, -0.6359F));

		PartDefinition bone12 = Arm2.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(58.0F, 31.0F, 6.0F, 0.5637F, 0.3694F, -0.0582F));

		PartDefinition cube_r56 = bone12.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(284, 500).mirror().addBox(-4.0F, -3.0F, -10.0F, 28.0F, 60.0F, 30.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0F, 9.0F, 5.0F, -1.0565F, 0.7543F, -1.0865F));

		PartDefinition cube_r57 = bone12.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(219, 0).addBox(5.0F, -6.0F, 13.0F, 5.0F, 7.0F, 35.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.0F, 42.0F, -31.0F, -0.7903F, 0.681F, -0.9724F));

		PartDefinition cube_r58 = bone12.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(173, 142).addBox(5.0F, -6.0F, 13.0F, 5.0F, 7.0F, 35.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, 29.0F, -22.0F, -0.7903F, 0.681F, -0.9724F));

		PartDefinition cube_r59 = bone12.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(658, 347).mirror().addBox(5.0F, -3.0F, 13.0F, 5.0F, 11.0F, 38.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.0F, 24.0F, -21.0F, -0.427F, 0.6414F, -0.9491F));

		PartDefinition cube_r60 = bone12.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(658, 347).mirror().addBox(5.0F, -3.0F, 13.0F, 5.0F, 11.0F, 38.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 18.0F, -5.0F, -0.2274F, 0.7543F, -1.0865F));

		PartDefinition Hand2 = bone12.addOrReplaceChild("Hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(9.0F, 48.0F, -37.0F, -0.5089F, 0.0792F, 0.0311F));

		PartDefinition cube_r61 = Hand2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(569, 276).mirror().addBox(-9.0F, -8.0F, -16.0F, 21.0F, 36.0F, 34.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5428F, -0.0005F, -1.5374F));

		PartDefinition fingersleft = Hand2.addOrReplaceChild("fingersleft", CubeListBuilder.create(), PartPose.offset(-3.0F, -1.0F, -19.0F));

		PartDefinition Finger5 = fingersleft.addOrReplaceChild("Finger5", CubeListBuilder.create(), PartPose.offsetAndRotation(10.0F, 0.0F, -10.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r62 = Finger5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(683, 63).mirror().addBox(-1.6851F, -5.7358F, -4.162F, 11.0F, 33.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -1.5423F, -0.1749F, -1.5423F));

		PartDefinition bone13 = Finger5.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offset(1.0F, -10.0F, -28.0F));

		PartDefinition cube_r63 = bone13.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(227, 268).mirror().addBox(-20.6851F, 7.2642F, -2.162F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 27.0F, 6.0F, -1.4889F, -1.2211F, -1.6144F));

		PartDefinition cube_r64 = bone13.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(299, 116).mirror().addBox(-22.2087F, -1.323F, -2.6026F, 29.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -1.5342F, -0.6983F, -1.5609F));

		PartDefinition Finger6 = fingersleft.addOrReplaceChild("Finger6", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.0F, -10.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r65 = Finger6.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(683, 63).mirror().addBox(-1.6851F, -5.7358F, -5.162F, 11.0F, 33.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -1.5423F, -0.1749F, -1.5423F));

		PartDefinition bone14 = Finger6.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offset(1.0F, -10.0F, -28.0F));

		PartDefinition cube_r66 = bone14.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(227, 268).mirror().addBox(-20.6851F, 7.2642F, -2.162F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 27.0F, 6.0F, -1.4889F, -1.2211F, -1.6144F));

		PartDefinition cube_r67 = bone14.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(299, 116).mirror().addBox(-22.2087F, -1.323F, -2.6026F, 29.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -1.5342F, -0.6983F, -1.5609F));

		PartDefinition Finger7 = fingersleft.addOrReplaceChild("Finger7", CubeListBuilder.create(), PartPose.offsetAndRotation(18.0F, 0.0F, -6.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r68 = Finger7.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(682, 63).mirror().addBox(-4.6851F, -5.7358F, -4.162F, 12.0F, 33.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -4.0F, -1.5423F, -0.1749F, -1.5423F));

		PartDefinition bone15 = Finger7.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offset(1.0F, -7.0F, -28.0F));

		PartDefinition cube_r69 = bone15.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(422, 369).mirror().addBox(-20.6851F, 8.2642F, -0.162F, 6.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 29.0F, 5.0F, -1.4102F, -1.3945F, -1.6955F));

		PartDefinition cube_r70 = bone15.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(370, 116).mirror().addBox(-20.5502F, -3.7523F, -2.5295F, 25.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5328F, -0.7419F, -1.5631F));

		PartDefinition Finger8 = fingersleft.addOrReplaceChild("Finger8", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.0F, 0.0F, -6.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r71 = Finger8.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(682, 63).mirror().addBox(-4.6851F, -5.7358F, -4.162F, 12.0F, 33.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -4.0F, -1.5423F, -0.1749F, -1.5423F));

		PartDefinition bone16 = Finger8.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offset(1.0F, -7.0F, -28.0F));

		PartDefinition cube_r72 = bone16.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(422, 369).mirror().addBox(-20.6851F, 8.2642F, -0.162F, 6.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 29.0F, 5.0F, -1.4102F, -1.3945F, -1.6955F));

		PartDefinition cube_r73 = bone16.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(370, 116).mirror().addBox(-20.5502F, -3.7523F, -2.5295F, 25.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5328F, -0.7419F, -1.5631F));

		PartDefinition Backleg2 = Root.addOrReplaceChild("Backleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(11.6253F, -70.0F, -17.1631F, 0.0F, -0.3054F, -0.1745F));

		PartDefinition cube_r74 = Backleg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(155, 487).mirror().addBox(-9.0F, -12.0F, -20.0F, 27.0F, 47.0F, 37.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.0F, 3.0F, -0.2986F, -0.0651F, -0.2084F));

		PartDefinition bone17 = Backleg2.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offsetAndRotation(11.0F, 26.0F, 9.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r75 = bone17.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(643, 495).mirror().addBox(-5.0F, -5.0F, -8.0F, 18.0F, 42.0F, 25.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -7.0F, -14.0F, 0.7852F, 0.0F, 0.0F));

		PartDefinition bone18 = bone17.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 15.0F, 13.0F, 0.2169F, -0.0298F, 0.082F));

		PartDefinition cube_r76 = bone18.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(155, 415).mirror().addBox(-8.992F, -12.2402F, -5.148F, 16.0F, 42.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3032F, 0.0F, 0.0F));

		PartDefinition Foot2 = bone18.addOrReplaceChild("Foot2", CubeListBuilder.create().texOffs(656, 447).mirror().addBox(-6.0F, -2.0F, -10.0F, 21.0F, 13.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 23.0F, -11.0F, -0.0884F, -0.4299F, 0.1163F));

		PartDefinition bone19 = Foot2.addOrReplaceChild("bone19", CubeListBuilder.create().texOffs(682, 107).mirror().addBox(-3.0F, -5.0F, -19.0F, 7.0F, 10.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(12.0F, 0.0F, -10.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r77 = bone19.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(95, 575).mirror().addBox(-2.0F, 0.0F, -24.0F, 5.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone20 = Foot2.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(682, 107).mirror().addBox(-3.0F, -5.0F, -19.0F, 7.0F, 10.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 0.0F, -10.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r78 = bone20.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(95, 575).mirror().addBox(-2.0F, 0.0F, -24.0F, 5.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone21 = Foot2.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(682, 107).mirror().addBox(-3.0F, -5.0F, -19.0F, 7.0F, 10.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(4.0F, 1.0F, -10.0F));

		PartDefinition cube_r79 = bone21.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(95, 575).mirror().addBox(-2.0F, 0.0F, -24.0F, 5.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.animate(entity.walkAnimationState, GluttonyAnimation.WALK, ageInTicks);
		this.animate(entity.idleAnimationState, GluttonyAnimation.IDLE, ageInTicks);
	}

    @Override
    public @NotNull ModelPart root() {
        return this.Root;
    }

	@Override
	public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}