package B;

import G0.AbstractC0116l;
import G0.C0107c;
import G0.C0108d;
import G0.C0110f;
import N.C0208d;
import N.C0217h0;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import N.InterfaceC0203a0;
import android.graphics.Matrix;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p035g0.C0706g;
import p123x.AbstractC1084q;
import p130y0.AbstractC1124c0;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0110f f315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0217h0 f316b = C0208d.K(null, N.U.f3673m);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0110f f317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X.s f318d;

    public f1(C0110f c0110f) {
        G0.C c6;
        this.f315a = c0110f;
        C0107c c0107c = new C0107c(c0110f);
        List listA = c0110f.a(c0110f.f1494h.length());
        int size = listA.size();
        for (int i = 0; i < size; i++) {
            C0108d c0108d = (C0108d) listA.get(i);
            G0.H hA = ((AbstractC0116l) c0108d.f1490a).a();
            if (hA != null && (c6 = hA.f1464a) != null) {
                c0107c.a(c6, c0108d.f1491b, c0108d.f1492c);
            }
        }
        this.f317c = c0107c.c();
        this.f318d = new X.s();
    }

    public final void a(int i, C0230o c0230o) {
        G0.G g6;
        C0706g c0706gJ;
        Z.o oVarK;
        c0230o.X(1154651354);
        int i3 = i | (c0230o.h(this) ? 4 : 2);
        if ((i3 & 3) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            Object obj = (p130y0.T) c0230o.k(AbstractC1124c0.f14376p);
            C0110f c0110f = this.f317c;
            List listA = c0110f.a(c0110f.f1494h.length());
            int size = listA.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0108d c0108d = (C0108d) listA.get(i6);
                if (((Boolean) new C0037t(this, 2).invoke()).booleanValue() && (g6 = (G0.G) this.f316b.getValue()) != null) {
                    int i7 = c0108d.f1491b;
                    int i8 = c0108d.f1492c;
                    c0706gJ = g6.j(i7, i8);
                    int i9 = c0108d.f1491b;
                    p030f0.d dVarB = g6.b(i9);
                    long jY = p081p0.c.y(g6.e(i9) == g6.e(i8) ? Math.min(g6.b(i8 - 1).f8839a, dVarB.f8839a) : 0.0f, dVarB.f8840b) ^ (-9223372034707292160L);
                    Matrix matrix = c0706gJ.f9066d;
                    if (matrix == null) {
                        c0706gJ.f9066d = new Matrix();
                    } else {
                        matrix.reset();
                    }
                    Matrix matrix2 = c0706gJ.f9066d;
                    E4.k.c(matrix2);
                    matrix2.setTranslate(p030f0.c.d(jY), p030f0.c.e(jY));
                    Matrix matrix3 = c0706gJ.f9066d;
                    E4.k.c(matrix3);
                    c0706gJ.f9063a.transform(matrix3);
                } else {
                    c0706gJ = null;
                }
                C0025m0 c0025m0 = c0706gJ != null ? new C0025m0(1, c0706gJ) : null;
                Z.o oVar = Z.l.f5957a;
                if (c0025m0 != null && (oVarK = com.fasterxml.jackson.databind.deser.std.d0.k(oVar, c0025m0)) != null) {
                    oVar = oVarK;
                }
                Object objK = c0230o.K();
                Object obj2 = C0222k.f3714a;
                if (objK == obj2) {
                    objK = new p117w.m();
                    c0230o.f0(objK);
                }
                p117w.m mVar = (p117w.m) objK;
                Z.o oVarH = androidx.compose.foundation.a.h(oVar.k(new i1(new b1(this, c0108d.f1491b, c0108d.f1492c))), mVar);
                p091r0.m.f11503a.getClass();
                Z.o oVarF = p091r0.o.f(oVarH, p091r0.o.f11505b);
                boolean zH = c0230o.h(this) | c0230o.f(c0108d) | c0230o.h(obj);
                Object objK2 = c0230o.K();
                if (zH || objK2 == obj2) {
                    objK2 = new c1(this, c0108d, obj, 0);
                    c0230o.f0(objK2);
                }
                AbstractC1084q.a(androidx.compose.foundation.a.g(oVarF, mVar, (D4.a) objK2), c0230o, 0);
                Object objK3 = c0230o.K();
                if (objK3 == obj2) {
                    objK3 = C0208d.K(Boolean.FALSE, N.U.f3673m);
                    c0230o.f0(objK3);
                }
                InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) objK3;
                Object objK4 = c0230o.K();
                if (objK4 == obj2) {
                    objK4 = new p117w.k(mVar, interfaceC0203a0, null);
                    c0230o.f0(objK4);
                }
                C0208d.e((D4.e) objK4, c0230o, mVar);
                InterfaceC0203a0 interfaceC0203a0Q = p027e3.a.Q(mVar, c0230o, 6);
                InterfaceC0203a0 interfaceC0203a0Q2 = p081p0.c.Q(mVar, c0230o, 6);
                Boolean bool = (Boolean) interfaceC0203a0.getValue();
                bool.getClass();
                Boolean bool2 = (Boolean) interfaceC0203a0Q.getValue();
                bool2.getClass();
                Boolean bool3 = (Boolean) interfaceC0203a0Q2.getValue();
                bool3.getClass();
                AbstractC0116l abstractC0116l = (AbstractC0116l) c0108d.f1490a;
                G0.H hA = abstractC0116l.a();
                G0.C c6 = hA != null ? hA.f1464a : null;
                G0.H hA2 = abstractC0116l.a();
                G0.C c7 = hA2 != null ? hA2.f1465b : null;
                G0.H hA3 = abstractC0116l.a();
                G0.C c8 = hA3 != null ? hA3.f1466c : null;
                G0.H hA4 = abstractC0116l.a();
                Object[] objArr = {bool, bool2, bool3, c6, c7, c8, hA4 != null ? hA4.f1467d : null};
                boolean zH2 = c0230o.h(this) | c0230o.f(c0108d) | c0230o.f(interfaceC0203a0Q) | c0230o.f(interfaceC0203a0) | c0230o.f(interfaceC0203a0Q2);
                Object objK5 = c0230o.K();
                if (zH2 || objK5 == obj2) {
                    Object f6 = new F0(this, c0108d, interfaceC0203a0Q, interfaceC0203a0, interfaceC0203a0Q2, 1);
                    c0230o.f0(f6);
                    objK5 = f6;
                }
                b(objArr, (D4.c) objK5, c0230o, (i3 << 6) & 896);
            }
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0003b0(i, 2, this);
        }
    }

    public final void b(Object[] objArr, D4.c cVar, C0230o c0230o, int i) {
        c0230o.X(-2083052099);
        int i3 = (i & 48) == 0 ? (c0230o.h(cVar) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i3 |= c0230o.h(this) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        c0230o.T(-416717687, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i3 |= c0230o.h(obj) ? 4 : 0;
        }
        c0230o.p(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if ((i3 & 147) == 146 && c0230o.B()) {
            c0230o.P();
        } else {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(cVar);
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
            }
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zH = ((i3 & 112) == 32) | c0230o.h(this);
            Object objK = c0230o.K();
            N.U u6 = C0222k.f3714a;
            if (zH || objK == u6) {
                objK = new C0005c0(this, 4, cVar);
                c0230o.f0(objK);
            }
            D4.c cVar2 = (D4.c) objK;
            boolean zF = false;
            for (Object obj2 : Arrays.copyOf(array, array.length)) {
                zF |= c0230o.f(obj2);
            }
            Object objK2 = c0230o.K();
            if (zF || objK2 == u6) {
                c0230o.f0(new N.E(cVar2));
            }
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new d1(this, objArr, cVar, i, 0);
        }
    }
}
