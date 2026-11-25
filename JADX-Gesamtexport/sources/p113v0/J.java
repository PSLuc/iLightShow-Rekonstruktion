package p113v0;

import D4.c;
import S0.j;
import Z.n;
import p124x0.InterfaceC1113v;

/* JADX INFO: loaded from: classes.dex */
public final class J extends n implements InterfaceC1113v {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f13133u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f13134v;

    @Override // Z.n
    public final boolean o0() {
        return true;
    }

    @Override // p124x0.InterfaceC1113v
    public final void r(long j4) {
        if (j.a(this.f13134v, j4)) {
            return;
        }
        this.f13133u.invoke(new j(j4));
        this.f13134v = j4;
    }
}
