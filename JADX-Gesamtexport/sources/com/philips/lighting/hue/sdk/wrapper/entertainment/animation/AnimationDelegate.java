package com.philips.lighting.hue.sdk.wrapper.entertainment.animation;

/* JADX INFO: loaded from: classes.dex */
public interface AnimationDelegate {
    AnimationDelegate clone();

    double getLengthMs(Animation animation);

    String getTypeName();

    double updateValue(Animation animation, double d6);
}
