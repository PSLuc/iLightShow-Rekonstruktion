package com.nanjoran.ilightshow.Services;

import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S f8362c = new S();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WifiManager.MulticastLock f8363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8364b;

    public final void a() {
        WifiManager.MulticastLock multicastLock;
        int i = this.f8364b;
        if (i > 0) {
            this.f8364b = i - 1;
        }
        try {
            if (this.f8364b != 0 || (multicastLock = this.f8363a) == null) {
                return;
            }
            multicastLock.release();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }
}
