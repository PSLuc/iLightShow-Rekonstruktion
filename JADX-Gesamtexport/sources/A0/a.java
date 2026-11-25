package A0;

import B.O;
import E4.k;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import p030f0.d;
import p058l0.I;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f7a;

    public a(b bVar) {
        this.f7a = bVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        b bVar = this.f7a;
        bVar.getClass();
        k.c(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            O o6 = (O) bVar.f10c;
            if (o6 != null) {
                o6.invoke();
            }
        } else if (itemId == 1) {
            O o7 = (O) bVar.f11d;
            if (o7 != null) {
                o7.invoke();
            }
        } else if (itemId == 2) {
            O o8 = (O) bVar.f12e;
            if (o8 != null) {
                o8.invoke();
            }
        } else {
            if (itemId != 3) {
                return false;
            }
            O o9 = (O) bVar.f13f;
            if (o9 != null) {
                o9.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        b bVar = this.f7a;
        bVar.getClass();
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (((O) bVar.f10c) != null) {
            b.z(1, menu);
        }
        if (((O) bVar.f11d) != null) {
            b.z(2, menu);
        }
        if (((O) bVar.f12e) != null) {
            b.z(3, menu);
        }
        if (((O) bVar.f13f) != null) {
            b.z(4, menu);
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ((I) this.f7a.f8a).invoke();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        d dVar = (d) this.f7a.f9b;
        if (rect != null) {
            rect.set((int) dVar.f8839a, (int) dVar.f8840b, (int) dVar.f8841c, (int) dVar.f8842d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        b bVar = this.f7a;
        bVar.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        b.B(menu, 1, (O) bVar.f10c);
        b.B(menu, 2, (O) bVar.f11d);
        b.B(menu, 3, (O) bVar.f12e);
        b.B(menu, 4, (O) bVar.f13f);
        return true;
    }
}
