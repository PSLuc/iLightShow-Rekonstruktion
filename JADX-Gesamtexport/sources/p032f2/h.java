package p032f2;

import G0.p;
import O1.u;
import S1.V;
import T1.i;
import T1.k;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p015c2.C0474e;
import p015c2.f;
import p015c2.g;
import p015c2.j;
import p026e2.b;
import p037g2.C0717a;
import p037g2.C0719c;
import p037g2.F;
import p037g2.w;
import p037g2.z;
import p046i2.C0772h;
import p046i2.r;
import p109u2.A;
import p109u2.s;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0772h f8915C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final p015c2.h f8916D;

    public h(f fVar, r rVar, p015c2.h hVar, C0719c c0719c, HashMap map, HashSet hashSet, boolean z5, HashSet hashSet2, boolean z6) {
        super(fVar, rVar, c0719c, map, hashSet, z5, hashSet2, z6);
        this.f8916D = hVar;
        this.f8915C = fVar.f8912m;
        if (this.f8882A == null) {
            return;
        }
        throw new IllegalArgumentException("Cannot use Object Id with Builder-based deserialization (type " + rVar.f9562a + ")");
    }

    public final Object A(i iVar, f fVar) throws IOException {
        boolean z5 = this.f8888n;
        F[] fArr = this.f8891q;
        C0719c c0719c = this.f8890p;
        t tVar = this.f8884j;
        if (!z5) {
            Object objV = tVar.v(fVar);
            if (fArr != null) {
                t(fVar, objV);
            }
            if (this.f8896v) {
                fVar.getClass();
            }
            while (iVar.s() == k.FIELD_NAME) {
                String strO = iVar.o();
                iVar.B0();
                r rVarI = c0719c.i(strO);
                if (rVarI != null) {
                    try {
                        objV = rVarI.k(iVar, fVar, objV);
                    } catch (Exception e6) {
                        e.y(fVar, e6, objV, strO);
                        throw null;
                    }
                } else {
                    s(iVar, fVar, objV, strO);
                }
                iVar.B0();
            }
            return objV;
        }
        if (this.f8899y == null) {
            if (this.f8900z == null) {
                return n(iVar, fVar);
            }
            if (this.f8887m == null) {
                return B(iVar, fVar, tVar.v(fVar));
            }
            fVar.O(String.format("Deserialization (of %s) with Builder, External type id, @JsonCreator not yet implemented", this.f8916D));
            throw null;
        }
        j jVar = this.f8885k;
        if (jVar != null) {
            return tVar.w(fVar, jVar.deserialize(iVar, fVar));
        }
        u uVar = this.f8887m;
        Set set = this.f8894t;
        Set set2 = this.f8893s;
        if (uVar == null) {
            A aA0 = fVar.a0(iVar);
            aA0.o0();
            Object objV2 = tVar.v(fVar);
            if (fArr != null) {
                t(fVar, objV2);
            }
            while (iVar.s() == k.FIELD_NAME) {
                String strO2 = iVar.o();
                iVar.B0();
                r rVarI2 = c0719c.i(strO2);
                if (rVarI2 != null) {
                    try {
                        objV2 = rVarI2.k(iVar, fVar, objV2);
                    } catch (Exception e7) {
                        e.y(fVar, e7, objV2, strO2);
                        throw null;
                    }
                } else if (V.M(strO2, set2, set)) {
                    p(iVar, fVar, objV2, strO2);
                } else {
                    aA0.T(strO2);
                    aA0.I0(iVar);
                    p pVar = this.f8892r;
                    if (pVar != null) {
                        try {
                            pVar.c(iVar, fVar, objV2, strO2);
                        } catch (Exception e8) {
                            e.y(fVar, e8, objV2, strO2);
                            throw null;
                        }
                    } else {
                        continue;
                    }
                }
                iVar.B0();
            }
            aA0.M();
            this.f8899y.a(fVar, objV2, aA0);
            return objV2;
        }
        z zVarV = uVar.v(iVar, fVar, this.f8882A);
        A aA1 = fVar.a0(iVar);
        aA1.o0();
        k kVarS = iVar.s();
        while (kVarS == k.FIELD_NAME) {
            String strO3 = iVar.o();
            iVar.B0();
            r rVarG = uVar.g(strO3);
            if (!zVarV.d(strO3) || rVarG != null) {
                p015c2.h hVar = this.f8883h;
                if (rVarG == null) {
                    r rVarI3 = c0719c.i(strO3);
                    if (rVarI3 != null) {
                        zVarV.c(rVarI3, rVarI3.i(iVar, fVar));
                    } else if (V.M(strO3, set2, set)) {
                        p(iVar, fVar, hVar.f7281k, strO3);
                    } else {
                        aA1.T(strO3);
                        aA1.I0(iVar);
                        p pVar2 = this.f8892r;
                        if (pVar2 != null) {
                            zVarV.f9178h = new w(zVarV.f9178h, pVar2.b(iVar, fVar), pVar2, strO3);
                        }
                    }
                } else if (zVarV.b(rVarG, rVarG.i(iVar, fVar))) {
                    iVar.B0();
                    try {
                        Object objD = uVar.d(fVar, zVarV);
                        return objD.getClass() != hVar.f7281k ? q(iVar, fVar, objD, aA1) : C(iVar, fVar, objD, aA1);
                    } catch (Exception e9) {
                        e.y(fVar, e9, hVar.f7281k, strO3);
                        throw null;
                    }
                }
            }
            kVarS = iVar.B0();
        }
        aA1.M();
        try {
            Object objD2 = uVar.d(fVar, zVarV);
            this.f8899y.a(fVar, objD2, aA1);
            return objD2;
        } catch (Exception e10) {
            z(e10, fVar);
            throw null;
        }
    }

    public final Object B(i iVar, f fVar, Object obj) throws IOException {
        if (this.f8896v) {
            fVar.getClass();
        }
        p pVar = this.f8900z;
        pVar.getClass();
        p pVar2 = new p(pVar);
        k kVarS = iVar.s();
        while (kVarS == k.FIELD_NAME) {
            String strO = iVar.o();
            k kVarB0 = iVar.B0();
            r rVarI = this.f8890p.i(strO);
            if (rVarI != null) {
                if (kVarB0.f5237o) {
                    pVar2.n(iVar, fVar, obj, strO);
                }
                try {
                    obj = rVarI.k(iVar, fVar, obj);
                } catch (Exception e6) {
                    e.y(fVar, e6, obj, strO);
                    throw null;
                }
            } else if (V.M(strO, this.f8893s, this.f8894t)) {
                p(iVar, fVar, obj, strO);
            } else if (pVar2.m(iVar, fVar, obj, strO)) {
                continue;
            } else {
                p pVar3 = this.f8892r;
                if (pVar3 != null) {
                    try {
                        pVar3.c(iVar, fVar, obj, strO);
                    } catch (Exception e7) {
                        e.y(fVar, e7, obj, strO);
                        throw null;
                    }
                } else {
                    handleUnknownProperty(iVar, fVar, obj, strO);
                }
            }
            kVarS = iVar.B0();
        }
        pVar2.h(iVar, fVar, obj);
        return obj;
    }

    public final Object C(i iVar, f fVar, Object obj, A a6) throws IOException {
        if (this.f8896v) {
            fVar.getClass();
        }
        k kVarS = iVar.s();
        while (kVarS == k.FIELD_NAME) {
            String strO = iVar.o();
            r rVarI = this.f8890p.i(strO);
            iVar.B0();
            if (rVarI != null) {
                try {
                    obj = rVarI.k(iVar, fVar, obj);
                } catch (Exception e6) {
                    e.y(fVar, e6, obj, strO);
                    throw null;
                }
            } else if (V.M(strO, this.f8893s, this.f8894t)) {
                p(iVar, fVar, obj, strO);
            } else {
                a6.T(strO);
                a6.I0(iVar);
                p pVar = this.f8892r;
                if (pVar != null) {
                    pVar.c(iVar, fVar, obj, strO);
                }
            }
            kVarS = iVar.B0();
        }
        a6.M();
        this.f8899y.a(fVar, obj, a6);
        return obj;
    }

    public final Object D(f fVar, Object obj) throws IOException {
        C0772h c0772h = this.f8915C;
        if (c0772h == null) {
            return obj;
        }
        try {
            return c0772h.f9547l.invoke(obj, null);
        } catch (Exception e6) {
            z(e6, fVar);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0
    public final Object _deserializeFromArray(i iVar, f fVar) throws IOException {
        i iVar2;
        f fVar2;
        j jVar = this.f8886l;
        if (jVar != null || (jVar = this.f8885k) != null) {
            Object objU = this.f8884j.u(fVar, jVar.deserialize(iVar, fVar));
            if (this.f8891q != null) {
                t(fVar, objU);
            }
            return D(fVar, objU);
        }
        b bVar_findCoercionFromEmptyArray = _findCoercionFromEmptyArray(fVar);
        boolean zB0 = fVar.B0(g.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zB0 || bVar_findCoercionFromEmptyArray != b.f8686h) {
            k kVarB0 = iVar.B0();
            k kVar = k.END_ARRAY;
            if (kVarB0 == kVar) {
                int iOrdinal = bVar_findCoercionFromEmptyArray.ordinal();
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return getNullValue(fVar);
                }
                if (iOrdinal == 3) {
                    return getEmptyValue(fVar);
                }
                fVar.t0(getValueType(fVar), k.START_ARRAY, iVar, null, new Object[0]);
                throw null;
            }
            iVar2 = iVar;
            fVar2 = fVar;
            if (zB0) {
                Object objDeserialize = deserialize(iVar2, fVar2);
                if (iVar2.B0() != kVar) {
                    handleMissingEndArrayForSingle(iVar2, fVar2);
                }
                return objDeserialize;
            }
        } else {
            iVar2 = iVar;
            fVar2 = fVar;
        }
        fVar2.r0(iVar2, getValueType(fVar2));
        throw null;
    }

    @Override // p015c2.j
    public final Object deserialize(i iVar, f fVar) throws IOException {
        if (!iVar.x0()) {
            switch (iVar.v()) {
                case 2:
                case 5:
                    return D(fVar, A(iVar, fVar));
                case 3:
                    return _deserializeFromArray(iVar, fVar);
                case 4:
                case 11:
                default:
                    fVar.r0(iVar, getValueType(fVar));
                    throw null;
                case 6:
                    return D(fVar, o(iVar, fVar));
                case 7:
                    return D(fVar, l(iVar, fVar));
                case 8:
                    return D(fVar, k(iVar, fVar));
                case 9:
                case 10:
                    return D(fVar, j(iVar, fVar));
                case 12:
                    return iVar.X();
            }
        }
        iVar.B0();
        if (!this.f8889o) {
            return D(fVar, A(iVar, fVar));
        }
        Object objV = this.f8884j.v(fVar);
        while (iVar.s() == k.FIELD_NAME) {
            String strO = iVar.o();
            iVar.B0();
            r rVarI = this.f8890p.i(strO);
            if (rVarI != null) {
                try {
                    objV = rVarI.k(iVar, fVar, objV);
                } catch (Exception e6) {
                    e.y(fVar, e6, objV, strO);
                    throw null;
                }
            } else {
                s(iVar, fVar, objV, strO);
            }
            iVar.B0();
        }
        return D(fVar, objV);
    }

    @Override // p032f2.e
    public final Object e(i iVar, f fVar) throws IOException {
        u uVar = this.f8887m;
        z zVarV = uVar.v(iVar, fVar, this.f8882A);
        boolean z5 = this.f8896v;
        if (z5) {
            fVar.getClass();
        }
        k kVarS = iVar.s();
        A aA0 = null;
        while (true) {
            k kVar = k.FIELD_NAME;
            p015c2.h hVar = this.f8883h;
            if (kVarS != kVar) {
                try {
                    Object objD = uVar.d(fVar, zVarV);
                    if (aA0 != null) {
                        if (objD.getClass() != hVar.f7281k) {
                            return q(null, fVar, objD, aA0);
                        }
                        r(fVar, objD, aA0);
                    }
                    return objD;
                } catch (Exception e6) {
                    z(e6, fVar);
                    throw null;
                }
            }
            String strO = iVar.o();
            iVar.B0();
            r rVarG = uVar.g(strO);
            if (!zVarV.d(strO) || rVarG != null) {
                C0719c c0719c = this.f8890p;
                if (rVarG == null) {
                    r rVarI = c0719c.i(strO);
                    if (rVarI != null) {
                        zVarV.c(rVarI, rVarI.i(iVar, fVar));
                    } else if (V.M(strO, this.f8893s, this.f8894t)) {
                        p(iVar, fVar, hVar.f7281k, strO);
                    } else {
                        p pVar = this.f8892r;
                        if (pVar != null) {
                            zVarV.f9178h = new w(zVarV.f9178h, pVar.b(iVar, fVar), pVar, strO);
                        } else {
                            if (aA0 == null) {
                                aA0 = fVar.a0(iVar);
                            }
                            aA0.T(strO);
                            aA0.I0(iVar);
                        }
                    }
                } else if (zVarV.b(rVarG, rVarG.i(iVar, fVar))) {
                    iVar.B0();
                    try {
                        Object objD2 = uVar.d(fVar, zVarV);
                        if (objD2.getClass() != hVar.f7281k) {
                            return q(iVar, fVar, objD2, aA0);
                        }
                        if (aA0 != null) {
                            r(fVar, objD2, aA0);
                        }
                        if (this.f8891q != null) {
                            t(fVar, objD2);
                        }
                        if (this.f8899y != null) {
                            if (iVar.s0(k.START_OBJECT)) {
                                iVar.B0();
                            }
                            A aA1 = fVar.a0(iVar);
                            aA1.o0();
                            return C(iVar, fVar, objD2, aA1);
                        }
                        if (this.f8900z != null) {
                            return B(iVar, fVar, objD2);
                        }
                        if (z5) {
                            fVar.getClass();
                        }
                        k kVarS2 = iVar.s();
                        if (kVarS2 == k.START_OBJECT) {
                            kVarS2 = iVar.B0();
                        }
                        while (kVarS2 == k.FIELD_NAME) {
                            String strO2 = iVar.o();
                            iVar.B0();
                            r rVarI2 = c0719c.i(strO2);
                            if (rVarI2 != null) {
                                try {
                                    objD2 = rVarI2.k(iVar, fVar, objD2);
                                } catch (Exception e7) {
                                    e.y(fVar, e7, objD2, strO2);
                                    throw null;
                                }
                            } else {
                                s(iVar, fVar, objD2, strO2);
                            }
                            kVarS2 = iVar.B0();
                        }
                        return objD2;
                    } catch (Exception e8) {
                        e.y(fVar, e8, hVar.f7281k, strO);
                        throw null;
                    }
                }
            }
            kVarS = iVar.B0();
        }
    }

    @Override // p032f2.e
    public final e i() {
        return new C0717a(this, this.f8916D, this.f8890p.f9117m, this.f8915C);
    }

    @Override // p032f2.e, p015c2.j
    public final Boolean supportsUpdate(C0474e c0474e) {
        return Boolean.FALSE;
    }

    @Override // p032f2.e
    public final e u(C0719c c0719c) {
        return new h(this, c0719c);
    }

    @Override // p032f2.e, p015c2.j
    public final j unwrappingDeserializer(s sVar) {
        return new h(this, sVar);
    }

    @Override // p032f2.e
    public final e v(Set set, Set set2) {
        return new h(this, set, set2);
    }

    @Override // p032f2.e
    public final e w() {
        return new h(this);
    }

    @Override // p032f2.e
    public final e x(p037g2.r rVar) {
        return new h(this, rVar);
    }

    public h(h hVar) {
        super((e) hVar, true);
        this.f8915C = hVar.f8915C;
        this.f8916D = hVar.f8916D;
    }

    public h(h hVar, s sVar) {
        super(hVar, sVar);
        this.f8915C = hVar.f8915C;
        this.f8916D = hVar.f8916D;
    }

    public h(h hVar, p037g2.r rVar) {
        super(hVar, rVar);
        this.f8915C = hVar.f8915C;
        this.f8916D = hVar.f8916D;
    }

    public h(h hVar, Set set, Set set2) {
        super(hVar, set, set2);
        this.f8915C = hVar.f8915C;
        this.f8916D = hVar.f8916D;
    }

    public h(h hVar, C0719c c0719c) {
        super(hVar, c0719c);
        this.f8915C = hVar.f8915C;
        this.f8916D = hVar.f8916D;
    }

    @Override // p015c2.j
    public final Object deserialize(i iVar, f fVar, Object obj) throws InvalidDefinitionException {
        Class cls = this.f8883h.f7281k;
        Class<?> cls2 = obj.getClass();
        boolean zIsAssignableFrom = cls.isAssignableFrom(cls2);
        p015c2.h hVar = this.f8916D;
        if (zIsAssignableFrom) {
            fVar.O(String.format("Deserialization of %s by passing existing Builder (%s) instance not supported", hVar, cls.getName()));
            throw null;
        }
        fVar.O(String.format("Deserialization of %s by passing existing instance (of %s) not supported", hVar, cls2.getName()));
        throw null;
    }
}
