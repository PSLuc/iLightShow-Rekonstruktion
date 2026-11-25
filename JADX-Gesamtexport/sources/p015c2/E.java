package p015c2;

import B.AbstractC0013g0;
import K.y;
import S1.d0;
import c5.C0495p;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ser.std.C0545p;
import com.fasterxml.jackson.databind.ser.std.H;
import java.text.DateFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import p012c.k;
import p026e2.h;
import p046i2.C0766b;
import p046i2.r;
import p046i2.t;
import p077o2.q;
import p093r2.a;
import p093r2.e;
import p093r2.g;
import p093r2.j;
import p098s2.c;
import p098s2.m;
import p098s2.p;
import p098s2.s;
import p104t2.n;
import p109u2.C;
import p109u2.i;
import p109u2.l;
import p115v2.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class E extends AbstractC0473d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f7224t = new c(Object.class);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p f7225u = new p(0, 6, Object.class);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C f7226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f7227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0495p f7228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient h f7229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p f7230n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0545p f7231o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f7232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f7233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DateFormat f7234r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f7235s;

    public E() {
        this.f7230n = f7225u;
        this.f7231o = C0545p.i;
        this.f7232p = f7224t;
        this.f7226j = null;
        this.f7227k = null;
        this.f7228l = new C0495p(21);
        this.f7233q = null;
        this.f7229m = null;
        this.f7235s = true;
    }

    @Override // p015c2.AbstractC0473d
    public final n A() {
        return this.f7226j.i.f8680h;
    }

    @Override // p015c2.AbstractC0473d
    public final Object O(String str) {
        throw new InvalidDefinitionException(((p093r2.h) this).f11759x, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o a0(h hVar) throws JsonMappingException {
        try {
            o oVarC0 = c0(hVar);
            if (oVarC0 == 0) {
                return oVarC0;
            }
            C0495p c0495p = this.f7228l;
            synchronized (c0495p) {
                try {
                    p109u2.n nVar = (p109u2.n) c0495p.i;
                    if (((o) nVar.f12708h).g(new C(hVar, false), oVarC0, false) == null) {
                        ((AtomicReference) c0495p.f7476j).set(null);
                    }
                    if (oVarC0 instanceof j) {
                        ((j) oVarC0).a(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return oVarC0;
        } catch (IllegalArgumentException e6) {
            throw new JsonMappingException(((p093r2.h) this).f11759x, i.i(e6), e6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o b0(Class cls) throws InvalidDefinitionException {
        h hVarC = this.f7226j.c(cls);
        try {
            o oVarC0 = c0(hVarC);
            if (oVarC0 == 0) {
                return oVarC0;
            }
            C0495p c0495p = this.f7228l;
            synchronized (c0495p) {
                try {
                    p109u2.n nVar = (p109u2.n) c0495p.i;
                    Object objG = ((o) nVar.f12708h).g(new C(cls, false), oVarC0, false);
                    p109u2.n nVar2 = (p109u2.n) c0495p.i;
                    Object objG2 = ((o) nVar2.f12708h).g(new C(hVarC, false), oVarC0, false);
                    if (objG == null || objG2 == null) {
                        ((AtomicReference) c0495p.f7476j).set(null);
                    }
                    if (oVarC0 instanceof j) {
                        ((j) oVarC0).a(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return oVarC0;
        } catch (IllegalArgumentException e6) {
            O(i.i(e6));
            throw null;
        }
    }

    public final o c0(h hVar) throws InvalidDefinitionException {
        e eVar = this.f7227k;
        eVar.getClass();
        C c6 = this.f7226j;
        r rVarO = c6.o(hVar);
        C0766b c0766b = rVarO.f9566e;
        o oVarR = a.R(this, c0766b);
        if (oVarR != null) {
            return oVarR;
        }
        boolean z5 = false;
        try {
            h hVarP0 = c6.d().p0(c6, c0766b, hVar);
            if (hVarP0 != hVar) {
                if (!hVarP0.h0(hVar.f7281k)) {
                    rVarO = c6.o(hVarP0);
                }
                z5 = true;
            }
            B b6 = rVarO.f9565d;
            l lVarA = b6 != null ? rVarO.a(b6.Q(rVarO.f9566e)) : null;
            if (lVarA == null) {
                return eVar.U(this, hVarP0, rVarO, z5);
            }
            A();
            Class cls = hVarP0.f7281k;
            h hVar2 = ((p037g2.m) lVarA).f9146a;
            if (!hVar2.h0(cls)) {
                rVarO = c6.o(hVar2);
                oVarR = a.R(this, rVarO.f9566e);
            }
            if (oVarR == null && !hVar2.m0()) {
                oVarR = eVar.U(this, hVar2, rVarO, true);
            }
            return new H(lVarA, hVar2, oVarR);
        } catch (JsonMappingException e6) {
            x0(rVarO, e6.getMessage(), new Object[0]);
            throw null;
        }
    }

    public final DateFormat d0() {
        DateFormat dateFormat = this.f7234r;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.f7226j.i.f8683l.clone();
        this.f7234r = dateFormat2;
        return dateFormat2;
    }

    public final void e0(l lVar, h hVar) {
        if (hVar.f7281k.isPrimitive() && i.G(hVar.f7281k).isAssignableFrom(lVar.getClass())) {
            return;
        }
        O(String.format("Incompatible types: declared root type (%s) vs %s", hVar, i.f(lVar)));
        throw null;
    }

    public final h f0(h hVar, Class cls) {
        return hVar.h0(cls) ? hVar : this.f7226j.i.f8680h.i(hVar, cls, true);
    }

    public final void g0(T1.e eVar) {
        if (this.f7235s) {
            eVar.V();
        } else {
            this.f7231o.getClass();
            eVar.V();
        }
    }

    public final o h0(h hVar, InterfaceC0472c interfaceC0472c) {
        o oVarA = this.f7233q.a(hVar);
        return (oVarA == null && (oVarA = this.f7228l.y(hVar)) == null && (oVarA = a0(hVar)) == null) ? r0(hVar.f7281k) : t0(oVarA, interfaceC0472c);
    }

    public final o i0(Class cls, InterfaceC0472c interfaceC0472c) {
        o oVarB = this.f7233q.b(cls);
        if (oVarB == null) {
            C0495p c0495p = this.f7228l;
            o oVarZ = c0495p.z(cls);
            if (oVarZ == null) {
                oVarB = c0495p.y(this.f7226j.c(cls));
                if (oVarB == null && (oVarB = b0(cls)) == null) {
                    return r0(cls);
                }
            } else {
                oVarB = oVarZ;
            }
        }
        return t0(oVarB, interfaceC0472c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o j0(h hVar, InterfaceC0472c interfaceC0472c) {
        o oVarO = this.f7227k.O(this, hVar);
        if (oVarO instanceof j) {
            ((j) oVarO).a(this);
        }
        return t0(oVarO, interfaceC0472c);
    }

    public abstract s k0(Object obj, d0 d0Var);

    public final o l0(h hVar, InterfaceC0472c interfaceC0472c) {
        o oVarA = this.f7233q.a(hVar);
        return (oVarA == null && (oVarA = this.f7228l.y(hVar)) == null && (oVarA = a0(hVar)) == null) ? r0(hVar.f7281k) : s0(oVarA, interfaceC0472c);
    }

    public final o m0(Class cls, InterfaceC0472c interfaceC0472c) {
        o oVarB = this.f7233q.b(cls);
        if (oVarB == null) {
            C0495p c0495p = this.f7228l;
            o oVarZ = c0495p.z(cls);
            if (oVarZ == null) {
                oVarB = c0495p.y(this.f7226j.c(cls));
                if (oVarB == null && (oVarB = b0(cls)) == null) {
                    return r0(cls);
                }
            } else {
                oVarB = oVarZ;
            }
        }
        return s0(oVarB, interfaceC0472c);
    }

    public final o n0(Class cls) {
        o oVar;
        o oVar2;
        m mVar = this.f7233q;
        mVar.getClass();
        y yVar = mVar.f12186a[(cls.getName().hashCode() + 1) & mVar.f12187b];
        if (yVar == null) {
            oVar = null;
            break;
        }
        if (((Class) yVar.f2030a) != cls || !yVar.f2031b) {
            while (true) {
                yVar = (y) yVar.f2033d;
                if (yVar == null) {
                    oVar = null;
                    break;
                }
                if (((Class) yVar.f2030a) == cls && yVar.f2031b) {
                    oVar = (o) yVar.f2032c;
                    break;
                }
            }
        } else {
            oVar = (o) yVar.f2032c;
        }
        if (oVar != null) {
            return oVar;
        }
        C0495p c0495p = this.f7228l;
        synchronized (c0495p) {
            oVar2 = (o) ((o) ((p109u2.n) c0495p.i).f12708h).get(new C(cls, true));
        }
        if (oVar2 != null) {
            return oVar2;
        }
        o oVarP0 = p0(cls, null);
        e eVar = this.f7227k;
        C c6 = this.f7226j;
        q qVarP = eVar.P(c6, c6.c(cls));
        if (qVarP != null) {
            oVarP0 = new p098s2.o(qVarP.g(null), oVarP0);
        }
        C0495p c0495p2 = this.f7228l;
        synchronized (c0495p2) {
            try {
                if (((o) ((p109u2.n) c0495p2.i).f12708h).g(new C(cls, true), oVarP0, false) == null) {
                    ((AtomicReference) c0495p2.f7476j).set(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVarP0;
    }

    public final o o0(h hVar, InterfaceC0472c interfaceC0472c) throws JsonMappingException {
        if (hVar == null) {
            throw new JsonMappingException(((p093r2.h) this).f11759x, "Null passed for `valueType` of `findValueSerializer()`", null);
        }
        o oVarA = this.f7233q.a(hVar);
        return (oVarA == null && (oVarA = this.f7228l.y(hVar)) == null && (oVarA = a0(hVar)) == null) ? r0(hVar.f7281k) : t0(oVarA, interfaceC0472c);
    }

    public final o p0(Class cls, InterfaceC0472c interfaceC0472c) {
        o oVarB = this.f7233q.b(cls);
        if (oVarB == null) {
            C0495p c0495p = this.f7228l;
            o oVarZ = c0495p.z(cls);
            if (oVarZ == null) {
                oVarB = c0495p.y(this.f7226j.c(cls));
                if (oVarB == null && (oVarB = b0(cls)) == null) {
                    return r0(cls);
                }
            } else {
                oVarB = oVarZ;
            }
        }
        return t0(oVarB, interfaceC0472c);
    }

    public final Object q0(Object obj) {
        Object obj2;
        HashMap map = this.f7229m.f8701k;
        if (map == null || (obj2 = map.get(obj)) == null) {
            return Collections.EMPTY_MAP.get(obj);
        }
        if (obj2 == h.f8700m) {
            return null;
        }
        return obj2;
    }

    public final o r0(Class cls) {
        return cls == Object.class ? this.f7230n : new p(0, 6, cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o s0(o oVar, InterfaceC0472c interfaceC0472c) {
        return (oVar == 0 || !(oVar instanceof g)) ? oVar : ((g) oVar).b(this, interfaceC0472c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o t0(o oVar, InterfaceC0472c interfaceC0472c) {
        return (oVar == 0 || !(oVar instanceof g)) ? oVar : ((g) oVar).b(this, interfaceC0472c);
    }

    public abstract Object u0(Class cls);

    public abstract boolean v0(Object obj);

    public final void w0(r rVar, t tVar, String str, Object... objArr) throws InvalidDefinitionException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        StringBuilder sbO = AbstractC0013g0.o("Invalid definition for property ", AbstractC0473d.d(tVar.getName()), " (of type ", i.z(rVar.f9562a.f7281k), "): ");
        sbO.append(str);
        throw new InvalidDefinitionException(((p093r2.h) this).f11759x, sbO.toString());
    }

    public final void x0(r rVar, String str, Object... objArr) throws InvalidDefinitionException {
        String strZ = i.z(rVar.f9562a.f7281k);
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new InvalidDefinitionException(((p093r2.h) this).f11759x, k.s("Invalid type definition for type ", strZ, ": ", str));
    }

    @Override // p015c2.AbstractC0473d
    public final p026e2.n y() {
        return this.f7226j;
    }

    public abstract o y0(p046i2.q qVar, Object obj);

    public E(E e6, C c6, e eVar) {
        this.f7230n = f7225u;
        this.f7231o = C0545p.i;
        c cVar = f7224t;
        this.f7232p = cVar;
        this.f7227k = eVar;
        this.f7226j = c6;
        C0495p c0495p = e6.f7228l;
        this.f7228l = c0495p;
        this.f7230n = e6.f7230n;
        C0545p c0545p = e6.f7231o;
        this.f7231o = c0545p;
        this.f7232p = e6.f7232p;
        this.f7235s = c0545p == cVar;
        c6.getClass();
        this.f7229m = c6.f8722l;
        m mVar = (m) ((AtomicReference) c0495p.f7476j).get();
        if (mVar == null) {
            synchronized (c0495p) {
                mVar = (m) ((AtomicReference) c0495p.f7476j).get();
                if (mVar == null) {
                    m mVar2 = new m((p109u2.n) c0495p.i);
                    ((AtomicReference) c0495p.f7476j).set(mVar2);
                    mVar = mVar2;
                }
            }
        }
        this.f7233q = mVar;
    }
}
