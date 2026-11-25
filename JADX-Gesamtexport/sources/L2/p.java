package L2;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3079h = 1;
    public final Object i;

    public p() {
        p038g3.d dVar = new p038g3.d(Looper.getMainLooper());
        Looper.getMainLooper();
        this.i = dVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3079h) {
            case 0:
                ((ExecutorService) this.i).execute(new o(0, runnable));
                break;
            default:
                ((p038g3.d) this.i).post(runnable);
                break;
        }
    }

    public p(ExecutorService executorService) {
        this.i = executorService;
    }
}
