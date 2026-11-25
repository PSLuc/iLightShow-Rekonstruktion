package p057l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p052k.h;
import p052k.j;
import p052k.k;

/* JADX INFO: renamed from: l.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0786e0 extends N {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f10043t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f10044u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC0778a0 f10045v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k f10046w;

    public C0786e0(Context context, boolean z5) {
        super(context, z5);
        if (1 == AbstractC0784d0.a(context.getResources().getConfiguration())) {
            this.f10043t = 21;
            this.f10044u = 22;
        } else {
            this.f10043t = 22;
            this.f10044u = 21;
        }
    }

    @Override // p057l.N, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        h hVar;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f10045v != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                hVar = (h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (h) adapter;
                headersCount = 0;
            }
            k item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= hVar.getCount()) ? null : hVar.getItem(i);
            k kVar = this.f10046w;
            if (kVar != item) {
                j jVar = hVar.f9842h;
                if (kVar != null) {
                    this.f10045v.h(jVar, kVar);
                }
                this.f10046w = item;
                if (item != null) {
                    this.f10045v.e(jVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f10043t) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f10044u) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (h) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (h) adapter).f9842h.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC0778a0 interfaceC0778a0) {
        this.f10045v = interfaceC0778a0;
    }

    @Override // p057l.N, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
