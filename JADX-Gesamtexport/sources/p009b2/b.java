package p009b2;

import D.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f7058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f7059b;

    static {
        boolean zEquals;
        try {
            zEquals = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            zEquals = false;
        }
        f7058a = zEquals ? n.f7093a : null;
        f7059b = new ThreadLocal();
    }
}
