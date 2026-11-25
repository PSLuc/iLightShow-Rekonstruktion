package p045i1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class I extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f9401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f9402b;

    public I(View view, O o6) {
        this.f9401a = o6;
        this.f9402b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        O o6 = this.f9401a;
        o6.f9415a.c(1.0f);
        K.d(this.f9402b, o6);
    }
}
