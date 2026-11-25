package p052k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import p057l.C0788f0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9810h;
    public final /* synthetic */ l i;

    public /* synthetic */ c(l lVar, int i) {
        this.f9810h = i;
        this.i = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f9810h) {
            case 0:
                g gVar = (g) this.i;
                if (gVar.k()) {
                    ArrayList arrayList = gVar.f9830o;
                    if (arrayList.size() > 0) {
                        int i = 0;
                        if (!((f) arrayList.get(0)).f9816a.f10050B) {
                            View view = gVar.f9837v;
                            if (view != null && view.isShown()) {
                                int size = arrayList.size();
                                while (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    ((f) obj).f9816a.d();
                                }
                            } else {
                                gVar.dismiss();
                            }
                        }
                    }
                }
                break;
            default:
                t tVar = (t) this.i;
                if (tVar.k()) {
                    C0788f0 c0788f0 = tVar.f9912o;
                    if (!c0788f0.f10050B) {
                        View view2 = tVar.f9917t;
                        if (view2 != null && view2.isShown()) {
                            c0788f0.d();
                        } else {
                            tVar.dismiss();
                        }
                    }
                }
                break;
        }
    }
}
