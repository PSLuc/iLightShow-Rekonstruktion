package com.fasterxml.jackson.databind.deser.std;

import S1.EnumC0352n;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.util.Objects;
import p015c2.C0474e;
import p015c2.InterfaceC0472c;
import p109u2.EnumC0962a;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends g0 implements p032f2.i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f7648l = new String[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p0 f7649m = new p0(null, null, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p015c2.j f7650h;
    public final p032f2.l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f7651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7652k;

    public p0(p015c2.j jVar, p032f2.l lVar, Boolean bool) {
        super(String[].class);
        this.f7650h = jVar;
        this.i = lVar;
        this.f7651j = bool;
        this.f7652k = p037g2.q.a(lVar);
    }

    @Override // p032f2.i
    public final p015c2.j a(p015c2.f fVar, InterfaceC0472c interfaceC0472c) throws InvalidDefinitionException {
        p015c2.j jVar = this.f7650h;
        p015c2.j jVarFindConvertingContentDeserializer = findConvertingContentDeserializer(fVar, interfaceC0472c, jVar);
        p015c2.h hVarB0 = fVar.b0(String.class);
        p015c2.j jVarF0 = jVarFindConvertingContentDeserializer == null ? fVar.f0(hVarB0, interfaceC0472c) : fVar.q0(jVarFindConvertingContentDeserializer, interfaceC0472c, hVarB0);
        Boolean boolFindFormatFeature = findFormatFeature(fVar, interfaceC0472c, String[].class, EnumC0352n.f4954h);
        p032f2.l lVarFindContentNullProvider = findContentNullProvider(fVar, interfaceC0472c, jVarF0);
        if (jVarF0 != null && isDefaultDeserializer(jVarF0)) {
            jVarF0 = null;
        }
        return (jVar == jVarF0 && Objects.equals(this.f7651j, boolFindFormatFeature) && this.i == lVarFindContentNullProvider) ? this : new p0(jVarF0, lVarFindContentNullProvider, boolFindFormatFeature);
    }

    public final String[] d(T1.i iVar, p015c2.f fVar, String[] strArr) throws JsonMappingException {
        int length;
        Object[] objArrK;
        String str;
        int i;
        O1.u uVarD0 = fVar.D0();
        if (strArr == null) {
            objArrK = uVarD0.j();
            length = 0;
        } else {
            length = strArr.length;
            objArrK = uVarD0.k(strArr, length);
        }
        while (true) {
            try {
                String strA0 = iVar.A0();
                p015c2.j jVar = this.f7650h;
                try {
                    if (strA0 == null) {
                        T1.k kVarS = iVar.s();
                        if (kVarS == T1.k.END_ARRAY) {
                            String[] strArr2 = (String[]) uVarD0.e(objArrK, length, String.class);
                            fVar.M0(uVarD0);
                            return strArr2;
                        }
                        if (kVarS != T1.k.VALUE_NULL) {
                            str = (String) jVar.deserialize(iVar, fVar);
                        } else if (!this.f7652k) {
                            str = (String) this.i.getNullValue(fVar);
                        }
                    } else {
                        str = (String) jVar.deserialize(iVar, fVar);
                    }
                    objArrK[length] = str;
                    length = i;
                } catch (Exception e6) {
                    e = e6;
                    length = i;
                    throw JsonMappingException.i(e, String.class, length);
                }
                if (length >= objArrK.length) {
                    objArrK = uVarD0.c(objArrK);
                    length = 0;
                }
                i = length + 1;
            } catch (Exception e7) {
                e = e7;
            }
        }
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar, Object obj) throws JsonMappingException {
        String[] strArr = (String[]) obj;
        if (!iVar.w0()) {
            String[] strArrE = e(iVar, fVar);
            if (strArrE == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[strArrE.length + length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(strArrE, 0, strArr2, length, strArrE.length);
            return strArr2;
        }
        if (this.f7650h != null) {
            return d(iVar, fVar, strArr);
        }
        O1.u uVarD0 = fVar.D0();
        int length2 = strArr.length;
        Object[] objArrK = uVarD0.k(strArr, length2);
        while (true) {
            try {
                String strA0 = iVar.A0();
                if (strA0 == null) {
                    T1.k kVarS = iVar.s();
                    if (kVarS == T1.k.END_ARRAY) {
                        String[] strArr3 = (String[]) uVarD0.e(objArrK, length2, String.class);
                        fVar.M0(uVarD0);
                        return strArr3;
                    }
                    T1.k kVar = T1.k.VALUE_NULL;
                    p032f2.l lVar = this.i;
                    if (kVarS != kVar) {
                        strA0 = _parseString(iVar, fVar, lVar);
                    } else {
                        if (this.f7652k) {
                            return f7648l;
                        }
                        strA0 = (String) lVar.getNullValue(fVar);
                    }
                    throw JsonMappingException.i(e, objArrK, uVarD0.f4533a + length2);
                }
                if (length2 >= objArrK.length) {
                    objArrK = uVarD0.c(objArrK);
                    length2 = 0;
                }
                int i = length2 + 1;
                try {
                    objArrK[length2] = strA0;
                    length2 = i;
                } catch (Exception e6) {
                    e = e6;
                    length2 = i;
                }
            } catch (Exception e7) {
                e = e7;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        return dVar.c(iVar, fVar);
    }

    public final String[] e(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        p0 p0Var;
        T1.i iVar2;
        p015c2.f fVar2;
        String str_parseString;
        p026e2.b bVarE0;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = this.f7651j;
        if (bool2 != bool && (bool2 != null || !fVar.B0(p015c2.g.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (iVar.s0(T1.k.VALUE_STRING)) {
                return (String[]) _deserializeFromString(iVar, fVar);
            }
            fVar.s0(iVar, this._valueClass);
            throw null;
        }
        boolean zS0 = iVar.s0(T1.k.VALUE_NULL);
        p032f2.l lVar = this.i;
        if (zS0) {
            str_parseString = (String) lVar.getNullValue(fVar);
        } else {
            if (iVar.s0(T1.k.VALUE_STRING)) {
                String strI0 = iVar.i0();
                boolean zIsEmpty = strI0.isEmpty();
                p026e2.b bVar = p026e2.b.f8686h;
                p104t2.d dVar = p104t2.d.f12492h;
                if (zIsEmpty) {
                    p026e2.b bVarD0 = fVar.d0(dVar, handledType(), p026e2.d.f8695m);
                    if (bVarD0 != bVar) {
                        return (String[]) _deserializeFromEmptyString(iVar, fVar, bVarD0, handledType(), "empty String (\"\")");
                    }
                    p0Var = this;
                    iVar2 = iVar;
                    fVar2 = fVar;
                } else {
                    iVar2 = iVar;
                    fVar2 = fVar;
                    if (g0._isBlank(strI0) && (bVarE0 = fVar2.e0(dVar, handledType())) != bVar) {
                        return (String[]) _deserializeFromEmptyString(iVar2, fVar2, bVarE0, handledType(), "blank String (all whitespace)");
                    }
                    p0Var = this;
                }
            } else {
                p0Var = this;
                iVar2 = iVar;
                fVar2 = fVar;
            }
            str_parseString = p0Var._parseString(iVar2, fVar2, lVar);
        }
        return new String[]{str_parseString};
    }

    @Override // p015c2.j
    public final EnumC0962a getEmptyAccessPattern() {
        return EnumC0962a.i;
    }

    @Override // p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        return f7648l;
    }

    @Override // p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12492h;
    }

    @Override // p015c2.j
    public final Boolean supportsUpdate(C0474e c0474e) {
        return Boolean.TRUE;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws JsonMappingException {
        int i;
        if (!iVar.w0()) {
            return e(iVar, fVar);
        }
        if (this.f7650h != null) {
            return d(iVar, fVar, null);
        }
        O1.u uVarD0 = fVar.D0();
        Object[] objArrJ = uVarD0.j();
        int i3 = 0;
        while (true) {
            try {
                String strA0 = iVar.A0();
                try {
                    if (strA0 == null) {
                        T1.k kVarS = iVar.s();
                        if (kVarS == T1.k.END_ARRAY) {
                            String[] strArr = (String[]) uVarD0.e(objArrJ, i3, String.class);
                            fVar.M0(uVarD0);
                            return strArr;
                        }
                        T1.k kVar = T1.k.VALUE_NULL;
                        p032f2.l lVar = this.i;
                        if (kVarS == kVar) {
                            if (!this.f7652k) {
                                strA0 = (String) lVar.getNullValue(fVar);
                            }
                        } else {
                            strA0 = _parseString(iVar, fVar, lVar);
                        }
                    }
                    objArrJ[i3] = strA0;
                    i3 = i;
                } catch (Exception e6) {
                    e = e6;
                    i3 = i;
                    throw JsonMappingException.i(e, objArrJ, uVarD0.f4533a + i3);
                }
                if (i3 >= objArrJ.length) {
                    objArrJ = uVarD0.c(objArrJ);
                    i3 = 0;
                }
                i = i3 + 1;
            } catch (Exception e7) {
                e = e7;
            }
        }
    }
}
