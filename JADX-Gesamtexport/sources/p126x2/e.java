package p126x2;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f14073h = new e();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
