package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzaf extends Exception {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final W2.a f7804h;

    public zzaf(W2.a aVar) {
        if (!((aVar.i == 0 || aVar.f5570j == null) ? false : true)) {
            throw new IllegalArgumentException("ResolvableConnectionException can only be created with a connection result containing a resolution.");
        }
        this.f7804h = aVar;
    }
}
