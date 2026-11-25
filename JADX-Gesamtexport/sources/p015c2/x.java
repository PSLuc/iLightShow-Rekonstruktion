package p015c2;

import K.y;
import Y1.f;
import c5.C0495p;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import p071n2.e;
import p077o2.q;
import p093r2.h;
import p098s2.m;
import p109u2.C;
import p109u2.n;
import p115v2.o;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x f7328k = new x(null, null, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f7329h;
    public final o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f7330j;

    public x(h hVar, o oVar, e eVar) {
        this.f7329h = hVar;
        this.i = oVar;
        this.f7330j = eVar;
    }

    public final void a(f fVar, l lVar, h hVar) {
        o oVarO0;
        o oVar;
        A a6;
        C c6 = hVar.f7226j;
        o oVarP0 = this.i;
        h hVar2 = this.f7329h;
        e eVar = this.f7330j;
        if (eVar != null) {
            hVar.f11759x = fVar;
            if (hVar2 != null) {
                if (!hVar2.f7281k.isAssignableFrom(lVar.getClass())) {
                    hVar.e0(lVar, hVar2);
                }
            }
            if (oVarP0 == null) {
                oVarP0 = (hVar2 == null || !hVar2.k0()) ? hVar.p0(lVar.getClass(), null) : hVar.o0(hVar2, null);
            }
            c6.getClass();
            boolean zP = c6.p(D.WRAP_ROOT_VALUE);
            if (zP) {
                fVar.o0();
                A a7 = c6.f8723m.a(lVar.getClass(), c6);
                V1.h hVar3 = a7.f7196j;
                if (hVar3 == null) {
                    hVar3 = new V1.h(a7.f7195h);
                    a7.f7196j = hVar3;
                }
                fVar.Q(hVar3);
            }
            try {
                oVarP0.serializeWithType(lVar, fVar, hVar, eVar);
                if (zP) {
                    fVar.M();
                    return;
                }
                return;
            } catch (Exception e6) {
                throw h.A0(fVar, e6);
            }
        }
        if (oVarP0 != null) {
            hVar.f11759x = fVar;
            if (hVar2 != null) {
                if (!hVar2.f7281k.isAssignableFrom(lVar.getClass())) {
                    hVar.e0(lVar, hVar2);
                }
            }
            c6.getClass();
            if (!c6.p(D.WRAP_ROOT_VALUE)) {
                try {
                    oVarP0.serialize(lVar, fVar, hVar);
                    return;
                } catch (Exception e7) {
                    throw h.A0(fVar, e7);
                }
            } else {
                n nVar = c6.f8723m;
                if (hVar2 == null) {
                    a6 = nVar.a(lVar.getClass(), c6);
                } else {
                    nVar.getClass();
                    a6 = nVar.a(hVar2.f7281k, c6);
                }
                hVar.z0(fVar, lVar, oVarP0, a6);
                return;
            }
        }
        if (hVar2 == null) {
            hVar.B0(fVar, lVar);
            return;
        }
        hVar.f11759x = fVar;
        Class<?> cls = lVar.getClass();
        Class cls2 = hVar2.f7281k;
        if (!cls2.isAssignableFrom(cls)) {
            hVar.e0(lVar, hVar2);
        }
        m mVar = hVar.f7233q;
        mVar.getClass();
        y yVar = mVar.f12186a[(hVar2.f7282l - 2) & mVar.f12187b];
        if (yVar == null) {
            oVarO0 = null;
            break;
        }
        if (!yVar.f2031b || !hVar2.equals((h) yVar.f2034e)) {
            while (true) {
                yVar = (y) yVar.f2033d;
                if (yVar == null) {
                    oVarO0 = null;
                    break;
                } else if (yVar.f2031b && hVar2.equals((h) yVar.f2034e)) {
                    oVarO0 = (o) yVar.f2032c;
                    break;
                }
            }
        } else {
            oVarO0 = (o) yVar.f2032c;
        }
        if (oVarO0 == null) {
            C0495p c0495p = hVar.f7228l;
            synchronized (c0495p) {
                oVar = (o) ((o) ((n) c0495p.i).f12708h).get(new C(hVar2, true));
            }
            if (oVar != null) {
                oVarO0 = oVar;
            } else {
                oVarO0 = hVar.o0(hVar2, null);
                q qVarP = hVar.f7227k.P(hVar.f7226j, hVar2);
                if (qVarP != null) {
                    oVarO0 = new p098s2.o(qVarP.g(null), oVarO0);
                }
                C0495p c0495p2 = hVar.f7228l;
                synchronized (c0495p2) {
                    try {
                        if (((o) ((n) c0495p2.i).f12708h).g(new C(hVar2, true), oVarO0, false) == null) {
                            ((AtomicReference) c0495p2.f7476j).set(null);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        c6.getClass();
        if (c6.p(D.WRAP_ROOT_VALUE)) {
            n nVar2 = c6.f8723m;
            nVar2.getClass();
            hVar.z0(fVar, lVar, oVarO0, nVar2.a(cls2, c6));
        } else {
            try {
                oVarO0.serialize(lVar, fVar, hVar);
            } catch (Exception e8) {
                throw h.A0(fVar, e8);
            }
        }
    }
}
