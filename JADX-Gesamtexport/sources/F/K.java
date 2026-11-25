package F;

import B.C0014h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class K implements p113v0.F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K f1103a = new K();

    @Override // p113v0.F
    public final p113v0.G c(p113v0.H h6, List list, long j4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer numValueOf = 0;
        for (int i = 0; i < size; i++) {
            arrayList.add(((p113v0.E) list.get(i)).c(j4));
        }
        int size2 = arrayList.size();
        Integer numValueOf2 = numValueOf;
        for (int i3 = 0; i3 < size2; i3++) {
            numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((p113v0.N) arrayList.get(i3)).f13137h));
        }
        int iIntValue = numValueOf2.intValue();
        int size3 = arrayList.size();
        for (int i6 = 0; i6 < size3; i6++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((p113v0.N) arrayList.get(i6)).i));
        }
        return h6.u(iIntValue, numValueOf.intValue(), p089q4.v.f11238h, new C0014h(2, arrayList));
    }
}
