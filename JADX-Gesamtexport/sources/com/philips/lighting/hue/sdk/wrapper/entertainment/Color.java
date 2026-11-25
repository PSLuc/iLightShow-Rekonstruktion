package com.philips.lighting.hue.sdk.wrapper.entertainment;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;

/* JADX INFO: loaded from: classes.dex */
public final class Color extends WrapperObject {
    public Color() {
        create();
    }

    public final native void applyBrightness(double d6);

    public native void create();

    public native void create(double d6, double d7, double d8);

    public native void create(double d6, double d7, double d8, double d9);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public final native double getAlpha();

    public final native double getBlue();

    public final native double getCurrentBrightness();

    public final native double getGreen();

    public final native double getRed();

    public final native void setAlpha(double d6);

    public final native void setBlue(double d6);

    public final native void setGreen(double d6);

    public final native void setRed(double d6);

    public Color(double d6, double d7, double d8) {
        create(d6, d7, d8);
    }

    public Color(double d6, double d7, double d8, double d9) {
        create(d6, d7, d8, d9);
    }

    public Color(WrapperObject.Scope scope) {
    }
}
