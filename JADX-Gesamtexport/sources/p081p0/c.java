package p081p0;

import B.AbstractC0013g0;
import B.C0005c0;
import B.C0018j;
import B.C0025m0;
import D4.e;
import E4.f;
import E4.k;
import F1.C0091h;
import F1.C0096m;
import G0.C0110f;
import G0.I;
import G1.C0117a;
import L.C0154l;
import L.G0;
import L.J0;
import M0.w;
import N.C0208d;
import N.C0217h0;
import N.C0222k;
import N.C0227m0;
import N.C0230o;
import N.C0233p0;
import N.C0235q0;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import N.U;
import N3.B;
import N3.C0253a;
import N3.C0257c;
import N3.C0259d;
import N3.C0265g;
import N3.P0;
import P4.AbstractC0336x;
import P4.D;
import S1.V;
import S1.h0;
import X.s;
import X.y;
import Z.g;
import Z.l;
import Z.o;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0449i;
import androidx.lifecycle.Q;
import b5.b;
import b5.d;
import c5.C0484e0;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.google.android.gms.internal.play_billing.D1;
import com.google.android.gms.internal.play_billing.E1;
import com.google.android.gms.internal.play_billing.U0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import okhttp3.internal.http2.Http2;
import p015c2.AbstractC0473d;
import p020d2.n;
import p030f0.a;
import p035g0.M;
import p035g0.O;
import p035g0.r;
import p058l0.C0822e;
import p058l0.C0823f;
import p058l0.G;
import p080p.C;
import p080p.x;
import p090r.C0866e;
import p090r.C0872k;
import p090r.C0873l;
import p096s.j0;
import p096s.o0;
import p096s.u0;
import p096s.w0;
import p096s.x0;
import p117w.m;
import p117w.q;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;
import p130y0.AbstractC1124c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements d, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C0823f f10829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C0823f f10830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0823f f10831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f10832d;

    public static final void A(int i, String str) {
        if (str.charAt(i) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index 8, but was " + str.charAt(i)).toString());
    }

    public static final void B(int i, int i3, long j4, byte[] bArr) {
        int i6 = (i3 * 2) + i;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = M4.d.f3532a[(int) (255 & j4)];
            bArr[i6 - 1] = (byte) i8;
            i6 -= 2;
            bArr[i6] = (byte) (i8 >> 8);
            j4 >>= 8;
        }
    }

    public static final long B0(float f6, long j4) {
        return n.a(Math.max(0.0f, a.b(j4) - f6), Math.max(0.0f, a.c(j4) - f6));
    }

    public static final int C(int i) {
        if (i < 8191) {
            return 262142;
        }
        if (i < 32767) {
            return 65534;
        }
        if (i < 65535) {
            return 32766;
        }
        if (i < 262143) {
            return 8190;
        }
        throw new IllegalArgumentException(AbstractC0013g0.f(i, "Can't represent a size of ", " in Constraints"));
    }

    public static J4.b C0(J4.d dVar, int i) {
        k.f("<this>", dVar);
        boolean z5 = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (z5) {
            if (dVar.f1942j <= 0) {
                i = -i;
            }
            return new J4.b(dVar.f1941h, dVar.i, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    public static void D(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        k.f("<this>", th);
        k.f("exception", th2);
        if (th != th2) {
            Integer num = z4.a.f14658a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = p133y4.a.f14592a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static J4.d D0(int i, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new J4.d(i, i3 - 1, 1);
        }
        J4.d dVar = J4.d.f1946k;
        return J4.d.f1946k;
    }

    public static final int E(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static void E0(Parcel parcel, int i, Parcelable parcelable, int i3) {
        if (parcelable == null) {
            return;
        }
        int iJ0 = J0(parcel, i);
        parcelable.writeToParcel(parcel, i3);
        L0(parcel, iJ0);
    }

    public static final o F(o oVar, float f6, long j4, M m6) {
        return oVar.k(new BorderModifierNodeElement(f6, new O(j4), m6));
    }

    public static void F0(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iJ0 = J0(parcel, i);
        parcel.writeString(str);
        L0(parcel, iJ0);
    }

    public static void G0(Parcel parcel, int i, Parcelable[] parcelableArr, int i3) {
        if (parcelableArr == null) {
            return;
        }
        int iJ0 = J0(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i3);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        L0(parcel, iJ0);
    }

    public static void H0(Parcel parcel, int i, int i3) {
        parcel.writeInt(i | (i3 << 16));
    }

    public static final void J(int i, int i3) {
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, i3, ", size: "));
        }
    }

    public static int J0(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final void K(int i, int i3) {
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, i3, ", size: "));
        }
    }

    public static final void L(int i, int i3, int i6) {
        if (i >= 0 && i3 <= i6) {
            if (i > i3) {
                throw new IllegalArgumentException(AbstractC0013g0.g("fromIndex: ", i, i3, " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i3 + ", size: " + i6);
    }

    public static void L0(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static double M(double d6, double d7, double d8) {
        if (d7 <= d8) {
            if (d6 < d7) {
                return d7;
            }
            return d6 > d8 ? d8 : d6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d8 + " is less than minimum " + d7 + '.');
    }

    public static float N(float f6, float f7, float f8) {
        if (f7 <= f8) {
            if (f6 < f7) {
                return f7;
            }
            return f6 > f8 ? f8 : f6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f8 + " is less than minimum " + f7 + '.');
    }

    public static int O(int i, int i3, int i6) {
        if (i3 <= i6) {
            if (i < i3) {
                return i3;
            }
            return i > i6 ? i6 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i6 + " is less than minimum " + i3 + '.');
    }

    public static long P(long j4, long j6, long j7) {
        if (j6 <= j7) {
            if (j4 < j6) {
                return j6;
            }
            return j4 > j7 ? j7 : j4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j7 + " is less than minimum " + j6 + '.');
    }

    public static final InterfaceC0203a0 Q(m mVar, C0230o c0230o, int i) {
        Object objK = c0230o.K();
        U u6 = C0222k.f3714a;
        if (objK == u6) {
            objK = C0208d.K(Boolean.FALSE, U.f3673m);
            c0230o.f0(objK);
        }
        InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) objK;
        boolean z5 = (((i & 14) ^ 6) > 4 && c0230o.f(mVar)) || (i & 6) == 4;
        Object objK2 = c0230o.K();
        if (z5 || objK2 == u6) {
            objK2 = new q(mVar, interfaceC0203a0, null);
            c0230o.f0(objK2);
        }
        C0208d.e((e) objK2, c0230o, mVar);
        return interfaceC0203a0;
    }

    public static final long R(long j4, long j6) {
        return AbstractC0473d.b(O((int) (j6 >> 32), S0.a.j(j4), S0.a.h(j4)), O((int) (j6 & 4294967295L), S0.a.i(j4), S0.a.g(j4)));
    }

    public static final long S(long j4, long j6) {
        return t(O(S0.a.j(j6), S0.a.j(j4), S0.a.h(j4)), O(S0.a.h(j6), S0.a.j(j4), S0.a.h(j4)), O(S0.a.i(j6), S0.a.i(j4), S0.a.g(j4)), O(S0.a.g(j6), S0.a.i(j4), S0.a.g(j4)));
    }

    public static final int T(int i, long j4) {
        return O(i, S0.a.i(j4), S0.a.g(j4));
    }

    public static final int U(int i, long j4) {
        return O(i, S0.a.j(j4), S0.a.h(j4));
    }

    public static final boolean V(p030f0.d dVar, float f6, float f7) {
        return f6 <= dVar.f8841c && dVar.f8839a <= f6 && f7 <= dVar.f8842d && dVar.f8840b <= f7;
    }

    public static final long W(int i, int i3, int i6, int i7) {
        int i8 = i7 == Integer.MAX_VALUE ? i6 : i7;
        int iE = E(i8);
        int i9 = i3 == Integer.MAX_VALUE ? i : i3;
        int iE2 = E(i9);
        if (iE + iE2 > 31) {
            throw new IllegalArgumentException("Can't represent a width of " + i9 + " and height of " + i8 + " in Constraints");
        }
        int i10 = i3 + 1;
        int i11 = i10 & (~(i10 >> 31));
        int i12 = i7 + 1;
        int i13 = i12 & (~(i12 >> 31));
        int i14 = 0;
        if (iE2 != 13) {
            if (iE2 == 18) {
                i14 = 3;
            } else if (iE2 == 15) {
                i14 = 1;
            } else if (iE2 == 16) {
                i14 = 2;
            }
        }
        int i15 = (((i14 & 2) >> 1) * 3) + ((i14 & 1) << 1);
        return (((long) i11) << 33) | ((long) i14) | (((long) i) << 2) | (((long) i6) << (i15 + 15)) | (((long) i13) << (i15 + 46));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r0.equals("chunked") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r0.equals("") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r0.equals("identity") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.InputStream X(java.io.InputStream r3, java.lang.String r4, D4.e r5) {
        /*
            java.lang.String r0 = "$this$decode"
            E4.k.f(r0, r3)
            java.lang.String r0 = "encoding"
            E4.k.f(r0, r4)
            java.lang.String r0 = "unsupported"
            E4.k.f(r0, r5)
            java.lang.CharSequence r0 = M4.l.B0(r4)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L7b
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "(this as java.lang.String).toLowerCase()"
            E4.k.e(r1, r0)
            int r1 = r0.hashCode()
            r2 = -135761730(0xfffffffff7e870be, float:-9.428903E33)
            if (r1 == r2) goto L6b
            if (r1 == 0) goto L62
            r2 = 3189082(0x30a95a, float:4.468856E-39)
            if (r1 == r2) goto L54
            r2 = 757417932(0x2d2547cc, float:9.395106E-12)
            if (r1 == r2) goto L4b
            r2 = 1545112619(0x5c188c2b, float:1.7175325E17)
            if (r1 == r2) goto L3d
            goto L74
        L3d:
            java.lang.String r1 = "deflate"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L74
            java.util.zip.InflaterInputStream r4 = new java.util.zip.InflaterInputStream
            r4.<init>(r3)
            return r4
        L4b:
            java.lang.String r1 = "chunked"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L74
            goto L73
        L54:
            java.lang.String r1 = "gzip"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L74
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream
            r4.<init>(r3)
            return r4
        L62:
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L74
            goto L73
        L6b:
            java.lang.String r1 = "identity"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L74
        L73:
            return r3
        L74:
            java.lang.Object r3 = r5.d(r3, r4)
            java.io.InputStream r3 = (java.io.InputStream) r3
            return r3
        L7b:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p081p0.c.X(java.io.InputStream, java.lang.String, D4.e):java.io.InputStream");
    }

    public static final p128x4.b i0(Enum[] enumArr) {
        k.f("entries", enumArr);
        return new p128x4.b(enumArr);
    }

    public static final C0823f j0() {
        C0823f c0823f = f10829a;
        if (c0823f != null) {
            return c0823f;
        }
        C0822e c0822e = new C0822e("Filled.Cancel", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = G.f10217a;
        O o6 = new O(r.f9076b);
        C0227m0 c0227m0 = new C0227m0(2);
        c0227m0.i(12.0f, 2.0f);
        c0227m0.c(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f);
        c0227m0.k(4.47f, 10.0f, 10.0f, 10.0f);
        c0227m0.k(10.0f, -4.47f, 10.0f, -10.0f);
        c0227m0.j(17.53f, 2.0f, 12.0f, 2.0f);
        c0227m0.b();
        c0227m0.i(17.0f, 15.59f);
        c0227m0.g(15.59f, 17.0f);
        c0227m0.g(12.0f, 13.41f);
        c0227m0.g(8.41f, 17.0f);
        c0227m0.g(7.0f, 15.59f);
        c0227m0.g(10.59f, 12.0f);
        c0227m0.g(7.0f, 8.41f);
        c0227m0.g(8.41f, 7.0f);
        c0227m0.g(12.0f, 10.59f);
        c0227m0.g(15.59f, 7.0f);
        c0227m0.g(17.0f, 8.41f);
        c0227m0.g(13.41f, 12.0f);
        c0227m0.g(17.0f, 15.59f);
        c0227m0.b();
        C0822e.a(c0822e, c0227m0.f3729h, o6);
        C0823f c0823fB = c0822e.b();
        f10829a = c0823fB;
        return c0823fB;
    }

    public static final long k0(KeyEvent keyEvent) {
        return n.b(keyEvent.getKeyCode());
    }

    public static final C0110f l0(w wVar) {
        C0110f c0110f = wVar.f3453a;
        c0110f.getClass();
        long j4 = wVar.f3454b;
        return c0110f.subSequence(I.e(j4), I.d(j4));
    }

    public static final C0110f m0(w wVar, int i) {
        C0110f c0110f = wVar.f3453a;
        long j4 = wVar.f3454b;
        return c0110f.subSequence(I.d(j4), Math.min(I.d(j4) + i, wVar.f3453a.f1494h.length()));
    }

    public static final C0110f n0(w wVar, int i) {
        C0110f c0110f = wVar.f3453a;
        long j4 = wVar.f3454b;
        return c0110f.subSequence(Math.max(0, I.e(j4) - i), I.e(j4));
    }

    public static final int o0(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final boolean p0(long j4) {
        long j6 = (j4 & 9187343241974906880L) ^ 9187343241974906880L;
        return (((~j6) & (j6 - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static boolean q0(byte b6) {
        return b6 > -65;
    }

    public static final boolean r0(long j4, long j6) {
        int iJ = S0.a.j(j4);
        int iH = S0.a.h(j4);
        int i = (int) (j6 >> 32);
        if (iJ > i || i > iH) {
            return false;
        }
        int i3 = (int) (j6 & 4294967295L);
        return S0.a.i(j4) <= i3 && i3 <= S0.a.g(j4);
    }

    public static final void s(o0 o0Var, o oVar, D4.c cVar, g gVar, D4.c cVar2, V.a aVar, C0230o c0230o, int i) {
        int i3;
        D4.c cVar3;
        C0873l c0873l;
        s sVar;
        C0873l c0873l2;
        C0230o c0230o2;
        boolean z5;
        C0230o c0230o3;
        D4.c cVar4 = cVar;
        c0230o.X(-114689412);
        if ((i & 6) == 0) {
            i3 = (c0230o.f(o0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.f(oVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0230o.h(cVar4) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c0230o.f(gVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c0230o.h(cVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        V.a aVar2 = aVar;
        if ((196608 & i) == 0) {
            i3 |= c0230o.h(aVar2) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && c0230o.B()) {
            c0230o.P();
            cVar3 = cVar4;
            c0230o3 = c0230o;
        } else {
            S0.k kVar = (S0.k) c0230o.k(AbstractC1124c0.f14372l);
            int i6 = i3 & 14;
            boolean z6 = i6 == 4;
            Object objK = c0230o.K();
            U u6 = C0222k.f3714a;
            if (z6 || objK == u6) {
                objK = new C0873l(o0Var, gVar, kVar);
                c0230o.f0(objK);
            }
            C0873l c0873l3 = (C0873l) objK;
            boolean z7 = i6 == 4;
            Object objK2 = c0230o.K();
            Object obj = objK2;
            if (z7 || objK2 == u6) {
                Object[] objArr = {o0Var.f12056a.j()};
                s sVar2 = new s();
                sVar2.addAll(p089q4.k.t0(objArr));
                c0230o.f0(sVar2);
                obj = sVar2;
            }
            s sVar3 = (s) obj;
            boolean z8 = i6 == 4;
            Object objK3 = c0230o.K();
            if (z8 || objK3 == u6) {
                long[] jArr = C.f10714a;
                objK3 = new x();
                c0230o.f0(objK3);
            }
            x xVar = (x) objK3;
            boolean zContains = sVar3.contains(o0Var.f12056a.j());
            C1.b bVar = o0Var.f12056a;
            if (!zContains) {
                sVar3.clear();
                sVar3.add(bVar.j());
            }
            Object objJ = bVar.j();
            C0217h0 c0217h0 = o0Var.f12059d;
            if (k.a(objJ, c0217h0.getValue())) {
                if (sVar3.size() != 1 || !k.a(sVar3.get(0), bVar.j())) {
                    sVar3.clear();
                    sVar3.add(bVar.j());
                }
                if (xVar.f10800e != 1 || xVar.b(bVar.j())) {
                    xVar.a();
                }
                c0873l3.f11413b = gVar;
                c0873l3.f11414c = kVar;
            }
            if (!k.a(bVar.j(), c0217h0.getValue()) && !sVar3.contains(c0217h0.getValue())) {
                ListIterator listIterator = sVar3.listIterator();
                int i7 = 0;
                while (true) {
                    y yVar = (y) listIterator;
                    ListIterator listIterator2 = listIterator;
                    if (!yVar.hasNext()) {
                        i7 = -1;
                        break;
                    } else {
                        if (k.a(cVar2.invoke(yVar.next()), cVar2.invoke(c0217h0.getValue()))) {
                            break;
                        }
                        i7++;
                        listIterator = listIterator2;
                    }
                }
                if (i7 == -1) {
                    sVar3.add(c0217h0.getValue());
                } else {
                    sVar3.set(i7, c0217h0.getValue());
                }
            }
            if (xVar.b(c0217h0.getValue()) && xVar.b(bVar.j())) {
                c0230o.V(915535767);
                c0230o.p(false);
                cVar3 = cVar4;
                c0873l = c0873l3;
            } else {
                c0230o.V(912931457);
                xVar.a();
                int size = sVar3.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj2 = sVar3.get(i8);
                    C0873l c0873l4 = c0873l3;
                    xVar.i(obj2, V.b.c(885640742, new C0154l(o0Var, obj2, cVar4, c0873l4, sVar3, aVar2), c0230o));
                    c0873l3 = c0873l4;
                    i8++;
                    cVar4 = cVar4;
                    aVar2 = aVar;
                }
                cVar3 = cVar4;
                c0873l = c0873l3;
                c0230o.p(false);
            }
            boolean zF = c0230o.f(o0Var.f()) | c0230o.f(c0873l);
            Object objK4 = c0230o.K();
            if (zF || objK4 == u6) {
                objK4 = (p090r.w) cVar3.invoke(c0873l);
                c0230o.f0(objK4);
            }
            p090r.w wVar = (p090r.w) objK4;
            c0873l.getClass();
            boolean zF2 = c0230o.f(c0873l);
            Object objK5 = c0230o.K();
            if (zF2 || objK5 == u6) {
                objK5 = C0208d.K(Boolean.FALSE, U.f3673m);
                c0230o.f0(objK5);
            }
            InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) objK5;
            InterfaceC0203a0 interfaceC0203a0N = C0208d.N(wVar.f11447d, c0230o);
            o0 o0Var2 = c0873l.f11412a;
            if (k.a(o0Var2.f12056a.j(), o0Var2.f12059d.getValue())) {
                interfaceC0203a0.setValue(Boolean.FALSE);
            } else if (interfaceC0203a0N.getValue() != null) {
                interfaceC0203a0.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) interfaceC0203a0.getValue()).booleanValue();
            o oVar2 = l.f5957a;
            if (zBooleanValue) {
                c0230o.V(249037309);
                w0 w0Var = x0.f12145h;
                C0873l c0873l5 = c0873l;
                o0 o0Var3 = c0873l5.f11412a;
                sVar = sVar3;
                c0873l2 = c0873l5;
                C0230o c0230o4 = c0230o;
                j0 j0VarA = u0.a(o0Var3, w0Var, null, c0230o4, 0, 2);
                boolean zF3 = c0230o4.f(j0VarA);
                Object objK6 = c0230o4.K();
                if (zF3 || objK6 == u6) {
                    objK6 = d0.l(oVar2).k(new C0872k(c0873l2, j0VarA, interfaceC0203a0N));
                    c0230o4.f0(objK6);
                }
                oVar2 = (o) objK6;
                c0230o4.p(false);
                c0230o2 = c0230o4;
            } else {
                sVar = sVar3;
                C0230o c0230o5 = c0230o;
                c0873l2 = c0873l;
                c0230o5.V(249353726);
                c0230o5.p(false);
                c0873l2.f11417f = null;
                c0230o2 = c0230o5;
            }
            o oVarK = oVar.k(oVar2);
            Object objK7 = c0230o2.K();
            if (objK7 == u6) {
                objK7 = new C0866e(c0873l2);
                c0230o2.f0(objK7);
            }
            C0866e c0866e = (C0866e) objK7;
            int i9 = c0230o2.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o2.m();
            o oVarC = Z.a.c(c0230o2, oVarK);
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            c0230o2.Z();
            if (c0230o2.f3743O) {
                c0230o2.l(c1106n);
            } else {
                c0230o2.i0();
            }
            C0208d.R(C1101i.f14041e, c0230o2, c0866e);
            C0208d.R(C1101i.f14040d, c0230o2, interfaceC0225l0M);
            C1100h c1100h = C1101i.f14042f;
            if (c0230o2.f3743O || !k.a(c0230o2.K(), Integer.valueOf(i9))) {
                p012c.k.y(i9, c0230o2, i9, c1100h);
            }
            C0208d.R(C1101i.f14039c, c0230o2, oVarC);
            c0230o2.V(-1491001814);
            int size2 = sVar.size();
            int i10 = 0;
            while (i10 < size2) {
                s sVar4 = sVar;
                Object obj3 = sVar4.get(i10);
                c0230o2.T(1908315325, cVar2.invoke(obj3));
                e eVar = (e) xVar.e(obj3);
                if (eVar == null) {
                    c0230o2.V(-971711888);
                    z5 = false;
                } else {
                    z5 = false;
                    c0230o2.V(1908317105);
                    eVar.d(c0230o2, 0);
                }
                c0230o2.p(z5);
                c0230o2.p(z5);
                i10++;
                sVar = sVar4;
            }
            c0230o2.p(false);
            c0230o2.p(true);
            c0230o3 = c0230o2;
        }
        C0235q0 c0235q0T = c0230o3.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new G0(o0Var, oVar, cVar3, gVar, cVar2, aVar, i);
        }
    }

    public static final boolean s0(long j4) {
        return (j4 & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final long t(int i, int i3, int i6, int i7) {
        boolean z5 = false;
        if (!(i3 >= i)) {
            V.N("maxWidth(" + i3 + ") must be >= than minWidth(" + i + ')');
            throw null;
        }
        if (!(i7 >= i6)) {
            V.N("maxHeight(" + i7 + ") must be >= than minHeight(" + i6 + ')');
            throw null;
        }
        if (i >= 0 && i6 >= 0) {
            z5 = true;
        }
        if (z5) {
            return W(i, i3, i6, i7);
        }
        V.N("minWidth(" + i + ") and minHeight(" + i6 + ") must be >= 0");
        throw null;
    }

    public static final boolean t0(long j4) {
        return (j4 & 9223372034707292159L) == 9205357640488583168L;
    }

    public static /* synthetic */ long u(int i, int i3, int i6) {
        if ((i6 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i6 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return t(0, i, 0, i3);
    }

    public static final long u0(long j4, long j6, float f6) {
        float fG = V.G(Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j6 >> 32)), f6);
        float fG2 = V.G(Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j6 & 4294967295L)), f6);
        return (((long) Float.floatToRawIntBits(fG)) << 32) | (((long) Float.floatToRawIntBits(fG2)) & 4294967295L);
    }

    public static final void v(int i, C0230o c0230o) {
        c0230o.X(-909273140);
        if (i == 0 && c0230o.B()) {
            c0230o.P();
        } else {
            F1.I i3 = (F1.I) c0230o.k(P0.f4083b);
            c0230o.V(-461083015);
            Object objK = c0230o.K();
            if (objK == C0222k.f3714a) {
                objK = C0208d.K(Boolean.valueOf(com.nanjoran.ilightshow.Services.M.f8305O.f8325l.b()), U.f3673m);
                c0230o.f0(objK);
            }
            c0230o.p(false);
            C0208d.c(p084p4.x.f10867a, new defpackage.d(5), c0230o);
            J0.b(null, V.b.c(-174167664, new C0257c(i3, 3), c0230o), null, null, null, 0, 0L, 0L, null, B.f3925e, c0230o, 805306416, 509);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0253a(i, 2);
        }
    }

    public static final ArrayList v0(Map map, D4.c cVar) {
        k.f("<this>", map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C0091h c0091h = (C0091h) entry.getValue();
            Boolean boolValueOf = c0091h != null ? Boolean.valueOf(c0091h.f1345b) : null;
            k.c(boolValueOf);
            if (!boolValueOf.booleanValue() && !c0091h.f1346c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) cVar.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void w(C0096m c0096m, W.g gVar, V.a aVar, C0230o c0230o, int i) {
        c0230o.X(-1579360880);
        if ((((c0230o.h(c0096m) ? 4 : 2) | i | (c0230o.h(gVar) ? 32 : 16)) & 147) == 146 && c0230o.B()) {
            c0230o.P();
        } else {
            C0208d.b(new C0233p0[]{D1.b.f757a.a(c0096m), B1.b.f488a.a(c0096m), AndroidCompositionLocals_androidKt.f6733e.a(c0096m)}, V.b.c(-52928304, new A2.d(gVar, 4, aVar), c0230o), c0230o, 56);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new B.U(c0096m, gVar, aVar, i, 1);
        }
    }

    public static final long w0(int i, int i3, long j4) {
        int iJ = S0.a.j(j4) + i;
        if (iJ < 0) {
            iJ = 0;
        }
        int iH = S0.a.h(j4);
        if (iH != Integer.MAX_VALUE && (iH = iH + i) < 0) {
            iH = 0;
        }
        int i6 = S0.a.i(j4) + i3;
        if (i6 < 0) {
            i6 = 0;
        }
        int iG = S0.a.g(j4);
        return t(iJ, iH, i6, (iG == Integer.MAX_VALUE || (iG = iG + i3) >= 0) ? iG : 0);
    }

    public static final void x(int i, C0230o c0230o) {
        C0230o c0230o2 = c0230o;
        c0230o2.X(-447180856);
        if (i == 0 && c0230o2.B()) {
            c0230o2.P();
        } else {
            F1.I i3 = (F1.I) c0230o2.k(P0.f4083b);
            c0230o2.V(-519222524);
            Object objK = c0230o2.K();
            U u6 = C0222k.f3714a;
            if (objK == u6) {
                objK = C0208d.K(Boolean.valueOf(com.nanjoran.ilightshow.Services.M.f8305O.f8325l.b()), U.f3673m);
                c0230o2.f0(objK);
            }
            InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) objK;
            c0230o2.p(false);
            c0230o2.W(923020361);
            G2.b bVar = G2.b.f1681h;
            c0230o2.W(1424240517);
            Context context = (Context) c0230o2.k(AndroidCompositionLocals_androidKt.f6730b);
            c0230o2.W(1157296644);
            boolean zF = c0230o2.f("android.permission.RECORD_AUDIO");
            Object objK2 = c0230o2.K();
            if (zF || objK2 == u6) {
                k.f("<this>", context);
                Context baseContext = context;
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        throw new IllegalStateException("Permissions should be called in the context of an Activity");
                    }
                    if (baseContext instanceof Activity) {
                        objK2 = new G2.a(context, (Activity) baseContext);
                        c0230o2.f0(objK2);
                        break;
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        k.e("context.baseContext", baseContext);
                        c0230o2 = c0230o;
                    }
                }
            }
            c0230o2.p(false);
            G2.a aVar = (G2.a) objK2;
            h0.e(aVar, null, c0230o2, 0);
            g.a aVar2 = new g.a(0);
            c0230o2.W(511388516);
            boolean zF2 = c0230o2.f(aVar) | c0230o2.f(bVar);
            Object objK3 = c0230o2.K();
            if (zF2 || objK3 == u6) {
                objK3 = new C0005c0(aVar, 12, bVar);
                c0230o2.f0(objK3);
            }
            c0230o2.p(false);
            p018d.g gVarI = V.I(aVar2, (D4.c) objK3, c0230o2, 8);
            C0208d.d(aVar, gVarI, new A2.e(aVar, 11, gVarI), c0230o2);
            c0230o2.p(false);
            c0230o2.p(false);
            g.a aVar3 = new g.a(0);
            c0230o2.V(-519212787);
            Object objK4 = c0230o2.K();
            if (objK4 == u6) {
                objK4 = new C0259d(4, interfaceC0203a0);
                c0230o2.f0(objK4);
            }
            c0230o2.p(false);
            p018d.g gVarI2 = V.I(aVar3, (D4.c) objK4, c0230o2, 56);
            C0208d.c(p084p4.x.f10867a, new defpackage.d(15), c0230o2);
            J0.b(null, V.b.c(1110506636, new C0257c(i3, 15), c0230o2), null, null, null, 0, 0L, 0L, null, V.b.c(-551633577, new C0265g(aVar, interfaceC0203a0, gVarI2), c0230o2), c0230o2, 805306416, 509);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0253a(i, 10);
        }
    }

    public static /* synthetic */ long x0(long j4, int i, int i3, int i6) {
        if ((i6 & 1) != 0) {
            i = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = 0;
        }
        return w0(i, i3, j4);
    }

    public static final long y(float f6, float f7) {
        return (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public static p108u1.b y0(String str) {
        p108u1.a aVar = p108u1.a.f12647h;
        W4.c cVar = D.f4606c;
        P4.j0 j0VarB = AbstractC0336x.b();
        cVar.getClass();
        return new p108u1.b(str, aVar, AbstractC0336x.a(h0.u(cVar, j0VarB)));
    }

    public static final void z(W.g gVar, V.a aVar, C0230o c0230o, int i) {
        int i3;
        C0025m0 c0025m0;
        c0230o.X(1211832233);
        if ((i & 6) == 0) {
            i3 = (c0230o.h(gVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.h(aVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && c0230o.B()) {
            c0230o.P();
        } else {
            c0230o.W(1729797275);
            androidx.lifecycle.V vA = D1.b.a(c0230o);
            if (vA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            boolean z5 = vA instanceof InterfaceC0449i;
            C1.b bVarD = z5 ? ((InterfaceC0449i) vA).d() : C1.a.i;
            f fVarA = E4.x.a(C0117a.class);
            c0230o.W(1673618944);
            k.f("extras", bVarD);
            if (z5) {
                androidx.lifecycle.U uE = vA.e();
                Q qC = ((InterfaceC0449i) vA).c();
                k.f("store", uE);
                k.f("factory", qC);
                c0025m0 = new C0025m0(uE, qC, bVarD);
            } else {
                Q qC2 = z5 ? ((InterfaceC0449i) vA).c() : E1.a.f1001a;
                C1.b bVarD2 = z5 ? ((InterfaceC0449i) vA).d() : C1.a.i;
                k.f("factory", qC2);
                k.f("extras", bVarD2);
                c0025m0 = new C0025m0(vA.e(), qC2, bVarD2);
            }
            androidx.lifecycle.O oD = c0025m0.d(fVarA);
            c0230o.p(false);
            c0230o.p(false);
            C0117a c0117a = (C0117a) oD;
            c0117a.f1615d = new WeakReference(gVar);
            gVar.a(c0117a.f1614c, aVar, c0230o, ((i3 << 6) & 896) | (i3 & 112));
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0018j(i, 2, gVar, aVar);
        }
    }

    public abstract void A0(W0.f fVar, Thread thread);

    public abstract boolean G(W0.g gVar, W0.c cVar);

    public abstract boolean H(W0.g gVar, Object obj, Object obj2);

    public abstract boolean I(W0.g gVar, W0.f fVar, W0.f fVar2);

    public abstract void I0(D1 d1, D1 d6);

    public abstract void K0(D1 d1, Thread thread);

    public abstract boolean M0(E1 e6, U0 u0, U0 u6);

    public abstract boolean N0(E1 e6, Object obj, Object obj2);

    public abstract boolean O0(E1 e6, D1 d1, D1 d6);

    public void Y(a5.g gVar, int i, boolean z5) {
        k.f("descriptor", gVar);
        a0(gVar, i);
        i(z5);
    }

    public void Z(a5.g gVar, int i, double d6) {
        k.f("descriptor", gVar);
        a0(gVar, i);
        f(d6);
    }

    @Override // b5.d
    public b a(a5.g gVar) {
        k.f("descriptor", gVar);
        return this;
    }

    public abstract void a0(a5.g gVar, int i);

    public void b(a5.g gVar) {
        k.f("descriptor", gVar);
    }

    public void b0(a5.g gVar, int i, float f6) {
        k.f("descriptor", gVar);
        a0(gVar, i);
        l(f6);
    }

    public d c0(C0484e0 c0484e0, int i) {
        k.f("descriptor", c0484e0);
        a0(c0484e0, i);
        return k(c0484e0.k(i));
    }

    @Override // b5.d
    public void d(a5.g gVar, int i) {
        k.f("enumDescriptor", gVar);
        h0(Integer.valueOf(i));
    }

    public void d0(int i, int i3, a5.g gVar) {
        k.f("descriptor", gVar);
        a0(gVar, i);
        j(i3);
    }

    public void e0(a5.g gVar, int i, long j4) {
        k.f("descriptor", gVar);
        a0(gVar, i);
        m(j4);
    }

    @Override // b5.d
    public void f(double d6) {
        h0(Double.valueOf(d6));
    }

    public void f0(a5.g gVar, int i, Y4.a aVar, Object obj) {
        k.f("descriptor", gVar);
        k.f("serializer", aVar);
        a0(gVar, i);
        r(aVar, obj);
    }

    @Override // b5.d
    public void g(short s6) {
        h0(Short.valueOf(s6));
    }

    public void g0(a5.g gVar, int i, String str) {
        k.f("descriptor", gVar);
        k.f("value", str);
        a0(gVar, i);
        q(str);
    }

    @Override // b5.d
    public void h(byte b6) {
        h0(Byte.valueOf(b6));
    }

    public void h0(Object obj) {
        k.f("value", obj);
        throw new SerializationException("Non-serializable " + E4.x.a(obj.getClass()) + " is not supported by " + E4.x.a(getClass()) + " encoder");
    }

    @Override // b5.d
    public void i(boolean z5) {
        h0(Boolean.valueOf(z5));
    }

    @Override // b5.d
    public void j(int i) {
        h0(Integer.valueOf(i));
    }

    @Override // b5.d
    public d k(a5.g gVar) {
        k.f("descriptor", gVar);
        return this;
    }

    @Override // b5.d
    public void l(float f6) {
        h0(Float.valueOf(f6));
    }

    @Override // b5.d
    public void m(long j4) {
        h0(Long.valueOf(j4));
    }

    public void n(a5.g gVar, int i, Y4.a aVar, Object obj) {
        k.f("descriptor", gVar);
        k.f("serializer", aVar);
        a0(gVar, i);
        if (aVar.getDescriptor().i()) {
            r(aVar, obj);
        } else if (obj == null) {
            e();
        } else {
            r(aVar, obj);
        }
    }

    @Override // b5.d
    public void o(char c6) {
        h0(Character.valueOf(c6));
    }

    public boolean p(a5.g gVar) {
        k.f("descriptor", gVar);
        return true;
    }

    @Override // b5.d
    public void q(String str) {
        k.f("value", str);
        h0(str);
    }

    @Override // b5.d
    public abstract void r(Y4.a aVar, Object obj);

    public abstract void z0(W0.f fVar, W0.f fVar2);
}
