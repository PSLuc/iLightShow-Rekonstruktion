package p119w1;

import B.AbstractC0013g0;
import G0.p;
import G4.a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p031f1.e;
import p131y1.f;

/* JADX INFO: loaded from: classes.dex */
public final class n implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f13431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q5.n f13432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f13434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f13435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f13436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f13437h;

    public n(Context context, p pVar) {
        q5.n nVar = o.f13438d;
        this.f13433d = new Object();
        a.n("Context cannot be null", context);
        this.f13430a = context.getApplicationContext();
        this.f13431b = pVar;
        this.f13432c = nVar;
    }

    @Override // p119w1.g
    public final void a(f fVar) {
        synchronized (this.f13433d) {
            this.f13437h = fVar;
        }
        synchronized (this.f13433d) {
            try {
                if (this.f13437h == null) {
                    return;
                }
                if (this.f13435f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f13436g = threadPoolExecutor;
                    this.f13435f = threadPoolExecutor;
                }
                this.f13435f.execute(new I3.a(13, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f13433d) {
            try {
                this.f13437h = null;
                Handler handler = this.f13434e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f13434e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f13436g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f13435f = null;
                this.f13436g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final e c() {
        try {
            q5.n nVar = this.f13432c;
            Context context = this.f13430a;
            p pVar = this.f13431b;
            nVar.getClass();
            K3.e eVarA = p031f1.a.a(context, pVar);
            int i = eVarA.f2138b;
            if (i != 0) {
                throw new RuntimeException(AbstractC0013g0.f(i, "fetchFonts failed (", ")"));
            }
            e[] eVarArr = (e[]) eVarA.f2139c;
            if (eVarArr == null || eVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return eVarArr[0];
        } catch (PackageManager.NameNotFoundException e6) {
            throw new RuntimeException("provider not found", e6);
        }
    }
}
