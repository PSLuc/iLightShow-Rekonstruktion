package p057l;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: l.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC0804n0 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f10127a;

    public ViewOnFocusChangeListenerC0804n0(SearchView searchView) {
        this.f10127a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z5) {
        SearchView searchView = this.f10127a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f6482R;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z5);
        }
    }
}
