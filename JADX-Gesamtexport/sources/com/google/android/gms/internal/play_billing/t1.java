package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends AbstractC0605y0 {
    private static final t1 zzb;
    private int zzd;
    private C0 zze = Q0.f7903l;
    private String zzf = "";
    private boolean zzg;

    static {
        t1 t1Var = new t1();
        zzb = t1Var;
        AbstractC0605y0.n(t1.class, t1Var);
    }

    public static t1 o() {
        return zzb;
    }

    public static /* synthetic */ void p(t1 t1Var, boolean z5) {
        t1Var.zzd |= 2;
        t1Var.zzg = z5;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0605y0
    public final Object h(int i) {
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new R0(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", s1.class, "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new t1();
        }
        if (i3 == 4) {
            return new q1(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
