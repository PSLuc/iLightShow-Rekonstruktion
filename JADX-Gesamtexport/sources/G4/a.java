package G4;

import B.AbstractC0013g0;
import B.C0018j;
import E4.k;
import F1.B;
import F1.C0085b;
import F1.I;
import G1.g;
import G1.i;
import G1.p;
import H4.e;
import J2.b;
import L.A1;
import L.AbstractC0151k;
import L.J0;
import M4.l;
import M4.s;
import N.C0208d;
import N.C0222k;
import N.C0227m0;
import N.C0230o;
import N.C0235q0;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import N3.C0253a;
import N3.C0254a0;
import N3.C0257c;
import N3.C0275l;
import N3.C0282o0;
import N3.P;
import N3.P0;
import N3.Q0;
import N3.T0;
import S1.EnumC0363z;
import S1.V;
import Z.o;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c5.j0;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.google.android.gms.internal.play_billing.AbstractC0586o0;
import com.google.android.gms.internal.play_billing.AbstractC0605y0;
import com.google.android.gms.internal.play_billing.C0;
import com.google.android.gms.internal.play_billing.C0580l0;
import com.google.android.gms.internal.play_billing.C0607z0;
import com.google.android.gms.internal.play_billing.M0;
import com.google.android.gms.internal.play_billing.S0;
import com.google.android.gms.internal.play_billing.V0;
import com.google.android.gms.internal.play_billing.zzfo;
import com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType;
import defpackage.d;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import p030f0.f;
import p035g0.O;
import p058l0.C0822e;
import p058l0.C0823f;
import p058l0.G;
import p081p0.c;
import p084p4.h;
import p084p4.j;
import p084p4.x;
import p089q4.m;
import p089q4.u;
import p105t3.r;
import p123x.AbstractC1070c;
import p123x.AbstractC1078k;
import p123x.T;
import p123x.U;
import p124x0.AbstractC1098f;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.C1111t;
import p124x0.InterfaceC1102j;
import p126x2.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C0823f f1688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C0823f f1689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0823f f1690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile b f1691d;

    public static void A(Throwable th) {
        b bVar = f1691d;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            th = new UndeliverableException(th);
        }
        if (bVar != null) {
            try {
                bVar.e(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            }
        }
        th.printStackTrace();
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static int C(double d6) {
        if (Double.isNaN(d6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d6 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d6 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d6);
    }

    public static int D(float f6) {
        if (Float.isNaN(f6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f6);
    }

    public static long E(double d6) {
        if (Double.isNaN(d6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d6);
    }

    public static final h F(List list, double d6) {
        if (d6 < 0.0d || d6 > 1.0d) {
            return new h(list, u.f11237h);
        }
        List listC = d0.C(list);
        int size = (int) (((double) listC.size()) * d6);
        return new h(listC.subList(0, size), listC.subList(size, listC.size()));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public static int G(String str) {
        Object objV;
        Integer numX;
        int iIntValue;
        Integer num = null;
        num = null;
        if (str != null && !l.i0(str)) {
            try {
                r rVar = (r) p006b.a.z(str).g().f12592h.get("streamControlPort");
                if (rVar != null) {
                    if ((rVar instanceof p105t3.u) && (rVar.i().f12593h instanceof Number)) {
                        numX = Integer.valueOf(rVar.c());
                    } else if ((rVar instanceof p105t3.u) && (rVar.i().f12593h instanceof String)) {
                        String strK = rVar.k();
                        k.e("getAsString(...)", strK);
                        numX = s.X(strK);
                    } else {
                        numX = null;
                    }
                    if (numX == null || (iIntValue = numX.intValue()) < 0) {
                        objV = null;
                    } else {
                        objV = numX;
                        if (iIntValue >= 65536) {
                            objV = null;
                        }
                    }
                } else {
                    objV = null;
                }
            } catch (Throwable th) {
                objV = V.v(th);
            }
            num = (Integer) (objV instanceof j ? null : objV);
        }
        if (num != null) {
            return num.intValue();
        }
        return 60222;
    }

    public static final B2.r H(w wVar) {
        k.f("$this$suspendable", wVar);
        w rVar = (w) wVar.w().get("B2.r");
        if (rVar == null) {
            rVar = new B2.r(wVar);
        }
        if (wVar != rVar) {
            wVar.w().put("B2.r", rVar);
        }
        return (B2.r) rVar;
    }

    public static final int I(int i, double d6, int i3) {
        if (d6 == 0.0d) {
            return i;
        }
        double d7 = i;
        double dAbs = Math.abs(d6) * d7;
        H4.a aVar = e.f1802h;
        return (int) c.M((dAbs * (e.f1802h.e().nextBoolean() ? 1.0d : -1.0d)) + d7, 0, i3);
    }

    public static int J(byte[] bArr, int i, C0580l0 c0580l0) throws zzfo {
        int iO = O(bArr, i, c0580l0);
        int i3 = c0580l0.f7964a;
        if (i3 < 0) {
            throw new zzfo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iO) {
            throw new zzfo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i3 == 0) {
            c0580l0.f7966c = AbstractC0586o0.i;
            return iO;
        }
        c0580l0.f7966c = AbstractC0586o0.n(bArr, iO, i3);
        return iO + i3;
    }

    public static int K(int i, byte[] bArr) {
        int i3 = bArr[i] & 255;
        int i6 = bArr[i + 1] & 255;
        int i7 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i6 << 8) | i3 | (i7 << 16);
    }

    public static int L(S0 s1, int i, byte[] bArr, int i3, int i6, C0 c6, C0580l0 c0580l0) throws zzfo {
        AbstractC0605y0 abstractC0605y0D = s1.d();
        S0 s6 = s1;
        byte[] bArr2 = bArr;
        int i7 = i6;
        C0580l0 c0580l1 = c0580l0;
        int iT = T(abstractC0605y0D, s6, bArr2, i3, i7, c0580l1);
        s6.a(abstractC0605y0D);
        c0580l1.f7966c = abstractC0605y0D;
        c6.add(abstractC0605y0D);
        while (iT < i7) {
            C0580l0 c0580l2 = c0580l1;
            int i8 = i7;
            int iO = O(bArr2, iT, c0580l2);
            if (i != c0580l2.f7964a) {
                break;
            }
            byte[] bArr3 = bArr2;
            S0 s7 = s6;
            AbstractC0605y0 abstractC0605y0D2 = s7.d();
            iT = T(abstractC0605y0D2, s7, bArr3, iO, i8, c0580l2);
            s6 = s7;
            bArr2 = bArr3;
            i7 = i8;
            c0580l1 = c0580l2;
            s6.a(abstractC0605y0D2);
            c0580l1.f7966c = abstractC0605y0D2;
            c6.add(abstractC0605y0D2);
        }
        return iT;
    }

    public static int M(byte[] bArr, int i, C0 c6, C0580l0 c0580l0) throws zzfo {
        C0607z0 c0607z0 = (C0607z0) c6;
        int iO = O(bArr, i, c0580l0);
        int i3 = c0580l0.f7964a + iO;
        while (iO < i3) {
            iO = O(bArr, iO, c0580l0);
            c0607z0.g(c0580l0.f7964a);
        }
        if (iO == i3) {
            return iO;
        }
        throw new zzfo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int N(int i, byte[] bArr, int i3, int i6, V0 v6, C0580l0 c0580l0) throws zzfo {
        if ((i >>> 3) == 0) {
            throw new zzfo("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i & 7;
        if (i7 == 0) {
            int iR = R(bArr, i3, c0580l0);
            v6.c(i, Long.valueOf(c0580l0.f7965b));
            return iR;
        }
        if (i7 == 1) {
            v6.c(i, Long.valueOf(U(i3, bArr)));
            return i3 + 8;
        }
        if (i7 == 2) {
            int iO = O(bArr, i3, c0580l0);
            int i8 = c0580l0.f7964a;
            if (i8 < 0) {
                throw new zzfo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i8 > bArr.length - iO) {
                throw new zzfo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i8 == 0) {
                v6.c(i, AbstractC0586o0.i);
            } else {
                v6.c(i, AbstractC0586o0.n(bArr, iO, i8));
            }
            return iO + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw new zzfo("Protocol message contained an invalid tag (zero).");
            }
            v6.c(i, Integer.valueOf(K(i3, bArr)));
            return i3 + 4;
        }
        int i9 = (i & (-8)) | 4;
        V0 v0B = V0.b();
        int i10 = c0580l0.f7967d + 1;
        c0580l0.f7967d = i10;
        if (i10 >= 100) {
            throw new zzfo("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i11 = 0;
        while (i3 < i6) {
            int iO2 = O(bArr, i3, c0580l0);
            int i12 = c0580l0.f7964a;
            if (i12 == i9) {
                i11 = i12;
                i3 = iO2;
                break;
            }
            i3 = N(i12, bArr, iO2, i6, v0B, c0580l0);
            i11 = i12;
        }
        c0580l0.f7967d--;
        if (i3 > i6 || i11 != i9) {
            throw new zzfo("Failed to parse the message.");
        }
        v6.c(i, v0B);
        return i3;
    }

    public static int O(byte[] bArr, int i, C0580l0 c0580l0) {
        int i3 = i + 1;
        byte b6 = bArr[i];
        if (b6 < 0) {
            return P(b6, bArr, i3, c0580l0);
        }
        c0580l0.f7964a = b6;
        return i3;
    }

    public static int P(int i, byte[] bArr, int i3, C0580l0 c0580l0) {
        byte b6 = bArr[i3];
        int i6 = i3 + 1;
        int i7 = i & 127;
        if (b6 >= 0) {
            c0580l0.f7964a = i7 | (b6 << 7);
            return i6;
        }
        int i8 = i7 | ((b6 & 127) << 7);
        int i9 = i3 + 2;
        byte b7 = bArr[i6];
        if (b7 >= 0) {
            c0580l0.f7964a = i8 | (b7 << 14);
            return i9;
        }
        int i10 = i8 | ((b7 & 127) << 14);
        int i11 = i3 + 3;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            c0580l0.f7964a = i10 | (b8 << 21);
            return i11;
        }
        int i12 = i10 | ((b8 & 127) << 21);
        int i13 = i3 + 4;
        byte b9 = bArr[i11];
        if (b9 >= 0) {
            c0580l0.f7964a = i12 | (b9 << 28);
            return i13;
        }
        int i14 = i12 | ((b9 & 127) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                c0580l0.f7964a = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    public static int Q(int i, byte[] bArr, int i3, int i6, C0 c6, C0580l0 c0580l0) {
        C0607z0 c0607z0 = (C0607z0) c6;
        int iO = O(bArr, i3, c0580l0);
        c0607z0.g(c0580l0.f7964a);
        while (iO < i6) {
            int iO2 = O(bArr, iO, c0580l0);
            if (i != c0580l0.f7964a) {
                break;
            }
            iO = O(bArr, iO2, c0580l0);
            c0607z0.g(c0580l0.f7964a);
        }
        return iO;
    }

    public static int R(byte[] bArr, int i, C0580l0 c0580l0) {
        long j4 = bArr[i];
        int i3 = i + 1;
        if (j4 >= 0) {
            c0580l0.f7965b = j4;
            return i3;
        }
        int i6 = i + 2;
        byte b6 = bArr[i3];
        long j6 = (j4 & 127) | (((long) (b6 & 127)) << 7);
        int i7 = 7;
        while (b6 < 0) {
            int i8 = i6 + 1;
            byte b7 = bArr[i6];
            i7 += 7;
            j6 |= ((long) (b7 & 127)) << i7;
            b6 = b7;
            i6 = i8;
        }
        c0580l0.f7965b = j6;
        return i6;
    }

    public static int S(Object obj, S0 s1, byte[] bArr, int i, int i3, int i6, C0580l0 c0580l0) throws zzfo {
        M0 m6 = (M0) s1;
        int i7 = c0580l0.f7967d + 1;
        c0580l0.f7967d = i7;
        if (i7 >= 100) {
            throw new zzfo("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iT = m6.t(obj, bArr, i, i3, i6, c0580l0);
        c0580l0.f7967d--;
        c0580l0.f7966c = obj;
        return iT;
    }

    public static int T(Object obj, S0 s1, byte[] bArr, int i, int i3, C0580l0 c0580l0) throws zzfo {
        int iP = i + 1;
        int i6 = bArr[i];
        if (i6 < 0) {
            iP = P(i6, bArr, iP, c0580l0);
            i6 = c0580l0.f7964a;
        }
        int i7 = iP;
        if (i6 < 0 || i6 > i3 - i7) {
            throw new zzfo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i8 = c0580l0.f7967d + 1;
        c0580l0.f7967d = i8;
        if (i8 >= 100) {
            throw new zzfo("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i9 = i7 + i6;
        s1.c(obj, bArr, i7, i9, c0580l0);
        c0580l0.f7967d--;
        c0580l0.f7966c = obj;
        return i9;
    }

    public static long U(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static final void a(o oVar, D4.c cVar, C0230o c0230o, int i) {
        c0230o.X(-932836462);
        int i3 = (c0230o.f(oVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= c0230o.h(cVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && c0230o.B()) {
            c0230o.P();
        } else {
            AbstractC1070c.b(c0230o, androidx.compose.ui.draw.a.a(oVar, cVar));
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0018j(i, 8, oVar, cVar);
        }
    }

    public static final void b(int i, C0230o c0230o) {
        c0230o.X(1467942252);
        if (i == 0 && c0230o.B()) {
            c0230o.P();
        } else {
            Context context = (Context) c0230o.k(AndroidCompositionLocals_androidKt.f6730b);
            Z.l lVar = Z.l.f5957a;
            U uA = T.a(AbstractC1078k.f13777a, Z.b.f5941q, c0230o, 0);
            int i3 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
            o oVarC = Z.a.c(c0230o, lVar);
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(C1101i.f14041e, c0230o, uA);
            C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
            C1100h c1100h = C1101i.f14042f;
            if (c0230o.f3743O || !k.a(c0230o.K(), Integer.valueOf(i3))) {
                p012c.k.y(i3, c0230o, i3, c1100h);
            }
            C0208d.R(C1101i.f14039c, c0230o, oVarC);
            float f6 = 15;
            A1.b(new N3.V(context, 0), d0.k(p123x.V.a(lVar, 1.0f), A.e.a(f6)), false, null, 0L, 0L, 0.0f, 0.0f, null, V.b.c(1054588955, new N3.T(10), c0230o), c0230o, 0, 1020);
            AbstractC1070c.b(c0230o, androidx.compose.foundation.layout.c.k(lVar, 8));
            A1.b(new N3.V(context, 1), d0.k(p123x.V.a(lVar, 1.0f), A.e.a(f6)), false, null, 0L, 0L, 0.0f, 0.0f, null, V.b.c(827611794, new N3.T(11), c0230o), c0230o, 0, 1020);
            c0230o.p(true);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0253a(i, 3);
        }
    }

    public static final long c(float f6, float f7) {
        return (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public static final void d(int i, C0230o c0230o) {
        Context context;
        boolean z5;
        InterfaceC0203a0 interfaceC0203a0;
        InterfaceC0203a0 interfaceC0203a1;
        C0230o c0230o2 = c0230o;
        c0230o2.X(372284620);
        if (i == 0 && c0230o2.B()) {
            c0230o2.P();
        } else {
            c0230o2.V(-1095425720);
            Object objK = c0230o2.K();
            N.U u6 = C0222k.f3714a;
            N.U u7 = N.U.f3673m;
            if (objK == u6) {
                objK = C0208d.K(Boolean.FALSE, u7);
                c0230o2.f0(objK);
            }
            InterfaceC0203a0 interfaceC0203a2 = (InterfaceC0203a0) objK;
            Object objD = AbstractC0013g0.d(-1095423320, c0230o2, false);
            if (objD == u6) {
                objD = C0208d.K(Boolean.FALSE, u7);
                c0230o2.f0(objD);
            }
            InterfaceC0203a0 interfaceC0203a3 = (InterfaceC0203a0) objD;
            c0230o2.p(false);
            Context context2 = (Context) c0230o2.k(AndroidCompositionLocals_androidKt.f6730b);
            List listM = m.M(MusicServiceType.Spotify, MusicServiceType.Apple_Music, MusicServiceType.Amazon_Music, MusicServiceType.Tidal, MusicServiceType.Deezer, MusicServiceType.YouTube_Music);
            I i3 = (I) c0230o2.k(P0.f4083b);
            x xVar = x.f10867a;
            C0208d.c(xVar, new d(16), c0230o2);
            C0208d.e(new Q0(context2, null), c0230o2, xVar);
            J0.b(null, V.b.c(307062416, new C0257c(i3, 17), c0230o2), null, null, null, 0, 0L, 0L, null, V.b.c(679224091, new C0282o0(listM, context2, interfaceC0203a2, interfaceC0203a3), c0230o2), c0230o2, 805306416, 509);
            c0230o2.V(-1095229628);
            if (((Boolean) interfaceC0203a2.getValue()).booleanValue()) {
                c0230o2.V(-1095227190);
                Object objK2 = c0230o2.K();
                if (objK2 == u6) {
                    interfaceC0203a1 = interfaceC0203a2;
                    objK2 = new C0275l(19, interfaceC0203a1);
                    c0230o2.f0(objK2);
                } else {
                    interfaceC0203a1 = interfaceC0203a2;
                }
                c0230o2.p(false);
                z5 = false;
                context = context2;
                AbstractC0151k.a((D4.a) objK2, V.b.c(-1260029153, new T0(context2, interfaceC0203a1, 0), c0230o2), null, V.b.c(-1592672291, new C0254a0(9, interfaceC0203a1), c0230o2), P.f4077f, P.f4078g, null, 0L, 0L, 0L, 0L, 0.0f, null, c0230o, 1772598, 16276);
                c0230o2 = c0230o;
            } else {
                context = context2;
                z5 = false;
            }
            c0230o2.p(z5);
            if (((Boolean) interfaceC0203a3.getValue()).booleanValue()) {
                c0230o2.V(-1095194162);
                Object objK3 = c0230o2.K();
                if (objK3 == u6) {
                    interfaceC0203a0 = interfaceC0203a3;
                    objK3 = new C0275l(20, interfaceC0203a0);
                    c0230o2.f0(objK3);
                } else {
                    interfaceC0203a0 = interfaceC0203a3;
                }
                c0230o2.p(z5);
                AbstractC0151k.a((D4.a) objK3, V.b.c(-340359978, new T0(context, interfaceC0203a0, 1), c0230o2), null, V.b.c(2112131604, new C0254a0(8, interfaceC0203a0), c0230o2), P.f4080j, P.f4081k, null, 0L, 0L, 0L, 0L, 0.0f, null, c0230o, 1772598, 16276);
            }
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0253a(i, 11);
        }
    }

    public static final p030f0.d e(long j4, long j6) {
        return new p030f0.d(p030f0.c.d(j4), p030f0.c.e(j4), f.d(j6) + p030f0.c.d(j4), f.b(j6) + p030f0.c.e(j4));
    }

    public static final void f(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static final void g(int i, int i3, List list) {
        int size = list.size();
        if (i > i3) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i3 + ").");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.f(i, "fromIndex (", ") is less than 0."));
        }
        if (i3 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is more than than the list size (" + size + ')');
    }

    public static final boolean h(p013c0.d dVar, long j4) {
        if (!dVar.f5958h.f5969t) {
            return false;
        }
        C1111t c1111t = (C1111t) AbstractC1098f.s(dVar).f13828C.f3793c;
        if (!c1111t.f14060Q.f5969t) {
            return false;
        }
        long j6 = c1111t.f13138j;
        long jQ = c1111t.Q(0L);
        float fD = p030f0.c.d(jQ);
        float fE = p030f0.c.e(jQ);
        float f6 = ((int) (j6 >> 32)) + fD;
        float f7 = ((int) (j6 & 4294967295L)) + fE;
        float fD2 = p030f0.c.d(j4);
        if (fD > fD2 || fD2 > f6) {
            return false;
        }
        float fE2 = p030f0.c.e(j4);
        return fE <= fE2 && fE2 <= f7;
    }

    public static final I i(Context context) {
        k.f("context", context);
        I i = new I(context);
        F1.V v6 = i.f1290v;
        v6.a(new g(v6));
        i.f1290v.a(new i());
        i.f1290v.a(new p());
        return i;
    }

    public static final ExtractedText j(M0.w wVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = wVar.f3453a.f1494h;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j4 = wVar.f3454b;
        extractedText.selectionStart = G0.I.e(j4);
        extractedText.selectionEnd = G0.I.d(j4);
        extractedText.flags = !l.Z(wVar.f3453a.f1494h, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final void k(b5.d dVar) {
        k.f("<this>", dVar);
        if ((dVar instanceof e5.m ? (e5.m) dVar : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + E4.x.a(dVar.getClass()));
    }

    public static final e5.l l(b5.c cVar) {
        k.f("<this>", cVar);
        e5.l lVar = cVar instanceof e5.l ? (e5.l) cVar : null;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + E4.x.a(cVar.getClass()));
    }

    public static R3.l m(Callable callable) {
        try {
            Object objCall = callable.call();
            W3.b.a("Scheduler Callable result can't be null", objCall);
            return (R3.l) objCall;
        } catch (Throwable th) {
            throw p047i4.c.a(th);
        }
    }

    public static void n(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static String o(p015c2.h hVar) {
        String str;
        String str2;
        String name = hVar.f7281k.getName();
        if (name.startsWith("java.time.")) {
            if (name.indexOf(46, 10) >= 0) {
                return null;
            }
            str = "Java 8 date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310";
        } else {
            if (!name.startsWith("org.joda.time.")) {
                return null;
            }
            str = "Joda date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-joda";
        }
        return str + " type " + p109u2.i.r(hVar) + " not supported by default: add Module \"" + str2 + "\" to enable handling";
    }

    public static final L0.e p(Context context) {
        W2.g gVar = new W2.g(5);
        context.getApplicationContext();
        return new L0.e(gVar, new L0.a(Build.VERSION.SDK_INT >= 31 ? L0.l.f3029a.a(context) : 0));
    }

    public static String r(String str, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final K4.b s(a5.g gVar) {
        k.f("<this>", gVar);
        if (gVar instanceof a5.b) {
            return ((a5.b) gVar).f6348b;
        }
        if (gVar instanceof j0) {
            return s(((j0) gVar).f7461a);
        }
        return null;
    }

    public static final C0823f t() {
        C0823f c0823f = f1688a;
        if (c0823f != null) {
            return c0823f;
        }
        C0822e c0822e = new C0822e("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = G.f10217a;
        O o6 = new O(p035g0.r.f9076b);
        C0227m0 c0227m0 = new C0227m0(2);
        c0227m0.i(12.0f, 2.0f);
        c0227m0.c(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        c0227m0.k(4.48f, 10.0f, 10.0f, 10.0f);
        c0227m0.k(10.0f, -4.48f, 10.0f, -10.0f);
        c0227m0.j(17.52f, 2.0f, 12.0f, 2.0f);
        c0227m0.b();
        c0227m0.i(10.0f, 17.0f);
        c0227m0.h(-5.0f, -5.0f);
        c0227m0.h(1.41f, -1.41f);
        c0227m0.g(10.0f, 14.17f);
        c0227m0.h(7.59f, -7.59f);
        c0227m0.g(19.0f, 8.0f);
        c0227m0.h(-9.0f, 9.0f);
        c0227m0.b();
        C0822e.a(c0822e, c0227m0.f3729h, o6);
        C0823f c0823fB = c0822e.b();
        f1688a = c0823fB;
        return c0823fB;
    }

    public static Object u(p015c2.h hVar) {
        Class cls = hVar.f7281k;
        Class clsA = p109u2.i.A(cls);
        if (clsA == null) {
            if (hVar.k0() || hVar.D()) {
                return EnumC0363z.f4984j;
            }
            if (cls == String.class) {
                return "";
            }
            if (hVar.n0(Date.class)) {
                return new Date(0L);
            }
            if (!hVar.n0(Calendar.class)) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0L);
            return gregorianCalendar;
        }
        if (clsA == Integer.TYPE) {
            return 0;
        }
        if (clsA == Long.TYPE) {
            return 0L;
        }
        if (clsA == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (clsA == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (clsA == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (clsA == Byte.TYPE) {
            return (byte) 0;
        }
        if (clsA == Short.TYPE) {
            return (short) 0;
        }
        if (clsA == Character.TYPE) {
            return (char) 0;
        }
        throw new IllegalArgumentException("Class " + clsA.getName() + " is not a primitive type");
    }

    public static String v(Context context, int i) {
        String strValueOf;
        k.f("context", context);
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            strValueOf = context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            strValueOf = String.valueOf(i);
        }
        k.e("try {\n                  …tring()\n                }", strValueOf);
        return strValueOf;
    }

    public static L4.j w(B b6) {
        k.f("<this>", b6);
        return L4.l.P(b6, C0085b.f1335n);
    }

    public static p084p4.f y(p084p4.g gVar, D4.a aVar) {
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return new p084p4.m(aVar);
        }
        p084p4.u uVar = p084p4.u.f10864a;
        if (iOrdinal == 1) {
            p084p4.l lVar = new p084p4.l();
            lVar.f10853h = aVar;
            lVar.i = uVar;
            return lVar;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        p009b2.k kVar = new p009b2.k(3);
        kVar.i = aVar;
        kVar.f7081j = uVar;
        return kVar;
    }

    public static p084p4.m z(D4.a aVar) {
        k.f("initializer", aVar);
        return new p084p4.m(aVar);
    }

    public abstract int B(byte[] bArr, int i, int i3);

    public abstract String q(byte[] bArr, int i, int i3);

    public boolean x(byte[] bArr, int i, int i3) {
        return B(bArr, i, i3) == 0;
    }
}
