package com.philips.lighting.hue.sdk.wrapper.entertainment.animation;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;

/* JADX INFO: loaded from: classes.dex */
public class RepeatableAnimation extends Animation {
    public RepeatableAnimation(AnimationDelegate animationDelegate) {
        super(WrapperObject.Scope.Internal);
        if (animationDelegate == null) {
            throw new IllegalArgumentException("Not valid delegate object!");
        }
        create(0.0d, animationDelegate);
    }

    public native void create(double d6, AnimationDelegate animationDelegate);

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation, com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation
    public native AnimationDelegate getDelegate();

    public final native double getRepeatCount();

    public final native void setRepeatCount(double d6);

    public RepeatableAnimation(double d6, AnimationDelegate animationDelegate) {
        super(WrapperObject.Scope.Internal);
        if (animationDelegate != null) {
            create(d6, animationDelegate);
            return;
        }
        throw new IllegalArgumentException("Not valid delegate object!");
    }

    public RepeatableAnimation(WrapperObject.Scope scope) {
        super(scope);
    }
}
