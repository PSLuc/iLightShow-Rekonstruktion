package p101t;

import B.J0;
import D4.c;
import N.C0211e0;
import S0.a;
import X.AbstractC0391h;
import X.t;
import Z.n;
import p089q4.v;
import p112v.W;
import p113v0.E;
import p113v0.G;
import p113v0.H;
import p113v0.N;
import p124x0.InterfaceC1114w;
import p124x0.M;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends n implements InterfaceC1114w {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public s0 f12430u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12431v;

    @Override // p124x0.InterfaceC1114w
    public final int c(M m6, E e6, int i) {
        return this.f12431v ? e6.Z(i) : e6.Z(Integer.MAX_VALUE);
    }

    @Override // p124x0.InterfaceC1114w
    public final int d(M m6, E e6, int i) {
        return this.f12431v ? e6.U(Integer.MAX_VALUE) : e6.U(i);
    }

    @Override // p124x0.InterfaceC1114w
    public final G e(H h6, E e6, long j4) {
        boolean z5 = this.f12431v;
        W w6 = W.f12920h;
        if ((z5 ? w6 : W.i) == w6) {
            if (a.g(j4) == Integer.MAX_VALUE) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (a.h(j4) == Integer.MAX_VALUE) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
        N nC = e6.c(a.a(j4, 0, this.f12431v ? a.h(j4) : Integer.MAX_VALUE, 0, this.f12431v ? Integer.MAX_VALUE : a.g(j4), 5));
        int i = nC.f13137h;
        int iH = a.h(j4);
        if (i > iH) {
            i = iH;
        }
        int i3 = nC.i;
        int iG = a.g(j4);
        if (i3 > iG) {
            i3 = iG;
        }
        int i6 = nC.i - i3;
        int i7 = nC.f13137h - i;
        if (!this.f12431v) {
            i6 = i7;
        }
        s0 s0Var = this.f12430u;
        C0211e0 c0211e0 = s0Var.f12420d;
        C0211e0 c0211e1 = s0Var.f12417a;
        c0211e0.j(i6);
        AbstractC0391h abstractC0391hD = t.d();
        c cVarF = abstractC0391hD != null ? abstractC0391hD.f() : null;
        AbstractC0391h abstractC0391hE = t.e(abstractC0391hD);
        try {
            if (c0211e1.h() > i6) {
                c0211e1.j(i6);
            }
            t.g(abstractC0391hD, abstractC0391hE, cVarF);
            this.f12430u.f12418b.j(this.f12431v ? i3 : i);
            return h6.u(i, i3, v.f11238h, new J0(i6, 2, this, nC));
        } catch (Throwable th) {
            t.g(abstractC0391hD, abstractC0391hE, cVarF);
            throw th;
        }
    }

    @Override // p124x0.InterfaceC1114w
    public final int h(M m6, E e6, int i) {
        return this.f12431v ? e6.Y(Integer.MAX_VALUE) : e6.Y(i);
    }

    @Override // p124x0.InterfaceC1114w
    public final int i(M m6, E e6, int i) {
        return this.f12431v ? e6.d(i) : e6.d(Integer.MAX_VALUE);
    }
}
