package com.philips.lighting.hue.sdk.wrapper.entertainment.effect;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;

/* JADX INFO: loaded from: classes.dex */
public class LightIteratorEffect extends ColorAnimationEffect {

    public enum Mode {
        Single,
        Cycle,
        Bounce
    }

    public enum Order {
        LeftRight,
        FrontBack,
        Clockwise,
        InOut,
        Random,
        Group
    }

    public LightIteratorEffect() {
        super(WrapperObject.Scope.Internal);
        create();
    }

    public native void create();

    public native void create2(String str, int i, Order order, Mode mode, double d6, boolean z5, boolean z6);

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.ColorAnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.AnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect, com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.ColorAnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.AnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect
    public EffectDelegate getDelegate() {
        return null;
    }

    public final native Mode getMode();

    public final native double getOffset();

    public final native Order getOrder();

    public final native boolean hasInvertedIterationOrder();

    public final native boolean hasPreamble();

    public final native void setInvertedIterationOrder(boolean z5);

    public final native void setMode(Mode mode);

    public final native void setOffset(double d6);

    public final native void setOrder(Order order);

    public final native void setPreamble(boolean z5);

    public LightIteratorEffect(String str, int i, Order order, Mode mode, double d6, boolean z5, boolean z6) {
        super(WrapperObject.Scope.Internal);
        create2(str, i, order, mode, d6, z5, z6);
    }

    public LightIteratorEffect(WrapperObject.Scope scope) {
        super(scope);
    }
}
