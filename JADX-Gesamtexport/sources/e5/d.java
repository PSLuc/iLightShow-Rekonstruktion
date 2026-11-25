package e5;

import O1.B;

/* JADX INFO: loaded from: classes.dex */
public final class d extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8759c;

    public d(K3.e eVar, boolean z5) {
        super(eVar);
        this.f8759c = z5;
    }

    @Override // O1.B
    public final void i(String str) {
        E4.k.f("value", str);
        if (this.f8759c) {
            super.i(str);
        } else {
            g(str);
        }
    }
}
