package com.google.gson.internal.sql;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import p105t3.C;
import p105t3.D;
import p105t3.m;

/* JADX INFO: loaded from: classes.dex */
public final class SqlTimeTypeAdapter extends C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D f8140b = new D() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // p105t3.D
        public final C a(m mVar, p132y3.a aVar) {
            if (aVar.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter(0);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f8141a;

    public /* synthetic */ SqlTimeTypeAdapter(int i) {
        this();
    }

    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        Time time;
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        String strD0 = aVar.d0();
        synchronized (this) {
            TimeZone timeZone = this.f8141a.getTimeZone();
            try {
                try {
                    time = new Time(this.f8141a.parse(strD0).getTime());
                    this.f8141a.setTimeZone(timeZone);
                } catch (ParseException e6) {
                    throw new JsonSyntaxException("Failed parsing '" + strD0 + "' as SQL Time; at path " + aVar.J(), e6);
                }
            } catch (Throwable th) {
                this.f8141a.setTimeZone(timeZone);
                throw th;
            }
        }
        return time;
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            cVar.G();
            return;
        }
        synchronized (this) {
            str = this.f8141a.format((Date) time);
        }
        cVar.Z(str);
    }

    private SqlTimeTypeAdapter() {
        this.f8141a = new SimpleDateFormat("hh:mm:ss a");
    }
}
