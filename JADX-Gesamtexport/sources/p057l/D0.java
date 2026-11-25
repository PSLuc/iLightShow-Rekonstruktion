package p057l;

import androidx.appcompat.widget.Toolbar;
import p052k.k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D0 implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9969h;
    public final /* synthetic */ Toolbar i;

    public /* synthetic */ D0(Toolbar toolbar, int i) {
        this.f9969h = i;
        this.i = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9969h) {
            case 0:
                H0 h1 = this.i.f6522R;
                k kVar = h1 == null ? null : h1.i;
                if (kVar != null) {
                    kVar.collapseActionView();
                }
                break;
            default:
                this.i.l();
                break;
        }
    }
}
