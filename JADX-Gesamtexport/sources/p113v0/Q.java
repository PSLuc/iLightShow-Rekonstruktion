package p113v0;

import B.C0014h;
import B.Y0;
import S0.a;
import java.util.ArrayList;
import java.util.List;
import p081p0.c;
import p089q4.v;
import p124x0.B;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Q f13145b = new Q("Undefined intrinsics block and it is required");

    @Override // p113v0.F
    public final G c(H h6, List list, long j4) {
        boolean zIsEmpty = list.isEmpty();
        v vVar = v.f11238h;
        if (zIsEmpty) {
            return h6.u(a.j(j4), a.i(j4), vVar, O.f13141j);
        }
        if (list.size() == 1) {
            N nC = ((E) list.get(0)).c(j4);
            return h6.u(c.U(nC.f13137h, j4), c.T(nC.i, j4), vVar, new Y0(nC, 7));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((E) list.get(i)).c(j4));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            N n6 = (N) arrayList.get(i3);
            iMax = Math.max(n6.f13137h, iMax);
            iMax2 = Math.max(n6.i, iMax2);
        }
        return h6.u(c.U(iMax, j4), c.T(iMax2, j4), vVar, new C0014h(6, arrayList));
    }
}
