package p107u;

import A.e;
import A2.d;
import B.AbstractC0029o0;
import B.C0005c0;
import B.d1;
import E4.k;
import G0.J;
import L.C0148j;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import N.InterfaceC0225l0;
import S1.h0;
import V.a;
import V0.B;
import Z.b;
import Z.f;
import Z.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import okhttp3.internal.http2.Http2;
import p020d2.n;
import p035g0.H;
import p035g0.r;
import p123x.AbstractC1078k;
import p123x.AbstractC1088v;
import p123x.C1069b;
import p123x.C1075h;
import p123x.C1090x;
import p123x.C1091y;
import p123x.T;
import p123x.U;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f12645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12646b;

    static {
        f12645a = new B(1, (14 & 1) == 0, true);
        long j4 = r.f9080f;
        long j6 = r.f9076b;
        f12646b = new a(j4, j6, j6, r.b(0.38f, j6), r.b(0.38f, j6));
    }

    public static final void a(a aVar, a aVar2, C0230o c0230o, int i) {
        l lVar = l.f5957a;
        c0230o.X(-921259293);
        if ((((c0230o.f(aVar) ? 4 : 2) | i | (c0230o.f(lVar) ? 32 : 16)) & 147) == 146 && c0230o.B()) {
            c0230o.P();
        } else {
            Z.o oVarA = h0.A(androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.b(n.N(lVar, h.f12627d, e.a(h.f12628e), 28), aVar.f12607a, H.f9016a)), 0.0f, h.i, 1), h0.v(c0230o));
            C1090x c1090xA = AbstractC1088v.a(AbstractC1078k.f13779c, b.f5943s, c0230o, 0);
            int i3 = c0230o.f3744P;
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
            C0208d.R(C1101i.f14041e, c0230o, c1090xA);
            C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
            C1100h c1100h = C1101i.f14042f;
            if (c0230o.f3743O || !k.a(c0230o.K(), Integer.valueOf(i3))) {
                p012c.k.y(i3, c0230o, i3, c1100h);
            }
            C0208d.R(C1101i.f14039c, c0230o, oVarC);
            aVar2.c(C1091y.f13818a, c0230o, 54);
            c0230o.p(true);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new d(i, 11, aVar, aVar2);
        }
    }

    public static final void b(String str, boolean z5, a aVar, D4.a aVar2, C0230o c0230o, int i) {
        int i3;
        l lVar = l.f5957a;
        c0230o.X(791018367);
        if ((i & 6) == 0) {
            i3 = (c0230o.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.g(z5) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0230o.f(aVar) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c0230o.f(lVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c0230o.h(null) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= c0230o.h(aVar2) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && c0230o.B()) {
            c0230o.P();
        } else {
            f fVar = h.f12629f;
            C1069b c1069b = AbstractC1078k.f13777a;
            float f6 = h.f12631h;
            C1075h c1075h = new C1075h(f6);
            boolean z6 = ((i3 & 112) == 32) | ((458752 & i3) == 131072);
            Object objK = c0230o.K();
            if (z6 || objK == C0222k.f3714a) {
                objK = new m(z5, aVar2);
                c0230o.f0(objK);
            }
            Z.o oVarK = androidx.compose.foundation.a.f(lVar, z5, str, (D4.a) objK, 4).k(c.f6634a);
            float f7 = h.f12624a;
            float f8 = h.f12625b;
            float f9 = h.f12626c;
            Z.o oVarI = androidx.compose.foundation.layout.a.i(c.j(oVarK, f7, f9, f8, f9), f6, 0.0f, 2);
            U uA = T.a(c1075h, fVar, c0230o, 54);
            int i6 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
            Z.o oVarC = Z.a.c(c0230o, oVarI);
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
            if (c0230o.f3743O || !k.a(c0230o.K(), Integer.valueOf(i6))) {
                p012c.k.y(i6, c0230o, i6, c1100h);
            }
            C0208d.R(C1101i.f14039c, c0230o, oVarC);
            c0230o.V(554568909);
            c0230o.p(false);
            J j4 = new J(z5 ? aVar.f12608b : aVar.f12610d, h.f12632j, h.f12633k, h.f12635m, h.f12630g, h.f12634l, 16613240);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            AbstractC0029o0.b(str, new LayoutWeightElement(1.0f, true), j4, 0, false, 1, 0, c0230o, (i3 & 14) | 1572864, 440);
            c0230o.p(true);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new n(str, z5, aVar, aVar2, i);
        }
    }

    public static final void c(f fVar, D4.a aVar, C0005c0 c0005c0, C0230o c0230o, int i) {
        int i3;
        Object obj = l.f5957a;
        c0230o.X(712057293);
        if ((i & 6) == 0) {
            i3 = (c0230o.f(fVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0230o.f(obj) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c0230o.h(c0005c0) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && c0230o.B()) {
            c0230o.P();
        } else {
            Context context = (Context) c0230o.k(AndroidCompositionLocals_androidKt.f6730b);
            boolean zF = c0230o.f((Configuration) c0230o.k(AndroidCompositionLocals_androidKt.f6729a)) | c0230o.f(context);
            Object objK = c0230o.K();
            if (zF || objK == C0222k.f3714a) {
                a aVar2 = f12646b;
                long jC = aVar2.f12607a;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int iV = H.v(jC);
                int color = typedArrayObtainStyledAttributes.getColor(0, iV);
                typedArrayObtainStyledAttributes.recycle();
                if (color != iV) {
                    jC = H.c(color);
                }
                long j4 = jC;
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(0);
                typedArrayObtainStyledAttributes2.recycle();
                long jC2 = aVar2.f12608b;
                int iV2 = H.v(jC2);
                Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iV2)) : null;
                if (numValueOf != null && numValueOf.intValue() != iV2) {
                    jC2 = H.c(numValueOf.intValue());
                }
                long j6 = jC2;
                long jC3 = aVar2.f12610d;
                int iV3 = H.v(jC3);
                Integer numValueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iV3)) : null;
                if (numValueOf2 != null && numValueOf2.intValue() != iV3) {
                    jC3 = H.c(numValueOf2.intValue());
                }
                long j7 = jC3;
                Object aVar3 = new a(j4, j6, j6, j7, j7);
                c0230o.f0(aVar3);
                objK = aVar3;
            }
            d(fVar, aVar, (a) objK, c0005c0, c0230o, ((i3 << 3) & 57344) | (i3 & 1022));
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new d1(fVar, aVar, c0005c0, i);
        }
    }

    public static final void d(f fVar, D4.a aVar, a aVar2, C0005c0 c0005c0, C0230o c0230o, int i) {
        int i3;
        D4.a aVar3;
        C0230o c0230o2;
        f fVar2;
        l lVar = l.f5957a;
        c0230o.X(1447189339);
        if ((i & 6) == 0) {
            i3 = (c0230o.f(fVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0230o.f(lVar) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c0230o.f(aVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c0230o.h(c0005c0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i3 & 9363) == 9362 && c0230o.B()) {
            c0230o.P();
            aVar3 = aVar;
            c0230o2 = c0230o;
            fVar2 = fVar;
        } else {
            aVar3 = aVar;
            c0230o2 = c0230o;
            V0.l.a(fVar, aVar3, f12645a, V.b.c(795909757, new d(aVar2, c0005c0), c0230o), c0230o2, (i3 & 14) | 3456 | (i3 & 112), 0);
            fVar2 = fVar;
        }
        C0235q0 c0235q0T = c0230o2.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0148j(fVar2, aVar3, aVar2, c0005c0, i);
        }
    }
}
