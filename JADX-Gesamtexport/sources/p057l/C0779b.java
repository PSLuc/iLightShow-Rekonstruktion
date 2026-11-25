package p057l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: l.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0779b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f10041a;

    public C0779b(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f10041a = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f10041a;
        actionBarOverlayLayout.f6426A = null;
        actionBarOverlayLayout.f6439q = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f10041a;
        actionBarOverlayLayout.f6426A = null;
        actionBarOverlayLayout.f6439q = false;
    }
}
