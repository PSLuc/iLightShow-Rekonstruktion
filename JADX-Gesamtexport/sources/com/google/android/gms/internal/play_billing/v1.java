package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends AbstractC0605y0 {
    private static final v1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private n1 zzg;
    private o1 zzh;

    static {
        v1 v1Var = new v1();
        zzb = v1Var;
        AbstractC0605y0.n(v1.class, v1Var);
    }

    public static /* synthetic */ void o(v1 v1Var, n1 n1Var) {
        n1Var.getClass();
        v1Var.zzg = n1Var;
        v1Var.zzd |= 1;
    }

    public static /* synthetic */ void p(v1 v1Var, y1 y1Var) {
        v1Var.zzf = y1Var;
        v1Var.zze = 8;
    }

    public static /* synthetic */ void q(v1 v1Var, z1 z1Var) {
        v1Var.zzf = z1Var;
        v1Var.zze = 4;
    }

    public static u1 r() {
        return (u1) zzb.i();
    }

    public static /* synthetic */ void s(v1 v1Var, C0562e1 c0562e1) {
        v1Var.zzf = c0562e1;
        v1Var.zze = 2;
    }

    public static /* synthetic */ void t(v1 v1Var, C0568g1 c0568g1) {
        v1Var.zzf = c0568g1;
        v1Var.zze = 3;
    }

    public static /* synthetic */ void u(v1 v1Var, j1 j1Var) {
        j1Var.getClass();
        v1Var.zzf = j1Var;
        v1Var.zze = 7;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0605y0
    public final Object h(int i) {
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new R0(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C0562e1.class, C0568g1.class, z1.class, l1.class, "zzh", j1.class, y1.class});
        }
        if (i3 == 3) {
            return new v1();
        }
        if (i3 == 4) {
            return new u1(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
