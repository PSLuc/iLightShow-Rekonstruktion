package p057l;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import p052k.k;

/* JADX INFO: loaded from: classes.dex */
public final class F0 implements View.OnClickListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9979h = 0;
    public final /* synthetic */ Object i;

    public F0(L0 l6) {
        this.i = l6;
        l6.f9993a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9979h) {
            case 0:
                H0 h1 = ((Toolbar) this.i).f6522R;
                k kVar = h1 == null ? null : h1.i;
                if (kVar != null) {
                    kVar.collapseActionView();
                }
                break;
            default:
                L0 l6 = (L0) this.i;
                if (l6.f10002k != null) {
                    l6.getClass();
                }
                break;
        }
    }

    public F0(Toolbar toolbar) {
        this.i = toolbar;
    }
}
