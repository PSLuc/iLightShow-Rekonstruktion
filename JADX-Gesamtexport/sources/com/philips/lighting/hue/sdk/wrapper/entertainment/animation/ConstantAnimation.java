package com.philips.lighting.hue.sdk.wrapper.entertainment.animation;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;

/* JADX INFO: loaded from: classes.dex */
public class ConstantAnimation extends Animation {
    public ConstantAnimation(double d6, double d7) {
        super(WrapperObject.Scope.Internal);
        create(d6, d7);
    }

    public native void create(double d6);

    public native void create(double d6, double d7);

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation, com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation
    public AnimationDelegate getDelegate() {
        return null;
    }

    public final native double getLength();

    public ConstantAnimation(double d6) {
        super(WrapperObject.Scope.Internal);
        create(d6);
    }

    public ConstantAnimation(WrapperObject.Scope scope) {
        super(scope);
    }
}
