package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends AbstractC0605y0 {
    private static final j1 zzb;

    static {
        j1 j1Var = new j1();
        zzb = j1Var;
        AbstractC0605y0.n(j1.class, j1Var);
    }

    public static j1 o() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0605y0
    public final Object h(int i) {
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new R0(zzb, "\u0004\u0000", null);
        }
        if (i3 == 3) {
            return new j1();
        }
        if (i3 == 4) {
            return new C0555c0(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
