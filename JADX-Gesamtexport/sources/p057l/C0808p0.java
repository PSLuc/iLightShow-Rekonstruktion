package p057l;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: l.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0808p0 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f10134a;

    public C0808p0(SearchView searchView) {
        this.f10134a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f10134a.n();
        return true;
    }
}
