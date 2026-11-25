package com.google.gson.internal.sql;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import p105t3.C;
import p105t3.D;
import p105t3.m;

/* JADX INFO: loaded from: classes.dex */
public final class SqlDateTypeAdapter extends C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D f8138b = new D() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // p105t3.D
        public final C a(m mVar, p132y3.a aVar) {
            if (aVar.getRawType() == Date.class) {
                return new SqlDateTypeAdapter(0);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f8139a;

    public /* synthetic */ SqlDateTypeAdapter(int i) {
        this();
    }

    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        Date date;
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        String strD0 = aVar.d0();
        synchronized (this) {
            TimeZone timeZone = this.f8139a.getTimeZone();
            try {
                try {
                    date = new Date(this.f8139a.parse(strD0).getTime());
                    this.f8139a.setTimeZone(timeZone);
                } catch (ParseException e6) {
                    throw new JsonSyntaxException("Failed parsing '" + strD0 + "' as SQL Date; at path " + aVar.J(), e6);
                }
            } catch (Throwable th) {
                this.f8139a.setTimeZone(timeZone);
                throw th;
            }
        }
        return date;
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            cVar.G();
            return;
        }
        synchronized (this) {
            str = this.f8139a.format((java.util.Date) date);
        }
        cVar.Z(str);
    }

    private SqlDateTypeAdapter() {
        this.f8139a = new SimpleDateFormat("MMM d, yyyy");
    }
}
