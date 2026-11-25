package N;

import android.os.Trace;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p124x0.AbstractC1098f;
import p124x0.C1095c;
import p124x0.C1111t;
import p124x0.C1116y;
import p124x0.InterfaceC1114w;

/* JADX INFO: renamed from: N.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0237s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f3795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f3797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f3798h;
    public Object i;

    public C0237s(p124x0.D d6) {
        this.f3791a = 1;
        this.f3792b = d6;
        C1111t c1111t = new C1111t(d6);
        this.f3793c = c1111t;
        this.f3794d = c1111t;
        p124x0.n0 n0Var = c1111t.f14060Q;
        this.f3795e = n0Var;
        this.f3796f = n0Var;
    }

    public static final void a(C0237s c0237s, Z.n nVar, p124x0.Y y2) {
        c0237s.getClass();
        for (Z.n nVar2 = nVar.f5961l; nVar2 != null; nVar2 = nVar2.f5961l) {
            if (nVar2 == p124x0.V.f13962a) {
                p124x0.D dR = ((p124x0.D) c0237s.f3792b).r();
                y2.f13991u = dR != null ? (C1111t) dR.f13828C.f3793c : null;
                c0237s.f3794d = y2;
                return;
            } else {
                if ((nVar2.f5959j & 2) != 0) {
                    return;
                }
                nVar2.x0(y2);
            }
        }
    }

    public static Z.n b(Z.m mVar, Z.n nVar) {
        Z.n nVarL;
        if (mVar instanceof p124x0.Q) {
            nVarL = ((p124x0.Q) mVar).l();
            nVarL.f5959j = p124x0.Z.g(nVarL);
        } else {
            C1095c c1095c = new C1095c();
            c1095c.f5959j = p124x0.Z.e(mVar);
            c1095c.f14000u = mVar;
            c1095c.f14002w = new HashSet();
            nVarL = c1095c;
        }
        if (nVarL.f5969t) {
            p027e3.a.y0("A ModifierNodeElement cannot return an already attached node from create() ");
            throw null;
        }
        nVarL.f5965p = true;
        Z.n nVar2 = nVar.f5962m;
        if (nVar2 != null) {
            nVar2.f5961l = nVarL;
            nVarL.f5962m = nVar2;
        }
        nVar.f5962m = nVarL;
        nVarL.f5961l = nVar;
        return nVarL;
    }

    public static Z.n c(Z.n nVar) {
        boolean z5 = nVar.f5969t;
        if (z5) {
            p080p.v vVar = p124x0.Z.f13997a;
            if (!z5) {
                p027e3.a.y0("autoInvalidateRemovedNode called on unattached node");
                throw null;
            }
            p124x0.Z.b(nVar, -1, 2);
            nVar.v0();
            nVar.q0();
        }
        Z.n nVar2 = nVar.f5962m;
        Z.n nVar3 = nVar.f5961l;
        if (nVar2 != null) {
            nVar2.f5961l = nVar3;
            nVar.f5962m = null;
        }
        if (nVar3 != null) {
            nVar3.f5962m = nVar2;
            nVar.f5961l = null;
        }
        E4.k.c(nVar3);
        return nVar3;
    }

    public static void l(Z.m mVar, Z.m mVar2, Z.n nVar) {
        if ((mVar instanceof p124x0.Q) && (mVar2 instanceof p124x0.Q)) {
            p124x0.U u6 = p124x0.V.f13962a;
            E4.k.d("null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe", nVar);
            ((p124x0.Q) mVar2).m(nVar);
            if (nVar.f5969t) {
                p124x0.Z.d(nVar);
                return;
            } else {
                nVar.f5966q = true;
                return;
            }
        }
        if (!(nVar instanceof C1095c)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        C1095c c1095c = (C1095c) nVar;
        if (c1095c.f5969t) {
            c1095c.z0();
        }
        c1095c.f14000u = mVar2;
        c1095c.f5959j = p124x0.Z.e(mVar2);
        if (c1095c.f5969t) {
            c1095c.y0(false);
        }
        if (nVar.f5969t) {
            p124x0.Z.d(nVar);
        } else {
            nVar.f5966q = true;
        }
    }

    public void d() {
        p080p.z zVar = (p080p.z) this.f3792b;
        if (zVar.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = zVar.iterator();
            while (true) {
                L4.h hVar = (L4.h) it;
                if (!hVar.hasNext()) {
                    Trace.endSection();
                    return;
                } else {
                    InterfaceC0250y0 interfaceC0250y0 = (InterfaceC0250y0) hVar.next();
                    hVar.remove();
                    interfaceC0250y0.b();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void e() {
        g(Integer.MIN_VALUE);
        ArrayList arrayList = (ArrayList) this.f3794d;
        boolean zIsEmpty = arrayList.isEmpty();
        p080p.z zVar = (p080p.z) this.f3792b;
        if (!zIsEmpty) {
            Trace.beginSection("Compose:onForgotten");
            try {
                p080p.A a6 = (p080p.A) this.f3797g;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(size);
                    if (obj instanceof InterfaceC0250y0) {
                        zVar.remove(obj);
                        ((InterfaceC0250y0) obj).e();
                    }
                    if (obj instanceof InterfaceC0220j) {
                        if (a6 == null || !a6.c(obj)) {
                            ((InterfaceC0220j) obj).c();
                        } else {
                            ((InterfaceC0220j) obj).b();
                        }
                    }
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f3793c;
        if (arrayList2.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:onRemembered");
        try {
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                InterfaceC0250y0 interfaceC0250y0 = (InterfaceC0250y0) arrayList2.get(i);
                zVar.remove(interfaceC0250y0);
                interfaceC0250y0.a();
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public boolean f(int i) {
        return (((Z.n) this.f3796f).f5960k & i) != 0;
    }

    public void g(int i) {
        ArrayList arrayList = (ArrayList) this.f3796f;
        if (arrayList.isEmpty()) {
            return;
        }
        int i3 = 0;
        ArrayList arrayListN = null;
        int i6 = 0;
        p080p.p pVar = null;
        p080p.p pVar2 = null;
        while (true) {
            p080p.p pVar3 = (p080p.p) this.i;
            if (i6 >= pVar3.f10759b) {
                break;
            }
            if (i <= pVar3.c(i6)) {
                Object objRemove = arrayList.remove(i6);
                int iD = pVar3.d(i6);
                int iD2 = ((p080p.p) this.f3798h).d(i6);
                if (arrayListN == null) {
                    arrayListN = p089q4.m.N(objRemove);
                    pVar2 = new p080p.p();
                    pVar2.a(iD);
                    pVar = new p080p.p();
                    pVar.a(iD2);
                } else {
                    E4.k.d("null cannot be cast to non-null type androidx.collection.MutableIntList", pVar);
                    E4.k.d("null cannot be cast to non-null type androidx.collection.MutableIntList", pVar2);
                    arrayListN.add(objRemove);
                    pVar2.a(iD);
                    pVar.a(iD2);
                }
            } else {
                i6++;
            }
        }
        if (arrayListN != null) {
            E4.k.d("null cannot be cast to non-null type androidx.collection.MutableIntList", pVar);
            E4.k.d("null cannot be cast to non-null type androidx.collection.MutableIntList", pVar2);
            int size = arrayListN.size() - 1;
            while (i3 < size) {
                int i7 = i3 + 1;
                int size2 = arrayListN.size();
                for (int i8 = i7; i8 < size2; i8++) {
                    int iC = pVar2.c(i3);
                    int iC2 = pVar2.c(i8);
                    if (iC < iC2 || (iC2 == iC && pVar.c(i3) < pVar.c(i8))) {
                        Object obj = arrayListN.get(i3);
                        arrayListN.set(i3, arrayListN.get(i8));
                        arrayListN.set(i8, obj);
                        int iC3 = pVar.c(i3);
                        pVar.e(i3, pVar.c(i8));
                        pVar.e(i8, iC3);
                        int iC4 = pVar2.c(i3);
                        pVar2.e(i3, pVar2.c(i8));
                        pVar2.e(i8, iC4);
                    }
                }
                i3 = i7;
            }
            ((ArrayList) this.f3794d).addAll(arrayListN);
        }
    }

    public void h(Object obj, int i, int i3, int i6) {
        g(i);
        if (i6 < 0 || i6 >= i) {
            ((ArrayList) this.f3794d).add(obj);
            return;
        }
        ((ArrayList) this.f3796f).add(obj);
        ((p080p.p) this.f3798h).a(i3);
        ((p080p.p) this.i).a(i6);
    }

    public void i() {
        for (Z.n nVar = (Z.n) this.f3796f; nVar != null; nVar = nVar.f5962m) {
            nVar.u0();
            if (nVar.f5965p) {
                p124x0.Z.a(nVar);
            }
            if (nVar.f5966q) {
                p124x0.Z.d(nVar);
            }
            nVar.f5965p = false;
            nVar.f5966q = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0132 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x010e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0118  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:74:0x0180  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:76:0x0188
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public void j(int r31, P.d r32, P.d r33, Z.n r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0237s.j(int, P.d, P.d, Z.n, boolean):void");
    }

    public void k() {
        p124x0.D d6;
        C1116y c1116y;
        p124x0.e0 e0Var;
        Z.n nVar = ((p124x0.n0) this.f3795e).f5961l;
        p124x0.Y y2 = (C1111t) this.f3793c;
        while (true) {
            d6 = (p124x0.D) this.f3792b;
            if (nVar == null) {
                break;
            }
            InterfaceC1114w interfaceC1114wF = AbstractC1098f.f(nVar);
            if (interfaceC1114wF != null) {
                p124x0.Y y6 = nVar.f5964o;
                if (y6 != null) {
                    c1116y = (C1116y) y6;
                    InterfaceC1114w interfaceC1114w = c1116y.f14069Q;
                    c1116y.j1(interfaceC1114wF);
                    if (interfaceC1114w != nVar && (e0Var = c1116y.f13988K) != null) {
                        e0Var.invalidate();
                    }
                } else {
                    c1116y = new C1116y(d6, interfaceC1114wF);
                    nVar.x0(c1116y);
                }
                y2.f13991u = c1116y;
                c1116y.f13990t = y2;
                y2 = c1116y;
            } else {
                nVar.x0(y2);
            }
            nVar = nVar.f5961l;
        }
        p124x0.D dR = d6.r();
        y2.f13991u = dR != null ? (C1111t) dR.f13828C.f3793c : null;
        this.f3794d = y2;
    }

    public String toString() {
        switch (this.f3791a) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                Z.n nVar = (Z.n) this.f3796f;
                p124x0.n0 n0Var = (p124x0.n0) this.f3795e;
                if (nVar == n0Var) {
                    sb.append("]");
                } else {
                    while (nVar != null && nVar != n0Var) {
                        sb.append(String.valueOf(nVar));
                        if (nVar.f5962m == n0Var) {
                            sb.append("]");
                        } else {
                            sb.append(",");
                            nVar = nVar.f5962m;
                        }
                    }
                }
                String string = sb.toString();
                E4.k.e("StringBuilder().apply(builderAction).toString()", string);
                return string;
            default:
                return super.toString();
        }
    }

    public C0237s(p080p.z zVar) {
        this.f3791a = 0;
        this.f3792b = zVar;
        this.f3793c = new ArrayList();
        this.f3794d = new ArrayList();
        this.f3795e = new ArrayList();
        this.f3796f = new ArrayList();
        this.f3798h = new p080p.p();
        this.i = new p080p.p();
    }
}
