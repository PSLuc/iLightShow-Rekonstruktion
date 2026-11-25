package com.fasterxml.jackson.databind.ser.std;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class L extends P {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7695h;

    public L(int i, Class cls) {
        super(0, cls);
        this.f7695h = i;
    }

    @Override // p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        String strValueOf;
        switch (this.f7695h) {
            case 1:
                Date date = (Date) obj;
                e6.getClass();
                if (!e6.f7226j.p(p015c2.D.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
                    eVar.T(e6.d0().format(date));
                } else {
                    eVar.T(String.valueOf(date.getTime()));
                }
                break;
            case 2:
                long timeInMillis = ((Calendar) obj).getTimeInMillis();
                e6.getClass();
                if (!e6.f7226j.p(p015c2.D.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
                    eVar.T(e6.d0().format(new Date(timeInMillis)));
                } else {
                    eVar.T(String.valueOf(timeInMillis));
                }
                break;
            case 3:
                eVar.T(((Class) obj).getName());
                break;
            case 4:
                if (e6.f7226j.p(p015c2.D.WRITE_ENUMS_USING_TO_STRING)) {
                    strValueOf = obj.toString();
                } else {
                    Enum r6 = (Enum) obj;
                    strValueOf = e6.f7226j.p(p015c2.D.WRITE_ENUM_KEYS_USING_INDEX) ? String.valueOf(r6.ordinal()) : r6.name();
                }
                eVar.T(strValueOf);
                break;
            case 5:
            case 6:
                long jLongValue = ((Number) obj).longValue();
                eVar.getClass();
                eVar.T(Long.toString(jLongValue));
                break;
            case 7:
                eVar.T(e6.f7226j.i.f8685n.d((byte[]) obj));
                break;
            default:
                eVar.T(obj.toString());
                break;
        }
    }
}
