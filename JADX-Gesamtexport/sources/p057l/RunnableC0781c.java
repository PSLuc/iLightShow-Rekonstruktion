package p057l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: l.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0781c implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10042h;
    public final /* synthetic */ ActionBarOverlayLayout i;

    public /* synthetic */ RunnableC0781c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f10042h = i;
        this.i = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10042h) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.i;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f6426A = actionBarOverlayLayout.f6432j.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f6427B);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.i;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f6426A = actionBarOverlayLayout2.f6432j.animate().translationY(-actionBarOverlayLayout2.f6432j.getHeight()).setListener(actionBarOverlayLayout2.f6427B);
                break;
        }
    }
}
