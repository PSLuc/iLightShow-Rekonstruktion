package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;
import p015c2.AbstractC0473d;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0577k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0473d f7954a;

    static {
        C0575j c0575j;
        try {
            SystemClock.elapsedRealtimeNanos();
            c0575j = new C0575j(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            c0575j = new C0575j(1);
        }
        f7954a = c0575j;
    }
}
