package com.philips.lighting.hue.sdk.wrapper.entertainment.animation;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.entertainment.TweenType;

/* JADX INFO: loaded from: classes.dex */
public class RandomAnimation extends Animation {
    public static final double INFINITE_LENGTH = Double.MAX_VALUE;

    public RandomAnimation() {
        super(WrapperObject.Scope.Internal);
        create();
    }

    public native void create();

    public native void create(double d6, double d7, double d8, double d9, TweenType tweenType, double d10);

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation, com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation
    public AnimationDelegate getDelegate() {
        return null;
    }

    public final native double getLength();

    public final native double getMaxInterval();

    public final native double getMaxValue();

    public final native double getMinInterval();

    public final native double getMinValue();

    public final native double getTweenType();

    public final native void setLength(double d6);

    public final native void setMaxInterval(double d6);

    public final native void setMaxValue(double d6);

    public final native void setMinInterval(double d6);

    public final native void setMinValue(double d6);

    public final native void setTweenType(TweenType tweenType);

    public RandomAnimation(double d6, double d7, double d8, double d9, TweenType tweenType, double d10) {
        super(WrapperObject.Scope.Internal);
        create(d6, d7, d8, d9, tweenType, d10);
    }

    public RandomAnimation(WrapperObject.Scope scope) {
        super(scope);
    }
}
