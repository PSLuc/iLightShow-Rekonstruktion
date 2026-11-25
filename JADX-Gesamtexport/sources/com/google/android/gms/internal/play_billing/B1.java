package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class B1 extends AbstractC0605y0 {
    private static final B1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        B1 b6 = new B1();
        zzb = b6;
        AbstractC0605y0.n(B1.class, b6);
    }

    public static /* synthetic */ void o(B1 b6) {
        b6.zzd |= 2;
        b6.zzf = true;
    }

    public static A1 p() {
        return (A1) zzb.i();
    }

    public static /* synthetic */ void q(B1 b6, boolean z5) {
        b6.zzd |= 8;
        b6.zzh = z5;
    }

    public static /* synthetic */ void r(B1 b6, int i) {
        b6.zzd |= 16;
        b6.zzi = i;
    }

    public static /* synthetic */ void s(B1 b6, long j4) {
        b6.zzd |= 4;
        b6.zzg = j4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0605y0
    public final Object h(int i) {
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new R0(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new B1();
        }
        if (i3 == 4) {
            return new A1(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
