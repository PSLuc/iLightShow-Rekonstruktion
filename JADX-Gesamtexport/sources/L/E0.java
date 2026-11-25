package L;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2258h;
    public final /* synthetic */ V.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.a f2259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V.a f2260k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p123x.a0 f2262m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V.a f2263n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ V.a f2264o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E0(V.a aVar, V.a aVar2, V.a aVar3, int i, p123x.a0 a0Var, V.a aVar4, V.a aVar5, int i3) {
        super(2);
        this.f2258h = i3;
        this.i = aVar;
        this.f2259j = aVar2;
        this.f2260k = aVar3;
        this.f2261l = i;
        this.f2262m = a0Var;
        this.f2263n = aVar4;
        this.f2264o = aVar5;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        B.k1 k1Var;
        Object obj6;
        Integer numValueOf;
        int iIntValue;
        int iH;
        int iD;
        Object obj7;
        Object obj8;
        int i3;
        int iH2;
        int iH3;
        switch (this.f2258h) {
            case 0:
                p113v0.Y y2 = (p113v0.Y) obj;
                long j4 = ((S0.a) obj2).f4883a;
                int iH4 = S0.a.h(j4);
                int iG = S0.a.g(j4);
                return y2.u(iH4, iG, p089q4.v.f11238h, new D0(y2, this.i, this.f2259j, this.f2260k, this.f2261l, iH4, this.f2262m, S0.a.a(j4, 0, 0, 0, 0, 10), this.f2263n, this.f2264o, iG));
            default:
                p113v0.Y y6 = (p113v0.Y) obj;
                long j6 = ((S0.a) obj2).f4883a;
                int iH5 = S0.a.h(j6);
                int iG2 = S0.a.g(j6);
                long jA = S0.a.a(j6, 0, 0, 0, 0, 10);
                List listM = y6.m(K0.f2351h, this.i);
                ArrayList arrayList = new ArrayList(listM.size());
                int size = listM.size();
                for (int i6 = 0; i6 < size; i6++) {
                    arrayList.add(((p113v0.E) listM.get(i6)).c(jA));
                }
                if (arrayList.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList.get(0);
                    int i7 = ((p113v0.N) obj3).i;
                    int iL = p089q4.m.L(arrayList);
                    if (1 <= iL) {
                        int i8 = 1;
                        while (true) {
                            Object obj9 = arrayList.get(i8);
                            int i9 = ((p113v0.N) obj9).i;
                            if (i7 < i9) {
                                obj3 = obj9;
                                i7 = i9;
                            }
                            if (i8 != iL) {
                                i8++;
                            }
                        }
                    }
                }
                p113v0.N n6 = (p113v0.N) obj3;
                int i10 = n6 != null ? n6.i : 0;
                List listM2 = y6.m(K0.f2352j, this.f2259j);
                ArrayList arrayList2 = new ArrayList(listM2.size());
                int size2 = listM2.size();
                int i11 = 0;
                while (true) {
                    p123x.a0 a0Var = this.f2262m;
                    if (i11 >= size2) {
                        if (arrayList2.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList2.get(0);
                            int i12 = ((p113v0.N) obj4).i;
                            int iL2 = p089q4.m.L(arrayList2);
                            if (1 <= iL2) {
                                Object obj10 = obj4;
                                int i13 = i12;
                                int i14 = 1;
                                while (true) {
                                    Object obj11 = arrayList2.get(i14);
                                    int i15 = ((p113v0.N) obj11).i;
                                    if (i13 < i15) {
                                        obj10 = obj11;
                                        i13 = i15;
                                    }
                                    if (i14 != iL2) {
                                        i14++;
                                    } else {
                                        obj4 = obj10;
                                    }
                                }
                            }
                        }
                        p113v0.N n7 = (p113v0.N) obj4;
                        int i16 = n7 != null ? n7.i : 0;
                        if (arrayList2.isEmpty()) {
                            i = iH5;
                            obj5 = null;
                        } else {
                            obj5 = arrayList2.get(0);
                            int i17 = ((p113v0.N) obj5).f13137h;
                            int iL3 = p089q4.m.L(arrayList2);
                            if (1 <= iL3) {
                                Object obj12 = obj5;
                                int i18 = i17;
                                int i19 = 1;
                                while (true) {
                                    Object obj13 = arrayList2.get(i19);
                                    i = iH5;
                                    int i20 = ((p113v0.N) obj13).f13137h;
                                    if (i18 < i20) {
                                        i18 = i20;
                                        obj12 = obj13;
                                    }
                                    if (i19 != iL3) {
                                        i19++;
                                        iH5 = i;
                                    } else {
                                        obj5 = obj12;
                                    }
                                }
                            } else {
                                i = iH5;
                            }
                        }
                        p113v0.N n8 = (p113v0.N) obj5;
                        int i21 = n8 != null ? n8.f13137h : 0;
                        List listM3 = y6.m(K0.f2353k, this.f2260k);
                        ArrayList arrayList3 = new ArrayList(listM3.size());
                        int size3 = listM3.size();
                        int i22 = 0;
                        while (i22 < size3) {
                            int i23 = i21;
                            int i24 = i16;
                            p113v0.N nC = ((p113v0.E) listM3.get(i22)).c(p081p0.c.w0((-a0Var.a(y6, y6.getLayoutDirection())) - a0Var.b(y6, y6.getLayoutDirection()), -a0Var.d(y6), jA));
                            if (nC.i == 0 || nC.f13137h == 0) {
                                nC = null;
                            }
                            if (nC != null) {
                                arrayList3.add(nC);
                            }
                            i22++;
                            i21 = i23;
                            i16 = i24;
                        }
                        int i25 = i21;
                        int i26 = i16;
                        boolean zIsEmpty = arrayList3.isEmpty();
                        int i27 = this.f2261l;
                        if (zIsEmpty) {
                            k1Var = null;
                        } else {
                            if (arrayList3.isEmpty()) {
                                obj7 = null;
                            } else {
                                obj7 = arrayList3.get(0);
                                int i28 = ((p113v0.N) obj7).f13137h;
                                int iL4 = p089q4.m.L(arrayList3);
                                if (1 <= iL4) {
                                    Object obj14 = obj7;
                                    int i29 = i28;
                                    int i30 = 1;
                                    while (true) {
                                        Object obj15 = arrayList3.get(i30);
                                        int i31 = ((p113v0.N) obj15).f13137h;
                                        if (i29 < i31) {
                                            i29 = i31;
                                            obj14 = obj15;
                                        }
                                        if (i30 != iL4) {
                                            i30++;
                                        } else {
                                            obj7 = obj14;
                                        }
                                    }
                                }
                            }
                            E4.k.c(obj7);
                            int i32 = ((p113v0.N) obj7).f13137h;
                            if (arrayList3.isEmpty()) {
                                i3 = i32;
                                obj8 = null;
                            } else {
                                obj8 = arrayList3.get(0);
                                int i33 = ((p113v0.N) obj8).i;
                                int iL5 = p089q4.m.L(arrayList3);
                                if (1 <= iL5) {
                                    Object obj16 = obj8;
                                    int i34 = i33;
                                    int i35 = 1;
                                    while (true) {
                                        Object obj17 = arrayList3.get(i35);
                                        i3 = i32;
                                        int i36 = ((p113v0.N) obj17).i;
                                        if (i34 < i36) {
                                            i34 = i36;
                                            obj16 = obj17;
                                        }
                                        if (i35 != iL5) {
                                            i35++;
                                            i32 = i3;
                                        } else {
                                            obj8 = obj16;
                                        }
                                    }
                                } else {
                                    i3 = i32;
                                }
                            }
                            E4.k.c(obj8);
                            int i37 = ((p113v0.N) obj8).i;
                            S0.k kVar = S0.k.f4897h;
                            if (i27 == 0) {
                                if (y6.getLayoutDirection() == kVar) {
                                    iH2 = y6.H(J0.f2343c);
                                } else {
                                    iH3 = y6.H(J0.f2343c);
                                    iH2 = (i - iH3) - i3;
                                }
                            } else if (i27 != 2 && i27 != 3) {
                                iH2 = (i - i3) / 2;
                            } else if (y6.getLayoutDirection() == kVar) {
                                iH3 = y6.H(J0.f2343c);
                                iH2 = (i - iH3) - i3;
                            } else {
                                iH2 = y6.H(J0.f2343c);
                            }
                            k1Var = new B.k1(iH2, i37);
                        }
                        List listM4 = y6.m(K0.f2354l, new V.a(1843374446, new C0(k1Var, this.f2263n, 1), true));
                        ArrayList arrayList4 = new ArrayList(listM4.size());
                        int size4 = listM4.size();
                        for (int i38 = 0; i38 < size4; i38++) {
                            arrayList4.add(((p113v0.E) listM4.get(i38)).c(jA));
                        }
                        if (arrayList4.isEmpty()) {
                            obj6 = null;
                        } else {
                            obj6 = arrayList4.get(0);
                            int i39 = ((p113v0.N) obj6).i;
                            int iL6 = p089q4.m.L(arrayList4);
                            if (1 <= iL6) {
                                int i40 = 1;
                                while (true) {
                                    Object obj18 = arrayList4.get(i40);
                                    Object obj19 = obj6;
                                    int i41 = ((p113v0.N) obj18).i;
                                    if (i39 < i41) {
                                        i39 = i41;
                                        obj6 = obj18;
                                    } else {
                                        obj6 = obj19;
                                    }
                                    if (i40 != iL6) {
                                        i40++;
                                    }
                                }
                            }
                        }
                        p113v0.N n9 = (p113v0.N) obj6;
                        Integer numValueOf2 = n9 != null ? Integer.valueOf(n9.i) : null;
                        if (k1Var != null) {
                            int i42 = k1Var.f352b;
                            if (numValueOf2 == null || i27 == 3) {
                                iH = y6.H(J0.f2343c) + i42;
                                iD = a0Var.d(y6);
                            } else {
                                iH = numValueOf2.intValue() + i42;
                                iD = y6.H(J0.f2343c);
                            }
                            numValueOf = Integer.valueOf(iD + iH);
                        } else {
                            numValueOf = null;
                        }
                        if (i26 != 0) {
                            iIntValue = i26 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : a0Var.d(y6));
                        } else {
                            iIntValue = 0;
                        }
                        B.k1 k1Var2 = k1Var;
                        List listM5 = y6.m(K0.i, new V.a(1655277373, new B0(this.f2262m, y6, arrayList, i10, arrayList4, numValueOf2, this.f2264o, 1), true));
                        ArrayList arrayList5 = new ArrayList(listM5.size());
                        int size5 = listM5.size();
                        for (int i43 = 0; i43 < size5; i43++) {
                            arrayList5.add(((p113v0.E) listM5.get(i43)).c(jA));
                        }
                        int i44 = i;
                        return y6.u(i44, iG2, p089q4.v.f11238h, new I0(arrayList5, arrayList, arrayList2, arrayList4, k1Var2, i44, i25, this.f2262m, y6, iG2, iIntValue, numValueOf2, arrayList3, numValueOf));
                    }
                    arrayList2.add(((p113v0.E) listM2.get(i11)).c(p081p0.c.w0((-a0Var.a(y6, y6.getLayoutDirection())) - a0Var.b(y6, y6.getLayoutDirection()), -a0Var.d(y6), jA)));
                    i11++;
                }
                break;
        }
    }
}
