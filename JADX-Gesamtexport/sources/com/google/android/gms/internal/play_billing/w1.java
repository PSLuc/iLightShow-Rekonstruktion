package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class w1 extends AbstractC0605y0 {
    private static final w1 zzb;
    private int zzd;
    private int zzf;
    private C0 zze = Q0.f7903l;
    private String zzg = "";

    static {
        w1 w1Var = new w1();
        zzb = w1Var;
        AbstractC0605y0.n(w1.class, w1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0605y0
    public final Object h(int i) {
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new R0(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new w1();
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
