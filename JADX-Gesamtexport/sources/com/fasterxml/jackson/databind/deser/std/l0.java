package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class l0 extends p015c2.q implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7614h;
    public final Class i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC0525v f7615j;

    public l0(int i, Class cls, AbstractC0525v abstractC0525v) {
        this.f7614h = i;
        this.i = cls;
        this.f7615j = abstractC0525v;
    }

    @Override // p015c2.q
    public Object a(p015c2.f fVar, String str) throws InvalidFormatException {
        Class cls = this.i;
        if (str != null) {
            try {
                Object objB = b(fVar, str);
                if (objB != null) {
                    return objB;
                }
                Annotation[] annotationArr = p109u2.i.f12697a;
                if (!Enum.class.isAssignableFrom(cls) || !fVar.f7249l.p(p015c2.g.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    fVar.u0(cls, str, "not a valid representation", new Object[0]);
                    throw null;
                }
            } catch (Exception e6) {
                fVar.u0(cls, str, "not a valid representation, problem: (%s) %s", e6.getClass().getName(), p109u2.i.i(e6));
                throw null;
            }
        }
        return null;
    }

    public Object b(p015c2.f fVar, String str) throws InvalidFormatException {
        int i = this.f7614h;
        AbstractC0525v abstractC0525v = this.f7615j;
        Class cls = this.i;
        switch (i) {
            case 1:
                if ("true".equals(str)) {
                    return Boolean.TRUE;
                }
                if ("false".equals(str)) {
                    return Boolean.FALSE;
                }
                fVar.u0(cls, str, "value not 'true' or 'false'", new Object[0]);
                throw null;
            case 2:
                int iE = V1.e.e(str);
                if (iE >= -128 && iE <= 255) {
                    return Byte.valueOf((byte) iE);
                }
                fVar.u0(cls, str, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                throw null;
            case 3:
                int iE2 = V1.e.e(str);
                if (iE2 >= -32768 && iE2 <= 32767) {
                    return Short.valueOf((short) iE2);
                }
                fVar.u0(cls, str, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                throw null;
            case 4:
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                fVar.u0(cls, str, "can only convert 1-character Strings", new Object[0]);
                throw null;
            case 5:
                return Integer.valueOf(V1.e.e(str));
            case 6:
                return Long.valueOf(V1.e.g(str));
            case 7:
                String str2 = V1.e.f5496a;
                return Float.valueOf((float) Double.parseDouble(str));
            case 8:
                String str3 = V1.e.f5496a;
                return Double.valueOf(Double.parseDouble(str));
            case 9:
                try {
                    return abstractC0525v.d(fVar, str);
                } catch (IllegalArgumentException e6) {
                    c(fVar, str, e6);
                    throw null;
                }
            case 10:
                return fVar.E0(str);
            case 11:
                Date dateE0 = fVar.E0(str);
                fVar.f7249l.i.getClass();
                Calendar calendar = Calendar.getInstance(p026e2.a.f8679o);
                calendar.setTime(dateE0);
                return calendar;
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e7) {
                    c(fVar, str, e7);
                    throw null;
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e8) {
                    c(fVar, str, e8);
                    throw null;
                }
            case 14:
                try {
                    return new URL(str);
                } catch (MalformedURLException e9) {
                    c(fVar, str, e9);
                    throw null;
                }
            case 15:
                try {
                    fVar.A().getClass();
                    return p104t2.n.k(str);
                } catch (Exception unused) {
                    fVar.u0(cls, str, "unable to parse key as Class", new Object[0]);
                    throw null;
                }
            case 16:
                try {
                    return abstractC0525v.d(fVar, str);
                } catch (IllegalArgumentException e10) {
                    c(fVar, str, e10);
                    throw null;
                }
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                try {
                    T1.a aVar = fVar.f7249l.i.f8685n;
                    aVar.getClass();
                    p009b2.c cVar = new p009b2.c();
                    aVar.b(str, cVar);
                    return cVar.v();
                } catch (IllegalArgumentException e11) {
                    c(fVar, str, e11);
                    throw null;
                }
            default:
                throw new IllegalStateException("Internal error: unknown key type " + cls);
        }
    }

    public final void c(p015c2.f fVar, String str, Exception exc) throws InvalidFormatException {
        fVar.u0(this.i, str, "problem: %s", p109u2.i.i(exc));
        throw null;
    }
}
