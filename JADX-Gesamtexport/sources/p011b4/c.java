package p011b4;

import R3.d;
import R3.e;
import V3.b;
import X3.f;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f7108h;

    public c(Object obj) {
        this.f7108h = obj;
    }

    @Override // R3.d
    public final void c(e eVar) {
        eVar.d(b.f5509h);
        eVar.f(this.f7108h);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f7108h;
    }
}
