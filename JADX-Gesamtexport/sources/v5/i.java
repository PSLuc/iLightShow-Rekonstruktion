package v5;

import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p084p4.x;
import p089q4.y;
import w5.AbstractC1065x;
import w5.C1048f;
import w5.C1063v;
import w5.D;
import w5.E;
import w5.F;
import w5.G;
import w5.H;
import w5.I;
import w5.InterfaceC1067z;
import w5.K;
import w5.M;
import w5.N;
import w5.O;
import w5.P;
import w5.S;
import w5.T;
import w5.W;
import w5.X;
import w5.Y;
import w5.Z;
import w5.b0;
import w5.c0;
import w5.d0;
import w5.e0;
import w5.f0;
import w5.g0;
import w5.h0;
import w5.i0;
import w5.j0;
import w5.k0;
import w5.l0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13323h;
    public final /* synthetic */ k i;

    public /* synthetic */ i(k kVar, int i) {
        this.f13323h = i;
        this.i = kVar;
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v36, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v42, types: [java.lang.Object, java.util.List] */
    @Override // D4.c
    public final Object invoke(Object obj) {
        x xVar = x.f10867a;
        k kVar = this.i;
        switch (this.f13323h) {
            case 0:
                y5.b bVar = (y5.b) obj;
                kVar.f13337q = bVar.f14595b;
                kVar.f13338r = p012c.k.o();
                kVar.M();
                h hVar = bVar.f14594a;
                kVar.f13333m.getClass();
                InterfaceC1067z interfaceC1067z = hVar.f13322b;
                E4.k.f("payload", interfaceC1067z);
                boolean z5 = interfaceC1067z instanceof H;
                LinkedHashMap linkedHashMap = kVar.f13335o;
                int i = 0;
                p091r0.d dVar = kVar.f13340t;
                if (z5) {
                    l[] lVarArr = l.f13347h;
                    if (AbstractC0599v0.g(linkedHashMap, n.f13350h) + 2000 < p012c.k.o()) {
                        String str = new String(((H) interfaceC1067z).f13497d, M4.a.f3520a);
                        int iF0 = M4.l.f0(str, (char) 0, 0, 6);
                        if (iF0 != -1) {
                            str = str.substring(0, iF0);
                            E4.k.e("substring(...)", str);
                        }
                        dVar.l(kVar, k.f13326E[1], str);
                    }
                    if (AbstractC0599v0.g(linkedHashMap, n.i) + 2000 < p012c.k.o()) {
                        C1063v c1063v = ((H) interfaceC1067z).f13494a;
                        E4.k.f("<set-?>", c1063v);
                        kVar.f13341u.l(kVar, k.f13326E[2], c1063v);
                    }
                    if (AbstractC0599v0.g(linkedHashMap, n.f13351j) + 2000 < p012c.k.o()) {
                        q5.n nVar = K.i;
                        short s6 = ((H) interfaceC1067z).f13496c;
                        nVar.getClass();
                        kVar.L(q5.n.a(s6));
                    }
                } else {
                    boolean z6 = interfaceC1067z instanceof X;
                    K4.e[] eVarArr = k.f13326E;
                    if (z6) {
                        l[] lVarArr2 = l.f13347h;
                        if (AbstractC0599v0.g(linkedHashMap, n.f13353l) + 2000 < p012c.k.o()) {
                            kVar.f13343w.l(kVar, eVarArr[4], (X) interfaceC1067z);
                        }
                    } else if (interfaceC1067z instanceof d0) {
                        l[] lVarArr3 = l.f13347h;
                        if (AbstractC0599v0.g(linkedHashMap, n.f13354m) + 2000 < p012c.k.o()) {
                            kVar.f13344x.l(kVar, eVarArr[5], (d0) interfaceC1067z);
                        }
                    } else if (interfaceC1067z instanceof Y) {
                        l[] lVarArr4 = l.f13347h;
                        if (AbstractC0599v0.g(linkedHashMap, n.f13355n) + 2000 < p012c.k.o()) {
                            Y y2 = (Y) interfaceC1067z;
                            kVar.f13345y.l(kVar, eVarArr[6], new f(y2.f13556c, y2.f13554a));
                        }
                    } else if (interfaceC1067z instanceof j0) {
                        l[] lVarArr5 = l.f13347h;
                        if (AbstractC0599v0.g(linkedHashMap, n.f13356o) + 2000 < p012c.k.o()) {
                            j0 j0Var = (j0) interfaceC1067z;
                            kVar.f13346z.l(kVar, eVarArr[7], new f(j0Var.f13614c, j0Var.f13612a));
                        }
                    } else if (interfaceC1067z instanceof i0) {
                        l[] lVarArr6 = l.f13347h;
                        if (AbstractC0599v0.g(linkedHashMap, n.f13357p) + 2000 < p012c.k.o()) {
                            s sVar = s.f13372d;
                            i0 i0Var = (i0) interfaceC1067z;
                            kVar.f13328A.l(kVar, eVarArr[8], new s(i0Var.f13607a, i0Var.f13608b, i0Var.f13609c));
                        }
                    } else if (interfaceC1067z instanceof b0) {
                        l[] lVarArr7 = l.f13347h;
                        if (AbstractC0599v0.g(linkedHashMap, n.f13358q) + 2000 < p012c.k.o()) {
                            kVar.f13329B.l(kVar, eVarArr[9], Short.valueOf(((b0) interfaceC1067z).f13569a));
                        }
                    } else {
                        boolean z7 = interfaceC1067z instanceof l0;
                        C1063v c1063v2 = AbstractC1065x.f13673a;
                        p091r0.d dVar2 = kVar.f13330C;
                        Long[] lArr = kVar.f13336p;
                        if (z7) {
                            l0 l0Var = (l0) interfaceC1067z;
                            l[] lVarArr8 = l.f13347h;
                            n nVar2 = n.f13350h;
                            byte b6 = l0Var.f13624b;
                            int i3 = b6 + 1;
                            Iterable dVar3 = new J4.d(b6, i3, 1);
                            long jO = p012c.k.o();
                            if (!(dVar3 instanceof Collection) || !((Collection) dVar3).isEmpty()) {
                                Iterator it = dVar3.iterator();
                                while (((J4.c) it).f1944j) {
                                    if (lArr[((y) it).a()].longValue() + 2000 < jO) {
                                        l[] lVarArr9 = l.f13347h;
                                        int i6 = kVar.J().f13378a;
                                        C1063v c1063v3 = l0Var.f13625c;
                                        byte b7 = l0Var.f13623a;
                                        if (i6 != b7 || kVar.J().f13378a < b6 || !E4.k.a(kVar.J().f13379b.get(b6), c1063v3)) {
                                            ArrayList arrayList = new ArrayList(b6);
                                            for (int i7 = 0; i7 < b6; i7++) {
                                                C1063v c1063v4 = (C1063v) p089q4.l.a0(i7, kVar.J().f13379b);
                                                if (c1063v4 == null) {
                                                    c1063v4 = c1063v2;
                                                }
                                                arrayList.add(c1063v4);
                                            }
                                            List listV = com.fasterxml.jackson.databind.deser.std.d0.v(c1063v3);
                                            int i8 = b7 - i3;
                                            ArrayList arrayList2 = new ArrayList(i8);
                                            while (i < i8) {
                                                C1063v c1063v5 = (C1063v) p089q4.l.a0(i3 + i, kVar.J().f13379b);
                                                if (c1063v5 == null) {
                                                    c1063v5 = c1063v2;
                                                }
                                                arrayList2.add(c1063v5);
                                                i++;
                                            }
                                            dVar2.l(kVar, k.f13326E[10], new t(b7, p089q4.l.j0(arrayList, p089q4.l.j0(listV, arrayList2))));
                                        }
                                        break;
                                    }
                                }
                            }
                        } else if (interfaceC1067z instanceof e0) {
                            e0 e0Var = (e0) interfaceC1067z;
                            l[] lVarArr10 = l.f13347h;
                            n nVar3 = n.f13350h;
                            byte b8 = e0Var.f13585b;
                            int i9 = b8 + 8;
                            byte b9 = e0Var.f13584a;
                            Iterable dVar4 = new J4.d(b8, Math.min((int) b9, i9), 1);
                            long jO2 = p012c.k.o();
                            if (!(dVar4 instanceof Collection) || !((Collection) dVar4).isEmpty()) {
                                Iterator it2 = dVar4.iterator();
                                while (((J4.c) it2).f1944j) {
                                    if (lArr[((y) it2).a()].longValue() + 2000 < jO2) {
                                        l[] lVarArr11 = l.f13347h;
                                        int iMin = Math.min(i9, (int) b9);
                                        int i10 = kVar.J().f13378a;
                                        C1063v[] c1063vArr = e0Var.f13586c;
                                        if (i10 != b9 || kVar.J().f13378a < iMin || !E4.k.a(kVar.J().f13379b.subList(b8, iMin), p089q4.k.t0(c1063vArr).subList(0, Math.min(8, b9 - b8)))) {
                                            ArrayList arrayList3 = new ArrayList(b8);
                                            for (int i11 = 0; i11 < b8; i11++) {
                                                C1063v c1063v6 = (C1063v) p089q4.l.a0(i11, kVar.J().f13379b);
                                                if (c1063v6 == null) {
                                                    c1063v6 = c1063v2;
                                                }
                                                arrayList3.add(c1063v6);
                                            }
                                            ArrayList arrayList4 = new ArrayList(c1063vArr.length);
                                            for (C1063v c1063v7 : c1063vArr) {
                                                arrayList4.add(c1063v7);
                                            }
                                            List listSubList = arrayList4.subList(0, Math.min(8, b9 - b8));
                                            int i12 = b9 - iMin;
                                            ArrayList arrayList5 = new ArrayList(i12);
                                            while (i < i12) {
                                                C1063v c1063v8 = (C1063v) p089q4.l.a0(iMin + i, kVar.J().f13379b);
                                                if (c1063v8 == null) {
                                                    c1063v8 = c1063v2;
                                                }
                                                arrayList5.add(c1063v8);
                                                i++;
                                            }
                                            dVar2.l(kVar, k.f13326E[10], new t(b9, p089q4.l.j0(arrayList3, p089q4.l.j0(listSubList, arrayList5))));
                                        }
                                        break;
                                    }
                                }
                            }
                        } else if (interfaceC1067z instanceof I) {
                            l[] lVarArr12 = l.f13347h;
                            if (AbstractC0599v0.g(linkedHashMap, n.f13351j) + 2000 < p012c.k.o()) {
                                q5.n nVar4 = K.i;
                                short s7 = ((I) interfaceC1067z).f13500a;
                                nVar4.getClass();
                                kVar.L(q5.n.a(s7));
                            }
                        } else if (interfaceC1067z instanceof f0) {
                            l[] lVarArr13 = l.f13347h;
                            if (AbstractC0599v0.g(linkedHashMap, n.f13351j) + 2000 < p012c.k.o()) {
                                q5.n nVar5 = K.i;
                                short s8 = ((f0) interfaceC1067z).f13590a;
                                nVar5.getClass();
                                kVar.L(q5.n.a(s8));
                            }
                        } else if (interfaceC1067z instanceof c0) {
                            l[] lVarArr14 = l.f13347h;
                            if (AbstractC0599v0.g(linkedHashMap, n.f13350h) + 2000 < p012c.k.o()) {
                                String str2 = new String(((c0) interfaceC1067z).f13575a, M4.a.f3520a);
                                int iF1 = M4.l.f0(str2, (char) 0, 0, 6);
                                if (iF1 != -1) {
                                    str2 = str2.substring(0, iF1);
                                    E4.k.e("substring(...)", str2);
                                }
                                dVar.l(kVar, eVarArr[1], str2);
                            }
                        } else if (!(interfaceC1067z instanceof h0) && !(interfaceC1067z instanceof W) && !(interfaceC1067z instanceof g0) && !(interfaceC1067z instanceof k0) && !(interfaceC1067z instanceof Z) && !(interfaceC1067z instanceof C1048f) && !(interfaceC1067z instanceof T) && !(interfaceC1067z instanceof G) && !(interfaceC1067z instanceof F) && !(interfaceC1067z instanceof E) && !(interfaceC1067z instanceof D) && !(interfaceC1067z instanceof N) && !(interfaceC1067z instanceof S) && !(interfaceC1067z instanceof P) && !(interfaceC1067z instanceof O) && !(interfaceC1067z instanceof M)) {
                            System.out.println((Object) ("cannot recognize payload: " + interfaceC1067z));
                        }
                    }
                }
                break;
            default:
                E4.k.f("this$0", kVar);
                kVar.K();
                kVar.M();
                break;
        }
        return xVar;
    }
}
