package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0587p f7924a = new C0587p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Logger f7926c;

    public W(Class cls) {
        this.f7925b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f7926c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f7924a) {
            try {
                Logger logger2 = this.f7926c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f7925b);
                this.f7926c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
