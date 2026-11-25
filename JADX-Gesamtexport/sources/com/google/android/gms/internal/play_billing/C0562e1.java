package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0562e1 extends AbstractC0605y0 {
    private static final C0562e1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C0574i1 zzh;
    private int zzi;

    static {
        C0562e1 c0562e1 = new C0562e1();
        zzb = c0562e1;
        AbstractC0605y0.n(C0562e1.class, c0562e1);
    }

    public static /* synthetic */ void o(C0562e1 c0562e1, C0574i1 c0574i1) {
        c0562e1.zzh = c0574i1;
        c0562e1.zzd |= 2;
    }

    public static /* synthetic */ void p(C0562e1 c0562e1, t1 t1Var) {
        c0562e1.zzf = t1Var;
        c0562e1.zze = 7;
    }

    public static /* synthetic */ void q(C0562e1 c0562e1, B1 b6) {
        c0562e1.zzf = b6;
        c0562e1.zze = 6;
    }

    public static /* synthetic */ void r(C0562e1 c0562e1, int i) {
        c0562e1.zzg = i - 1;
        c0562e1.zzd |= 1;
    }

    public static C0559d1 s() {
        return (C0559d1) zzb.i();
    }

    public static C0562e1 t(byte[] bArr, AbstractC0591r0 abstractC0591r0) throws zzfo {
        AbstractC0605y0 abstractC0605y0 = zzb;
        int length = bArr.length;
        if (length != 0) {
            AbstractC0605y0 abstractC0605y1 = (AbstractC0605y0) abstractC0605y0.h(4);
            try {
                S0 s0A = P0.f7899c.a(abstractC0605y1.getClass());
                C0580l0 c0580l0 = new C0580l0();
                abstractC0591r0.getClass();
                s0A.c(abstractC0605y1, bArr, 0, length, c0580l0);
                s0A.a(abstractC0605y1);
                abstractC0605y0 = abstractC0605y1;
            } catch (zzfo e6) {
                throw e6;
            } catch (zzhe e7) {
                throw new zzfo(e7.getMessage());
            } catch (IOException e8) {
                if (e8.getCause() instanceof zzfo) {
                    throw ((zzfo) e8.getCause());
                }
                throw new zzfo(e8.getMessage(), e8);
            } catch (IndexOutOfBoundsException unused) {
                throw new zzfo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (abstractC0605y0 == null || AbstractC0605y0.g(abstractC0605y0, true)) {
            return (C0562e1) abstractC0605y0;
        }
        throw new zzfo(new zzhe().getMessage());
    }

    public static void v(C0562e1 c0562e1, k1 k1Var) {
        c0562e1.zzi = k1Var.f7960h;
        c0562e1.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0605y0
    public final Object h(int i) {
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new R0(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C0570h0.f7945c, "zzh", p1.class, "zzi", C0570h0.f7947e, B1.class, t1.class});
        }
        if (i3 == 3) {
            return new C0562e1();
        }
        if (i3 == 4) {
            return new C0559d1(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }

    public final t1 u() {
        return this.zze == 7 ? (t1) this.zzf : t1.o();
    }
}
