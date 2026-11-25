package com.fasterxml.jackson.databind.ser.std;

import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0538i extends AbstractC0539j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0538i f7726l = new C0538i(null, null);

    public C0538i(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0539j
    public final AbstractC0539j h(Boolean bool, DateFormat dateFormat) {
        return new C0538i(bool, dateFormat);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        Date date = (Date) obj;
        if (f(e6)) {
            eVar.a0(date == null ? 0L : date.getTime());
        } else {
            g(date, eVar, e6);
        }
    }
}
