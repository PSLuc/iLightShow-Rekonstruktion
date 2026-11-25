package p032f2;

import B.AbstractC0013g0;
import G0.p;
import O1.u;
import S1.V;
import T1.i;
import T1.k;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.io.IOException;
import java.util.Set;
import p015c2.f;
import p015c2.g;
import p015c2.h;
import p015c2.j;
import p026e2.b;
import p037g2.C0718b;
import p037g2.C0719c;
import p037g2.E;
import p037g2.F;
import p037g2.r;
import p037g2.w;
import p037g2.z;
import p109u2.A;
import p109u2.s;
import p109u2.y;

/* JADX INFO: loaded from: classes.dex */
public class d extends e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public transient NullPointerException f8879C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public volatile transient s f8880D;

    public final Object A(i iVar, f fVar, r rVar) throws IOException {
        try {
            return rVar.i(iVar, fVar);
        } catch (Exception e6) {
            e.y(fVar, e6, this.f8883h.f7281k, rVar.f8933j.f7195h);
            throw null;
        }
    }

    public final Object B(i iVar, f fVar, Object obj, p pVar) throws IOException {
        if (this.f8896v) {
            fVar.getClass();
        }
        k kVarS = iVar.s();
        while (kVarS == k.FIELD_NAME) {
            String strO = iVar.o();
            k kVarB0 = iVar.B0();
            r rVarI = this.f8890p.i(strO);
            if (rVarI != null) {
                if (kVarB0.f5237o) {
                    pVar.n(iVar, fVar, obj, strO);
                }
                try {
                    rVarI.j(iVar, fVar, obj);
                } catch (Exception e6) {
                    e.y(fVar, e6, obj, strO);
                    throw null;
                }
            } else if (V.M(strO, this.f8893s, this.f8894t)) {
                p(iVar, fVar, obj, strO);
            } else if (pVar.m(iVar, fVar, obj, strO)) {
                continue;
            } else {
                p pVar2 = this.f8892r;
                if (pVar2 != null) {
                    try {
                        pVar2.c(iVar, fVar, obj, strO);
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
        pVar.h(iVar, fVar, obj);
        return obj;
    }

    public Object C(i iVar, f fVar) throws IOException {
        Object objE0;
        r rVar = this.f8882A;
        if (rVar != null) {
            rVar.f9159j.getClass();
        }
        boolean z5 = this.f8888n;
        F[] fArr = this.f8891q;
        boolean z6 = this.f8896v;
        C0719c c0719c = this.f8890p;
        t tVar = this.f8884j;
        if (!z5) {
            Object objV = tVar.v(fVar);
            iVar.E0(objV);
            if (iVar.b() && (objE0 = iVar.e0()) != null) {
                g(iVar, fVar, objE0);
                throw null;
            }
            if (fArr != null) {
                t(fVar, objV);
            }
            if (z6) {
                fVar.getClass();
            }
            if (iVar.t0()) {
                String strO = iVar.o();
                do {
                    iVar.B0();
                    r rVarI = c0719c.i(strO);
                    if (rVarI != null) {
                        try {
                            rVarI.j(iVar, fVar, objV);
                        } catch (Exception e6) {
                            e.y(fVar, e6, objV, strO);
                            throw null;
                        }
                    } else {
                        s(iVar, fVar, objV, strO);
                    }
                    strO = iVar.z0();
                } while (strO != null);
            }
            return objV;
        }
        E e7 = this.f8899y;
        h hVar = this.f8883h;
        Set set = this.f8893s;
        Set set2 = this.f8894t;
        if (e7 == null) {
            p pVar = this.f8900z;
            if (pVar == null) {
                return n(iVar, fVar);
            }
            if (this.f8887m == null) {
                j jVar = this.f8885k;
                if (jVar != null) {
                    return tVar.w(fVar, jVar.deserialize(iVar, fVar));
                }
                Object objV2 = tVar.v(fVar);
                D(iVar, fVar, objV2);
                return objV2;
            }
            p pVar2 = new p(pVar);
            u uVar = this.f8887m;
            z zVarV = uVar.v(iVar, fVar, rVar);
            if (z6) {
                fVar.getClass();
            }
            k kVarS = iVar.s();
            while (kVarS == k.FIELD_NAME) {
                String strO2 = iVar.o();
                k kVarB0 = iVar.B0();
                r rVarG = uVar.g(strO2);
                if (!zVarV.d(strO2) || rVarG != null) {
                    if (rVarG == null) {
                        r rVarI2 = c0719c.i(strO2);
                        if (rVarI2 != null) {
                            if (kVarB0.f5237o) {
                                pVar2.n(iVar, fVar, null, strO2);
                            }
                            zVarV.c(rVarI2, rVarI2.i(iVar, fVar));
                        } else if (!pVar2.m(iVar, fVar, null, strO2)) {
                            if (V.M(strO2, set, set2)) {
                                p(iVar, fVar, hVar.f7281k, strO2);
                            } else {
                                p pVar3 = this.f8892r;
                                if (pVar3 != null) {
                                    zVarV.f9178h = new w(zVarV.f9178h, pVar3.b(iVar, fVar), pVar3, strO2);
                                } else {
                                    handleUnknownProperty(iVar, fVar, this._valueClass, strO2);
                                }
                            }
                        }
                    } else if (!pVar2.m(iVar, fVar, null, strO2) && zVarV.b(rVarG, A(iVar, fVar, rVarG))) {
                        iVar.B0();
                        try {
                            Object objD = uVar.d(fVar, zVarV);
                            if (objD.getClass() == hVar.f7281k) {
                                B(iVar, fVar, objD, pVar2);
                                return objD;
                            }
                            fVar.O(String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", hVar, objD.getClass()));
                            throw null;
                        } catch (Exception e8) {
                            e.y(fVar, e8, hVar.f7281k, strO2);
                            throw null;
                        }
                    }
                }
                kVarS = iVar.B0();
            }
            try {
                return pVar2.g(iVar, fVar, zVarV, uVar);
            } catch (Exception e9) {
                z(e9, fVar);
                throw null;
            }
        }
        j jVar2 = this.f8885k;
        if (jVar2 != null) {
            return tVar.w(fVar, jVar2.deserialize(iVar, fVar));
        }
        u uVar2 = this.f8887m;
        if (uVar2 == null) {
            A aA0 = fVar.a0(iVar);
            aA0.o0();
            Object objV3 = tVar.v(fVar);
            iVar.E0(objV3);
            if (fArr != null) {
                t(fVar, objV3);
            }
            String strO3 = iVar.t0() ? iVar.o() : null;
            while (strO3 != null) {
                iVar.B0();
                r rVarI3 = c0719c.i(strO3);
                if (rVarI3 != null) {
                    try {
                        rVarI3.j(iVar, fVar, objV3);
                    } catch (Exception e10) {
                        e.y(fVar, e10, objV3, strO3);
                        throw null;
                    }
                } else if (V.M(strO3, set, set2)) {
                    p(iVar, fVar, objV3, strO3);
                } else if (this.f8892r == null) {
                    aA0.T(strO3);
                    aA0.I0(iVar);
                } else {
                    A aA1 = fVar.a0(iVar);
                    aA1.I0(iVar);
                    aA0.T(strO3);
                    aA0.F0(aA1);
                    try {
                        p pVar4 = this.f8892r;
                        y yVarH0 = aA1.H0(aA1.i);
                        yVarH0.B0();
                        pVar4.c(yVarH0, fVar, objV3, strO3);
                    } catch (Exception e11) {
                        e.y(fVar, e11, objV3, strO3);
                        throw null;
                    }
                }
                strO3 = iVar.z0();
            }
            aA0.M();
            this.f8899y.a(fVar, objV3, aA0);
            return objV3;
        }
        z zVarV2 = uVar2.v(iVar, fVar, rVar);
        A aA2 = fVar.a0(iVar);
        aA2.o0();
        k kVarS2 = iVar.s();
        while (kVarS2 == k.FIELD_NAME) {
            String strO4 = iVar.o();
            iVar.B0();
            r rVarG2 = uVar2.g(strO4);
            if (!zVarV2.d(strO4) || rVarG2 != null) {
                if (rVarG2 == null) {
                    r rVarI4 = c0719c.i(strO4);
                    if (rVarI4 != null) {
                        zVarV2.c(rVarI4, A(iVar, fVar, rVarI4));
                    } else if (V.M(strO4, set, set2)) {
                        p(iVar, fVar, hVar.f7281k, strO4);
                    } else if (this.f8892r == null) {
                        aA2.T(strO4);
                        aA2.I0(iVar);
                    } else {
                        A aA3 = fVar.a0(iVar);
                        aA3.I0(iVar);
                        aA2.T(strO4);
                        aA2.F0(aA3);
                        try {
                            p pVar5 = this.f8892r;
                            y yVarH1 = aA3.H0(aA3.i);
                            yVarH1.B0();
                            zVarV2.f9178h = new w(zVarV2.f9178h, pVar5.b(yVarH1, fVar), pVar5, strO4);
                        } catch (Exception e12) {
                            e.y(fVar, e12, hVar.f7281k, strO4);
                            throw null;
                        }
                    }
                } else if (zVarV2.b(rVarG2, A(iVar, fVar, rVarG2))) {
                    k kVarB1 = iVar.B0();
                    try {
                        Object objD2 = uVar2.d(fVar, zVarV2);
                        iVar.E0(objD2);
                        while (kVarB1 == k.FIELD_NAME) {
                            aA2.I0(iVar);
                            kVarB1 = iVar.B0();
                        }
                        k kVar = k.END_OBJECT;
                        if (kVarB1 != kVar) {
                            fVar.L0(this, kVar, "Attempted to unwrap '%s' value", hVar.f7281k.getName());
                            throw null;
                        }
                        aA2.M();
                        if (objD2.getClass() == hVar.f7281k) {
                            this.f8899y.a(fVar, objD2, aA2);
                            return objD2;
                        }
                        fVar.I0(rVarG2, "Cannot create polymorphic instances with unwrapped values", new Object[0]);
                        throw null;
                    } catch (Exception e13) {
                        z(e13, fVar);
                        throw null;
                    }
                }
            }
            kVarS2 = iVar.B0();
        }
        try {
            Object objD3 = uVar2.d(fVar, zVarV2);
            this.f8899y.a(fVar, objD3, aA2);
            return objD3;
        } catch (Exception e14) {
            z(e14, fVar);
            throw null;
        }
    }

    public final Object D(i iVar, f fVar, Object obj) throws IOException {
        p pVar = this.f8900z;
        pVar.getClass();
        B(iVar, fVar, obj, new p(pVar));
        return obj;
    }

    public final Object E(i iVar, f fVar) throws IOException {
        Object objV = this.f8884j.v(fVar);
        iVar.E0(objV);
        if (iVar.t0()) {
            String strO = iVar.o();
            do {
                iVar.B0();
                r rVarI = this.f8890p.i(strO);
                if (rVarI != null) {
                    try {
                        rVarI.j(iVar, fVar, objV);
                    } catch (Exception e6) {
                        e.y(fVar, e6, objV, strO);
                        throw null;
                    }
                } else {
                    s(iVar, fVar, objV, strO);
                }
                strO = iVar.z0();
            } while (strO != null);
        }
        return objV;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0
    public final Object _deserializeFromArray(i iVar, f fVar) throws IOException {
        j jVar = this.f8886l;
        if (jVar != null || (jVar = this.f8885k) != null) {
            Object objU = this.f8884j.u(fVar, jVar.deserialize(iVar, fVar));
            if (this.f8891q != null) {
                t(fVar, objU);
            }
            return objU;
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
            if (zB0) {
                k kVar2 = k.START_ARRAY;
                if (kVarB0 == kVar2) {
                    h valueType = getValueType(fVar);
                    fVar.t0(valueType, kVar2, iVar, "Cannot deserialize value of type %s from deeply-nested Array: only single wrapper allowed with `%s`", p109u2.i.r(valueType), "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS");
                    throw null;
                }
                Object objDeserialize = deserialize(iVar, fVar);
                if (iVar.B0() != kVar) {
                    handleMissingEndArrayForSingle(iVar, fVar);
                }
                return objDeserialize;
            }
        }
        fVar.r0(iVar, getValueType(fVar));
        throw null;
    }

    @Override // p015c2.j
    public final Object deserialize(i iVar, f fVar) throws IOException {
        Object objC;
        boolean zX0 = iVar.x0();
        r rVar = this.f8882A;
        if (zX0) {
            if (this.f8889o) {
                iVar.B0();
                return E(iVar, fVar);
            }
            iVar.B0();
            return rVar != null ? C(iVar, fVar) : C(iVar, fVar);
        }
        k kVarS = iVar.s();
        if (kVarS != null) {
            switch (kVarS.ordinal()) {
                case 2:
                case 5:
                    if (this.f8889o) {
                        return E(iVar, fVar);
                    }
                    return rVar != null ? C(iVar, fVar) : C(iVar, fVar);
                case 3:
                    return _deserializeFromArray(iVar, fVar);
                case 6:
                    if (rVar != null) {
                        m(iVar, fVar);
                        throw null;
                    }
                    j jVarD = d();
                    if (jVarD != null) {
                        t tVar = this.f8884j;
                        if (!tVar.h()) {
                            Object objW = tVar.w(fVar, jVarD.deserialize(iVar, fVar));
                            if (this.f8891q != null) {
                                t(fVar, objW);
                            }
                            return objW;
                        }
                    }
                    Object objX = iVar.X();
                    if (objX != null) {
                        Class<?> cls = objX.getClass();
                        h hVar = this.f8883h;
                        if (!hVar.o0(cls)) {
                            fVar.f7249l.getClass();
                            throw new InvalidFormatException(fVar.f7252o, AbstractC0013g0.j("Cannot deserialize value of type ", p109u2.i.z(hVar.f7281k), " from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type ", p109u2.i.f(objX), ": incompatible types"), objX);
                        }
                    }
                    return objX;
                case 7:
                    return o(iVar, fVar);
                case 8:
                    return l(iVar, fVar);
                case 9:
                    return k(iVar, fVar);
                case 10:
                case 11:
                    return j(iVar, fVar);
                case 12:
                    if (!iVar.D0()) {
                        fVar.r0(iVar, getValueType(fVar));
                        throw null;
                    }
                    A aA0 = fVar.a0(iVar);
                    aA0.M();
                    y yVarG0 = aA0.G0(iVar);
                    yVarG0.B0();
                    if (this.f8889o) {
                        k kVar = k.NOT_AVAILABLE;
                        objC = E(yVarG0, fVar);
                    } else {
                        objC = C(yVarG0, fVar);
                    }
                    yVarG0.close();
                    return objC;
            }
        }
        fVar.r0(iVar, getValueType(fVar));
        throw null;
    }

    @Override // p032f2.e
    public final Object e(i iVar, f fVar) throws IOException {
        u uVar = this.f8887m;
        z zVarV = uVar.v(iVar, fVar, this.f8882A);
        if (this.f8896v) {
            fVar.getClass();
        }
        k kVarS = iVar.s();
        A aA0 = null;
        while (true) {
            k kVar = k.FIELD_NAME;
            h hVar = this.f8883h;
            if (kVarS != kVar) {
                try {
                    Object objD = uVar.d(fVar, zVarV);
                    if (this.f8891q != null) {
                        t(fVar, objD);
                    }
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
                if (rVarG == null) {
                    r rVarI = this.f8890p.i(strO);
                    if (rVarI != null) {
                        try {
                            zVarV.c(rVarI, A(iVar, fVar, rVarI));
                        } catch (UnresolvedForwardReference unused) {
                            rVarI.f8934k.getClass();
                            throw null;
                        }
                    } else if (V.M(strO, this.f8893s, this.f8894t)) {
                        p(iVar, fVar, hVar.f7281k, strO);
                    } else {
                        p pVar = this.f8892r;
                        if (pVar != null) {
                            try {
                                zVarV.f9178h = new w(zVarV.f9178h, pVar.b(iVar, fVar), pVar, strO);
                            } catch (Exception e7) {
                                e.y(fVar, e7, hVar.f7281k, strO);
                                throw null;
                            }
                        } else if (this.f8895u) {
                            iVar.F0();
                        } else {
                            if (aA0 == null) {
                                aA0 = fVar.a0(iVar);
                            }
                            aA0.T(strO);
                            aA0.I0(iVar);
                        }
                    }
                } else if (zVarV.b(rVarG, A(iVar, fVar, rVarG))) {
                    iVar.B0();
                    try {
                        Object objD2 = uVar.d(fVar, zVarV);
                        if (objD2 == null) {
                            Class cls = hVar.f7281k;
                            if (this.f8879C == null) {
                                this.f8879C = new NullPointerException("JSON Creator returned null");
                            }
                            fVar.n0(cls, this.f8879C);
                            throw null;
                        }
                        iVar.E0(objD2);
                        if (objD2.getClass() != hVar.f7281k) {
                            return q(iVar, fVar, objD2, aA0);
                        }
                        if (aA0 != null) {
                            r(fVar, objD2, aA0);
                        }
                        deserialize(iVar, fVar, objD2);
                        return objD2;
                    } catch (Exception e8) {
                        z(e8, fVar);
                        throw null;
                    }
                }
            }
            kVarS = iVar.B0();
        }
    }

    @Override // p032f2.e
    public final e i() {
        return new C0718b(this, this.f8890p.f9117m);
    }

    @Override // p032f2.e
    public final e u(C0719c c0719c) {
        return new d(this, c0719c);
    }

    @Override // p032f2.e, p015c2.j
    public j unwrappingDeserializer(s sVar) {
        if (getClass() != d.class || this.f8880D == sVar) {
            return this;
        }
        this.f8880D = sVar;
        try {
            return new d(this, sVar);
        } finally {
            this.f8880D = null;
        }
    }

    @Override // p032f2.e
    public final e v(Set set, Set set2) {
        return new d(this, set, set2);
    }

    @Override // p032f2.e
    public final e w() {
        return new d(this, true);
    }

    @Override // p032f2.e
    public final e x(r rVar) {
        return new d(this, rVar);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p015c2.j
    public final Object deserialize(i iVar, f fVar, Object obj) throws IOException {
        String strO;
        r rVarI;
        iVar.E0(obj);
        if (this.f8891q != null) {
            t(fVar, obj);
        }
        E e6 = this.f8899y;
        C0719c c0719c = this.f8890p;
        if (e6 != null) {
            k kVarS = iVar.s();
            if (kVarS == k.START_OBJECT) {
                kVarS = iVar.B0();
            }
            A aA0 = fVar.a0(iVar);
            aA0.o0();
            while (kVarS == k.FIELD_NAME) {
                String strO2 = iVar.o();
                r rVarI2 = c0719c.i(strO2);
                iVar.B0();
                if (rVarI2 != null) {
                    try {
                        rVarI2.j(iVar, fVar, obj);
                    } catch (Exception e7) {
                        e.y(fVar, e7, obj, strO2);
                        throw null;
                    }
                } else if (V.M(strO2, this.f8893s, this.f8894t)) {
                    p(iVar, fVar, obj, strO2);
                } else if (this.f8892r == null) {
                    aA0.T(strO2);
                    aA0.I0(iVar);
                } else {
                    A aA1 = fVar.a0(iVar);
                    aA1.I0(iVar);
                    aA0.T(strO2);
                    aA0.F0(aA1);
                    try {
                        p pVar = this.f8892r;
                        y yVarH0 = aA1.H0(aA1.i);
                        yVarH0.B0();
                        pVar.c(yVarH0, fVar, obj, strO2);
                    } catch (Exception e8) {
                        e.y(fVar, e8, obj, strO2);
                        throw null;
                    }
                }
                kVarS = iVar.B0();
            }
            aA0.M();
            this.f8899y.a(fVar, obj, aA0);
            return obj;
        }
        if (this.f8900z != null) {
            D(iVar, fVar, obj);
            return obj;
        }
        if (iVar.x0()) {
            strO = iVar.z0();
            if (strO != null) {
                if (this.f8896v) {
                    fVar.getClass();
                }
                do {
                    iVar.B0();
                    rVarI = c0719c.i(strO);
                    if (rVarI != null) {
                        try {
                            rVarI.j(iVar, fVar, obj);
                        } catch (Exception e9) {
                            e.y(fVar, e9, obj, strO);
                            throw null;
                        }
                    } else {
                        s(iVar, fVar, obj, strO);
                    }
                    strO = iVar.z0();
                } while (strO != null);
            }
        } else if (iVar.t0()) {
            strO = iVar.o();
            if (this.f8896v) {
                fVar.getClass();
            }
            do {
                iVar.B0();
                rVarI = c0719c.i(strO);
                if (rVarI != null) {
                    rVarI.j(iVar, fVar, obj);
                } else {
                    s(iVar, fVar, obj, strO);
                }
                strO = iVar.z0();
            } while (strO != null);
        }
        return obj;
    }
}
