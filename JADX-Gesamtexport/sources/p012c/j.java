package p012c;

import E4.k;
import I3.a;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7143h = SystemClock.uptimeMillis() + ((long) 10000);
    public Runnable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n f7145k;

    public j(n nVar) {
        this.f7145k = nVar;
    }

    public final void a(View view) {
        if (this.f7144j) {
            return;
        }
        this.f7144j = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        k.f("runnable", runnable);
        this.i = runnable;
        View decorView = this.f7145k.getWindow().getDecorView();
        k.e("window.decorView", decorView);
        if (!this.f7144j) {
            decorView.postOnAnimation(new a(9, this));
        } else if (k.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z5;
        Runnable runnable = this.i;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f7143h) {
                this.f7144j = false;
                this.f7145k.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.i = null;
        t tVar = (t) this.f7145k.f7161n.getValue();
        synchronized (tVar.f7176a) {
            z5 = tVar.f7177b;
        }
        if (z5) {
            this.f7144j = false;
            this.f7145k.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7145k.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
