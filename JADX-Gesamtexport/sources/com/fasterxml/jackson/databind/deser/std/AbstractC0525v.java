package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0525v extends n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f7667h = 0;

    public static AbstractC0525v h(Class cls) {
        int i;
        if (cls == File.class) {
            i = 1;
        } else if (cls == URL.class) {
            i = 2;
        } else if (cls == URI.class) {
            i = 3;
        } else if (cls == Class.class) {
            i = 4;
        } else if (cls == p015c2.h.class) {
            i = 5;
        } else if (cls == Currency.class) {
            i = 6;
        } else if (cls == Pattern.class) {
            i = 7;
        } else if (cls == Locale.class) {
            i = 8;
        } else if (cls == Charset.class) {
            i = 9;
        } else if (cls == TimeZone.class) {
            i = 10;
        } else if (cls == InetAddress.class) {
            i = 11;
        } else {
            if (cls != InetSocketAddress.class) {
                if (cls == StringBuilder.class) {
                    return new C0524u(StringBuilder.class);
                }
                if (cls == StringBuffer.class) {
                    return new C0523t(StringBuffer.class);
                }
                return null;
            }
            i = 12;
        }
        return new C0522s(i, cls);
    }

    public abstract Object d(p015c2.f fVar, String str);

    @Override // p015c2.j
    public Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        String strQ0 = iVar.q0();
        if (strQ0 == null) {
            T1.k kVarS = iVar.s();
            if (kVarS == T1.k.START_OBJECT) {
                fVar.s0(iVar, this._valueClass);
                throw null;
            }
            if (kVarS == T1.k.START_ARRAY) {
                return _deserializeFromArray(iVar, fVar);
            }
            if (kVarS != T1.k.VALUE_EMBEDDED_OBJECT) {
                fVar.s0(iVar, this._valueClass);
                throw null;
            }
            Object objX = iVar.X();
            if (objX == null) {
                return null;
            }
            return this._valueClass.isAssignableFrom(objX.getClass()) ? objX : e(fVar, objX);
        }
        if (strQ0.isEmpty()) {
            return f(fVar);
        }
        if (g()) {
            String strTrim = strQ0.trim();
            if (strTrim != strQ0 && strTrim.isEmpty()) {
                return f(fVar);
            }
            strQ0 = strTrim;
        }
        try {
            return d(fVar, strQ0);
        } catch (IllegalArgumentException | MalformedURLException e6) {
            String message = e6.getMessage();
            InvalidFormatException invalidFormatExceptionN0 = fVar.N0(this._valueClass, strQ0, message != null ? "not a valid textual representation, problem: ".concat(message) : "not a valid textual representation");
            invalidFormatExceptionN0.initCause(e6);
            throw invalidFormatExceptionN0;
        }
    }

    public Object e(p015c2.f fVar, Object obj) throws MismatchedInputException {
        fVar.J0(this, "Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this._valueClass.getName());
        throw null;
    }

    public final Object f(p015c2.f fVar) throws MismatchedInputException {
        p026e2.b bVarD0 = fVar.d0(logicalType(), this._valueClass, p026e2.d.f8695m);
        if (bVarD0 == p026e2.b.f8686h) {
            fVar.J0(this, "Cannot coerce empty String (\"\") to %s (but could if enabling coercion using `CoercionConfig`)", _coercedTypeDesc());
            throw null;
        }
        if (bVarD0 == p026e2.b.f8687j) {
            return getNullValue(fVar);
        }
        return bVarD0 == p026e2.b.f8688k ? getEmptyValue(fVar) : c(fVar);
    }

    public boolean g() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, p015c2.j
    public p104t2.d logicalType() {
        return p104t2.d.f12503t;
    }
}
