package p107u;

import A2.d;
import B.C0045x;
import B.V0;
import D4.a;
import D4.f;
import N.C0230o;
import N.C0235q0;
import X.s;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f12623a = new s();

    public static void b(g gVar, C0045x c0045x, boolean z5, a aVar) {
        gVar.getClass();
        gVar.f12623a.add(new V.a(262103052, new V0(c0045x, z5, aVar), true));
    }

    public final void a(a aVar, C0230o c0230o, int i) {
        c0230o.X(1320309496);
        int i3 = (c0230o.f(aVar) ? 4 : 2) | i | (c0230o.f(this) ? 32 : 16);
        if ((i3 & 19) == 18 && c0230o.B()) {
            c0230o.P();
        } else {
            s sVar = this.f12623a;
            int size = sVar.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((f) sVar.get(i6)).c(aVar, c0230o, Integer.valueOf(i3 & 14));
            }
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new d(i, 10, this, aVar);
        }
    }
}
