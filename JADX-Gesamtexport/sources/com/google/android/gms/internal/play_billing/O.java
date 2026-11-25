package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class O extends AbstractC0552b0 implements X {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f7891d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final W f7892e = new W(C0549a0.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f7893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p020d2.n f7894g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f7895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile I f7896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile N f7897c;

    static {
        boolean z5;
        p020d2.n l6;
        Throwable th;
        Throwable th2;
        try {
            z5 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z5 = false;
        }
        f7893f = z5;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                l6 = new M();
            } catch (Error | Exception e6) {
                try {
                    l6 = new K();
                } catch (Error | Exception e7) {
                    th3 = e7;
                    l6 = new L();
                }
                th = th3;
                th2 = e6;
            }
        } else {
            try {
                l6 = new K();
            } catch (NoClassDefFoundError unused2) {
                l6 = new L();
            }
        }
        th = null;
        th2 = null;
        f7894g = l6;
        if (th != null) {
            W w6 = f7892e;
            Logger loggerA = w6.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            w6.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void b(N n6) {
        n6.f7887a = null;
        while (true) {
            N n7 = this.f7897c;
            if (n7 != N.f7886c) {
                N n8 = null;
                while (n7 != null) {
                    N n9 = n7.f7888b;
                    if (n7.f7887a != null) {
                        n8 = n7;
                    } else if (n8 != null) {
                        n8.f7888b = n9;
                        if (n8.f7887a == null) {
                        }
                    } else if (!f7894g.U(this, n7, n9)) {
                    }
                    n7 = n9;
                }
                return;
            }
            return;
        }
    }
}
