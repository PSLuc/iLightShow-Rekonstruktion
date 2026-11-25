package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K f8174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K f8175b;

    static {
        K k3 = null;
        try {
            k3 = (K) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f8174a = k3;
        f8175b = new K();
    }
}
