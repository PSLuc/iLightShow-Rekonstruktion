package com.nanjoran.ilightshow.Services;

import N.C0208d;
import N.C0217h0;
import P4.AbstractC0336x;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0697x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0217h0 f8494a = C0208d.K(null, N.U.f3673m);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P4.j0 f8495b;

    static {
        P4.j0 j0VarB = AbstractC0336x.b();
        f8495b = j0VarB;
        W4.d dVar = P4.D.f4604a;
        dVar.getClass();
        AbstractC0336x.o(AbstractC0336x.a(S1.h0.u(dVar, j0VarB)), null, new C0696w(2, null), 3);
    }

    public static AppConfigWrapper a() {
        return (AppConfigWrapper) f8494a.getValue();
    }
}
