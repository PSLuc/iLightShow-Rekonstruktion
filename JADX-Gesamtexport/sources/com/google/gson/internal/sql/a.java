package com.google.gson.internal.sql;

import java.sql.Timestamp;
import java.util.Date;
import p105t3.C;
import p105t3.D;
import p105t3.m;

/* JADX INFO: loaded from: classes.dex */
public final class a extends C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D f8142b = new D() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter$1
        @Override // p105t3.D
        public final C a(m mVar, p132y3.a aVar) {
            if (aVar.getRawType() != Timestamp.class) {
                return null;
            }
            mVar.getClass();
            return new a(mVar.g(p132y3.a.get(Date.class)));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f8143a;

    public a(C c6) {
        this.f8143a = c6;
    }

    @Override // p105t3.C
    public final Object a(p138z3.a aVar) {
        Date date = (Date) this.f8143a.a(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) {
        this.f8143a.b(cVar, (Timestamp) obj);
    }
}
