package V0;

import B.C0003b0;
import N.C0208d;
import N.C0217h0;
import N.C0230o;
import N.C0235q0;
import N.U;
import android.content.Context;
import android.view.View;
import android.view.Window;
import p130y0.AbstractC1119a;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC1119a implements t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Window f5443p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0217h0 f5444q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5445r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5446s;

    public r(Context context, Window window) {
        super(context);
        this.f5443p = window;
        this.f5444q = C0208d.K(p.f5441a, U.f3673m);
    }

    @Override // p130y0.AbstractC1119a
    public final void a(int i, C0230o c0230o) {
        c0230o.X(1735448596);
        if ((((c0230o.h(this) ? 4 : 2) | i) & 3) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            ((D4.e) this.f5444q.getValue()).d(c0230o, 0);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0003b0(i, 13, this);
        }
    }

    @Override // p130y0.AbstractC1119a
    public final void d(int i, int i3, int i6, int i7, boolean z5) {
        View childAt;
        super.d(i, i3, i6, i7, z5);
        if (this.f5445r || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f5443p.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // p130y0.AbstractC1119a
    public final void e(int i, int i3) {
        if (this.f5445r) {
            super.e(i, i3);
            return;
        }
        super.e(View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }

    @Override // p130y0.AbstractC1119a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f5446s;
    }
}
