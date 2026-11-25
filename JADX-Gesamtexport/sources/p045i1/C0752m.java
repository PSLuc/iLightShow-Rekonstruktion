package p045i1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;
import p035g0.C0715p;

/* JADX INFO: renamed from: i1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0752m extends C0715p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f9460j;

    @Override // p035g0.C0715p
    public final void A() {
        View view = this.f9460j;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.A();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [i1.l] */
    @Override // p035g0.C0715p
    public final void s() {
        View view = this.f9460j;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.s();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r6 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: i1.l
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                atomicBoolean.set((i & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(r6);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(r6);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }
}
