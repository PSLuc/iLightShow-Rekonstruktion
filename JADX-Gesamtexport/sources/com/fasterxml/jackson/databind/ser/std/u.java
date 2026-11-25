package com.fasterxml.jackson.databind.ser.std;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC0547s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u f7762l = new u(Float.class, T1.h.f5210k, "number");

    @Override // com.fasterxml.jackson.databind.ser.std.Q, p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        eVar.Y(((Float) obj).floatValue());
    }
}
