package net.satisfy.camping.platform;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class PlatformHelper {
    @ExpectPlatform
    public static void addRegenEffect(Player player, MobEffectInstance effectInstance) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void setGrilled(ItemStack itemStack) {
        throw new AssertionError();
    }
}