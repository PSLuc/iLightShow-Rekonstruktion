package com.philips.lighting.hue.sdk.wrapper.entertainment;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class Channel extends WrapperObject {
    public Channel() {
        create();
    }

    public native void create();

    public native void create(Location location, Animation animation, Animation animation2, Animation animation3, Animation animation4);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public final native Animation getAlpha();

    public final native Animation getB();

    public final native Animation getG();

    public final native Location getPosition();

    public final native Animation getR();

    public final native void setAlpha(Animation animation);

    public final native void setB(Animation animation);

    public final native void setG(Animation animation);

    public final native void setPosition(Location location);

    public final native void setR(Animation animation);

    public Channel(Location location, Animation animation, Animation animation2, Animation animation3, Animation animation4) {
        create(location, animation, animation2, animation3, animation4);
    }
}
