package p118w0;

import p123x.G;
import p123x.a0;
import p123x.d0;
import x5.b;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public G f13399a;

    @Override // x5.b
    public final boolean a(g gVar) {
        this.f13399a.getClass();
        return gVar == d0.f13765a;
    }

    @Override // x5.b
    public final Object d(g gVar) {
        this.f13399a.getClass();
        if (gVar == d0.f13765a) {
            return (a0) this.f13399a.f13687c.getValue();
        }
        p027e3.a.y0("Check failed.");
        throw null;
    }
}
