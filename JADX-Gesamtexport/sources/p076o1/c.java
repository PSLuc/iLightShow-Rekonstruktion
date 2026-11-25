package p076o1;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import p057l.y0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f10625a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((y0) this.f10625a).c((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String string;
        Cursor cursorG;
        y0 y0Var = (y0) this.f10625a;
        if (charSequence == null) {
            string = "";
        } else {
            y0Var.getClass();
            string = charSequence.toString();
        }
        SearchView searchView = y0Var.f10176r;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorG = y0Var.g(y0Var.f10177s, string);
                if (cursorG != null) {
                    cursorG.getCount();
                } else {
                    cursorG = null;
                }
            } catch (RuntimeException unused) {
            }
        } else {
            cursorG = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorG != null) {
            filterResults.count = cursorG.getCount();
            filterResults.values = cursorG;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        b bVar = this.f10625a;
        Cursor cursor = bVar.f10620j;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((y0) bVar).b((Cursor) obj);
    }
}
