package p045i1;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p020d2.n;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final WindowInsetsController f9454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Window f9455l;

    public e0(Window window) {
        this.f9454k = window.getInsetsController();
        this.f9455l = window;
    }

    @Override // p020d2.n
    public final boolean B() {
        this.f9454k.setSystemBarsAppearance(0, 0);
        return (this.f9454k.getSystemBarsAppearance() & 16) != 0;
    }

    @Override // p020d2.n
    public final boolean C() {
        this.f9454k.setSystemBarsAppearance(0, 0);
        return (this.f9454k.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // p020d2.n
    public final void J(boolean z5) {
        Window window = this.f9455l;
        if (z5) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f9454k.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f9454k.setSystemBarsAppearance(0, 16);
    }

    @Override // p020d2.n
    public final void K(boolean z5) {
        Window window = this.f9455l;
        if (z5) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f9454k.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f9454k.setSystemBarsAppearance(0, 8);
    }
}
