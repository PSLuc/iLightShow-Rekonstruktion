package p046i2;

import J1.e;
import S1.N;
import S1.b0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import p012c.k;
import p015c2.A;
import p015c2.B;
import p015c2.C0470a;
import p015c2.h;
import p015c2.z;
import p026e2.n;
import p026e2.o;
import p035g0.C0715p;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class H extends t implements Comparable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0470a f9502t = new C0470a(1, "");
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f9503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final B f9504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final A f9505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final A f9506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f9507n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e f9508o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f9509p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public e f9510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public transient z f9511r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public transient C0470a f9512s;

    public H(n nVar, B b6, boolean z5, A a6, A a7) {
        this.f9503j = nVar;
        this.f9504k = b6;
        this.f9506m = a6;
        this.f9505l = a7;
        this.i = z5;
    }

    public static boolean B(e eVar) {
        while (eVar != null) {
            if (((A) eVar.f1903g) != null && eVar.f1898b) {
                return true;
            }
            eVar = (e) eVar.f1902f;
        }
        return false;
    }

    public static boolean C(e eVar) {
        while (eVar != null) {
            A a6 = (A) eVar.f1903g;
            if (a6 != null && !a6.f7195h.isEmpty()) {
                return true;
            }
            eVar = (e) eVar.f1902f;
        }
        return false;
    }

    public static boolean D(e eVar) {
        A a6;
        while (eVar != null) {
            if (!eVar.f1900d && (a6 = (A) eVar.f1903g) != null && !a6.f7195h.isEmpty()) {
                return true;
            }
            eVar = (e) eVar.f1902f;
        }
        return false;
    }

    public static boolean E(e eVar) {
        while (eVar != null) {
            if (eVar.f1900d) {
                return true;
            }
            eVar = (e) eVar.f1902f;
        }
        return false;
    }

    public static boolean F(e eVar) {
        while (eVar != null) {
            if (eVar.f1899c) {
                return true;
            }
            eVar = (e) eVar.f1902f;
        }
        return false;
    }

    public static e G(e eVar, C0715p c0715p) {
        AbstractC0771g abstractC0771g = (AbstractC0771g) ((AbstractC0771g) eVar.f1901e).t(c0715p);
        e eVar2 = (e) eVar.f1902f;
        if (eVar2 != null) {
            eVar = eVar.g(G(eVar2, c0715p));
        }
        if (abstractC0771g == ((AbstractC0771g) eVar.f1901e)) {
            return eVar;
        }
        return new e(abstractC0771g, (e) eVar.f1902f, (A) eVar.f1903g, eVar.f1898b, eVar.f1899c, eVar.f1900d);
    }

    public static Set I(e eVar, Set set) {
        A a6;
        while (eVar != null) {
            if (eVar.f1898b && (a6 = (A) eVar.f1903g) != null) {
                if (set == null) {
                    set = new HashSet();
                }
                set.add(a6);
            }
            eVar = (e) eVar.f1902f;
        }
        return set;
    }

    public static C0715p J(e eVar) {
        C0715p c0715p = ((AbstractC0771g) eVar.f1901e).f9546j;
        e eVar2 = (e) eVar.f1902f;
        return eVar2 != null ? C0715p.u(c0715p, J(eVar2)) : c0715p;
    }

    public static int K(C0772h c0772h) {
        String name = c0772h.f9547l.getName();
        if (!name.startsWith("get") || name.length() <= 3) {
            return (!name.startsWith("is") || name.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    public static C0715p L(int i, e... eVarArr) {
        C0715p c0715pJ = J(eVarArr[i]);
        do {
            i++;
            if (i >= eVarArr.length) {
                return c0715pJ;
            }
        } while (eVarArr[i] == null);
        return C0715p.u(c0715pJ, L(i, eVarArr));
    }

    @Override // p046i2.t
    public final boolean A() {
        Boolean bool = (Boolean) N(new F(this, 2));
        return bool != null && bool.booleanValue();
    }

    public final void H(Set set, HashMap map, e eVar) {
        A a6;
        for (e eVar2 = eVar; eVar2 != null; eVar2 = (e) eVar2.f1902f) {
            if (eVar2.f1898b && (a6 = (A) eVar2.f1903g) != null) {
                H h6 = (H) map.get(a6);
                if (h6 == null) {
                    H h7 = new H(this.f9503j, this.f9504k, this.i, this.f9506m, a6);
                    map.put(a6, h7);
                    h6 = h7;
                }
                if (eVar == this.f9507n) {
                    h6.f9507n = eVar2.g(h6.f9507n);
                } else if (eVar == this.f9509p) {
                    h6.f9509p = eVar2.g(h6.f9509p);
                } else if (eVar == this.f9510q) {
                    h6.f9510q = eVar2.g(h6.f9510q);
                } else {
                    if (eVar != this.f9508o) {
                        throw new IllegalStateException("Internal error: mismatched accessors, property: " + this);
                    }
                    h6.f9508o = eVar2.g(h6.f9508o);
                }
            } else if (eVar2.f1899c) {
                StringBuilder sb = new StringBuilder("Conflicting/ambiguous property name definitions (implicit name ");
                Annotation[] annotationArr = i.f12697a;
                A a7 = this.f9505l;
                sb.append(a7 == null ? "[null]" : i.c(a7.f7195h));
                sb.append("): found multiple explicit names: ");
                sb.append(set);
                sb.append(", but also implicit accessor: ");
                sb.append(eVar2);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public final C0772h M(C0772h c0772h, C0772h c0772h2) {
        Class<?> declaringClass = c0772h.f9547l.getDeclaringClass();
        Class<?> declaringClass2 = c0772h2.f9547l.getDeclaringClass();
        if (declaringClass != declaringClass2) {
            if (!declaringClass.isAssignableFrom(declaringClass2)) {
                if (!declaringClass2.isAssignableFrom(declaringClass)) {
                }
            }
        }
        String name = c0772h2.f9547l.getName();
        char c6 = 2;
        char c7 = (!name.startsWith("set") || name.length() <= 3) ? (char) 2 : (char) 1;
        String name2 = c0772h.f9547l.getName();
        if (name2.startsWith("set") && name2.length() > 3) {
            c6 = 1;
        }
        if (c7 != c6) {
            return c7 < c6 ? c0772h2 : c0772h;
        }
        B b6 = this.f9504k;
        if (b6 == null) {
            return null;
        }
        return b6.q0(c0772h, c0772h2);
    }

    public final Object N(F f6) {
        e eVar;
        e eVar2;
        Object objA = null;
        if (this.f9504k != null) {
            if (this.i) {
                e eVar3 = this.f9509p;
                if (eVar3 != null) {
                    objA = f6.a((AbstractC0771g) eVar3.f1901e);
                }
            } else {
                e eVar4 = this.f9508o;
                objA = eVar4 != null ? f6.a((AbstractC0771g) eVar4.f1901e) : null;
                if (objA == null && (eVar = this.f9510q) != null) {
                    objA = f6.a((AbstractC0771g) eVar.f1901e);
                }
            }
            if (objA == null && (eVar2 = this.f9507n) != null) {
                return f6.a((AbstractC0771g) eVar2.f1901e);
            }
        }
        return objA;
    }

    public final AbstractC0771g O() {
        if (this.i) {
            return l();
        }
        AbstractC0771g abstractC0771gM = m();
        if (abstractC0771gM == null && (abstractC0771gM = s()) == null) {
            abstractC0771gM = o();
        }
        return abstractC0771gM == null ? l() : abstractC0771gM;
    }

    @Override // p046i2.t
    public final A a() {
        return this.f9505l;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2  */
    @Override // p046i2.t
    public final z c() {
        AbstractC0771g abstractC0771g;
        boolean z5;
        Class cls;
        Boolean boolT;
        if (this.f9511r == null) {
            boolean z6 = this.i;
            if (z6) {
                e eVar = this.f9509p;
                if (eVar != null) {
                    abstractC0771g = (AbstractC0771g) eVar.f1901e;
                } else {
                    e eVar2 = this.f9507n;
                    if (eVar2 != null) {
                        abstractC0771g = (AbstractC0771g) eVar2.f1901e;
                    } else {
                        abstractC0771g = null;
                    }
                }
            } else {
                e eVar3 = this.f9508o;
                if (eVar3 != null) {
                    abstractC0771g = (AbstractC0771g) eVar3.f1901e;
                } else {
                    e eVar4 = this.f9510q;
                    if (eVar4 != null) {
                        abstractC0771g = (AbstractC0771g) eVar4.f1901e;
                    } else {
                        e eVar5 = this.f9507n;
                        if (eVar5 != null) {
                            abstractC0771g = (AbstractC0771g) eVar5.f1901e;
                        } else {
                            e eVar6 = this.f9509p;
                            if (eVar6 != null) {
                                abstractC0771g = (AbstractC0771g) eVar6.f1901e;
                            } else {
                                abstractC0771g = null;
                            }
                        }
                    }
                }
            }
            if (abstractC0771g == null) {
                this.f9511r = z.f7339q;
            } else {
                B b6 = this.f9504k;
                Boolean boolK0 = b6.k0(abstractC0771g);
                String strG = b6.G(abstractC0771g);
                Integer numL = b6.L(abstractC0771g);
                String strF = b6.F(abstractC0771g);
                if (boolK0 == null && numL == null && strF == null) {
                    z zVar = z.f7339q;
                    if (strG != null) {
                        zVar = new z(zVar.f7340h, strG, zVar.f7341j, zVar.f7342k, zVar.f7343l, zVar.f7344m, zVar.f7345n);
                    }
                    this.f9511r = zVar;
                } else {
                    this.f9511r = z.a(boolK0, strG, numL, strF);
                }
                if (!z6) {
                    z zVarB = this.f9511r;
                    AbstractC0771g abstractC0771gL = l();
                    if (abstractC0771gL == null || (boolT = b6.t(abstractC0771g)) == null) {
                        z5 = true;
                    } else {
                        if (boolT.booleanValue()) {
                            zVarB = zVarB.b(new O1.B(abstractC0771gL, false));
                        }
                        z5 = false;
                    }
                    N nV = b6.V(abstractC0771g);
                    b0 b0Var = b0.f4930k;
                    b0 b0Var2 = nV.f4912h;
                    if (b0Var2 == b0Var) {
                        b0Var2 = null;
                    }
                    b0 b0Var3 = nV.i;
                    if (b0Var3 == b0Var) {
                        b0Var3 = null;
                    }
                    n nVar = this.f9503j;
                    if (z5 || b0Var2 == null || b0Var3 == null) {
                        if (abstractC0771g instanceof C0772h) {
                            C0772h c0772h = (C0772h) abstractC0771g;
                            if (c0772h.f9547l.getParameterCount() > 0) {
                                cls = c0772h.z(0).f7281k;
                            } else {
                                cls = abstractC0771g.h().f7281k;
                            }
                        } else {
                            cls = abstractC0771g.h().f7281k;
                        }
                        nVar.e(cls);
                    }
                    if (z5 || b0Var2 == null || b0Var3 == null) {
                        o oVar = (o) nVar;
                        oVar.f8724n.getClass();
                        if (b0Var2 == null) {
                            b0Var2 = null;
                        }
                        if (b0Var3 == null) {
                            b0Var3 = null;
                        }
                        if (z5) {
                            oVar.f8724n.getClass();
                            if (Boolean.TRUE.equals(null) && abstractC0771gL != null) {
                                zVarB = zVarB.b(new O1.B(abstractC0771gL, true));
                            }
                        }
                    }
                    b0 b0Var4 = b0Var2;
                    b0 b0Var5 = b0Var3;
                    if (b0Var4 != null || b0Var5 != null) {
                        zVarB = new z(zVarB.f7340h, zVarB.i, zVarB.f7341j, zVarB.f7342k, zVarB.f7343l, b0Var4, b0Var5);
                    }
                    this.f9511r = zVarB;
                }
            }
        }
        return this.f9511r;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        H h6 = (H) obj;
        if (this.f9508o != null) {
            if (h6.f9508o == null) {
                return -1;
            }
        } else if (h6.f9508o != null) {
            return 1;
        }
        return getName().compareTo(h6.getName());
    }

    @Override // p046i2.t
    public final boolean d() {
        return (this.f9508o == null && this.f9510q == null && this.f9507n == null) ? false : true;
    }

    @Override // p046i2.t
    public final boolean g() {
        return (this.f9509p == null && this.f9507n == null) ? false : true;
    }

    @Override // p109u2.t
    public final String getName() {
        A a6 = this.f9505l;
        if (a6 == null) {
            return null;
        }
        return a6.f7195h;
    }

    @Override // p046i2.t
    public final S1.A h() {
        AbstractC0771g abstractC0771gL = l();
        B b6 = this.f9504k;
        S1.A aJ = b6 == null ? null : b6.J(abstractC0771gL);
        return aJ == null ? S1.A.f4905l : aJ;
    }

    @Override // p046i2.t
    public final C i() {
        return (C) N(new F(this, 3));
    }

    @Override // p046i2.t
    public final C0470a j() {
        C0470a c0470a = this.f9512s;
        C0470a c0470a2 = f9502t;
        if (c0470a != null) {
            if (c0470a == c0470a2) {
                return null;
            }
            return c0470a;
        }
        C0470a c0470a3 = (C0470a) N(new F(this, 1));
        if (c0470a3 != null) {
            c0470a2 = c0470a3;
        }
        this.f9512s = c0470a2;
        return c0470a3;
    }

    @Override // p046i2.t
    public final Class[] k() {
        return (Class[]) N(new F(this, 0));
    }

    @Override // p046i2.t
    public final C0776l m() {
        e eVar = this.f9508o;
        if (eVar == null) {
            return null;
        }
        do {
            C0776l c0776l = (C0776l) ((AbstractC0771g) eVar.f1901e);
            if (c0776l.f9555k instanceof C0767c) {
                return c0776l;
            }
            eVar = (e) eVar.f1902f;
        } while (eVar != null);
        return (C0776l) ((AbstractC0771g) this.f9508o.f1901e);
    }

    @Override // p046i2.t
    public final Iterator n() {
        e eVar = this.f9508o;
        if (eVar == null) {
            return i.f12699c;
        }
        G g6 = new G();
        g6.f9501h = eVar;
        return g6;
    }

    @Override // p046i2.t
    public final C0769e o() {
        e eVar = this.f9507n;
        if (eVar == null) {
            return null;
        }
        C0769e c0769e = (C0769e) ((AbstractC0771g) eVar.f1901e);
        for (e eVar2 = (e) eVar.f1902f; eVar2 != null; eVar2 = (e) eVar2.f1902f) {
            C0769e c0769e2 = (C0769e) ((AbstractC0771g) eVar2.f1901e);
            Class<?> declaringClass = c0769e.f9542k.getDeclaringClass();
            Class<?> declaringClass2 = c0769e2.f9542k.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    c0769e = c0769e2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
            }
            throw new IllegalArgumentException("Multiple fields representing property \"" + getName() + "\": " + c0769e.o() + " vs " + c0769e2.o());
        }
        return c0769e;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x004a A[SYNTHETIC] */
    @Override // p046i2.t
    public final C0772h p() {
        int iK;
        int iK2;
        e eVar = this.f9509p;
        if (eVar == null) {
            return null;
        }
        e eVar2 = (e) eVar.f1902f;
        if (eVar2 == null) {
            return (C0772h) ((AbstractC0771g) eVar.f1901e);
        }
        while (true) {
            AbstractC0771g abstractC0771g = (AbstractC0771g) eVar.f1901e;
            if (eVar2 == null) {
                this.f9509p = eVar.i();
                return (C0772h) abstractC0771g;
            }
            C0772h c0772h = (C0772h) abstractC0771g;
            Class<?> declaringClass = c0772h.f9547l.getDeclaringClass();
            C0772h c0772h2 = (C0772h) ((AbstractC0771g) eVar2.f1901e);
            Class<?> declaringClass2 = c0772h2.f9547l.getDeclaringClass();
            if (declaringClass == declaringClass2) {
                iK = K(c0772h2);
                iK2 = K(c0772h);
                if (iK != iK2) {
                    throw new IllegalArgumentException("Conflicting getter definitions for property \"" + getName() + "\": " + c0772h.o() + " vs " + c0772h2.o());
                }
                if (iK < iK2) {
                    eVar = eVar2;
                }
            } else if (declaringClass.isAssignableFrom(declaringClass2)) {
                eVar = eVar2;
            } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                continue;
            } else {
                iK = K(c0772h2);
                iK2 = K(c0772h);
                if (iK != iK2) {
                    throw new IllegalArgumentException("Conflicting getter definitions for property \"" + getName() + "\": " + c0772h.o() + " vs " + c0772h2.o());
                }
                if (iK < iK2) {
                    eVar = eVar2;
                }
            }
            eVar2 = (e) eVar2.f1902f;
        }
    }

    @Override // p046i2.t
    public final h q() {
        if (this.i) {
            q qVarP = p();
            return (qVarP == null && (qVarP = o()) == null) ? p104t2.n.n() : qVarP.h();
        }
        q qVarM = m();
        if (qVarM == null) {
            C0772h c0772hS = s();
            if (c0772hS != null) {
                return c0772hS.z(0);
            }
            qVarM = o();
        }
        return (qVarM == null && (qVarM = p()) == null) ? p104t2.n.n() : qVarM.h();
    }

    @Override // p046i2.t
    public final Class r() {
        return q().f7281k;
    }

    @Override // p046i2.t
    public final C0772h s() {
        AbstractC0771g abstractC0771g;
        e eVar = this.f9510q;
        if (eVar == null) {
            return null;
        }
        e eVar2 = (e) eVar.f1902f;
        if (eVar2 == null) {
            return (C0772h) ((AbstractC0771g) eVar.f1901e);
        }
        while (true) {
            AbstractC0771g abstractC0771g2 = (AbstractC0771g) eVar.f1901e;
            if (eVar2 == null) {
                this.f9510q = eVar.i();
                return (C0772h) abstractC0771g2;
            }
            AbstractC0771g abstractC0771g3 = (AbstractC0771g) eVar2.f1901e;
            C0772h c0772hM = M((C0772h) abstractC0771g2, (C0772h) abstractC0771g3);
            e eVar3 = (e) eVar2.f1902f;
            if (c0772hM != abstractC0771g2) {
                if (c0772hM != abstractC0771g3) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(abstractC0771g2);
                    arrayList.add(abstractC0771g3);
                    while (true) {
                        abstractC0771g = (AbstractC0771g) eVar.f1901e;
                        if (eVar3 == null) {
                            break;
                        }
                        AbstractC0771g abstractC0771g4 = (AbstractC0771g) eVar3.f1901e;
                        C0772h c0772hM2 = M((C0772h) abstractC0771g, (C0772h) abstractC0771g4);
                        if (c0772hM2 != abstractC0771g) {
                            if (c0772hM2 == abstractC0771g4) {
                                arrayList.clear();
                                eVar = eVar3;
                            } else {
                                arrayList.add(abstractC0771g4);
                            }
                        }
                        eVar3 = (e) eVar3.f1902f;
                    }
                    if (arrayList.isEmpty()) {
                        this.f9510q = eVar.i();
                        return (C0772h) abstractC0771g;
                    }
                    throw new IllegalArgumentException(k.s("Conflicting setter definitions for property \"", getName(), "\": ", (String) arrayList.stream().map(new E()).collect(Collectors.joining(" vs "))));
                }
                eVar = eVar2;
            }
            eVar2 = eVar3;
        }
    }

    @Override // p046i2.t
    public final A t() {
        B b6;
        if (O() != null && (b6 = this.f9504k) != null) {
            b6.getClass();
        }
        return null;
    }

    public final String toString() {
        return "[Property '" + this.f9505l + "'; ctors: " + this.f9508o + ", field(s): " + this.f9507n + ", getter(s): " + this.f9509p + ", setter(s): " + this.f9510q + "]";
    }

    @Override // p046i2.t
    public final boolean u() {
        return this.f9508o != null;
    }

    @Override // p046i2.t
    public final boolean v() {
        return this.f9507n != null;
    }

    @Override // p046i2.t
    public final boolean w(A a6) {
        return this.f9505l.equals(a6);
    }

    @Override // p046i2.t
    public final boolean x() {
        return this.f9510q != null;
    }

    @Override // p046i2.t
    public final boolean y() {
        return C(this.f9507n) || C(this.f9509p) || C(this.f9510q) || B(this.f9508o);
    }

    @Override // p046i2.t
    public final boolean z() {
        return B(this.f9507n) || B(this.f9509p) || B(this.f9510q) || B(this.f9508o);
    }

    public H(H h6, A a6) {
        this.f9503j = h6.f9503j;
        this.f9504k = h6.f9504k;
        this.f9506m = h6.f9506m;
        this.f9505l = a6;
        this.f9507n = h6.f9507n;
        this.f9508o = h6.f9508o;
        this.f9509p = h6.f9509p;
        this.f9510q = h6.f9510q;
        this.i = h6.i;
    }
}
