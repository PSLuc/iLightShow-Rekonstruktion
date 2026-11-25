package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f8155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f8156b;

    static {
        E e6 = null;
        try {
            e6 = (E) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f8155a = e6;
        f8156b = new E();
    }
}
