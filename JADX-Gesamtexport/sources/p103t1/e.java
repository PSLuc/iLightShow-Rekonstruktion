package p103t1;

import D4.a;
import E4.l;
import W2.g;
import h5.C;
import i5.c;
import p084p4.x;
import p085q.b;

/* JADX INFO: loaded from: classes.dex */
public final class e extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12454h;
    public final /* synthetic */ f i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i) {
        super(0);
        this.f12454h = i;
        this.i = fVar;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f12454h) {
            case 0:
                f fVar = this.i;
                C c6 = (C) fVar.f12459c.invoke();
                if (c.a(c6) != -1) {
                    return g.k(c6.f9310h.q(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + fVar.f12459c + ", instead got " + c6).toString());
            default:
                b bVar = f.f12456f;
                f fVar2 = this.i;
                synchronized (bVar) {
                    f.f12455e.remove(((C) fVar2.f12460d.getValue()).f9310h.q());
                }
                return x.f10867a;
        }
    }
}
