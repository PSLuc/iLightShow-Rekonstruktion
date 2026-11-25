package p046i2;

import S1.C0355q;
import S1.EnumC0348j;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p015c2.A;
import p015c2.B;
import p015c2.h;
import p026e2.n;
import p109u2.i;
import p109u2.k;
import p109u2.l;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Class[] f9561j = new Class[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f9562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f9563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f9564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f9565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0766b f9566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Class[] f9567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f9569h;
    public final C i;

    public r(h hVar) {
        this.f9562a = hVar;
    }

    public static r f(h hVar, n nVar, C0766b c0766b) {
        List list = Collections.EMPTY_LIST;
        return new r(hVar, nVar, c0766b);
    }

    public final l a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof l) {
            return (l) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class cls = (Class) obj;
        if (cls == k.class || i.t(cls)) {
            return null;
        }
        if (l.class.isAssignableFrom(cls)) {
            n nVar = this.f9564c;
            nVar.h();
            return (l) i.h(cls, nVar.k(p015c2.r.CAN_OVERRIDE_ACCESS_MODIFIERS));
        }
        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
    }

    public final List b() {
        if (this.f9569h == null) {
            D d6 = this.f9563b;
            if (!d6.i) {
                d6.g();
            }
            this.f9569h = new ArrayList(d6.f9489j.values());
        }
        return this.f9569h;
    }

    public final Class[] c() {
        if (!this.f9568g) {
            this.f9568g = true;
            B b6 = this.f9565d;
            Class[] clsArrB0 = b6 == null ? null : b6.b0(this.f9566e);
            if (clsArrB0 == null && !this.f9564c.k(p015c2.r.DEFAULT_VIEW_INCLUSION)) {
                clsArrB0 = f9561j;
            }
            this.f9567f = clsArrB0;
        }
        return this.f9567f;
    }

    public final C0355q d() {
        C0355q c0355qN;
        C0766b c0766b = this.f9566e;
        B b6 = this.f9565d;
        if (b6 == null || (c0355qN = b6.n(c0766b)) == null) {
            c0355qN = null;
        }
        C0355q c0355qF = this.f9564c.f(c0766b.f9525j);
        if (c0355qF != null) {
            return c0355qN == null ? c0355qF : c0355qN.e(c0355qF);
        }
        return c0355qN;
    }

    public final AbstractC0771g e() {
        D d6 = this.f9563b;
        if (d6 != null) {
            if (!d6.i) {
                d6.g();
            }
            LinkedList linkedList = d6.f9496q;
            if (linkedList != null) {
                if (linkedList.size() <= 1 || D.f(d6.f9496q)) {
                    return (AbstractC0771g) d6.f9496q.get(0);
                }
                d6.h("Multiple 'as-value' properties defined (%s vs %s)", d6.f9496q.get(0), d6.f9496q.get(1));
                throw null;
            }
        }
        return null;
    }

    public final List g() {
        Class clsA;
        List<C0772h> list = (List) this.f9566e.m().f395k;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = null;
        for (C0772h c0772h : list) {
            if (this.f9562a.f7281k.isAssignableFrom(c0772h.f9547l.getReturnType())) {
                EnumC0348j enumC0348jE = this.f9565d.e(this.f9564c, c0772h);
                if (enumC0348jE == null || enumC0348jE == EnumC0348j.f4952k) {
                    Method method = c0772h.f9547l;
                    String name = method.getName();
                    if ((!"valueOf".equals(name) || method.getParameterCount() != 1) && (!"fromString".equals(name) || method.getParameterCount() != 1 || ((clsA = c0772h.A(0)) != String.class && !CharSequence.class.isAssignableFrom(clsA)))) {
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0772h);
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0020 A[RETURN] */
    public final boolean h(A a6) {
        for (t tVar : b()) {
            if (tVar.w(a6)) {
                if (tVar != null) {
                    return true;
                }
                return false;
            }
        }
        tVar = null;
        if (tVar != null) {
            return true;
        }
        return false;
    }

    public r(D d6) {
        this(d6.f9484d);
        this.f9563b = d6;
        n nVar = d6.f9481a;
        this.f9564c = nVar;
        if (nVar == null) {
            this.f9565d = null;
        } else {
            this.f9565d = nVar.d();
        }
        C0766b c0766b = d6.f9485e;
        this.f9566e = c0766b;
        B b6 = d6.f9487g;
        C cY = b6.y(c0766b);
        this.i = cY != null ? b6.z(c0766b, cY) : cY;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(h hVar, n nVar, C0766b c0766b) {
        this(hVar);
        List list = Collections.EMPTY_LIST;
        this.f9563b = null;
        this.f9564c = nVar;
        if (nVar == null) {
            this.f9565d = null;
        } else {
            this.f9565d = nVar.d();
        }
        this.f9566e = c0766b;
        this.f9569h = list;
    }
}
