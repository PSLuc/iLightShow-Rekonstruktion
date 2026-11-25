package com.fasterxml.jackson.databind.deser.std;

import B.h1;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;
import p015c2.C0474e;
import p015c2.InterfaceC0472c;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0510f extends g0 implements p032f2.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f7591h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f7592j;

    public AbstractC0510f(Class cls, Boolean bool) {
        super(cls);
        this.f7591h = bool;
        this.i = true;
        this.f7592j = true;
    }

    public static JsonNode i(T1.i iVar, p015c2.f fVar) {
        p087q2.m mVar = fVar.f7249l.f7244r;
        Object objX = iVar.X();
        if (objX == null) {
            mVar.getClass();
            return p087q2.p.f11225h;
        }
        if (objX.getClass() == byte[].class) {
            byte[] bArr = (byte[]) objX;
            mVar.getClass();
            return bArr.length == 0 ? p087q2.d.i : new p087q2.d(bArr);
        }
        if (objX instanceof p109u2.v) {
            mVar.getClass();
            return new p087q2.s((p109u2.v) objX);
        }
        if (objX instanceof JsonNode) {
            return (JsonNode) objX;
        }
        mVar.getClass();
        return new p087q2.s(objX);
    }

    public static p087q2.u j(T1.i iVar, p015c2.f fVar, p087q2.m mVar) {
        T1.h hVarB0 = iVar.b0();
        T1.h hVar = T1.h.f5212m;
        p087q2.p pVar = p087q2.p.f11225h;
        if (hVarB0 == hVar) {
            BigDecimal bigDecimalT = iVar.T();
            mVar.getClass();
            if (bigDecimalT == null) {
                return pVar;
            }
            if (bigDecimalT.signum() == 0) {
                return p087q2.g.i;
            }
            try {
                bigDecimalT = bigDecimalT.stripTrailingZeros();
            } catch (ArithmeticException unused) {
            }
            return new p087q2.g(bigDecimalT);
        }
        if (!fVar.B0(p015c2.g.USE_BIG_DECIMAL_FOR_FLOATS)) {
            if (hVarB0 == T1.h.f5210k) {
                float fY = iVar.Y();
                mVar.getClass();
                return new p087q2.i(fY);
            }
            double dV = iVar.V();
            mVar.getClass();
            return new p087q2.h(dV);
        }
        if (iVar.y0()) {
            double dV2 = iVar.V();
            mVar.getClass();
            return new p087q2.h(dV2);
        }
        BigDecimal bigDecimalT2 = iVar.T();
        mVar.getClass();
        if (bigDecimalT2 == null) {
            return pVar;
        }
        if (bigDecimalT2.signum() == 0) {
            return p087q2.g.i;
        }
        try {
            bigDecimalT2 = bigDecimalT2.stripTrailingZeros();
        } catch (ArithmeticException unused2) {
        }
        return new p087q2.g(bigDecimalT2);
    }

    public static p087q2.u k(T1.i iVar, int i, p087q2.m mVar) {
        p087q2.p pVar = p087q2.p.f11225h;
        if (i != 0) {
            if ((i & p015c2.g.USE_BIG_INTEGER_FOR_INTS.i) != 0) {
                BigInteger bigIntegerC = iVar.C();
                mVar.getClass();
                return bigIntegerC == null ? pVar : new p087q2.c(bigIntegerC);
            }
            long jA0 = iVar.a0();
            mVar.getClass();
            return new p087q2.n(jA0);
        }
        T1.h hVarB0 = iVar.b0();
        if (hVarB0 == T1.h.f5208h) {
            int iZ = iVar.Z();
            mVar.getClass();
            p087q2.j[] jVarArr = p087q2.j.i;
            return (iZ > 10 || iZ < -1) ? new p087q2.j(iZ) : p087q2.j.i[iZ - (-1)];
        }
        if (hVarB0 == T1.h.i) {
            long jA1 = iVar.a0();
            mVar.getClass();
            return new p087q2.n(jA1);
        }
        BigInteger bigIntegerC2 = iVar.C();
        mVar.getClass();
        return bigIntegerC2 == null ? pVar : new p087q2.c(bigIntegerC2);
    }

    public static p087q2.u l(T1.i iVar, p015c2.f fVar, p087q2.m mVar) {
        T1.h hVarB0;
        int i = fVar.f7250m;
        int i3 = g0.F_MASK_INT_COERCIONS & i;
        T1.h hVar = T1.h.i;
        if (i3 == 0) {
            hVarB0 = iVar.b0();
        } else if ((p015c2.g.USE_BIG_INTEGER_FOR_INTS.i & i) != 0) {
            hVarB0 = T1.h.f5209j;
        } else {
            hVarB0 = (i & p015c2.g.USE_LONG_FOR_INTS.i) != 0 ? hVar : iVar.b0();
        }
        if (hVarB0 == T1.h.f5208h) {
            int iZ = iVar.Z();
            mVar.getClass();
            p087q2.j[] jVarArr = p087q2.j.i;
            return (iZ > 10 || iZ < -1) ? new p087q2.j(iZ) : p087q2.j.i[iZ - (-1)];
        }
        if (hVarB0 == hVar) {
            long jA0 = iVar.a0();
            mVar.getClass();
            return new p087q2.n(jA0);
        }
        BigInteger bigIntegerC = iVar.C();
        mVar.getClass();
        return bigIntegerC == null ? p087q2.p.f11225h : new p087q2.c(bigIntegerC);
    }

    public static void m(p015c2.f fVar, p087q2.m mVar, String str, p087q2.r rVar, JsonNode jsonNode, JsonNode jsonNode2) throws MismatchedInputException {
        if (fVar.B0(p015c2.g.FAIL_ON_READING_DUP_TREE_KEY)) {
            throw new MismatchedInputException((Closeable) fVar.f7252o, String.format("Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str));
        }
        if (fVar.A0(T1.o.DUPLICATE_PROPERTIES)) {
            if (jsonNode instanceof p087q2.a) {
                ((p087q2.a) jsonNode).r(jsonNode2);
                rVar.u(str, jsonNode);
                return;
            }
            mVar.getClass();
            p087q2.a aVar = new p087q2.a(mVar);
            aVar.q(jsonNode);
            aVar.r(jsonNode2);
            rVar.u(str, aVar);
        }
    }

    @Override // p032f2.i
    public final p015c2.j a(p015c2.f fVar, InterfaceC0472c interfaceC0472c) {
        C0474e c0474e = fVar.f7249l;
        c0474e.f8724n.getClass();
        p026e2.g gVar = c0474e.f8724n;
        gVar.getClass();
        gVar.getClass();
        return (true == this.i && true == this.f7592j) ? this : d(true, true);
    }

    public abstract p015c2.j d(boolean z5, boolean z6);

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        return dVar.b(iVar, fVar);
    }

    public final JsonNode e(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        p087q2.m mVar = fVar.f7249l.f7244r;
        int iV = iVar.v();
        if (iV == 2) {
            mVar.getClass();
            return new p087q2.r(mVar);
        }
        switch (iV) {
            case 6:
                String strI0 = iVar.i0();
                mVar.getClass();
                return p087q2.m.a(strI0);
            case 7:
                return l(iVar, fVar, mVar);
            case 8:
                return j(iVar, fVar, mVar);
            case 9:
                mVar.getClass();
                return p087q2.e.i;
            case 10:
                mVar.getClass();
                return p087q2.e.f11213j;
            case 11:
                mVar.getClass();
                return p087q2.p.f11225h;
            case 12:
                return i(iVar, fVar);
            default:
                fVar.s0(iVar, handledType());
                throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ae A[SYNTHETIC] */
    public final void f(T1.i iVar, p015c2.f fVar, p087q2.m mVar, h1 h1Var, p087q2.f fVar2) throws MismatchedInputException {
        int i;
        p087q2.f fVar3;
        JsonNode jsonNodeA;
        JsonNode jsonNode;
        JsonNode jsonNodeU;
        p087q2.p pVar = p087q2.p.f11225h;
        int i3 = fVar.f7250m & g0.F_MASK_INT_COERCIONS;
        p087q2.f rVar = fVar2;
        do {
            boolean z5 = rVar instanceof p087q2.r;
            p087q2.e eVar = p087q2.e.i;
            p087q2.e eVar2 = p087q2.e.f11213j;
            if (!z5) {
                p087q2.a aVar = (p087q2.a) rVar;
                while (true) {
                    T1.k kVarB0 = iVar.B0();
                    if (kVarB0 == null) {
                        kVarB0 = T1.k.NOT_AVAILABLE;
                    }
                    switch (kVarB0.f5233k) {
                        case 1:
                            h1Var.d(rVar);
                            mVar.getClass();
                            rVar = new p087q2.r(mVar);
                            aVar.q(rVar);
                            break;
                        case 2:
                        case 5:
                        default:
                            aVar.r(h(iVar, fVar));
                            break;
                        case 3:
                            h1Var.d(rVar);
                            mVar.getClass();
                            rVar = new p087q2.a(mVar);
                            aVar.q(rVar);
                            break;
                        case 4:
                            i = h1Var.f327h;
                            if (i == 0) {
                                fVar3 = null;
                            } else {
                                p087q2.f[] fVarArr = (p087q2.f[]) h1Var.f328j;
                                int i6 = i - 1;
                                h1Var.f327h = i6;
                                fVar3 = fVarArr[i6];
                            }
                            rVar = fVar3;
                            break;
                        case 6:
                            String strI0 = iVar.i0();
                            mVar.getClass();
                            aVar.r(p087q2.m.a(strI0));
                            break;
                        case 7:
                            aVar.r(k(iVar, i3, mVar));
                            break;
                        case 8:
                            aVar.r(j(iVar, fVar, mVar));
                            break;
                        case 9:
                            mVar.getClass();
                            aVar.q(eVar);
                            break;
                        case 10:
                            mVar.getClass();
                            aVar.q(eVar2);
                            break;
                        case 11:
                            mVar.getClass();
                            aVar.q(pVar);
                            break;
                    }
                }
            } else {
                p087q2.r rVar2 = (p087q2.r) rVar;
                p087q2.f fVar4 = rVar;
                String strZ0 = iVar.z0();
                while (true) {
                    if (strZ0 == null) {
                        i = h1Var.f327h;
                        if (i == 0) {
                            fVar3 = null;
                        } else {
                            p087q2.f[] fVarArr2 = (p087q2.f[]) h1Var.f328j;
                            int i7 = i - 1;
                            h1Var.f327h = i7;
                            fVar3 = fVarArr2[i7];
                        }
                        rVar = fVar3;
                    } else {
                        T1.k kVarB1 = iVar.B0();
                        if (kVarB1 == null) {
                            kVarB1 = T1.k.NOT_AVAILABLE;
                        }
                        int i8 = kVarB1.f5233k;
                        if (i8 == 1) {
                            mVar.getClass();
                            p087q2.r rVar3 = new p087q2.r(mVar);
                            JsonNode jsonNodeU2 = rVar2.u(strZ0, rVar3);
                            if (jsonNodeU2 != null) {
                                m(fVar, mVar, strZ0, rVar2, jsonNodeU2, rVar3);
                            }
                            h1Var.d(fVar4);
                            rVar2 = rVar3;
                            fVar4 = rVar2;
                        } else if (i8 != 3) {
                            switch (i8) {
                                case 6:
                                    String strI1 = iVar.i0();
                                    mVar.getClass();
                                    jsonNodeA = p087q2.m.a(strI1);
                                    jsonNode = jsonNodeA;
                                    jsonNodeU = rVar2.u(strZ0, jsonNode);
                                    if (jsonNodeU != null) {
                                        m(fVar, mVar, strZ0, rVar2, jsonNodeU, jsonNode);
                                    }
                                    break;
                                case 7:
                                    jsonNodeA = k(iVar, i3, mVar);
                                    jsonNode = jsonNodeA;
                                    jsonNodeU = rVar2.u(strZ0, jsonNode);
                                    if (jsonNodeU != null) {
                                        m(fVar, mVar, strZ0, rVar2, jsonNodeU, jsonNode);
                                    }
                                    break;
                                case 8:
                                    jsonNodeA = j(iVar, fVar, mVar);
                                    jsonNode = jsonNodeA;
                                    jsonNodeU = rVar2.u(strZ0, jsonNode);
                                    if (jsonNodeU != null) {
                                        m(fVar, mVar, strZ0, rVar2, jsonNodeU, jsonNode);
                                    }
                                    break;
                                case 9:
                                    mVar.getClass();
                                    jsonNode = eVar;
                                    jsonNodeU = rVar2.u(strZ0, jsonNode);
                                    if (jsonNodeU != null) {
                                        m(fVar, mVar, strZ0, rVar2, jsonNodeU, jsonNode);
                                    }
                                    break;
                                case 10:
                                    mVar.getClass();
                                    jsonNode = eVar2;
                                    jsonNodeU = rVar2.u(strZ0, jsonNode);
                                    if (jsonNodeU != null) {
                                        m(fVar, mVar, strZ0, rVar2, jsonNodeU, jsonNode);
                                    }
                                    break;
                                case 11:
                                    p026e2.m mVar2 = p026e2.m.READ_NULL_PROPERTIES;
                                    p026e2.j jVar = fVar.f7249l.f8725o;
                                    jVar.getClass();
                                    mVar2.getClass();
                                    if (mVar2.c(jVar.f8703h)) {
                                        mVar.getClass();
                                        jsonNode = pVar;
                                        jsonNodeU = rVar2.u(strZ0, jsonNode);
                                        if (jsonNodeU != null) {
                                            m(fVar, mVar, strZ0, rVar2, jsonNodeU, jsonNode);
                                        }
                                    }
                                    break;
                                default:
                                    jsonNodeA = h(iVar, fVar);
                                    jsonNode = jsonNodeA;
                                    jsonNodeU = rVar2.u(strZ0, jsonNode);
                                    if (jsonNodeU != null) {
                                        m(fVar, mVar, strZ0, rVar2, jsonNodeU, jsonNode);
                                    }
                                    break;
                            }
                        } else {
                            mVar.getClass();
                            p087q2.f aVar2 = new p087q2.a(mVar);
                            JsonNode jsonNodeU3 = rVar2.u(strZ0, aVar2);
                            if (jsonNodeU3 != null) {
                                m(fVar, mVar, strZ0, rVar2, jsonNodeU3, aVar2);
                            }
                            h1Var.d(fVar4);
                            rVar = aVar2;
                        }
                        strZ0 = iVar.z0();
                    }
                }
            }
        } while (rVar != null);
    }

    public final p087q2.r g(T1.i iVar, p015c2.f fVar, p087q2.m mVar, h1 h1Var) throws MismatchedInputException {
        p087q2.f rVar;
        p087q2.r rVar2;
        mVar.getClass();
        p087q2.r rVar3 = new p087q2.r(mVar);
        String strO = iVar.o();
        while (strO != null) {
            T1.k kVarB0 = iVar.B0();
            if (kVarB0 == null) {
                kVarB0 = T1.k.NOT_AVAILABLE;
            }
            int i = kVarB0.f5233k;
            if (i == 1) {
                rVar = new p087q2.r(mVar);
                f(iVar, fVar, mVar, h1Var, rVar);
            } else if (i != 3) {
                rVar = e(iVar, fVar);
            } else {
                rVar = new p087q2.a(mVar);
                f(iVar, fVar, mVar, h1Var, rVar);
            }
            JsonNode jsonNodeU = rVar3.u(strO, rVar);
            if (jsonNodeU != null) {
                rVar2 = rVar3;
                m(fVar, mVar, strO, rVar2, jsonNodeU, rVar);
            } else {
                rVar2 = rVar3;
            }
            strO = iVar.z0();
            rVar3 = rVar2;
        }
        return rVar3;
    }

    public final JsonNode h(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        int iV = iVar.v();
        if (iV == 2) {
            p087q2.m mVar = fVar.f7249l.f7244r;
            mVar.getClass();
            return new p087q2.r(mVar);
        }
        if (iV == 8) {
            return j(iVar, fVar, fVar.f7249l.f7244r);
        }
        if (iV == 12) {
            return i(iVar, fVar);
        }
        fVar.s0(iVar, handledType());
        throw null;
    }

    @Override // p015c2.j
    public final boolean isCachable() {
        return true;
    }

    @Override // p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12495l;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:48:0x009e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:51:0x00af  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7 A[SYNTHETIC] */
    public final JsonNode n(T1.i iVar, p015c2.f fVar, p087q2.r rVar, h1 h1Var) throws MismatchedInputException {
        String strO;
        AbstractC0510f abstractC0510f;
        T1.i iVar2;
        p015c2.f fVar2;
        h1 h1Var2;
        int i;
        p087q2.f rVar2;
        JsonNode jsonNodeA;
        p026e2.m mVar;
        p026e2.j jVar;
        if (iVar.x0()) {
            strO = iVar.z0();
        } else {
            if (!iVar.s0(T1.k.FIELD_NAME)) {
                return (JsonNode) deserialize(iVar, fVar);
            }
            strO = iVar.o();
        }
        p087q2.m mVar2 = fVar.f7249l.f7244r;
        while (strO != null) {
            T1.k kVarB0 = iVar.B0();
            JsonNode jsonNodeN = rVar.n(strO);
            if (jsonNodeN == null) {
                abstractC0510f = this;
                iVar2 = iVar;
                fVar2 = fVar;
                h1Var2 = h1Var;
                if (kVarB0 == null) {
                    kVarB0 = T1.k.NOT_AVAILABLE;
                }
                i = kVarB0.f5233k;
                if (i == 1) {
                    mVar2.getClass();
                    rVar2 = new p087q2.r(mVar2);
                    abstractC0510f.f(iVar2, fVar2, mVar2, h1Var2, rVar2);
                } else if (i != 3) {
                    if (i == 6) {
                        String strI0 = iVar2.i0();
                        mVar2.getClass();
                        jsonNodeA = p087q2.m.a(strI0);
                    } else if (i != 7) {
                        switch (i) {
                            case 9:
                                mVar2.getClass();
                                jsonNodeA = p087q2.e.i;
                                break;
                            case 10:
                                mVar2.getClass();
                                jsonNodeA = p087q2.e.f11213j;
                                break;
                            case 11:
                                mVar = p026e2.m.READ_NULL_PROPERTIES;
                                jVar = fVar2.f7249l.f8725o;
                                jVar.getClass();
                                mVar.getClass();
                                if (mVar.c(jVar.f8703h)) {
                                    mVar2.getClass();
                                    jsonNodeA = p087q2.p.f11225h;
                                }
                                break;
                            default:
                                jsonNodeA = abstractC0510f.h(iVar2, fVar2);
                                break;
                        }
                    } else {
                        jsonNodeA = l(iVar2, fVar2, mVar2);
                    }
                    rVar.w(strO, jsonNodeA);
                } else {
                    mVar2.getClass();
                    rVar2 = new p087q2.a(mVar2);
                    abstractC0510f.f(iVar2, fVar2, mVar2, h1Var2, rVar2);
                }
                jsonNodeA = rVar2;
                rVar.w(strO, jsonNodeA);
            } else if (jsonNodeN instanceof p087q2.r) {
                if (kVarB0 == T1.k.START_OBJECT && this.f7592j) {
                    JsonNode jsonNodeN2 = this.n(iVar, fVar, (p087q2.r) jsonNodeN, h1Var);
                    if (jsonNodeN2 != jsonNodeN) {
                        rVar.w(strO, jsonNodeN2);
                    }
                    abstractC0510f = this;
                    iVar2 = iVar;
                    fVar2 = fVar;
                    h1Var2 = h1Var;
                } else {
                    abstractC0510f = this;
                    iVar2 = iVar;
                    fVar2 = fVar;
                    h1Var2 = h1Var;
                    if (kVarB0 == null) {
                        kVarB0 = T1.k.NOT_AVAILABLE;
                    }
                    i = kVarB0.f5233k;
                    if (i == 1) {
                        mVar2.getClass();
                        rVar2 = new p087q2.r(mVar2);
                        abstractC0510f.f(iVar2, fVar2, mVar2, h1Var2, rVar2);
                    } else if (i != 3) {
                        if (i == 6) {
                            String strI1 = iVar2.i0();
                            mVar2.getClass();
                            jsonNodeA = p087q2.m.a(strI1);
                        } else if (i != 7) {
                            switch (i) {
                                case 9:
                                    mVar2.getClass();
                                    jsonNodeA = p087q2.e.i;
                                    break;
                                case 10:
                                    mVar2.getClass();
                                    jsonNodeA = p087q2.e.f11213j;
                                    break;
                                case 11:
                                    mVar = p026e2.m.READ_NULL_PROPERTIES;
                                    jVar = fVar2.f7249l.f8725o;
                                    jVar.getClass();
                                    mVar.getClass();
                                    if (mVar.c(jVar.f8703h)) {
                                        mVar2.getClass();
                                        jsonNodeA = p087q2.p.f11225h;
                                    }
                                    break;
                                default:
                                    jsonNodeA = abstractC0510f.h(iVar2, fVar2);
                                    break;
                            }
                        } else {
                            jsonNodeA = l(iVar2, fVar2, mVar2);
                        }
                        rVar.w(strO, jsonNodeA);
                    } else {
                        mVar2.getClass();
                        rVar2 = new p087q2.a(mVar2);
                        abstractC0510f.f(iVar2, fVar2, mVar2, h1Var2, rVar2);
                    }
                    jsonNodeA = rVar2;
                    rVar.w(strO, jsonNodeA);
                }
            } else if ((jsonNodeN instanceof p087q2.a) && kVarB0 == T1.k.START_ARRAY && this.i) {
                p087q2.a aVar = (p087q2.a) jsonNodeN;
                abstractC0510f = this;
                iVar2 = iVar;
                fVar2 = fVar;
                h1Var2 = h1Var;
                abstractC0510f.f(iVar2, fVar2, mVar2, h1Var2, aVar);
            } else {
                abstractC0510f = this;
                iVar2 = iVar;
                fVar2 = fVar;
                h1Var2 = h1Var;
                if (kVarB0 == null) {
                    kVarB0 = T1.k.NOT_AVAILABLE;
                }
                i = kVarB0.f5233k;
                if (i == 1) {
                    mVar2.getClass();
                    rVar2 = new p087q2.r(mVar2);
                    abstractC0510f.f(iVar2, fVar2, mVar2, h1Var2, rVar2);
                } else if (i != 3) {
                    if (i == 6) {
                        String strI2 = iVar2.i0();
                        mVar2.getClass();
                        jsonNodeA = p087q2.m.a(strI2);
                    } else if (i != 7) {
                        switch (i) {
                            case 9:
                                mVar2.getClass();
                                jsonNodeA = p087q2.e.i;
                                break;
                            case 10:
                                mVar2.getClass();
                                jsonNodeA = p087q2.e.f11213j;
                                break;
                            case 11:
                                mVar = p026e2.m.READ_NULL_PROPERTIES;
                                jVar = fVar2.f7249l.f8725o;
                                jVar.getClass();
                                mVar.getClass();
                                if (mVar.c(jVar.f8703h)) {
                                    mVar2.getClass();
                                    jsonNodeA = p087q2.p.f11225h;
                                }
                                break;
                            default:
                                jsonNodeA = abstractC0510f.h(iVar2, fVar2);
                                break;
                        }
                    } else {
                        jsonNodeA = l(iVar2, fVar2, mVar2);
                    }
                    rVar.w(strO, jsonNodeA);
                } else {
                    mVar2.getClass();
                    rVar2 = new p087q2.a(mVar2);
                    abstractC0510f.f(iVar2, fVar2, mVar2, h1Var2, rVar2);
                }
                jsonNodeA = rVar2;
                rVar.w(strO, jsonNodeA);
            }
            strO = iVar2.z0();
            this = abstractC0510f;
            iVar = iVar2;
            fVar = fVar2;
            h1Var = h1Var2;
        }
        return rVar;
    }

    @Override // p015c2.j
    public Boolean supportsUpdate(C0474e c0474e) {
        return this.f7591h;
    }

    public AbstractC0510f(AbstractC0510f abstractC0510f, boolean z5, boolean z6) {
        super(abstractC0510f);
        this.f7591h = abstractC0510f.f7591h;
        this.i = z5;
        this.f7592j = z6;
    }
}
