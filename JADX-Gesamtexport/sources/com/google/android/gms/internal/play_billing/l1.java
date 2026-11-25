package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends AbstractC0605y0 {
    private static final l1 zzb;
    private int zzd;
    private int zzf;
    private C0574i1 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private B0 zzg = C0607z0.f8022l;
    private C0 zzh = Q0.f7903l;

    static {
        l1 l1Var = new l1();
        zzb = l1Var;
        AbstractC0605y0.n(l1.class, l1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0605y0
    public final Object h(int i) {
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new R0(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", C0570h0.f7948f, "zzg", C0570h0.f7947e, "zzh", w1.class, "zzi", "zzj", "zzk"});
        }
        if (i3 == 3) {
            return new l1();
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
