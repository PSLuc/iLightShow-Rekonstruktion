package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0568g1 extends AbstractC0605y0 {
    private static final C0568g1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        C0568g1 c0568g1 = new C0568g1();
        zzb = c0568g1;
        AbstractC0605y0.n(C0568g1.class, c0568g1);
    }

    public static /* synthetic */ void o(C0568g1 c0568g1, t1 t1Var) {
        c0568g1.zzf = t1Var;
        c0568g1.zze = 4;
    }

    public static /* synthetic */ void p(C0568g1 c0568g1, B1 b6) {
        c0568g1.zzf = b6;
        c0568g1.zze = 3;
    }

    public static /* synthetic */ void q(C0568g1 c0568g1, int i) {
        c0568g1.zzg = i - 1;
        c0568g1.zzd |= 1;
    }

    public static C0565f1 r() {
        return (C0565f1) zzb.i();
    }

    public static void t(C0568g1 c0568g1, k1 k1Var) {
        c0568g1.zzh = k1Var.f7960h;
        c0568g1.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0605y0
    public final Object h(int i) {
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new R0(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", C0570h0.f7945c, p1.class, B1.class, t1.class, "zzh", C0570h0.f7947e});
        }
        if (i3 == 3) {
            return new C0568g1();
        }
        if (i3 == 4) {
            return new C0565f1(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }

    public final t1 s() {
        return this.zze == 4 ? (t1) this.zzf : t1.o();
    }
}
