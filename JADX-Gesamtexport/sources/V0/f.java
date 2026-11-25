package V0;

import B.C0014h;
import B.Y0;
import java.util.ArrayList;
import java.util.List;
import p113v0.E;
import p113v0.F;
import p113v0.G;
import p113v0.H;
import p113v0.N;

/* JADX INFO: loaded from: classes.dex */
public final class f implements F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f5420b = new f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f5421c = new f(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5422a;

    public /* synthetic */ f(int i) {
        this.f5422a = i;
    }

    @Override // p113v0.F
    public final G c(H h6, List list, long j4) {
        Object obj;
        int iMax;
        switch (this.f5422a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(((E) list.get(i)).c(j4));
                }
                int i3 = 1;
                Object obj2 = null;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList.get(0);
                    int i6 = ((N) obj).f13137h;
                    int iL = p089q4.m.L(arrayList);
                    if (1 <= iL) {
                        int i7 = 1;
                        while (true) {
                            Object obj3 = arrayList.get(i7);
                            int i8 = ((N) obj3).f13137h;
                            if (i6 < i8) {
                                obj = obj3;
                                i6 = i8;
                            }
                            if (i7 != iL) {
                                i7++;
                            }
                        }
                    }
                }
                N n6 = (N) obj;
                int iJ = n6 != null ? n6.f13137h : S0.a.j(j4);
                if (!arrayList.isEmpty()) {
                    Object obj4 = arrayList.get(0);
                    int i9 = ((N) obj4).i;
                    int iL2 = p089q4.m.L(arrayList);
                    if (1 <= iL2) {
                        while (true) {
                            Object obj5 = arrayList.get(i3);
                            int i10 = ((N) obj5).i;
                            if (i9 < i10) {
                                obj4 = obj5;
                                i9 = i10;
                            }
                            if (i3 != iL2) {
                                i3++;
                            }
                        }
                    }
                    obj2 = obj4;
                }
                N n7 = (N) obj2;
                return h6.u(iJ, n7 != null ? n7.i : S0.a.i(j4), p089q4.v.f11238h, new C0014h(3, arrayList));
            default:
                int size2 = list.size();
                p089q4.v vVar = p089q4.v.f11238h;
                int i11 = 0;
                if (size2 == 0) {
                    return h6.u(0, 0, vVar, c.f5413m);
                }
                if (size2 == 1) {
                    N nC = ((E) list.get(0)).c(j4);
                    return h6.u(nC.f13137h, nC.i, vVar, new Y0(nC, 3));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    arrayList2.add(((E) list.get(i12)).c(j4));
                }
                int iL3 = p089q4.m.L(arrayList2);
                if (iL3 >= 0) {
                    int iMax2 = 0;
                    iMax = 0;
                    while (true) {
                        N n8 = (N) arrayList2.get(i11);
                        iMax2 = Math.max(iMax2, n8.f13137h);
                        iMax = Math.max(iMax, n8.i);
                        if (i11 != iL3) {
                            i11++;
                        } else {
                            i11 = iMax2;
                        }
                    }
                } else {
                    iMax = 0;
                }
                return h6.u(i11, iMax, vVar, new C0014h(4, arrayList2));
        }
    }
}
