package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E f7822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E f7823d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RuntimeException f7825b;

    static {
        if (O.f7893f) {
            f7823d = null;
            f7822c = null;
        } else {
            f7823d = new E(false, null);
            f7822c = new E(true, null);
        }
    }

    public E(boolean z5, RuntimeException runtimeException) {
        this.f7824a = z5;
        this.f7825b = runtimeException;
    }
}
