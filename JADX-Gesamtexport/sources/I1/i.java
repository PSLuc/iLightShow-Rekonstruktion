package I1;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1841h;
    public final /* synthetic */ Runnable i;

    public /* synthetic */ i(Runnable runnable, int i) {
        this.f1841h = i;
        this.i = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        switch (this.f1841h) {
            case 0:
                this.i.run();
                break;
            default:
                this.i.run();
                break;
        }
    }
}
