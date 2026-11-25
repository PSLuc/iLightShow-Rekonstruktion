package com.fasterxml.jackson.databind.deser.std;

import S1.C0355q;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p015c2.InterfaceC0472c;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0516l extends n0 implements p032f2.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateFormat f7613h;
    public final String i;

    public AbstractC0516l(Class cls) {
        super(cls);
        this.f7613h = null;
        this.i = null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0
    public final Date _parseDate(T1.i iVar, p015c2.f fVar) {
        Date date;
        if (this.f7613h == null || !iVar.s0(T1.k.VALUE_STRING)) {
            return super._parseDate(iVar, fVar);
        }
        String strTrim = iVar.i0().trim();
        if (strTrim.isEmpty()) {
            if (_checkFromStringCoercion(fVar, strTrim).ordinal() != 3) {
                return null;
            }
            return new Date(0L);
        }
        synchronized (this.f7613h) {
            try {
                try {
                    date = this.f7613h.parse(strTrim);
                } catch (ParseException unused) {
                    fVar.w0(handledType(), strTrim, "expected format \"%s\"", this.i);
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return date;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.text.DateFormat] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.text.DateFormat] */
    /* JADX WARN: Type inference failed for: r4v8, types: [u2.x] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [c2.j, com.fasterxml.jackson.databind.deser.std.g0, com.fasterxml.jackson.databind.deser.std.l] */
    @Override // p032f2.i
    public final p015c2.j a(p015c2.f fVar, InterfaceC0472c interfaceC0472c) {
        DateFormat dateFormat;
        ?? xVar;
        Boolean bool;
        C0355q c0355qFindFormatOverrides = findFormatOverrides(fVar, interfaceC0472c, handledType());
        if (c0355qFindFormatOverrides == null) {
            return this;
        }
        TimeZone timeZoneC = c0355qFindFormatOverrides.c();
        String str = c0355qFindFormatOverrides.f4972h;
        boolean z5 = str != null && str.length() > 0;
        Locale locale = c0355qFindFormatOverrides.f4973j;
        Boolean bool2 = c0355qFindFormatOverrides.f4975l;
        if (z5) {
            if (locale == null) {
                locale = fVar.f7249l.i.f8684m;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
            if (timeZoneC == null) {
                fVar.f7249l.i.getClass();
                timeZoneC = p026e2.a.f8679o;
            }
            simpleDateFormat.setTimeZone(timeZoneC);
            if (bool2 != null) {
                simpleDateFormat.setLenient(bool2.booleanValue());
            }
            return d(simpleDateFormat, str);
        }
        String strU = this.i;
        if (timeZoneC != null) {
            DateFormat dateFormat2 = fVar.f7249l.i.f8683l;
            if (dateFormat2.getClass() == p109u2.x.class) {
                if (locale == null) {
                    locale = fVar.f7249l.i.f8684m;
                }
                p109u2.x xVar2 = (p109u2.x) dateFormat2;
                TimeZone timeZone = xVar2.f12727h;
                p109u2.x xVar3 = xVar2;
                if (timeZoneC != timeZone) {
                    xVar3 = xVar2;
                    if (!timeZoneC.equals(timeZone)) {
                        xVar3 = new p109u2.x(timeZoneC, xVar2.i, xVar2.f12728j, xVar2.f12731m);
                    }
                }
                boolean zEquals = locale.equals(xVar3.i);
                xVar = xVar3;
                if (!zEquals) {
                    xVar = new p109u2.x(xVar3.f12727h, locale, xVar3.f12728j, xVar3.f12731m);
                }
                if (bool2 != null && bool2 != (bool = xVar.f12728j) && !bool2.equals(bool)) {
                    xVar = new p109u2.x(xVar.f12727h, xVar.i, bool2, xVar.f12731m);
                }
            } else {
                xVar = (DateFormat) dateFormat2.clone();
                xVar.setTimeZone(timeZoneC);
                if (bool2 != null) {
                    xVar.setLenient(bool2.booleanValue());
                }
            }
            return d(xVar, strU);
        }
        if (bool2 == null) {
            return this;
        }
        DateFormat dateFormat3 = fVar.f7249l.i.f8683l;
        if (dateFormat3.getClass() == p109u2.x.class) {
            p109u2.x xVar4 = (p109u2.x) dateFormat3;
            Boolean bool3 = xVar4.f12728j;
            p109u2.x xVar5 = xVar4;
            if (bool2 != bool3) {
                xVar5 = xVar4;
                if (!bool2.equals(bool3)) {
                    xVar5 = new p109u2.x(xVar4.f12727h, xVar4.i, bool2, xVar4.f12731m);
                }
            }
            StringBuilder sb = new StringBuilder(100);
            sb.append("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSX', 'EEE, dd MMM yyyy HH:mm:ss zzz' (");
            strU = p012c.k.u(sb, Boolean.FALSE.equals(xVar5.f12728j) ? "strict" : "lenient", ")]");
            dateFormat = xVar5;
        } else {
            DateFormat dateFormat4 = (DateFormat) dateFormat3.clone();
            dateFormat4.setLenient(bool2.booleanValue());
            boolean z6 = dateFormat4 instanceof SimpleDateFormat;
            dateFormat = dateFormat4;
            if (z6) {
                ((SimpleDateFormat) dateFormat4).toPattern();
                dateFormat = dateFormat4;
            }
        }
        if (strU == null) {
            strU = "[unknown]";
        }
        return d(dateFormat, strU);
    }

    public abstract AbstractC0516l d(DateFormat dateFormat, String str);

    @Override // p015c2.j
    public Object deserialize(T1.i iVar, p015c2.f fVar) {
        return _parseDate(iVar, fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12502s;
    }

    public AbstractC0516l(AbstractC0516l abstractC0516l, DateFormat dateFormat, String str) {
        super(abstractC0516l._valueClass);
        this.f7613h = dateFormat;
        this.i = str;
    }
}
