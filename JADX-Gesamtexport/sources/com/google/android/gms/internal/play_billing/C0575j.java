package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;
import p015c2.AbstractC0473d;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0575j extends AbstractC0473d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7952j;

    public /* synthetic */ C0575j(int i) {
        this.f7952j = i;
    }

    @Override // p015c2.AbstractC0473d
    public final long Y() {
        switch (this.f7952j) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
