package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0643k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C0643k f8217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0643k f8218b;

    static {
        C0643k c0643k = new C0643k();
        Map map = Collections.EMPTY_MAP;
        f8218b = c0643k;
    }

    public static C0643k a() {
        C0643k c0643k;
        C0643k c0643k2 = f8217a;
        if (c0643k2 != null) {
            return c0643k2;
        }
        synchronized (C0643k.class) {
            try {
                c0643k = f8217a;
                if (c0643k == null) {
                    Class cls = AbstractC0642j.f8216a;
                    C0643k c0643k3 = null;
                    if (cls != null) {
                        try {
                            c0643k3 = (C0643k) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c0643k = c0643k3 != null ? c0643k3 : f8218b;
                    f8217a = c0643k;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0643k;
    }
}
