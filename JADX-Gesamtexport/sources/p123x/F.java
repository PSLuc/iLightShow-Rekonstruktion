package p123x;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import p045i1.InterfaceC0749j;
import p045i1.O;
import p045i1.Z;
import p045i1.c0;

/* JADX INFO: loaded from: classes.dex */
public final class F implements Runnable, InterfaceC0749j, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WindowInsets f13680h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0 f13681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13683l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c0 f13684m;

    public F(b0 b0Var) {
        this.i = !b0Var.f13753r ? 1 : 0;
        this.f13681j = b0Var;
    }

    public final c0 a(View view, c0 c0Var) {
        this.f13684m = c0Var;
        b0 b0Var = this.f13681j;
        b0Var.getClass();
        Z z5 = c0Var.f9452a;
        b0Var.f13751p.f(AbstractC1070c.f(z5.f(8)));
        if (this.f13682k) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f13683l) {
            b0Var.f13752q.f(AbstractC1070c.f(z5.f(8)));
            b0.a(b0Var, c0Var);
        }
        return b0Var.f13753r ? c0.f9451b : c0Var;
    }

    public final void b(O o6) {
        this.f13682k = false;
        this.f13683l = false;
        c0 c0Var = this.f13684m;
        if (o6.f9415a.a() != 0 && c0Var != null) {
            b0 b0Var = this.f13681j;
            b0Var.getClass();
            Z z5 = c0Var.f9452a;
            b0Var.f13752q.f(AbstractC1070c.f(z5.f(8)));
            b0Var.f13751p.f(AbstractC1070c.f(z5.f(8)));
            b0.a(b0Var, c0Var);
        }
        this.f13684m = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f13682k) {
            this.f13682k = false;
            this.f13683l = false;
            c0 c0Var = this.f13684m;
            if (c0Var != null) {
                b0 b0Var = this.f13681j;
                b0Var.getClass();
                b0Var.f13752q.f(AbstractC1070c.f(c0Var.f9452a.f(8)));
                b0.a(b0Var, c0Var);
                this.f13684m = null;
            }
        }
    }
}
