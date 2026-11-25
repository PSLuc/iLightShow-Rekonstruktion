package p034f4;

import h5.C0725c;
import h5.C0728f;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class m extends Thread {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8982h = 0;

    public /* synthetic */ m(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        switch (this.f8982h) {
            case 1:
                break;
            default:
                super.run();
                return;
        }
        while (true) {
            try {
                C0728f.Companion.getClass();
                ReentrantLock reentrantLock = C0728f.lock;
                reentrantLock.lock();
                try {
                    C0728f c0728fA = C0725c.a();
                    if (c0728fA == C0728f.head) {
                        C0728f.head = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (c0728fA != null) {
                            c0728fA.timedOut();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
        }
    }

    public /* synthetic */ m(String str) {
        super(str);
    }
}
