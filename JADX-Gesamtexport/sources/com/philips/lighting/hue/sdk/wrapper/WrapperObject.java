package com.philips.lighting.hue.sdk.wrapper;

/* JADX INFO: loaded from: classes.dex */
public abstract class WrapperObject extends SDKSerializable {
    private long reference = 0;

    public enum Scope {
        Internal
    }

    public abstract void delete();

    public void finalize() {
        delete();
    }

    public long getReference() {
        return this.reference;
    }

    public void setReference(long j4) {
        this.reference = j4;
    }
}
