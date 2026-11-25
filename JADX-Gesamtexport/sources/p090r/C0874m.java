package p090r;

import B.C0014h;
import S0.j;
import java.util.ArrayList;
import java.util.List;
import p015c2.AbstractC0473d;
import p089q4.m;
import p089q4.v;
import p113v0.E;
import p113v0.F;
import p113v0.G;
import p113v0.H;
import p113v0.InterfaceC1030m;
import p113v0.N;

/* JADX INFO: renamed from: r.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0874m implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f11418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11419b;

    public C0874m(r rVar) {
        this.f11418a = rVar;
    }

    @Override // p113v0.F
    public final int a(InterfaceC1030m interfaceC1030m, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((E) list.get(0)).U(i));
            int iL = m.L(list);
            int i3 = 1;
            if (1 <= iL) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((E) list.get(i3)).U(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i3 == iL) {
                        break;
                    }
                    i3++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p113v0.F
    public final G c(H h6, List list, long j4) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((E) list.get(i)).c(j4));
        }
        Object obj2 = null;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int i3 = ((N) obj).f13137h;
            int iL = m.L(arrayList);
            if (1 <= iL) {
                int i6 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i6);
                    int i7 = ((N) obj3).f13137h;
                    if (i3 < i7) {
                        obj = obj3;
                        i3 = i7;
                    }
                    if (i6 == iL) {
                        break;
                    }
                    i6++;
                }
            }
        } else {
            obj = null;
        }
        N n6 = (N) obj;
        int i8 = n6 != null ? n6.f13137h : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i9 = ((N) obj2).i;
            int iL2 = m.L(arrayList);
            if (1 <= iL2) {
                int i10 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i10);
                    int i11 = ((N) obj4).i;
                    if (i9 < i11) {
                        obj2 = obj4;
                        i9 = i11;
                    }
                    if (i10 == iL2) {
                        break;
                    }
                    i10++;
                }
            }
        }
        N n7 = (N) obj2;
        int i12 = n7 != null ? n7.i : 0;
        boolean zS = h6.s();
        r rVar = this.f11418a;
        if (zS) {
            this.f11419b = true;
            rVar.f11431a.setValue(new j(AbstractC0473d.b(i8, i12)));
        } else if (!this.f11419b) {
            rVar.f11431a.setValue(new j(AbstractC0473d.b(i8, i12)));
        }
        return h6.u(i8, i12, v.f11238h, new C0014h(5, arrayList));
    }

    @Override // p113v0.F
    public final int e(InterfaceC1030m interfaceC1030m, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((E) list.get(0)).Y(i));
            int iL = m.L(list);
            int i3 = 1;
            if (1 <= iL) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((E) list.get(i3)).Y(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i3 == iL) {
                        break;
                    }
                    i3++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p113v0.F
    public final int g(InterfaceC1030m interfaceC1030m, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((E) list.get(0)).d(i));
            int iL = m.L(list);
            int i3 = 1;
            if (1 <= iL) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((E) list.get(i3)).d(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i3 == iL) {
                        break;
                    }
                    i3++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p113v0.F
    public final int i(InterfaceC1030m interfaceC1030m, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((E) list.get(0)).Z(i));
            int iL = m.L(list);
            int i3 = 1;
            if (1 <= iL) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((E) list.get(i3)).Z(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i3 == iL) {
                        break;
                    }
                    i3++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
