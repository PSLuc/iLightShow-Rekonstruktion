package com.philips.lighting.hue.sdk.wrapper.entertainment.effect;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.entertainment.Area;
import com.philips.lighting.hue.sdk.wrapper.entertainment.Color;

/* JADX INFO: loaded from: classes.dex */
public class SequenceEffect extends Effect {

    public enum Mode {
        All,
        Round,
        Back,
        Right,
        Last
    }

    public SequenceEffect() {
        super(WrapperObject.Scope.Internal);
        create("", 0);
    }

    public final native boolean addArea(Area area);

    public final native void addColor(Color color);

    public native void create(String str, int i);

    public final native void decreaseBrightness(double d6);

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect, com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public final native double getBrightness();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect
    public EffectDelegate getDelegate() {
        return null;
    }

    public final native Mode getMode();

    public final native void inceaseBrightness(double d6);

    public final native void setBrightness(double d6);

    public final native void setMode(Mode mode);

    public final native void step();

    public SequenceEffect(String str, int i) {
        super(WrapperObject.Scope.Internal);
        create(str, i);
    }

    public SequenceEffect(WrapperObject.Scope scope) {
        super(scope);
    }
}
