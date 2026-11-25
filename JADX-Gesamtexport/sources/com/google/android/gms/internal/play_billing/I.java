package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final I f7858d = new I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f7859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f7860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public I f7861c;

    public I() {
        this.f7859a = null;
        this.f7860b = null;
    }

    public I(Runnable runnable, Executor executor) {
        this.f7859a = runnable;
        this.f7860b = executor;
    }
}
