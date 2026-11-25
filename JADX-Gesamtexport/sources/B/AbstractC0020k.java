package B;

import G0.C0108d;
import G0.C0110f;
import N.C0208d;
import N.C0230o;
import N.C0235q0;
import N.InterfaceC0225l0;
import java.util.List;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: renamed from: B.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0020k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p084p4.h f349a;

    static {
        p089q4.u uVar = p089q4.u.f11237h;
        f349a = new p084p4.h(uVar, uVar);
    }

    public static final void a(C0110f c0110f, List list, C0230o c0230o, int i) {
        c0230o.X(-1794596951);
        int i3 = (i & 6) == 0 ? (c0230o.f(c0110f) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= c0230o.h(list) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && c0230o.B()) {
            c0230o.P();
        } else {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0108d c0108d = (C0108d) list.get(i6);
                D4.f fVar = (D4.f) c0108d.f1490a;
                C0016i c0016i = C0016i.f329b;
                Z.l lVar = Z.l.f5957a;
                int i7 = c0230o.f3744P;
                InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
                Z.o oVarC = Z.a.c(c0230o, lVar);
                InterfaceC1102j.f14043g.getClass();
                C1106n c1106n = C1101i.f14038b;
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(C1101i.f14041e, c0230o, c0016i);
                C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
                C1100h c1100h = C1101i.f14042f;
                if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i7))) {
                    p012c.k.y(i7, c0230o, i7, c1100h);
                }
                C0208d.R(C1101i.f14039c, c0230o, oVarC);
                fVar.c(c0110f.subSequence(c0108d.f1491b, c0108d.f1492c).f1494h, c0230o, 0);
                c0230o.p(true);
            }
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0018j(i, 0, c0110f, list);
        }
    }
}
