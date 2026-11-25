package p130y0;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S f14286h;

    public Q(S s6) {
        this.f14286h = s6;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        this.f14286h.f14292k.removeCallbacks(this);
        S.Z(this.f14286h);
        S s6 = this.f14286h;
        synchronized (s6.f14293l) {
            if (s6.f14298q) {
                s6.f14298q = false;
                ArrayList arrayList = s6.f14295n;
                s6.f14295n = s6.f14296o;
                s6.f14296o = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j4);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        S.Z(this.f14286h);
        S s6 = this.f14286h;
        synchronized (s6.f14293l) {
            if (s6.f14295n.isEmpty()) {
                s6.f14291j.removeFrameCallback(this);
                s6.f14298q = false;
            }
        }
    }
}
