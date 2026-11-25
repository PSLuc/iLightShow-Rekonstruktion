package p057l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import j.a;
import java.util.ArrayList;
import p052k.j;
import p052k.k;
import p052k.q;
import p052k.u;

/* JADX INFO: loaded from: classes.dex */
public final class H0 implements q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j f9982h;
    public k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Toolbar f9983j;

    public H0(Toolbar toolbar) {
        this.f9983j = toolbar;
    }

    @Override // p052k.q
    public final boolean a(k kVar) {
        Toolbar toolbar = this.f9983j;
        toolbar.c();
        ViewParent parent = toolbar.f6534o.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f6534o);
            }
            toolbar.addView(toolbar.f6534o);
        }
        View view = kVar.f9893z;
        if (view == null) {
            view = null;
        }
        toolbar.f6535p = view;
        this.i = kVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f6535p);
            }
            I0 i0G = Toolbar.g();
            i0G.f9984a = (toolbar.f6540u & 112) | 8388611;
            i0G.f9985b = 2;
            toolbar.f6535p.setLayoutParams(i0G);
            toolbar.addView(toolbar.f6535p);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((I0) childAt.getLayoutParams()).f9985b != 2 && childAt != toolbar.f6528h) {
                toolbar.removeViewAt(childCount);
                toolbar.f6516L.add(childAt);
            }
        }
        toolbar.requestLayout();
        kVar.f9868B = true;
        kVar.f9881n.o(false);
        KeyEvent.Callback callback = toolbar.f6535p;
        if (callback instanceof a) {
            SearchView searchView = (SearchView) ((a) callback);
            if (!searchView.f6494g0) {
                searchView.f6494g0 = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f6501w;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f6495h0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        toolbar.s();
        return true;
    }

    @Override // p052k.q
    public final boolean b(u uVar) {
        return false;
    }

    @Override // p052k.q
    public final void c(j jVar, boolean z5) {
    }

    @Override // p052k.q
    public final boolean e(k kVar) {
        Toolbar toolbar = this.f9983j;
        KeyEvent.Callback callback = toolbar.f6535p;
        if (callback instanceof a) {
            SearchView searchView = (SearchView) ((a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f6501w;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f6493f0 = "";
            searchView.clearFocus();
            searchView.t(true);
            searchAutoComplete.setImeOptions(searchView.f6495h0);
            searchView.f6494g0 = false;
        }
        toolbar.removeView(toolbar.f6535p);
        toolbar.removeView(toolbar.f6534o);
        toolbar.f6535p = null;
        ArrayList arrayList = toolbar.f6516L;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.i = null;
        toolbar.requestLayout();
        kVar.f9868B = false;
        kVar.f9881n.o(false);
        toolbar.s();
        return true;
    }

    @Override // p052k.q
    public final void f() {
        if (this.i != null) {
            j jVar = this.f9982h;
            if (jVar != null) {
                int size = jVar.f9853f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f9982h.getItem(i) == this.i) {
                        return;
                    }
                }
            }
            e(this.i);
        }
    }

    @Override // p052k.q
    public final void i(Context context, j jVar) {
        k kVar;
        j jVar2 = this.f9982h;
        if (jVar2 != null && (kVar = this.i) != null) {
            jVar2.d(kVar);
        }
        this.f9982h = jVar;
    }

    @Override // p052k.q
    public final boolean j() {
        return false;
    }
}
