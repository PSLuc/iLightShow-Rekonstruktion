package com.philips.lighting.hue.sdk.wrapper.entertainment.effect;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.entertainment.Color;
import com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public class ColorAnimationEffect extends AnimationEffect {
    public ColorAnimationEffect(ColorAnimationEffectDelegate colorAnimationEffectDelegate) {
        super(WrapperObject.Scope.Internal);
        if (colorAnimationEffectDelegate == null) {
            throw new IllegalArgumentException("Not valid delegate object!");
        }
        create("", 0, false, colorAnimationEffectDelegate);
    }

    public native void create(String str, int i, boolean z5, ColorAnimationEffectDelegate colorAnimationEffectDelegate);

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.AnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect, com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public final native Animation getBlueAnimation();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.AnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect
    public native EffectDelegate getDelegate();

    public final native Animation getGreenAnimation();

    public final native Animation getIntensityAnimation();

    public final native Animation getOpacityAnimation();

    public final native Animation getRedAnimation();

    public final native boolean hasOpacityBoundToIntensity();

    public final native void setBlueAnimaiton(Animation animation);

    public final native void setColorAnimation(Animation animation, Animation animation2, Animation animation3);

    public final native void setFixedColor(Color color);

    public final native void setFixedOpacity(double d6);

    public final native void setGreenAnimation(Animation animation);

    public final native void setIntensityAnimation(Animation animation);

    public final native void setOpacityAnimation(Animation animation);

    public final native void setOpacityBoundToIntensity(boolean z5);

    public final native void setRedAnimation(Animation animation);

    public ColorAnimationEffect(String str, int i, boolean z5, ColorAnimationEffectDelegate colorAnimationEffectDelegate) {
        super(WrapperObject.Scope.Internal);
        if (colorAnimationEffectDelegate != null) {
            create(str, 0, z5, colorAnimationEffectDelegate);
            return;
        }
        throw new IllegalArgumentException("Not valid delegate object!");
    }

    public ColorAnimationEffect(WrapperObject.Scope scope) {
        super(scope);
    }
}
