package com.fasterxml.jackson.databind.deser.std;

import B.AbstractC0013g0;
import S1.EnumC0352n;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.util.ArrayList;
import java.util.Objects;
import p015c2.InterfaceC0472c;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0519o extends n0 implements p032f2.i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f7618n = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object[] f7619h;
    public final Enum i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p109u2.j f7620j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p109u2.j f7621k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f7622l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f7623m;

    public C0519o(p109u2.m mVar, Boolean bool) {
        super(mVar.f12703h);
        this.f7620j = mVar.b();
        this.f7619h = mVar.i;
        this.i = mVar.f12705k;
        this.f7622l = bool;
        this.f7623m = mVar.f12707m;
    }

    @Override // p032f2.i
    public final p015c2.j a(p015c2.f fVar, InterfaceC0472c interfaceC0472c) {
        Boolean boolFindFormatFeature = findFormatFeature(fVar, interfaceC0472c, handledType(), EnumC0352n.i);
        Boolean bool = this.f7622l;
        if (boolFindFormatFeature == null) {
            boolFindFormatFeature = bool;
        }
        return Objects.equals(bool, boolFindFormatFeature) ? this : new C0519o(this, boolFindFormatFeature);
    }

    public final Object d(p015c2.f fVar, String str) throws InvalidFormatException {
        p109u2.j jVarB;
        char cCharAt;
        Object obj;
        Object objA;
        if (fVar.B0(p015c2.g.READ_ENUMS_USING_TO_STRING)) {
            jVarB = this.f7621k;
            if (jVarB == null) {
                synchronized (this) {
                    jVarB = p109u2.m.c(fVar.f7249l, handledType()).b();
                }
                this.f7621k = jVarB;
            }
        } else {
            jVarB = this.f7620j;
        }
        Object objA2 = jVarB.a(str);
        if (objA2 != null) {
            return objA2;
        }
        String strTrim = str.trim();
        if (strTrim != str && (objA = jVarB.a(strTrim)) != null) {
            return objA;
        }
        String strTrim2 = strTrim.trim();
        boolean zIsEmpty = strTrim2.isEmpty();
        Enum r8 = this.i;
        if (zIsEmpty) {
            if (r8 != null && fVar.B0(p015c2.g.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return r8;
            }
            if (!fVar.B0(p015c2.g.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                int iOrdinal = (strTrim.isEmpty() ? _checkCoercionFail(fVar, _findCoercionFromEmptyString(fVar), handledType(), strTrim, "empty String (\"\")") : _checkCoercionFail(fVar, _findCoercionFromBlankString(fVar), handledType(), strTrim, "blank String (all whitespace)")).ordinal();
                if (iOrdinal == 1 || iOrdinal == 3) {
                    return r8;
                }
            }
            return null;
        }
        if (Boolean.TRUE.equals(this.f7622l)) {
            Object[] objArr = jVarB.f12702j;
            int length = objArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    obj = null;
                    break;
                }
                Object obj2 = objArr[i];
                if (obj2 != null && ((String) obj2).equalsIgnoreCase(strTrim2)) {
                    obj = objArr[i + 1];
                    break;
                }
                i += 2;
            }
            if (obj != null) {
                return obj;
            }
        } else if (!fVar.B0(p015c2.g.FAIL_ON_NUMBERS_FOR_ENUMS) && !this.f7623m && (cCharAt = strTrim2.charAt(0)) >= '0' && cCharAt <= '9') {
            try {
                int i3 = Integer.parseInt(strTrim2);
                if (!fVar.f7249l.k(p015c2.r.ALLOW_COERCION_OF_SCALARS)) {
                    fVar.w0(handledType(), strTrim2, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
                    throw null;
                }
                if (i3 >= 0) {
                    Object[] objArr2 = this.f7619h;
                    if (i3 < objArr2.length) {
                        return objArr2[i3];
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (r8 != null && fVar.B0(p015c2.g.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            return r8;
        }
        if (fVar.B0(p015c2.g.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
            return null;
        }
        Class<?> clsHandledType = handledType();
        Object[] objArr3 = jVarB.f12702j;
        int length2 = objArr3.length;
        ArrayList arrayList = new ArrayList(length2 >> 2);
        for (int i6 = 0; i6 < length2; i6 += 2) {
            Object obj3 = objArr3[i6];
            if (obj3 != null) {
                arrayList.add((String) obj3);
            }
        }
        fVar.w0(clsHandledType, strTrim2, "not one of the values accepted for Enum class: %s", arrayList);
        throw null;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        C0519o c0519o;
        p015c2.f fVar2;
        if (iVar.s0(T1.k.VALUE_STRING)) {
            return d(fVar, iVar.i0());
        }
        if (!iVar.s0(T1.k.VALUE_NUMBER_INT)) {
            if (iVar.x0()) {
                fVar.s0(iVar, this._valueClass);
                throw null;
            }
            if (iVar.s0(T1.k.START_ARRAY)) {
                return _deserializeFromArray(iVar, fVar);
            }
            fVar.s0(iVar, handledType());
            throw null;
        }
        if (this.f7623m) {
            return d(fVar, iVar.i0());
        }
        int iZ = iVar.Z();
        p026e2.b bVarD0 = fVar.d0(p104t2.d.f12499p, handledType(), p026e2.d.f8691h);
        if (bVarD0 != p026e2.b.f8686h) {
            c0519o = this;
            fVar2 = fVar;
        } else {
            if (fVar.B0(p015c2.g.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                fVar.v0(handledType(), Integer.valueOf(iZ), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
                throw null;
            }
            c0519o = this;
            fVar2 = fVar;
            c0519o._checkCoercionFail(fVar2, bVarD0, handledType(), Integer.valueOf(iZ), AbstractC0013g0.f(iZ, "Integer value (", ")"));
        }
        int iOrdinal = bVarD0.ordinal();
        if (iOrdinal != 2) {
            Enum r6 = c0519o.i;
            if (iOrdinal == 3) {
                return r6;
            }
            Object[] objArr = c0519o.f7619h;
            if (iZ >= 0 && iZ < objArr.length) {
                return objArr[iZ];
            }
            if (r6 != null && fVar2.B0(p015c2.g.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return r6;
            }
            if (!fVar2.B0(p015c2.g.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                fVar2.v0(c0519o.handledType(), Integer.valueOf(iZ), "index value outside legal index range [0..%s]", Integer.valueOf(objArr.length - 1));
                throw null;
            }
        }
        return null;
    }

    @Override // p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        return this.i;
    }

    @Override // p015c2.j
    public final boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12499p;
    }

    public C0519o(C0519o c0519o, Boolean bool) {
        super(c0519o);
        this.f7620j = c0519o.f7620j;
        this.f7619h = c0519o.f7619h;
        this.i = c0519o.i;
        this.f7622l = bool;
        this.f7623m = c0519o.f7623m;
    }
}
