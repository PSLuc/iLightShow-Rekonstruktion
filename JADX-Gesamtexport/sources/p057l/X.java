package p057l;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
public final class X extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10037b;

    public /* synthetic */ X(int i, Object obj) {
        this.f10036a = i;
        this.f10037b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f10036a) {
            case 0:
                C0788f0 c0788f0 = (C0788f0) this.f10037b;
                if (c0788f0.f10051C.isShowing()) {
                    c0788f0.d();
                }
                break;
            default:
                y0 y0Var = (y0) this.f10037b;
                y0Var.f10619h = true;
                y0Var.notifyDataSetChanged();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f10036a) {
            case 0:
                ((C0788f0) this.f10037b).dismiss();
                break;
            default:
                y0 y0Var = (y0) this.f10037b;
                y0Var.f10619h = false;
                y0Var.notifyDataSetInvalidated();
                break;
        }
    }
}
