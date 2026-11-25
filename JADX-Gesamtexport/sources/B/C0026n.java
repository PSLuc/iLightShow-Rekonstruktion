package B;

import F1.C0096m;
import G0.C0110f;
import N.C0217h0;
import N.InterfaceC0203a0;
import android.view.DragEvent;
import androidx.lifecycle.InterfaceC0458s;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import p035g0.AbstractC0712m;
import p035g0.InterfaceC0714o;
import p090r.C0873l;
import p096s.AbstractC0909d;
import p096s.C0907c;
import p096s.C0917j;
import p096s.C0919l;
import p112v.C0987k;
import p112v.C1011w0;
import p112v.C1017z0;
import p124x0.AbstractC1098f;
import p130y0.ViewOnDragListenerC1132g0;

/* JADX INFO: renamed from: B.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0026n extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f372h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f374k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0026n(p024e0.r rVar, androidx.compose.ui.focus.b bVar, D4.c cVar) {
        super(1);
        this.f372h = 8;
        this.i = rVar;
        this.f373j = bVar;
        this.f374k = (E4.l) cVar;
    }

    /* JADX WARN: Type inference failed for: r11v63, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r12v52, types: [D4.a, E4.l] */
    @Override // D4.c
    public final Object invoke(Object obj) {
        boolean zBooleanValue;
        switch (this.f372h) {
            case 0:
                M0.w wVar = (M0.w) obj;
                ((InterfaceC0203a0) this.f373j).setValue(wVar);
                InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) this.f374k;
                boolean zA = E4.k.a((String) interfaceC0203a0.getValue(), wVar.f3453a.f1494h);
                C0110f c0110f = wVar.f3453a;
                interfaceC0203a0.setValue(c0110f.f1494h);
                if (!zA) {
                    ((D4.c) this.i).invoke(c0110f.f1494h);
                }
                return p084p4.x.f10867a;
            case 1:
                p044i0.d dVar = (p044i0.d) obj;
                C0036s0 c0036s0 = (C0036s0) this.i;
                a1 a1VarD = c0036s0.d();
                if (a1VarD != null) {
                    InterfaceC0714o interfaceC0714oF = dVar.B().f();
                    long j4 = ((G0.I) c0036s0.f438x.getValue()).f1470a;
                    long j6 = ((G0.I) c0036s0.f439y.getValue()).f1470a;
                    long j7 = c0036s0.f437w;
                    boolean zB = G0.I.b(j4);
                    M0.q qVar = (M0.q) this.f374k;
                    G0.G g6 = a1VarD.f281a;
                    G0.F f6 = g6.f1458a;
                    O1.u uVar = c0036s0.f436v;
                    if (!zB) {
                        uVar.n(j7);
                        int iB = qVar.b(G0.I.e(j4));
                        int iB2 = qVar.b(G0.I.d(j4));
                        if (iB != iB2) {
                            interfaceC0714oF.k(g6.j(iB, iB2), uVar);
                        }
                    } else if (G0.I.b(j6)) {
                        long j8 = ((M0.w) this.f373j).f3454b;
                        if (!G0.I.b(j8)) {
                            uVar.n(j7);
                            int iB3 = qVar.b(G0.I.e(j8));
                            int iB4 = qVar.b(G0.I.d(j8));
                            if (iB3 != iB4) {
                                interfaceC0714oF.k(g6.j(iB3, iB4), uVar);
                            }
                        }
                    } else {
                        long jB = f6.f1450b.b();
                        p035g0.r rVar = new p035g0.r(jB);
                        if (jB == 16) {
                            rVar = null;
                        }
                        long j9 = rVar != null ? rVar.f9087a : p035g0.r.f9076b;
                        uVar.n(p035g0.r.b(p035g0.r.d(j9) * 0.2f, j9));
                        int iB5 = qVar.b(G0.I.e(j6));
                        int iB6 = qVar.b(G0.I.d(j6));
                        if (iB5 != iB6) {
                            interfaceC0714oF.k(g6.j(iB5, iB6), uVar);
                        }
                    }
                    long j10 = g6.f1460c;
                    float f7 = (int) (j10 >> 32);
                    G0.n nVar = g6.f1459b;
                    boolean z5 = ((f7 > nVar.f1516d ? 1 : (f7 == nVar.f1516d ? 0 : -1)) < 0 || nVar.f1515c || (((float) ((int) (j10 & 4294967295L))) > nVar.f1517e ? 1 : (((float) ((int) (j10 & 4294967295L))) == nVar.f1517e ? 0 : -1)) < 0) && f6.f1454f != 3;
                    if (z5) {
                        p030f0.d dVarE = G4.a.e(0L, S1.h0.f((int) (j10 >> 32), (int) (j10 & 4294967295L)));
                        interfaceC0714oF.l();
                        InterfaceC0714o.t(interfaceC0714oF, dVarE);
                    }
                    G0.C c6 = f6.f1450b.f1472a;
                    R0.j jVar = c6.f1439m;
                    R0.n nVar2 = c6.f1428a;
                    if (jVar == null) {
                        jVar = R0.j.f4746b;
                    }
                    R0.j jVar2 = jVar;
                    p035g0.L l6 = c6.f1440n;
                    if (l6 == null) {
                        l6 = p035g0.L.f9034d;
                    }
                    p035g0.L l7 = l6;
                    p044i0.e eVar = c6.f1442p;
                    if (eVar == null) {
                        eVar = p044i0.g.f9389a;
                    }
                    p044i0.e eVar2 = eVar;
                    try {
                        AbstractC0712m abstractC0712mB = nVar2.b();
                        R0.l lVar = R0.l.f4751a;
                        if (abstractC0712mB != null) {
                            G0.n.h(nVar, interfaceC0714oF, abstractC0712mB, nVar2 != lVar ? nVar2.c() : 1.0f, l7, jVar2, eVar2);
                        } else {
                            G0.n.g(nVar, interfaceC0714oF, nVar2 != lVar ? nVar2.a() : p035g0.r.f9076b, l7, jVar2, eVar2);
                        }
                    } finally {
                        if (z5) {
                            interfaceC0714oF.i();
                        }
                    }
                }
                return p084p4.x.f10867a;
            case 2:
                M0.B b6 = (M0.B) ((E4.w) this.f374k).f1074h;
                M0.w wVarJ = ((D.x) this.i).j((List) obj);
                if (b6 != null) {
                    b6.a(null, wVarJ);
                }
                ((J) this.f373j).invoke(wVarJ);
                return p084p4.x.f10867a;
            case 3:
                C0096m c0096m = (C0096m) this.f373j;
                X.s sVar = (X.s) this.i;
                sVar.add(c0096m);
                return new G1.k((G1.p) this.f374k, c0096m, sVar, 0);
            case 4:
                W.g gVar = (W.g) this.i;
                LinkedHashMap linkedHashMap = gVar.f5530b;
                UUID uuid = (UUID) this.f373j;
                if (linkedHashMap.containsKey(uuid)) {
                    throw new IllegalArgumentException(("Key " + uuid + " was used multiple times ").toString());
                }
                gVar.f5529a.remove(uuid);
                LinkedHashMap linkedHashMap2 = gVar.f5530b;
                W.f fVar = (W.f) this.f374k;
                linkedHashMap2.put(uuid, fVar);
                return new G1.k(fVar, gVar, uuid, 1);
            case 5:
                p124x0.p0 p0Var = (p124x0.p0) obj;
                p013c0.d dVar2 = (p013c0.d) p0Var;
                if (((ViewOnDragListenerC1132g0) ((p130y0.r) AbstractC1098f.t((p013c0.d) this.f373j)).getDragAndDropManager()).f14391b.contains(dVar2)) {
                    DragEvent dragEvent = (DragEvent) ((C0025m0) this.f374k).i;
                    if (G4.a.h(dVar2, p081p0.c.y(dragEvent.getX(), dragEvent.getY()))) {
                        ((E4.w) this.i).f1074h = p0Var;
                        return p124x0.o0.f14051j;
                    }
                }
                return p124x0.o0.f14050h;
            case 6:
                p012c.D d6 = (p012c.D) this.i;
                InterfaceC0458s interfaceC0458s = (InterfaceC0458s) this.f373j;
                p018d.c cVar = (p018d.c) this.f374k;
                d6.a(interfaceC0458s, cVar);
                return new A(6, cVar);
            case 7:
                p012c.D d7 = (p012c.D) this.i;
                InterfaceC0458s interfaceC0458s2 = (InterfaceC0458s) this.f373j;
                p018d.i iVar = (p018d.i) this.f374k;
                d7.a(interfaceC0458s2, iVar);
                return new A(7, iVar);
            case 8:
                p024e0.r rVar2 = (p024e0.r) obj;
                if (E4.k.a(rVar2, (p024e0.r) this.i)) {
                    zBooleanValue = false;
                } else {
                    if (E4.k.a(rVar2, ((androidx.compose.ui.focus.b) this.f373j).f6703f)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) ((E4.l) this.f374k).invoke(rVar2)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 9:
                return new G1.k((X.s) this.i, this.f373j, (C0873l) this.f374k);
            case 10:
                p035g0.J j11 = (p035g0.J) obj;
                p096s.i0 i0Var = (p096s.i0) this.i;
                j11.b(i0Var != null ? ((Number) i0Var.getValue()).floatValue() : 1.0f);
                p096s.i0 i0Var2 = (p096s.i0) this.f373j;
                j11.e(i0Var2 != null ? ((Number) i0Var2.getValue()).floatValue() : 1.0f);
                j11.g(i0Var2 != null ? ((Number) i0Var2.getValue()).floatValue() : 1.0f);
                p096s.i0 i0Var3 = (p096s.i0) this.f374k;
                j11.k(i0Var3 != null ? ((p035g0.P) i0Var3.getValue()).f9053a : p035g0.P.f9051b);
                return p084p4.x.f10867a;
            case 11:
                int iOrdinal = ((p090r.x) obj).ordinal();
                p035g0.P p6 = null;
                p090r.H h6 = (p090r.H) this.f374k;
                if (iOrdinal == 0) {
                    p090r.Q q6 = h6.f11378a;
                } else if (iOrdinal == 1) {
                    p6 = (p035g0.P) this.i;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    p090r.Q q7 = h6.f11378a;
                }
                return new p035g0.P(p6 != null ? p6.f9053a : p035g0.P.f9051b);
            case 12:
                C0917j c0917j = (C0917j) obj;
                C0907c c0907c = (C0907c) this.i;
                AbstractC0909d.l(c0917j, c0907c.f11953c);
                C0217h0 c0217h0 = c0917j.f12018e;
                Object objB = c0907c.b(c0217h0.getValue());
                if (!E4.k.a(objB, c0217h0.getValue())) {
                    c0907c.f11953c.i.setValue(objB);
                    ((C0919l) this.f373j).i.setValue(objB);
                    c0917j.i.setValue(Boolean.FALSE);
                    c0917j.f12017d.invoke();
                    ((E4.s) this.f374k).f1070h = true;
                }
                return p084p4.x.f10867a;
            case 13:
                float fFloatValue = ((Number) obj).floatValue();
                C0987k c0987k = (C0987k) this.i;
                float f8 = c0987k.f13009w ? 1.0f : -1.0f;
                C1017z0 c1017z0 = c0987k.f13008v;
                long jD = c1017z0.d(c1017z0.g(f8 * fFloatValue));
                C1017z0 c1017z1 = ((C1011w0) this.f374k).f13086a;
                float f9 = c1017z0.f(c1017z0.d(C1017z0.a(c1017z1, c1017z1.f13111h, jD, 1))) * f8;
                if (Math.abs(f9) < Math.abs(fFloatValue)) {
                    P4.T t6 = (P4.T) this.f373j;
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + f9 + " < " + fFloatValue + ')');
                    cancellationException.initCause(null);
                    t6.c(cancellationException);
                }
                return p084p4.x.f10867a;
            case 14:
                p113v0.M m6 = (p113v0.M) obj;
                p123x.L l8 = (p123x.L) this.i;
                boolean z6 = l8.f13700w;
                p113v0.H h7 = (p113v0.H) this.f374k;
                p113v0.N n6 = (p113v0.N) this.f373j;
                if (z6) {
                    p113v0.M.f(m6, n6, h7.H(l8.f13698u), h7.H(l8.f13699v));
                } else {
                    p113v0.M.d(m6, n6, h7.H(l8.f13698u), h7.H(l8.f13699v));
                }
                return p084p4.x.f10867a;
            case 15:
                p113v0.M m7 = (p113v0.M) obj;
                p123x.M m8 = (p123x.M) this.i;
                long j12 = ((S0.h) m8.f13701u.invoke((p113v0.H) this.f373j)).f4890a;
                boolean z7 = m8.f13702v;
                p113v0.N n7 = (p113v0.N) this.f374k;
                if (z7) {
                    p113v0.M.g(m7, n7, (int) (j12 >> 32), (int) (j12 & 4294967295L));
                } else {
                    p113v0.M.h(m7, n7, (int) (j12 >> 32), (int) (j12 & 4294967295L), null, 12);
                }
                return p084p4.x.f10867a;
            case 16:
                p113v0.M m9 = (p113v0.M) obj;
                p123x.N n8 = (p123x.N) this.i;
                boolean z8 = n8.f13707y;
                p113v0.H h8 = (p113v0.H) this.f374k;
                p113v0.N n9 = (p113v0.N) this.f373j;
                if (z8) {
                    p113v0.M.f(m9, n9, h8.H(n8.f13703u), h8.H(n8.f13704v));
                } else {
                    p113v0.M.d(m9, n9, h8.H(n8.f13703u), h8.H(n8.f13704v));
                }
                return p084p4.x.f10867a;
            default:
                p123x.P p7 = (p123x.P) this.f374k;
                p123x.O o6 = p7.f13712u;
                p113v0.H h9 = (p113v0.H) this.f373j;
                p113v0.M.d((p113v0.M) obj, (p113v0.N) this.i, h9.H(o6.b(h9.getLayoutDirection())), h9.H(p7.f13712u.d()));
                return p084p4.x.f10867a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0026n(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.f372h = i;
        this.i = obj;
        this.f373j = obj2;
        this.f374k = obj3;
    }
}
