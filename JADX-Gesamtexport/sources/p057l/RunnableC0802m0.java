package p057l;

import androidx.appcompat.widget.SearchView;
import p076o1.b;

/* JADX INFO: renamed from: l.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0802m0 implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10120h;
    public final /* synthetic */ SearchView i;

    public /* synthetic */ RunnableC0802m0(SearchView searchView, int i) {
        this.f10120h = i;
        this.i = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10120h) {
            case 0:
                this.i.p();
                break;
            default:
                b bVar = this.i.f6486V;
                if (bVar instanceof y0) {
                    bVar.b(null);
                }
                break;
        }
    }
}
