package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class P {
    public static /* synthetic */ boolean a(Unsafe unsafe, O o6, long j4, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(o6, j4, obj, obj2)) {
            if (unsafe.getObject(o6, j4) != obj) {
                return false;
            }
        }
        return true;
    }
}
