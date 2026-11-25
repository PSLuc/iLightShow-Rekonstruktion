package com.philips.lighting.hue.sdk.wrapper;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class SessionObject extends SDKSerializable {
    private long sessionKey;

    public SessionObject() {
        this.sessionKey = UUID.randomUUID().getMostSignificantBits();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass();
    }

    public long getSessionKey() {
        return this.sessionKey;
    }

    public int hashCode() {
        return 1;
    }

    public void setSessionKey(long j4) {
        this.sessionKey = j4;
    }

    public abstract void syncNative();

    public SessionObject(long j4) {
        this.sessionKey = j4;
    }
}
