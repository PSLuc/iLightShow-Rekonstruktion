package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0645m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0644l f8219a = new C0644l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0644l f8220b;

    static {
        C0644l c0644l = null;
        try {
            c0644l = (C0644l) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f8220b = c0644l;
    }
}
