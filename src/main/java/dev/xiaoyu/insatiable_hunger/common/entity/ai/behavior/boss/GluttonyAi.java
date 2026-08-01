package dev.xiaoyu.insatiable_hunger.common.entity.ai.behavior.boss;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import dev.xiaoyu.insatiable_hunger.common.entity.boss.Gluttony;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.Brain;
import net.minecraft.world.entity.ai.behavior.BehaviorControl;
import net.minecraft.world.entity.ai.behavior.DoNothing;
import net.minecraft.world.entity.ai.behavior.LookAtTargetSink;
import net.minecraft.world.entity.ai.behavior.MeleeAttack;
import net.minecraft.world.entity.ai.behavior.MoveToTargetSink;
import net.minecraft.world.entity.ai.behavior.RandomStroll;
import net.minecraft.world.entity.ai.behavior.RunOne;
import net.minecraft.world.entity.ai.behavior.SetEntityLookTarget;
import net.minecraft.world.entity.ai.behavior.SetWalkTargetFromAttackTargetIfTargetOutOfReach;
import net.minecraft.world.entity.ai.behavior.StopAttackingIfTargetInvalid;
import net.minecraft.world.entity.ai.behavior.Swim;
import net.minecraft.world.entity.ai.behavior.declarative.BehaviorBuilder;
import net.minecraft.world.entity.ai.memory.MemoryModuleType;
import net.minecraft.world.entity.ai.sensing.Sensor;
import net.minecraft.world.entity.ai.sensing.SensorType;
import net.minecraft.world.entity.schedule.Activity;
import net.minecraft.world.entity.player.Player;

import java.util.List;

public class GluttonyAi {
    private static final float SPEED_MULTIPLIER_WHEN_IDLING = 0.5F;
    private static final float SPEED_MULTIPLIER_WHEN_FIGHTING = 1.0F;
    private static final int ATTACK_COOLDOWN = 10;

    private static final List<SensorType<? extends Sensor<? super Gluttony>>> SENSOR_TYPES = List.of(
            SensorType.NEAREST_PLAYERS,
            SensorType.NEAREST_LIVING_ENTITIES,
            SensorType.HURT_BY
    );

    private static final List<MemoryModuleType<?>> MEMORY_TYPES = List.of(
            MemoryModuleType.NEAREST_LIVING_ENTITIES,
            MemoryModuleType.NEAREST_VISIBLE_LIVING_ENTITIES,
            MemoryModuleType.NEAREST_VISIBLE_PLAYER,
            MemoryModuleType.NEAREST_VISIBLE_ATTACKABLE_PLAYER,
            MemoryModuleType.LOOK_TARGET,
            MemoryModuleType.WALK_TARGET,
            MemoryModuleType.CANT_REACH_WALK_TARGET_SINCE,
            MemoryModuleType.PATH,
            MemoryModuleType.ATTACK_TARGET,
            MemoryModuleType.ATTACK_COOLING_DOWN,
            MemoryModuleType.NEAREST_ATTACKABLE,
            MemoryModuleType.HURT_BY,
            MemoryModuleType.HURT_BY_ENTITY
    );

    private static final BehaviorControl<Gluttony> SET_ATTACK_TARGET_WHEN_HURT = BehaviorBuilder.create((gluttony) ->
            gluttony.group(gluttony.absent(MemoryModuleType.ATTACK_TARGET), gluttony.present(MemoryModuleType.HURT_BY_ENTITY))
                    .apply(gluttony, (attackTarget, hurtByEntity) -> (level, owner, gameTime) -> {
                        attackTarget.set(gluttony.get(hurtByEntity));
                        return true;
                    })
    );

    private static final BehaviorControl<Gluttony> SET_ATTACK_TARGET_FROM_NEAREST = BehaviorBuilder.create((gluttony) ->
            gluttony.group(gluttony.absent(MemoryModuleType.ATTACK_TARGET), gluttony.present(MemoryModuleType.NEAREST_VISIBLE_ATTACKABLE_PLAYER))
                    .apply(gluttony, (attackTarget, nearestPlayer) -> (level, owner, gameTime) -> {
                        attackTarget.set(gluttony.get(nearestPlayer));
                        return true;
                    })
    );

    public static void updateActivity(Gluttony gluttony) {
        gluttony.getBrain().setActiveActivityToFirstValid(ImmutableList.of(
                Activity.FIGHT,
                Activity.IDLE
        ));
    }

    public static Brain<?> makeBrain(Gluttony gluttony, Dynamic<?> dynamic) {
        Brain.Provider<Gluttony> provider = Brain.provider(MEMORY_TYPES, SENSOR_TYPES);
        Brain<Gluttony> brain = provider.makeBrain(dynamic);
        initCoreActivity(brain);
        initIdleActivity(brain);
        initFightActivity(gluttony, brain);
        brain.setCoreActivities(ImmutableSet.of(Activity.CORE));
        brain.setDefaultActivity(Activity.IDLE);
        brain.useDefaultActivity();
        return brain;
    }

    private static void initCoreActivity(Brain<Gluttony> brain) {
        brain.addActivity(Activity.CORE, 0, ImmutableList.of(
                new Swim(0.8F),
                SET_ATTACK_TARGET_WHEN_HURT,
                SET_ATTACK_TARGET_FROM_NEAREST,
                new LookAtTargetSink(45, 90),
                new MoveToTargetSink()
        ));
    }

    private static void initIdleActivity(Brain<Gluttony> brain) {
        brain.addActivity(Activity.IDLE, 10, ImmutableList.of(
                SetEntityLookTarget.create(GluttonyAi::isPlayerTarget, 16.0F),
                new RunOne<>(ImmutableList.of(
                        Pair.of(RandomStroll.stroll(SPEED_MULTIPLIER_WHEN_IDLING), 2),
                        Pair.of(new DoNothing(30, 60), 1)
                ))
        ));
    }

    private static void initFightActivity(Gluttony gluttony, Brain<Gluttony> brain) {
        brain.addActivityAndRemoveMemoryWhenStopped(Activity.FIGHT, 10, ImmutableList.of(
                StopAttackingIfTargetInvalid.create((target) -> !gluttony.canAttack(target), GluttonyAi::onTargetInvalid, false),
                SetEntityLookTarget.create((target) -> isTarget(gluttony, target), 16.0F),
                SetWalkTargetFromAttackTargetIfTargetOutOfReach.create(SPEED_MULTIPLIER_WHEN_FIGHTING),
                MeleeAttack.create(ATTACK_COOLDOWN)
        ), MemoryModuleType.ATTACK_TARGET);
    }

    private static void onTargetInvalid(Gluttony gluttony, LivingEntity target) {
        gluttony.getBrain().eraseMemory(MemoryModuleType.ATTACK_TARGET);
    }

    private static boolean isTarget(Gluttony gluttony, LivingEntity entity) {
        return gluttony.getBrain().getMemory(MemoryModuleType.ATTACK_TARGET).filter((target) -> target == entity).isPresent();
    }

    private static boolean isPlayerTarget(LivingEntity entity) {
        return entity instanceof Player;
    }
}