package p126x2;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class q implements ThreadFactory {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f14092h = new q();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(5);
        thread.setDaemon(true);
        return thread;
    }
}
