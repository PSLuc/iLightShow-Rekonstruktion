package com.philips.lighting.hue.sdk.wrapper.entertainment;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;

/* JADX INFO: loaded from: classes.dex */
public final class Light extends WrapperObject {
    public Light() {
        create();
    }

    public native void create();

    public native void create(String str, Location location);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public final native Color getColor();

    public final native String getId();

    public final native Location getLocation();

    public final native void setColor(Color color);

    public final native void setId(String str);

    public final native void setLocation(Location location);

    public Light(String str, Location location) {
        create(str, location);
    }

    public Light(WrapperObject.Scope scope) {
    }
}
