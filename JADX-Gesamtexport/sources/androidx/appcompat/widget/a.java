package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SearchView f6549h;

    public a(SearchView searchView) {
        this.f6549h = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f6549h;
        ImageView imageView = searchView.f6469A;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f6501w;
        if (view == imageView) {
            searchView.t(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f6483S;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f6471C) {
            searchView.j();
            return;
        }
        if (view == searchView.f6470B) {
            searchView.n();
            return;
        }
        if (view != searchView.f6472D) {
            if (view == searchAutoComplete) {
                c.a(searchAutoComplete);
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f6496i0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.i(searchView.f6480P, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f6479O);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
        }
    }
}
