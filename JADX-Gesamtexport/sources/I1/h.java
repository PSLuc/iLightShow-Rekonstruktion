package I1;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1840h;
    public final /* synthetic */ Context i;

    public /* synthetic */ h(Context context, int i) {
        this.f1840h = i;
        this.i = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1840h) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h(this.i, 1));
                break;
            default:
                f.s(this.i, new d(), f.f1829a, false);
                break;
        }
    }
}
