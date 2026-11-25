package B;

import G0.C0110f;
import M0.C0198a;
import N.C0235q0;
import N.C0239t;
import N.InterfaceC0232p;
import com.spotify.protocol.WampClient;
import java.util.List;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class J0 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f145h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f146j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f147k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J0(int i, int i3, Object obj, Object obj2) {
        super(1);
        this.f145h = i3;
        this.f146j = obj;
        this.i = i;
        this.f147k = obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // D4.c
    public final Object invoke(Object obj) {
        Integer numD;
        Integer numC;
        Integer numC2;
        Integer numD2;
        G0.G g6;
        G0.G g7;
        a1 a1Var;
        a1 a1Var2;
        G0.G g8;
        G0.G g9;
        a1 a1Var3;
        a1 a1Var4;
        Integer numC3;
        Integer numD3;
        Integer numD4;
        Integer numC4;
        D.x xVar;
        InterfaceC0232p interfaceC0232p;
        p084p4.x xVar2;
        int i;
        InterfaceC0232p interfaceC0232p2;
        p084p4.x xVar3;
        int i3;
        int i6;
        int i7 = 2;
        p084p4.x xVar4 = p084p4.x.f10867a;
        Object obj2 = this.f147k;
        int i8 = 0;
        int i9 = this.i;
        Object obj3 = this.f146j;
        int i10 = 1;
        switch (this.f145h) {
            case 0:
                F.M m6 = (F.M) obj;
                M0.w wVar = null;
                K0 k3 = (K0) obj3;
                switch (AbstractC0916i.d(i9)) {
                    case 0:
                        m6.f1112e.f1151a = null;
                        if (m6.f1114g.f1494h.length() > 0) {
                            if (G0.I.b(m6.f1113f)) {
                                m6.h();
                            } else if (m6.e()) {
                                int iE = G0.I.e(m6.f1113f);
                                m6.o(iE, iE);
                            } else {
                                int iD = G0.I.d(m6.f1113f);
                                m6.o(iD, iD);
                            }
                        }
                        return xVar4;
                    case 1:
                        m6.f1112e.f1151a = null;
                        if (m6.f1114g.f1494h.length() > 0) {
                            if (G0.I.b(m6.f1113f)) {
                                m6.k();
                            } else if (m6.e()) {
                                int iD2 = G0.I.d(m6.f1113f);
                                m6.o(iD2, iD2);
                            } else {
                                int iE2 = G0.I.e(m6.f1113f);
                                m6.o(iE2, iE2);
                            }
                        }
                        return xVar4;
                    case 2:
                        F.X x6 = m6.f1112e;
                        x6.f1151a = null;
                        if (m6.f1114g.f1494h.length() > 0) {
                            if (m6.e()) {
                                x6.f1151a = null;
                                if (m6.f1114g.f1494h.length() > 0 && (numC = m6.c()) != null) {
                                    int iIntValue = numC.intValue();
                                    m6.o(iIntValue, iIntValue);
                                }
                            } else {
                                x6.f1151a = null;
                                if (m6.f1114g.f1494h.length() > 0 && (numD = m6.d()) != null) {
                                    int iIntValue2 = numD.intValue();
                                    m6.o(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        return xVar4;
                    case 3:
                        F.X x7 = m6.f1112e;
                        x7.f1151a = null;
                        if (m6.f1114g.f1494h.length() > 0) {
                            if (m6.e()) {
                                x7.f1151a = null;
                                if (m6.f1114g.f1494h.length() > 0 && (numD2 = m6.d()) != null) {
                                    int iIntValue3 = numD2.intValue();
                                    m6.o(iIntValue3, iIntValue3);
                                }
                            } else {
                                x7.f1151a = null;
                                if (m6.f1114g.f1494h.length() > 0 && (numC2 = m6.c()) != null) {
                                    int iIntValue4 = numC2.intValue();
                                    m6.o(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        return xVar4;
                    case 4:
                        m6.i();
                        return xVar4;
                    case 5:
                        m6.j();
                        return xVar4;
                    case 6:
                        m6.m();
                        return xVar4;
                    case 7:
                        m6.l();
                        return xVar4;
                    case 8:
                        m6.f1112e.f1151a = null;
                        if (m6.f1114g.f1494h.length() > 0) {
                            if (m6.e()) {
                                m6.m();
                            } else {
                                m6.l();
                            }
                        }
                        return xVar4;
                    case 9:
                        m6.f1112e.f1151a = null;
                        if (m6.f1114g.f1494h.length() > 0) {
                            if (m6.e()) {
                                m6.l();
                            } else {
                                m6.m();
                            }
                        }
                        return xVar4;
                    case 10:
                        if (m6.f1114g.f1494h.length() > 0 && (g6 = m6.f1110c) != null) {
                            int iF = m6.f(g6, -1);
                            m6.o(iF, iF);
                        }
                        return xVar4;
                    case 11:
                        if (m6.f1114g.f1494h.length() > 0 && (g7 = m6.f1110c) != null) {
                            int iF2 = m6.f(g7, 1);
                            m6.o(iF2, iF2);
                        }
                        return xVar4;
                    case 12:
                        if (m6.f1114g.f1494h.length() > 0 && (a1Var = m6.i) != null) {
                            int iG = m6.g(a1Var, -1);
                            m6.o(iG, iG);
                        }
                        return xVar4;
                    case 13:
                        if (m6.f1114g.f1494h.length() > 0 && (a1Var2 = m6.i) != null) {
                            int iG2 = m6.g(a1Var2, 1);
                            m6.o(iG2, iG2);
                        }
                        return xVar4;
                    case 14:
                        m6.f1112e.f1151a = null;
                        if (m6.f1114g.f1494h.length() > 0) {
                            m6.o(0, 0);
                        }
                        return xVar4;
                    case 15:
                        m6.f1112e.f1151a = null;
                        C0110f c0110f = m6.f1114g;
                        if (c0110f.f1494h.length() > 0) {
                            int length = c0110f.f1494h.length();
                            m6.o(length, length);
                        }
                        return xVar4;
                    case 16:
                        k3.f155b.b(false);
                        return xVar4;
                    case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                        k3.f155b.l();
                        return xVar4;
                    case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                        k3.f155b.d();
                        return xVar4;
                    case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                        List listA = m6.a(C0022l.f356m);
                        if (listA != null) {
                            k3.a(listA);
                        }
                        return xVar4;
                    case 20:
                        List listA2 = m6.a(C0022l.f357n);
                        if (listA2 != null) {
                            k3.a(listA2);
                        }
                        return xVar4;
                    case 21:
                        List listA3 = m6.a(C0022l.f358o);
                        if (listA3 != null) {
                            k3.a(listA3);
                        }
                        return xVar4;
                    case 22:
                        List listA4 = m6.a(C0022l.f359p);
                        if (listA4 != null) {
                            k3.a(listA4);
                        }
                        return xVar4;
                    case 23:
                        List listA5 = m6.a(C0022l.f360q);
                        if (listA5 != null) {
                            k3.a(listA5);
                        }
                        return xVar4;
                    case 24:
                        List listA6 = m6.a(C0022l.f361r);
                        if (listA6 != null) {
                            k3.a(listA6);
                        }
                        return xVar4;
                    case 25:
                        m6.f1112e.f1151a = null;
                        C0110f c0110f2 = m6.f1114g;
                        if (c0110f2.f1494h.length() > 0) {
                            m6.o(0, c0110f2.f1494h.length());
                        }
                        return xVar4;
                    case 26:
                        m6.h();
                        m6.n();
                        return xVar4;
                    case 27:
                        m6.k();
                        m6.n();
                        return xVar4;
                    case 28:
                        if (m6.f1114g.f1494h.length() > 0 && (g8 = m6.f1110c) != null) {
                            int iF3 = m6.f(g8, -1);
                            m6.o(iF3, iF3);
                        }
                        m6.n();
                        return xVar4;
                    case 29:
                        if (m6.f1114g.f1494h.length() > 0 && (g9 = m6.f1110c) != null) {
                            int iF4 = m6.f(g9, 1);
                            m6.o(iF4, iF4);
                        }
                        m6.n();
                        return xVar4;
                    case 30:
                        if (m6.f1114g.f1494h.length() > 0 && (a1Var3 = m6.i) != null) {
                            int iG3 = m6.g(a1Var3, -1);
                            m6.o(iG3, iG3);
                        }
                        m6.n();
                        return xVar4;
                    case 31:
                        if (m6.f1114g.f1494h.length() > 0 && (a1Var4 = m6.i) != null) {
                            int iG4 = m6.g(a1Var4, 1);
                            m6.o(iG4, iG4);
                        }
                        m6.n();
                        return xVar4;
                    case 32:
                        m6.f1112e.f1151a = null;
                        if (m6.f1114g.f1494h.length() > 0) {
                            m6.o(0, 0);
                        }
                        m6.n();
                        return xVar4;
                    case WampClient.RequestType.SUBSCRIBED /* 33 */:
                        m6.f1112e.f1151a = null;
                        C0110f c0110f3 = m6.f1114g;
                        if (c0110f3.f1494h.length() > 0) {
                            int length2 = c0110f3.f1494h.length();
                            m6.o(length2, length2);
                        }
                        m6.n();
                        return xVar4;
                    case WampClient.RequestType.UNSUBSCRIBE /* 34 */:
                        F.X x8 = m6.f1112e;
                        x8.f1151a = null;
                        if (m6.f1114g.f1494h.length() > 0) {
                            if (m6.e()) {
                                x8.f1151a = null;
                                if (m6.f1114g.f1494h.length() > 0 && (numD3 = m6.d()) != null) {
                                    int iIntValue5 = numD3.intValue();
                                    m6.o(iIntValue5, iIntValue5);
                                }
                            } else {
                                x8.f1151a = null;
                                if (m6.f1114g.f1494h.length() > 0 && (numC3 = m6.c()) != null) {
                                    int iIntValue6 = numC3.intValue();
                                    m6.o(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        m6.n();
                        return xVar4;
                    case WampClient.RequestType.UNSUBSCRIBED /* 35 */:
                        F.X x9 = m6.f1112e;
                        x9.f1151a = null;
                        if (m6.f1114g.f1494h.length() > 0) {
                            if (m6.e()) {
                                x9.f1151a = null;
                                if (m6.f1114g.f1494h.length() > 0 && (numC4 = m6.c()) != null) {
                                    int iIntValue7 = numC4.intValue();
                                    m6.o(iIntValue7, iIntValue7);
                                }
                            } else {
                                x9.f1151a = null;
                                if (m6.f1114g.f1494h.length() > 0 && (numD4 = m6.d()) != null) {
                                    int iIntValue8 = numD4.intValue();
                                    m6.o(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        m6.n();
                        return xVar4;
                    case WampClient.RequestType.EVENT /* 36 */:
                        m6.i();
                        m6.n();
                        return xVar4;
                    case 37:
                        m6.j();
                        m6.n();
                        return xVar4;
                    case 38:
                        m6.m();
                        m6.n();
                        return xVar4;
                    case 39:
                        m6.l();
                        m6.n();
                        return xVar4;
                    case 40:
                        m6.f1112e.f1151a = null;
                        if (m6.f1114g.f1494h.length() > 0) {
                            if (m6.e()) {
                                m6.m();
                            } else {
                                m6.l();
                            }
                        }
                        m6.n();
                        return xVar4;
                    case 41:
                        m6.f1112e.f1151a = null;
                        if (m6.f1114g.f1494h.length() > 0) {
                            if (m6.e()) {
                                m6.l();
                            } else {
                                m6.m();
                            }
                        }
                        m6.n();
                        return xVar4;
                    case 42:
                        m6.f1112e.f1151a = null;
                        if (m6.f1114g.f1494h.length() > 0) {
                            long j4 = m6.f1113f;
                            int i11 = G0.I.f1469c;
                            int i12 = (int) (j4 & 4294967295L);
                            m6.o(i12, i12);
                        }
                        return xVar4;
                    case 43:
                        if (k3.f158e) {
                            k3.f154a.f435u.invoke(new M0.l(k3.f164l));
                        } else {
                            k3.a(com.fasterxml.jackson.databind.deser.std.d0.v(new C0198a("\n", 1)));
                        }
                        return xVar4;
                    case 44:
                        if (k3.f158e) {
                            ((E4.s) obj2).f1070h = false;
                        } else {
                            k3.a(com.fasterxml.jackson.databind.deser.std.d0.v(new C0198a("\t", 1)));
                        }
                        return xVar4;
                    case 45:
                        j1 j1Var = k3.f161h;
                        if (j1Var != null) {
                            j1Var.a(M0.w.a(m6.f1115h, m6.f1114g, m6.f1113f, 4));
                        }
                        j1 j1Var2 = k3.f161h;
                        if (j1Var2 != null) {
                            D.x xVar5 = j1Var2.f344a;
                            if (xVar5 != null && (xVar = (D.x) xVar5.i) != null) {
                                j1Var2.f344a = xVar;
                                j1Var2.f346c -= ((M0.w) xVar5.f707j).f3453a.f1494h.length();
                                j1Var2.f345b = new D.x(j1Var2.f345b, 1, (M0.w) xVar5.f707j);
                                wVar = (M0.w) xVar.f707j;
                            }
                            if (wVar != null) {
                                k3.f163k.invoke(wVar);
                            }
                        }
                        return xVar4;
                    case 46:
                        j1 j1Var3 = k3.f161h;
                        if (j1Var3 != null) {
                            D.x xVar6 = j1Var3.f345b;
                            if (xVar6 != null) {
                                j1Var3.f345b = (D.x) xVar6.i;
                                M0.w wVar2 = (M0.w) xVar6.f707j;
                                j1Var3.f344a = new D.x(j1Var3.f344a, i10, wVar2);
                                j1Var3.f346c = wVar2.f3453a.f1494h.length() + j1Var3.f346c;
                                wVar = (M0.w) xVar6.f707j;
                            }
                            if (wVar != null) {
                                k3.f163k.invoke(wVar);
                            }
                        }
                        return xVar4;
                    default:
                        return xVar4;
                }
            case 1:
                InterfaceC0232p interfaceC0232p3 = (InterfaceC0232p) obj;
                C0235q0 c0235q0 = (C0235q0) obj3;
                if (c0235q0.f3781e == i9) {
                    p080p.v vVar = (p080p.v) obj2;
                    if (E4.k.a(vVar, c0235q0.f3782f) && (interfaceC0232p3 instanceof C0239t)) {
                        long[] jArr = vVar.f10788a;
                        int length3 = jArr.length - 2;
                        if (length3 >= 0) {
                            int i13 = 0;
                            while (true) {
                                long j6 = jArr[i13];
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i14 = 8;
                                    int i15 = 8 - ((~(i13 - length3)) >>> 31);
                                    int i16 = i8;
                                    while (i16 < i15) {
                                        if ((255 & j6) < 128) {
                                            int i17 = (i13 << 3) + i16;
                                            Object obj4 = vVar.f10789b[i17];
                                            i3 = i10;
                                            int i18 = vVar.f10790c[i17] != i9 ? i3 : 0;
                                            if (i18 != 0) {
                                                i6 = i14;
                                                C0239t c0239t = (C0239t) interfaceC0232p3;
                                                interfaceC0232p2 = interfaceC0232p3;
                                                c0239t.f3805n.h(obj4, c0235q0);
                                                if (obj4 instanceof N.D) {
                                                    N.D d6 = (N.D) obj4;
                                                    xVar3 = xVar4;
                                                    if (!((p080p.x) c0239t.f3805n.i).b(d6)) {
                                                        c0239t.f3808q.i(d6);
                                                    }
                                                    p080p.x xVar7 = c0235q0.f3783g;
                                                    if (xVar7 != null) {
                                                        xVar7.g(obj4);
                                                    }
                                                } else {
                                                    xVar3 = xVar4;
                                                }
                                            } else {
                                                interfaceC0232p2 = interfaceC0232p3;
                                                xVar3 = xVar4;
                                                i6 = i14;
                                            }
                                            if (i18 != 0) {
                                                vVar.e(i17);
                                            }
                                        } else {
                                            interfaceC0232p2 = interfaceC0232p3;
                                            xVar3 = xVar4;
                                            i3 = i10;
                                            i6 = i14;
                                        }
                                        j6 >>= i6;
                                        i16++;
                                        i14 = i6;
                                        interfaceC0232p3 = interfaceC0232p2;
                                        i10 = i3;
                                        xVar4 = xVar3;
                                    }
                                    interfaceC0232p = interfaceC0232p3;
                                    xVar2 = xVar4;
                                    i = i10;
                                    if (i15 != i14) {
                                        return xVar2;
                                    }
                                } else {
                                    interfaceC0232p = interfaceC0232p3;
                                    xVar2 = xVar4;
                                    i = i10;
                                }
                                if (i13 == length3) {
                                    return xVar2;
                                }
                                i13++;
                                interfaceC0232p3 = interfaceC0232p;
                                i10 = i;
                                xVar4 = xVar2;
                                i8 = 0;
                            }
                        }
                    }
                }
                return xVar4;
            default:
                p113v0.M m7 = (p113v0.M) obj;
                p101t.t0 t0Var = (p101t.t0) obj3;
                int i19 = -p081p0.c.O(t0Var.f12430u.f12417a.h(), 0, i9);
                boolean z5 = t0Var.f12431v;
                int i20 = z5 ? 0 : i19;
                if (!z5) {
                    i19 = 0;
                }
                C.c cVar = new C.c((p113v0.N) obj2, i20, i19, i7);
                m7.f13136a = true;
                cVar.invoke(m7);
                m7.f13136a = false;
                return xVar4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(int i, K0 k3, E4.s sVar) {
        super(1);
        this.f145h = 0;
        this.i = i;
        this.f146j = k3;
        this.f147k = sVar;
    }
}
