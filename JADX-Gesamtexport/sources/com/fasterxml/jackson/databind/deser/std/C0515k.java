package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import java.lang.reflect.Constructor;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0515k extends AbstractC0516l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Constructor f7610j;

    public C0515k() {
        super(Calendar.class);
        this.f7610j = null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0516l
    public final AbstractC0516l d(DateFormat dateFormat, String str) {
        return new C0515k(this, dateFormat, str);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0516l, p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws ValueInstantiationException {
        Date date_parseDate = _parseDate(iVar, fVar);
        if (date_parseDate == null) {
            return null;
        }
        Constructor constructor = this.f7610j;
        if (constructor == null) {
            fVar.f7249l.i.getClass();
            Calendar calendar = Calendar.getInstance(p026e2.a.f8679o);
            calendar.setTime(date_parseDate);
            return calendar;
        }
        try {
            Calendar calendar2 = (Calendar) constructor.newInstance(null);
            calendar2.setTimeInMillis(date_parseDate.getTime());
            fVar.f7249l.i.getClass();
            TimeZone timeZone = p026e2.a.f8679o;
            if (timeZone == null) {
                return calendar2;
            }
            calendar2.setTimeZone(timeZone);
            return calendar2;
        } catch (Exception e6) {
            fVar.n0(handledType(), e6);
            throw null;
        }
    }

    @Override // p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(0L);
        return gregorianCalendar;
    }

    public C0515k(int i) {
        super(GregorianCalendar.class);
        this.f7610j = p109u2.i.k(GregorianCalendar.class, false);
    }

    public C0515k(C0515k c0515k, DateFormat dateFormat, String str) {
        super(c0515k, dateFormat, str);
        this.f7610j = c0515k.f7610j;
    }
}
