package B;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: B.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0016i implements p113v0.F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0016i f329b = new C0016i(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0016i f330c = new C0016i(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f331a;

    public /* synthetic */ C0016i(int i) {
        this.f331a = i;
    }

    @Override // p113v0.F
    public final p113v0.G c(p113v0.H h6, List list, long j4) {
        switch (this.f331a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(((p113v0.E) list.get(i)).c(j4));
                }
                return h6.u(S0.a.h(j4), S0.a.g(j4), p089q4.v.f11238h, new C0014h(0, arrayList));
            default:
                return h6.u(S0.a.h(j4), S0.a.g(j4), p089q4.v.f11238h, C0022l.f354k);
        }
    }
}
