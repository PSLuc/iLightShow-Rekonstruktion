package p034f4;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8983h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f8984j;

    public n(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f8983h + '-' + incrementAndGet();
        Thread mVar = this.f8984j ? new m(runnable, str) : new Thread(runnable, str);
        mVar.setPriority(this.i);
        mVar.setDaemon(true);
        return mVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return k.u(new StringBuilder("RxThreadFactory["), this.f8983h, "]");
    }

    public n(String str, int i, boolean z5) {
        this.f8983h = str;
        this.i = i;
        this.f8984j = z5;
    }
}
