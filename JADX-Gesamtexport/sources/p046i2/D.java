package p046i2;

import J1.e;
import S1.C0340b;
import S1.EnumC0348j;
import S1.H;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p015c2.A;
import p015c2.B;
import p015c2.h;
import p015c2.r;
import p026e2.n;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f9481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f9482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f9484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0766b f9485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L f9486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final B f9487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9488h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinkedHashMap f9489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinkedList f9490k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinkedList f9491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinkedList f9492m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinkedList f9493n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedList f9494o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinkedList f9495p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinkedList f9496q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HashSet f9497r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinkedHashMap f9498s;

    public D(n nVar, boolean z5, h hVar, C0766b c0766b, y yVar) {
        this.f9481a = nVar;
        this.f9483c = z5;
        this.f9484d = hVar;
        this.f9485e = c0766b;
        nVar.getClass();
        if (nVar.k(r.USE_ANNOTATIONS)) {
            this.f9488h = true;
            this.f9487g = nVar.d();
        } else {
            this.f9488h = false;
            this.f9487g = B.f9474h;
        }
        this.f9486f = nVar.g(hVar.f7281k, c0766b);
        this.f9482b = yVar;
        nVar.k(r.USE_STD_BEAN_NAMING);
    }

    public static boolean f(LinkedList linkedList) {
        do {
            AbstractC0771g abstractC0771g = (AbstractC0771g) linkedList.get(0);
            AbstractC0771g abstractC0771g2 = (AbstractC0771g) linkedList.get(1);
            if (abstractC0771g instanceof C0769e) {
                if (!(abstractC0771g2 instanceof C0772h)) {
                    return false;
                }
                linkedList.remove(0);
            } else {
                if (!(abstractC0771g instanceof C0772h) || !(abstractC0771g2 instanceof C0769e)) {
                    return false;
                }
                linkedList.remove(1);
            }
        } while (linkedList.size() > 1);
        return true;
    }

    public final void a(LinkedHashMap linkedHashMap, C0776l c0776l) {
        H hE;
        EnumC0348j enumC0348jE;
        B b6 = this.f9487g;
        b6.o(c0776l);
        A aU = b6.u(c0776l);
        boolean z5 = (aU == null || aU.c()) ? false : true;
        if (!z5) {
            if ("".isEmpty() || (enumC0348jE = b6.e(this.f9481a, c0776l.f9555k)) == null || enumC0348jE == EnumC0348j.f4952k) {
                return;
            } else {
                aU = A.a("");
            }
        }
        String strB = b("");
        if (z5 && strB.isEmpty()) {
            String str = aU.f7195h;
            hE = (H) linkedHashMap.get(str);
            if (hE == null) {
                H h6 = new H(this.f9481a, this.f9487g, this.f9483c, aU, aU);
                linkedHashMap.put(str, h6);
                hE = h6;
            }
        } else {
            hE = e(linkedHashMap, strB);
        }
        H h7 = hE;
        h7.f9508o = new e(c0776l, h7.f9508o, aU, z5, true, false);
        this.f9490k.add(h7);
    }

    public final String b(String str) {
        return str;
    }

    public final void c(String str) {
        if (this.f9483c || str == null) {
            return;
        }
        if (this.f9497r == null) {
            this.f9497r = new HashSet();
        }
        this.f9497r.add(str);
    }

    public final void d(C0340b c0340b, AbstractC0771g abstractC0771g) {
        if (c0340b == null) {
            return;
        }
        if (this.f9498s == null) {
            this.f9498s = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = this.f9498s;
        Object obj = c0340b.f4927h;
        AbstractC0771g abstractC0771g2 = (AbstractC0771g) linkedHashMap.put(obj, abstractC0771g);
        if (abstractC0771g2 == null || abstractC0771g2.getClass() != abstractC0771g.getClass()) {
            return;
        }
        throw new IllegalArgumentException("Duplicate injectable value with id '" + obj + "' (of type " + obj.getClass().getName() + ")");
    }

    public final H e(LinkedHashMap linkedHashMap, String str) {
        H h6 = (H) linkedHashMap.get(str);
        if (h6 != null) {
            return h6;
        }
        A a6 = A.a(str);
        H h7 = new H(this.f9481a, this.f9487g, this.f9483c, a6, a6);
        linkedHashMap.put(str, h7);
        return h7;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x02f6  */
    public final void g() {
        L l6;
        y yVar;
        B b6;
        boolean z5;
        Collection<H> collectionValues;
        e eVar;
        e eVar2;
        e eVar3;
        e eVar4;
        H hC;
        e eVar5;
        e eVar6;
        e eVar7;
        e eVar8;
        boolean z6;
        String strC;
        A a6;
        boolean z7;
        boolean z8;
        boolean zA;
        String strB;
        boolean zA2;
        boolean z9;
        boolean z10;
        boolean z11;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z12 = this.f9483c;
        n nVar = this.f9481a;
        boolean z13 = (z12 || nVar.k(r.ALLOW_FINAL_FIELDS_AS_MUTATORS)) ? false : true;
        boolean zK = nVar.k(r.PROPAGATE_TRANSIENT_MARKER);
        C0766b c0766b = this.f9485e;
        Iterator it = c0766b.o().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            l6 = this.f9486f;
            yVar = this.f9482b;
            b6 = this.f9487g;
            if (!zHasNext) {
                break;
            }
            C0769e c0769e = (C0769e) it.next();
            Boolean bool = Boolean.TRUE;
            if (bool.equals(b6.f0(c0769e))) {
                if (this.f9495p == null) {
                    this.f9495p = new LinkedList();
                }
                this.f9495p.add(c0769e);
            }
            if (bool.equals(b6.g0(c0769e))) {
                if (this.f9496q == null) {
                    this.f9496q = new LinkedList();
                }
                this.f9496q.add(c0769e);
            } else {
                boolean zEquals = bool.equals(b6.c0(c0769e));
                boolean zEquals2 = bool.equals(b6.e0(c0769e));
                if (zEquals || zEquals2) {
                    if (zEquals) {
                        if (this.f9492m == null) {
                            this.f9492m = new LinkedList();
                        }
                        this.f9492m.add(c0769e);
                    }
                    if (zEquals2) {
                        if (this.f9494o == null) {
                            this.f9494o = new LinkedList();
                        }
                        this.f9494o.add(c0769e);
                    }
                } else {
                    b6.o(c0769e);
                    String name = c0769e.f9542k.getName();
                    yVar.getClass();
                    if (name != null) {
                        A.b(name, null);
                        A aV = z12 ? b6.v(c0769e) : b6.u(c0769e);
                        boolean z14 = aV != null;
                        if (z14 && aV.c()) {
                            aV = A.b(name, null);
                            z9 = false;
                        } else {
                            z9 = z14;
                        }
                        A a7 = aV;
                        boolean zA3 = a7 != null;
                        if (!zA3) {
                            l6.getClass();
                            zA3 = l6.f9521l.a(c0769e.f9542k);
                        }
                        boolean zJ0 = b6.j0(c0769e);
                        if (!Modifier.isTransient(c0769e.f9542k.getModifiers()) || z14) {
                            z10 = zA3;
                            z11 = zJ0;
                        } else if (zK) {
                            z10 = false;
                            z11 = true;
                        } else {
                            z11 = zJ0;
                            z10 = false;
                        }
                        if (!z13 || a7 != null || z11 || !Modifier.isFinal(c0769e.f9542k.getModifiers())) {
                            H hE = e(linkedHashMap, name);
                            hE.f9507n = new e(c0769e, hE.f9507n, a7, z9, z10, z11);
                        }
                    }
                }
            }
        }
        for (C0772h c0772h : c0766b.n()) {
            int parameterCount = c0772h.f9547l.getParameterCount();
            Method method = c0772h.f9547l;
            if (parameterCount == 0) {
                Class<?> returnType = method.getReturnType();
                if (returnType != Void.TYPE && (returnType != Void.class || nVar.k(r.ALLOW_VOID_VALUED_PROPERTIES))) {
                    Boolean bool2 = Boolean.TRUE;
                    if (bool2.equals(b6.c0(c0772h))) {
                        if (this.f9491l == null) {
                            this.f9491l = new LinkedList();
                        }
                        this.f9491l.add(c0772h);
                    } else if (bool2.equals(b6.f0(c0772h))) {
                        if (this.f9495p == null) {
                            this.f9495p = new LinkedList();
                        }
                        this.f9495p.add(c0772h);
                    } else if (bool2.equals(b6.g0(c0772h))) {
                        if (this.f9496q == null) {
                            this.f9496q = new LinkedList();
                        }
                        this.f9496q.add(c0772h);
                    } else {
                        A aV2 = b6.v(c0772h);
                        boolean z15 = aV2 != null;
                        if (z15) {
                            b6.o(c0772h);
                            strC = yVar.c(c0772h, method.getName());
                            if (strC == null) {
                                strC = yVar.a(c0772h, method.getName());
                            }
                            if (strC == null) {
                                strC = method.getName();
                            }
                            if (aV2.c()) {
                                aV2 = A.b(strC, null);
                                z15 = false;
                            }
                            a6 = aV2;
                            z7 = z15;
                            z8 = true;
                        } else {
                            b6.o(c0772h);
                            strC = yVar.c(c0772h, method.getName());
                            if (strC == null) {
                                strC = yVar.a(c0772h, method.getName());
                                if (strC != null) {
                                    l6.getClass();
                                    zA = l6.i.a(method);
                                }
                            } else {
                                l6.getClass();
                                zA = l6.f9518h.a(method);
                            }
                            a6 = aV2;
                            z7 = z15;
                            z8 = zA;
                        }
                        String strB2 = b(strC);
                        boolean zJ1 = b6.j0(c0772h);
                        H hE2 = e(linkedHashMap, strB2);
                        hE2.f9509p = new e(c0772h, hE2.f9509p, a6, z7, z8, zJ1);
                    }
                }
            } else if (parameterCount == 1) {
                A aU = b6.u(c0772h);
                boolean z16 = aU != null;
                if (z16) {
                    b6.o(c0772h);
                    strB = yVar.b(method.getName());
                    if (strB == null) {
                        strB = method.getName();
                    }
                    if (aU.c()) {
                        aU = A.b(strB, null);
                        z16 = false;
                    }
                    zA2 = true;
                } else {
                    b6.o(c0772h);
                    strB = yVar.b(method.getName());
                    if (strB != null) {
                        l6.getClass();
                        zA2 = l6.f9519j.a(method);
                    }
                }
                A a8 = aU;
                boolean z17 = z16;
                String strB3 = b(strB);
                boolean zJ2 = b6.j0(c0772h);
                H hE3 = e(linkedHashMap, strB3);
                hE3.f9510q = new e(c0772h, hE3.f9510q, a8, z17, zA2, zJ2);
            } else if (parameterCount == 2 && Boolean.TRUE.equals(b6.e0(c0772h))) {
                if (this.f9493n == null) {
                    this.f9493n = new LinkedList();
                }
                this.f9493n.add(c0772h);
            }
        }
        Boolean boolValueOf = c0766b.f9537v;
        if (boolValueOf == null) {
            Annotation[] annotationArr = i.f12697a;
            Class cls = c0766b.f9525j;
            if (Modifier.isStatic(cls.getModifiers())) {
                z6 = false;
            } else if ((i.w(cls) ? null : cls.getEnclosingClass()) != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolValueOf = Boolean.valueOf(z6);
            c0766b.f9537v = boolValueOf;
        }
        if (!boolValueOf.booleanValue() && this.f9488h) {
            for (C0767c c0767c : (List) c0766b.m().f394j) {
                if (this.f9490k == null) {
                    this.f9490k = new LinkedList();
                }
                int parameterCount2 = c0767c.f9538l.getParameterCount();
                for (int i = 0; i < parameterCount2; i++) {
                    a(linkedHashMap, c0767c.x(i));
                }
            }
            for (C0772h c0772h2 : (List) c0766b.m().f395k) {
                if (this.f9490k == null) {
                    this.f9490k = new LinkedList();
                }
                int parameterCount3 = c0772h2.f9547l.getParameterCount();
                for (int i3 = 0; i3 < parameterCount3; i3++) {
                    a(linkedHashMap, c0772h2.x(i3));
                }
            }
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            H h6 = (H) it2.next();
            if (!H.F(h6.f9507n) && !H.F(h6.f9509p) && !H.F(h6.f9510q) && !H.F(h6.f9508o)) {
                it2.remove();
            } else if (H.E(h6.f9507n) || H.E(h6.f9509p) || H.E(h6.f9510q) || H.E(h6.f9508o)) {
                if (!H.D(h6.f9507n) && !H.D(h6.f9509p) && !H.D(h6.f9510q)) {
                    e eVar9 = h6.f9508o;
                    while (true) {
                        if (eVar9 == null) {
                            it2.remove();
                            c(h6.getName());
                        } else if (eVar9.f1900d || ((A) eVar9.f1903g) == null || !eVar9.f1898b) {
                            eVar9 = (e) eVar9.f1902f;
                        }
                    }
                }
                e eVarH = h6.f9507n;
                if (eVarH != null) {
                    eVarH = eVarH.h();
                }
                h6.f9507n = eVarH;
                e eVarH2 = h6.f9509p;
                if (eVarH2 != null) {
                    eVarH2 = eVarH2.h();
                }
                h6.f9509p = eVarH2;
                e eVarH3 = h6.f9510q;
                if (eVarH3 != null) {
                    eVarH3 = eVarH3.h();
                }
                h6.f9510q = eVarH3;
                e eVarH4 = h6.f9508o;
                if (eVarH4 != null) {
                    eVarH4 = eVarH4.h();
                }
                h6.f9508o = eVarH4;
                if (!h6.d()) {
                    c(h6.getName());
                }
            }
        }
        boolean zK2 = nVar.k(r.INFER_PROPERTY_MUTATORS);
        for (H h7 : linkedHashMap.values()) {
            D d6 = z12 ? null : this;
            H h8 = H.f4910h;
            boolean z18 = h7.i;
            B b7 = h7.f9504k;
            if (b7 == null || (!z18 ? ((eVar = h7.f9508o) == null || (hC = b7.C((AbstractC0771g) eVar.f1901e)) == null || hC == h8) && (((eVar2 = h7.f9510q) == null || (hC = b7.C((AbstractC0771g) eVar2.f1901e)) == null || hC == h8) && (((eVar3 = h7.f9507n) == null || (hC = b7.C((AbstractC0771g) eVar3.f1901e)) == null || hC == h8) && ((eVar4 = h7.f9509p) == null || (hC = b7.C((AbstractC0771g) eVar4.f1901e)) == null || hC == h8))) : ((eVar5 = h7.f9509p) == null || (hC = b7.C((AbstractC0771g) eVar5.f1901e)) == null || hC == h8) && (((eVar6 = h7.f9507n) == null || (hC = b7.C((AbstractC0771g) eVar6.f1901e)) == null || hC == h8) && (((eVar7 = h7.f9508o) == null || (hC = b7.C((AbstractC0771g) eVar7.f1901e)) == null || hC == h8) && ((eVar8 = h7.f9510q) == null || (hC = b7.C((AbstractC0771g) eVar8.f1901e)) == null || hC == h8))))) {
                hC = null;
            }
            if (hC != null) {
                h8 = hC;
            }
            int iOrdinal = h8.ordinal();
            if (iOrdinal == 1) {
                if (d6 != null) {
                    d6.c(h7.getName());
                    Set setI = H.I(h7.f9508o, H.I(h7.f9510q, H.I(h7.f9509p, H.I(h7.f9507n, null))));
                    if (setI == null) {
                        setI = Collections.EMPTY_SET;
                    }
                    Iterator it3 = setI.iterator();
                    while (it3.hasNext()) {
                        d6.c(((A) it3.next()).f7195h);
                    }
                }
                h7.f9510q = null;
                h7.f9508o = null;
                if (!z18) {
                    h7.f9507n = null;
                }
            } else if (iOrdinal == 2) {
                h7.f9509p = null;
                if (z18) {
                    h7.f9507n = null;
                }
            } else if (iOrdinal != 3) {
                e eVarJ = h7.f9509p;
                if (eVarJ != null) {
                    eVarJ = eVarJ.j();
                }
                h7.f9509p = eVarJ;
                e eVarJ2 = h7.f9508o;
                if (eVarJ2 != null) {
                    eVarJ2 = eVarJ2.j();
                }
                h7.f9508o = eVarJ2;
                if (!zK2 || h7.f9509p == null) {
                    e eVarJ3 = h7.f9507n;
                    if (eVarJ3 != null) {
                        eVarJ3 = eVarJ3.j();
                    }
                    h7.f9507n = eVarJ3;
                    e eVarJ4 = h7.f9510q;
                    if (eVarJ4 != null) {
                        eVarJ4 = eVarJ4.j();
                    }
                    h7.f9510q = eVarJ4;
                }
            }
        }
        Iterator it4 = linkedHashMap.entrySet().iterator();
        LinkedList<H> linkedList = null;
        while (it4.hasNext()) {
            H h9 = (H) ((Map.Entry) it4.next()).getValue();
            Set setI2 = H.I(h9.f9508o, H.I(h9.f9510q, H.I(h9.f9509p, H.I(h9.f9507n, null))));
            if (setI2 == null) {
                setI2 = Collections.EMPTY_SET;
            }
            if (!setI2.isEmpty()) {
                it4.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (setI2.size() == 1) {
                    linkedList.add(new H(h9, (A) setI2.iterator().next()));
                } else {
                    HashMap map = new HashMap();
                    Set set = setI2;
                    h9.H(set, map, h9.f9507n);
                    h9.H(set, map, h9.f9509p);
                    h9.H(set, map, h9.f9510q);
                    h9.H(set, map, h9.f9508o);
                    linkedList.addAll(map.values());
                }
            }
        }
        if (linkedList != null) {
            for (H h10 : linkedList) {
                String name2 = h10.getName();
                H h11 = (H) linkedHashMap.get(name2);
                if (h11 == null) {
                    linkedHashMap.put(name2, h10);
                } else {
                    e eVarA = h11.f9507n;
                    e eVar10 = h10.f9507n;
                    if (eVarA == null) {
                        eVarA = eVar10;
                    } else if (eVar10 != null) {
                        eVarA = eVarA.a(eVar10);
                    }
                    h11.f9507n = eVarA;
                    e eVarA2 = h11.f9508o;
                    e eVar11 = h10.f9508o;
                    if (eVarA2 == null) {
                        eVarA2 = eVar11;
                    } else if (eVar11 != null) {
                        eVarA2 = eVarA2.a(eVar11);
                    }
                    h11.f9508o = eVarA2;
                    e eVarA3 = h11.f9509p;
                    e eVar12 = h10.f9509p;
                    if (eVarA3 == null) {
                        eVarA3 = eVar12;
                    } else if (eVar12 != null) {
                        eVarA3 = eVarA3.a(eVar12);
                    }
                    h11.f9509p = eVarA3;
                    e eVarA4 = h11.f9510q;
                    e eVar13 = h10.f9510q;
                    if (eVarA4 == null) {
                        eVarA4 = eVar13;
                    } else if (eVar13 != null) {
                        eVarA4 = eVarA4.a(eVar13);
                    }
                    h11.f9510q = eVarA4;
                }
                LinkedList linkedList2 = this.f9490k;
                if (linkedList2 != null) {
                    String str = h10.f9506m.f7195h;
                    int size = linkedList2.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        if (((H) linkedList2.get(i6)).f9506m.f7195h.equals(str)) {
                            linkedList2.set(i6, h10);
                            HashSet hashSet = this.f9497r;
                            if (hashSet == null) {
                                break;
                            }
                            hashSet.remove(name2);
                            break;
                        }
                    }
                }
            }
        }
        for (C0769e c0769e2 : c0766b.o()) {
            d(b6.p(c0769e2), c0769e2);
        }
        for (C0772h c0772h3 : c0766b.n()) {
            if (c0772h3.f9547l.getParameterCount() == 1) {
                d(b6.p(c0772h3), c0772h3);
            }
        }
        for (H h12 : linkedHashMap.values()) {
            if (z12) {
                e eVar14 = h12.f9509p;
                if (eVar14 != null) {
                    h12.f9509p = H.G(h12.f9509p, H.L(0, eVar14, h12.f9507n, h12.f9508o, h12.f9510q));
                } else {
                    e eVar15 = h12.f9507n;
                    if (eVar15 != null) {
                        h12.f9507n = H.G(h12.f9507n, H.L(0, eVar15, h12.f9508o, h12.f9510q));
                    }
                }
            } else {
                e eVar16 = h12.f9508o;
                if (eVar16 != null) {
                    h12.f9508o = H.G(h12.f9508o, H.L(0, eVar16, h12.f9510q, h12.f9507n, h12.f9509p));
                } else {
                    e eVar17 = h12.f9510q;
                    if (eVar17 != null) {
                        h12.f9510q = H.G(h12.f9510q, H.L(0, eVar17, h12.f9507n, h12.f9509p));
                    } else {
                        e eVar18 = h12.f9507n;
                        if (eVar18 != null) {
                            h12.f9507n = H.G(h12.f9507n, H.L(0, eVar18, h12.f9509p));
                        }
                    }
                }
            }
        }
        Object objW = b6.w(c0766b);
        if (objW == null) {
            nVar.i.getClass();
        } else {
            Class cls2 = (Class) objW;
            if (cls2 != B.class) {
                if (!B.class.isAssignableFrom(cls2)) {
                    throw new IllegalStateException("AnnotationIntrospector returned Class " + cls2.getName() + "; expected Class<PropertyNamingStrategy>");
                }
                nVar.h();
                if (i.h(cls2, nVar.k(r.CAN_OVERRIDE_ACCESS_MODIFIERS)) != null) {
                    throw new ClassCastException();
                }
            }
        }
        for (H h13 : linkedHashMap.values()) {
            e eVarF = h13.f9507n;
            if (eVarF != null) {
                eVarF = eVarF.f();
            }
            h13.f9507n = eVarF;
            e eVarF2 = h13.f9509p;
            if (eVarF2 != null) {
                eVarF2 = eVarF2.f();
            }
            h13.f9509p = eVarF2;
            e eVarF3 = h13.f9510q;
            if (eVarF3 != null) {
                eVarF3 = eVarF3.f();
            }
            h13.f9510q = eVarF3;
            e eVarF4 = h13.f9508o;
            if (eVarF4 != null) {
                eVarF4 = eVarF4.f();
            }
            h13.f9508o = eVarF4;
        }
        if (nVar.k(r.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            Iterator it5 = linkedHashMap.entrySet().iterator();
            while (it5.hasNext()) {
                ((H) ((Map.Entry) it5.next()).getValue()).O();
            }
        }
        Boolean boolS = b6.S(c0766b);
        boolean zK3 = boolS == null ? nVar.k(r.SORT_PROPERTIES_ALPHABETICALLY) : boolS.booleanValue();
        Iterator it6 = linkedHashMap.values().iterator();
        while (true) {
            if (it6.hasNext()) {
                if (((H) it6.next()).c().f7341j != null) {
                    z5 = true;
                    break;
                }
            } else {
                z5 = false;
                break;
            }
        }
        String[] strArrR = b6.R(c0766b);
        if (zK3 || z5 || this.f9490k != null || strArrR != null) {
            int size2 = linkedHashMap.size();
            Map treeMap = zK3 ? new TreeMap() : new LinkedHashMap(size2 + size2);
            for (H h14 : linkedHashMap.values()) {
                treeMap.put(h14.getName(), h14);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(size2 + size2);
            if (strArrR != null) {
                for (String name3 : strArrR) {
                    H h15 = (H) treeMap.remove(name3);
                    if (h15 == null) {
                        for (H h16 : linkedHashMap.values()) {
                            if (name3.equals(h16.f9506m.f7195h)) {
                                name3 = h16.getName();
                                h15 = h16;
                                break;
                            }
                        }
                    }
                    if (h15 != null) {
                        linkedHashMap2.put(name3, h15);
                    }
                }
            }
            if (z5) {
                TreeMap treeMap2 = new TreeMap();
                Iterator it7 = treeMap.entrySet().iterator();
                while (it7.hasNext()) {
                    H h17 = (H) ((Map.Entry) it7.next()).getValue();
                    Integer num = h17.c().f7341j;
                    if (num != null) {
                        treeMap2.put(num, h17);
                        it7.remove();
                    }
                }
                for (H h18 : treeMap2.values()) {
                    linkedHashMap2.put(h18.getName(), h18);
                }
            }
            if (this.f9490k != null && (!zK3 || nVar.k(r.SORT_CREATOR_PROPERTIES_FIRST))) {
                if (zK3) {
                    TreeMap treeMap3 = new TreeMap();
                    for (H h19 : this.f9490k) {
                        treeMap3.put(h19.getName(), h19);
                    }
                    collectionValues = treeMap3.values();
                } else {
                    collectionValues = this.f9490k;
                }
                for (H h20 : collectionValues) {
                    String name4 = h20.getName();
                    if (treeMap.containsKey(name4)) {
                        linkedHashMap2.put(name4, h20);
                    }
                }
            }
            linkedHashMap2.putAll(treeMap);
            linkedHashMap.clear();
            linkedHashMap.putAll(linkedHashMap2);
        }
        this.f9489j = linkedHashMap;
        this.i = true;
    }

    public final void h(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + this.f9485e + ": " + str);
    }
}
