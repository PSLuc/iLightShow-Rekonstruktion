package com.google.android.gms.internal.play_billing;

import B.AbstractC0013g0;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0573i0 {
    protected transient int zza;

    public abstract void a(C0590q0 c0590q0);

    public final byte[] b() {
        try {
            int iD = d();
            byte[] bArr = new byte[iD];
            C0590q0 c0590q0 = new C0590q0(bArr, iD);
            a(c0590q0);
            if (iD - c0590q0.f7988g == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e6) {
            throw new RuntimeException(AbstractC0013g0.i("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e6);
        }
    }

    public abstract int c(S0 s1);

    public abstract int d();
}
