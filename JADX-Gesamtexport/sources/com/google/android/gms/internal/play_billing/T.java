package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class T implements Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final T f7909h;
    public static final /* synthetic */ T[] i;

    static {
        T t6 = new T("INSTANCE", 0);
        f7909h = t6;
        i = new T[]{t6};
    }

    public static T[] values() {
        return (T[]) i.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
