package com.fasterxml.jackson.databind.deser.std;

import B.AbstractC0013g0;
import S1.C0355q;
import S1.EnumC0352n;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import java.io.Closeable;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import p015c2.InterfaceC0472c;
import p046i2.AbstractC0771g;
import p109u2.EnumC0962a;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 extends p015c2.j implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Class<?> _valueClass;
    protected final p015c2.h _valueType;
    protected static final int F_MASK_INT_COERCIONS = p015c2.g.USE_BIG_INTEGER_FOR_INTS.i | p015c2.g.USE_LONG_FOR_INTS.i;

    @Deprecated
    protected static final int F_MASK_ACCEPT_ARRAYS = p015c2.g.UNWRAP_SINGLE_VALUE_ARRAYS.i | p015c2.g.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.i;

    public g0(p015c2.h hVar) {
        this._valueClass = hVar == null ? Object.class : hVar.f7281k;
        this._valueType = hVar;
    }

    public static final boolean _isBlank(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) > ' ') {
                return false;
            }
        }
        return true;
    }

    public static final boolean _neitherNull(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public static final double _parseDouble(String str) {
        return _parseDouble(str, false);
    }

    public final boolean _byteOverflow(int i) {
        return i < -128 || i > 255;
    }

    public p026e2.b _checkBooleanToStringCoercion(T1.i iVar, p015c2.f fVar, Class<?> cls) {
        return _checkToStringCoercion(iVar, fVar, cls, Boolean.valueOf(iVar.G()), p026e2.d.f8692j);
    }

    public p026e2.b _checkCoercionFail(p015c2.f fVar, p026e2.b bVar, Class<?> cls, Object obj, String str) throws InvalidFormatException {
        if (bVar != p026e2.b.f8686h) {
            return bVar;
        }
        Object[] objArr = {str, _coercedTypeDesc()};
        fVar.getClass();
        throw new InvalidFormatException(fVar.f7252o, String.format("Cannot coerce %s to %s (but could if coercion was enabled using `CoercionConfig`)", objArr), obj);
    }

    public Double _checkDoubleSpecialValue(String str) {
        if (str.isEmpty()) {
            return null;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '-') {
            if (_isNegInf(str)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'I') {
            if (_isPosInf(str)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'N' && _isNaN(str)) {
            return Double.valueOf(Double.NaN);
        }
        return null;
    }

    public Float _checkFloatSpecialValue(String str) {
        if (str.isEmpty()) {
            return null;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '-') {
            if (_isNegInf(str)) {
                return Float.valueOf(Float.NEGATIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'I') {
            if (_isPosInf(str)) {
                return Float.valueOf(Float.POSITIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'N' && _isNaN(str)) {
            return Float.valueOf(Float.NaN);
        }
        return null;
    }

    public p026e2.b _checkFloatToIntCoercion(T1.i iVar, p015c2.f fVar, Class<?> cls) {
        p026e2.b bVarD0 = fVar.d0(p104t2.d.f12496m, cls, p026e2.d.i);
        if (bVarD0 != p026e2.b.f8686h) {
            return bVarD0;
        }
        return _checkCoercionFail(fVar, bVarD0, cls, iVar.c0(), "Floating-point value (" + iVar.i0() + ")");
    }

    public p026e2.b _checkFloatToStringCoercion(T1.i iVar, p015c2.f fVar, Class<?> cls) {
        return _checkToStringCoercion(iVar, fVar, cls, iVar.c0(), p026e2.d.i);
    }

    public p026e2.b _checkFromStringCoercion(p015c2.f fVar, String str) {
        return _checkFromStringCoercion(fVar, str, logicalType(), handledType());
    }

    public p026e2.b _checkIntToFloatCoercion(T1.i iVar, p015c2.f fVar, Class<?> cls) {
        p026e2.b bVarD0 = fVar.d0(p104t2.d.f12497n, cls, p026e2.d.f8691h);
        if (bVarD0 != p026e2.b.f8686h) {
            return bVarD0;
        }
        return _checkCoercionFail(fVar, bVarD0, cls, iVar.c0(), "Integer value (" + iVar.i0() + ")");
    }

    public p026e2.b _checkIntToStringCoercion(T1.i iVar, p015c2.f fVar, Class<?> cls) {
        return _checkToStringCoercion(iVar, fVar, cls, iVar.c0(), p026e2.d.f8691h);
    }

    public boolean _checkTextualNull(p015c2.f fVar, String str) throws MismatchedInputException {
        if (!_hasTextualNull(str)) {
            return false;
        }
        p015c2.r rVar = p015c2.r.ALLOW_COERCION_OF_SCALARS;
        if (!fVar.f7249l.k(rVar)) {
            _reportFailedNullCoerce(fVar, true, rVar, "String \"null\"");
        }
        return true;
    }

    public p026e2.b _checkToStringCoercion(T1.i iVar, p015c2.f fVar, Class<?> cls, Object obj, p026e2.d dVar) {
        p026e2.b bVarD0 = fVar.d0(p104t2.d.f12500q, cls, dVar);
        if (bVarD0 != p026e2.b.f8686h) {
            return bVarD0;
        }
        return _checkCoercionFail(fVar, bVarD0, cls, obj, dVar.name() + " value (" + iVar.i0() + ")");
    }

    public Boolean _coerceBooleanFromInt(T1.i iVar, p015c2.f fVar, Class<?> cls) throws InvalidFormatException {
        p026e2.b bVarD0 = fVar.d0(p104t2.d.f12498o, cls, p026e2.d.f8691h);
        int iOrdinal = bVarD0.ordinal();
        if (iOrdinal == 0) {
            _checkCoercionFail(fVar, bVarD0, cls, iVar.c0(), "Integer value (" + iVar.i0() + ")");
            return Boolean.FALSE;
        }
        if (iOrdinal == 2) {
            return null;
        }
        if (iOrdinal == 3) {
            return Boolean.FALSE;
        }
        if (iVar.b0() == T1.h.f5208h) {
            return Boolean.valueOf(iVar.Z() != 0);
        }
        return Boolean.valueOf(!"0".equals(iVar.i0()));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Deprecated
    public Object _coerceEmptyString(p015c2.f fVar, boolean z5) throws MismatchedInputException {
        boolean z6;
        Enum<?> r6;
        p015c2.r rVar = p015c2.r.ALLOW_COERCION_OF_SCALARS;
        if (fVar.f7249l.k(rVar)) {
            if (z5) {
                p015c2.g gVar = p015c2.g.FAIL_ON_NULL_FOR_PRIMITIVES;
                if (fVar.B0(gVar)) {
                    z6 = false;
                    r6 = gVar;
                }
            }
            return getNullValue(fVar);
        }
        z6 = true;
        r6 = rVar;
        _reportFailedNullCoerce(fVar, z6, r6, "empty String (\"\")");
        return null;
    }

    public Object _coerceIntegral(T1.i iVar, p015c2.f fVar) {
        if (fVar.B0(p015c2.g.USE_BIG_INTEGER_FOR_INTS)) {
            return iVar.C();
        }
        return fVar.B0(p015c2.g.USE_LONG_FOR_INTS) ? Long.valueOf(iVar.a0()) : iVar.c0();
    }

    @Deprecated
    public Object _coerceNullToken(p015c2.f fVar, boolean z5) throws MismatchedInputException {
        if (z5) {
            _verifyNullForPrimitive(fVar);
        }
        return getNullValue(fVar);
    }

    @Deprecated
    public Object _coerceTextualNull(p015c2.f fVar, boolean z5) throws MismatchedInputException {
        p015c2.r rVar = p015c2.r.ALLOW_COERCION_OF_SCALARS;
        if (!fVar.f7249l.k(rVar)) {
            _reportFailedNullCoerce(fVar, true, rVar, "String \"null\"");
        }
        return getNullValue(fVar);
    }

    public String _coercedTypeDesc() {
        String strM;
        p015c2.h valueType = getValueType();
        boolean z5 = true;
        if (valueType == null || valueType.f7281k.isPrimitive()) {
            Class<?> clsHandledType = handledType();
            if (!clsHandledType.isArray() && !Collection.class.isAssignableFrom(clsHandledType) && !Map.class.isAssignableFrom(clsHandledType)) {
                z5 = false;
            }
            strM = p109u2.i.m(clsHandledType);
        } else {
            if (!valueType.k0() && !valueType.D()) {
                z5 = false;
            }
            strM = p109u2.i.r(valueType);
        }
        if (z5) {
            return "element of " + strM;
        }
        return strM + " value";
    }

    public Object _deserializeFromArray(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        p026e2.b bVar_findCoercionFromEmptyArray = _findCoercionFromEmptyArray(fVar);
        boolean zB0 = fVar.B0(p015c2.g.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zB0 || bVar_findCoercionFromEmptyArray != p026e2.b.f8686h) {
            T1.k kVarB0 = iVar.B0();
            T1.k kVar = T1.k.END_ARRAY;
            if (kVarB0 == kVar) {
                int iOrdinal = bVar_findCoercionFromEmptyArray.ordinal();
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return getNullValue(fVar);
                }
                if (iOrdinal == 3) {
                    return getEmptyValue(fVar);
                }
            } else if (zB0) {
                Object obj_deserializeWrappedValue = _deserializeWrappedValue(iVar, fVar);
                if (iVar.B0() != kVar) {
                    handleMissingEndArrayForSingle(iVar, fVar);
                }
                return obj_deserializeWrappedValue;
            }
        }
        fVar.t0(getValueType(fVar), T1.k.START_ARRAY, iVar, null, new Object[0]);
        throw null;
    }

    @Deprecated
    public Object _deserializeFromEmpty(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        if (!iVar.s0(T1.k.START_ARRAY) || !fVar.B0(p015c2.g.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
            fVar.r0(iVar, getValueType(fVar));
            throw null;
        }
        if (iVar.B0() == T1.k.END_ARRAY) {
            return null;
        }
        fVar.r0(iVar, getValueType(fVar));
        throw null;
    }

    public Object _deserializeFromEmptyString(T1.i iVar, p015c2.f fVar, p026e2.b bVar, Class<?> cls, String str) throws InvalidFormatException {
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            _checkCoercionFail(fVar, bVar, cls, "", "empty String (\"\")");
            return null;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return getEmptyValue(fVar);
    }

    public Object _deserializeFromString(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        p032f2.t valueInstantiator = getValueInstantiator();
        Class<?> clsHandledType = handledType();
        String strQ0 = iVar.q0();
        if (valueInstantiator != null && valueInstantiator.h()) {
            return valueInstantiator.t(fVar, strQ0);
        }
        if (strQ0.isEmpty()) {
            return _deserializeFromEmptyString(iVar, fVar, fVar.d0(logicalType(), clsHandledType, p026e2.d.f8695m), clsHandledType, "empty String (\"\")");
        }
        String strTrim = strQ0;
        if (_isBlank(strTrim)) {
            return _deserializeFromEmptyString(iVar, fVar, fVar.e0(logicalType(), clsHandledType), clsHandledType, "blank String (all whitespace)");
        }
        if (valueInstantiator != null) {
            strTrim = strTrim.trim();
            boolean zE = valueInstantiator.e();
            p104t2.d dVar = p104t2.d.f12496m;
            p026e2.b bVar = p026e2.b.i;
            p026e2.d dVar2 = p026e2.d.f8693k;
            if (zE && fVar.d0(dVar, Integer.class, dVar2) == bVar) {
                return valueInstantiator.q(fVar, _parseIntPrimitive(fVar, strTrim));
            }
            if (valueInstantiator.f() && fVar.d0(dVar, Long.class, dVar2) == bVar) {
                return valueInstantiator.r(fVar, _parseLongPrimitive(fVar, strTrim));
            }
            if (valueInstantiator.c() && fVar.d0(p104t2.d.f12498o, Boolean.class, dVar2) == bVar) {
                String strTrim2 = strTrim.trim();
                if ("true".equals(strTrim2)) {
                    return valueInstantiator.o(fVar, true);
                }
                if ("false".equals(strTrim2)) {
                    return valueInstantiator.o(fVar, false);
                }
            }
        }
        String str = strTrim;
        U1.c cVar = fVar.f7252o;
        fVar.o0(clsHandledType, valueInstantiator, "no String-argument constructor/factory method to deserialize from String value ('%s')", str);
        throw null;
    }

    public Object _deserializeWrappedValue(T1.i iVar, p015c2.f fVar) {
        return iVar.s0(T1.k.START_ARRAY) ? handleNestedArrayForSingle(iVar, fVar) : deserialize(iVar, fVar);
    }

    @Deprecated
    public void _failDoubleToIntCoercion(T1.i iVar, p015c2.f fVar, String str) throws MismatchedInputException {
        handledType();
        Object[] objArr = {iVar.q0(), str};
        fVar.getClass();
        throw new MismatchedInputException((Closeable) fVar.f7252o, String.format("Cannot coerce a floating-point value ('%s') into %s (enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow)", objArr));
    }

    public p026e2.b _findCoercionFromBlankString(p015c2.f fVar) {
        return fVar.e0(logicalType(), handledType());
    }

    public p026e2.b _findCoercionFromEmptyArray(p015c2.f fVar) {
        return fVar.d0(logicalType(), handledType(), p026e2.d.f8694l);
    }

    public p026e2.b _findCoercionFromEmptyString(p015c2.f fVar) {
        return fVar.d0(logicalType(), handledType(), p026e2.d.f8695m);
    }

    public final p032f2.l _findNullProvider(p015c2.f fVar, InterfaceC0472c interfaceC0472c, S1.b0 b0Var, p015c2.j jVar) throws InvalidDefinitionException {
        if (b0Var == S1.b0.i) {
            if (interfaceC0472c == null) {
                return new p037g2.q((p015c2.A) null, fVar.b0(jVar == null ? Object.class : jVar.handledType()));
            }
            return new p037g2.q(interfaceC0472c.a(), interfaceC0472c.getType());
        }
        if (b0Var == S1.b0.f4929j) {
            if (jVar != null) {
                if (jVar instanceof p032f2.e) {
                    p032f2.e eVar = (p032f2.e) jVar;
                    if (!eVar.f8884j.j()) {
                        fVar.O(String.format("Cannot create empty instance of %s, no default Creator", interfaceC0472c == null ? eVar.f8883h : interfaceC0472c.getType()));
                        throw null;
                    }
                }
                EnumC0962a emptyAccessPattern = jVar.getEmptyAccessPattern();
                EnumC0962a enumC0962a = EnumC0962a.f12677h;
                p037g2.q qVar = p037g2.q.f9156k;
                if (emptyAccessPattern != enumC0962a) {
                    if (emptyAccessPattern != EnumC0962a.i) {
                        return new p037g2.q(1, jVar);
                    }
                    Object emptyValue = jVar.getEmptyValue(fVar);
                    if (emptyValue != null) {
                        return new p037g2.q(0, emptyValue);
                    }
                }
                return qVar;
            }
        } else if (b0Var == S1.b0.f4928h) {
            return p037g2.q.f9155j;
        }
        return null;
    }

    public boolean _hasTextualNull(String str) {
        return "null".equals(str);
    }

    public final boolean _intOverflow(long j4) {
        return j4 < -2147483648L || j4 > 2147483647L;
    }

    @Deprecated
    public boolean _isEmptyOrTextualNull(String str) {
        return str.isEmpty() || "null".equals(str);
    }

    public boolean _isFalse(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'f') {
            return "false".equals(str);
        }
        if (cCharAt == 'F') {
            return "FALSE".equals(str) || "False".equals(str);
        }
        return false;
    }

    public final boolean _isIntNumber(String str) {
        int i;
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != '-' && cCharAt != '+') {
            i = 0;
        } else {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        while (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return false;
            }
            i++;
        }
        return true;
    }

    public final boolean _isNaN(String str) {
        return "NaN".equals(str);
    }

    public final boolean _isNegInf(String str) {
        return "-Infinity".equals(str) || "-INF".equals(str);
    }

    public final boolean _isPosInf(String str) {
        return "Infinity".equals(str) || "INF".equals(str);
    }

    public boolean _isTrue(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 't') {
            return "true".equals(str);
        }
        if (cCharAt == 'T') {
            return "TRUE".equals(str) || "True".equals(str);
        }
        return false;
    }

    public Number _nonNullNumber(Number number) {
        if (number == null) {
            return 0;
        }
        return number;
    }

    public final Boolean _parseBoolean(T1.i iVar, p015c2.f fVar, Class<?> cls) throws MismatchedInputException {
        int iV = iVar.v();
        if (iV == 1) {
            fVar.s0(iVar, cls);
            throw null;
        }
        if (iV == 3) {
            return (Boolean) _deserializeFromArray(iVar, fVar);
        }
        if (iV == 6) {
            String strI0 = iVar.i0();
            p026e2.b bVar_checkFromStringCoercion = _checkFromStringCoercion(fVar, strI0, p104t2.d.f12498o, cls);
            if (bVar_checkFromStringCoercion != p026e2.b.f8687j) {
                if (bVar_checkFromStringCoercion == p026e2.b.f8688k) {
                    return Boolean.FALSE;
                }
                String strTrim = strI0.trim();
                int length = strTrim.length();
                if (length == 4) {
                    if (_isTrue(strTrim)) {
                        return Boolean.TRUE;
                    }
                } else if (length == 5 && _isFalse(strTrim)) {
                    return Boolean.FALSE;
                }
                if (!_checkTextualNull(fVar, strTrim)) {
                    fVar.w0(cls, strTrim, "only \"true\" or \"false\" recognized", new Object[0]);
                    throw null;
                }
            }
        } else {
            if (iV == 7) {
                return _coerceBooleanFromInt(iVar, fVar, cls);
            }
            switch (iV) {
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    break;
                default:
                    fVar.s0(iVar, cls);
                    throw null;
            }
        }
        return null;
    }

    @Deprecated
    public boolean _parseBooleanFromInt(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        _verifyNumberForScalarCoercion(fVar, iVar);
        return !"0".equals(iVar.i0());
    }

    @Deprecated
    public final boolean _parseBooleanPrimitive(p015c2.f fVar, T1.i iVar, Class<?> cls) {
        return _parseBooleanPrimitive(iVar, fVar);
    }

    public final byte _parseBytePrimitive(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        int iV = iVar.v();
        Class cls = Byte.TYPE;
        if (iV == 1) {
            fVar.s0(iVar, cls);
            throw null;
        }
        if (iV != 3) {
            if (iV == 11) {
                _verifyNullForPrimitive(fVar);
                return (byte) 0;
            }
            p026e2.b bVar = p026e2.b.f8688k;
            p026e2.b bVar2 = p026e2.b.f8687j;
            if (iV == 6) {
                String strI0 = iVar.i0();
                p026e2.b bVar_checkFromStringCoercion = _checkFromStringCoercion(fVar, strI0, p104t2.d.f12496m, cls);
                if (bVar_checkFromStringCoercion == bVar2) {
                    _verifyNullForPrimitive(fVar);
                    return (byte) 0;
                }
                if (bVar_checkFromStringCoercion != bVar) {
                    String strTrim = strI0.trim();
                    if (_hasTextualNull(strTrim)) {
                        _verifyNullForPrimitiveCoercion(fVar, strTrim);
                        return (byte) 0;
                    }
                    try {
                        int iE = V1.e.e(strTrim);
                        if (!_byteOverflow(iE)) {
                            return (byte) iE;
                        }
                        fVar.w0(this._valueClass, strTrim, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                        throw null;
                    } catch (IllegalArgumentException unused) {
                        fVar.w0(this._valueClass, strTrim, "not a valid `byte` value", new Object[0]);
                        throw null;
                    }
                }
            } else {
                if (iV == 7) {
                    return iVar.J();
                }
                if (iV == 8) {
                    p026e2.b bVar_checkFloatToIntCoercion = _checkFloatToIntCoercion(iVar, fVar, cls);
                    if (bVar_checkFloatToIntCoercion != bVar2 && bVar_checkFloatToIntCoercion != bVar) {
                        return iVar.J();
                    }
                }
            }
            return (byte) 0;
        }
        if (fVar.B0(p015c2.g.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            if (iVar.B0() == T1.k.START_ARRAY) {
                return ((Byte) handleNestedArrayForSingle(iVar, fVar)).byteValue();
            }
            byte b_parseBytePrimitive = _parseBytePrimitive(iVar, fVar);
            _verifyEndArrayForSingle(iVar, fVar);
            return b_parseBytePrimitive;
        }
        fVar.r0(iVar, fVar.b0(cls));
        throw null;
    }

    public Date _parseDate(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        int iV = iVar.v();
        if (iV == 1) {
            fVar.s0(iVar, this._valueClass);
            throw null;
        }
        if (iV == 3) {
            return _parseDateFromArray(iVar, fVar);
        }
        if (iV == 11) {
            return (Date) getNullValue(fVar);
        }
        if (iV == 6) {
            return _parseDate(iVar.i0().trim(), fVar);
        }
        if (iV != 7) {
            fVar.s0(iVar, this._valueClass);
            throw null;
        }
        try {
            return new Date(iVar.a0());
        } catch (StreamReadException unused) {
            fVar.v0(this._valueClass, iVar.c0(), "not a valid 64-bit `long` for creating `java.util.Date`", new Object[0]);
            throw null;
        }
    }

    public Date _parseDateFromArray(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        p026e2.b bVar_findCoercionFromEmptyArray = _findCoercionFromEmptyArray(fVar);
        boolean zB0 = fVar.B0(p015c2.g.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zB0 || bVar_findCoercionFromEmptyArray != p026e2.b.f8686h) {
            T1.k kVarB0 = iVar.B0();
            if (kVarB0 == T1.k.END_ARRAY) {
                int iOrdinal = bVar_findCoercionFromEmptyArray.ordinal();
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return (Date) getNullValue(fVar);
                }
                if (iOrdinal == 3) {
                    return (Date) getEmptyValue(fVar);
                }
            } else if (zB0) {
                if (kVarB0 == T1.k.START_ARRAY) {
                    return (Date) handleNestedArrayForSingle(iVar, fVar);
                }
                Date date_parseDate = _parseDate(iVar, fVar);
                _verifyEndArrayForSingle(iVar, fVar);
                return date_parseDate;
            }
        }
        fVar.t0(fVar.b0(this._valueClass), T1.k.START_ARRAY, iVar, null, new Object[0]);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r0 == 8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (r8 == r2) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double _parseDoublePrimitive(T1.i r9, p015c2.f r10) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r8 = this;
            int r0 = r9.v()
            r1 = 0
            r2 = 1
            java.lang.Class r3 = java.lang.Double.TYPE
            if (r0 == r2) goto L8d
            r2 = 3
            if (r0 == r2) goto L66
            r2 = 11
            r4 = 0
            if (r0 == r2) goto L62
            e2.b r2 = p026e2.b.f8688k
            e2.b r6 = p026e2.b.f8687j
            r7 = 6
            if (r0 == r7) goto L31
            r7 = 7
            if (r0 == r7) goto L22
            r8 = 8
            if (r0 != r8) goto L89
            goto L2c
        L22:
            e2.b r8 = r8._checkIntToFloatCoercion(r9, r10, r3)
            if (r8 != r6) goto L29
            goto L4e
        L29:
            if (r8 != r2) goto L2c
            goto L4e
        L2c:
            double r8 = r9.V()
            return r8
        L31:
            java.lang.String r0 = r9.i0()
            java.lang.Double r1 = r8._checkDoubleSpecialValue(r0)
            if (r1 == 0) goto L40
            double r8 = r1.doubleValue()
            return r8
        L40:
            t2.d r1 = p104t2.d.f12496m
            e2.b r1 = r8._checkFromStringCoercion(r10, r0, r1, r3)
            if (r1 != r6) goto L4c
            r8._verifyNullForPrimitive(r10)
            return r4
        L4c:
            if (r1 != r2) goto L4f
        L4e:
            return r4
        L4f:
            java.lang.String r0 = r0.trim()
            boolean r1 = r8._hasTextualNull(r0)
            if (r1 == 0) goto L5d
            r8._verifyNullForPrimitiveCoercion(r10, r0)
            return r4
        L5d:
            double r8 = r8._parseDoublePrimitive(r9, r10, r0)
            return r8
        L62:
            r8._verifyNullForPrimitive(r10)
            return r4
        L66:
            c2.g r0 = p015c2.g.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r0 = r10.B0(r0)
            if (r0 == 0) goto L89
            T1.k r0 = r9.B0()
            T1.k r1 = T1.k.START_ARRAY
            if (r0 != r1) goto L81
            java.lang.Object r8 = r8.handleNestedArrayForSingle(r9, r10)
            java.lang.Double r8 = (java.lang.Double) r8
            double r8 = r8.doubleValue()
            return r8
        L81:
            double r0 = r8._parseDoublePrimitive(r9, r10)
            r8._verifyEndArrayForSingle(r9, r10)
            return r0
        L89:
            r10.s0(r9, r3)
            throw r1
        L8d:
            r10.s0(r9, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.g0._parseDoublePrimitive(T1.i, c2.f):double");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r0 == 8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r7 == r2) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float _parseFloatPrimitive(T1.i r8, p015c2.f r9) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r7 = this;
            int r0 = r8.v()
            r1 = 0
            r2 = 1
            java.lang.Class r3 = java.lang.Float.TYPE
            if (r0 == r2) goto L8c
            r2 = 3
            if (r0 == r2) goto L65
            r2 = 11
            r4 = 0
            if (r0 == r2) goto L61
            e2.b r2 = p026e2.b.f8688k
            e2.b r5 = p026e2.b.f8687j
            r6 = 6
            if (r0 == r6) goto L30
            r6 = 7
            if (r0 == r6) goto L21
            r7 = 8
            if (r0 != r7) goto L88
            goto L2b
        L21:
            e2.b r7 = r7._checkIntToFloatCoercion(r8, r9, r3)
            if (r7 != r5) goto L28
            goto L4d
        L28:
            if (r7 != r2) goto L2b
            goto L4d
        L2b:
            float r7 = r8.Y()
            return r7
        L30:
            java.lang.String r0 = r8.i0()
            java.lang.Float r1 = r7._checkFloatSpecialValue(r0)
            if (r1 == 0) goto L3f
            float r7 = r1.floatValue()
            return r7
        L3f:
            t2.d r1 = p104t2.d.f12496m
            e2.b r1 = r7._checkFromStringCoercion(r9, r0, r1, r3)
            if (r1 != r5) goto L4b
            r7._verifyNullForPrimitive(r9)
            return r4
        L4b:
            if (r1 != r2) goto L4e
        L4d:
            return r4
        L4e:
            java.lang.String r0 = r0.trim()
            boolean r1 = r7._hasTextualNull(r0)
            if (r1 == 0) goto L5c
            r7._verifyNullForPrimitiveCoercion(r9, r0)
            return r4
        L5c:
            float r7 = r7._parseFloatPrimitive(r8, r9, r0)
            return r7
        L61:
            r7._verifyNullForPrimitive(r9)
            return r4
        L65:
            c2.g r0 = p015c2.g.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r0 = r9.B0(r0)
            if (r0 == 0) goto L88
            T1.k r0 = r8.B0()
            T1.k r1 = T1.k.START_ARRAY
            if (r0 != r1) goto L80
            java.lang.Object r7 = r7.handleNestedArrayForSingle(r8, r9)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            return r7
        L80:
            float r0 = r7._parseFloatPrimitive(r8, r9)
            r7._verifyEndArrayForSingle(r8, r9)
            return r0
        L88:
            r9.s0(r8, r3)
            throw r1
        L8c:
            r9.s0(r8, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.g0._parseFloatPrimitive(T1.i, c2.f):float");
    }

    public final int _parseIntPrimitive(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        int iV = iVar.v();
        Class cls = Integer.TYPE;
        if (iV == 1) {
            fVar.s0(iVar, cls);
            throw null;
        }
        if (iV != 3) {
            if (iV == 11) {
                _verifyNullForPrimitive(fVar);
                return 0;
            }
            p026e2.b bVar = p026e2.b.f8688k;
            p026e2.b bVar2 = p026e2.b.f8687j;
            if (iV == 6) {
                String strI0 = iVar.i0();
                p026e2.b bVar_checkFromStringCoercion = _checkFromStringCoercion(fVar, strI0, p104t2.d.f12496m, cls);
                if (bVar_checkFromStringCoercion == bVar2) {
                    _verifyNullForPrimitive(fVar);
                    return 0;
                }
                if (bVar_checkFromStringCoercion != bVar) {
                    String strTrim = strI0.trim();
                    if (!_hasTextualNull(strTrim)) {
                        return _parseIntPrimitive(fVar, strTrim);
                    }
                    _verifyNullForPrimitiveCoercion(fVar, strTrim);
                    return 0;
                }
            } else {
                if (iV == 7) {
                    return iVar.Z();
                }
                if (iV == 8) {
                    p026e2.b bVar_checkFloatToIntCoercion = _checkFloatToIntCoercion(iVar, fVar, cls);
                    if (bVar_checkFloatToIntCoercion != bVar2 && bVar_checkFloatToIntCoercion != bVar) {
                        return iVar.o0();
                    }
                }
            }
            return 0;
        }
        if (fVar.B0(p015c2.g.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            if (iVar.B0() == T1.k.START_ARRAY) {
                return ((Integer) handleNestedArrayForSingle(iVar, fVar)).intValue();
            }
            int i_parseIntPrimitive = _parseIntPrimitive(iVar, fVar);
            _verifyEndArrayForSingle(iVar, fVar);
            return i_parseIntPrimitive;
        }
        fVar.s0(iVar, cls);
        throw null;
    }

    public final Integer _parseInteger(T1.i iVar, p015c2.f fVar, Class<?> cls) throws MismatchedInputException {
        int iV = iVar.v();
        if (iV == 1) {
            fVar.s0(iVar, cls);
            throw null;
        }
        if (iV == 3) {
            return (Integer) _deserializeFromArray(iVar, fVar);
        }
        if (iV == 11) {
            return (Integer) getNullValue(fVar);
        }
        p026e2.b bVar = p026e2.b.f8688k;
        p026e2.b bVar2 = p026e2.b.f8687j;
        if (iV == 6) {
            String strI0 = iVar.i0();
            p026e2.b bVar_checkFromStringCoercion = _checkFromStringCoercion(fVar, strI0);
            if (bVar_checkFromStringCoercion == bVar2) {
                return (Integer) getNullValue(fVar);
            }
            if (bVar_checkFromStringCoercion == bVar) {
                return (Integer) getEmptyValue(fVar);
            }
            String strTrim = strI0.trim();
            return _checkTextualNull(fVar, strTrim) ? (Integer) getNullValue(fVar) : _parseInteger(fVar, strTrim);
        }
        if (iV == 7) {
            return Integer.valueOf(iVar.Z());
        }
        if (iV != 8) {
            fVar.r0(iVar, getValueType(fVar));
            throw null;
        }
        p026e2.b bVar_checkFloatToIntCoercion = _checkFloatToIntCoercion(iVar, fVar, cls);
        if (bVar_checkFloatToIntCoercion == bVar2) {
            return (Integer) getNullValue(fVar);
        }
        return bVar_checkFloatToIntCoercion == bVar ? (Integer) getEmptyValue(fVar) : Integer.valueOf(iVar.o0());
    }

    public final Long _parseLong(T1.i iVar, p015c2.f fVar, Class<?> cls) throws MismatchedInputException {
        int iV = iVar.v();
        if (iV == 1) {
            fVar.s0(iVar, cls);
            throw null;
        }
        if (iV == 3) {
            return (Long) _deserializeFromArray(iVar, fVar);
        }
        if (iV == 11) {
            return (Long) getNullValue(fVar);
        }
        p026e2.b bVar = p026e2.b.f8688k;
        p026e2.b bVar2 = p026e2.b.f8687j;
        if (iV == 6) {
            String strI0 = iVar.i0();
            p026e2.b bVar_checkFromStringCoercion = _checkFromStringCoercion(fVar, strI0);
            if (bVar_checkFromStringCoercion == bVar2) {
                return (Long) getNullValue(fVar);
            }
            if (bVar_checkFromStringCoercion == bVar) {
                return (Long) getEmptyValue(fVar);
            }
            String strTrim = strI0.trim();
            return _checkTextualNull(fVar, strTrim) ? (Long) getNullValue(fVar) : _parseLong(fVar, strTrim);
        }
        if (iV == 7) {
            return Long.valueOf(iVar.a0());
        }
        if (iV != 8) {
            fVar.r0(iVar, getValueType(fVar));
            throw null;
        }
        p026e2.b bVar_checkFloatToIntCoercion = _checkFloatToIntCoercion(iVar, fVar, cls);
        if (bVar_checkFloatToIntCoercion == bVar2) {
            return (Long) getNullValue(fVar);
        }
        return bVar_checkFloatToIntCoercion == bVar ? (Long) getEmptyValue(fVar) : Long.valueOf(iVar.p0());
    }

    public final long _parseLongPrimitive(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        int iV = iVar.v();
        Class cls = Long.TYPE;
        if (iV == 1) {
            fVar.s0(iVar, cls);
            throw null;
        }
        if (iV != 3) {
            if (iV == 11) {
                _verifyNullForPrimitive(fVar);
                return 0L;
            }
            p026e2.b bVar = p026e2.b.f8688k;
            p026e2.b bVar2 = p026e2.b.f8687j;
            if (iV == 6) {
                String strI0 = iVar.i0();
                p026e2.b bVar_checkFromStringCoercion = _checkFromStringCoercion(fVar, strI0, p104t2.d.f12496m, cls);
                if (bVar_checkFromStringCoercion == bVar2) {
                    _verifyNullForPrimitive(fVar);
                    return 0L;
                }
                if (bVar_checkFromStringCoercion != bVar) {
                    String strTrim = strI0.trim();
                    if (!_hasTextualNull(strTrim)) {
                        return _parseLongPrimitive(fVar, strTrim);
                    }
                    _verifyNullForPrimitiveCoercion(fVar, strTrim);
                    return 0L;
                }
            } else {
                if (iV == 7) {
                    return iVar.a0();
                }
                if (iV == 8) {
                    p026e2.b bVar_checkFloatToIntCoercion = _checkFloatToIntCoercion(iVar, fVar, cls);
                    if (bVar_checkFloatToIntCoercion != bVar2 && bVar_checkFloatToIntCoercion != bVar) {
                        return iVar.p0();
                    }
                }
            }
            return 0L;
        }
        if (fVar.B0(p015c2.g.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            if (iVar.B0() == T1.k.START_ARRAY) {
                return ((Long) handleNestedArrayForSingle(iVar, fVar)).longValue();
            }
            long j_parseLongPrimitive = _parseLongPrimitive(iVar, fVar);
            _verifyEndArrayForSingle(iVar, fVar);
            return j_parseLongPrimitive;
        }
        fVar.s0(iVar, cls);
        throw null;
    }

    public final short _parseShortPrimitive(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        int iV = iVar.v();
        Class cls = Short.TYPE;
        if (iV == 1) {
            fVar.s0(iVar, cls);
            throw null;
        }
        if (iV != 3) {
            if (iV == 11) {
                _verifyNullForPrimitive(fVar);
                return (short) 0;
            }
            p026e2.b bVar = p026e2.b.f8688k;
            p026e2.b bVar2 = p026e2.b.f8687j;
            if (iV == 6) {
                String strI0 = iVar.i0();
                p026e2.b bVar_checkFromStringCoercion = _checkFromStringCoercion(fVar, strI0, p104t2.d.f12496m, cls);
                if (bVar_checkFromStringCoercion == bVar2) {
                    _verifyNullForPrimitive(fVar);
                    return (short) 0;
                }
                if (bVar_checkFromStringCoercion != bVar) {
                    String strTrim = strI0.trim();
                    if (_hasTextualNull(strTrim)) {
                        _verifyNullForPrimitiveCoercion(fVar, strTrim);
                        return (short) 0;
                    }
                    try {
                        int iE = V1.e.e(strTrim);
                        if (!_shortOverflow(iE)) {
                            return (short) iE;
                        }
                        fVar.w0(cls, strTrim, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                        throw null;
                    } catch (IllegalArgumentException unused) {
                        fVar.w0(cls, strTrim, "not a valid `short` value", new Object[0]);
                        throw null;
                    }
                }
            } else {
                if (iV == 7) {
                    return iVar.h0();
                }
                if (iV == 8) {
                    p026e2.b bVar_checkFloatToIntCoercion = _checkFloatToIntCoercion(iVar, fVar, cls);
                    if (bVar_checkFloatToIntCoercion != bVar2 && bVar_checkFloatToIntCoercion != bVar) {
                        return iVar.h0();
                    }
                }
            }
            return (short) 0;
        }
        if (fVar.B0(p015c2.g.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            if (iVar.B0() == T1.k.START_ARRAY) {
                return ((Short) handleNestedArrayForSingle(iVar, fVar)).shortValue();
            }
            short s_parseShortPrimitive = _parseShortPrimitive(iVar, fVar);
            _verifyEndArrayForSingle(iVar, fVar);
            return s_parseShortPrimitive;
        }
        fVar.r0(iVar, fVar.b0(cls));
        throw null;
    }

    @Deprecated
    public final String _parseString(T1.i iVar, p015c2.f fVar) {
        return _parseString(iVar, fVar, p037g2.q.f9156k);
    }

    public void _reportFailedNullCoerce(p015c2.f fVar, boolean z5, Enum<?> r6, String str) throws MismatchedInputException {
        fVar.J0(this, "Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)", str, _coercedTypeDesc(), z5 ? "enable" : "disable", r6.getDeclaringClass().getSimpleName(), r6.name());
        throw null;
    }

    public final boolean _shortOverflow(int i) {
        return i < -32768 || i > 32767;
    }

    public void _verifyEndArrayForSingle(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        if (iVar.B0() != T1.k.END_ARRAY) {
            handleMissingEndArrayForSingle(iVar, fVar);
        }
    }

    public final void _verifyNullForPrimitive(p015c2.f fVar) throws MismatchedInputException {
        if (fVar.B0(p015c2.g.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            fVar.J0(this, "Cannot coerce `null` to %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", _coercedTypeDesc());
            throw null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void _verifyNullForPrimitiveCoercion(p015c2.f fVar, String str) throws MismatchedInputException {
        boolean z5;
        Enum<?> r6;
        p015c2.r rVar = p015c2.r.ALLOW_COERCION_OF_SCALARS;
        if (fVar.f7249l.k(rVar)) {
            p015c2.g gVar = p015c2.g.FAIL_ON_NULL_FOR_PRIMITIVES;
            if (!fVar.B0(gVar)) {
                return;
            }
            z5 = false;
            r6 = gVar;
        } else {
            z5 = true;
            r6 = rVar;
        }
        _reportFailedNullCoerce(fVar, z5, r6, str.isEmpty() ? "empty String (\"\")" : AbstractC0013g0.i("String \"", str, "\""));
    }

    @Deprecated
    public final void _verifyNullForScalarCoercion(p015c2.f fVar, String str) throws MismatchedInputException {
        p015c2.r rVar = p015c2.r.ALLOW_COERCION_OF_SCALARS;
        if (fVar.f7249l.k(rVar)) {
            return;
        }
        _reportFailedNullCoerce(fVar, true, rVar, str.isEmpty() ? "empty String (\"\")" : AbstractC0013g0.i("String \"", str, "\""));
    }

    @Deprecated
    public void _verifyNumberForScalarCoercion(p015c2.f fVar, T1.i iVar) throws MismatchedInputException {
        p015c2.r rVar = p015c2.r.ALLOW_COERCION_OF_SCALARS;
        if (fVar.f7249l.k(rVar)) {
            return;
        }
        fVar.J0(this, "Cannot coerce Number (%s) to %s (enable `%s.%s` to allow)", iVar.i0(), _coercedTypeDesc(), rVar.getDeclaringClass().getSimpleName(), "ALLOW_COERCION_OF_SCALARS");
        throw null;
    }

    @Deprecated
    public void _verifyStringForScalarCoercion(p015c2.f fVar, String str) throws MismatchedInputException {
        p015c2.r rVar = p015c2.r.ALLOW_COERCION_OF_SCALARS;
        if (fVar.f7249l.k(rVar)) {
            return;
        }
        fVar.J0(this, "Cannot coerce String \"%s\" to %s (enable `%s.%s` to allow)", str, _coercedTypeDesc(), rVar.getDeclaringClass().getSimpleName(), "ALLOW_COERCION_OF_SCALARS");
        throw null;
    }

    @Override // p015c2.j
    public Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        return dVar.b(iVar, fVar);
    }

    public p032f2.l findContentNullProvider(p015c2.f fVar, InterfaceC0472c interfaceC0472c, p015c2.j jVar) throws InvalidDefinitionException {
        S1.b0 b0VarFindContentNullStyle = findContentNullStyle(fVar, interfaceC0472c);
        if (b0VarFindContentNullStyle == S1.b0.f4928h) {
            return p037g2.q.f9155j;
        }
        if (b0VarFindContentNullStyle != S1.b0.i) {
            p032f2.l lVar_findNullProvider = _findNullProvider(fVar, interfaceC0472c, b0VarFindContentNullStyle, jVar);
            return lVar_findNullProvider != null ? lVar_findNullProvider : jVar;
        }
        if (interfaceC0472c != null) {
            return new p037g2.q(interfaceC0472c.a(), interfaceC0472c.getType().Y());
        }
        p015c2.h hVarB0 = fVar.b0(jVar.handledType());
        if (hVarB0.k0()) {
            hVarB0 = hVarB0.Y();
        }
        return new p037g2.q((p015c2.A) null, hVarB0);
    }

    public S1.b0 findContentNullStyle(p015c2.f fVar, InterfaceC0472c interfaceC0472c) {
        if (interfaceC0472c != null) {
            return interfaceC0472c.c().f7345n;
        }
        fVar.f7249l.f8724n.getClass();
        return S1.b0.f4930k;
    }

    public p015c2.j findConvertingContentDeserializer(p015c2.f fVar, InterfaceC0472c interfaceC0472c, p015c2.j jVar) {
        AbstractC0771g abstractC0771gE;
        Object objH;
        p015c2.B bD = fVar.f7249l.d();
        if (!_neitherNull(bD, interfaceC0472c) || (abstractC0771gE = interfaceC0472c.e()) == null || (objH = bD.h(abstractC0771gE)) == null) {
            return jVar;
        }
        interfaceC0472c.e();
        p109u2.l lVarM = fVar.m(objH);
        fVar.A();
        p015c2.h hVar = ((p037g2.m) lVarM).f9146a;
        if (jVar == null) {
            jVar = fVar.f0(hVar, interfaceC0472c);
        }
        return new f0(lVarM, hVar, jVar);
    }

    public p015c2.j findDeserializer(p015c2.f fVar, p015c2.h hVar, InterfaceC0472c interfaceC0472c) {
        return fVar.f0(hVar, interfaceC0472c);
    }

    public Boolean findFormatFeature(p015c2.f fVar, InterfaceC0472c interfaceC0472c, Class<?> cls, EnumC0352n enumC0352n) {
        C0355q c0355qFindFormatOverrides = findFormatOverrides(fVar, interfaceC0472c, cls);
        if (c0355qFindFormatOverrides != null) {
            return c0355qFindFormatOverrides.b(enumC0352n);
        }
        return null;
    }

    public C0355q findFormatOverrides(p015c2.f fVar, InterfaceC0472c interfaceC0472c, Class<?> cls) {
        return interfaceC0472c != null ? interfaceC0472c.b(fVar.f7249l, cls) : fVar.f7249l.f(cls);
    }

    public final p032f2.l findValueNullProvider(p015c2.f fVar, p032f2.r rVar, p015c2.z zVar) {
        if (rVar != null) {
            return _findNullProvider(fVar, rVar, zVar.f7344m, rVar.r());
        }
        return null;
    }

    @Deprecated
    public final Class<?> getValueClass() {
        return this._valueClass;
    }

    public p032f2.t getValueInstantiator() {
        return null;
    }

    public p015c2.h getValueType() {
        return this._valueType;
    }

    public void handleMissingEndArrayForSingle(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        fVar.L0(this, T1.k.END_ARRAY, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", handledType().getName());
        throw null;
    }

    public Object handleNestedArrayForSingle(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        fVar.t0(getValueType(fVar), iVar.s(), iVar, "Cannot deserialize instance of " + p109u2.i.z(this._valueClass) + " out of " + T1.k.START_ARRAY + " token: nested Arrays not allowed with DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS", new Object[0]);
        throw null;
    }

    public void handleUnknownProperty(T1.i iVar, p015c2.f fVar, Object obj, String str) throws UnrecognizedPropertyException {
        if (obj == null) {
            obj = handledType();
        }
        fVar.f7249l.getClass();
        if (!fVar.B0(p015c2.g.FAIL_ON_UNKNOWN_PROPERTIES)) {
            iVar.F0();
            return;
        }
        Collection<Object> knownPropertyNames = getKnownPropertyNames();
        int i = UnrecognizedPropertyException.f7691n;
        String strJ = AbstractC0013g0.j("Unrecognized field \"", str, "\" (class ", (obj instanceof Class ? obj : obj.getClass()).getName(), "), not marked as ignorable");
        U1.c cVar = fVar.f7252o;
        UnrecognizedPropertyException unrecognizedPropertyException = new UnrecognizedPropertyException(cVar, strJ, cVar.M(), knownPropertyNames);
        unrecognizedPropertyException.e(str, obj);
        throw unrecognizedPropertyException;
    }

    @Override // p015c2.j
    public Class<?> handledType() {
        return this._valueClass;
    }

    public boolean isDefaultDeserializer(p015c2.j jVar) {
        return p109u2.i.v(jVar);
    }

    public boolean isDefaultKeyDeserializer(p015c2.q qVar) {
        return p109u2.i.v(qVar);
    }

    public static final double _parseDouble(String str, boolean z5) {
        return V1.e.c(str, z5);
    }

    public p026e2.b _checkFromStringCoercion(p015c2.f fVar, String str, p104t2.d dVar, Class<?> cls) throws MismatchedInputException {
        if (str.isEmpty()) {
            return _checkCoercionFail(fVar, fVar.d0(dVar, cls, p026e2.d.f8695m), cls, str, "empty String (\"\")");
        }
        boolean z_isBlank = _isBlank(str);
        p026e2.b bVar = p026e2.b.f8686h;
        if (z_isBlank) {
            return _checkCoercionFail(fVar, fVar.e0(dVar, cls), cls, str, "blank String (all whitespace)");
        }
        if (fVar.A0(T1.o.UNTYPED_SCALARS)) {
            return p026e2.b.i;
        }
        p026e2.b bVarD0 = fVar.d0(dVar, cls, p026e2.d.f8693k);
        if (bVarD0 != bVar) {
            return bVarD0;
        }
        fVar.J0(this, "Cannot coerce String value (\"%s\") to %s (but might if coercion using `CoercionConfig` was enabled)", str, _coercedTypeDesc());
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (_isTrue(r7) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
    
        if (_isFalse(r7) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean _parseBooleanPrimitive(T1.i r7, p015c2.f r8) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r6 = this;
            int r0 = r7.v()
            r1 = 0
            r2 = 1
            java.lang.Class r3 = java.lang.Boolean.TYPE
            if (r0 == r2) goto L94
            r4 = 3
            if (r0 == r4) goto L6d
            r4 = 6
            r5 = 0
            if (r0 == r4) goto L28
            r4 = 7
            if (r0 == r4) goto L1d
            switch(r0) {
                case 9: goto L50;
                case 10: goto L5a;
                case 11: goto L19;
                default: goto L17;
            }
        L17:
            goto L90
        L19:
            r6._verifyNullForPrimitive(r8)
            return r5
        L1d:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Boolean r6 = r6._coerceBooleanFromInt(r7, r8, r3)
            boolean r6 = r0.equals(r6)
            return r6
        L28:
            java.lang.String r7 = r7.i0()
            t2.d r0 = p104t2.d.f12498o
            e2.b r0 = r6._checkFromStringCoercion(r8, r7, r0, r3)
            e2.b r4 = p026e2.b.f8687j
            if (r0 != r4) goto L3a
            r6._verifyNullForPrimitive(r8)
            return r5
        L3a:
            e2.b r4 = p026e2.b.f8688k
            if (r0 != r4) goto L3f
            goto L5a
        L3f:
            java.lang.String r7 = r7.trim()
            int r0 = r7.length()
            r4 = 4
            if (r0 != r4) goto L51
            boolean r0 = r6._isTrue(r7)
            if (r0 == 0) goto L5b
        L50:
            return r2
        L51:
            r2 = 5
            if (r0 != r2) goto L5b
            boolean r0 = r6._isFalse(r7)
            if (r0 == 0) goto L5b
        L5a:
            return r5
        L5b:
            boolean r0 = r6._hasTextualNull(r7)
            if (r0 == 0) goto L65
            r6._verifyNullForPrimitiveCoercion(r8, r7)
            return r5
        L65:
            java.lang.String r6 = "only \"true\"/\"True\"/\"TRUE\" or \"false\"/\"False\"/\"FALSE\" recognized"
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r8.w0(r3, r7, r6, r0)
            throw r1
        L6d:
            c2.g r0 = p015c2.g.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r0 = r8.B0(r0)
            if (r0 == 0) goto L90
            T1.k r0 = r7.B0()
            T1.k r1 = T1.k.START_ARRAY
            if (r0 != r1) goto L88
            java.lang.Object r6 = r6.handleNestedArrayForSingle(r7, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L88:
            boolean r0 = r6._parseBooleanPrimitive(r7, r8)
            r6._verifyEndArrayForSingle(r7, r8)
            return r0
        L90:
            r8.s0(r7, r3)
            throw r1
        L94:
            r8.s0(r7, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.g0._parseBooleanPrimitive(T1.i, c2.f):boolean");
    }

    public p015c2.h getValueType(p015c2.f fVar) {
        p015c2.h hVar = this._valueType;
        return hVar != null ? hVar : fVar.b0(this._valueClass);
    }

    public final String _parseString(T1.i iVar, p015c2.f fVar, p032f2.l lVar) throws MismatchedInputException {
        String strQ0;
        p026e2.b bVar_checkIntToStringCoercion = p026e2.b.i;
        int iV = iVar.v();
        if (iV == 1) {
            fVar.s0(iVar, this._valueClass);
            throw null;
        }
        if (iV != 12) {
            switch (iV) {
                case 6:
                    return iVar.i0();
                case 7:
                    bVar_checkIntToStringCoercion = _checkIntToStringCoercion(iVar, fVar, this._valueClass);
                    break;
                case 8:
                    bVar_checkIntToStringCoercion = _checkFloatToStringCoercion(iVar, fVar, this._valueClass);
                    break;
                case 9:
                case 10:
                    bVar_checkIntToStringCoercion = _checkBooleanToStringCoercion(iVar, fVar, this._valueClass);
                    break;
            }
            if (bVar_checkIntToStringCoercion == p026e2.b.f8687j) {
                return (String) lVar.getNullValue(fVar);
            }
            if (bVar_checkIntToStringCoercion == p026e2.b.f8688k) {
                return "";
            }
            if (iVar.s().f5237o && (strQ0 = iVar.q0()) != null) {
                return strQ0;
            }
            fVar.r0(iVar, getValueType(fVar));
            throw null;
        }
        Object objX = iVar.X();
        if (objX instanceof byte[]) {
            return fVar.f7249l.i.f8685n.d((byte[]) objX);
        }
        if (objX == null) {
            return null;
        }
        return objX.toString();
    }

    public g0(g0 g0Var) {
        this._valueClass = g0Var._valueClass;
        this._valueType = g0Var._valueType;
    }

    public g0(Class cls) {
        this._valueClass = cls;
        this._valueType = null;
    }

    public Date _parseDate(String str, p015c2.f fVar) throws InvalidFormatException {
        try {
            if (str.isEmpty()) {
                if (_checkFromStringCoercion(fVar, str).ordinal() == 3) {
                    return new Date(0L);
                }
            } else if (!_hasTextualNull(str)) {
                return fVar.E0(str);
            }
            return null;
        } catch (IllegalArgumentException e6) {
            fVar.w0(this._valueClass, str, "not a valid representation (error: %s)", p109u2.i.i(e6));
            throw null;
        }
    }

    public final Integer _parseInteger(p015c2.f fVar, String str) throws InvalidFormatException {
        try {
            if (str.length() > 9) {
                long jG = V1.e.g(str);
                if (!_intOverflow(jG)) {
                    return Integer.valueOf((int) jG);
                }
                fVar.w0(Integer.class, str, "Overflow: numeric value (%s) out of range of `java.lang.Integer` (%d -%d)", str, Integer.MIN_VALUE, Integer.MAX_VALUE);
                throw null;
            }
            return Integer.valueOf(V1.e.e(str));
        } catch (IllegalArgumentException unused) {
            fVar.w0(Integer.class, str, "not a valid `java.lang.Integer` value", new Object[0]);
            throw null;
        }
    }

    public final Long _parseLong(p015c2.f fVar, String str) throws InvalidFormatException {
        try {
            return Long.valueOf(V1.e.g(str));
        } catch (IllegalArgumentException unused) {
            fVar.w0(Long.class, str, "not a valid `java.lang.Long` value", new Object[0]);
            throw null;
        }
    }

    public final int _parseIntPrimitive(p015c2.f fVar, String str) throws InvalidFormatException {
        Class cls = Integer.TYPE;
        try {
            if (str.length() > 9) {
                long jG = V1.e.g(str);
                if (!_intOverflow(jG)) {
                    return (int) jG;
                }
                fVar.w0(cls, str, "Overflow: numeric value (%s) out of range of int (%d -%d)", str, Integer.MIN_VALUE, Integer.MAX_VALUE);
                throw null;
            }
            return V1.e.e(str);
        } catch (IllegalArgumentException unused) {
            fVar.w0(cls, str, "not a valid `int` value", new Object[0]);
            throw null;
        }
    }

    public final long _parseLongPrimitive(p015c2.f fVar, String str) throws InvalidFormatException {
        try {
            return V1.e.g(str);
        } catch (IllegalArgumentException unused) {
            fVar.w0(Long.TYPE, str, "not a valid `long` value", new Object[0]);
            throw null;
        }
    }

    public final double _parseDoublePrimitive(p015c2.f fVar, String str) throws InvalidFormatException {
        try {
            return _parseDouble(str);
        } catch (IllegalArgumentException unused) {
            fVar.w0(Double.TYPE, str, "not a valid `double` value (as String to convert)", new Object[0]);
            throw null;
        }
    }

    public final float _parseFloatPrimitive(p015c2.f fVar, String str) throws InvalidFormatException {
        try {
            String str2 = V1.e.f5496a;
            return Float.parseFloat(str);
        } catch (IllegalArgumentException unused) {
            fVar.w0(Float.TYPE, str, "not a valid `float` value", new Object[0]);
            throw null;
        }
    }

    public final double _parseDoublePrimitive(T1.i iVar, p015c2.f fVar, String str) throws InvalidFormatException {
        try {
            return _parseDouble(str, iVar.u0(T1.p.USE_FAST_DOUBLE_PARSER));
        } catch (IllegalArgumentException unused) {
            fVar.w0(Double.TYPE, str, "not a valid `double` value (as String to convert)", new Object[0]);
            throw null;
        }
    }

    public final float _parseFloatPrimitive(T1.i iVar, p015c2.f fVar, String str) throws InvalidFormatException {
        try {
            return V1.e.d(str, iVar.u0(T1.p.USE_FAST_DOUBLE_PARSER));
        } catch (IllegalArgumentException unused) {
            fVar.w0(Float.TYPE, str, "not a valid `float` value", new Object[0]);
            throw null;
        }
    }
}
