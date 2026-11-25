package com.philips.lighting.hue.sdk.wrapper.entertainment;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;

/* JADX INFO: loaded from: classes.dex */
public final class Location extends WrapperObject {
    public Location() {
        create();
    }

    public native void create();

    public native void create(double d6, double d7);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public final native double getX();

    public final native double getY();

    public final native void setX(double d6);

    public final native void setY(double d6);

    public Location(double d6, double d7) {
        create(d6, d7);
    }

    public Location(WrapperObject.Scope scope) {
    }
}
