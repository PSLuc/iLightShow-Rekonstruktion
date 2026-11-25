package P4;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class G implements O {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4608h;

    public G(boolean z5) {
        this.f4608h = z5;
    }

    @Override // P4.O
    public final boolean b() {
        return this.f4608h;
    }

    @Override // P4.O
    public final d0 g() {
        return null;
    }

    public final String toString() {
        return AbstractC0013g0.m(new StringBuilder("Empty{"), this.f4608h ? "Active" : "New", '}');
    }
}
