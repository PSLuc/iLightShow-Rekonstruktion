package com.philips.lighting.hue.sdk.wrapper.entertainment;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;

/* JADX INFO: loaded from: classes.dex */
public final class Message extends WrapperObject {
    public static int ALL_MESSAGES = -1;

    public enum Id {
        STREAMING_DISCONNECTED,
        LIGHTS_UPDATED,
        GROUPS_UPDATED,
        RENDERED,
        TIMELINE_STARTED,
        TIMELINE_PAUSED,
        TIMELINE_RESUMED,
        TIMELINE_STOPPED,
        TIMELINE_ENDED
    }

    public enum Type {
        INFO,
        USER,
        RENDER,
        TIMELINE;

        public final int flag = 1 << ordinal();

        Type() {
        }
    }

    public Message() {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public final native String getBridgeId();

    public final native Object getData();

    public final native Id getId();

    public final native String getTag();

    public final native Type getType();

    public final native String getUserMessage();

    public Message(WrapperObject.Scope scope) {
    }
}
