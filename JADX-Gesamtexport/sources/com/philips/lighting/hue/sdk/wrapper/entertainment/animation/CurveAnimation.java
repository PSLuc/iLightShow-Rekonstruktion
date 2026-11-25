package com.philips.lighting.hue.sdk.wrapper.entertainment.animation;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.entertainment.Curve;

/* JADX INFO: loaded from: classes.dex */
public class CurveAnimation extends RepeatableAnimation {
    public CurveAnimation() {
        super(WrapperObject.Scope.Internal);
        create();
    }

    public final native void append(Curve curve);

    public native void create();

    public native void create(double d6, Curve curve);

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.animation.RepeatableAnimation, com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation, com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public final native Curve getCurve();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.animation.RepeatableAnimation, com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation
    public AnimationDelegate getDelegate() {
        return null;
    }

    public final native void setCurve(Curve curve);

    public CurveAnimation(Curve curve) {
        super(WrapperObject.Scope.Internal);
        create(0.0d, curve);
    }

    public CurveAnimation(double d6, Curve curve) {
        super(WrapperObject.Scope.Internal);
        create(d6, curve);
    }

    public CurveAnimation(WrapperObject.Scope scope) {
        super(scope);
    }
}
