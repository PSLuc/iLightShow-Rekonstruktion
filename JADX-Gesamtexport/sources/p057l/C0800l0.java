package p057l;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: l.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0800l0 implements TextWatcher {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SearchView f10116h;

    public C0800l0(SearchView searchView) {
        this.f10116h = searchView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i3, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i3, int i6) {
        SearchView searchView = this.f10116h;
        Editable text = searchView.f6501w.getText();
        searchView.f6493f0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        searchView.s(!zIsEmpty);
        int i7 = 8;
        if (searchView.f6492e0 && !searchView.f6485U && zIsEmpty) {
            searchView.f6470B.setVisibility(8);
            i7 = 0;
        }
        searchView.f6472D.setVisibility(i7);
        searchView.o();
        searchView.r();
        charSequence.toString();
    }
}
