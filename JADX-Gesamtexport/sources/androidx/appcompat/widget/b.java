package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnKeyListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SearchView f6550h;

    public b(SearchView searchView) {
        this.f6550h = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchView searchView = this.f6550h;
        if (searchView.f6496i0 != null) {
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f6501w;
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                    view.cancelLongPress();
                    searchView.getContext().startActivity(searchView.h("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (searchView.f6496i0 != null && searchView.f6486V != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i == 66 || i == 84 || i == 61) {
                    searchView.k(searchAutoComplete.getListSelection());
                    return true;
                }
                if (i == 21 || i == 22) {
                    searchAutoComplete.setSelection(i == 21 ? 0 : searchAutoComplete.length());
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    c.b(searchAutoComplete, 1);
                    if (searchAutoComplete.enoughToFilter()) {
                        searchAutoComplete.showDropDown();
                    }
                    return true;
                }
                if (i == 19) {
                    searchAutoComplete.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}
