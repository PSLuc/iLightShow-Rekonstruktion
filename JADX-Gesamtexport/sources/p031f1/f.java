package p031f1;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Thread {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8868h;

    public f(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f8868h = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f8868h);
        super.run();
    }
}
