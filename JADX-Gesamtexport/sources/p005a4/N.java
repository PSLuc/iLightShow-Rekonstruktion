package p005a4;

import R3.d;
import R3.e;
import X3.b;

/* JADX INFO: loaded from: classes.dex */
public final class N extends d implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0402j f6212h;

    public N(C0402j c0402j) {
        this.f6212h = c0402j;
    }

    @Override // X3.b
    public final L a() {
        return new L(this.f6212h, false);
    }

    @Override // R3.d
    public final void c(e eVar) {
        this.f6212h.e(new M(eVar));
    }
}
