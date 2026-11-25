package com.google.gson.internal.sql;

import com.google.gson.internal.bind.AbstractC0610c;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0610c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8144c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Class cls) {
        super(cls);
        this.f8144c = i;
    }

    @Override // com.google.gson.internal.bind.AbstractC0610c
    public final Date b(Date date) {
        switch (this.f8144c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
