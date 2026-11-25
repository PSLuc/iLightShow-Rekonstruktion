package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends AbstractC0605y0 {
    private static final p1 zzb;
    private int zzd;
    private int zze;

    static {
        p1 p1Var = new p1();
        zzb = p1Var;
        AbstractC0605y0.n(p1.class, p1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0605y0
    public final Object h(int i) {
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new R0(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C0570h0.f7949g});
        }
        if (i3 == 3) {
            return new p1();
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
