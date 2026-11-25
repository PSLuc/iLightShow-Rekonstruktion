package com.google.android.gms.internal.play_billing;

import android.os.Build;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends AbstractC0605y0 {
    private static final n1 zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        n1 n1Var = new n1();
        zzb = n1Var;
        AbstractC0605y0.n(n1.class, n1Var);
    }

    public static m1 A() {
        return (m1) zzb.i();
    }

    public static /* synthetic */ void B(n1 n1Var, int i) {
        n1Var.zzd |= 128;
        n1Var.zzl = i;
    }

    public static /* synthetic */ void C(n1 n1Var, int i) {
        n1Var.zzd |= HueLog.LogComponent.STREAMDTLS;
        n1Var.zzm = i;
    }

    public static /* synthetic */ void D(n1 n1Var, int i) {
        n1Var.zzd |= 8;
        n1Var.zzh = i;
    }

    public static /* synthetic */ void o(n1 n1Var, long j4) {
        n1Var.zzd |= 16;
        n1Var.zzi = j4;
    }

    public static /* synthetic */ void p(n1 n1Var, long j4) {
        n1Var.zzd |= 32;
        n1Var.zzj = j4;
    }

    public static /* synthetic */ void q(n1 n1Var) {
        n1Var.zzd |= HueLog.LogComponent.APPCORE;
        n1Var.zzn = 828052417L;
    }

    public static /* synthetic */ void r(n1 n1Var, String str) {
        str.getClass();
        n1Var.zzd |= 4;
        n1Var.zzg = str;
    }

    public static /* synthetic */ void s(n1 n1Var) {
        String str = Build.BRAND;
        str.getClass();
        n1Var.zzd |= 1024;
        n1Var.zzo = str;
    }

    public static /* synthetic */ void t(n1 n1Var) {
        String str = Build.FINGERPRINT;
        str.getClass();
        n1Var.zzd |= 8192;
        n1Var.zzr = str;
    }

    public static /* synthetic */ void u(n1 n1Var) {
        String str = Build.MANUFACTURER;
        str.getClass();
        n1Var.zzd |= 4096;
        n1Var.zzq = str;
    }

    public static /* synthetic */ void v(n1 n1Var) {
        String str = Build.MODEL;
        str.getClass();
        n1Var.zzd |= 2048;
        n1Var.zzp = str;
    }

    public static /* synthetic */ void w(n1 n1Var, int i) {
        n1Var.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        n1Var.zzs = i;
    }

    public static /* synthetic */ void x(n1 n1Var, boolean z5) {
        n1Var.zzd |= 64;
        n1Var.zzk = z5;
    }

    public static /* synthetic */ void y(n1 n1Var) {
        n1Var.zzd |= 1;
        n1Var.zze = "8.1.0";
    }

    public static /* synthetic */ void z(n1 n1Var, String str) {
        n1Var.zzd |= 2;
        n1Var.zzf = str;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0605y0
    public final Object h(int i) {
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new R0(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i3 == 3) {
            return new n1();
        }
        if (i3 == 4) {
            return new m1(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
