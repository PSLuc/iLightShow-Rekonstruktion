package N;

import O1.C0308a;

/* JADX INFO: loaded from: classes.dex */
public final class U implements p111u4.h, L0 {
    public static final /* synthetic */ U i = new U(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final U f3670j = new U(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final U f3671k = new U(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final U f3672l = new U(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final U f3673m = new U(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3674h;

    public /* synthetic */ U(int i3) {
        this.f3674h = i3;
    }

    public static final void b(U u6) {
        S4.P p6;
        Object obj;
        T.b bVar;
        S4.P p7 = C0248x0.f3852v;
        do {
            p6 = C0248x0.f3852v;
            obj = (Q.e) p6.getValue();
            bVar = (T.b) obj;
            S.c cVarB = bVar.f5144j;
            T.a aVar = (T.a) cVarB.get(u6);
            if (aVar != null) {
                int iHashCode = u6 != null ? u6.hashCode() : 0;
                S.n nVar = cVarB.f4857h;
                S.n nVarV = nVar.v(iHashCode, u6, 0);
                if (nVar != nVarV) {
                    cVarB = nVarV == null ? S.c.f4856j : new S.c(nVarV, cVarB.i - 1);
                }
                U.b bVar2 = U.b.f5303a;
                Object obj2 = aVar.f5140a;
                boolean z5 = obj2 != bVar2;
                Object obj3 = aVar.f5141b;
                if (z5) {
                    Object obj4 = cVarB.get(obj2);
                    E4.k.c(obj4);
                    cVarB = cVarB.b(obj2, new T.a(((T.a) obj4).f5140a, obj3));
                }
                if (obj3 != bVar2) {
                    Object obj5 = cVarB.get(obj3);
                    E4.k.c(obj5);
                    cVarB = cVarB.b(obj3, new T.a(obj2, ((T.a) obj5).f5141b));
                }
                Object obj6 = obj2 != bVar2 ? bVar.f5143h : obj3;
                if (obj3 != bVar2) {
                    obj2 = bVar.i;
                }
                bVar = new T.b(obj6, obj2, cVarB);
            }
            if (obj == bVar) {
                return;
            }
            C0308a c0308a = T4.b.f5258b;
            if (obj == null) {
                obj = c0308a;
            }
        } while (!p6.i(obj, bVar));
    }

    @Override // N.L0
    public boolean a(Object obj, Object obj2) {
        switch (this.f3674h) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return E4.k.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f3674h) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 5:
                return "Empty";
        }
    }
}
