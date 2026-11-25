package p052k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f9842h;
    public int i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f9844k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LayoutInflater f9845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9846m;

    public h(j jVar, LayoutInflater layoutInflater, boolean z5, int i) {
        this.f9844k = z5;
        this.f9845l = layoutInflater;
        this.f9842h = jVar;
        this.f9846m = i;
        a();
    }

    public final void a() {
        j jVar = this.f9842h;
        k kVar = jVar.f9865s;
        if (kVar != null) {
            jVar.i();
            ArrayList arrayList = jVar.f9856j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((k) arrayList.get(i)) == kVar) {
                    this.i = i;
                    return;
                }
            }
        }
        this.i = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k getItem(int i) {
        ArrayList arrayListK;
        j jVar = this.f9842h;
        if (this.f9844k) {
            jVar.i();
            arrayListK = jVar.f9856j;
        } else {
            arrayListK = jVar.k();
        }
        int i3 = this.i;
        if (i3 >= 0 && i >= i3) {
            i++;
        }
        return (k) arrayListK.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListK;
        j jVar = this.f9842h;
        if (this.f9844k) {
            jVar.i();
            arrayListK = jVar.f9856j;
        } else {
            arrayListK = jVar.k();
        }
        return this.i < 0 ? arrayListK.size() : arrayListK.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z5 = false;
        if (view == null) {
            view = this.f9845l.inflate(this.f9846m, viewGroup, false);
        }
        int i3 = getItem(i).f9870b;
        int i6 = i - 1;
        int i7 = i6 >= 0 ? getItem(i6).f9870b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f9842h.l() && i3 != i7) {
            z5 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z5);
        r rVar = (r) view;
        if (this.f9843j) {
            listMenuItemView.setForceShowIcon(true);
        }
        rVar.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
