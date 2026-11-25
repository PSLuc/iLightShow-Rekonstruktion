package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0567g0 extends AbstractC0605y0 {
    private static final C0567g0 zzb;
    private int zzd;
    private String zze = "";

    static {
        C0567g0 c0567g0 = new C0567g0();
        zzb = c0567g0;
        AbstractC0605y0.n(C0567g0.class, c0567g0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0605y0
    public final Object h(int i) {
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new R0(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new C0567g0();
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
