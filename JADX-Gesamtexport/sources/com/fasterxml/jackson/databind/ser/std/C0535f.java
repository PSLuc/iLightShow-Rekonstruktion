package com.fasterxml.jackson.databind.ser.std;

import java.text.DateFormat;
import java.util.Calendar;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0535f extends AbstractC0539j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0535f f7718l = new C0535f(null, null);

    public C0535f(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0539j
    public final AbstractC0539j h(Boolean bool, DateFormat dateFormat) {
        return new C0535f(bool, dateFormat);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        Calendar calendar = (Calendar) obj;
        if (f(e6)) {
            eVar.a0(calendar == null ? 0L : calendar.getTimeInMillis());
        } else {
            g(calendar.getTime(), eVar, e6);
        }
    }
}
