package p052k;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class m implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f9895h;

    public m(o oVar) {
        this.f9895h = oVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f9895h.c();
    }
}
