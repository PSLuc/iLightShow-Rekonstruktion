package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.google.gson.internal.bind.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0611d extends p105t3.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p105t3.D f8085c = new p105t3.D() { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter$1
        @Override // p105t3.D
        public final p105t3.C a(p105t3.m mVar, p132y3.a aVar) {
            if (aVar.getRawType() == Date.class) {
                return new C0611d(AbstractC0610c.f8083b, 2, 2);
            }
            return null;
        }

        public final String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0610c f8086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8087b;

    public C0611d(AbstractC0610c abstractC0610c, int i, int i3) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        this.f8087b = arrayList;
        Objects.requireNonNull(abstractC0610c);
        this.f8086a = abstractC0610c;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i3, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i3));
        }
        if (p116v3.g.f13263a >= 9) {
            StringBuilder sb = new StringBuilder();
            if (i == 0) {
                str = "EEEE, MMMM d, yyyy";
            } else if (i == 1) {
                str = "MMMM d, yyyy";
            } else if (i == 2) {
                str = "MMM d, yyyy";
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(p012c.k.r(i, "Unknown DateFormat style: "));
                }
                str = "M/d/yy";
            }
            sb.append(str);
            sb.append(" ");
            if (i3 == 0 || i3 == 1) {
                str2 = "h:mm:ss a z";
            } else if (i3 == 2) {
                str2 = "h:mm:ss a";
            } else {
                if (i3 != 3) {
                    throw new IllegalArgumentException(p012c.k.r(i3, "Unknown DateFormat style: "));
                }
                str2 = "h:mm a";
            }
            sb.append(str2);
            arrayList.add(new SimpleDateFormat(sb.toString(), locale));
        }
    }

    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        Date dateB;
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        String strD0 = aVar.d0();
        synchronized (this.f8087b) {
            try {
                ArrayList arrayList = this.f8087b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    DateFormat dateFormat = (DateFormat) obj;
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateB = dateFormat.parse(strD0);
                            dateFormat.setTimeZone(timeZone);
                        } catch (ParseException unused) {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (Throwable th) {
                        dateFormat.setTimeZone(timeZone);
                        throw th;
                    }
                }
                try {
                    dateB = p121w3.a.b(strD0, new ParsePosition(0));
                } catch (ParseException e6) {
                    StringBuilder sbW = p012c.k.w("Failed parsing '", strD0, "' as Date; at path ");
                    sbW.append(aVar.J());
                    throw new JsonSyntaxException(sbW.toString(), e6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f8086a.b(dateB);
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            cVar.G();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f8087b.get(0);
        synchronized (this.f8087b) {
            str = dateFormat.format(date);
        }
        cVar.Z(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f8087b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
