package p130y0;

import N.C0248x0;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class R0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f14288h;
    public final /* synthetic */ C0248x0 i;

    public R0(View view, C0248x0 c0248x0) {
        this.f14288h = view;
        this.i = c0248x0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f14288h.removeOnAttachStateChangeListener(this);
        this.i.s();
    }
}
