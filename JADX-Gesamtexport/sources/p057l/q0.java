package p057l;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SearchView f10137h;

    public q0(SearchView searchView) {
        this.f10137h = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        this.f10137h.k(i);
    }
}
