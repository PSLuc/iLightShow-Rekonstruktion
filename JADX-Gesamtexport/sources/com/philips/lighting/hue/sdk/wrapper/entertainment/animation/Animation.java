package com.philips.lighting.hue.sdk.wrapper.entertainment.animation;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;

/* JADX INFO: loaded from: classes.dex */
public class Animation extends WrapperObject {
    public static final double INFINITE = Double.MAX_VALUE;

    public Animation(AnimationDelegate animationDelegate) {
        if (animationDelegate == null) {
            throw new IllegalArgumentException("Not valid delegate object!");
        }
        create(animationDelegate);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final native Animation m8clone();

    public native void create(AnimationDelegate animationDelegate);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public native AnimationDelegate getDelegate();

    public final native double getLengthMs();

    public final native double getMarker();

    public final native double getPositionFromValue(double d6);

    public final native double getTotalLength();

    public final native String getTypeName();

    public final native double getValue();

    public final native boolean isEndless();

    public final native boolean isPlaying();

    public final native void rewind();

    public final native void setMarker(double d6);

    public final native void setValue(double d6);

    public final native double updateValue(double d6);

    public Animation(WrapperObject.Scope scope) {
    }
}
