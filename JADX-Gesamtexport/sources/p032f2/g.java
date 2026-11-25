package p032f2;

import B.AbstractC0013g0;
import S1.C0360w;
import S1.V;
import S1.d0;
import S1.f0;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import java.util.ArrayList;
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
import p015c2.A;
import p015c2.C0470a;
import p015c2.C0471b;
import p015c2.C0474e;
import p015c2.f;
import p015c2.h;
import p015c2.j;
import p015c2.q;
import p015c2.z;
import p026e2.k;
import p027e3.a;
import p037g2.B;
import p037g2.F;
import p037g2.p;
import p037g2.v;
import p046i2.AbstractC0771g;
import p046i2.C;
import p046i2.C0766b;
import p046i2.C0769e;
import p046i2.C0772h;
import p046i2.D;
import p046i2.r;
import p046i2.t;
import p071n2.d;
import p104t2.e;
import p104t2.n;
import p109u2.C0965d;
import p109u2.InterfaceC0963b;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Class[] f8913k = {Throwable.class};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g f8914l = new g(new k(null, null, null, null, null));

    public static void s0(r rVar, f fVar) {
        Map map;
        D d6 = rVar.f9563b;
        if (d6 != null) {
            if (!d6.i) {
                d6.g();
            }
            map = d6.f9498s;
        } else {
            map = Collections.EMPTY_MAP;
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                AbstractC0771g abstractC0771g = (AbstractC0771g) entry.getValue();
                A a6 = A.a(abstractC0771g.getName());
                h hVarH = abstractC0771g.h();
                InterfaceC0963b interfaceC0963b = rVar.f9566e.f9533r;
                Object key = entry.getKey();
                if (fVar.f8905e == null) {
                    fVar.f8905e = new ArrayList();
                }
                C0474e c0474e = fVar.f8901a;
                c0474e.getClass();
                if (c0474e.k(p015c2.r.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                    try {
                        abstractC0771g.m(c0474e.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    } catch (IllegalArgumentException e6) {
                        fVar.c(e6);
                        throw null;
                    }
                }
                fVar.f8905e.add(new F(a6, hVarH, abstractC0771g, key));
            }
        }
    }

    public static void t0(f fVar, r rVar, f fVar2) {
        r rVar2;
        h hVar;
        d0 d0VarJ;
        C c6 = rVar.i;
        if (c6 == null) {
            return;
        }
        fVar.K(c6);
        A a6 = c6.f9476a;
        Class cls = c6.f9477b;
        if (cls == f0.class) {
            LinkedHashMap linkedHashMap = fVar2.f8904d;
            String str = a6.f7195h;
            rVar2 = (r) linkedHashMap.get(str);
            if (rVar2 == null) {
                throw new IllegalArgumentException(p012c.k.s("Invalid Object Id definition for ", i.r(rVar.f9562a), ": cannot find property with name ", i.c(str)));
            }
            d0VarJ = new v(c6.f9479d);
            hVar = rVar2.f8934k;
        } else {
            h hVarB0 = fVar.b0(cls);
            fVar.A().getClass();
            rVar2 = null;
            hVar = n.l(hVarB0, d0.class)[0];
            d0VarJ = fVar.J(c6);
        }
        fVar2.f8909j = new p037g2.r(hVar, a6, d0VarJ, fVar.k0(hVar), rVar2);
    }

    public final void q0(f fVar, r rVar, f fVar2) {
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (t tVar : rVar.b()) {
            C0470a c0470aJ = tVar.j();
            if (c0470aJ != null && c0470aJ.f7236a == 2) {
                String str = c0470aJ.f7237b;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashSet = new HashSet();
                    hashSet.add(str);
                } else if (!hashSet.add(str)) {
                    throw new IllegalArgumentException("Multiple back-reference properties with name " + i.y(str));
                }
                arrayList.add(tVar);
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                t tVar2 = (t) obj;
                C0470a c0470aJ2 = tVar2.j();
                String str2 = c0470aJ2 == null ? null : c0470aJ2.f7237b;
                r rVarU0 = u0(fVar, rVar, tVar2, tVar2.q());
                if (fVar2.f8906f == null) {
                    fVar2.f8906f = new HashMap(4);
                }
                C0474e c0474e = fVar2.f8901a;
                c0474e.getClass();
                if (c0474e.k(p015c2.r.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                    try {
                        rVarU0.m(c0474e);
                    } catch (IllegalArgumentException e6) {
                        fVar2.c(e6);
                        throw null;
                    }
                }
                fVar2.f8906f.put(str2, rVarU0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x027d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0280  */
    /* JADX WARN: Code duplicated, block: B:192:0x0404  */
    /* JADX WARN: Code duplicated, block: B:197:0x0417  */
    /* JADX WARN: Code duplicated, block: B:70:0x013c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r20v15, types: [i2.g] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v1, types: [i2.g] */
    /* JADX WARN: Type inference failed for: r22v3, types: [i2.g] */
    /* JADX WARN: Type inference failed for: r22v5, types: [i2.g] */
    /* JADX WARN: Type inference failed for: r22v7, types: [i2.g] */
    /* JADX WARN: Type inference failed for: r27v0, types: [f2.c, f2.g] */
    /* JADX WARN: Type inference failed for: r28v0, types: [c2.f] */
    /* JADX WARN: Type inference failed for: r30v0, types: [f2.f] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [i2.g, i2.q] */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r7v30, types: [c2.B] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void r0(f fVar, r rVar, f fVar2) {
        Set set;
        ?? r6;
        boolean z5;
        int i;
        r rVarV0;
        j jVar;
        Set set2;
        boolean z6;
        boolean z7;
        Boolean boolM0;
        boolean zBooleanValue;
        p nVar;
        h hVarB0;
        C0471b c0471b;
        h hVar;
        p pVar;
        C0772h c0772h;
        AbstractC0771g abstractC0771g;
        h hVar2 = rVar.f9562a;
        r[] rVarArrC = !hVar2.i0() ? fVar2.i.C(fVar.f7249l) : null;
        boolean z8 = rVarArrC != null;
        C0474e c0474e = fVar.f7249l;
        Class cls = hVar2.f7281k;
        C0766b c0766b = rVar.f9566e;
        C0360w c0360wL = c0474e.l(cls, c0766b);
        if (c0360wL != null) {
            fVar2.f8911l = c0360wL.i;
            set = c0360wL.f4981k ? Collections.EMPTY_SET : c0360wL.f4979h;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                fVar2.d((String) it.next());
            }
        } else {
            set = Collections.EMPTY_SET;
        }
        C0474e c0474e2 = fVar.f7249l;
        Set<String> set3 = c0474e2.d().K(c0766b).f4909h;
        if (set3 != null) {
            for (String str : set3) {
                if (fVar2.f8908h == null) {
                    fVar2.f8908h = new HashSet();
                }
                fVar2.f8908h.add(str);
            }
        }
        D d6 = rVar.f9563b;
        if (d6 == null) {
            r6 = 0;
        } else {
            if (!d6.i) {
                d6.g();
            }
            LinkedList linkedList = d6.f9493n;
            if (linkedList == null) {
                c0772h = null;
            } else {
                if (linkedList.size() > 1) {
                    d6.h("Multiple 'any-setter' methods defined (%s vs %s)", d6.f9493n.get(0), d6.f9493n.get(1));
                    throw null;
                }
                c0772h = (C0772h) d6.f9493n.getFirst();
            }
            if (c0772h != null) {
                Class clsA = c0772h.A(0);
                r6 = c0772h;
                if (clsA != String.class) {
                    r6 = c0772h;
                    if (clsA != Object.class) {
                        throw new IllegalArgumentException(p012c.k.s("Invalid 'any-setter' annotation on method '", c0772h.f9547l.getName(), "()': first argument not of type String or Object, but ", clsA.getName()));
                    }
                }
            } else {
                if (!d6.i) {
                    d6.g();
                }
                LinkedList linkedList2 = d6.f9494o;
                if (linkedList2 == null) {
                    abstractC0771g = null;
                } else {
                    if (linkedList2.size() > 1) {
                        d6.h("Multiple 'any-setter' fields defined (%s vs %s)", d6.f9494o.get(0), d6.f9494o.get(1));
                        throw null;
                    }
                    abstractC0771g = (AbstractC0771g) d6.f9494o.getFirst();
                }
                if (abstractC0771g != null) {
                    Class clsG = abstractC0771g.g();
                    r6 = abstractC0771g;
                    if (!Map.class.isAssignableFrom(clsG)) {
                        r6 = abstractC0771g;
                        if (!JsonNode.class.isAssignableFrom(clsG)) {
                            throw new IllegalArgumentException(AbstractC0013g0.i("Invalid 'any-setter' annotation on field '", abstractC0771g.getName(), "': type is not instance of `java.util.Map` or `JsonNode`"));
                        }
                    }
                } else {
                    r6 = 0;
                }
            }
        }
        if (r6 != 0) {
            boolean z9 = r6 instanceof C0769e;
            if (r6 instanceof C0772h) {
                C0772h c0772h2 = (C0772h) r6;
                hVarB0 = c0772h2.z(0);
                h hVarP0 = p0(fVar, r6, c0772h2.z(1));
                c0471b = new C0471b(A.a(((C0772h) r6).f9547l.getName()), hVarP0, null, r6, z.f7338p);
                z5 = true;
                hVar = hVarP0;
            } else {
                z5 = true;
                if (!z9) {
                    fVar.O("Unrecognized mutator type for any-setter: " + i.z(r6.getClass()));
                    throw null;
                }
                h hVarH = ((C0769e) r6).h();
                hVarH.getClass();
                if (hVarH instanceof e) {
                    h hVarP1 = p0(fVar, r6, hVarH);
                    hVarB0 = hVarP1.b0();
                    h hVarY = hVarP1.Y();
                    c0471b = new C0471b(A.a(((C0769e) r6).f9542k.getName()), hVarP1, null, r6, z.f7338p);
                    hVar = hVarY;
                } else {
                    if (!hVarH.h0(JsonNode.class) && !hVarH.h0(p087q2.r.class)) {
                        fVar.O("Unsupported type for any-setter: " + i.r(hVarH) + " -- only support `Map`s, `JsonNode` and `ObjectNode` ");
                        throw null;
                    }
                    h hVarP2 = p0(fVar, r6, hVarH);
                    h hVarB1 = fVar.b0(JsonNode.class);
                    C0769e c0769e = (C0769e) r6;
                    nVar = new n(new C0471b(A.a(c0769e.f9542k.getName()), hVarP2, null, r6, z.f7338p), c0769e, hVarB1, fVar.k0(hVarB1), c0474e2.f7244r);
                }
                if (fVar2.f8910k == null) {
                    throw new IllegalStateException("_anySetter already set to non-null");
                }
                fVar2.f8910k = nVar;
            }
            C0471b c0471b2 = c0471b;
            q qVarL0 = c.l0(fVar, r6);
            if (qVarL0 == null) {
                qVarL0 = (q) hVarB0.f7283m;
            }
            if (qVarL0 == null) {
                qVarL0 = fVar.h0(hVarB0);
            }
            q qVar = qVarL0;
            Object objC = c0474e2.d().c(r6);
            j jVarC0 = objC != null ? fVar.c0(objC) : null;
            if (jVarC0 == null) {
                jVarC0 = (j) hVar.f7283m;
            }
            if (jVarC0 != null) {
                jVarC0 = fVar.p0(jVarC0, c0471b2, hVar);
            }
            j jVar2 = jVarC0;
            d dVar = (d) hVar.f7284n;
            if (z9) {
                Class<LinkedHashMap> clsG2 = r6.g();
                if (clsG2 == Map.class) {
                    clsG2 = LinkedHashMap.class;
                }
                pVar = new n(c0471b2, r6, hVar, qVar, jVar2, dVar, a.a0(clsG2));
            } else {
                pVar = new p(c0471b2, r6, hVar, qVar, jVar2, dVar);
            }
            nVar = pVar;
            if (fVar2.f8910k == null) {
                throw new IllegalStateException("_anySetter already set to non-null");
            }
            fVar2.f8910k = nVar;
        } else {
            z5 = true;
            Set set4 = d6 == null ? null : d6.f9497r;
            if (set4 == null) {
                set4 = Collections.EMPTY_SET;
            }
            if (set4 != null) {
                Iterator it2 = set4.iterator();
                while (it2.hasNext()) {
                    fVar2.d((String) it2.next());
                }
            }
        }
        boolean z10 = (c0474e2.k(p015c2.r.USE_GETTERS_AS_SETTERS) && c0474e2.k(p015c2.r.AUTO_DETECT_GETTERS)) ? z5 : false;
        List listB = rVar.b();
        ArrayList arrayList = new ArrayList(Math.max(4, listB.size()));
        HashMap map = new HashMap();
        Iterator it3 = listB.iterator();
        while (it3.hasNext()) {
            t tVar = (t) it3.next();
            it3 = it3;
            String name = tVar.getName();
            if (!V.M(name, set, set3)) {
                if (tVar.u()) {
                    set2 = set;
                } else {
                    set2 = set;
                    Class clsR = tVar.r();
                    if (clsR != null) {
                        Boolean bool = (Boolean) map.get(clsR);
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                            z6 = z10;
                            z7 = z8;
                        } else {
                            if (clsR == String.class || clsR.isPrimitive()) {
                                z6 = z10;
                                z7 = z8;
                                boolM0 = Boolean.FALSE;
                            } else {
                                c0474e2.e(clsR);
                                z6 = z10;
                                z7 = z8;
                                boolM0 = c0474e2.d().m0(c0474e2.j(clsR).f9566e);
                                if (boolM0 == null) {
                                    boolM0 = Boolean.FALSE;
                                }
                            }
                            map.put(clsR, boolM0);
                            zBooleanValue = boolM0.booleanValue();
                        }
                        if (zBooleanValue) {
                            fVar2.d(name);
                        }
                        set = set2;
                        z10 = z6;
                        z8 = z7;
                    }
                    arrayList.add(tVar);
                    set = set2;
                    z10 = z6;
                    z8 = z7;
                }
                z6 = z10;
                z7 = z8;
                arrayList.add(tVar);
                set = set2;
                z10 = z6;
                z8 = z7;
            }
        }
        boolean z11 = z10;
        boolean z12 = z8;
        k kVar = this.f8878j;
        if (kVar.c()) {
            C0965d c0965dA = kVar.a();
            if (c0965dA.hasNext()) {
                throw p012c.k.q(c0965dA);
            }
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            t tVar2 = (t) obj;
            if (tVar2.x()) {
                i = 0;
                rVarV0 = u0(fVar, rVar, tVar2, tVar2.s().z(0));
            } else {
                i = 0;
                if (tVar2.v()) {
                    rVarV0 = u0(fVar, rVar, tVar2, tVar2.o().h());
                } else {
                    C0772h c0772hP = tVar2.p();
                    if (c0772hP == null) {
                        rVarV0 = null;
                    } else if (z11) {
                        Class<?> returnType = c0772hP.f9547l.getReturnType();
                        if ((Collection.class.isAssignableFrom(returnType) || Map.class.isAssignableFrom(returnType)) ? z5 : false) {
                            if (V.M(tVar2.getName(), fVar2.f8907g, fVar2.f8908h)) {
                                rVarV0 = null;
                            } else {
                                rVarV0 = v0(fVar, rVar, tVar2);
                            }
                        } else if (!tVar2.u() || tVar2.c().f7343l == null) {
                            rVarV0 = null;
                        } else {
                            rVarV0 = v0(fVar, rVar, tVar2);
                        }
                    } else if (tVar2.u()) {
                        rVarV0 = null;
                    } else {
                        rVarV0 = null;
                    }
                }
            }
            if (z12 && tVar2.u()) {
                String name2 = tVar2.getName();
                int length = rVarArrC.length;
                int i6 = i;
                while (true) {
                    if (i6 >= length) {
                        jVar = null;
                        break;
                    }
                    r rVar2 = rVarArrC[i6];
                    if (name2.equals(rVar2.f8933j.f7195h) && (rVar2 instanceof j)) {
                        jVar = (j) rVar2;
                        break;
                    }
                    i6++;
                }
                if (jVar == null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (r rVar3 : rVarArrC) {
                        arrayList2.add(rVar3.f8933j.f7195h);
                    }
                    fVar.G0(rVar, tVar2, "Could not find creator property with name %s (known Creator properties: %s)", i.y(name2), arrayList2);
                    throw null;
                }
                if (rVarV0 != null) {
                    jVar.f8919v = rVarV0;
                }
                Class[] clsArrK = tVar2.k();
                if (clsArrK == null) {
                    clsArrK = rVar.c();
                }
                jVar.B(clsArrK);
                fVar2.e(jVar);
            } else if (rVarV0 != null) {
                Class[] clsArrK2 = tVar2.k();
                if (clsArrK2 == null) {
                    clsArrK2 = rVar.c();
                }
                rVarV0.B(clsArrK2);
                fVar2.e(rVarV0);
            }
        }
    }

    public final r u0(f fVar, r rVar, t tVar, h hVar) {
        t tVar2;
        r iVar;
        AbstractC0771g abstractC0771gS = tVar.s();
        if (abstractC0771gS == null) {
            abstractC0771gS = tVar.o();
        }
        if (abstractC0771gS == null) {
            fVar.G0(rVar, tVar, "No non-constructor mutator available", new Object[0]);
            throw null;
        }
        h hVarP0 = p0(fVar, abstractC0771gS, hVar);
        d dVar = (d) hVarP0.f7284n;
        boolean z5 = abstractC0771gS instanceof C0772h;
        C0766b c0766b = rVar.f9566e;
        if (z5) {
            tVar2 = tVar;
            iVar = new p(tVar2, hVarP0, dVar, c0766b.f9533r, (C0772h) abstractC0771gS);
        } else {
            tVar2 = tVar;
            iVar = new p037g2.i(tVar2, hVarP0, dVar, c0766b.f9533r, (C0769e) abstractC0771gS);
        }
        j jVarK0 = c.k0(fVar, abstractC0771gS);
        if (jVarK0 == null) {
            jVarK0 = (j) hVarP0.f7283m;
        }
        if (jVarK0 != null) {
            iVar = iVar.E(fVar.p0(jVarK0, iVar, hVarP0));
        }
        C0470a c0470aJ = tVar2.j();
        if (c0470aJ != null && c0470aJ.f7236a == 1) {
            iVar.f8938o = c0470aJ.f7237b;
        }
        C cI = tVar2.i();
        if (cI != null) {
            iVar.f8939p = cI;
        }
        return iVar;
    }

    public final B v0(f fVar, r rVar, t tVar) throws InvalidDefinitionException {
        C0772h c0772hP = tVar.p();
        h hVarP0 = p0(fVar, c0772hP, c0772hP.h());
        B b6 = new B(tVar, hVarP0, (d) hVarP0.f7284n, rVar.f9566e.f9533r, c0772hP);
        j jVarK0 = c.k0(fVar, c0772hP);
        if (jVarK0 == null) {
            jVarK0 = (j) hVarP0.f7283m;
        }
        return jVarK0 != null ? (B) b6.E(fVar.p0(jVarK0, b6, hVarP0)) : b6;
    }
}
