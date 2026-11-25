package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends AbstractC0605y0 {
    private static final o1 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        o1 o1Var = new o1();
        zzb = o1Var;
        AbstractC0605y0.n(o1.class, o1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0605y0
    public final Object h(int i) {
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new R0(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new o1();
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
