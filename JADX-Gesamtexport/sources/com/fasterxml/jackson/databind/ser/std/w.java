package com.fasterxml.jackson.databind.ser.std;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC0547s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final w f7764l = new w(Short.class, T1.h.f5208h, "number");

    @Override // com.fasterxml.jackson.databind.ser.std.Q, p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        eVar.e0(((Short) obj).shortValue());
    }
}
