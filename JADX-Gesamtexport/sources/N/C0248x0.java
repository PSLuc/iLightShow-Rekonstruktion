package N;

import B.C0005c0;
import B.C0024m;
import B.C0025m0;
import B.C0043w;
import P4.C0319f;
import P4.C0332t;
import P4.InterfaceC0318e;
import X.AbstractC0391h;
import X.C0387d;
import androidx.compose.runtime.ComposeRuntimeError;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: N.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0248x0 extends AbstractC0234q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final S4.P f3852v = S4.F.b(T.b.f5142k);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final AtomicReference f3853w = new AtomicReference(Boolean.FALSE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0214g f3854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public P4.T f3856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f3857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f3858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p080p.A f3860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final P.d f3861h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f3862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f3863k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f3864l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f3865m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinkedHashSet f3866n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0319f f3867o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0025m0 f3868p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3869q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final S4.P f3870r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final P4.V f3871s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p111u4.i f3872t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final U f3873u;

    public C0248x0(p111u4.i iVar) {
        C0214g c0214g = new C0214g(new C0043w(22, this));
        this.f3854a = c0214g;
        this.f3855b = new Object();
        this.f3858e = new ArrayList();
        this.f3860g = new p080p.A();
        this.f3861h = new P.d(new C0239t[16]);
        this.i = new ArrayList();
        this.f3862j = new ArrayList();
        this.f3863k = new LinkedHashMap();
        this.f3864l = new LinkedHashMap();
        this.f3870r = S4.F.b(EnumC0236r0.f3786j);
        P4.V v6 = new P4.V((P4.T) iVar.J(C0332t.i));
        v6.Q(new A2.e(15, this));
        this.f3871s = v6;
        this.f3872t = iVar.o(c0214g).o(v6);
        this.f3873u = new U(8);
    }

    public static final C0239t p(C0248x0 c0248x0, C0239t c0239t, p080p.A a6) {
        LinkedHashSet linkedHashSet;
        C0387d c0387dB;
        if (!c0239t.f3815x.f3737E && !c0239t.f3816y && ((linkedHashSet = c0248x0.f3866n) == null || !linkedHashSet.contains(c0239t))) {
            A2.e eVar = new A2.e(16, c0239t);
            C0005c0 c0005c0 = new C0005c0(c0239t, 23, a6);
            AbstractC0391h abstractC0391hK = X.o.k();
            C0387d c0387d = abstractC0391hK instanceof C0387d ? (C0387d) abstractC0391hK : null;
            if (c0387d == null || (c0387dB = c0387d.B(eVar, c0005c0)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC0391h abstractC0391hJ = c0387dB.j();
                if (a6 != null) {
                    try {
                        if (a6.h()) {
                            C0024m c0024m = new C0024m(a6, 7, c0239t);
                            C0230o c0230o = c0239t.f3815x;
                            if (c0230o.f3737E) {
                                C0208d.w("Preparing a composition while composing is not supported");
                                throw null;
                            }
                            c0230o.f3737E = true;
                            try {
                                c0024m.invoke();
                                c0230o.f3737E = false;
                            } catch (Throwable th) {
                                c0230o.f3737E = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        AbstractC0391h.p(abstractC0391hJ);
                        throw th2;
                    }
                }
                boolean zT = c0239t.t();
                AbstractC0391h.p(abstractC0391hJ);
                r(c0387dB);
                if (zT) {
                    return c0239t;
                }
            } catch (Throwable th3) {
                r(c0387dB);
                throw th3;
            }
        }
        return null;
    }

    public static final boolean q(C0248x0 c0248x0) {
        List listW;
        synchronized (c0248x0.f3855b) {
            boolean z5 = true;
            if (c0248x0.f3860g.g()) {
                if (!c0248x0.f3861h.n() && !c0248x0.u()) {
                    z5 = false;
                }
                return z5;
            }
            P.f fVar = new P.f(c0248x0.f3860g);
            c0248x0.f3860g = new p080p.A();
            synchronized (c0248x0.f3855b) {
                listW = c0248x0.w();
            }
            try {
                int size = listW.size();
                for (int i = 0; i < size; i++) {
                    ((C0239t) listW.get(i)).u(fVar);
                    if (((EnumC0236r0) c0248x0.f3870r.getValue()).compareTo(EnumC0236r0.i) <= 0) {
                        break;
                    }
                }
                synchronized (c0248x0.f3855b) {
                    c0248x0.f3860g = new p080p.A();
                }
                synchronized (c0248x0.f3855b) {
                    if (c0248x0.t() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (!c0248x0.f3861h.n() && !c0248x0.u()) {
                        z5 = false;
                    }
                }
                return z5;
            } catch (Throwable th) {
                synchronized (c0248x0.f3855b) {
                    p080p.A a6 = c0248x0.f3860g;
                    a6.getClass();
                    for (Object obj : fVar) {
                        a6.f10709b[a6.d(obj)] = obj;
                    }
                    throw th;
                }
            }
        }
    }

    public static void r(C0387d c0387d) {
        try {
            if (c0387d.v() instanceof X.i) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            c0387d.c();
        } catch (Throwable th) {
            c0387d.c();
            throw th;
        }
    }

    public static final void x(ArrayList arrayList, C0248x0 c0248x0, C0239t c0239t) {
        arrayList.clear();
        synchronized (c0248x0.f3855b) {
            Iterator it = c0248x0.f3862j.iterator();
            if (it.hasNext()) {
                ((Y) it.next()).getClass();
                throw null;
            }
        }
    }

    public final void A(C0239t c0239t) {
        ArrayList arrayList = this.f3865m;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f3865m = arrayList;
        }
        if (!arrayList.contains(c0239t)) {
            arrayList.add(c0239t);
        }
        this.f3858e.remove(c0239t);
        this.f3859f = null;
    }

    @Override // N.AbstractC0234q
    public final void a(C0239t c0239t, V.a aVar) throws Exception {
        C0387d c0387dB;
        boolean z5 = c0239t.f3815x.f3737E;
        try {
            A2.e eVar = new A2.e(16, c0239t);
            C0005c0 c0005c0 = new C0005c0(c0239t, 23, null);
            AbstractC0391h abstractC0391hK = X.o.k();
            C0387d c0387d = abstractC0391hK instanceof C0387d ? (C0387d) abstractC0391hK : null;
            if (c0387d == null || (c0387dB = c0387d.B(eVar, c0005c0)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC0391h abstractC0391hJ = c0387dB.j();
                try {
                    c0239t.i(aVar);
                    AbstractC0391h.p(abstractC0391hJ);
                    r(c0387dB);
                    if (!z5) {
                        X.o.k().m();
                    }
                    synchronized (this.f3855b) {
                        if (((EnumC0236r0) this.f3870r.getValue()).compareTo(EnumC0236r0.i) > 0 && !w().contains(c0239t)) {
                            this.f3858e.add(c0239t);
                            this.f3859f = null;
                        }
                    }
                    try {
                        synchronized (this.f3855b) {
                            ArrayList arrayList = this.f3862j;
                            if (arrayList.size() > 0) {
                                ((Y) arrayList.get(0)).getClass();
                                throw null;
                            }
                        }
                        try {
                            c0239t.d();
                            c0239t.f();
                            if (z5) {
                                return;
                            }
                            X.o.k().m();
                        } catch (Exception e6) {
                            z(e6, null);
                        }
                    } catch (Exception e7) {
                        z(e7, c0239t);
                    }
                } catch (Throwable th) {
                    AbstractC0391h.p(abstractC0391hJ);
                    throw th;
                }
            } catch (Throwable th2) {
                r(c0387dB);
                throw th2;
            }
        } catch (Exception e8) {
            z(e8, c0239t);
        }
    }

    @Override // N.AbstractC0234q
    public final boolean c() {
        return ((Boolean) f3853w.get()).booleanValue();
    }

    @Override // N.AbstractC0234q
    public final boolean d() {
        return false;
    }

    @Override // N.AbstractC0234q
    public final boolean e() {
        return false;
    }

    @Override // N.AbstractC0234q
    public final int g() {
        return 1000;
    }

    @Override // N.AbstractC0234q
    public final p111u4.i h() {
        return this.f3872t;
    }

    @Override // N.AbstractC0234q
    public final void i(C0239t c0239t) {
        InterfaceC0318e interfaceC0318eT;
        synchronized (this.f3855b) {
            if (this.f3861h.j(c0239t)) {
                interfaceC0318eT = null;
            } else {
                this.f3861h.c(c0239t);
                interfaceC0318eT = t();
            }
        }
        if (interfaceC0318eT != null) {
            ((C0319f) interfaceC0318eT).g(p084p4.x.f10867a);
        }
    }

    @Override // N.AbstractC0234q
    public final void j(Set set) {
    }

    @Override // N.AbstractC0234q
    public final void l(C0239t c0239t) {
        synchronized (this.f3855b) {
            try {
                LinkedHashSet linkedHashSet = this.f3866n;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f3866n = linkedHashSet;
                }
                linkedHashSet.add(c0239t);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // N.AbstractC0234q
    public final void o(C0239t c0239t) {
        synchronized (this.f3855b) {
            this.f3858e.remove(c0239t);
            this.f3859f = null;
            this.f3861h.o(c0239t);
            this.i.remove(c0239t);
        }
    }

    public final void s() {
        synchronized (this.f3855b) {
            if (((EnumC0236r0) this.f3870r.getValue()).compareTo(EnumC0236r0.f3788l) >= 0) {
                S4.P p6 = this.f3870r;
                EnumC0236r0 enumC0236r0 = EnumC0236r0.i;
                p6.getClass();
                p6.i(null, enumC0236r0);
            }
        }
        this.f3871s.c(null);
    }

    public final InterfaceC0318e t() throws IllegalAccessException, InvocationTargetException {
        S4.P p6 = this.f3870r;
        int iCompareTo = ((EnumC0236r0) p6.getValue()).compareTo(EnumC0236r0.i);
        ArrayList arrayList = this.f3862j;
        ArrayList arrayList2 = this.i;
        P.d dVar = this.f3861h;
        if (iCompareTo <= 0) {
            this.f3858e.clear();
            this.f3859f = p089q4.u.f11237h;
            this.f3860g = new p080p.A();
            dVar.i();
            arrayList2.clear();
            arrayList.clear();
            this.f3865m = null;
            C0319f c0319f = this.f3867o;
            if (c0319f != null) {
                c0319f.i(null);
            }
            this.f3867o = null;
            this.f3868p = null;
            return null;
        }
        C0025m0 c0025m0 = this.f3868p;
        EnumC0236r0 enumC0236r0 = EnumC0236r0.f3789m;
        EnumC0236r0 enumC0236r1 = EnumC0236r0.f3786j;
        if (c0025m0 == null) {
            if (this.f3856c == null) {
                this.f3860g = new p080p.A();
                dVar.i();
                if (u()) {
                    enumC0236r1 = EnumC0236r0.f3787k;
                }
            } else {
                enumC0236r1 = (dVar.n() || this.f3860g.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || u()) ? enumC0236r0 : EnumC0236r0.f3788l;
            }
        }
        p6.getClass();
        p6.i(null, enumC0236r1);
        if (enumC0236r1 != enumC0236r0) {
            return null;
        }
        C0319f c0319f2 = this.f3867o;
        this.f3867o = null;
        return c0319f2;
    }

    public final boolean u() {
        return (this.f3869q || this.f3854a.f3701m.get() == 0) ? false : true;
    }

    public final boolean v() {
        boolean z5;
        synchronized (this.f3855b) {
            z5 = this.f3860g.h() || this.f3861h.n() || u();
        }
        return z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List w() {
        Object obj = this.f3859f;
        ?? r6 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f3858e;
            Object arrayList2 = arrayList.isEmpty() ? p089q4.u.f11237h : new ArrayList(arrayList);
            this.f3859f = arrayList2;
            r6 = arrayList2;
        }
        return r6;
    }

    public final List y(List list, p080p.A a6) {
        C0387d c0387dB;
        ArrayList arrayList;
        Object obj;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            ((Y) obj2).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj2);
        }
        for (Map.Entry entry : map.entrySet()) {
            C0239t c0239t = (C0239t) entry.getKey();
            List list2 = (List) entry.getValue();
            C0208d.P(!c0239t.f3815x.f3737E);
            A2.e eVar = new A2.e(16, c0239t);
            C0005c0 c0005c0 = new C0005c0(c0239t, 23, a6);
            AbstractC0391h abstractC0391hK = X.o.k();
            C0387d c0387d = abstractC0391hK instanceof C0387d ? (C0387d) abstractC0391hK : null;
            if (c0387d == null || (c0387dB = c0387d.B(eVar, c0005c0)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC0391h abstractC0391hJ = c0387dB.j();
                try {
                    synchronized (this.f3855b) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            Y y2 = (Y) list2.get(i3);
                            LinkedHashMap linkedHashMap = this.f3863k;
                            y2.getClass();
                            List list3 = (List) linkedHashMap.get(null);
                            if (list3 != null) {
                                Object objT = p089q4.r.T(list3);
                                if (list3.isEmpty()) {
                                    linkedHashMap.remove(null);
                                }
                                obj = objT;
                            } else {
                                obj = null;
                            }
                            arrayList.add(new p084p4.h(y2, obj));
                        }
                    }
                    int size3 = arrayList.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        if (((p084p4.h) arrayList.get(i6)).i != null) {
                            int size4 = arrayList.size();
                            for (int i7 = 0; i7 < size4; i7++) {
                                if (((p084p4.h) arrayList.get(i7)).i == null) {
                                    ArrayList arrayList3 = new ArrayList(arrayList.size());
                                    int size5 = arrayList.size();
                                    for (int i8 = 0; i8 < size5; i8++) {
                                        p084p4.h hVar = (p084p4.h) arrayList.get(i8);
                                        if (hVar.i == null) {
                                        }
                                    }
                                    synchronized (this.f3855b) {
                                        p089q4.r.R(this.f3862j, arrayList3);
                                    }
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size6 = arrayList.size();
                                    for (int i9 = 0; i9 < size6; i9++) {
                                        Object obj3 = arrayList.get(i9);
                                        if (((p084p4.h) obj3).i != null) {
                                            arrayList4.add(obj3);
                                        }
                                    }
                                    arrayList = arrayList4;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    c0239t.o(arrayList);
                    AbstractC0391h.p(abstractC0391hJ);
                    r(c0387dB);
                } catch (Throwable th) {
                    AbstractC0391h.p(abstractC0391hJ);
                    throw th;
                }
            } catch (Throwable th2) {
                r(c0387dB);
                throw th2;
            }
        }
        return p089q4.l.s0(map.keySet());
    }

    public final void z(Exception exc, C0239t c0239t) throws Exception {
        int i = 8;
        if (!((Boolean) f3853w.get()).booleanValue() || (exc instanceof ComposeRuntimeError)) {
            synchronized (this.f3855b) {
                C0025m0 c0025m0 = this.f3868p;
                if (c0025m0 != null) {
                    throw ((Exception) c0025m0.i);
                }
                this.f3868p = new C0025m0(i, exc);
            }
            throw exc;
        }
        synchronized (this.f3855b) {
            int i3 = AbstractC0204b.f3683b;
            this.i.clear();
            this.f3861h.i();
            this.f3860g = new p080p.A();
            this.f3862j.clear();
            this.f3863k.clear();
            this.f3864l.clear();
            this.f3868p = new C0025m0(i, exc);
            if (c0239t != null) {
                A(c0239t);
            }
            t();
        }
    }
}
