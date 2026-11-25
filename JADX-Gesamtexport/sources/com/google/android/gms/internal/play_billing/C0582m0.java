package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0582m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0582m0 f7970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0582m0 f7971c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellationException f7972a;

    static {
        if (E1.f7836d) {
            f7971c = null;
            f7970b = null;
        } else {
            f7971c = new C0582m0(null);
            f7970b = new C0582m0(null);
        }
    }

    public C0582m0(CancellationException cancellationException) {
        this.f7972a = cancellationException;
    }
}
