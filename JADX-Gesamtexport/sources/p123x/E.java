package p123x;

import S0.b;
import Z.e;
import Z.n;
import p124x0.i0;

/* JADX INFO: loaded from: classes.dex */
public final class E extends n implements i0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public e f13679u;

    @Override // p124x0.i0
    public final Object d0(b bVar, Object obj) {
        S s6 = obj instanceof S ? (S) obj : null;
        if (s6 == null) {
            s6 = new S();
        }
        s6.f13715c = new A(this.f13679u);
        return s6;
    }
}
