package p052k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements s, q, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Rect f9894h;

    public static int m(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i3 = 0;
        int i6 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = listAdapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i7, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    public static boolean u(j jVar) {
        int size = jVar.f9853f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = jVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p052k.q
    public final boolean a(k kVar) {
        return false;
    }

    @Override // p052k.q
    public final boolean e(k kVar) {
        return false;
    }

    @Override // p052k.q
    public final void i(Context context, j jVar) {
    }

    public abstract void l(j jVar);

    public abstract void n(View view);

    public abstract void o(boolean z5);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (h) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (h) listAdapter).f9842h.p((MenuItem) listAdapter.getItem(i), this, !(this instanceof g) ? 0 : 4);
    }

    public abstract void p(int i);

    public abstract void q(int i);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z5);

    public abstract void t(int i);
}
