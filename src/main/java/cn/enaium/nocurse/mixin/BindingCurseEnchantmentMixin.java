package cn.enaium.nocurse.mixin;

import net.minecraft.enchantment.BindingCurseEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Project: RemoveCurse
 * -----------------------------------------------------------
 * Copyright © 2020 | Enaium | All rights reserved.
 */
@Mixin(BindingCurseEnchantment.class)
public class BindingCurseEnchantmentMixin {
    @Inject(at = @At("HEAD"), method = "isCursed", cancellable = true)
    void isCursed(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue(false);
    }
}