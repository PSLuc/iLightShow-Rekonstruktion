package p045i1;

import android.view.View;
import android.view.Window;
import p020d2.n;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Window f9453k;

    public d0(Window window) {
        this.f9453k = window;
    }

    @Override // p020d2.n
    public final boolean B() {
        return (this.f9453k.getDecorView().getSystemUiVisibility() & 16) != 0;
    }

    @Override // p020d2.n
    public final boolean C() {
        return (this.f9453k.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // p020d2.n
    public final void J(boolean z5) {
        Window window = this.f9453k;
        if (!z5) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }

    @Override // p020d2.n
    public final void K(boolean z5) {
        Window window = this.f9453k;
        if (!z5) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
