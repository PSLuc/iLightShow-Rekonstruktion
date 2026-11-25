package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0558d0 extends AbstractC0605y0 {
    private static final C0558d0 zzb;
    private int zzd;
    private C0567g0 zze;
    private C0567g0 zzf;
    private int zzg;

    static {
        C0558d0 c0558d0 = new C0558d0();
        zzb = c0558d0;
        AbstractC0605y0.n(C0558d0.class, c0558d0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0605y0
    public final Object h(int i) {
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new R0(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", C0570h0.f7944b});
        }
        if (i3 == 3) {
            return new C0558d0();
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
