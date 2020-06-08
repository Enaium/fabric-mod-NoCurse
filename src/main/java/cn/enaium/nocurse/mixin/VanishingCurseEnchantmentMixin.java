package cn.enaium.nocurse.mixin;

import net.minecraft.enchantment.VanishingCurseEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Project: NoCurse
 * -----------------------------------------------------------
 * Copyright © 2020 | Enaium | All rights reserved.
 */
@Mixin(VanishingCurseEnchantment.class)
public class VanishingCurseEnchantmentMixin {
    @Inject(at = @At("HEAD"), method = "isCursed", cancellable = true)
    void isCursed(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue(false);
    }
}