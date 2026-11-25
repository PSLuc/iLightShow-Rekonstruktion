package p109u2;

import java.io.Serializable;
import p015c2.A;
import p104t2.b;
import p115v2.e;
import p115v2.o;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient Serializable f12708h;

    public n(int i, int i3) {
        e eVar = new e();
        eVar.f13222c = -1L;
        eVar.f13221b = 16;
        eVar.f13220a = 16;
        boolean z5 = i >= 0;
        int i6 = o.f13236v;
        if (!z5) {
            throw new IllegalArgumentException();
        }
        eVar.f13221b = i;
        long j4 = i3;
        if (j4 < 0) {
            throw new IllegalArgumentException();
        }
        eVar.f13222c = j4;
        eVar.f13220a = 4;
        if (j4 < 0) {
            throw new IllegalStateException();
        }
        this.f12708h = new o(eVar);
    }

    public A a(Class cls, p026e2.o oVar) {
        b bVar = new b(cls);
        n nVar = (n) this.f12708h;
        A a6 = (A) ((o) nVar.f12708h).get(bVar);
        if (a6 != null) {
            return a6;
        }
        A aO = oVar.d().O(oVar.j(cls).f9566e);
        if (aO == null || aO.f7195h.isEmpty()) {
            aO = A.a(cls.getSimpleName());
        }
        ((o) nVar.f12708h).g(bVar, aO, false);
        return aO;
    }
}
