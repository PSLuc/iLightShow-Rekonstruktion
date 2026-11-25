package p123x;

import S0.b;
import Z.n;
import p124x0.i0;

/* JADX INFO: loaded from: classes.dex */
public final class J extends n implements i0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f13694u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13695v;

    @Override // p124x0.i0
    public final Object d0(b bVar, Object obj) {
        S s6 = obj instanceof S ? (S) obj : null;
        if (s6 == null) {
            s6 = new S();
        }
        s6.f13713a = this.f13694u;
        s6.f13714b = this.f13695v;
        return s6;
    }
}
