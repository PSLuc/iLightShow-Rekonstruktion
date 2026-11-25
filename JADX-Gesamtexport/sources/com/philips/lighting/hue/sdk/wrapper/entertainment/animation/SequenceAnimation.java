package com.philips.lighting.hue.sdk.wrapper.entertainment.animation;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SequenceAnimation extends TriggerableAnimation {
    public static final double DEFAULT_REPEAT_TIMES = 0.0d;

    public SequenceAnimation() {
        super(WrapperObject.Scope.Internal);
        create(0.0d);
    }

    public final native void append(Animation animation, String str);

    public native void create(double d6);

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.animation.TriggerableAnimation, com.philips.lighting.hue.sdk.wrapper.entertainment.animation.RepeatableAnimation, com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation, com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public final native int getAnimationCount();

    public final native List<Animation> getAnimations();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.animation.TriggerableAnimation, com.philips.lighting.hue.sdk.wrapper.entertainment.animation.RepeatableAnimation, com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation
    public AnimationDelegate getDelegate() {
        return null;
    }

    public final native void setAnimations(List<Animation> list);

    public SequenceAnimation(double d6) {
        super(WrapperObject.Scope.Internal);
        create(d6);
    }

    public SequenceAnimation(WrapperObject.Scope scope) {
        super(scope);
    }
}
