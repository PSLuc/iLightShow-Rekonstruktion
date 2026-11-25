package com.google.gson.internal.bind;

import java.util.Date;

/* JADX INFO: renamed from: com.google.gson.internal.bind.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0610c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0609b f8083b = new C0609b(Date.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f8084a;

    public AbstractC0610c(Class cls) {
        this.f8084a = cls;
    }

    public final p105t3.D a(int i, int i3) {
        C0611d c0611d = new C0611d(this, i, i3);
        p105t3.D d6 = Z.f8055a;
        return new TypeAdapters$31(this.f8084a, c0611d);
    }

    public abstract Date b(Date date);
}
