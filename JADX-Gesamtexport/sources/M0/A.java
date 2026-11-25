package M0;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A implements Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Choreographer f3389h;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3389h.postFrameCallback(new I1.i(runnable, 1));
    }
}
