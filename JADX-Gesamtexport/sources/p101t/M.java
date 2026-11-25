package p101t;

import Z.n;
import p124x0.AbstractC1098f;
import p124x0.InterfaceC1108p;
import p124x0.Y;
import p124x0.p0;

/* JADX INFO: loaded from: classes.dex */
public final class M extends n implements p0, InterfaceC1108p {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final j0 f12254w = new j0(6);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12255u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Y f12256v;

    @Override // p124x0.InterfaceC1108p
    public final void A(Y y2) {
        N nY0;
        this.f12256v = y2;
        if (this.f12255u) {
            if (!y2.M0().f5969t) {
                N nY1 = y0();
                if (nY1 != null) {
                    nY1.y0(null);
                    return;
                }
                return;
            }
            Y y6 = this.f12256v;
            if (y6 == null || !y6.M0().f5969t || (nY0 = y0()) == null) {
                return;
            }
            nY0.y0(this.f12256v);
        }
    }

    @Override // p124x0.p0
    public final Object o() {
        return f12254w;
    }

    @Override // Z.n
    public final boolean o0() {
        return false;
    }

    public final N y0() {
        if (!this.f5969t) {
            return null;
        }
        p0 p0VarI = AbstractC1098f.i(this, N.f12257v);
        if (p0VarI instanceof N) {
            return (N) p0VarI;
        }
        return null;
    }
}
