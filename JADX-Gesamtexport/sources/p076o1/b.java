package p076o1;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p012c.k;
import p057l.X;
import p057l.y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10619h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Cursor f10620j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10621k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f10622l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public X f10623m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f10624n;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f10620j;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f10622l;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                X x6 = this.f10623m;
                if (x6 != null) {
                    cursor2.unregisterDataSetObserver(x6);
                }
            }
            this.f10620j = cursor;
            if (cursor != null) {
                a aVar2 = this.f10622l;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                X x7 = this.f10623m;
                if (x7 != null) {
                    cursor.registerDataSetObserver(x7);
                }
                this.f10621k = cursor.getColumnIndexOrThrow("_id");
                this.f10619h = true;
                notifyDataSetChanged();
            } else {
                this.f10621k = -1;
                this.f10619h = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f10619h || (cursor = this.f10620j) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f10619h) {
            return null;
        }
        this.f10620j.moveToPosition(i);
        if (view == null) {
            y0 y0Var = (y0) this;
            view = y0Var.f10175q.inflate(y0Var.f10174p, viewGroup, false);
        }
        a(view, this.f10620j);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f10624n == null) {
            c cVar = new c();
            cVar.f10625a = this;
            this.f10624n = cVar;
        }
        return this.f10624n;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f10619h || (cursor = this.f10620j) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f10620j;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f10619h && (cursor = this.f10620j) != null && cursor.moveToPosition(i)) {
            return this.f10620j.getLong(this.f10621k);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f10619h) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f10620j.moveToPosition(i)) {
            throw new IllegalStateException(k.r(i, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f10620j);
        return view;
    }
}
