package p057l;

import p045i1.A;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;

/* JADX INFO: loaded from: classes.dex */
public final class W implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10035h;
    public final /* synthetic */ C0788f0 i;

    public /* synthetic */ W(C0788f0 c0788f0, int i) {
        this.f10035h = i;
        this.i = c0788f0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0788f0 c0788f0 = this.i;
        switch (this.f10035h) {
            case 0:
                C0786e0 c0786e0 = c0788f0.f10054j;
                if (c0786e0 != null) {
                    c0786e0.setListSelectionHidden(true);
                    c0786e0.requestLayout();
                }
                break;
            default:
                C0786e0 c0786e1 = c0788f0.f10054j;
                if (c0786e1 != null) {
                    ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
                    if (c0786e1.isAttachedToWindow() && c0788f0.f10054j.getCount() > c0788f0.f10054j.getChildCount() && c0788f0.f10054j.getChildCount() <= Integer.MAX_VALUE) {
                        c0788f0.f10051C.setInputMethodMode(2);
                        c0788f0.d();
                        break;
                    }
                }
                break;
        }
    }
}
