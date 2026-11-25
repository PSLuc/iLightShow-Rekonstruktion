package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
public class L extends p105t3.C {
    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        aVar.c();
        int i = 0;
        int i3 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (aVar.f0() != 4) {
            String strZ = aVar.Z();
            int iX = aVar.X();
            strZ.getClass();
            switch (strZ) {
                case "dayOfMonth":
                    i6 = iX;
                    break;
                case "minute":
                    i8 = iX;
                    break;
                case "second":
                    i9 = iX;
                    break;
                case "year":
                    i = iX;
                    break;
                case "month":
                    i3 = iX;
                    break;
                case "hourOfDay":
                    i7 = iX;
                    break;
            }
        }
        aVar.v();
        return new GregorianCalendar(i, i3, i6, i7, i8, i9);
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            cVar.G();
            return;
        }
        cVar.k();
        cVar.C("year");
        cVar.V(calendar.get(1));
        cVar.C("month");
        cVar.V(calendar.get(2));
        cVar.C("dayOfMonth");
        cVar.V(calendar.get(5));
        cVar.C("hourOfDay");
        cVar.V(calendar.get(11));
        cVar.C("minute");
        cVar.V(calendar.get(12));
        cVar.C("second");
        cVar.V(calendar.get(13));
        cVar.v();
    }
}
