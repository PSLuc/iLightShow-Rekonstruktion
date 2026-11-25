package L;

import N.C0222k;
import N.C0230o;
import N.C0235q0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import p035g0.C0709j;
import p035g0.C0710k;
import p058l0.AbstractC0819b;
import p058l0.C0823f;
import p113v0.C1026i;
import p123x.AbstractC1084q;

/* JADX INFO: renamed from: L.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0149j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z.o f2803a = androidx.compose.foundation.layout.c.h(Z.l.f5957a, M.l.f3222a);

    /* JADX WARN: Code duplicated, block: B:79:0x0122  */
    public static final void a(p053k0.b bVar, String str, Z.o oVar, long j4, C0230o c0230o, int i) {
        p053k0.b bVar2;
        int i3;
        Object c0709j;
        Z.o oVarA;
        c0230o.X(-2142239481);
        if ((i & 6) == 0) {
            bVar2 = bVar;
            i3 = (c0230o.h(bVar2) ? 4 : 2) | i;
        } else {
            bVar2 = bVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0230o.f(oVar) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c0230o.e(j4) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && c0230o.B()) {
            c0230o.P();
        } else {
            c0230o.R();
            if ((i & 1) != 0 && !c0230o.z()) {
                c0230o.P();
            }
            c0230o.q();
            c0230o.W(69356724);
            boolean z5 = (((i3 & 7168) ^ 3072) > 2048 && c0230o.e(j4)) || (i3 & 3072) == 2048;
            Object objK = c0230o.K();
            N.U u6 = C0222k.f3714a;
            if (z5 || objK == u6) {
                c0709j = p035g0.r.c(j4, p035g0.r.f9085l) ? null : new C0709j(j4, 5, C0710k.f9071a.a(j4, 5));
                c0230o.f0(c0709j);
            } else {
                c0709j = objK;
            }
            C0709j c0709j2 = (C0709j) c0709j;
            c0230o.p(false);
            c0230o.W(69356847);
            Z.o oVar2 = Z.l.f5957a;
            if (str != null) {
                c0230o.W(69356912);
                boolean z6 = (i3 & 112) == 32;
                Object objK2 = c0230o.K();
                if (z6 || objK2 == u6) {
                    objK2 = new E0.j(str, 3);
                    c0230o.f0(objK2);
                }
                c0230o.p(false);
                oVarA = E0.i.a(oVar2, false, (D4.c) objK2);
            } else {
                oVarA = oVar2;
            }
            c0230o.p(false);
            if (p030f0.f.a(bVar2.d(), 9205357640488583168L)) {
                oVar2 = f2803a;
            } else {
                long jD = bVar2.d();
                if (Float.isInfinite(p030f0.f.d(jD)) && Float.isInfinite(p030f0.f.b(jD))) {
                    oVar2 = f2803a;
                }
            }
            AbstractC1084q.a(androidx.compose.ui.draw.a.d(oVar.k(oVar2), bVar2, null, C1026i.f13168a, 0.0f, c0709j2, 22).k(oVarA), c0230o, 0);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0146i0(bVar, str, oVar, j4, i);
        }
    }

    public static final void b(C0823f c0823f, String str, Z.o oVar, long j4, C0230o c0230o, int i, int i3) {
        C0230o c0230o2;
        String str2;
        Z.o oVar2;
        long j6;
        c0230o.X(-126890956);
        int i6 = (c0230o.f(c0823f) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i6 |= c0230o.f(str) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i6 |= 384;
        } else if ((i & 384) == 0) {
            i6 |= c0230o.f(oVar) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= ((i3 & 8) == 0 && c0230o.e(j4)) ? 2048 : 1024;
        }
        if ((i6 & 1171) == 1170 && c0230o.B()) {
            c0230o.P();
            c0230o2 = c0230o;
            j6 = j4;
            oVar2 = oVar;
            str2 = str;
        } else {
            c0230o.R();
            if ((i & 1) == 0 || c0230o.z()) {
                if (i7 != 0) {
                    oVar = Z.l.f5957a;
                }
                if ((i3 & 8) != 0) {
                    j4 = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                    i6 &= -7169;
                }
            } else {
                c0230o.P();
                if ((i3 & 8) != 0) {
                    i6 &= -7169;
                }
            }
            Z.o oVar3 = oVar;
            long j7 = j4;
            c0230o.q();
            c0230o2 = c0230o;
            a(AbstractC0819b.c(c0823f, c0230o), str, oVar3, j7, c0230o2, (i6 & 112) | 8 | (i6 & 896) | (i6 & 7168));
            str2 = str;
            oVar2 = oVar3;
            j6 = j7;
        }
        C0235q0 c0235q0T = c0230o2.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0143h0(c0823f, str2, oVar2, j6, i, i3);
        }
    }
}
