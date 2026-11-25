package p113v0;

import D4.c;
import D4.e;
import E4.k;
import N.AbstractC0234q;
import N.C0208d;
import N.C0230o;
import N.C0239t;
import N.InterfaceC0220j;
import N.U;
import P.d;
import V.a;
import X.AbstractC0391h;
import X.C0386c;
import X.o;
import X.t;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p080p.A;
import p080p.x;
import p124x0.D;
import p124x0.H;
import p124x0.J;
import p130y0.d1;

/* JADX INFO: loaded from: classes.dex */
public final class B implements InterfaceC0220j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D f13115h;
    public AbstractC0234q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13117k;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13126t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13127u;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f13118l = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f13119m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1039w f13120n = new C1039w(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1037u f13121o = new C1037u(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashMap f13122p = new HashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Z f13123q = new Z();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinkedHashMap f13124r = new LinkedHashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f13125s = new d(new Object[16]);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f13128v = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public B(D d6) {
        this.f13115h = d6;
    }

    public static C0239t h(C0239t c0239t, D d6, boolean z5, AbstractC0234q abstractC0234q, a aVar) {
        if (c0239t == null || c0239t.f3816y) {
            ViewGroup.LayoutParams layoutParams = d1.f14384a;
            c0239t = new C0239t(abstractC0234q, new p091r0.d(d6));
        }
        if (!z5) {
            c0239t.j(aVar);
            return c0239t;
        }
        C0230o c0230o = c0239t.f3815x;
        c0230o.f3768y = 100;
        c0230o.f3767x = true;
        c0239t.j(aVar);
        if (c0230o.f3737E || c0230o.f3768y != 100) {
            C0208d.S("Cannot disable reuse from root if it was caused by other groups");
            throw null;
        }
        c0230o.f3768y = -1;
        c0230o.f3767x = false;
        return c0239t;
    }

    @Override // N.InterfaceC0220j
    public final void a() {
        f(false);
    }

    @Override // N.InterfaceC0220j
    public final void b() {
        D d6 = this.f13115h;
        d6.f13844r = true;
        HashMap map = this.f13118l;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            C0239t c0239t = ((C1036t) it.next()).f13182c;
            if (c0239t != null) {
                c0239t.l();
            }
        }
        d6.L();
        d6.f13844r = false;
        map.clear();
        this.f13119m.clear();
        this.f13127u = 0;
        this.f13126t = 0;
        this.f13122p.clear();
        e();
    }

    @Override // N.InterfaceC0220j
    public final void c() {
        f(true);
    }

    public final void d(int i) {
        boolean z5;
        boolean z6 = false;
        this.f13126t = 0;
        int i3 = (((P.a) this.f13115h.o()).f4578h.f4583j - this.f13127u) - 1;
        if (i <= i3) {
            this.f13123q.clear();
            if (i <= i3) {
                int i6 = i;
                while (true) {
                    Object obj = this.f13118l.get((D) ((P.a) this.f13115h.o()).get(i6));
                    k.c(obj);
                    this.f13123q.f13157h.add(((C1036t) obj).f13180a);
                    if (i6 == i3) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.f13123q.clear();
            AbstractC0391h abstractC0391hD = t.d();
            c cVarF = abstractC0391hD != null ? abstractC0391hD.f() : null;
            AbstractC0391h abstractC0391hE = t.e(abstractC0391hD);
            z5 = false;
            while (i3 >= i) {
                try {
                    D d6 = (D) ((P.a) this.f13115h.o()).get(i3);
                    Object obj2 = this.f13118l.get(d6);
                    k.c(obj2);
                    C1036t c1036t = (C1036t) obj2;
                    Object obj3 = c1036t.f13180a;
                    if (this.f13123q.f13157h.contains(obj3)) {
                        this.f13126t++;
                        if (((Boolean) c1036t.f13185f.getValue()).booleanValue()) {
                            J j4 = d6.f13829D;
                            j4.f13923r.f13898r = 3;
                            H h6 = j4.f13924s;
                            if (h6 != null) {
                                h6.f13873p = 3;
                            }
                            c1036t.f13185f.setValue(Boolean.FALSE);
                            z5 = true;
                        }
                    } else {
                        D d7 = this.f13115h;
                        d7.f13844r = true;
                        this.f13118l.remove(d6);
                        C0239t c0239t = c1036t.f13182c;
                        if (c0239t != null) {
                            c0239t.l();
                        }
                        this.f13115h.M(i3, 1);
                        d7.f13844r = false;
                    }
                    this.f13119m.remove(obj3);
                    i3--;
                } catch (Throwable th) {
                    t.g(abstractC0391hD, abstractC0391hE, cVarF);
                    throw th;
                }
            }
            t.g(abstractC0391hD, abstractC0391hE, cVarF);
        } else {
            z5 = false;
        }
        if (z5) {
            synchronized (o.f5709b) {
                A a6 = ((C0386c) o.i.get()).f5674h;
                if (a6 != null && a6.h()) {
                    z6 = true;
                }
            }
            if (z6) {
                o.a();
            }
        }
        e();
    }

    public final void e() {
        int i = ((P.a) this.f13115h.o()).f4578h.f4583j;
        HashMap map = this.f13118l;
        if (map.size() != i) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + map.size() + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((i - this.f13126t) - this.f13127u < 0) {
            StringBuilder sbV = p012c.k.v(i, "Incorrect state. Total children ", ". Reusable children ");
            sbV.append(this.f13126t);
            sbV.append(". Precomposed children ");
            sbV.append(this.f13127u);
            throw new IllegalArgumentException(sbV.toString().toString());
        }
        HashMap map2 = this.f13122p;
        if (map2.size() == this.f13127u) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f13127u + ". Map size " + map2.size()).toString());
    }

    public final void f(boolean z5) {
        this.f13127u = 0;
        this.f13122p.clear();
        D d6 = this.f13115h;
        int i = ((P.a) d6.o()).f4578h.f4583j;
        if (this.f13126t != i) {
            this.f13126t = i;
            AbstractC0391h abstractC0391hD = t.d();
            c cVarF = abstractC0391hD != null ? abstractC0391hD.f() : null;
            AbstractC0391h abstractC0391hE = t.e(abstractC0391hD);
            for (int i3 = 0; i3 < i; i3++) {
                try {
                    D d7 = (D) ((P.a) d6.o()).get(i3);
                    C1036t c1036t = (C1036t) this.f13118l.get(d7);
                    if (c1036t != null && ((Boolean) c1036t.f13185f.getValue()).booleanValue()) {
                        J j4 = d7.f13829D;
                        j4.f13923r.f13898r = 3;
                        H h6 = j4.f13924s;
                        if (h6 != null) {
                            h6.f13873p = 3;
                        }
                        if (z5) {
                            C0239t c0239t = c1036t.f13182c;
                            if (c0239t != null) {
                                c0239t.k();
                            }
                            c1036t.f13185f = C0208d.K(Boolean.FALSE, U.f3673m);
                        } else {
                            c1036t.f13185f.setValue(Boolean.FALSE);
                        }
                        c1036t.f13180a = U.f13151a;
                    }
                } catch (Throwable th) {
                    t.g(abstractC0391hD, abstractC0391hE, cVarF);
                    throw th;
                }
            }
            t.g(abstractC0391hD, abstractC0391hE, cVarF);
            this.f13119m.clear();
        }
        e();
    }

    public final void g(D d6, Object obj, e eVar) {
        boolean z5;
        HashMap map = this.f13118l;
        Object obj2 = map.get(d6);
        Object obj3 = obj2;
        if (obj2 == null) {
            a aVar = AbstractC1024g.f13166a;
            C1036t c1036t = new C1036t();
            c1036t.f13180a = obj;
            c1036t.f13181b = aVar;
            c1036t.f13182c = null;
            c1036t.f13185f = C0208d.K(Boolean.TRUE, U.f3673m);
            map.put(d6, c1036t);
            obj3 = c1036t;
        }
        C1036t c1036t2 = (C1036t) obj3;
        C0239t c0239t = c1036t2.f13182c;
        if (c0239t != null) {
            synchronized (c0239t.f3802k) {
                z5 = ((x) c0239t.f3812u.i).f10800e > 0;
            }
        } else {
            z5 = true;
        }
        if (c1036t2.f13181b != eVar || z5 || c1036t2.f13183d) {
            c1036t2.f13181b = eVar;
            AbstractC0391h abstractC0391hD = t.d();
            c cVarF = abstractC0391hD != null ? abstractC0391hD.f() : null;
            AbstractC0391h abstractC0391hE = t.e(abstractC0391hD);
            try {
                D d7 = this.f13115h;
                d7.f13844r = true;
                e eVar2 = c1036t2.f13181b;
                C0239t c0239t2 = c1036t2.f13182c;
                AbstractC0234q abstractC0234q = this.i;
                if (abstractC0234q == null) {
                    throw new IllegalStateException("parent composition reference not set");
                }
                c1036t2.f13182c = h(c0239t2, d6, c1036t2.f13184e, abstractC0234q, new a(-1750409193, new A2.d(c1036t2, 14, eVar2), true));
                c1036t2.f13184e = false;
                d7.f13844r = false;
                t.g(abstractC0391hD, abstractC0391hE, cVarF);
                c1036t2.f13183d = false;
            } catch (Throwable th) {
                t.g(abstractC0391hD, abstractC0391hE, cVarF);
                throw th;
            }
        }
    }

    public final D i(Object obj) {
        HashMap map;
        int i;
        if (this.f13126t == 0) {
            return null;
        }
        D d6 = this.f13115h;
        int i3 = ((P.a) d6.o()).f4578h.f4583j - this.f13127u;
        int i6 = i3 - this.f13126t;
        int i7 = i3 - 1;
        int i8 = i7;
        while (true) {
            map = this.f13118l;
            if (i8 < i6) {
                i = -1;
                break;
            }
            Object obj2 = map.get((D) ((P.a) d6.o()).get(i8));
            k.c(obj2);
            if (((C1036t) obj2).f13180a.equals(obj)) {
                i = i8;
                break;
            }
            i8--;
        }
        if (i == -1) {
            while (true) {
                if (i7 < i6) {
                    i8 = i7;
                    break;
                }
                Object obj3 = map.get((D) ((P.a) d6.o()).get(i7));
                k.c(obj3);
                C1036t c1036t = (C1036t) obj3;
                if (c1036t.f13180a == U.f13151a) {
                    c1036t.f13180a = obj;
                    i8 = i7;
                    i = i8;
                    break;
                }
                i7--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i8 != i6) {
            d6.f13844r = true;
            d6.G(i8, i6, 1);
            d6.f13844r = false;
        }
        this.f13126t--;
        D d7 = (D) ((P.a) d6.o()).get(i6);
        Object obj4 = map.get(d7);
        k.c(obj4);
        C1036t c1036t2 = (C1036t) obj4;
        c1036t2.f13185f = C0208d.K(Boolean.TRUE, U.f3673m);
        c1036t2.f13184e = true;
        c1036t2.f13183d = true;
        return d7;
    }
}
