package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class s1 extends AbstractC0605y0 {
    private static final s1 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        s1 s1Var = new s1();
        zzb = s1Var;
        AbstractC0605y0.n(s1.class, s1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0605y0
    public final Object h(int i) {
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new R0(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C0570h0.f7950h, "zzf"});
        }
        if (i3 == 3) {
            return new s1();
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
