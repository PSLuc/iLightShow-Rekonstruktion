package com.philips.lighting.hue.sdk.wrapper.entertainment.effect;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.entertainment.Color;
import com.philips.lighting.hue.sdk.wrapper.entertainment.Location;

/* JADX INFO: loaded from: classes.dex */
public class ExplosionEffect extends LightSourceEffect {
    public ExplosionEffect() {
        super(WrapperObject.Scope.Internal);
        create();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.LightSourceEffect
    public native void create();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.LightSourceEffect
    public native void create(String str, int i);

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.LightSourceEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.ColorAnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.AnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect, com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.LightSourceEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.ColorAnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.AnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect
    public EffectDelegate getDelegate() {
        return null;
    }

    public final native void prepareEffect(Color color, Location location, double d6, double d7, double d8, double d9);

    public ExplosionEffect(String str, int i) {
        super(WrapperObject.Scope.Internal);
        create(str, i);
    }

    public ExplosionEffect(WrapperObject.Scope scope) {
    }
}
