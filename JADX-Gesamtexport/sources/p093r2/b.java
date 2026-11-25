package p093r2;

import S1.EnumC0363z;
import T1.e;
import V1.h;
import c5.C0495p;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ser.std.AbstractC0532c;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import p012c.k;
import p015c2.A;
import p015c2.D;
import p015c2.E;
import p015c2.o;
import p046i2.AbstractC0771g;
import p046i2.C0769e;
import p046i2.C0772h;
import p046i2.t;
import p046i2.w;
import p077o2.q;
import p087q2.r;
import p098s2.i;
import p109u2.InterfaceC0963b;
import p109u2.s;

/* JADX INFO: loaded from: classes.dex */
public class b extends w {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f11732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final A f11733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p015c2.h f11734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p015c2.h f11735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p015c2.h f11736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC0771g f11737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final transient Method f11738p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient Field f11739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public o f11740r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public o f11741s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public q f11742t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public transient AbstractC0599v0 f11743u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f11744v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f11745w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Class[] f11746x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient HashMap f11747y;

    public b(t tVar, AbstractC0771g abstractC0771g, InterfaceC0963b interfaceC0963b, p015c2.h hVar, o oVar, q qVar, p015c2.h hVar2, boolean z5, Object obj, Class[] clsArr) {
        super(tVar.c());
        this.f11737o = abstractC0771g;
        this.f11732j = new h(tVar.getName());
        tVar.t();
        this.f11733k = null;
        this.f11734l = hVar;
        this.f11740r = oVar;
        this.f11743u = oVar == null ? i.f12180k : null;
        this.f11742t = qVar;
        this.f11735m = hVar2;
        if (abstractC0771g instanceof C0769e) {
            this.f11738p = null;
            this.f11739q = ((C0769e) abstractC0771g).f9542k;
        } else if (abstractC0771g instanceof C0772h) {
            this.f11738p = ((C0772h) abstractC0771g).f9547l;
            this.f11739q = null;
        } else {
            this.f11738p = null;
            this.f11739q = null;
        }
        this.f11744v = z5;
        this.f11745w = obj;
        this.f11741s = null;
        this.f11746x = clsArr;
    }

    @Override // p015c2.InterfaceC0472c
    public final A a() {
        return new A(this.f11732j.f5505h, null);
    }

    @Override // p015c2.InterfaceC0472c
    public final AbstractC0771g e() {
        return this.f11737o;
    }

    public void g(r rVar, JsonNode jsonNode) {
        rVar.w(this.f11732j.f5505h, jsonNode);
    }

    @Override // p109u2.t
    public final String getName() {
        return this.f11732j.f5505h;
    }

    @Override // p015c2.InterfaceC0472c
    public final p015c2.h getType() {
        return this.f11734l;
    }

    public o h(AbstractC0599v0 abstractC0599v0, Class cls, E e6) {
        C0495p c0495p;
        p015c2.h hVar = this.f11736n;
        if (hVar != null) {
            p015c2.h hVarF0 = e6.f0(hVar, cls);
            abstractC0599v0.getClass();
            o oVarL0 = e6.l0(hVarF0, this);
            c0495p = new C0495p(oVarL0, 22, abstractC0599v0.G(hVarF0.f7281k, oVarL0));
        } else {
            abstractC0599v0.getClass();
            o oVarM0 = e6.m0(cls, this);
            c0495p = new C0495p(oVarM0, 22, abstractC0599v0.G(cls, oVarM0));
        }
        AbstractC0599v0 abstractC0599v1 = (AbstractC0599v0) c0495p.f7476j;
        if (abstractC0599v0 != abstractC0599v1) {
            this.f11743u = abstractC0599v1;
        }
        return (o) c0495p.i;
    }

    public final boolean i(e eVar, E e6, o oVar) {
        if (oVar.usesObjectId()) {
            return false;
        }
        if (e6.f7226j.p(D.FAIL_ON_SELF_REFERENCES)) {
            if (!(oVar instanceof AbstractC0532c)) {
                return false;
            }
            e6.O("Direct self-reference leading to cycle");
            throw null;
        }
        if (!e6.f7226j.p(D.WRITE_SELF_REFERENCES_AS_NULL)) {
            return false;
        }
        if (this.f11741s == null) {
            return true;
        }
        if (!eVar.s().d()) {
            eVar.Q(this.f11732j);
        }
        this.f11741s.serialize(null, eVar, e6);
        return true;
    }

    public void j(o oVar) {
        o oVar2 = this.f11741s;
        if (oVar2 != null && oVar2 != oVar) {
            throw new IllegalStateException(k.s("Cannot override _nullSerializer: had a ", p109u2.i.f(this.f11741s), ", trying to set to ", p109u2.i.f(oVar)));
        }
        this.f11741s = oVar;
    }

    public void k(o oVar) {
        o oVar2 = this.f11740r;
        if (oVar2 != null && oVar2 != oVar) {
            throw new IllegalStateException(k.s("Cannot override _serializer: had a ", p109u2.i.f(this.f11740r), ", trying to set to ", p109u2.i.f(oVar)));
        }
        this.f11740r = oVar;
    }

    public b l(s sVar) {
        h hVar = this.f11732j;
        String strA = sVar.a(hVar.f5505h);
        return strA.equals(hVar.f5505h) ? this : new b(this, A.a(strA));
    }

    public void m(Object obj, e eVar, E e6) {
        Method method = this.f11738p;
        Object objInvoke = method == null ? this.f11739q.get(obj) : method.invoke(obj, null);
        if (objInvoke == null) {
            o oVar = this.f11741s;
            if (oVar != null) {
                oVar.serialize(null, eVar, e6);
                return;
            } else {
                eVar.V();
                return;
            }
        }
        o oVarH = this.f11740r;
        if (oVarH == null) {
            Class<?> cls = objInvoke.getClass();
            AbstractC0599v0 abstractC0599v0 = this.f11743u;
            o oVarI = abstractC0599v0.I(cls);
            oVarH = oVarI == null ? h(abstractC0599v0, cls, e6) : oVarI;
        }
        Object obj2 = this.f11745w;
        if (obj2 != null) {
            if (EnumC0363z.f4984j == obj2) {
                if (oVarH.isEmpty(e6, objInvoke)) {
                    o(eVar, e6);
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                o(eVar, e6);
                return;
            }
        }
        if (objInvoke == obj && i(eVar, e6, oVarH)) {
            return;
        }
        q qVar = this.f11742t;
        if (qVar == null) {
            oVarH.serialize(objInvoke, eVar, e6);
        } else {
            oVarH.serializeWithType(objInvoke, eVar, e6, qVar);
        }
    }

    public void n(Object obj, e eVar, E e6) {
        Method method = this.f11738p;
        Object objInvoke = method == null ? this.f11739q.get(obj) : method.invoke(obj, null);
        h hVar = this.f11732j;
        Object obj2 = this.f11745w;
        if (objInvoke == null) {
            if ((obj2 == null || !e6.v0(obj2)) && this.f11741s != null) {
                eVar.Q(hVar);
                this.f11741s.serialize(null, eVar, e6);
                return;
            }
            return;
        }
        o oVarH = this.f11740r;
        if (oVarH == null) {
            Class<?> cls = objInvoke.getClass();
            AbstractC0599v0 abstractC0599v0 = this.f11743u;
            o oVarI = abstractC0599v0.I(cls);
            oVarH = oVarI == null ? h(abstractC0599v0, cls, e6) : oVarI;
        }
        if (obj2 != null) {
            if (EnumC0363z.f4984j == obj2) {
                if (oVarH.isEmpty(e6, objInvoke)) {
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                return;
            }
        }
        if (objInvoke == obj && i(eVar, e6, oVarH)) {
            return;
        }
        eVar.Q(hVar);
        q qVar = this.f11742t;
        if (qVar == null) {
            oVarH.serialize(objInvoke, eVar, e6);
        } else {
            oVarH.serializeWithType(objInvoke, eVar, e6, qVar);
        }
    }

    public final void o(e eVar, E e6) {
        o oVar = this.f11741s;
        if (oVar != null) {
            oVar.serialize(null, eVar, e6);
        } else {
            eVar.V();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("property '");
        sb.append(this.f11732j.f5505h);
        sb.append("' (");
        Method method = this.f11738p;
        if (method != null) {
            sb.append("via method ");
            sb.append(method.getDeclaringClass().getName());
            sb.append("#");
            sb.append(method.getName());
        } else {
            Field field = this.f11739q;
            if (field != null) {
                sb.append("field \"");
                sb.append(field.getDeclaringClass().getName());
                sb.append("#");
                sb.append(field.getName());
            } else {
                sb.append("virtual");
            }
        }
        o oVar = this.f11740r;
        if (oVar == null) {
            sb.append(", no static serializer");
        } else {
            sb.append(", static serializer of type ".concat(oVar.getClass().getName()));
        }
        sb.append(')');
        return sb.toString();
    }

    public b(b bVar, h hVar) {
        super(bVar);
        this.f11732j = hVar;
        this.f11733k = bVar.f11733k;
        this.f11737o = bVar.f11737o;
        this.f11734l = bVar.f11734l;
        this.f11738p = bVar.f11738p;
        this.f11739q = bVar.f11739q;
        this.f11740r = bVar.f11740r;
        this.f11741s = bVar.f11741s;
        if (bVar.f11747y != null) {
            this.f11747y = new HashMap(bVar.f11747y);
        }
        this.f11735m = bVar.f11735m;
        this.f11743u = bVar.f11743u;
        this.f11744v = bVar.f11744v;
        this.f11745w = bVar.f11745w;
        this.f11746x = bVar.f11746x;
        this.f11742t = bVar.f11742t;
        this.f11736n = bVar.f11736n;
    }

    public b(b bVar, A a6) {
        super(bVar);
        this.f11732j = new h(a6.f7195h);
        this.f11733k = bVar.f11733k;
        this.f11734l = bVar.f11734l;
        this.f11737o = bVar.f11737o;
        this.f11738p = bVar.f11738p;
        this.f11739q = bVar.f11739q;
        this.f11740r = bVar.f11740r;
        this.f11741s = bVar.f11741s;
        if (bVar.f11747y != null) {
            this.f11747y = new HashMap(bVar.f11747y);
        }
        this.f11735m = bVar.f11735m;
        this.f11743u = bVar.f11743u;
        this.f11744v = bVar.f11744v;
        this.f11745w = bVar.f11745w;
        this.f11746x = bVar.f11746x;
        this.f11742t = bVar.f11742t;
        this.f11736n = bVar.f11736n;
    }
}
