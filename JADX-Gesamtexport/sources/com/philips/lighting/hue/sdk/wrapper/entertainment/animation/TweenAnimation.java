package com.philips.lighting.hue.sdk.wrapper.entertainment.animation;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.entertainment.TweenType;

/* JADX INFO: loaded from: classes.dex */
public class TweenAnimation extends Animation {
    public TweenAnimation() {
        super(WrapperObject.Scope.Internal);
        create();
    }

    public native void create();

    public native void create(double d6, double d7, double d8, TweenType tweenType);

    public native void create(double d6, double d7, TweenType tweenType);

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation, com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public final native double getBeginValue();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation
    public AnimationDelegate getDelegate() {
        return null;
    }

    public final native double getEndValue();

    public final native double getTime();

    public final native TweenType getTweenType();

    public final native boolean hasBeginValue();

    public final native void setBeginValue(double d6);

    public final native void setEndValue(double d6);

    public final native void setHasBeginValue(boolean z5);

    public final native void setTime(double d6);

    public final native void setTweenType(TweenType tweenType);

    public TweenAnimation(double d6, double d7, TweenType tweenType) {
        super(WrapperObject.Scope.Internal);
        create(d6, d7, tweenType);
    }

    public TweenAnimation(double d6, double d7, double d8, TweenType tweenType) {
        super(WrapperObject.Scope.Internal);
        create(d6, d7, d8, tweenType);
    }

    public TweenAnimation(WrapperObject.Scope scope) {
        super(scope);
    }
}
