package p131y1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import q5.n;

/* JADX INFO: loaded from: classes.dex */
public final class d implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyListener f14582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f14583b;

    public d(KeyListener keyListener) {
        n nVar = new n(12);
        this.f14582a = keyListener;
        this.f14583b = nVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f14582a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f14582a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean zC;
        boolean z5;
        this.f14583b.getClass();
        if (i != 67) {
            zC = i != 112 ? false : p091r0.d.c(editable, keyEvent, true);
        } else {
            zC = p091r0.d.c(editable, keyEvent, false);
        }
        if (zC) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z5 = true;
        } else {
            z5 = false;
        }
        return z5 || this.f14582a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f14582a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f14582a.onKeyUp(view, editable, i, keyEvent);
    }
}
