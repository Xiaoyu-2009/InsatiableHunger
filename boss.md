# Boss's Stats

## Base Stats
- **Stage 1**: HP 8, ATK 4
- **Stage 2**: HP 45, ATK 7
- **Stage 3**: HP 80, ATK 11
- **Stage 4**: HP 350, ATK 16
- **Stage 5**: HP 600, ATK 30

## Maximum Stats (When certain conditions are met)
- HP 750
- ATK 45
- Armor 10
- Toughness 3

# Growth Criteria

When killing mobs, stacks are accumulated, and upon reaching certain stack thresholds, growth advances to the next stage:

- **Small animals** (chicken, rabbit, etc.), fishes: +1 stack
- **Livestock** (cow, pig, sheep, etc.), spider, cave spider, squid, glow squid: +2 stacks
- **Horse, donkey, creeper, humanoid entities** (zombie, skeleton, piglin, etc.), hoglin, zoglin, vex: +3 stacks
- **Polar bear, panda, piglin brute, enderman, blaze, guardian, vindicator, pillager, witch**: +4 stacks
- **Iron golem, elder guardian, evoker, ravager, sniffer**: +5 stacks
- **Warden**: +50 stacks

## Growth Stacks

> **Note**: Stacks are not reset or reduced after growth and are retained, except in special cases when reaching the required stack amount.

- **Stage 1 → 2**: 30 stacks
- **Stage 2 → 3**: 100 stacks
- **Stage 3 → 4**: 200 stacks
- **Stage 4 → 5**: 600 stacks

# Stage Descriptions

## Stage 1
- A neutral entity; does not draw aggro from hostile entities.

## Stage 2
- Begins actively hunting hostile monsters. If its health is low, it stops hunting until it recovers.

## Stage 3
- If it fails to kill a wolf before reaching the required stack to grow into Stage 3, it will seek out and eat (kill) a wolf. It must eat a wolf in order to grow into Stage 3.

### Stage 3 Event
When Stage 3 is reached, an event begins that lasts for 1.5 Minecraft days (30 minutes). During this period:
- Gluttony can only operate within a 5,000-block radius of the player
- Dimensional teleportation is sealed even if it has consumed an Enderman
- Gluttony performs a preemptive attack on the player

During this period, if the player finds Gluttony and reduces its health to 8 or below:
- It becomes invincible, burrows underground, and escapes
- Afterward, its digestion time is temporarily increased by 50%
- It gains Weakness

## Stage 4
- Until reaching Stage 4, it attacks using only bites.

## Stage 5 (Final Form)
Upon reaching Stage 5:
- The message "Gluttony is pursuing you." is displayed in chat
- After applying the debuff 'Debuff: Prey of Gluttony', it begins tracking the player

### Final Form Abilities
- Immune to drowning damage + able to swim
- Detects sounds like a Warden
- Immune to fall damage
- Starts in egg form in a Deep Dark city (hatches when a player right-clicks)
- Can burrow underground and move through sculk (moves the way sculk blocks spread)
  - But after growing into its final form, it cannot use this ability during combat with players
- After eating (killing) a mob, digestion time is 8 seconds

# Skills

## Skills used by Gluttony before reaching its final form
- **Bite (basic attack)**: Bites the target, dealing damage.

## Skills used by Gluttony after reaching its final form
> **Note**: Basic skills excluding those additionally gained through absorption, absorbed skills will be described later

- **Front Claw Swipe (Slash)**: Swings its front claws to slash the target, dealing damage.
- **Single Front Paw Slam**: Has a larger motion and slower attack speed than Front Claw Swipe, but slams the ground with one front claw to deal greater damage.
- **Double Front Paw Slam**: Activated when there are 3 or more entities within a 5-block radius of Gluttony. Slams the ground with both front claws, dealing area-of-effect damage and inflicting a groggy/stunned state for 4 seconds.
- **Roar**: Activated when Gluttony's health falls to 50% or below. Gluttony roars in place for 5 seconds, dealing 8 area-of-effect damage per second to all entities within a 10-block radius. During this time, Gluttony becomes invulnerable, and the sculk on its back glows.

# When Gluttony eats a mob (kills the corresponding entity), Gluttony gains the following effects:

## The end
- **ender man**: Before growing into its final form, gains dimension shift (can teleport to Nether and End). After reaching complete form, adds a short-range teleportation pattern.
- **shulker**: Damage received from players -5%, damage received from non-player mobs -20%

## Passive or neutral entity (Overworld)
- **pig**: Eating cooldown reduced by 0.1 sec
- **sheep**: Damage received from the 2 attacks -10% (cooldown: 18 sec)
- **cow**: Add rush pattern
- **chicken**: thinking...
- **camel**: thinking...
- **horse**: Add jump → ground slam pattern
- **wolf**: Each time it kills skeleton-type entities (Skeleton, Wither Skeleton, Stray), max health +2 (max: 50)
- **iron golem**: armor+10,  toughness+3
- **frog**: Add entity consumption pattern (entities hit by the tongue are swallowed, take 4 damage per second for 3 seconds inside the mouth, then the Gluttony recovers 5 health and spits them back out)
- **goat**: rush pattern upgrade, targets hit receive knockback and are stunned for 2 seconds
- **rabbit**: thinking...
- **polar bear**: thinking...

## Undead, hostile entity (Overworld)
- **zombie**: Gains regeneration while out of combat
- **creeper**: Explosion added to Single Front Paw Slam and Double Front Paw Slam patterns
- **charged creeper**: If the player evades Front Claw Swipe (Slash) 5 times, the creeper surrounds itself with lightning, performs 3 rapid Front Claw Swipes (Slash), then becomes stunned for 5 seconds
- **spider**: Can wall-climb for 3 seconds (each additional spider consumed increases duration by +0.1 sec)
- **cave spider**: Certain patterns apply poison for 5 seconds, if it has already consumed a pufferfish, the applied poison level increases to 2 (duration reduced to 2 seconds)
- **husk**: Certain patterns apply hunger debuff
- **stray**: Certain patterns apply slowness debuff
- **slime**: Adds a pattern where it leaps to chase the player when they move to higher ground, upgrade jump → ground slam pattern

## Nether
- **strider**: thinking...
- **wither skeleton**: Certain patterns apply wither debuff
- **blaze**: Front Claw Swipe pattern applies fire for 2 seconds on hit, Gluttony gains passive fire resistance
- **piglin**: atk+0.1 (max:1)
- **hoglin**: atk+0.1 (max:1)
- **brute piglin**: atk+0.3 (max:3)

## Flying
- **bat**: thinking...
- **bee**: Adds a pattern that fires a stinger from the tip of its tail; targets hit receive poison debuff for 3 seconds

## Aquatic
- **cod, salmon, tropical fish**: Increased swimming speed
- **drowned**: Roar, Double Front Paw Slam patterns upgrade, lightning strikes the surrounding area during execution
- **pufferfish**: Certain patterns apply poison for 5 seconds; if it has already consumed a cave spider, the applied poison level increases to 2 (duration reduced to 2 seconds)
- **turtle**: Immunity to one instance of damage (cooldown: 1min)
- **guardian**: Adds a beam pattern that deals 6 damage per second and applies mining fatigue
- **elder guardian**: Mining fatigue beam pattern enhanced; damage per second increased to 8 and mining fatigue level increased to 2
- **axolotl**: Before growing into its complete form, when health drops to 10 or below (activates before event suppression success), becomes invincible for 5 seconds, clears all aggro, and restores health (cooldown: 5 min)

## Pillager
- **witch**: Magic damage received -40%
- **pillager**: thinking...
- **vindicator**: Double Front Paw Slam, Roar, Rush patterns upgrade. disables shields
- **ravager**: Rush pattern upgrade, destroys blocks it collides with while charging
- **evoker**: thinking...

## Hard mode trigger
- **warden**: Add sonic boom pattern, applies darkness debuff on certain patterns, stat increases (max hp +100, atk +5), tracks targets by smell when no sound is detected

 # drop item
- **Fist of Gluttony(weapon)**
- **Vessel of Spirit(curios accessory, slot: charm)**
## hard mode(Additional drops from the above rewards)
- **Egg of Suppressed Gluttony** (tamable Gluttony spawn egg)

# achivement
- **summon**: The beginning of Gluttony (description: To devour the world…)
- **event fail**: The Outbreak of Gluttony (description: You shall kneel before endless gluttony)
- **event success**: Suppression of Gluttony (description: Temperance)
- **kill**: The Virtue of Temperance (description: The end of an endless existence?)
- **kill(hard mode)**: Master of Temperance (description: The final fate of gluttony)
- **taming**: Lord of Gluttony (description: One who has earned Gluttony’s recognition)
