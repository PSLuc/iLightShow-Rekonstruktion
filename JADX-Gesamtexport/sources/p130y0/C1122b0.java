package p130y0;

import B.C0003b0;
import D4.e;
import N.C0208d;
import N.C0217h0;
import N.C0230o;
import N.C0235q0;
import N.U;
import com.nanjoran.ilightshow.MainActivity;

/* JADX INFO: renamed from: y0.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1122b0 extends AbstractC1119a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0217h0 f14353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14354q;

    public C1122b0(MainActivity mainActivity) {
        super(mainActivity);
        this.f14353p = C0208d.K(null, U.f3673m);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // p130y0.AbstractC1119a
    public final void a(int i, C0230o c0230o) {
        c0230o.X(420213850);
        if ((((c0230o.h(this) ? 4 : 2) | i) & 3) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            e eVar = (e) this.f14353p.getValue();
            if (eVar == null) {
                c0230o.V(358373017);
            } else {
                c0230o.V(150107752);
                eVar.d(c0230o, 0);
            }
            c0230o.p(false);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0003b0(i, 25, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C1122b0.class.getName();
    }

    @Override // p130y0.AbstractC1119a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f14354q;
    }

    public final void setContent(e eVar) {
        this.f14354q = true;
        this.f14353p.setValue(eVar);
        if (isAttachedToWindow()) {
            if (this.f14340k == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            c();
        }
    }
}
