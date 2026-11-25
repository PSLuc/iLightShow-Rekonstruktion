package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0429n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C0429n f6897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0429n f6898b;

    static {
        C0429n c0429n = new C0429n();
        Map map = Collections.EMPTY_MAP;
        f6898b = c0429n;
    }

    public static C0429n a() {
        C0429n c0429n;
        S s6 = S.f6818c;
        C0429n c0429n2 = f6897a;
        if (c0429n2 != null) {
            return c0429n2;
        }
        synchronized (C0429n.class) {
            try {
                c0429n = f6897a;
                if (c0429n == null) {
                    Class cls = AbstractC0428m.f6896a;
                    C0429n c0429n3 = null;
                    if (cls != null) {
                        try {
                            c0429n3 = (C0429n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c0429n = c0429n3 != null ? c0429n3 : f6898b;
                    f6897a = c0429n;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0429n;
    }
}
