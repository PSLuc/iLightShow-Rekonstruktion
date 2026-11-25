package com.fasterxml.jackson.databind.deser.std;

import B.AbstractC0013g0;
import B.C0005c0;
import B.d1;
import G0.AbstractC0111g;
import G0.AbstractC0116l;
import G0.C0105a;
import G0.C0108d;
import G0.C0110f;
import L.C0138f1;
import L.C0148j;
import L.J0;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import N3.C0253a;
import N3.C0257c;
import N3.C0265g;
import N3.P0;
import P4.AbstractC0314a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.Window;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ResourceResolutionException;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.google.android.gms.internal.play_billing.E1;
import com.google.android.gms.internal.play_billing.F1;
import com.google.android.gms.internal.play_billing.G0;
import com.google.android.gms.internal.play_billing.G1;
import com.google.android.gms.internal.play_billing.H1;
import com.google.android.gms.internal.play_billing.I1;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import org.xmlpull.v1.XmlPullParserException;
import p015c2.AbstractC0473d;
import p035g0.AbstractC0712m;
import p035g0.C0704e;
import p035g0.C0713n;
import p035g0.C0715p;
import p058l0.AbstractC0819b;
import p058l0.C0821d;
import p058l0.C0822e;
import p058l0.C0823f;
import p123x.AbstractC1084q;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 implements R3.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static C0823f f7585h;
    public static C0823f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static C0823f f7586j;

    public static final void A(float[] fArr, float[] fArr2, int i3, float[] fArr3) {
        if (i3 == 0) {
            p027e3.a.x0("At least one point must be provided");
            throw null;
        }
        int i6 = 2 >= i3 ? i3 - 1 : 2;
        int i7 = i6 + 1;
        float[][] fArr4 = new float[i7][];
        for (int i8 = 0; i8 < i7; i8++) {
            fArr4[i8] = new float[i3];
        }
        for (int i9 = 0; i9 < i3; i9++) {
            fArr4[0][i9] = 1.0f;
            for (int i10 = 1; i10 < i7; i10++) {
                fArr4[i10][i9] = fArr4[i10 - 1][i9] * fArr[i9];
            }
        }
        float[][] fArr5 = new float[i7][];
        for (int i11 = 0; i11 < i7; i11++) {
            fArr5[i11] = new float[i3];
        }
        float[][] fArr6 = new float[i7][];
        for (int i12 = 0; i12 < i7; i12++) {
            fArr6[i12] = new float[i7];
        }
        int i13 = 0;
        while (i13 < i7) {
            float[] fArr7 = fArr5[i13];
            float[] fArr8 = fArr4[i13];
            E4.k.f("<this>", fArr8);
            E4.k.f("destination", fArr7);
            System.arraycopy(fArr8, 0, fArr7, 0, i3);
            for (int i14 = 0; i14 < i13; i14++) {
                float[] fArr9 = fArr5[i14];
                float fN = n(fArr7, fArr9);
                for (int i15 = 0; i15 < i3; i15++) {
                    fArr7[i15] = fArr7[i15] - (fArr9[i15] * fN);
                }
            }
            float fSqrt = (float) Math.sqrt(n(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f6 = 1.0f / fSqrt;
            for (int i16 = 0; i16 < i3; i16++) {
                fArr7[i16] = fArr7[i16] * f6;
            }
            float[] fArr10 = fArr6[i13];
            int i17 = 0;
            while (i17 < i7) {
                fArr10[i17] = i17 < i13 ? 0.0f : n(fArr7, fArr4[i17]);
                i17++;
            }
            i13++;
        }
        for (int i18 = i6; -1 < i18; i18--) {
            float fN2 = n(fArr5[i18], fArr2);
            float[] fArr11 = fArr6[i18];
            int i19 = i18 + 1;
            if (i19 <= i6) {
                int i20 = i6;
                while (true) {
                    fN2 -= fArr11[i20] * fArr3[i20];
                    if (i20 != i19) {
                        i20--;
                    }
                }
            }
            fArr3[i18] = fN2 / fArr11[i18];
        }
    }

    public static void B(Window window, boolean z5) {
        if (Build.VERSION.SDK_INT >= 30) {
            p045i1.G.a(window, z5);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z5 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static List C(Iterable iterable) {
        E4.k.f("<this>", iterable);
        List listV0 = p089q4.l.v0(iterable);
        Collections.shuffle(listV0);
        return listV0;
    }

    public static void D(D4.e eVar, AbstractC0314a abstractC0314a, AbstractC0314a abstractC0314a2) {
        try {
            U4.a.g(p084p4.x.f10867a, AbstractC0473d.F(AbstractC0473d.o(eVar, abstractC0314a, abstractC0314a2)));
        } catch (Throwable th) {
            abstractC0314a2.g(S1.V.v(th));
            throw th;
        }
    }

    public static final long F(long j4, long j6) {
        int iC;
        int iE = G0.I.e(j4);
        int iD = G0.I.d(j4);
        if (G0.I.e(j6) >= G0.I.d(j4) || G0.I.e(j4) >= G0.I.d(j6)) {
            if (iD > G0.I.e(j6)) {
                iE -= G0.I.c(j6);
                iC = G0.I.c(j6);
                iD -= iC;
            }
        } else if (G0.I.e(j6) > G0.I.e(j4) || G0.I.d(j4) > G0.I.d(j6)) {
            if (G0.I.e(j4) > G0.I.e(j6) || G0.I.d(j6) > G0.I.d(j4)) {
                int iE2 = G0.I.e(j6);
                if (iE >= G0.I.d(j6) || iE2 > iE) {
                    iD = G0.I.e(j6);
                } else {
                    iE = G0.I.e(j6);
                    iC = G0.I.c(j6);
                }
            } else {
                iC = G0.I.c(j6);
            }
            iD -= iC;
        } else {
            iE = G0.I.e(j6);
            iD = iE;
        }
        return AbstractC0599v0.d(iE, iD);
    }

    public static final Z.o G() {
        return androidx.compose.foundation.a.a(new p035g0.z(p089q4.m.M(new p035g0.r(p035g0.H.d(4279967013L)), new p035g0.r(p035g0.H.d(4278979599L))), p081p0.c.y(0.0f, 0.0f), p081p0.c.y(0.0f, Float.POSITIVE_INFINITY)));
    }

    public static int H(int i3) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i3) * (-862048943)), 15)) * 461845907);
    }

    public static H1 I(K3.e eVar) {
        F1 f6 = new F1();
        f6.f7847c = new I1();
        H1 h1 = new H1(f6);
        f6.f7846b = h1;
        f6.f7845a = eVar.getClass();
        try {
            f6.f7845a = eVar.n(f6);
            return h1;
        } catch (Exception e6) {
            G0 g6 = new G0(e6);
            p081p0.c cVar = E1.f7838f;
            G1 g7 = h1.f7857b;
            if (cVar.N0(g7, null, g6)) {
                E1.b(g7);
            }
            return h1;
        }
    }

    public static final void a(int i3, C0230o c0230o) {
        c0230o.X(905998906);
        if (i3 == 0 && c0230o.B()) {
            c0230o.P();
        } else {
            UMPreset uMPresetG = com.nanjoran.ilightshow.Services.M.f8305O.g();
            if (uMPresetG == null) {
                C0235q0 c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new C0253a(i3, 0);
                    return;
                }
                return;
            }
            c0230o.V(1557195102);
            Object objK = c0230o.K();
            N.U u6 = C0222k.f3714a;
            N.U u7 = N.U.f3673m;
            if (objK == u6) {
                objK = C0208d.K(Float.valueOf(uMPresetG.getAmbientBrightness()), u7);
                c0230o.f0(objK);
            }
            InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) objK;
            Object objD = AbstractC0013g0.d(1557198401, c0230o, false);
            if (objD == u6) {
                objD = C0208d.K(new J4.a(uMPresetG.getBrightnessMin(), uMPresetG.getBrightnessMax()), u7);
                c0230o.f0(objD);
            }
            c0230o.p(false);
            F1.I i6 = (F1.I) c0230o.k(P0.f4083b);
            C0208d.c(p084p4.x.f10867a, new defpackage.d(2), c0230o);
            J0.b(null, V.b.c(-1831280898, new C0257c(i6, 1), c0230o), null, null, null, 0, 0L, 0L, null, V.b.c(801546185, new C0265g((InterfaceC0203a0) objD, uMPresetG, interfaceC0203a0), c0230o), c0230o, 805306416, 509);
        }
        C0235q0 c0235q0T2 = c0230o.t();
        if (c0235q0T2 != null) {
            c0235q0T2.f3780d = new C0253a(i3, 1);
        }
    }

    public static final void f(p107u.l lVar, D4.a aVar, Z.o oVar, C0005c0 c0005c0, C0230o c0230o, int i3) {
        int i6;
        c0230o.X(645832757);
        if ((i3 & 6) == 0) {
            i6 = (c0230o.f(lVar) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= c0230o.h(aVar) ? 32 : 16;
        }
        int i7 = i6 | 384;
        if ((i3 & 3072) == 0) {
            i7 |= c0230o.h(c0005c0) ? 2048 : 1024;
        }
        if ((i7 & 1171) == 1170 && c0230o.B()) {
            c0230o.P();
        } else {
            oVar = Z.l.f5957a;
            p107u.k kVar = (p107u.k) lVar.f12638a.getValue();
            if (!(kVar instanceof p107u.j)) {
                C0235q0 c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new d1(lVar, aVar, c0005c0, i3);
                    return;
                }
                return;
            }
            boolean zF = c0230o.f(kVar);
            Object objK = c0230o.K();
            if (zF || objK == C0222k.f3714a) {
                objK = new p107u.f(S1.h0.w(((p107u.j) kVar).f12637a));
                c0230o.f0(objK);
            }
            p107u.o.c((p107u.f) objK, aVar, c0005c0, c0230o, i7 & 8176);
        }
        Z.o oVar2 = oVar;
        C0235q0 c0235q0T2 = c0230o.t();
        if (c0235q0T2 != null) {
            c0235q0T2.f3780d = new C0148j(lVar, aVar, oVar2, c0005c0, i3);
        }
    }

    public static final void g(p107u.l lVar, D4.a aVar, C0005c0 c0005c0, Z.l lVar2, boolean z5, V.a aVar2, C0230o c0230o, int i3) {
        int i6;
        C0005c0 c0005c1;
        Z.l lVar3;
        c0230o.X(-84584070);
        if ((i3 & 6) == 0) {
            i6 = (c0230o.f(lVar) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= c0230o.h(aVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            c0005c1 = c0005c0;
            i6 |= c0230o.h(c0005c1) ? HueLog.LogComponent.STREAMDTLS : 128;
        } else {
            c0005c1 = c0005c0;
        }
        int i7 = i6 | 3072;
        if ((i3 & 24576) == 0) {
            i7 |= c0230o.g(z5) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i3) == 0) {
            i7 |= c0230o.h(aVar2) ? 131072 : 65536;
        }
        if ((74899 & i7) == 74898 && c0230o.B()) {
            c0230o.P();
            lVar3 = lVar2;
        } else {
            lVar3 = Z.l.f5957a;
            Z.o oVarA = z5 ? p091r0.u.a(lVar3, p107u.e.f12621a, new p107u.c(lVar, null)) : lVar3;
            p113v0.F fE = AbstractC1084q.e(Z.b.f5933h, true);
            int i8 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
            Z.o oVarC = Z.a.c(c0230o, oVarA);
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(C1101i.f14041e, c0230o, fE);
            C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
            C1100h c1100h = C1101i.f14042f;
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i8))) {
                p012c.k.y(i8, c0230o, i8, c1100h);
            }
            C0208d.R(C1101i.f14039c, c0230o, oVarC);
            aVar2.d(c0230o, Integer.valueOf((i7 >> 15) & 14));
            f(lVar, aVar, null, c0005c1, c0230o, (i7 & WebSocketProtocol.PAYLOAD_SHORT) | ((i7 << 3) & 7168));
            c0230o.p(true);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0138f1(lVar, aVar, c0005c0, lVar3, z5, aVar2, i3);
        }
    }

    public static C0105a h(String str, G0.J j4, long j6, S0.b bVar, L0.d dVar, int i3, int i6) {
        p089q4.u uVar = p089q4.u.f11237h;
        return new C0105a(new O0.d(str, j4, uVar, uVar, dVar, bVar), i3, false, j6);
    }

    public static final void i(p097s0.c cVar, p091r0.q qVar) {
        boolean zA = p091r0.o.a(qVar);
        p097s0.b bVar = cVar.f12158b;
        p097s0.b bVar2 = cVar.f12157a;
        if (zA) {
            p097s0.a[] aVarArr = bVar2.f12152b;
            p089q4.k.j0(0, aVarArr.length, aVarArr);
            bVar2.f12153c = 0;
            p097s0.a[] aVarArr2 = bVar.f12152b;
            p089q4.k.j0(0, aVarArr2.length, aVarArr2);
            bVar.f12153c = 0;
            cVar.f12159c = 0L;
        }
        boolean zC = p091r0.o.c(qVar);
        long j4 = qVar.f11509b;
        if (!zC) {
            List list = qVar.f11517k;
            if (list == null) {
                list = p089q4.u.f11237h;
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                p091r0.c cVar2 = (p091r0.c) list.get(i3);
                long j6 = cVar2.f11472a;
                long j7 = cVar2.f11474c;
                bVar2.a(p030f0.c.d(j7), j6);
                bVar.a(p030f0.c.e(j7), j6);
            }
            long j8 = qVar.f11518l;
            bVar2.a(p030f0.c.d(j8), j4);
            bVar.a(p030f0.c.e(j8), j4);
        }
        if (p091r0.o.c(qVar) && j4 - cVar.f12159c > 40) {
            p097s0.a[] aVarArr3 = bVar2.f12152b;
            p089q4.k.j0(0, aVarArr3.length, aVarArr3);
            bVar2.f12153c = 0;
            p097s0.a[] aVarArr4 = bVar.f12152b;
            p089q4.k.j0(0, aVarArr4.length, aVarArr4);
            bVar.f12153c = 0;
            cVar.f12159c = 0L;
        }
        cVar.f12159c = j4;
    }

    public static int j(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return Y0.q.a(new Y0.r(context).f5811a) ? 0 : -1;
    }

    public static final Z.o k(Z.o oVar, p035g0.M m6) {
        return androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, m6, true, 124927);
    }

    public static final Z.o l(Z.o oVar) {
        return androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 126975);
    }

    public static final double m(double d6, N4.c cVar, N4.c cVar2) {
        E4.k.f("targetUnit", cVar2);
        TimeUnit timeUnit = cVar2.f4336h;
        TimeUnit timeUnit2 = cVar.f4336h;
        long jConvert = timeUnit.convert(1L, timeUnit2);
        return jConvert > 0 ? d6 * jConvert : d6 / timeUnit2.convert(1L, timeUnit);
    }

    public static final float n(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f6 = 0.0f;
        for (int i3 = 0; i3 < length; i3++) {
            f6 += fArr[i3] * fArr2[i3];
        }
        return f6;
    }

    public static float o(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return p070n1.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final long p(double d6) {
        return y((float) d6, 4294967296L);
    }

    public static final long q(int i3) {
        return y(i3, 4294967296L);
    }

    public static final R0.h r(G0.G g6, int i3) {
        G0.F f6 = g6.f1458a;
        if (f6.f1449a.f1494h.length() != 0) {
            int iE = g6.e(i3);
            if ((i3 != 0 && iE == g6.e(i3 - 1)) || (i3 != f6.f1449a.f1494h.length() && iE == g6.e(i3 + 1))) {
                return g6.a(i3);
            }
        }
        return g6.i(i3);
    }

    public static final boolean s(C0110f c0110f) {
        int length = c0110f.f1494h.length();
        List list = c0110f.f1496k;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0108d c0108d = (C0108d) list.get(i3);
                if ((c0108d.f1490a instanceof AbstractC0116l) && AbstractC0111g.c(0, length, c0108d.f1491b, c0108d.f1492c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean t(byte b6) {
        return b6 > -65;
    }

    public static final boolean u(long j4) {
        S0.n[] nVarArr = S0.m.f4900b;
        return (j4 & 1095216660480L) == 0;
    }

    public static List v(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        E4.k.e("singletonList(...)", listSingletonList);
        return listSingletonList;
    }

    public static final int w(J4.d dVar) {
        H4.a aVar = H4.e.f1802h;
        E4.k.f("range", dVar);
        if (dVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + dVar);
        }
        int i3 = dVar.f1941h;
        int i6 = dVar.i;
        if (i6 < Integer.MAX_VALUE) {
            return H4.e.f1802h.d(i3, i6 + 1);
        }
        if (i3 <= Integer.MIN_VALUE) {
            return H4.e.f1802h.b();
        }
        return H4.e.f1802h.d(i3 - 1, i6) + 1;
    }

    public static float x(EdgeEffect edgeEffect, float f6, float f7) {
        if (Build.VERSION.SDK_INT >= 31) {
            return p070n1.c.c(edgeEffect, f6, f7);
        }
        p070n1.b.a(edgeEffect, f6, f7);
        return f6;
    }

    public static final long y(float f6, long j4) {
        long jFloatToIntBits = j4 | (((long) Float.floatToIntBits(f6)) & 4294967295L);
        S0.n[] nVarArr = S0.m.f4900b;
        return jFloatToIntBits;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:159:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:162:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:164:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:165:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:166:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:169:0x0434  */
    /* JADX WARN: Code duplicated, block: B:170:0x0439  */
    /* JADX WARN: Code duplicated, block: B:176:0x0455 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x0457  */
    /* JADX WARN: Code duplicated, block: B:178:0x045f  */
    /* JADX WARN: Code duplicated, block: B:185:0x047a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x047c  */
    /* JADX WARN: Code duplicated, block: B:188:0x0484  */
    /* JADX WARN: Code duplicated, block: B:191:0x0494  */
    /* JADX WARN: Code duplicated, block: B:192:0x0497  */
    /* JADX WARN: Code duplicated, block: B:195:0x049d  */
    /* JADX WARN: Code duplicated, block: B:259:0x04bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x019f  */
    public static final p053k0.b z(int i3, C0230o c0230o) {
        TypedValue typedValue;
        long jC;
        int i6;
        int i7;
        XmlResourceParser xmlResourceParser;
        int i8;
        int i9;
        int i10;
        int i11;
        float fA;
        K3.e eVarA;
        float fA2;
        float fA3;
        float fA4;
        float fA5;
        float fA6;
        int i12;
        Shader shader;
        AbstractC0712m o6;
        Shader shader2;
        AbstractC0712m o7;
        AbstractC0712m abstractC0712m;
        int i13;
        ColorStateList colorStateListA;
        int i14 = 1;
        Context context = (Context) c0230o.k(AndroidCompositionLocals_androidKt.f6730b);
        c0230o.k(AndroidCompositionLocals_androidKt.f6729a);
        Resources resources = context.getResources();
        C0.d dVar = (C0.d) c0230o.k(AndroidCompositionLocals_androidKt.f6732d);
        synchronized (dVar) {
            typedValue = (TypedValue) dVar.f602a.f(i3);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i3, typedValue, true);
                p080p.q qVar = dVar.f602a;
                int iD = qVar.d(i3);
                Object[] objArr = qVar.f10762c;
                Object obj = objArr[iD];
                qVar.f10761b[iD] = i3;
                objArr[iD] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !M4.l.c0(charSequence, ".xml")) {
            c0230o.V(-802884675);
            boolean zF = c0230o.f(context.getTheme()) | c0230o.f(charSequence) | c0230o.d(i3);
            Object objK = c0230o.K();
            if (zF || objK == C0222k.f3714a) {
                try {
                    Drawable drawable = resources.getDrawable(i3, null);
                    E4.k.d("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable", drawable);
                    objK = new C0704e(((BitmapDrawable) drawable).getBitmap());
                    c0230o.f0(objK);
                } catch (Exception e6) {
                    throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e6);
                }
            }
            C0704e c0704e = (C0704e) objK;
            p053k0.a aVar = new p053k0.a(c0704e, AbstractC0473d.b(c0704e.f9060a.getWidth(), c0704e.f9060a.getHeight()));
            c0230o.p(false);
            return aVar;
        }
        c0230o.V(-803040357);
        Resources.Theme theme = context.getTheme();
        int i15 = typedValue.changingConfigurations;
        C0.c cVar = (C0.c) c0230o.k(AndroidCompositionLocals_androidKt.f6731c);
        C0.b bVar = new C0.b(theme, i3);
        WeakReference weakReference = (WeakReference) cVar.f601a.get(bVar);
        C0.a aVar2 = weakReference != null ? (C0.a) weakReference.get() : null;
        if (aVar2 == null) {
            XmlResourceParser xml = resources.getXml(i3);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!E4.k.a(xml.getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            p063m0.a aVar3 = new p063m0.a(xml);
            TypedArray typedArrayE = p002a1.b.e(resources, theme, attributeSetAsAttributeSet, p063m0.b.f10406a);
            aVar3.b(typedArrayE.getChangingConfigurations());
            boolean z5 = !p002a1.b.b(xml, "autoMirrored") ? false : typedArrayE.getBoolean(5, false);
            aVar3.b(typedArrayE.getChangingConfigurations());
            float fA7 = aVar3.a(typedArrayE, "viewportWidth", 7, 0.0f);
            float fA8 = aVar3.a(typedArrayE, "viewportHeight", 8, 0.0f);
            if (fA7 <= 0.0f) {
                throw new XmlPullParserException(typedArrayE.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (fA8 <= 0.0f) {
                throw new XmlPullParserException(typedArrayE.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = typedArrayE.getDimension(3, 0.0f);
            aVar3.b(typedArrayE.getChangingConfigurations());
            float dimension2 = typedArrayE.getDimension(2, 0.0f);
            aVar3.b(typedArrayE.getChangingConfigurations());
            if (typedArrayE.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                typedArrayE.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    jC = p035g0.r.f9085l;
                } else {
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                        TypedValue typedValue3 = new TypedValue();
                        typedArrayE.getValue(1, typedValue3);
                        int i16 = typedValue3.type;
                        if (i16 == 2) {
                            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                        }
                        if (i16 < 28 || i16 > 31) {
                            Resources resources2 = typedArrayE.getResources();
                            int resourceId = typedArrayE.getResourceId(1, 0);
                            ThreadLocal threadLocal = p002a1.c.f6128a;
                            try {
                                colorStateListA = p002a1.c.a(resources2, resources2.getXml(resourceId), theme);
                            } catch (Exception unused) {
                                colorStateListA = null;
                            }
                        } else {
                            colorStateListA = ColorStateList.valueOf(typedValue3.data);
                        }
                    } else {
                        colorStateListA = null;
                    }
                    aVar3.b(typedArrayE.getChangingConfigurations());
                    jC = colorStateListA != null ? p035g0.H.c(colorStateListA.getDefaultColor()) : p035g0.r.f9085l;
                }
            } else {
                jC = p035g0.r.f9085l;
            }
            long j4 = jC;
            int i17 = typedArrayE.getInt(6, -1);
            aVar3.b(typedArrayE.getChangingConfigurations());
            if (i17 == -1) {
                i6 = 5;
            } else if (i17 == 3) {
                i6 = 3;
            } else if (i17 == 5) {
                i6 = 5;
            } else if (i17 != 9) {
                switch (i17) {
                    case 14:
                        i6 = 13;
                        break;
                    case 15:
                        i6 = 14;
                        break;
                    case 16:
                        i6 = 12;
                        break;
                    default:
                        i6 = 5;
                        break;
                }
            } else {
                i6 = 9;
            }
            float f6 = dimension / resources.getDisplayMetrics().density;
            float f7 = dimension2 / resources.getDisplayMetrics().density;
            typedArrayE.recycle();
            C0822e c0822e = new C0822e(null, f6, f7, fA7, fA8, j4, i6, z5, 1);
            int i18 = 0;
            while (xml.getEventType() != i14) {
                if (xml.getDepth() < i14) {
                    i7 = 3;
                    if (xml.getEventType() == 3) {
                        aVar2 = new C0.a(c0822e.b(), i15);
                        cVar.f601a.put(bVar, new WeakReference(aVar2));
                    }
                } else {
                    i7 = 3;
                }
                XmlResourceParser xmlResourceParser2 = aVar3.f10403a;
                int eventType = xmlResourceParser2.getEventType();
                int i19 = i14;
                if (eventType == 2) {
                    xmlResourceParser = xml;
                    String name = xmlResourceParser2.getName();
                    if (name != null) {
                        int iHashCode = name.hashCode();
                        List listV = p089q4.u.f11237h;
                        C0715p c0715p = aVar3.f10405c;
                        if (iHashCode != -1649314686) {
                            i18 = i18;
                            if (iHashCode != 3433509) {
                                if (iHashCode == 98629247 && name.equals("group")) {
                                    TypedArray typedArrayE2 = p002a1.b.e(resources, theme, attributeSetAsAttributeSet, p063m0.b.f10407b);
                                    aVar3.b(typedArrayE2.getChangingConfigurations());
                                    float fA9 = aVar3.a(typedArrayE2, "rotation", 5, 0.0f);
                                    float f8 = typedArrayE2.getFloat(i19, 0.0f);
                                    aVar3.b(typedArrayE2.getChangingConfigurations());
                                    float f9 = typedArrayE2.getFloat(2, 0.0f);
                                    aVar3.b(typedArrayE2.getChangingConfigurations());
                                    float fA10 = aVar3.a(typedArrayE2, "scaleX", 3, 1.0f);
                                    float fA11 = aVar3.a(typedArrayE2, "scaleY", 4, 1.0f);
                                    float fA12 = aVar3.a(typedArrayE2, "translateX", 6, 0.0f);
                                    float fA13 = aVar3.a(typedArrayE2, "translateY", 7, 0.0f);
                                    String string = typedArrayE2.getString(0);
                                    aVar3.b(typedArrayE2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    typedArrayE2.recycle();
                                    int i20 = p058l0.G.f10217a;
                                    if (c0822e.f10280k) {
                                        p027e3.a.y0("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        throw null;
                                    }
                                    c0822e.i.add(new C0821d(str, fA9, f8, f9, fA10, fA11, fA12, fA13, listV, HueLog.LogComponent.APPCORE));
                                }
                            } else if (name.equals("path")) {
                                TypedArray typedArrayE3 = p002a1.b.e(resources, theme, attributeSetAsAttributeSet, p063m0.b.f10408c);
                                aVar3.b(typedArrayE3.getChangingConfigurations());
                                if (xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    throw new IllegalArgumentException("No path data available");
                                }
                                String string2 = typedArrayE3.getString(0);
                                aVar3.b(typedArrayE3.getChangingConfigurations());
                                String str2 = string2 == null ? "" : string2;
                                String string3 = typedArrayE3.getString(2);
                                aVar3.b(typedArrayE3.getChangingConfigurations());
                                if (string3 == null) {
                                    int i21 = p058l0.G.f10217a;
                                } else {
                                    listV = C0715p.v(c0715p, string3);
                                }
                                List list = listV;
                                K3.e eVarA2 = p002a1.b.a(typedArrayE3, aVar3.f10403a, theme, "fillColor", 1);
                                aVar3.b(typedArrayE3.getChangingConfigurations());
                                float fA14 = aVar3.a(typedArrayE3, "fillAlpha", 12, 1.0f);
                                int i22 = !p002a1.b.b(aVar3.f10403a, "strokeLineCap") ? -1 : typedArrayE3.getInt(8, -1);
                                aVar3.b(typedArrayE3.getChangingConfigurations());
                                if (i22 != 0) {
                                    if (i22 != 1) {
                                        i8 = 2;
                                        if (i22 == 2) {
                                            i9 = 2;
                                        }
                                    } else {
                                        i8 = 2;
                                        i9 = 1;
                                    }
                                    if (p002a1.b.b(aVar3.f10403a, "strokeLineJoin")) {
                                        i10 = typedArrayE3.getInt(9, -1);
                                    } else {
                                        i10 = -1;
                                    }
                                    aVar3.b(typedArrayE3.getChangingConfigurations());
                                    if (i10 != 0) {
                                        i11 = 0;
                                    } else if (i10 != 1) {
                                        i11 = i8;
                                    } else {
                                        i11 = 1;
                                    }
                                    fA = aVar3.a(typedArrayE3, "strokeMiterLimit", 10, 1.0f);
                                    eVarA = p002a1.b.a(typedArrayE3, aVar3.f10403a, theme, "strokeColor", 3);
                                    aVar3.b(typedArrayE3.getChangingConfigurations());
                                    fA2 = aVar3.a(typedArrayE3, "strokeAlpha", 11, 1.0f);
                                    fA3 = aVar3.a(typedArrayE3, "strokeWidth", 4, 1.0f);
                                    fA4 = aVar3.a(typedArrayE3, "trimPathEnd", 6, 1.0f);
                                    fA5 = aVar3.a(typedArrayE3, "trimPathOffset", 7, 0.0f);
                                    fA6 = aVar3.a(typedArrayE3, "trimPathStart", 5, 0.0f);
                                    if (p002a1.b.b(aVar3.f10403a, "fillType")) {
                                        i12 = typedArrayE3.getInt(13, 0);
                                    } else {
                                        i12 = 0;
                                    }
                                    aVar3.b(typedArrayE3.getChangingConfigurations());
                                    typedArrayE3.recycle();
                                    shader = (Shader) eVarA2.f2139c;
                                    if (shader == null && eVarA2.f2138b == 0) {
                                        o6 = null;
                                    } else if (shader != null) {
                                        o6 = new C0713n(shader);
                                    } else {
                                        o6 = new p035g0.O(p035g0.H.c(eVarA2.f2138b));
                                    }
                                    shader2 = (Shader) eVarA.f2139c;
                                    if (shader2 != null && eVarA.f2138b == 0) {
                                        abstractC0712m = null;
                                    } else {
                                        if (shader2 != null) {
                                            o7 = new C0713n(shader2);
                                        } else {
                                            o7 = new p035g0.O(p035g0.H.c(eVarA.f2138b));
                                        }
                                        abstractC0712m = o7;
                                    }
                                    if (i12 == 0) {
                                        i13 = 0;
                                    } else {
                                        i13 = 1;
                                    }
                                    if (!c0822e.f10280k) {
                                        p027e3.a.y0("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        throw null;
                                    }
                                    ArrayList arrayList = c0822e.i;
                                    ((C0821d) arrayList.get(arrayList.size() - 1)).f10270j.add(new p058l0.K(str2, list, i13, o6, fA14, abstractC0712m, fA2, fA3, i9, i11, fA, fA6, fA4, fA5));
                                } else {
                                    i8 = 2;
                                }
                                i9 = 0;
                                if (p002a1.b.b(aVar3.f10403a, "strokeLineJoin")) {
                                    i10 = -1;
                                } else {
                                    i10 = typedArrayE3.getInt(9, -1);
                                }
                                aVar3.b(typedArrayE3.getChangingConfigurations());
                                if (i10 != 0) {
                                    i11 = 0;
                                } else if (i10 != 1) {
                                    i11 = i8;
                                } else {
                                    i11 = 1;
                                }
                                fA = aVar3.a(typedArrayE3, "strokeMiterLimit", 10, 1.0f);
                                eVarA = p002a1.b.a(typedArrayE3, aVar3.f10403a, theme, "strokeColor", 3);
                                aVar3.b(typedArrayE3.getChangingConfigurations());
                                fA2 = aVar3.a(typedArrayE3, "strokeAlpha", 11, 1.0f);
                                fA3 = aVar3.a(typedArrayE3, "strokeWidth", 4, 1.0f);
                                fA4 = aVar3.a(typedArrayE3, "trimPathEnd", 6, 1.0f);
                                fA5 = aVar3.a(typedArrayE3, "trimPathOffset", 7, 0.0f);
                                fA6 = aVar3.a(typedArrayE3, "trimPathStart", 5, 0.0f);
                                if (p002a1.b.b(aVar3.f10403a, "fillType")) {
                                    i12 = 0;
                                } else {
                                    i12 = typedArrayE3.getInt(13, 0);
                                }
                                aVar3.b(typedArrayE3.getChangingConfigurations());
                                typedArrayE3.recycle();
                                shader = (Shader) eVarA2.f2139c;
                                if (shader == null) {
                                    o6 = null;
                                } else if (shader != null) {
                                    o6 = new C0713n(shader);
                                } else {
                                    o6 = new p035g0.O(p035g0.H.c(eVarA2.f2138b));
                                }
                                shader2 = (Shader) eVarA.f2139c;
                                if (shader2 != null) {
                                    if (shader2 != null) {
                                        o7 = new C0713n(shader2);
                                    } else {
                                        o7 = new p035g0.O(p035g0.H.c(eVarA.f2138b));
                                    }
                                    abstractC0712m = o7;
                                } else {
                                    abstractC0712m = null;
                                }
                                if (i12 == 0) {
                                    i13 = 0;
                                } else {
                                    i13 = 1;
                                }
                                if (!c0822e.f10280k) {
                                    p027e3.a.y0("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    throw null;
                                }
                                ArrayList arrayList2 = c0822e.i;
                                ((C0821d) arrayList2.get(arrayList2.size() - 1)).f10270j.add(new p058l0.K(str2, list, i13, o6, fA14, abstractC0712m, fA2, fA3, i9, i11, fA, fA6, fA4, fA5));
                            } else {
                                i19 = 1;
                                i18 = i18;
                            }
                            i19 = 1;
                        } else {
                            i18 = i18;
                            if (name.equals("clip-path")) {
                                TypedArray typedArrayE4 = p002a1.b.e(resources, theme, attributeSetAsAttributeSet, p063m0.b.f10409d);
                                aVar3.b(typedArrayE4.getChangingConfigurations());
                                String string4 = typedArrayE4.getString(0);
                                aVar3.b(typedArrayE4.getChangingConfigurations());
                                String str3 = string4 == null ? "" : string4;
                                String string5 = typedArrayE4.getString(1);
                                aVar3.b(typedArrayE4.getChangingConfigurations());
                                if (string5 == null) {
                                    int i23 = p058l0.G.f10217a;
                                } else {
                                    listV = C0715p.v(c0715p, string5);
                                }
                                List list2 = listV;
                                typedArrayE4.recycle();
                                if (c0822e.f10280k) {
                                    p027e3.a.y0("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    throw null;
                                }
                                c0822e.i.add(new C0821d(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, HueLog.LogComponent.APPCORE));
                                i19 = 1;
                                i18++;
                            } else {
                                i19 = 1;
                                i18 = i18;
                            }
                        }
                    } else {
                        i18 = i18;
                    }
                    i18 = i18;
                } else if (eventType == i7 && "group".equals(xmlResourceParser2.getName())) {
                    int i24 = i18 + 1;
                    int i25 = 0;
                    while (i25 < i24) {
                        if (c0822e.f10280k) {
                            p027e3.a.y0("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            throw null;
                        }
                        ArrayList arrayList3 = c0822e.i;
                        C0821d c0821d = (C0821d) arrayList3.remove(arrayList3.size() - 1);
                        ((C0821d) arrayList3.get(arrayList3.size() - 1)).f10270j.add(new p058l0.F(c0821d.f10262a, c0821d.f10263b, c0821d.f10264c, c0821d.f10265d, c0821d.f10266e, c0821d.f10267f, c0821d.f10268g, c0821d.f10269h, c0821d.i, c0821d.f10270j));
                        i25++;
                        xml = xml;
                    }
                    xmlResourceParser = xml;
                    i18 = 0;
                } else {
                    xmlResourceParser = xml;
                    i18 = i18;
                    i18 = i18;
                }
                xmlResourceParser.next();
                i14 = i19;
                xml = xmlResourceParser;
            }
            aVar2 = new C0.a(c0822e.b(), i15);
            cVar.f601a.put(bVar, new WeakReference(aVar2));
        }
        p058l0.J jC2 = AbstractC0819b.c(aVar2.f597a, c0230o);
        c0230o.p(false);
        return jC2;
    }

    public abstract void E(R3.g gVar);

    @Override // R3.f
    public void e(R3.g gVar) {
        try {
            E(gVar);
        } catch (NullPointerException e6) {
            throw e6;
        } catch (Throwable th) {
            p027e3.a.w0(th);
            G4.a.A(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
