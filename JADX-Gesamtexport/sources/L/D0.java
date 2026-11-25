package L;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class D0 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p113v0.Y f2236h;
    public final /* synthetic */ V.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.a f2237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V.a f2238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p123x.a0 f2241n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f2242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ V.a f2243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ V.a f2244q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2245r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(p113v0.Y y2, V.a aVar, V.a aVar2, V.a aVar3, int i, int i3, p123x.a0 a0Var, long j4, V.a aVar4, V.a aVar5, int i6) {
        super(1);
        this.f2236h = y2;
        this.i = aVar;
        this.f2237j = aVar2;
        this.f2238k = aVar3;
        this.f2239l = i;
        this.f2240m = i3;
        this.f2241n = a0Var;
        this.f2242o = j4;
        this.f2243p = aVar4;
        this.f2244q = aVar5;
        this.f2245r = i6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        long j4;
        Object obj2;
        p123x.a0 a0Var;
        Object obj3;
        Object obj4;
        B.k1 k1Var;
        Object obj5;
        Integer numValueOf;
        int iIntValue;
        int i;
        int iIntValue2;
        int iH;
        Object obj6;
        Object obj7;
        int i3;
        int iH2;
        int iH3;
        p113v0.M m6 = (p113v0.M) obj;
        K0 k3 = K0.f2351h;
        V.a aVar = this.i;
        p113v0.Y y2 = this.f2236h;
        List listM = y2.m(k3, aVar);
        ArrayList arrayList = new ArrayList(listM.size());
        int size = listM.size();
        int i6 = 0;
        while (true) {
            j4 = this.f2242o;
            if (i6 >= size) {
                break;
            }
            arrayList.add(((p113v0.E) listM.get(i6)).c(j4));
            i6++;
        }
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i7 = ((p113v0.N) obj2).i;
            int iL = p089q4.m.L(arrayList);
            if (1 <= iL) {
                int i8 = 1;
                while (true) {
                    Object obj8 = arrayList.get(i8);
                    int i9 = ((p113v0.N) obj8).i;
                    if (i7 < i9) {
                        obj2 = obj8;
                        i7 = i9;
                    }
                    if (i8 == iL) {
                        break;
                    }
                    i8++;
                }
            }
        } else {
            obj2 = null;
        }
        p113v0.N n6 = (p113v0.N) obj2;
        int i10 = n6 != null ? n6.i : 0;
        List listM2 = y2.m(K0.f2352j, this.f2237j);
        ArrayList arrayList2 = new ArrayList(listM2.size());
        int size2 = listM2.size();
        int i11 = 0;
        while (true) {
            a0Var = this.f2241n;
            if (i11 >= size2) {
                break;
            }
            arrayList2.add(((p113v0.E) listM2.get(i11)).c(p081p0.c.w0((-a0Var.a(y2, y2.getLayoutDirection())) - a0Var.b(y2, y2.getLayoutDirection()), -a0Var.d(y2), j4)));
            i11++;
            listM2 = listM2;
        }
        if (!arrayList2.isEmpty()) {
            obj3 = arrayList2.get(0);
            int i12 = ((p113v0.N) obj3).i;
            int iL2 = p089q4.m.L(arrayList2);
            if (1 <= iL2) {
                int i13 = 1;
                while (true) {
                    Object obj9 = arrayList2.get(i13);
                    int i14 = ((p113v0.N) obj9).i;
                    if (i12 < i14) {
                        obj3 = obj9;
                        i12 = i14;
                    }
                    if (i13 == iL2) {
                        break;
                    }
                    i13++;
                }
            }
        } else {
            obj3 = null;
        }
        p113v0.N n7 = (p113v0.N) obj3;
        int i15 = n7 != null ? n7.i : 0;
        if (!arrayList2.isEmpty()) {
            obj4 = arrayList2.get(0);
            int i16 = ((p113v0.N) obj4).f13137h;
            int iL3 = p089q4.m.L(arrayList2);
            if (1 <= iL3) {
                int i17 = 1;
                while (true) {
                    Object obj10 = arrayList2.get(i17);
                    int i18 = ((p113v0.N) obj10).f13137h;
                    if (i16 < i18) {
                        obj4 = obj10;
                        i16 = i18;
                    }
                    if (i17 == iL3) {
                        break;
                    }
                    i17++;
                }
            }
        } else {
            obj4 = null;
        }
        p113v0.N n8 = (p113v0.N) obj4;
        int i19 = n8 != null ? n8.f13137h : 0;
        List listM3 = y2.m(K0.f2353k, this.f2238k);
        ArrayList arrayList3 = new ArrayList(listM3.size());
        int size3 = listM3.size();
        int i20 = 0;
        while (i20 < size3) {
            int i21 = i15;
            int i22 = i19;
            p113v0.N nC = ((p113v0.E) listM3.get(i20)).c(p081p0.c.w0((-a0Var.a(y2, y2.getLayoutDirection())) - a0Var.b(y2, y2.getLayoutDirection()), -a0Var.d(y2), j4));
            if (nC.i == 0 || nC.f13137h == 0) {
                nC = null;
            }
            if (nC != null) {
                arrayList3.add(nC);
            }
            i20++;
            i15 = i21;
            i19 = i22;
        }
        int i23 = i15;
        int i24 = i19;
        boolean zIsEmpty = arrayList3.isEmpty();
        int i25 = this.f2240m;
        if (zIsEmpty) {
            k1Var = null;
        } else {
            if (!arrayList3.isEmpty()) {
                obj6 = arrayList3.get(0);
                int i26 = ((p113v0.N) obj6).f13137h;
                int iL4 = p089q4.m.L(arrayList3);
                if (1 <= iL4) {
                    int i27 = 1;
                    while (true) {
                        Object obj11 = arrayList3.get(i27);
                        int i28 = ((p113v0.N) obj11).f13137h;
                        if (i26 < i28) {
                            i26 = i28;
                            obj6 = obj11;
                        }
                        if (i27 == iL4) {
                            break;
                        }
                        i27++;
                    }
                }
            } else {
                obj6 = null;
            }
            E4.k.c(obj6);
            int i29 = ((p113v0.N) obj6).f13137h;
            if (arrayList3.isEmpty()) {
                i3 = i29;
                obj7 = null;
            } else {
                obj7 = arrayList3.get(0);
                int i30 = ((p113v0.N) obj7).i;
                int iL5 = p089q4.m.L(arrayList3);
                if (1 <= iL5) {
                    int i31 = 1;
                    while (true) {
                        Object obj12 = arrayList3.get(i31);
                        i3 = i29;
                        int i32 = ((p113v0.N) obj12).i;
                        if (i30 < i32) {
                            i30 = i32;
                            obj7 = obj12;
                        }
                        if (i31 == iL5) {
                            break;
                        }
                        i31++;
                        i29 = i3;
                    }
                } else {
                    i3 = i29;
                }
            }
            E4.k.c(obj7);
            int i33 = ((p113v0.N) obj7).i;
            S0.k kVar = S0.k.f4897h;
            int i34 = this.f2239l;
            if (i34 == 0) {
                if (y2.getLayoutDirection() == kVar) {
                    iH2 = y2.H(J0.f2343c);
                } else {
                    iH3 = y2.H(J0.f2343c);
                    iH2 = (i25 - iH3) - i3;
                }
            } else if (i34 != 2) {
                iH2 = (i25 - i3) / 2;
            } else if (y2.getLayoutDirection() == kVar) {
                iH3 = y2.H(J0.f2343c);
                iH2 = (i25 - iH3) - i3;
            } else {
                iH2 = y2.H(J0.f2343c);
            }
            k1Var = new B.k1(iH2, i33);
        }
        List listM4 = y2.m(K0.f2354l, new V.a(-791102355, new C0(k1Var, this.f2243p, 0), true));
        ArrayList arrayList4 = new ArrayList(listM4.size());
        int size4 = listM4.size();
        for (int i35 = 0; i35 < size4; i35++) {
            arrayList4.add(((p113v0.E) listM4.get(i35)).c(j4));
        }
        if (!arrayList4.isEmpty()) {
            obj5 = arrayList4.get(0);
            int i36 = ((p113v0.N) obj5).i;
            int iL6 = p089q4.m.L(arrayList4);
            if (1 <= iL6) {
                int i37 = 1;
                while (true) {
                    Object obj13 = arrayList4.get(i37);
                    Object obj14 = obj5;
                    int i38 = ((p113v0.N) obj13).i;
                    if (i36 < i38) {
                        i36 = i38;
                        obj5 = obj13;
                    } else {
                        obj5 = obj14;
                    }
                    if (i37 == iL6) {
                        break;
                    }
                    i37++;
                }
            }
        } else {
            obj5 = null;
        }
        p113v0.N n9 = (p113v0.N) obj5;
        Integer numValueOf2 = n9 != null ? Integer.valueOf(n9.i) : null;
        if (k1Var != null) {
            int i39 = k1Var.f352b;
            if (numValueOf2 == null) {
                iIntValue2 = y2.H(J0.f2343c) + i39;
                iH = a0Var.d(y2);
            } else {
                iIntValue2 = numValueOf2.intValue() + i39;
                iH = y2.H(J0.f2343c);
            }
            numValueOf = Integer.valueOf(iH + iIntValue2);
        } else {
            numValueOf = null;
        }
        if (i23 != 0) {
            iIntValue = i23 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : a0Var.d(y2));
        } else {
            iIntValue = 0;
        }
        K0 k6 = K0.i;
        V.a aVar2 = this.f2244q;
        p123x.a0 a0Var2 = this.f2241n;
        p113v0.Y y6 = this.f2236h;
        ArrayList arrayList5 = arrayList3;
        B.k1 k1Var2 = k1Var;
        Integer num = numValueOf;
        List listM5 = y6.m(k6, new V.a(495329982, new B0(a0Var2, y6, arrayList, i10, arrayList4, numValueOf2, aVar2, 0), true));
        ArrayList arrayList6 = new ArrayList(listM5.size());
        int size5 = listM5.size();
        for (int i40 = 0; i40 < size5; i40++) {
            arrayList6.add(((p113v0.E) listM5.get(i40)).c(j4));
        }
        int size6 = arrayList6.size();
        for (int i41 = 0; i41 < size6; i41++) {
            p113v0.M.d(m6, (p113v0.N) arrayList6.get(i41), 0, 0);
        }
        int i42 = 0;
        int size7 = arrayList.size();
        int i43 = 0;
        while (i43 < size7) {
            p113v0.M.d(m6, (p113v0.N) arrayList.get(i43), i42, i42);
            i43++;
            i42 = 0;
        }
        int size8 = arrayList2.size();
        int i44 = 0;
        while (true) {
            i = this.f2245r;
            if (i44 >= size8) {
                break;
            }
            p113v0.M.d(m6, (p113v0.N) arrayList2.get(i44), a0Var.a(y2, y2.getLayoutDirection()) + ((i25 - i24) / 2), i - iIntValue);
            i44++;
        }
        int size9 = arrayList4.size();
        for (int i45 = 0; i45 < size9; i45++) {
            p113v0.M.d(m6, (p113v0.N) arrayList4.get(i45), 0, i - (numValueOf2 != null ? numValueOf2.intValue() : 0));
        }
        if (k1Var2 != null) {
            int size10 = arrayList5.size();
            int i46 = 0;
            while (i46 < size10) {
                ArrayList arrayList7 = arrayList5;
                p113v0.N n10 = (p113v0.N) arrayList7.get(i46);
                E4.k.c(num);
                p113v0.M.d(m6, n10, k1Var2.f351a, i - num.intValue());
                i46++;
                arrayList5 = arrayList7;
            }
        }
        return p084p4.x.f10867a;
    }
}
