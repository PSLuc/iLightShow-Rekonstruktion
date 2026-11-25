package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class y1 extends AbstractC0605y0 {
    private static final y1 zzb;
    private int zzd;
    private C0574i1 zze;
    private long zzf;

    static {
        y1 y1Var = new y1();
        zzb = y1Var;
        AbstractC0605y0.n(y1.class, y1Var);
    }

    public static x1 o() {
        return (x1) zzb.i();
    }

    public static /* synthetic */ void p(y1 y1Var, C0574i1 c0574i1) {
        y1Var.zze = c0574i1;
        y1Var.zzd |= 1;
    }

    public static /* synthetic */ void q(y1 y1Var, long j4) {
        y1Var.zzd |= 2;
        y1Var.zzf = j4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0605y0
    public final Object h(int i) {
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new R0(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new y1();
        }
        if (i3 == 4) {
            return new x1(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
