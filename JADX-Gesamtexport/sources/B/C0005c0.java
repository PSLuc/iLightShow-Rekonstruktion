package B;

import F.C0074p;
import F1.C0085b;
import F1.C0096m;
import F1.C0099p;
import L.AbstractC0190x0;
import L.C0164o0;
import M0.C0198a;
import N.C0212f;
import N.C0214g;
import N.C0217h0;
import N.C0239t;
import N.C0248x0;
import N.EnumC0236r0;
import N.InterfaceC0203a0;
import P4.C0319f;
import android.content.ClipDescription;
import android.graphics.Typeface;
import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.InterfaceC0457q;
import androidx.lifecycle.InterfaceC0458s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import p035g0.C0711l;
import p123x.C1068a;
import p130y0.C1126d0;
import p130y0.C1131g;

/* JADX INFO: renamed from: B.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0005c0 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f293h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f294j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0005c0(int i, Object obj, Object obj2, boolean z5) {
        super(1);
        this.f293h = i;
        this.f294j = obj;
        this.i = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x025b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:122:0x025c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0475  */
    /* JADX WARN: Code duplicated, block: B:245:0x0595  */
    @Override // D4.c
    public final Object invoke(Object obj) {
        C0036s0 c0036s0;
        boolean z5;
        p130y0.Y y2;
        F1.B b6;
        F1.B b7;
        C0460u c0460uF;
        Typeface typefaceJ;
        String strConcat;
        int i = 3;
        int i3 = 4;
        int i6 = 2;
        L0.r rVar = null;
        boolean z6 = true;
        boolean z7 = true;
        zD = true;
        boolean zD = true;
        int i7 = 0;
        switch (this.f293h) {
            case 0:
                KeyEvent keyEvent = ((p081p0.b) obj).f10828a;
                if (((C0036s0) this.i).a() == EnumC0011f0.i && keyEvent.getKeyCode() == 4 && p081p0.c.o0(keyEvent) == 1) {
                    ((F.P) this.f294j).e(null);
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 1:
                p113v0.M m6 = (p113v0.M) obj;
                ArrayList arrayListL = AbstractC0029o0.l((List) this.i, (D4.a) ((C0038t0) this.f294j).f442b);
                if (arrayListL != null) {
                    int size = arrayListL.size();
                    while (i7 < size) {
                        p084p4.h hVar = (p084p4.h) arrayListL.get(i7);
                        p113v0.N n6 = (p113v0.N) hVar.f10849h;
                        D4.a aVar = (D4.a) hVar.i;
                        p113v0.M.e(m6, n6, aVar != null ? ((S0.h) aVar.invoke()).f4890a : 0L);
                        i7++;
                    }
                }
                return p084p4.x.f10867a;
            case 2:
                KeyEvent keyEvent2 = ((p081p0.b) obj).f10828a;
                InputDevice device = keyEvent2.getDevice();
                if (device == null || !device.supportsSource(513) || device.isVirtual() || p081p0.c.o0(keyEvent2) != 2 || keyEvent2.getSource() == 257) {
                    zD = false;
                } else {
                    boolean zK = AbstractC0029o0.k(19, keyEvent2);
                    p024e0.g gVar = (p024e0.g) this.f294j;
                    if (zK) {
                        zD = ((androidx.compose.ui.focus.b) gVar).d(5);
                    } else if (AbstractC0029o0.k(20, keyEvent2)) {
                        zD = ((androidx.compose.ui.focus.b) gVar).d(6);
                    } else if (AbstractC0029o0.k(21, keyEvent2)) {
                        zD = ((androidx.compose.ui.focus.b) gVar).d(3);
                    } else if (AbstractC0029o0.k(22, keyEvent2)) {
                        zD = ((androidx.compose.ui.focus.b) gVar).d(4);
                    } else if (AbstractC0029o0.k(23, keyEvent2)) {
                        p130y0.C0 c6 = ((C0036s0) this.i).f418c;
                        if (c6 != null) {
                            ((C1126d0) c6).b();
                        }
                    } else {
                        zD = false;
                    }
                }
                return Boolean.valueOf(zD);
            case 3:
                return new N0((InterfaceC0203a0) this.i, i7, (p117w.m) this.f294j);
            case 4:
                f1 f1Var = (f1) this.i;
                X.s sVar = f1Var.f318d;
                D4.c cVar = (D4.c) this.f294j;
                sVar.add(cVar);
                return new N0(f1Var, z6 ? 1 : 0, cVar);
            case 5:
                p113v0.M m7 = (p113v0.M) obj;
                ArrayList arrayList = (ArrayList) this.i;
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        p084p4.h hVar2 = (p084p4.h) arrayList.get(i8);
                        p113v0.M.e(m7, (p113v0.N) hVar2.f10849h, ((S0.h) hVar2.i).f4890a);
                    }
                }
                ArrayList arrayList2 = (ArrayList) this.f294j;
                if (arrayList2 != null) {
                    int size3 = arrayList2.size();
                    while (i7 < size3) {
                        p084p4.h hVar3 = (p084p4.h) arrayList2.get(i7);
                        p113v0.N n7 = (p113v0.N) hVar3.f10849h;
                        D4.a aVar2 = (D4.a) hVar3.i;
                        p113v0.M.e(m7, n7, aVar2 != null ? ((S0.h) aVar2.invoke()).f4890a : 0L);
                        i7++;
                    }
                }
                return p084p4.x.f10867a;
            case 6:
                M4.i iVar = (M4.i) obj;
                E4.u uVar = (E4.u) this.i;
                if (uVar.f1072h == -1) {
                    uVar.f1072h = iVar.a().f1941h;
                }
                ((E4.u) this.f294j).f1072h = iVar.a().i + 1;
                return "";
            case 7:
                p091r0.q qVar = (p091r0.q) obj;
                long j4 = qVar.f11510c;
                C0074p c0074p = (C0074p) this.f294j;
                C0025m0 c0025m0 = (C0025m0) this.i;
                F.P p6 = (F.P) c0025m0.i;
                if (!p6.h() || p6.j().f3453a.f1494h.length() == 0 || (c0036s0 = p6.f1123d) == null || c0036s0.d() == null) {
                    z7 = false;
                } else {
                    c0025m0.j(p6.j(), j4, false, c0074p);
                }
                if (z7) {
                    qVar.a();
                }
                return p084p4.x.f10867a;
            case 8:
                p107u.g gVar2 = (p107u.g) obj;
                F.P p7 = (F.P) this.f294j;
                boolean zB = G0.I.b(p7.j().f3454b);
                C0217h0 c0217h0 = p7.f1128j;
                boolean z8 = !zB && ((Boolean) c0217h0.getValue()).booleanValue();
                C0045x c0045x = new C0045x(1);
                p107u.l lVar = (p107u.l) this.i;
                p107u.g.b(gVar2, c0045x, z8, new F.U(lVar, p7, i7));
                p107u.g.b(gVar2, new C0045x(2), !zB, new F.U(lVar, p7, z6 ? 1 : 0));
                if (!((Boolean) c0217h0.getValue()).booleanValue() || (y2 = p7.f1125f) == null) {
                    z5 = false;
                } else {
                    ClipDescription primaryClipDescription = ((C1131g) y2).f14389a.getPrimaryClipDescription();
                    if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
                p107u.g.b(gVar2, new C0045x(3), z5, new F.U(lVar, p7, i6));
                p107u.g.b(gVar2, new C0045x(4), G0.I.c(p7.j().f3454b) != p7.j().f3453a.f1494h.length(), new F.U(lVar, p7, i));
                return p084p4.x.f10867a;
            case 9:
                F1.L l6 = (F1.L) obj;
                E4.k.f("$this$navOptions", l6);
                k1 k1Var = l6.f1302a;
                k1Var.f351a = 0;
                k1Var.f352b = 0;
                F1.B b8 = (F1.B) this.i;
                if (b8 instanceof F1.E) {
                    int i9 = F1.B.f1242p;
                    Iterator it = G4.a.w(b8).iterator();
                    do {
                        boolean zHasNext = it.hasNext();
                        F1.I i10 = (F1.I) this.f294j;
                        if (zHasNext) {
                            b6 = (F1.B) it.next();
                            C0096m c0096m = (C0096m) i10.f1276g.l();
                            b7 = c0096m != null ? c0096m.i : null;
                        } else {
                            int i11 = F1.E.f1258u;
                            Iterator it2 = L4.l.P(i10.f(), C0085b.f1336o).iterator();
                            if (!it2.hasNext()) {
                                throw new NoSuchElementException("Sequence is empty.");
                            }
                            Object next = it2.next();
                            while (it2.hasNext()) {
                                next = it2.next();
                            }
                            l6.f1305d = ((F1.B) next).f1247m;
                            l6.f1306e = true;
                        }
                    } while (!E4.k.a(b6, b7 != null ? b7.i : null));
                }
                return p084p4.x.f10867a;
            case 10:
                F1.I i12 = (F1.I) this.i;
                i12.getClass();
                InterfaceC0458s interfaceC0458s = (InterfaceC0458s) this.f294j;
                E4.k.f("owner", interfaceC0458s);
                if (!interfaceC0458s.equals(i12.f1283o)) {
                    InterfaceC0458s interfaceC0458s2 = i12.f1283o;
                    C0099p c0099p = i12.f1287s;
                    if (interfaceC0458s2 != null && (c0460uF = interfaceC0458s2.f()) != null) {
                        c0460uF.f(c0099p);
                    }
                    i12.f1283o = interfaceC0458s;
                    interfaceC0458s.f().a(c0099p);
                }
                return new G1.t(0);
            case 11:
                return new N0((N.V0) this.i, i, (G1.i) this.f294j);
            case 12:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                G2.a aVar3 = (G2.a) this.i;
                aVar3.f1680c.setValue(aVar3.a());
                ((D4.c) this.f294j).invoke(bool);
                return p084p4.x.f10867a;
            case 13:
                E4.k.f("$this$DisposableEffect", (N.G) obj);
                C0460u c0460u = (C0460u) this.i;
                InterfaceC0457q interfaceC0457q = (InterfaceC0457q) this.f294j;
                c0460u.a(interfaceC0457q);
                return new N0(c0460u, i3, interfaceC0457q);
            case 14:
                p044i0.d dVar = (p044i0.d) obj;
                float fY = dVar.y(AbstractC0190x0.f2974c);
                N.V0 v6 = (N.V0) this.i;
                float f6 = 2;
                float f7 = fY / f6;
                p044i0.d.c0(dVar, ((p035g0.r) v6.getValue()).f9087a, dVar.y(M.o.f3272a / f6) - f7, 0L, new p044i0.h(fY, 0.0f, 0, 0, 30), 108);
                N.V0 v7 = (N.V0) this.f294j;
                if (Float.compare(((S0.e) v7.getValue()).f4887h, 0) > 0) {
                    p044i0.d.c0(dVar, ((p035g0.r) v6.getValue()).f9087a, dVar.y(((S0.e) v7.getValue()).f4887h) - f7, 0L, p044i0.g.f9389a, 108);
                }
                return p084p4.x.f10867a;
            case 15:
                ((C0164o0) this.i).f2861a.setValue(new p123x.B((C1068a) this.f294j, (p123x.a0) obj));
                return p084p4.x.f10867a;
            case 16:
                float fD = p030f0.c.d(p091r0.o.g((p091r0.q) obj, false));
                boolean z9 = ((E4.s) this.f294j).f1070h;
                L.A0 a6 = (L.A0) this.i;
                if (((Boolean) a6.f2155m.getValue()).booleanValue()) {
                    fD = -fD;
                }
                a6.e(fD, z9);
                return p084p4.x.f10867a;
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                L0.e eVar = (L0.e) this.i;
                eVar.f3019d.getClass();
                L0.q qVar2 = (L0.q) this.f294j;
                eVar.f3020e.getClass();
                L0.p pVar = qVar2.f3033a;
                boolean z10 = pVar == null ? true : pVar instanceof L0.b;
                int i13 = qVar2.f3035c;
                L0.k kVar = qVar2.f3034b;
                if (!z10) {
                    if (pVar instanceof L0.m) {
                        ((L0.m) pVar).getClass();
                        typefaceJ = W2.g.j("sans-serif", kVar, i13);
                    }
                    if (rVar != null) {
                        return rVar;
                    }
                    throw new IllegalStateException("Could not load font");
                }
                typefaceJ = W2.g.j(null, kVar, i13);
                rVar = new L0.r(typefaceJ, true);
                if (rVar != null) {
                    return rVar;
                }
                throw new IllegalStateException("Could not load font");
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                L0.r rVar2 = (L0.r) obj;
                D.x xVar = (D.x) this.i;
                W2.g gVar3 = (W2.g) xVar.i;
                L0.q qVar3 = (L0.q) this.f294j;
                synchronized (gVar3) {
                    try {
                        if (rVar2.i) {
                            ((K0.b) xVar.f707j).b(qVar3, rVar2);
                        } else {
                            ((K0.b) xVar.f707j).c(qVar3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return p084p4.x.f10867a;
            case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                M0.i iVar2 = (M0.i) obj;
                String str = ((M0.i) this.i) == iVar2 ? " > " : "   ";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                ((D.x) this.f294j).getClass();
                if (iVar2 instanceof C0198a) {
                    StringBuilder sb2 = new StringBuilder("CommitTextCommand(text.length=");
                    C0198a c0198a = (C0198a) iVar2;
                    sb2.append(c0198a.f3395a.f1494h.length());
                    sb2.append(", newCursorPosition=");
                    strConcat = AbstractC0013g0.k(sb2, c0198a.f3396b, ')');
                } else if (iVar2 instanceof M0.u) {
                    StringBuilder sb3 = new StringBuilder("SetComposingTextCommand(text.length=");
                    M0.u uVar2 = (M0.u) iVar2;
                    sb3.append(uVar2.f3449a.f1494h.length());
                    sb3.append(", newCursorPosition=");
                    strConcat = AbstractC0013g0.k(sb3, uVar2.f3450b, ')');
                } else if ((iVar2 instanceof M0.t) || (iVar2 instanceof M0.g) || (iVar2 instanceof M0.h) || (iVar2 instanceof M0.v)) {
                    strConcat = iVar2.toString();
                } else if (iVar2 instanceof M0.k) {
                    ((M0.k) iVar2).getClass();
                    strConcat = "FinishComposingTextCommand()";
                } else if (iVar2 instanceof M0.f) {
                    ((M0.f) iVar2).getClass();
                    strConcat = "DeleteAllCommand()";
                } else {
                    String strB = E4.x.a(iVar2.getClass()).b();
                    if (strB == null) {
                        strB = "{anonymous EditCommand}";
                    }
                    strConcat = "Unknown EditCommand: ".concat(strB);
                }
                sb.append(strConcat);
                return sb.toString();
            case 20:
                C0214g c0214g = (C0214g) this.i;
                Object obj2 = c0214g.i;
                C0212f c0212f = (C0212f) this.f294j;
                synchronized (obj2) {
                    c0214g.f3699k.remove(c0212f);
                    if (c0214g.f3699k.isEmpty()) {
                        c0214g.f3701m.set(0);
                    }
                    break;
                }
                return p084p4.x.f10867a;
            case 21:
                N.P p8 = (N.P) this.i;
                Object obj3 = p8.f3648c;
                C0319f c0319f = (C0319f) this.f294j;
                synchronized (obj3) {
                    ((ArrayList) p8.f3647b).remove(c0319f);
                }
                return p084p4.x.f10867a;
            case 22:
                Throwable th2 = (Throwable) obj;
                C0248x0 c0248x0 = (C0248x0) this.i;
                Object obj4 = c0248x0.f3855b;
                Throwable th3 = (Throwable) this.f294j;
                synchronized (obj4) {
                    if (th3 == null) {
                        th3 = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                p081p0.c.D(th3, th2);
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    c0248x0.f3857d = th3;
                    S4.P p9 = c0248x0.f3870r;
                    EnumC0236r0 enumC0236r0 = EnumC0236r0.f3785h;
                    p9.getClass();
                    p9.i(null, enumC0236r0);
                }
                return p084p4.x.f10867a;
            case 23:
                ((C0239t) this.i).w(obj);
                p080p.A a7 = (p080p.A) this.f294j;
                if (a7 != null) {
                    a7.a(obj);
                }
                return p084p4.x.f10867a;
            case 24:
                ((Q4.c) this.i).f4701j.removeCallbacks((O1.n) this.f294j);
                return p084p4.x.f10867a;
            case 25:
                V0.y yVar = (V0.y) this.i;
                yVar.setPositionProvider((V0.A) this.f294j);
                yVar.l();
                return new V0.h();
            case 26:
                p113v0.M m8 = (p113v0.M) obj;
                float f8 = ((Z.s) this.f294j).f5977u;
                p113v0.N n8 = (p113v0.N) this.i;
                m8.getClass();
                long jC = S1.h0.c(0, 0);
                p113v0.M.a(m8, n8);
                n8.h0(S0.h.c(jC, n8.f13140l), f8, null);
                return p084p4.x.f10867a;
            case 27:
                p113v0.M.h((p113v0.M) obj, (p113v0.N) this.i, 0, 0, ((C0711l) this.f294j).f9072u, 4);
                return p084p4.x.f10867a;
            case 28:
                p113v0.M.h((p113v0.M) obj, (p113v0.N) this.i, 0, 0, ((p035g0.N) this.f294j).f9043F, 4);
                return p084p4.x.f10867a;
            default:
                p113v0.M m9 = (p113v0.M) obj;
                float fH = ((p090r.w) this.f294j).f11446c.h();
                p113v0.N n9 = (p113v0.N) this.i;
                m9.getClass();
                long jC2 = S1.h0.c(0, 0);
                p113v0.M.a(m9, n9);
                n9.h0(S0.h.c(jC2, n9.f13140l), fH, null);
                return p084p4.x.f10867a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0005c0(Object obj, int i, Object obj2) {
        super(1);
        this.f293h = i;
        this.i = obj;
        this.f294j = obj2;
    }
}
