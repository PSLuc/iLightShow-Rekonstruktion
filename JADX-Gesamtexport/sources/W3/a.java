package W3;

import B.C0025m0;
import Y2.o;
import android.os.Trace;
import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import m5.k;
import p034f4.r;
import p119w1.h;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5598h;

    public /* synthetic */ a(int i) {
        this.f5598h = i;
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5598h) {
            case 0:
                return;
            case 1:
                throw null;
            case 2:
                return;
            case 3:
                ArrayList arrayList = new ArrayList(r.f8992d.keySet());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) obj;
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        r.f8992d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                return;
            case 4:
                k.f10455a.trace("warmup ...");
                return;
            default:
                try {
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (h.c()) {
                        h.a().d();
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }

    public String toString() {
        switch (this.f5598h) {
            case 0:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }

    public a(o oVar) {
        this.f5598h = 1;
    }

    public a(C0025m0 c0025m0, int i) {
        this.f5598h = 2;
    }
}
