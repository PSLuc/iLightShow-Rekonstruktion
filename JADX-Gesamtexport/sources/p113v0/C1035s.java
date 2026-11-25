package p113v0;

import D4.f;
import S0.a;
import Z.n;
import p124x0.InterfaceC1114w;

/* JADX INFO: renamed from: v0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1035s extends n implements InterfaceC1114w {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public f f13179u;

    @Override // p124x0.InterfaceC1114w
    public final G e(H h6, E e6, long j4) {
        return (G) this.f13179u.c(h6, e6, new a(j4));
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f13179u + ')';
    }
}
