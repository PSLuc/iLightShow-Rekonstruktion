package B;

import F.InterfaceC0070l;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import p123x.AbstractC1070c;

/* JADX INFO: renamed from: B.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0012g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f320b;

    static {
        float f6 = 25;
        f319a = f6;
        f320b = (f6 * 2.0f) / 2.4142137f;
    }

    public static final void a(InterfaceC0070l interfaceC0070l, Z.o oVar, long j4, C0230o c0230o, int i) {
        int i3;
        c0230o.X(1776202187);
        int i6 = (c0230o.f(interfaceC0070l) ? 4 : 2) | i | (c0230o.f(oVar) ? 32 : 16) | 128;
        if ((i6 & 147) == 146 && c0230o.B()) {
            c0230o.P();
        } else {
            c0230o.R();
            if ((i & 1) == 0 || c0230o.z()) {
                i3 = i6 & (-897);
                j4 = 9205357640488583168L;
            } else {
                c0230o.P();
                i3 = i6 & (-897);
            }
            c0230o.q();
            int i7 = i3 & 14;
            boolean z5 = i7 == 4;
            Object objK = c0230o.K();
            if (z5 || objK == C0222k.f3714a) {
                objK = new A2.e(1, interfaceC0070l);
                c0230o.f0(objK);
            }
            S1.V.c(interfaceC0070l, Z.b.i, V.b.c(-1653527038, new C0000a(0, j4, E0.i.a(oVar, false, (D4.c) objK)), c0230o), c0230o, i7 | 432);
        }
        long j6 = j4;
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0002b(interfaceC0070l, oVar, j6, i);
        }
    }

    public static final void b(Z.o oVar, C0230o c0230o, int i, int i3) {
        int i6;
        c0230o.X(694251107);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i6 = i | 6;
        } else if ((i & 6) == 0) {
            i6 = (c0230o.f(oVar) ? 4 : 2) | i;
        } else {
            i6 = i;
        }
        if ((i6 & 3) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            if (i7 != 0) {
                oVar = Z.l.f5957a;
            }
            AbstractC1070c.b(c0230o, Z.a.a(androidx.compose.foundation.layout.c.i(oVar, f320b, f319a), C0010f.f311h));
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0004c(oVar, i, i3);
        }
    }
}
