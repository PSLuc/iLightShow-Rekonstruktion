package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0635c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f8198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f8199b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f8198a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f8199b = cls2 != null;
    }

    public static boolean a() {
        return (f8198a == null || f8199b) ? false : true;
    }
}
