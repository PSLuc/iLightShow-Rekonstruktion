package com.philips.lighting.hue.sdk.wrapper.entertainment.effect;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public class LightSourceEffect extends ColorAnimationEffect {
    public LightSourceEffect() {
        super(WrapperObject.Scope.Internal);
        create();
    }

    public native void create();

    public native void create(String str, int i);

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.ColorAnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.AnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect, com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.ColorAnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.AnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect
    public EffectDelegate getDelegate() {
        return null;
    }

    public final native Animation getRadiusAnimation();

    public final native Animation getXAnimation();

    public final native Animation getYAnimation();

    public final native void setPositionAnimation(Animation animation, Animation animation2);

    public final native void setRadiusAnimation(Animation animation);

    public final native void setXAnimation(Animation animation);

    public final native void setYAnimation(Animation animation);

    public LightSourceEffect(String str, int i) {
        super(WrapperObject.Scope.Internal);
        create(str, i);
    }

    public LightSourceEffect(WrapperObject.Scope scope) {
        super(scope);
    }
}
