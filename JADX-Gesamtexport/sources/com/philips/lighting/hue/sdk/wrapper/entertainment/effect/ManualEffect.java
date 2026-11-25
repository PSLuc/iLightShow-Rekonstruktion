package com.philips.lighting.hue.sdk.wrapper.entertainment.effect;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.entertainment.Color;

/* JADX INFO: loaded from: classes.dex */
public class ManualEffect extends Effect {
    public ManualEffect() {
        super(WrapperObject.Scope.Internal);
        create("", 0);
    }

    public native void create(String str, int i);

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect, com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect
    public EffectDelegate getDelegate() {
        return null;
    }

    public final native void setLightToColor(String str, Color color);

    public ManualEffect(String str, int i) {
        super(WrapperObject.Scope.Internal);
        create(str, i);
    }

    public ManualEffect(WrapperObject.Scope scope) {
        super(scope);
    }
}
