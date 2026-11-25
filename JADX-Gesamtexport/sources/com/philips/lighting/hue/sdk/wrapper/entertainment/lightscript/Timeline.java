package com.philips.lighting.hue.sdk.wrapper.entertainment.lightscript;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;

/* JADX INFO: loaded from: classes.dex */
public final class Timeline extends WrapperObject {
    public Timeline(int i) {
        create(i);
    }

    public native void create(int i);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public final native boolean equals(Object obj);

    public final native long getLength();

    public final native boolean isRunning();

    public final native long now();

    public final native void pause();

    public final native void resume();

    public final native void setLength(long j4);

    public final native void setPosition(long j4);

    public final native void start();

    public final native void stop();

    public Timeline(WrapperObject.Scope scope) {
    }
}
