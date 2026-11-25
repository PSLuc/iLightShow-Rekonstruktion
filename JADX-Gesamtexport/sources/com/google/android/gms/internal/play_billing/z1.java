package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class z1 extends AbstractC0605y0 {
    private static final z1 zzb;
    private int zzd;
    private int zze;

    static {
        z1 z1Var = new z1();
        zzb = z1Var;
        AbstractC0605y0.n(z1.class, z1Var);
    }

    public static z1 o() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0605y0
    public final Object h(int i) {
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new R0(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C0570h0.i});
        }
        if (i3 == 3) {
            return new z1();
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
