package m5;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ThreadFactory {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ThreadGroup f10444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ThreadGroup f10445l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ThreadGroup f10446h;
    public final AtomicInteger i = new AtomicInteger(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f10447j;

    static {
        ThreadGroup threadGroup = new ThreadGroup("Californium");
        f10444k = threadGroup;
        ThreadGroup threadGroup2 = new ThreadGroup("Scandium");
        f10445l = threadGroup2;
        threadGroup.setDaemon(false);
        threadGroup2.setDaemon(false);
    }

    public f(String str, ThreadGroup threadGroup) {
        this.f10446h = threadGroup == null ? f10444k : threadGroup;
        this.f10447j = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f10446h, runnable, this.f10447j + this.i.getAndIncrement(), 0L);
        thread.setDaemon(true);
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }
}
