package com.philips.lighting.hue.sdk.wrapper.entertainment.animation;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;

/* JADX INFO: loaded from: classes.dex */
public class TriggerableAnimation extends RepeatableAnimation {
    public TriggerableAnimation(TriggerableAnimationDelegate triggerableAnimationDelegate) {
        super(WrapperObject.Scope.Internal);
        if (triggerableAnimationDelegate == null) {
            throw new IllegalArgumentException("Not valid delegate object!");
        }
        create(0.0d, triggerableAnimationDelegate);
    }

    public native void create(double d6, TriggerableAnimationDelegate triggerableAnimationDelegate);

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.animation.RepeatableAnimation, com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation, com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.animation.RepeatableAnimation, com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation
    public native AnimationDelegate getDelegate();

    public final native double getOffset();

    public final native void trigger(String str);

    public final native void triggerOnLevel(String str);

    public TriggerableAnimation(double d6, TriggerableAnimationDelegate triggerableAnimationDelegate) {
        super(WrapperObject.Scope.Internal);
        if (triggerableAnimationDelegate != null) {
            create(d6, triggerableAnimationDelegate);
            return;
        }
        throw new IllegalArgumentException("Not valid delegate object!");
    }

    public TriggerableAnimation(WrapperObject.Scope scope) {
        super(scope);
    }
}
