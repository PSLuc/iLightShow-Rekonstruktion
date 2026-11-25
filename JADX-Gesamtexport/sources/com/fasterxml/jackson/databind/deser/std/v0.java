package com.fasterxml.jackson.databind.deser.std;

import c5.C0495p;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p015c2.C0474e;
import p015c2.InterfaceC0472c;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends g0 implements p032f2.m, p032f2.i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object[] f7668o = new Object[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p015c2.j f7669h;
    public p015c2.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p015c2.j f7670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p015c2.j f7671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p015c2.h f7672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p015c2.h f7673m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f7674n;

    public v0(p015c2.h hVar, p015c2.h hVar2) {
        super(Object.class);
        this.f7672l = hVar;
        this.f7673m = hVar2;
        this.f7674n = false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // p032f2.i
    public final p015c2.j a(p015c2.f fVar, InterfaceC0472c interfaceC0472c) {
        boolean z5;
        if (interfaceC0472c == null) {
            Boolean bool = Boolean.FALSE;
            fVar.f7249l.f8724n.getClass();
            if (bool.equals(null)) {
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        if (this.f7670j == null && this.f7671k == null && this.f7669h == null && this.i == null) {
            return z5 ? new x0(true) : x0.f7682j;
        }
        return z5 != this.f7674n ? new v0(this, z5) : this;
    }

    @Override // p032f2.m
    public final void b(p015c2.f fVar) {
        p015c2.h hVarB0 = fVar.b0(Object.class);
        p015c2.h hVarB1 = fVar.b0(String.class);
        p104t2.n nVarA = fVar.A();
        p015c2.h hVar = this.f7672l;
        if (hVar == null) {
            p015c2.j jVarI0 = fVar.i0(nVarA.f(hVarB0, List.class));
            if (p109u2.i.v(jVarI0)) {
                jVarI0 = null;
            }
            this.i = jVarI0;
        } else {
            this.i = fVar.i0(hVar);
        }
        p015c2.h hVar2 = this.f7673m;
        if (hVar2 == null) {
            p015c2.j jVarI1 = fVar.i0(nVarA.h(Map.class, hVarB1, hVarB0));
            if (p109u2.i.v(jVarI1)) {
                jVarI1 = null;
            }
            this.f7669h = jVarI1;
        } else {
            this.f7669h = fVar.i0(hVar2);
        }
        p015c2.j jVarI2 = fVar.i0(hVarB1);
        if (p109u2.i.v(jVarI2)) {
            jVarI2 = null;
        }
        this.f7670j = jVarI2;
        p015c2.j jVarI3 = fVar.i0(nVarA.j(Number.class));
        if (p109u2.i.v(jVarI3)) {
            jVarI3 = null;
        }
        this.f7671k = jVarI3;
        p104t2.i iVarN = p104t2.n.n();
        this.f7669h = fVar.q0(this.f7669h, null, iVarN);
        this.i = fVar.q0(this.i, null, iVarN);
        this.f7670j = fVar.q0(this.f7670j, null, iVarN);
        this.f7671k = fVar.q0(this.f7671k, null, iVarN);
    }

    public final void d(T1.i iVar, p015c2.f fVar, LinkedHashMap linkedHashMap, String str, Object obj, Object obj2, String str2) throws MismatchedInputException {
        boolean zA0 = fVar.A0(T1.o.DUPLICATE_PROPERTIES);
        if (zA0) {
            if (obj instanceof List) {
                ((List) obj).add(obj2);
                linkedHashMap.put(str, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                arrayList.add(obj2);
                linkedHashMap.put(str, arrayList);
            }
        }
        while (str2 != null) {
            iVar.B0();
            Object objDeserialize = deserialize(iVar, fVar);
            Object objPut = linkedHashMap.put(str2, objDeserialize);
            if (objPut != null && zA0) {
                if (objPut instanceof List) {
                    ((List) objPut).add(objDeserialize);
                    linkedHashMap.put(str, objPut);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(objPut);
                    arrayList2.add(objDeserialize);
                    linkedHashMap.put(str, arrayList2);
                }
            }
            str2 = iVar.z0();
        }
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        switch (iVar.v()) {
            case 1:
            case 2:
            case 5:
                p015c2.j jVar = this.f7669h;
                return jVar != null ? jVar.deserialize(iVar, fVar) : g(iVar, fVar);
            case 3:
                if (fVar.B0(p015c2.g.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return f(iVar, fVar);
                }
                p015c2.j jVar2 = this.i;
                return jVar2 != null ? jVar2.deserialize(iVar, fVar) : e(iVar, fVar);
            case 4:
            default:
                fVar.s0(iVar, Object.class);
                throw null;
            case 6:
                p015c2.j jVar3 = this.f7670j;
                return jVar3 != null ? jVar3.deserialize(iVar, fVar) : iVar.i0();
            case 7:
                p015c2.j jVar4 = this.f7671k;
                if (jVar4 != null) {
                    return jVar4.deserialize(iVar, fVar);
                }
                return fVar.x0(g0.F_MASK_INT_COERCIONS) ? _coerceIntegral(iVar, fVar) : iVar.c0();
            case 8:
                p015c2.j jVar5 = this.f7671k;
                if (jVar5 != null) {
                    return jVar5.deserialize(iVar, fVar);
                }
                return fVar.B0(p015c2.g.USE_BIG_DECIMAL_FOR_FLOATS) ? iVar.T() : iVar.c0();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return iVar.X();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) throws MismatchedInputException {
        int iV = iVar.v();
        if (iV != 1 && iV != 3) {
            switch (iV) {
                case 5:
                    break;
                case 6:
                    p015c2.j jVar = this.f7670j;
                    return jVar != null ? jVar.deserialize(iVar, fVar) : iVar.i0();
                case 7:
                    p015c2.j jVar2 = this.f7671k;
                    if (jVar2 != null) {
                        return jVar2.deserialize(iVar, fVar);
                    }
                    return fVar.x0(g0.F_MASK_INT_COERCIONS) ? _coerceIntegral(iVar, fVar) : iVar.c0();
                case 8:
                    p015c2.j jVar3 = this.f7671k;
                    if (jVar3 != null) {
                        return jVar3.deserialize(iVar, fVar);
                    }
                    return fVar.B0(p015c2.g.USE_BIG_DECIMAL_FOR_FLOATS) ? iVar.T() : iVar.c0();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return iVar.X();
                default:
                    fVar.s0(iVar, Object.class);
                    throw null;
            }
        }
        return dVar.b(iVar, fVar);
    }

    public final ArrayList e(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        int i;
        T1.k kVarB0 = iVar.B0();
        T1.k kVar = T1.k.END_ARRAY;
        int i3 = 2;
        if (kVarB0 == kVar) {
            return new ArrayList(2);
        }
        Object objDeserialize = deserialize(iVar, fVar);
        if (iVar.B0() == kVar) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(objDeserialize);
            return arrayList;
        }
        Object objDeserialize2 = deserialize(iVar, fVar);
        if (iVar.B0() == kVar) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(objDeserialize);
            arrayList2.add(objDeserialize2);
            return arrayList2;
        }
        O1.u uVarD0 = fVar.D0();
        Object[] objArrJ = uVarD0.j();
        objArrJ[0] = objDeserialize;
        objArrJ[1] = objDeserialize2;
        int i6 = 2;
        while (true) {
            Object objDeserialize3 = deserialize(iVar, fVar);
            i3++;
            if (i6 >= objArrJ.length) {
                objArrJ = uVarD0.c(objArrJ);
                i6 = 0;
            }
            i = i6 + 1;
            objArrJ[i6] = objDeserialize3;
            if (iVar.B0() == T1.k.END_ARRAY) {
                break;
            }
            i6 = i;
        }
        ArrayList arrayList3 = new ArrayList(i3);
        for (C0495p c0495p = (C0495p) uVarD0.f4534b; c0495p != null; c0495p = (C0495p) c0495p.f7476j) {
            for (Object obj : (Object[]) c0495p.i) {
                arrayList3.add(obj);
            }
        }
        for (int i7 = 0; i7 < i; i7++) {
            arrayList3.add(objArrJ[i7]);
        }
        uVarD0.b();
        fVar.M0(uVarD0);
        return arrayList3;
    }

    public final Object[] f(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        if (iVar.B0() == T1.k.END_ARRAY) {
            return f7668o;
        }
        O1.u uVarD0 = fVar.D0();
        Object[] objArrJ = uVarD0.j();
        int i = 0;
        while (true) {
            Object objDeserialize = deserialize(iVar, fVar);
            if (i >= objArrJ.length) {
                objArrJ = uVarD0.c(objArrJ);
                i = 0;
            }
            int i3 = i + 1;
            objArrJ[i] = objDeserialize;
            if (iVar.B0() == T1.k.END_ARRAY) {
                int i6 = uVarD0.f4533a + i3;
                Object[] objArr = new Object[i6];
                uVarD0.a(i6, i3, objArr, objArrJ);
                uVarD0.b();
                fVar.M0(uVarD0);
                return objArr;
            }
            i = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086 A[SYNTHETIC] */
    public final LinkedHashMap g(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        String str;
        String strO;
        Object objDeserialize;
        String strZ0;
        Object objDeserialize2;
        String strZ1;
        LinkedHashMap linkedHashMap;
        String strZ2;
        Object objDeserialize3;
        Object objPut;
        LinkedHashMap linkedHashMap2;
        T1.k kVarS = iVar.s();
        if (kVarS != T1.k.START_OBJECT) {
            if (kVarS == T1.k.FIELD_NAME) {
                strO = iVar.o();
            } else {
                if (kVarS != T1.k.END_OBJECT) {
                    fVar.s0(iVar, handledType());
                    throw null;
                }
                str = null;
            }
            if (str == null) {
                return new LinkedHashMap(2);
            }
            iVar.B0();
            objDeserialize = deserialize(iVar, fVar);
            strZ0 = iVar.z0();
            if (strZ0 == null) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(2);
                linkedHashMap3.put(str, objDeserialize);
                return linkedHashMap3;
            }
            iVar.B0();
            objDeserialize2 = deserialize(iVar, fVar);
            strZ1 = iVar.z0();
            if (strZ1 == null) {
                linkedHashMap2 = new LinkedHashMap(4);
                linkedHashMap2.put(str, objDeserialize);
                if (linkedHashMap2.put(strZ0, objDeserialize2) != null) {
                    d(iVar, fVar, linkedHashMap2, str, objDeserialize, objDeserialize2, strZ1);
                }
                return linkedHashMap2;
            }
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(str, objDeserialize);
            if (linkedHashMap.put(strZ0, objDeserialize2) != null) {
                d(iVar, fVar, linkedHashMap, str, objDeserialize, objDeserialize2, strZ1);
                return linkedHashMap;
            }
            strZ2 = strZ1;
            do {
                iVar.B0();
                objDeserialize3 = deserialize(iVar, fVar);
                objPut = linkedHashMap.put(strZ2, objDeserialize3);
                if (objPut != null) {
                    d(iVar, fVar, linkedHashMap, strZ2, objPut, objDeserialize3, iVar.z0());
                    return linkedHashMap;
                }
                strZ2 = iVar.z0();
            } while (strZ2 != null);
            return linkedHashMap;
        }
        strO = iVar.z0();
        str = strO;
        if (str == null) {
            return new LinkedHashMap(2);
        }
        iVar.B0();
        objDeserialize = deserialize(iVar, fVar);
        strZ0 = iVar.z0();
        if (strZ0 == null) {
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(2);
            linkedHashMap4.put(str, objDeserialize);
            return linkedHashMap4;
        }
        iVar.B0();
        objDeserialize2 = deserialize(iVar, fVar);
        strZ1 = iVar.z0();
        if (strZ1 == null) {
            linkedHashMap2 = new LinkedHashMap(4);
            linkedHashMap2.put(str, objDeserialize);
            if (linkedHashMap2.put(strZ0, objDeserialize2) != null) {
                d(iVar, fVar, linkedHashMap2, str, objDeserialize, objDeserialize2, strZ1);
            }
            return linkedHashMap2;
        }
        linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(str, objDeserialize);
        if (linkedHashMap.put(strZ0, objDeserialize2) != null) {
            d(iVar, fVar, linkedHashMap, str, objDeserialize, objDeserialize2, strZ1);
            return linkedHashMap;
        }
        strZ2 = strZ1;
        do {
            iVar.B0();
            objDeserialize3 = deserialize(iVar, fVar);
            objPut = linkedHashMap.put(strZ2, objDeserialize3);
            if (objPut != null) {
                d(iVar, fVar, linkedHashMap, strZ2, objPut, objDeserialize3, iVar.z0());
                return linkedHashMap;
            }
            strZ2 = iVar.z0();
        } while (strZ2 != null);
        return linkedHashMap;
    }

    @Override // p015c2.j
    public final boolean isCachable() {
        return true;
    }

    @Override // p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12495l;
    }

    @Override // p015c2.j
    public final Boolean supportsUpdate(C0474e c0474e) {
        return null;
    }

    public v0(v0 v0Var, boolean z5) {
        super(Object.class);
        this.f7669h = v0Var.f7669h;
        this.i = v0Var.i;
        this.f7670j = v0Var.f7670j;
        this.f7671k = v0Var.f7671k;
        this.f7672l = v0Var.f7672l;
        this.f7673m = v0Var.f7673m;
        this.f7674n = z5;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar, Object obj) throws MismatchedInputException {
        Object objDeserialize;
        if (this.f7674n) {
            return deserialize(iVar, fVar);
        }
        switch (iVar.v()) {
            case 1:
            case 2:
            case 5:
                p015c2.j jVar = this.f7669h;
                if (jVar != null) {
                    return jVar.deserialize(iVar, fVar, obj);
                }
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    T1.k kVarS = iVar.s();
                    if (kVarS == T1.k.START_OBJECT) {
                        kVarS = iVar.B0();
                    }
                    if (kVarS != T1.k.END_OBJECT) {
                        String strO = iVar.o();
                        do {
                            iVar.B0();
                            Object obj2 = map.get(strO);
                            if (obj2 != null) {
                                objDeserialize = deserialize(iVar, fVar, obj2);
                            } else {
                                objDeserialize = deserialize(iVar, fVar);
                            }
                            if (objDeserialize != obj2) {
                                map.put(strO, objDeserialize);
                            }
                            strO = iVar.z0();
                        } while (strO != null);
                    }
                    return map;
                }
                return g(iVar, fVar);
            case 3:
                p015c2.j jVar2 = this.i;
                if (jVar2 != null) {
                    return jVar2.deserialize(iVar, fVar, obj);
                }
                if (obj instanceof Collection) {
                    Collection collection = (Collection) obj;
                    while (iVar.B0() != T1.k.END_ARRAY) {
                        collection.add(deserialize(iVar, fVar));
                    }
                    return collection;
                }
                if (fVar.B0(p015c2.g.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return f(iVar, fVar);
                }
                return e(iVar, fVar);
            case 4:
            default:
                return deserialize(iVar, fVar);
            case 6:
                p015c2.j jVar3 = this.f7670j;
                if (jVar3 != null) {
                    return jVar3.deserialize(iVar, fVar, obj);
                }
                return iVar.i0();
            case 7:
                p015c2.j jVar4 = this.f7671k;
                if (jVar4 != null) {
                    return jVar4.deserialize(iVar, fVar, obj);
                }
                if (fVar.x0(g0.F_MASK_INT_COERCIONS)) {
                    return _coerceIntegral(iVar, fVar);
                }
                return iVar.c0();
            case 8:
                p015c2.j jVar5 = this.f7671k;
                if (jVar5 != null) {
                    return jVar5.deserialize(iVar, fVar, obj);
                }
                if (fVar.B0(p015c2.g.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return iVar.T();
                }
                return iVar.c0();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return iVar.X();
        }
    }
}
