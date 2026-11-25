package p045i1;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: i1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0750k implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f9457h;
    public ViewTreeObserver i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Runnable f9458j;

    public ViewTreeObserverOnPreDrawListenerC0750k(View view, Runnable runnable) {
        this.f9457h = view;
        this.i = view.getViewTreeObserver();
        this.f9458j = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.i.isAlive();
        View view = this.f9457h;
        if (zIsAlive) {
            this.i.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f9458j.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.i = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.i.isAlive();
        View view2 = this.f9457h;
        if (zIsAlive) {
            this.i.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
