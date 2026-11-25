package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0574i1 extends AbstractC0605y0 {
    private static final C0574i1 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private String zzf = "";
    private String zzh = "";

    static {
        C0574i1 c0574i1 = new C0574i1();
        zzb = c0574i1;
        AbstractC0605y0.n(C0574i1.class, c0574i1);
    }

    public static void o(C0574i1 c0574i1, int i) {
        c0574i1.zzg = p012c.k.h(i);
        c0574i1.zzd |= 4;
    }

    public static /* synthetic */ void p(C0574i1 c0574i1, int i) {
        c0574i1.zzd |= 1;
        c0574i1.zze = i;
    }

    public static C0571h1 q() {
        return (C0571h1) zzb.i();
    }

    public static /* synthetic */ void r(C0574i1 c0574i1, String str) {
        c0574i1.zzd |= 8;
        c0574i1.zzh = str;
    }

    public static /* synthetic */ void s(C0574i1 c0574i1, String str) {
        str.getClass();
        c0574i1.zzd |= 2;
        c0574i1.zzf = str;
    }

    public static /* synthetic */ void t(C0574i1 c0574i1, int i) {
        c0574i1.zzd |= 16;
        c0574i1.zzi = i;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0605y0
    public final Object h(int i) {
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new R0(zzb, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", C0570h0.f7946d, "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new C0574i1();
        }
        if (i3 == 4) {
            return new C0571h1(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
