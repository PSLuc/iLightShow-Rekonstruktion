package com.google.gson.internal.sql;

import java.sql.Date;
import java.sql.Timestamp;
import p105t3.D;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f8145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f8146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f8147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f8148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D f8149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D f8150f;

    static {
        boolean z5;
        try {
            Class.forName("java.sql.Date");
            z5 = true;
        } catch (ClassNotFoundException unused) {
            z5 = false;
        }
        f8145a = z5;
        if (z5) {
            f8146b = new b(0, Date.class);
            f8147c = new b(1, Timestamp.class);
            f8148d = SqlDateTypeAdapter.f8138b;
            f8149e = SqlTimeTypeAdapter.f8140b;
            f8150f = a.f8142b;
            return;
        }
        f8146b = null;
        f8147c = null;
        f8148d = null;
        f8149e = null;
        f8150f = null;
    }
}
