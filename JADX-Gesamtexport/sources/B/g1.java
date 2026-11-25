package B;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g1 implements p113v0.F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f323c;

    public /* synthetic */ g1(Object obj, int i, Object obj2) {
        this.f321a = i;
        this.f322b = obj;
        this.f323c = obj2;
    }

    @Override // p113v0.F
    public final p113v0.G c(p113v0.H h6, List list, long j4) {
        switch (this.f321a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj = list.get(i);
                    if (!(((p113v0.E) obj).i() instanceof i1)) {
                        arrayList.add(obj);
                    }
                }
                List list2 = (List) ((D4.a) this.f323c).invoke();
                ArrayList arrayList2 = null;
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        p030f0.d dVar = (p030f0.d) list2.get(i3);
                        p084p4.h hVar = dVar != null ? new p084p4.h(((p113v0.E) arrayList.get(i3)).c(p081p0.c.u((int) Math.floor(dVar.c()), (int) Math.floor(dVar.b()), 5)), new S0.h(S1.h0.c(Math.round(dVar.f8839a), Math.round(dVar.f8840b)))) : null;
                        if (hVar != null) {
                            arrayList3.add(hVar);
                        }
                    }
                    arrayList2 = arrayList3;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    Object obj2 = list.get(i6);
                    if (((p113v0.E) obj2).i() instanceof i1) {
                        arrayList4.add(obj2);
                    }
                }
                return h6.u(S0.a.h(j4), S0.a.g(j4), p089q4.v.f11238h, new C0005c0(arrayList2, 5, AbstractC0029o0.l(arrayList4, (D4.a) this.f322b)));
            default:
                ((V0.y) this.f322b).setParentLayoutDirection((S0.k) this.f323c);
                return h6.u(0, 0, p089q4.v.f11238h, V0.c.f5411k);
        }
    }
}
