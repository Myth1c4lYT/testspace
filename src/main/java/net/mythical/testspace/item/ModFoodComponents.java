package net.mythical.testspace.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static FoodComponent TURNIP = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200, 4), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 4), 0.5f).build();


}
