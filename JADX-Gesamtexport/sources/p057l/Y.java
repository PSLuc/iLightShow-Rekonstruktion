package p057l;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0788f0 f10038a;

    public Y(C0788f0 c0788f0) {
        this.f10038a = c0788f0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i3, int i6) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            C0788f0 c0788f0 = this.f10038a;
            if (c0788f0.f10051C.getInputMethodMode() == 2 || c0788f0.f10051C.getContentView() == null) {
                return;
            }
            Handler handler = c0788f0.f10069y;
            W w6 = c0788f0.f10065u;
            handler.removeCallbacks(w6);
            w6.run();
        }
    }
}
