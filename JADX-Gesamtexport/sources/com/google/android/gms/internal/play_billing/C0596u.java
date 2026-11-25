package com.google.android.gms.internal.play_billing;

import B.AbstractC0013g0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0596u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8006c;

    public C0596u(Object obj, Object obj2, Object obj3) {
        this.f8004a = obj;
        this.f8005b = obj2;
        this.f8006c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f8004a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f8005b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f8006c);
        StringBuilder sbO = AbstractC0013g0.o("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and ");
        sbO.append(strValueOf3);
        sbO.append("=");
        sbO.append(strValueOf4);
        return new IllegalArgumentException(sbO.toString());
    }
}
