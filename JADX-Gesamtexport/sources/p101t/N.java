package p101t;

import Z.n;
import p090r.v;
import p113v0.InterfaceC1033p;
import p124x0.AbstractC1098f;
import p124x0.p0;

/* JADX INFO: loaded from: classes.dex */
public final class N extends n implements p0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j0 f12257v = new j0(7);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public v f12258u;

    @Override // p124x0.p0
    public final Object o() {
        return f12257v;
    }

    public final void y0(InterfaceC1033p interfaceC1033p) {
        this.f12258u.invoke(interfaceC1033p);
        N n6 = (N) AbstractC1098f.j(this);
        if (n6 != null) {
            n6.y0(interfaceC1033p);
        }
    }
}
