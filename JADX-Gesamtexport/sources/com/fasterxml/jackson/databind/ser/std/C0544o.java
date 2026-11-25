package com.fasterxml.jackson.databind.ser.std;

import S1.C0355q;
import S1.C0360w;
import S1.EnumC0352n;
import S1.EnumC0363z;
import S1.V;
import c5.C0495p;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p015c2.InterfaceC0472c;
import p046i2.AbstractC0771g;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0544o extends p093r2.f implements p093r2.g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p104t2.i f7738w = p104t2.n.n();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final EnumC0363z f7739x = EnumC0363z.f4984j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC0472c f7740h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p015c2.h f7741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p015c2.h f7742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p015c2.o f7743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p015c2.o f7744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p071n2.e f7745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AbstractC0599v0 f7746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f7747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Set f7748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f7749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f7750s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f7751t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p009b2.k f7752u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f7753v;

    public C0544o(C0544o c0544o, InterfaceC0472c interfaceC0472c, p015c2.o oVar, p015c2.o oVar2, Set set, Set set2) {
        super(0, Map.class);
        set = (set == null || set.isEmpty()) ? null : set;
        this.f7747p = set;
        this.f7748q = set2;
        this.f7741j = c0544o.f7741j;
        this.f7742k = c0544o.f7742k;
        this.i = c0544o.i;
        this.f7745n = c0544o.f7745n;
        this.f7743l = oVar;
        this.f7744m = oVar2;
        this.f7746o = p098s2.i.f12180k;
        this.f7740h = interfaceC0472c;
        this.f7749r = c0544o.f7749r;
        this.f7753v = c0544o.f7753v;
        this.f7750s = c0544o.f7750s;
        this.f7751t = c0544o.f7751t;
        this.f7752u = V.p(set, set2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[RETURN] */
    public static C0544o e(Set set, Set set2, p015c2.h hVar, boolean z5, p077o2.q qVar, p015c2.o oVar, p015c2.o oVar2, Object obj) {
        p015c2.h hVarN;
        p015c2.h hVar2;
        boolean z6;
        C0544o c0544o;
        if (hVar == null) {
            hVar2 = f7738w;
            hVarN = hVar2;
        } else {
            p015c2.h hVarB0 = hVar.b0();
            hVarN = hVar.h0(Properties.class) ? p104t2.n.n() : hVar.Y();
            hVar2 = hVarB0;
        }
        boolean z7 = false;
        if (z5) {
            if (hVarN.f7281k == Object.class) {
                z6 = false;
            }
            c0544o = new C0544o(set, set2, hVar2, hVarN, z6, qVar, oVar, oVar2);
            if (obj != null) {
                return c0544o.withFilterId(obj);
            }
            return c0544o;
        }
        if (hVarN != null && Modifier.isFinal(hVarN.f7281k.getModifiers())) {
            z7 = true;
        }
        z5 = z7;
        z6 = z5;
        c0544o = new C0544o(set, set2, hVar2, hVarN, z6, qVar, oVar, oVar2);
        if (obj != null) {
            return c0544o.withFilterId(obj);
        }
        return c0544o;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        bVar.getClass();
    }

    @Override // p093r2.g
    public final p015c2.o b(p015c2.E e6, InterfaceC0472c interfaceC0472c) {
        p015c2.o oVarY0;
        p015c2.o oVarY1;
        boolean zBooleanValue;
        Object objM;
        Boolean boolB;
        p015c2.B bD = e6.f7226j.d();
        Object objU = null;
        AbstractC0771g abstractC0771gE = interfaceC0472c == null ? null : interfaceC0472c.e();
        if (P._neitherNull(abstractC0771gE, bD)) {
            Object objS = bD.s(abstractC0771gE);
            oVarY0 = objS != null ? e6.y0(abstractC0771gE, objS) : null;
            Object objD = bD.d(abstractC0771gE);
            oVarY1 = objD != null ? e6.y0(abstractC0771gE, objD) : null;
        } else {
            oVarY0 = null;
            oVarY1 = null;
        }
        if (oVarY1 == null) {
            oVarY1 = this.f7744m;
        }
        p015c2.o oVarFindContextualConvertingSerializer = findContextualConvertingSerializer(e6, interfaceC0472c, oVarY1);
        p015c2.h hVar = this.f7742k;
        if (oVarFindContextualConvertingSerializer == null && this.i && !hVar.m0()) {
            oVarFindContextualConvertingSerializer = e6.h0(hVar, interfaceC0472c);
        }
        p015c2.o oVar = oVarFindContextualConvertingSerializer;
        if (oVarY0 == null) {
            oVarY0 = this.f7743l;
        }
        p015c2.o oVarJ0 = oVarY0 == null ? e6.j0(this.f7741j, interfaceC0472c) : e6.t0(oVarY0, interfaceC0472c);
        boolean z_neitherNull = P._neitherNull(abstractC0771gE, bD);
        boolean zV0 = false;
        Set hashSet = this.f7747p;
        Set hashSet2 = this.f7748q;
        if (z_neitherNull) {
            C0360w c0360wH = bD.H(abstractC0771gE);
            Set set = c0360wH.f4980j ? Collections.EMPTY_SET : c0360wH.f4979h;
            if (P._nonEmpty(set)) {
                hashSet = hashSet == null ? new HashSet() : new HashSet(hashSet);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    hashSet.add((String) it.next());
                }
            }
            Set set2 = bD.K(abstractC0771gE).f4909h;
            if (set2 != null) {
                hashSet2 = hashSet2 == null ? new HashSet() : new HashSet(hashSet2);
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    hashSet2.add((String) it2.next());
                }
            }
            zBooleanValue = Boolean.TRUE.equals(bD.S(abstractC0771gE));
        } else {
            zBooleanValue = false;
        }
        C0355q c0355qFindFormatOverrides = findFormatOverrides(e6, interfaceC0472c, Map.class);
        if (c0355qFindFormatOverrides != null && (boolB = c0355qFindFormatOverrides.b(EnumC0352n.f4956k)) != null) {
            zBooleanValue = boolB.booleanValue();
        }
        boolean z5 = zBooleanValue;
        p109u2.i.F(this, C0544o.class, "withResolved");
        C0544o c0544o = new C0544o(this, interfaceC0472c, oVarJ0, oVar, hashSet, hashSet2);
        if (z5 != c0544o.f7753v) {
            c0544o = new C0544o(c0544o, this.f7749r, z5);
        }
        if (abstractC0771gE != null && (objM = bD.m(abstractC0771gE)) != null) {
            c0544o = c0544o.withFilterId(objM);
        }
        S1.A aFindIncludeOverrides = findIncludeOverrides(e6, interfaceC0472c, Map.class);
        if (aFindIncludeOverrides == null) {
            return c0544o;
        }
        EnumC0363z enumC0363z = EnumC0363z.f4986l;
        EnumC0363z enumC0363z2 = aFindIncludeOverrides.i;
        if (enumC0363z2 == enumC0363z) {
            return c0544o;
        }
        int iOrdinal = enumC0363z2.ordinal();
        if (iOrdinal != 1) {
            EnumC0363z enumC0363z3 = f7739x;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    zV0 = true;
                    objU = enumC0363z3;
                } else if (iOrdinal == 4) {
                    objU = G4.a.u(hVar);
                    if (objU != null && objU.getClass().isArray()) {
                        objU = K2.k.a(objU);
                    }
                } else if (iOrdinal == 5) {
                    objU = e6.u0(aFindIncludeOverrides.f4908k);
                    if (objU != null) {
                        zV0 = e6.v0(objU);
                    }
                }
            } else if (hVar.D()) {
                objU = enumC0363z3;
            }
            zV0 = true;
        } else {
            zV0 = true;
        }
        return c0544o.h(objU, zV0);
    }

    @Override // p093r2.f
    public final p093r2.f c(p071n2.e eVar) {
        if (this.f7745n == eVar) {
            return this;
        }
        p109u2.i.F(this, C0544o.class, "_withValueTypeSerializer");
        return new C0544o(this, eVar, this.f7750s, this.f7751t);
    }

    public final p015c2.o d(p015c2.E e6, Object obj) {
        Class<?> cls = obj.getClass();
        p015c2.o oVarI = this.f7746o.I(cls);
        if (oVarI != null) {
            return oVarI;
        }
        p015c2.h hVar = this.f7742k;
        boolean zF0 = hVar.f0();
        InterfaceC0472c interfaceC0472c = this.f7740h;
        if (zF0) {
            AbstractC0599v0 abstractC0599v0 = this.f7746o;
            C0495p c0495pU = abstractC0599v0.u(e6.f0(hVar, cls), e6, interfaceC0472c);
            AbstractC0599v0 abstractC0599v1 = (AbstractC0599v0) c0495pU.f7476j;
            if (abstractC0599v0 != abstractC0599v1) {
                this.f7746o = abstractC0599v1;
            }
            return (p015c2.o) c0495pU.i;
        }
        AbstractC0599v0 abstractC0599v2 = this.f7746o;
        abstractC0599v2.getClass();
        p015c2.o oVarI0 = e6.i0(cls, interfaceC0472c);
        AbstractC0599v0 abstractC0599v0G = abstractC0599v2.G(cls, oVarI0);
        if (abstractC0599v2 != abstractC0599v0G) {
            this.f7746o = abstractC0599v0G;
        }
        return oVarI0;
    }

    public final void f(Map map, T1.e eVar, p015c2.E e6, Object obj) throws IOException {
        p015c2.o oVar;
        p015c2.o oVarD;
        boolean z5 = f7739x == obj;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                oVar = e6.f7232p;
            } else {
                p009b2.k kVar = this.f7752u;
                if (kVar == null || !kVar.s(key)) {
                    oVar = this.f7743l;
                }
            }
            Object value = entry.getValue();
            if (value != null) {
                oVarD = this.f7744m;
                if (oVarD == null) {
                    oVarD = d(e6, value);
                }
                if (z5) {
                    if (!oVarD.isEmpty(e6, value)) {
                        oVar.serialize(key, eVar, e6);
                        oVarD.serializeWithType(value, eVar, e6, this.f7745n);
                    }
                } else if (obj == null || !obj.equals(value)) {
                    oVar.serialize(key, eVar, e6);
                    oVarD.serializeWithType(value, eVar, e6, this.f7745n);
                }
            } else if (!this.f7751t) {
                oVarD = e6.f7231o;
                oVar.serialize(key, eVar, e6);
                try {
                    oVarD.serializeWithType(value, eVar, e6, this.f7745n);
                } catch (Exception e7) {
                    wrapAndThrow(e6, e7, map, String.valueOf(key));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:139:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x019b A[EXC_TOP_SPLITTER, PHI: r10
  0x019b: PHI (r10v1 c2.o) = (r10v0 c2.o), (r10v3 c2.o), (r10v3 c2.o), (r10v3 c2.o) binds: [B:116:0x017e, B:122:0x018f, B:124:0x0192, B:126:0x0198] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public final void g(Map map, T1.e eVar, p015c2.E e6) {
        TreeMap treeMap;
        p015c2.o oVar;
        p015c2.o oVarD;
        if (map.isEmpty()) {
            return;
        }
        p015c2.o oVar2 = this.f7744m;
        Object obj = null;
        boolean z5 = this.f7753v;
        Object obj2 = this.f7750s;
        Object obj3 = f7739x;
        boolean z6 = this.f7751t;
        if (!z5) {
            if (e6.f7226j.p(p015c2.D.ORDER_MAP_ENTRIES_BY_KEYS)) {
                if (!(map instanceof SortedMap)) {
                    if ((map instanceof HashMap) || !map.containsKey(null)) {
                        treeMap = new TreeMap(map);
                    } else {
                        treeMap = new TreeMap();
                        for (Map.Entry entry : map.entrySet()) {
                            Object key = entry.getKey();
                            if (key == null) {
                                Object value = entry.getValue();
                                p098s2.c cVar = e6.f7232p;
                                if (value != null) {
                                    p015c2.o oVarD2 = oVar2 == null ? d(e6, value) : oVar2;
                                    if (obj2 == obj3) {
                                        if (!oVarD2.isEmpty(e6, value)) {
                                            cVar.serialize(null, eVar, e6);
                                            throw null;
                                        }
                                        continue;
                                    } else if (obj2 == null || !obj2.equals(value)) {
                                        cVar.serialize(null, eVar, e6);
                                        throw null;
                                    }
                                } else if (z6) {
                                    continue;
                                } else {
                                    try {
                                        cVar.serialize(null, eVar, e6);
                                        throw null;
                                    } catch (Exception e7) {
                                        wrapAndThrow(e6, e7, value, "");
                                    }
                                }
                            } else {
                                treeMap.put(key, entry.getValue());
                            }
                        }
                    }
                    map = treeMap;
                }
            }
        } else if (!(map instanceof SortedMap)) {
            if (map instanceof HashMap) {
                treeMap = new TreeMap(map);
            } else {
                treeMap = new TreeMap(map);
            }
            map = treeMap;
        }
        Object obj4 = this.f7749r;
        if (obj4 != null) {
            findPropertyFilter(e6, obj4, map);
        }
        p015c2.o oVar3 = this.f7743l;
        p071n2.e eVar2 = this.f7745n;
        p009b2.k kVar = this.f7752u;
        if (obj2 != null || z6) {
            if (eVar2 != null) {
                f(map, eVar, e6, obj2);
                return;
            }
            boolean z7 = obj3 == obj2;
            for (Map.Entry entry2 : map.entrySet()) {
                Object key2 = entry2.getKey();
                if (key2 == null) {
                    oVar = e6.f7232p;
                } else if (kVar == null || !kVar.s(key2)) {
                    oVar = oVar3;
                }
                Object value2 = entry2.getValue();
                if (value2 != null) {
                    oVarD = oVar2 == null ? d(e6, value2) : oVar2;
                    if (z7) {
                        if (!oVarD.isEmpty(e6, value2)) {
                            oVar.serialize(key2, eVar, e6);
                            oVarD.serialize(value2, eVar, e6);
                        }
                    } else if (obj2 == null || !obj2.equals(value2)) {
                        oVar.serialize(key2, eVar, e6);
                        oVarD.serialize(value2, eVar, e6);
                    }
                } else if (!z6) {
                    oVarD = e6.f7231o;
                    try {
                        oVar.serialize(key2, eVar, e6);
                        oVarD.serialize(value2, eVar, e6);
                    } catch (Exception e8) {
                        wrapAndThrow(e6, e8, map, String.valueOf(key2));
                    }
                }
            }
            return;
        }
        if (oVar2 != null) {
            for (Map.Entry entry3 : map.entrySet()) {
                Object key3 = entry3.getKey();
                if (kVar == null || !kVar.s(key3)) {
                    if (key3 == null) {
                        e6.f7232p.serialize(null, eVar, e6);
                        throw null;
                    }
                    oVar3.serialize(key3, eVar, e6);
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        e6.g0(eVar);
                    } else if (eVar2 == null) {
                        try {
                            oVar2.serialize(value3, eVar, e6);
                        } catch (Exception e9) {
                            wrapAndThrow(e6, e9, map, String.valueOf(key3));
                        }
                    } else {
                        oVar2.serializeWithType(value3, eVar, e6, eVar2);
                    }
                }
            }
            return;
        }
        if (eVar2 != null) {
            f(map, eVar, e6, null);
            return;
        }
        try {
            Object key4 = null;
            for (Map.Entry entry4 : map.entrySet()) {
                try {
                    Object value4 = entry4.getValue();
                    key4 = entry4.getKey();
                    if (key4 == null) {
                        e6.f7232p.serialize(null, eVar, e6);
                        throw null;
                    }
                    if (kVar == null || !kVar.s(key4)) {
                        oVar3.serialize(key4, eVar, e6);
                        if (value4 == null) {
                            e6.g0(eVar);
                        } else {
                            (oVar2 == null ? d(e6, value4) : oVar2).serialize(value4, eVar, e6);
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    obj = key4;
                    wrapAndThrow(e6, e, map, String.valueOf(obj));
                    return;
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P
    public final JsonNode getSchema(p015c2.E e6, Type type) {
        return createSchemaNode("object", true);
    }

    public final C0544o h(Object obj, boolean z5) {
        if (obj == this.f7750s && z5 == this.f7751t) {
            return this;
        }
        p109u2.i.F(this, C0544o.class, "withContentInclusion");
        return new C0544o(this, this.f7745n, obj, z5);
    }

    @Override // p015c2.o
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final C0544o withFilterId(Object obj) {
        if (this.f7749r == obj) {
            return this;
        }
        p109u2.i.F(this, C0544o.class, "withFilterId");
        return new C0544o(this, obj, this.f7753v);
    }

    @Override // p015c2.o
    public final boolean isEmpty(p015c2.E e6, Object obj) {
        Map map = (Map) obj;
        if (!map.isEmpty()) {
            boolean z5 = this.f7751t;
            Object obj2 = this.f7750s;
            if (obj2 != null || z5) {
                boolean z6 = f7739x == obj2;
                p015c2.o oVar = this.f7744m;
                if (oVar != null) {
                    for (Object obj3 : map.values()) {
                        if (obj3 == null) {
                            if (z5) {
                            }
                        } else if (z6) {
                            if (!oVar.isEmpty(e6, obj3)) {
                            }
                        } else if (obj2 == null || !obj2.equals(map)) {
                        }
                    }
                } else {
                    for (Object obj4 : map.values()) {
                        if (obj4 != null) {
                            try {
                                p015c2.o oVarD = d(e6, obj4);
                                if (z6) {
                                    if (!oVarD.isEmpty(e6, obj4)) {
                                    }
                                } else if (obj2 == null || !obj2.equals(map)) {
                                }
                            } catch (DatabindException unused) {
                            }
                        } else if (z5) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        Map map = (Map) obj;
        eVar.p0(map);
        g(map, eVar, e6);
        eVar.M();
    }

    @Override // p015c2.o
    public final void serializeWithType(Object obj, T1.e eVar, p015c2.E e6, p071n2.e eVar2) {
        Map map = (Map) obj;
        eVar.C(map);
        p003a2.a aVarE = eVar2.e(eVar, eVar2.d(T1.k.START_OBJECT, map));
        g(map, eVar, e6);
        eVar2.f(eVar, aVarE);
    }

    public C0544o(C0544o c0544o, Object obj, boolean z5) {
        super(0, Map.class);
        this.f7747p = c0544o.f7747p;
        this.f7748q = c0544o.f7748q;
        this.f7741j = c0544o.f7741j;
        this.f7742k = c0544o.f7742k;
        this.i = c0544o.i;
        this.f7745n = c0544o.f7745n;
        this.f7743l = c0544o.f7743l;
        this.f7744m = c0544o.f7744m;
        this.f7746o = p098s2.i.f12180k;
        this.f7740h = c0544o.f7740h;
        this.f7749r = obj;
        this.f7753v = z5;
        this.f7750s = c0544o.f7750s;
        this.f7751t = c0544o.f7751t;
        this.f7752u = c0544o.f7752u;
    }

    public C0544o(C0544o c0544o, p071n2.e eVar, Object obj, boolean z5) {
        super(0, Map.class);
        this.f7747p = c0544o.f7747p;
        this.f7748q = c0544o.f7748q;
        this.f7741j = c0544o.f7741j;
        this.f7742k = c0544o.f7742k;
        this.i = c0544o.i;
        this.f7745n = eVar;
        this.f7743l = c0544o.f7743l;
        this.f7744m = c0544o.f7744m;
        this.f7746o = c0544o.f7746o;
        this.f7740h = c0544o.f7740h;
        this.f7749r = c0544o.f7749r;
        this.f7753v = c0544o.f7753v;
        this.f7750s = obj;
        this.f7751t = z5;
        this.f7752u = c0544o.f7752u;
    }

    public C0544o(Set set, Set set2, p015c2.h hVar, p015c2.h hVar2, boolean z5, p077o2.q qVar, p015c2.o oVar, p015c2.o oVar2) {
        super(0, Map.class);
        set = (set == null || set.isEmpty()) ? null : set;
        this.f7747p = set;
        this.f7748q = set2;
        this.f7741j = hVar;
        this.f7742k = hVar2;
        this.i = z5;
        this.f7745n = qVar;
        this.f7743l = oVar;
        this.f7744m = oVar2;
        this.f7746o = p098s2.i.f12180k;
        this.f7740h = null;
        this.f7749r = null;
        this.f7753v = false;
        this.f7750s = null;
        this.f7751t = false;
        this.f7752u = V.p(set, set2);
    }
}
