package com.fasterxml.jackson.databind.ser.std;

import S1.C0355q;
import S1.EnumC0354p;
import com.fasterxml.jackson.databind.JsonNode;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import p015c2.InterfaceC0472c;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0539j extends Q implements p093r2.g {
    public final Boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DateFormat f7727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference f7728k;

    public AbstractC0539j(Class cls, Boolean bool, DateFormat dateFormat) {
        super(cls, 2, (byte) 0);
        this.i = bool;
        this.f7727j = dateFormat;
        this.f7728k = dateFormat == null ? null : new AtomicReference();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        throw null;
    }

    @Override // p093r2.g
    public final p015c2.o b(p015c2.E e6, InterfaceC0472c interfaceC0472c) {
        TimeZone timeZoneC;
        C0355q c0355qFindFormatOverrides = findFormatOverrides(e6, interfaceC0472c, handledType());
        if (c0355qFindFormatOverrides != null) {
            EnumC0354p enumC0354p = c0355qFindFormatOverrides.i;
            if (enumC0354p.a()) {
                return h(Boolean.TRUE, null);
            }
            String str = c0355qFindFormatOverrides.f4972h;
            boolean z5 = str != null && str.length() > 0;
            p015c2.C c6 = e6.f7226j;
            Locale locale = c0355qFindFormatOverrides.f4973j;
            if (z5) {
                if (locale == null) {
                    locale = c6.i.f8684m;
                }
                DateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
                if (c0355qFindFormatOverrides.d()) {
                    timeZoneC = c0355qFindFormatOverrides.c();
                } else {
                    c6.i.getClass();
                    timeZoneC = p026e2.a.f8679o;
                }
                simpleDateFormat.setTimeZone(timeZoneC);
                return h(Boolean.FALSE, simpleDateFormat);
            }
            boolean z6 = locale != null;
            boolean zD = c0355qFindFormatOverrides.d();
            boolean z7 = enumC0354p == EnumC0354p.f4968p;
            if (z6 || zD || z7) {
                DateFormat dateFormat = c6.i.f8683l;
                if (dateFormat instanceof p109u2.x) {
                    p109u2.x xVar = (p109u2.x) dateFormat;
                    if (locale != null && !locale.equals(xVar.i)) {
                        xVar = new p109u2.x(xVar.f12727h, locale, xVar.f12728j, xVar.f12731m);
                    }
                    if (c0355qFindFormatOverrides.d()) {
                        TimeZone timeZoneC2 = c0355qFindFormatOverrides.c();
                        xVar.getClass();
                        if (timeZoneC2 == null) {
                            timeZoneC2 = p109u2.x.f12722q;
                        }
                        TimeZone timeZone = xVar.f12727h;
                        if (timeZoneC2 != timeZone && !timeZoneC2.equals(timeZone)) {
                            xVar = new p109u2.x(timeZoneC2, xVar.i, xVar.f12728j, xVar.f12731m);
                        }
                    }
                    return h(Boolean.FALSE, xVar);
                }
                if (dateFormat instanceof SimpleDateFormat) {
                    SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) dateFormat;
                    DateFormat simpleDateFormat3 = z6 ? new SimpleDateFormat(simpleDateFormat2.toPattern(), locale) : (SimpleDateFormat) simpleDateFormat2.clone();
                    TimeZone timeZoneC3 = c0355qFindFormatOverrides.c();
                    if (timeZoneC3 != null && !timeZoneC3.equals(simpleDateFormat3.getTimeZone())) {
                        simpleDateFormat3.setTimeZone(timeZoneC3);
                    }
                    return h(Boolean.FALSE, simpleDateFormat3);
                }
                e6.P("Configured `DateFormat` (" + dateFormat.getClass().getName() + ") not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", handledType());
                throw null;
            }
        }
        return this;
    }

    public final boolean f(p015c2.E e6) {
        Boolean bool = this.i;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f7727j != null) {
            return false;
        }
        if (e6 == null) {
            throw new IllegalArgumentException("Null SerializerProvider passed for ".concat(handledType().getName()));
        }
        return e6.f7226j.p(p015c2.D.WRITE_DATES_AS_TIMESTAMPS);
    }

    public final void g(Date date, T1.e eVar, p015c2.E e6) {
        DateFormat dateFormat = this.f7727j;
        if (dateFormat == null) {
            e6.getClass();
            if (e6.f7226j.p(p015c2.D.WRITE_DATES_AS_TIMESTAMPS)) {
                eVar.a0(date.getTime());
                return;
            } else {
                eVar.s0(e6.d0().format(date));
                return;
            }
        }
        AtomicReference atomicReference = this.f7728k;
        DateFormat dateFormat2 = (DateFormat) atomicReference.getAndSet(null);
        if (dateFormat2 == null) {
            dateFormat2 = (DateFormat) dateFormat.clone();
        }
        eVar.s0(dateFormat2.format(date));
        while (!atomicReference.compareAndSet(null, dateFormat2) && atomicReference.get() == null) {
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, com.fasterxml.jackson.databind.ser.std.P
    public final JsonNode getSchema(p015c2.E e6, Type type) {
        return createSchemaNode(f(e6) ? "number" : "string", true);
    }

    public abstract AbstractC0539j h(Boolean bool, DateFormat dateFormat);

    @Override // com.fasterxml.jackson.databind.ser.std.Q, p015c2.o
    public final boolean isEmpty(p015c2.E e6, Object obj) {
        return false;
    }
}
