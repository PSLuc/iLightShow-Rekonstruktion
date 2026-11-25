package p090r;

import J4.d;
import S0.j;
import java.util.List;
import java.util.NoSuchElementException;
import p015c2.AbstractC0473d;
import p089q4.m;
import p089q4.v;
import p113v0.E;
import p113v0.F;
import p113v0.G;
import p113v0.H;
import p113v0.InterfaceC1030m;
import p113v0.N;

/* JADX INFO: renamed from: r.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0866e implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0873l f11402a;

    public C0866e(C0873l c0873l) {
        this.f11402a = c0873l;
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
        N n6;
        N n7;
        int i;
        int i3;
        int size = list.size();
        N[] nArr = new N[size];
        int size2 = list.size();
        long j6 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            n6 = null;
            if (i7 >= size2) {
                break;
            }
            E e6 = (E) list.get(i7);
            Object objI = e6.i();
            C0868g c0868g = objI instanceof C0868g ? (C0868g) objI : null;
            if (c0868g != null && ((Boolean) c0868g.f11403a.getValue()).booleanValue()) {
                N nC = e6.c(j4);
                long jB = AbstractC0473d.b(nC.f13137h, nC.i);
                nArr[i7] = nC;
                j6 = jB;
            }
            i7++;
        }
        int size3 = list.size();
        for (int i8 = 0; i8 < size3; i8++) {
            E e7 = (E) list.get(i8);
            if (nArr[i8] == null) {
                nArr[i8] = e7.c(j4);
            }
        }
        if (h6.s()) {
            i = (int) (j6 >> 32);
        } else {
            if (size == 0) {
                n7 = null;
            } else {
                n7 = nArr[0];
                int i9 = size - 1;
                if (i9 != 0) {
                    int i10 = n7 != null ? n7.f13137h : 0;
                    d dVar = new d(1, i9, 1);
                    int i11 = dVar.f1942j;
                    int i12 = dVar.i;
                    boolean z5 = i11 <= 0 ? 1 >= i12 : 1 <= i12;
                    int i13 = z5 ? 1 : i12;
                    while (z5) {
                        if (i13 != i12) {
                            i13 += i11;
                            z5 = z5;
                        } else {
                            if (!z5) {
                                throw new NoSuchElementException();
                            }
                            z5 = false;
                            i13 = i13;
                        }
                        N n8 = nArr[i13];
                        int i14 = n8 != null ? n8.f13137h : 0;
                        if (i10 < i14) {
                            n7 = n8;
                            i10 = i14;
                        }
                    }
                }
            }
            i = n7 != null ? n7.f13137h : 0;
        }
        if (h6.s()) {
            i6 = (int) (4294967295L & j6);
        } else {
            if (size != 0) {
                n6 = nArr[0];
                int i15 = size - 1;
                if (i15 != 0) {
                    int i16 = n6 != null ? n6.i : 0;
                    d dVar2 = new d(1, i15, 1);
                    int i17 = dVar2.f1942j;
                    int i18 = dVar2.i;
                    boolean z6 = i17 <= 0 ? 1 >= i18 : 1 <= i18;
                    int i19 = z6 ? 1 : i18;
                    while (z6) {
                        if (i19 != i18) {
                            i3 = i19 + i17;
                            z6 = z6;
                        } else {
                            if (!z6) {
                                throw new NoSuchElementException();
                            }
                            z6 = false;
                            i3 = i19;
                        }
                        N n9 = nArr[i19];
                        int i20 = n9 != null ? n9.i : 0;
                        i19 = i3;
                        if (i16 < i20) {
                            n6 = n9;
                            i16 = i20;
                        }
                    }
                }
            }
            if (n6 != null) {
                i6 = n6.i;
            }
        }
        if (!h6.s()) {
            this.f11402a.f11415d.setValue(new j(AbstractC0473d.b(i, i6)));
        }
        return h6.u(i, i6, v.f11238h, new C0865d(nArr, this, i, i6));
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
