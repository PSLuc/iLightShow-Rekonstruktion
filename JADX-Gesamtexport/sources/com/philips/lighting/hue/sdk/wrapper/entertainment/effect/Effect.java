package com.philips.lighting.hue.sdk.wrapper.entertainment.effect;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.entertainment.Color;
import com.philips.lighting.hue.sdk.wrapper.entertainment.Light;

/* JADX INFO: loaded from: classes.dex */
public class Effect extends WrapperObject {
    public Effect(String str, int i, EffectDelegate effectDelegate) {
        if (effectDelegate == null) {
            throw new IllegalArgumentException("Not valid delegate object!");
        }
        create(str, i, effectDelegate);
    }

    public native void create(String str, int i, EffectDelegate effectDelegate);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public final native void disable();

    public final native void enable();

    public final native void finish();

    public final native Color getColor(Light light);

    public native EffectDelegate getDelegate();

    public final native int getLayer();

    public final native String getName();

    public final native String getTypeName();

    public final native boolean isDisabled();

    public final native boolean isEnabled();

    public final native boolean isFinished();

    public final native void render();

    public final native void setLayer(int i);

    public final native void setName(String str);

    public Effect(WrapperObject.Scope scope) {
    }
}
