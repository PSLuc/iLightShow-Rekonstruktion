package N3;

import B.AbstractC0013g0;
import L.AbstractC0149j0;
import L.AbstractC0176s1;
import L.AbstractC0178t0;
import L.J1;
import L.W1;
import L.e2;
import L.g2;
import L.h2;
import N.C0208d;
import N.C0209d0;
import N.C0222k;
import N.C0227m0;
import N.C0230o;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import androidx.compose.foundation.layout.FillElement;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.R;
import com.nanjoran.ilightshow.Services.Palette;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.RecurringDays;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import p058l0.C0822e;
import p058l0.C0823f;
import p123x.AbstractC1070c;
import p123x.AbstractC1078k;
import p123x.AbstractC1084q;
import p123x.AbstractC1088v;
import p123x.C1069b;
import p123x.C1071d;
import p123x.C1075h;
import p123x.C1090x;
import p123x.C1091y;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: renamed from: N3.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0272j0 implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4202h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C0272j0(int i, Object obj) {
        this.f4202h = i;
        this.i = obj;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x01e4  */
    private final Object a(Object obj, Object obj2, Object obj3) {
        boolean z5;
        C0230o c0230o = (C0230o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        E4.k.f("$this$Button", (p123x.V) obj);
        if ((iIntValue & 81) == 16 && c0230o.B()) {
            c0230o.P();
        } else {
            Z.e eVar = Z.b.f5944t;
            C1069b c1069b = AbstractC1078k.f13777a;
            C1075h c1075h = new C1075h(8);
            Z.l lVar = Z.l.f5957a;
            C1090x c1090xA = AbstractC1088v.a(c1075h, eVar, c0230o, 54);
            int i = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
            Z.o oVarC = Z.a.c(c0230o, lVar);
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(C1101i.f14041e, c0230o, c1090xA);
            C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
            C1100h c1100h = C1101i.f14042f;
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i))) {
                p012c.k.y(i, c0230o, i, c1100h);
            }
            C0208d.R(C1101i.f14039c, c0230o, oVarC);
            C0823f c0823fB = p081p0.c.f10830b;
            if (c0823fB == null) {
                C0822e c0822e = new C0822e("Filled.Mic", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i3 = p058l0.G.f10217a;
                p035g0.O o6 = new p035g0.O(p035g0.r.f9076b);
                C0227m0 c0227m0 = new C0227m0(2);
                c0227m0.i(12.0f, 14.0f);
                c0227m0.d(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
                c0227m0.g(15.0f, 5.0f);
                c0227m0.d(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                c0227m0.j(9.0f, 3.34f, 9.0f, 5.0f);
                c0227m0.n(6.0f);
                c0227m0.d(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                c0227m0.b();
                c0227m0.i(17.3f, 11.0f);
                c0227m0.d(0.0f, 3.0f, -2.54f, 5.1f, -5.3f, 5.1f);
                c0227m0.j(6.7f, 14.0f, 6.7f, 11.0f);
                c0227m0.g(5.0f, 11.0f);
                c0227m0.d(0.0f, 3.41f, 2.72f, 6.23f, 6.0f, 6.72f);
                c0227m0.g(11.0f, 21.0f);
                c0227m0.f(2.0f);
                c0227m0.n(-3.28f);
                c0227m0.d(3.28f, -0.48f, 6.0f, -3.3f, 6.0f, -6.72f);
                c0227m0.f(-1.7f);
                c0227m0.b();
                C0822e.a(c0822e, c0227m0.f3729h, o6);
                c0823fB = c0822e.b();
                p081p0.c.f10830b = c0823fB;
            }
            C0823f c0823f = c0823fB;
            String strK = AbstractC0599v0.K(R.string.microphone_title, c0230o);
            long j4 = p035g0.r.f9080f;
            AbstractC0149j0.b(c0823f, strK, null, j4, c0230o, 3072, 4);
            if (com.nanjoran.ilightshow.Services.M.f8305O.f8325l.b()) {
                c0230o.V(-334969551);
                Object obj4 = ((E4.w) this.i).f1074h;
                if (obj4 != null) {
                    B3.f fVar = (B3.f) obj4;
                    if (fVar.f573s == null) {
                        c0230o.V(-334901258);
                        z5 = false;
                        e2.b(AbstractC0599v0.K(R.string.main_on, c0230o), null, j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o.k(h2.f2777a)).f2756l, c0230o, 384, 0, 65530);
                        c0230o = c0230o;
                        c0230o.p(false);
                    } else {
                        if (((Double) fVar.f568n.getValue()) != null) {
                            c0230o.V(-334490570);
                            AbstractC0149j0.b(G4.a.t(), AbstractC0599v0.K(R.string.microphone_title, c0230o), androidx.compose.foundation.layout.c.h(lVar, 16), p035g0.r.f9082h, c0230o, 3456, 0);
                            c0230o.p(false);
                        } else {
                            c0230o.V(-334033630);
                            AbstractC0178t0.a(androidx.compose.foundation.layout.c.h(lVar, 16), 0L, 1, 0L, 0, c0230o, 390, 26);
                            c0230o = c0230o;
                            c0230o.p(false);
                        }
                        z5 = false;
                    }
                } else {
                    c0230o.V(-334901258);
                    z5 = false;
                    e2.b(AbstractC0599v0.K(R.string.main_on, c0230o), null, j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o.k(h2.f2777a)).f2756l, c0230o, 384, 0, 65530);
                    c0230o = c0230o;
                    c0230o.p(false);
                }
                c0230o.p(z5);
            } else {
                c0230o.V(-333704410);
                e2.b(AbstractC0599v0.K(R.string.main_off, c0230o), null, p020d2.n.v(), 0L, L0.k.f3027l, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o.k(h2.f2777a)).f2756l, c0230o, 196608, 0, 65498);
                c0230o = c0230o;
                c0230o.p(false);
            }
            c0230o.p(true);
        }
        return p084p4.x.f10867a;
    }

    /* JADX WARN: Code duplicated, block: B:254:0x082e  */
    /* JADX WARN: Code duplicated, block: B:255:0x0832  */
    /* JADX WARN: Code duplicated, block: B:260:0x084d  */
    /* JADX WARN: Code duplicated, block: B:263:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:265:0x0954  */
    /* JADX WARN: Code duplicated, block: B:267:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:270:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:275:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:280:0x0a12 A[LOOP:3: B:279:0x0a10->B:280:0x0a12, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:283:0x0a33  */
    /* JADX WARN: Code duplicated, block: B:288:0x0a56  */
    /* JADX WARN: Code duplicated, block: B:316:0x0ac2  */
    /* JADX WARN: Code duplicated, block: B:319:0x0b07  */
    /* JADX WARN: Code duplicated, block: B:321:0x0b17  */
    /* JADX WARN: Code duplicated, block: B:323:0x0b48  */
    /* JADX WARN: Code duplicated, block: B:324:0x0b4c  */
    /* JADX WARN: Code duplicated, block: B:327:0x0b5f  */
    /* JADX WARN: Code duplicated, block: B:329:0x0b6d  */
    /* JADX WARN: Code duplicated, block: B:332:0x0b79  */
    /* JADX WARN: Code duplicated, block: B:334:0x0b7e  */
    /* JADX WARN: Code duplicated, block: B:337:0x0be6  */
    /* JADX WARN: Code duplicated, block: B:341:0x0c28  */
    /* JADX WARN: Code duplicated, block: B:344:0x0c76  */
    /* JADX WARN: Code duplicated, block: B:347:0x0c81  */
    /* JADX WARN: Code duplicated, block: B:350:0x0c8a  */
    /* JADX WARN: Code duplicated, block: B:386:0x0a06 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x0a02 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x09ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x0a46 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x0a31 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x0a6b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x0a54 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        String strK;
        float f6;
        float fN;
        C0230o c0230o;
        InterfaceC0203a0 interfaceC0203a0;
        int i;
        Z.l lVar;
        boolean z5;
        String strK2;
        WeakReference weakReference;
        String strK3;
        K3.a aVar;
        ArrayList arrayList;
        ListIterator listIterator;
        X.y yVar;
        ArrayList arrayList2;
        int size;
        int i3;
        HashSet hashSet;
        ArrayList arrayList3;
        int size2;
        int i6;
        int size3;
        int i7;
        List<D3.j> listN0;
        String str;
        InterfaceC0203a0 interfaceC0203a1;
        Z.l lVar2;
        int i8;
        C1106n c1106n;
        C1100h c1100h;
        String str2;
        String str3;
        D3.j jVar;
        WeakReference weakReference2;
        K3.a aVar2;
        K3.d dVar;
        Object obj4;
        Object next;
        final InterfaceC0203a0 interfaceC0203a2;
        int i9;
        int i10;
        List listA0;
        K3.a aVar3;
        K3.d dVar2;
        String str4;
        String str5;
        String str6;
        N.U u6 = C0222k.f3714a;
        p084p4.x xVar = p084p4.x.f10867a;
        Object obj5 = this.i;
        switch (this.f4202h) {
            case 0:
                C0230o c0230o2 = (C0230o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                E4.k.f("$this$Card", (C1091y) obj);
                if ((iIntValue & 81) == 16 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    Z.l lVar3 = Z.l.f5957a;
                    FillElement fillElement = androidx.compose.foundation.layout.c.f6635b;
                    C1090x c1090xA = AbstractC1088v.a(AbstractC1078k.f13781e, Z.b.f5944t, c0230o2, 54);
                    int i11 = c0230o2.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M = c0230o2.m();
                    Z.o oVarC = Z.a.c(c0230o2, fillElement);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n2 = C1101i.f14038b;
                    c0230o2.Z();
                    if (c0230o2.f3743O) {
                        c0230o2.l(c1106n2);
                    } else {
                        c0230o2.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o2, c1090xA);
                    C0208d.R(C1101i.f14040d, c0230o2, interfaceC0225l0M);
                    C1100h c1100h2 = C1101i.f14042f;
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i11))) {
                        p012c.k.y(i11, c0230o2, i11, c1100h2);
                    }
                    C0208d.R(C1101i.f14039c, c0230o2, oVarC);
                    K3.d dVar3 = ((K3.a) obj5).type;
                    int i12 = dVar3 == null ? -1 : AbstractC0270i0.f4193a[dVar3.ordinal()];
                    if (i12 == 1) {
                        c0230o2.V(225201869);
                        strK = AbstractC0599v0.K(R.string.devices_pairing_nanoleaf_essentials, c0230o2);
                        c0230o2.p(false);
                    } else if (i12 != 2) {
                        c0230o2.V(225207745);
                        strK = AbstractC0599v0.K(R.string.devices_pairing_default, c0230o2);
                        c0230o2.p(false);
                    } else {
                        c0230o2.V(225205218);
                        strK = AbstractC0599v0.K(R.string.devices_pairing_nanoleaf, c0230o2);
                        c0230o2.p(false);
                    }
                    e2.b(strK, androidx.compose.foundation.layout.c.m(lVar3), 0L, 0L, null, 0L, new R0.i(3), 0L, 0, false, 0, 0, null, c0230o2, 48, 0, 130556);
                    AbstractC1070c.b(c0230o2, androidx.compose.foundation.layout.c.c(lVar3, 16));
                    Z.o oVarK = androidx.compose.foundation.layout.c.k(lVar3, 30);
                    N.W0 w6 = L.F.f2265a;
                    AbstractC0178t0.a(oVarK, ((L.D) c0230o2.k(w6)).f2216f, 0.0f, ((L.D) c0230o2.k(w6)).f2227r, 0, c0230o2, 6, 20);
                    c0230o2.p(true);
                }
                return xVar;
            case 1:
                p123x.O o6 = (p123x.O) obj;
                C0230o c0230o3 = (C0230o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                E4.k.f("innerPadding", o6);
                if ((iIntValue2 & 14) == 0) {
                    iIntValue2 |= c0230o3.f(o6) ? 4 : 2;
                }
                if ((iIntValue2 & 91) == 18 && c0230o3.B()) {
                    c0230o3.P();
                } else {
                    final D3.j jVar2 = (D3.j) obj5;
                    D3.h hVar = jVar2.f806h;
                    if (hVar != null) {
                        f6 = 0.0f;
                        fN = p081p0.c.N(hVar.f786a, 0.0f, 255.0f);
                    } else {
                        f6 = 0.0f;
                        fN = 0.0f;
                    }
                    D3.h hVar2 = jVar2.f806h;
                    float fN2 = hVar2 != null ? p081p0.c.N(hVar2.f787b, f6, 255.0f) : 255.0f;
                    J4.a aVar4 = new J4.a(Math.min(fN, fN2), Math.max(fN, fN2));
                    c0230o3.V(-900200005);
                    Object objK = c0230o3.K();
                    N.U u7 = N.U.f3673m;
                    if (objK == u6) {
                        objK = C0208d.K(aVar4, u7);
                        c0230o3.f0(objK);
                    }
                    final InterfaceC0203a0 interfaceC0203a3 = (InterfaceC0203a0) objK;
                    Object objD = AbstractC0013g0.d(-900197698, c0230o3, false);
                    if (objD == u6) {
                        D3.h hVar3 = jVar2.f806h;
                        objD = C0208d.I(hVar3 != null ? hVar3.f791f : 1.0f);
                        c0230o3.f0(objD);
                    }
                    C0209d0 c0209d0 = (C0209d0) objD;
                    Object objD2 = AbstractC0013g0.d(-900194350, c0230o3, false);
                    if (objD2 == u6) {
                        D3.h hVar4 = jVar2.f806h;
                        objD2 = C0208d.K(Boolean.valueOf(hVar4 != null ? hVar4.f788c : false), u7);
                        c0230o3.f0(objD2);
                    }
                    final InterfaceC0203a0 interfaceC0203a4 = (InterfaceC0203a0) objD2;
                    Object objD3 = AbstractC0013g0.d(-900191242, c0230o3, false);
                    if (objD3 == u6) {
                        D3.h hVar5 = jVar2.f806h;
                        objD3 = C0208d.K(Boolean.valueOf(hVar5 != null ? hVar5.f792g : false), u7);
                        c0230o3.f0(objD3);
                    }
                    final InterfaceC0203a0 interfaceC0203a5 = (InterfaceC0203a0) objD3;
                    Object objD4 = AbstractC0013g0.d(-900188174, c0230o3, false);
                    if (objD4 == u6) {
                        D3.h hVar6 = jVar2.f806h;
                        if (hVar6 == null || (str6 = hVar6.f789d) == null) {
                            str6 = "allow";
                        }
                        objD4 = C0208d.K(str6, u7);
                        c0230o3.f0(objD4);
                    }
                    InterfaceC0203a0 interfaceC0203a6 = (InterfaceC0203a0) objD4;
                    Object objD5 = AbstractC0013g0.d(-900183999, c0230o3, false);
                    if (objD5 == u6) {
                        D3.h hVar7 = jVar2.f806h;
                        if (hVar7 == null || (str5 = hVar7.f790e) == null) {
                            str5 = "black";
                        }
                        objD5 = C0208d.K(str5, u7);
                        c0230o3.f0(objD5);
                    }
                    final InterfaceC0203a0 interfaceC0203a7 = (InterfaceC0203a0) objD5;
                    Object objD6 = AbstractC0013g0.d(-900179550, c0230o3, false);
                    if (objD6 == u6) {
                        D3.h hVar8 = jVar2.f806h;
                        if ((hVar8 == null || (str4 = hVar8.f793h) == null) && (str4 = jVar2.f801c) == null) {
                            str4 = "";
                        }
                        objD6 = C0208d.K(str4, u7);
                        c0230o3.f0(objD6);
                    }
                    final InterfaceC0203a0 interfaceC0203a8 = (InterfaceC0203a0) objD6;
                    Object objD7 = AbstractC0013g0.d(-900175919, c0230o3, false);
                    if (objD7 == u6) {
                        ArrayList arrayListC = jVar2.c();
                        ArrayList arrayList4 = new ArrayList();
                        int size4 = arrayListC.size();
                        int i13 = 0;
                        while (i13 < size4) {
                            Object obj6 = arrayListC.get(i13);
                            i13++;
                            ArrayList arrayList5 = arrayListC;
                            String str7 = ((D3.j) obj6).f799a;
                            if (str7 != null) {
                                arrayList4.add(str7);
                            }
                            arrayListC = arrayList5;
                        }
                        objD7 = C0208d.K(p089q4.l.x0(arrayList4), u7);
                        c0230o3.f0(objD7);
                    }
                    InterfaceC0203a0 interfaceC0203a9 = (InterfaceC0203a0) objD7;
                    c0230o3.p(false);
                    WeakReference weakReference3 = jVar2.f805g;
                    boolean z6 = (weakReference3 == null || (aVar3 = (K3.a) weakReference3.get()) == null || (dVar2 = aVar3.type) == null || !dVar2.a()) ? false : true;
                    boolean z7 = ((Boolean) interfaceC0203a4.getValue()).booleanValue() || !jVar2.f802d;
                    boolean z8 = jVar2.f802d && !z7;
                    Z.l lVar4 = Z.l.f5957a;
                    InterfaceC0203a0 interfaceC0203a10 = interfaceC0203a9;
                    boolean z9 = z6;
                    float f7 = 16;
                    Z.o oVarG = androidx.compose.foundation.layout.a.g(com.fasterxml.jackson.databind.deser.std.d0.G().k(androidx.compose.foundation.layout.c.f6635b), f7);
                    FillElement fillElement2 = androidx.compose.foundation.layout.c.f6634a;
                    Z.o oVarA = S1.h0.A(androidx.compose.foundation.layout.a.f(oVarG.k(fillElement2), o6), S1.h0.v(c0230o3));
                    boolean z10 = z7;
                    C1090x c1090xA2 = AbstractC1088v.a(AbstractC1078k.f13779c, Z.b.f5943s, c0230o3, 0);
                    int i14 = c0230o3.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M2 = c0230o3.m();
                    Z.o oVarC2 = Z.a.c(c0230o3, oVarA);
                    InterfaceC1102j.f14043g.getClass();
                    boolean z11 = z8;
                    C1106n c1106n3 = C1101i.f14038b;
                    c0230o3.Z();
                    if (c0230o3.f3743O) {
                        c0230o3.l(c1106n3);
                    } else {
                        c0230o3.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o3, c1090xA2);
                    C0208d.R(C1101i.f14040d, c0230o3, interfaceC0225l0M2);
                    C1100h c1100h3 = C1101i.f14042f;
                    if (c0230o3.f3743O || !E4.k.a(c0230o3.K(), Integer.valueOf(i14))) {
                        p012c.k.y(i14, c0230o3, i14, c1100h3);
                    }
                    C0208d.R(C1101i.f14039c, c0230o3, oVarC2);
                    c0230o3.V(479027286);
                    if (jVar2.f802d || !com.nanjoran.ilightshow.Services.M.f8305O.n()) {
                        c0230o = c0230o3;
                    } else {
                        L.L.b(null, null, null, null, I.f3965b, c0230o3, 196608, 31);
                        c0230o = c0230o3;
                    }
                    c0230o.p(false);
                    float f8 = f7;
                    C0230o c0230o4 = c0230o;
                    e2.b(AbstractC0599v0.K(R.string.light_details_brightness_range, c0230o), androidx.compose.foundation.layout.a.k(lVar4, 0.0f, f8, 0.0f, 0.0f, 13), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o4, 3120, 0, 131060);
                    final int i15 = 0;
                    AbstractC0176s1.a((J4.a) interfaceC0203a3.getValue(), new D4.c() { // from class: N3.v0
                        @Override // D4.c
                        public final Object invoke(Object obj7) {
                            switch (i15) {
                                case 0:
                                    J4.a aVar5 = (J4.a) obj7;
                                    D3.j jVar3 = jVar2;
                                    E4.k.f("$light", jVar3);
                                    InterfaceC0203a0 interfaceC0203a11 = interfaceC0203a3;
                                    E4.k.f("$rangeSliderPosition$delegate", interfaceC0203a11);
                                    E4.k.f("it", aVar5);
                                    float fN3 = p081p0.c.N(aVar5.f1939a, 0.0f, 255.0f);
                                    float fN4 = p081p0.c.N(aVar5.f1940b, 0.0f, 255.0f);
                                    if (fN3 <= fN4) {
                                        interfaceC0203a11.setValue(new J4.a(fN3, fN4));
                                        D3.h hVar9 = jVar3.f806h;
                                        if (hVar9 != null) {
                                            hVar9.f786a = (int) fN3;
                                        }
                                        if (hVar9 != null) {
                                            hVar9.f787b = (int) fN4;
                                        }
                                    }
                                    break;
                                case 1:
                                    String str8 = (String) obj7;
                                    D3.j jVar4 = jVar2;
                                    E4.k.f("$light", jVar4);
                                    InterfaceC0203a0 interfaceC0203a12 = interfaceC0203a3;
                                    E4.k.f("$roomOverride$delegate", interfaceC0203a12);
                                    E4.k.f("it", str8);
                                    interfaceC0203a12.setValue(str8);
                                    D3.h hVar10 = jVar4.f806h;
                                    if (hVar10 != null) {
                                        hVar10.f793h = M4.l.i0(str8) ? null : str8;
                                    }
                                    if (M4.l.i0(str8)) {
                                        str8 = null;
                                    }
                                    jVar4.f801c = str8;
                                    break;
                                case 2:
                                    Boolean bool = (Boolean) obj7;
                                    boolean zBooleanValue = bool.booleanValue();
                                    D3.j jVar5 = jVar2;
                                    E4.k.f("$light", jVar5);
                                    InterfaceC0203a0 interfaceC0203a13 = interfaceC0203a3;
                                    E4.k.f("$alwaysChangeHue$delegate", interfaceC0203a13);
                                    interfaceC0203a13.setValue(bool);
                                    D3.h hVar11 = jVar5.f806h;
                                    if (hVar11 != null) {
                                        hVar11.f792g = zBooleanValue;
                                    }
                                    break;
                                default:
                                    Boolean bool2 = (Boolean) obj7;
                                    boolean zBooleanValue2 = bool2.booleanValue();
                                    D3.j jVar6 = jVar2;
                                    E4.k.f("$light", jVar6);
                                    InterfaceC0203a0 interfaceC0203a14 = interfaceC0203a3;
                                    E4.k.f("$ambientOnly$delegate", interfaceC0203a14);
                                    interfaceC0203a14.setValue(bool2);
                                    D3.h hVar12 = jVar6.f806h;
                                    if (hVar12 != null) {
                                        hVar12.f788c = zBooleanValue2;
                                    }
                                    break;
                            }
                            return p084p4.x.f10867a;
                        }
                    }, null, false, new J4.a(0.0f, 255.0f), 0, null, null, c0230o4, 0, 236);
                    C0230o c0230o5 = c0230o4;
                    c0230o5.V(479068361);
                    if (z9) {
                        e2.b(AbstractC0599v0.K(R.string.light_details_max_effects_size, c0230o5), androidx.compose.foundation.layout.a.k(lVar4, 0.0f, f8, 0.0f, 0.0f, 13), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3120, 0, 131060);
                        AbstractC0176s1.f(c0209d0.h(), new C0263f(jVar2, 2, c0209d0), null, false, new J4.a(0.0f, 1.0f), 0, null, null, null, c0230o5, 0, 492);
                        String str8 = (String) interfaceC0203a8.getValue();
                        Z.o oVarK2 = androidx.compose.foundation.layout.a.k(fillElement2, 0.0f, f8, 0.0f, 0.0f, 13);
                        f8 = f8;
                        final int i16 = 1;
                        W1.a(str8, new D4.c() { // from class: N3.v0
                            @Override // D4.c
                            public final Object invoke(Object obj7) {
                                switch (i16) {
                                    case 0:
                                        J4.a aVar5 = (J4.a) obj7;
                                        D3.j jVar3 = jVar2;
                                        E4.k.f("$light", jVar3);
                                        InterfaceC0203a0 interfaceC0203a11 = interfaceC0203a8;
                                        E4.k.f("$rangeSliderPosition$delegate", interfaceC0203a11);
                                        E4.k.f("it", aVar5);
                                        float fN3 = p081p0.c.N(aVar5.f1939a, 0.0f, 255.0f);
                                        float fN4 = p081p0.c.N(aVar5.f1940b, 0.0f, 255.0f);
                                        if (fN3 <= fN4) {
                                            interfaceC0203a11.setValue(new J4.a(fN3, fN4));
                                            D3.h hVar9 = jVar3.f806h;
                                            if (hVar9 != null) {
                                                hVar9.f786a = (int) fN3;
                                            }
                                            if (hVar9 != null) {
                                                hVar9.f787b = (int) fN4;
                                            }
                                        }
                                        break;
                                    case 1:
                                        String str9 = (String) obj7;
                                        D3.j jVar4 = jVar2;
                                        E4.k.f("$light", jVar4);
                                        InterfaceC0203a0 interfaceC0203a12 = interfaceC0203a8;
                                        E4.k.f("$roomOverride$delegate", interfaceC0203a12);
                                        E4.k.f("it", str9);
                                        interfaceC0203a12.setValue(str9);
                                        D3.h hVar10 = jVar4.f806h;
                                        if (hVar10 != null) {
                                            hVar10.f793h = M4.l.i0(str9) ? null : str9;
                                        }
                                        if (M4.l.i0(str9)) {
                                            str9 = null;
                                        }
                                        jVar4.f801c = str9;
                                        break;
                                    case 2:
                                        Boolean bool = (Boolean) obj7;
                                        boolean zBooleanValue = bool.booleanValue();
                                        D3.j jVar5 = jVar2;
                                        E4.k.f("$light", jVar5);
                                        InterfaceC0203a0 interfaceC0203a13 = interfaceC0203a8;
                                        E4.k.f("$alwaysChangeHue$delegate", interfaceC0203a13);
                                        interfaceC0203a13.setValue(bool);
                                        D3.h hVar11 = jVar5.f806h;
                                        if (hVar11 != null) {
                                            hVar11.f792g = zBooleanValue;
                                        }
                                        break;
                                    default:
                                        Boolean bool2 = (Boolean) obj7;
                                        boolean zBooleanValue2 = bool2.booleanValue();
                                        D3.j jVar6 = jVar2;
                                        E4.k.f("$light", jVar6);
                                        InterfaceC0203a0 interfaceC0203a14 = interfaceC0203a8;
                                        E4.k.f("$ambientOnly$delegate", interfaceC0203a14);
                                        interfaceC0203a14.setValue(bool2);
                                        D3.h hVar12 = jVar6.f806h;
                                        if (hVar12 != null) {
                                            hVar12.f788c = zBooleanValue2;
                                        }
                                        break;
                                }
                                return p084p4.x.f10867a;
                            }
                        }, oVarK2, false, null, I.f3966c, null, null, null, 0, 0, null, null, null, c0230o5, 1573248);
                        c0230o5 = c0230o5;
                    }
                    c0230o5.p(false);
                    M3.f fVar = jVar2 instanceof M3.f ? (M3.f) jVar2 : null;
                    if (fVar == null) {
                        WeakReference weakReference4 = jVar2.f805g;
                        K3.a aVar5 = weakReference4 != null ? (K3.a) weakReference4.get() : null;
                        M3.c cVar = aVar5 instanceof M3.c ? (M3.c) aVar5 : null;
                        fVar = cVar != null ? cVar.f3492b : null;
                    }
                    c0230o5.V(479106308);
                    if (fVar != null && (i9 = fVar.f3508t) > 1) {
                        c0230o5.V(479107934);
                        boolean zD = c0230o5.d(i9);
                        Object objK2 = c0230o5.K();
                        if (zD || objK2 == u6) {
                            int i17 = fVar.f3508t;
                            if (i17 <= 0) {
                                listA0 = com.fasterxml.jackson.databind.deser.std.d0.v(1);
                            } else {
                                ArrayList arrayList6 = new ArrayList();
                                int iSqrt = (int) Math.sqrt(i17);
                                if (1 <= iSqrt) {
                                    int i18 = 1;
                                    while (true) {
                                        if (i17 % i18 == 0) {
                                            arrayList6.add(Integer.valueOf(i18));
                                            int i19 = i17 / i18;
                                            if (i18 != i19) {
                                                arrayList6.add(Integer.valueOf(i19));
                                            }
                                        }
                                        i10 = 1;
                                        if (i18 != iSqrt) {
                                            i18++;
                                        }
                                    }
                                } else {
                                    i10 = 1;
                                }
                                if (arrayList6.size() <= i10) {
                                    listA0 = p089q4.l.s0(arrayList6);
                                } else {
                                    Object[] array = arrayList6.toArray(new Comparable[0]);
                                    Comparable[] comparableArr = (Comparable[]) array;
                                    E4.k.f("<this>", comparableArr);
                                    if (comparableArr.length > i10) {
                                        Arrays.sort(comparableArr);
                                    }
                                    listA0 = p089q4.k.a0(array);
                                }
                            }
                            objK2 = listA0;
                            c0230o5.f0(objK2);
                        }
                        List list = (List) objK2;
                        c0230o5.p(false);
                        D3.h hVar9 = jVar2.f806h;
                        int iIndexOf = list.indexOf(Integer.valueOf(hVar9 != null ? hVar9.f794j : 0));
                        if (iIndexOf < 0) {
                            iIndexOf = list.size() - 1;
                        }
                        c0230o5.V(479118505);
                        Object objK3 = c0230o5.K();
                        if (objK3 == u6) {
                            objK3 = C0208d.I(iIndexOf);
                            c0230o5.f0(objK3);
                        }
                        C0209d0 c0209d1 = (C0209d0) objK3;
                        c0230o5.p(false);
                        C0230o c0230o6 = c0230o5;
                        e2.b(AbstractC0599v0.L(R.string.light_details_segments, new Object[]{list.get(p081p0.c.O(G4.a.D(c0209d1.h()), 0, list.size() - 1))}, c0230o5), androidx.compose.foundation.layout.a.k(lVar4, 0.0f, f8, 0.0f, 0.0f, 13), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o6, 3120, 0, 131060);
                        AbstractC0176s1.f(c0209d1.h(), new C0271j(2, c0209d1, list, jVar2), null, false, new J4.a(0.0f, list.size() - 1), list.size() > 2 ? list.size() - 2 : 0, null, null, null, c0230o6, 0, 460);
                        c0230o5 = c0230o6;
                        String strL = AbstractC0599v0.L(R.string.light_details_leds, new Object[]{Integer.valueOf(fVar.f3508t)}, c0230o5);
                        long jQ = com.fasterxml.jackson.databind.deser.std.d0.q(12);
                        int i20 = p035g0.r.f9086m;
                        e2.b(strL, null, p035g0.r.f9078d, jQ, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3456, 0, 131058);
                    }
                    c0230o5.p(false);
                    Z.o oVarK3 = androidx.compose.foundation.layout.a.k(lVar4, 0.0f, f8, 0.0f, 0.0f, 13);
                    float f9 = f8;
                    Z.f fVar2 = Z.b.f5942r;
                    C1069b c1069b = AbstractC1078k.f13777a;
                    p123x.U uA = p123x.T.a(c1069b, fVar2, c0230o5, 48);
                    int i21 = c0230o5.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M3 = c0230o5.m();
                    Z.o oVarC3 = Z.a.c(c0230o5, oVarK3);
                    C1106n c1106n4 = C1101i.f14038b;
                    c0230o5.Z();
                    if (c0230o5.f3743O) {
                        c0230o5.l(c1106n4);
                    } else {
                        c0230o5.i0();
                    }
                    C1100h c1100h4 = C1101i.f14041e;
                    C0208d.R(c1100h4, c0230o5, uA);
                    C1100h c1100h5 = C1101i.f14040d;
                    C0208d.R(c1100h5, c0230o5, interfaceC0225l0M3);
                    C1100h c1100h6 = C1101i.f14042f;
                    if (c0230o5.f3743O) {
                        interfaceC0203a0 = interfaceC0203a6;
                    } else {
                        interfaceC0203a0 = interfaceC0203a6;
                        if (!E4.k.a(c0230o5.K(), Integer.valueOf(i21))) {
                        }
                        C1100h c1100h7 = C1101i.f14039c;
                        C0208d.R(c1100h7, c0230o5, oVarC3);
                        e2.b(AbstractC0599v0.K(R.string.light_details_increase_color_change, c0230o5), null, 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3072, 0, 131062);
                        AbstractC1070c.b(c0230o5, p123x.V.a(lVar4, 1.0f));
                        final int i22 = 2;
                        J1.a(((Boolean) interfaceC0203a5.getValue()).booleanValue(), new D4.c() { // from class: N3.v0
                            @Override // D4.c
                            public final Object invoke(Object obj7) {
                                switch (i22) {
                                    case 0:
                                        J4.a aVar6 = (J4.a) obj7;
                                        D3.j jVar3 = jVar2;
                                        E4.k.f("$light", jVar3);
                                        InterfaceC0203a0 interfaceC0203a11 = interfaceC0203a5;
                                        E4.k.f("$rangeSliderPosition$delegate", interfaceC0203a11);
                                        E4.k.f("it", aVar6);
                                        float fN3 = p081p0.c.N(aVar6.f1939a, 0.0f, 255.0f);
                                        float fN4 = p081p0.c.N(aVar6.f1940b, 0.0f, 255.0f);
                                        if (fN3 <= fN4) {
                                            interfaceC0203a11.setValue(new J4.a(fN3, fN4));
                                            D3.h hVar10 = jVar3.f806h;
                                            if (hVar10 != null) {
                                                hVar10.f786a = (int) fN3;
                                            }
                                            if (hVar10 != null) {
                                                hVar10.f787b = (int) fN4;
                                            }
                                        }
                                        break;
                                    case 1:
                                        String str9 = (String) obj7;
                                        D3.j jVar4 = jVar2;
                                        E4.k.f("$light", jVar4);
                                        InterfaceC0203a0 interfaceC0203a12 = interfaceC0203a5;
                                        E4.k.f("$roomOverride$delegate", interfaceC0203a12);
                                        E4.k.f("it", str9);
                                        interfaceC0203a12.setValue(str9);
                                        D3.h hVar11 = jVar4.f806h;
                                        if (hVar11 != null) {
                                            hVar11.f793h = M4.l.i0(str9) ? null : str9;
                                        }
                                        if (M4.l.i0(str9)) {
                                            str9 = null;
                                        }
                                        jVar4.f801c = str9;
                                        break;
                                    case 2:
                                        Boolean bool = (Boolean) obj7;
                                        boolean zBooleanValue = bool.booleanValue();
                                        D3.j jVar5 = jVar2;
                                        E4.k.f("$light", jVar5);
                                        InterfaceC0203a0 interfaceC0203a13 = interfaceC0203a5;
                                        E4.k.f("$alwaysChangeHue$delegate", interfaceC0203a13);
                                        interfaceC0203a13.setValue(bool);
                                        D3.h hVar12 = jVar5.f806h;
                                        if (hVar12 != null) {
                                            hVar12.f792g = zBooleanValue;
                                        }
                                        break;
                                    default:
                                        Boolean bool2 = (Boolean) obj7;
                                        boolean zBooleanValue2 = bool2.booleanValue();
                                        D3.j jVar6 = jVar2;
                                        E4.k.f("$light", jVar6);
                                        InterfaceC0203a0 interfaceC0203a14 = interfaceC0203a5;
                                        E4.k.f("$ambientOnly$delegate", interfaceC0203a14);
                                        interfaceC0203a14.setValue(bool2);
                                        D3.h hVar13 = jVar6.f806h;
                                        if (hVar13 != null) {
                                            hVar13.f788c = zBooleanValue2;
                                        }
                                        break;
                                }
                                return p084p4.x.f10867a;
                            }
                        }, null, false, null, null, c0230o5, 0, RecurringDays.RECURRING_WEEKDAYS);
                        c0230o5.p(true);
                        Z.o oVarK4 = androidx.compose.foundation.layout.a.k(lVar4, 0.0f, f9, 0.0f, 0.0f, 13);
                        p123x.U uA2 = p123x.T.a(c1069b, fVar2, c0230o5, 48);
                        i = c0230o5.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M4 = c0230o5.m();
                        Z.o oVarC4 = Z.a.c(c0230o5, oVarK4);
                        c0230o5.Z();
                        if (c0230o5.f3743O) {
                            c0230o5.l(c1106n4);
                        } else {
                            c0230o5.i0();
                        }
                        C0208d.R(c1100h4, c0230o5, uA2);
                        C0208d.R(c1100h5, c0230o5, interfaceC0225l0M4);
                        if (c0230o5.f3743O || !E4.k.a(c0230o5.K(), Integer.valueOf(i))) {
                            p012c.k.y(i, c0230o5, i, c1100h6);
                        }
                        C0208d.R(c1100h7, c0230o5, oVarC4);
                        e2.b(AbstractC0599v0.K(R.string.light_details_ambient_only, c0230o5), null, 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3072, 0, 131062);
                        AbstractC1070c.b(c0230o5, p123x.V.a(lVar4, 1.0f));
                        final int i23 = 3;
                        J1.a(z10, new D4.c() { // from class: N3.v0
                            @Override // D4.c
                            public final Object invoke(Object obj7) {
                                switch (i23) {
                                    case 0:
                                        J4.a aVar6 = (J4.a) obj7;
                                        D3.j jVar3 = jVar2;
                                        E4.k.f("$light", jVar3);
                                        InterfaceC0203a0 interfaceC0203a11 = interfaceC0203a4;
                                        E4.k.f("$rangeSliderPosition$delegate", interfaceC0203a11);
                                        E4.k.f("it", aVar6);
                                        float fN3 = p081p0.c.N(aVar6.f1939a, 0.0f, 255.0f);
                                        float fN4 = p081p0.c.N(aVar6.f1940b, 0.0f, 255.0f);
                                        if (fN3 <= fN4) {
                                            interfaceC0203a11.setValue(new J4.a(fN3, fN4));
                                            D3.h hVar10 = jVar3.f806h;
                                            if (hVar10 != null) {
                                                hVar10.f786a = (int) fN3;
                                            }
                                            if (hVar10 != null) {
                                                hVar10.f787b = (int) fN4;
                                            }
                                        }
                                        break;
                                    case 1:
                                        String str9 = (String) obj7;
                                        D3.j jVar4 = jVar2;
                                        E4.k.f("$light", jVar4);
                                        InterfaceC0203a0 interfaceC0203a12 = interfaceC0203a4;
                                        E4.k.f("$roomOverride$delegate", interfaceC0203a12);
                                        E4.k.f("it", str9);
                                        interfaceC0203a12.setValue(str9);
                                        D3.h hVar11 = jVar4.f806h;
                                        if (hVar11 != null) {
                                            hVar11.f793h = M4.l.i0(str9) ? null : str9;
                                        }
                                        if (M4.l.i0(str9)) {
                                            str9 = null;
                                        }
                                        jVar4.f801c = str9;
                                        break;
                                    case 2:
                                        Boolean bool = (Boolean) obj7;
                                        boolean zBooleanValue = bool.booleanValue();
                                        D3.j jVar5 = jVar2;
                                        E4.k.f("$light", jVar5);
                                        InterfaceC0203a0 interfaceC0203a13 = interfaceC0203a4;
                                        E4.k.f("$alwaysChangeHue$delegate", interfaceC0203a13);
                                        interfaceC0203a13.setValue(bool);
                                        D3.h hVar12 = jVar5.f806h;
                                        if (hVar12 != null) {
                                            hVar12.f792g = zBooleanValue;
                                        }
                                        break;
                                    default:
                                        Boolean bool2 = (Boolean) obj7;
                                        boolean zBooleanValue2 = bool2.booleanValue();
                                        D3.j jVar6 = jVar2;
                                        E4.k.f("$light", jVar6);
                                        InterfaceC0203a0 interfaceC0203a14 = interfaceC0203a4;
                                        E4.k.f("$ambientOnly$delegate", interfaceC0203a14);
                                        interfaceC0203a14.setValue(bool2);
                                        D3.h hVar13 = jVar6.f806h;
                                        if (hVar13 != null) {
                                            hVar13.f788c = zBooleanValue2;
                                        }
                                        break;
                                }
                                return p084p4.x.f10867a;
                            }
                        }, null, jVar2.f802d, null, null, c0230o5, 0, 108);
                        c0230o5.p(true);
                        c0230o5.V(479191507);
                        if (z11) {
                            lVar = lVar4;
                            e2.b(AbstractC0599v0.K(R.string.light_details_strobe_mode, c0230o5), androidx.compose.foundation.layout.a.k(lVar, 0.0f, f9, 0.0f, 0.0f, 13), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3120, 0, 131060);
                            interfaceC0203a2 = interfaceC0203a0;
                            final int i24 = 3;
                            p020d2.n.f(AbstractC0599v0.K(R.string.light_details_allow_strobes, c0230o5), E4.k.a((String) interfaceC0203a0.getValue(), "allow"), new D4.a() { // from class: N3.w0
                                @Override // D4.a
                                public final Object invoke() {
                                    switch (i24) {
                                        case 0:
                                            D3.j jVar3 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a11 = interfaceC0203a2;
                                            interfaceC0203a11.setValue("never");
                                            D3.h hVar10 = jVar3.f806h;
                                            if (hVar10 != null) {
                                                String str9 = (String) interfaceC0203a11.getValue();
                                                E4.k.f("<set-?>", str9);
                                                hVar10.f789d = str9;
                                            }
                                            break;
                                        case 1:
                                            D3.j jVar4 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a12 = interfaceC0203a2;
                                            interfaceC0203a12.setValue("black");
                                            D3.h hVar11 = jVar4.f806h;
                                            if (hVar11 != null) {
                                                String str10 = (String) interfaceC0203a12.getValue();
                                                E4.k.f("<set-?>", str10);
                                                hVar11.f790e = str10;
                                            }
                                            break;
                                        case 2:
                                            D3.j jVar5 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a13 = interfaceC0203a2;
                                            interfaceC0203a13.setValue("ambient");
                                            D3.h hVar12 = jVar5.f806h;
                                            if (hVar12 != null) {
                                                String str11 = (String) interfaceC0203a13.getValue();
                                                E4.k.f("<set-?>", str11);
                                                hVar12.f790e = str11;
                                            }
                                            break;
                                        case 3:
                                            D3.j jVar6 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a14 = interfaceC0203a2;
                                            interfaceC0203a14.setValue("allow");
                                            D3.h hVar13 = jVar6.f806h;
                                            if (hVar13 != null) {
                                                String str12 = (String) interfaceC0203a14.getValue();
                                                E4.k.f("<set-?>", str12);
                                                hVar13.f789d = str12;
                                            }
                                            break;
                                        default:
                                            D3.j jVar7 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a15 = interfaceC0203a2;
                                            interfaceC0203a15.setValue("only");
                                            D3.h hVar14 = jVar7.f806h;
                                            if (hVar14 != null) {
                                                String str13 = (String) interfaceC0203a15.getValue();
                                                E4.k.f("<set-?>", str13);
                                                hVar14.f789d = str13;
                                            }
                                            break;
                                    }
                                    return p084p4.x.f10867a;
                                }
                            }, c0230o5, 0);
                            final int i25 = 4;
                            final int i26 = 0;
                            p020d2.n.f(AbstractC0599v0.K(R.string.light_details_only_strobes, c0230o5), E4.k.a((String) interfaceC0203a2.getValue(), "only"), new D4.a() { // from class: N3.w0
                                @Override // D4.a
                                public final Object invoke() {
                                    switch (i25) {
                                        case 0:
                                            D3.j jVar3 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a11 = interfaceC0203a2;
                                            interfaceC0203a11.setValue("never");
                                            D3.h hVar10 = jVar3.f806h;
                                            if (hVar10 != null) {
                                                String str9 = (String) interfaceC0203a11.getValue();
                                                E4.k.f("<set-?>", str9);
                                                hVar10.f789d = str9;
                                            }
                                            break;
                                        case 1:
                                            D3.j jVar4 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a12 = interfaceC0203a2;
                                            interfaceC0203a12.setValue("black");
                                            D3.h hVar11 = jVar4.f806h;
                                            if (hVar11 != null) {
                                                String str10 = (String) interfaceC0203a12.getValue();
                                                E4.k.f("<set-?>", str10);
                                                hVar11.f790e = str10;
                                            }
                                            break;
                                        case 2:
                                            D3.j jVar5 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a13 = interfaceC0203a2;
                                            interfaceC0203a13.setValue("ambient");
                                            D3.h hVar12 = jVar5.f806h;
                                            if (hVar12 != null) {
                                                String str11 = (String) interfaceC0203a13.getValue();
                                                E4.k.f("<set-?>", str11);
                                                hVar12.f790e = str11;
                                            }
                                            break;
                                        case 3:
                                            D3.j jVar6 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a14 = interfaceC0203a2;
                                            interfaceC0203a14.setValue("allow");
                                            D3.h hVar13 = jVar6.f806h;
                                            if (hVar13 != null) {
                                                String str12 = (String) interfaceC0203a14.getValue();
                                                E4.k.f("<set-?>", str12);
                                                hVar13.f789d = str12;
                                            }
                                            break;
                                        default:
                                            D3.j jVar7 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a15 = interfaceC0203a2;
                                            interfaceC0203a15.setValue("only");
                                            D3.h hVar14 = jVar7.f806h;
                                            if (hVar14 != null) {
                                                String str13 = (String) interfaceC0203a15.getValue();
                                                E4.k.f("<set-?>", str13);
                                                hVar14.f789d = str13;
                                            }
                                            break;
                                    }
                                    return p084p4.x.f10867a;
                                }
                            }, c0230o5, 0);
                            p020d2.n.f(AbstractC0599v0.K(R.string.light_details_never_strobe, c0230o5), E4.k.a((String) interfaceC0203a2.getValue(), "never"), new D4.a() { // from class: N3.w0
                                @Override // D4.a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            D3.j jVar3 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a11 = interfaceC0203a2;
                                            interfaceC0203a11.setValue("never");
                                            D3.h hVar10 = jVar3.f806h;
                                            if (hVar10 != null) {
                                                String str9 = (String) interfaceC0203a11.getValue();
                                                E4.k.f("<set-?>", str9);
                                                hVar10.f789d = str9;
                                            }
                                            break;
                                        case 1:
                                            D3.j jVar4 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a12 = interfaceC0203a2;
                                            interfaceC0203a12.setValue("black");
                                            D3.h hVar11 = jVar4.f806h;
                                            if (hVar11 != null) {
                                                String str10 = (String) interfaceC0203a12.getValue();
                                                E4.k.f("<set-?>", str10);
                                                hVar11.f790e = str10;
                                            }
                                            break;
                                        case 2:
                                            D3.j jVar5 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a13 = interfaceC0203a2;
                                            interfaceC0203a13.setValue("ambient");
                                            D3.h hVar12 = jVar5.f806h;
                                            if (hVar12 != null) {
                                                String str11 = (String) interfaceC0203a13.getValue();
                                                E4.k.f("<set-?>", str11);
                                                hVar12.f790e = str11;
                                            }
                                            break;
                                        case 3:
                                            D3.j jVar6 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a14 = interfaceC0203a2;
                                            interfaceC0203a14.setValue("allow");
                                            D3.h hVar13 = jVar6.f806h;
                                            if (hVar13 != null) {
                                                String str12 = (String) interfaceC0203a14.getValue();
                                                E4.k.f("<set-?>", str12);
                                                hVar13.f789d = str12;
                                            }
                                            break;
                                        default:
                                            D3.j jVar7 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a15 = interfaceC0203a2;
                                            interfaceC0203a15.setValue("only");
                                            D3.h hVar14 = jVar7.f806h;
                                            if (hVar14 != null) {
                                                String str13 = (String) interfaceC0203a15.getValue();
                                                E4.k.f("<set-?>", str13);
                                                hVar14.f789d = str13;
                                            }
                                            break;
                                    }
                                    return p084p4.x.f10867a;
                                }
                            }, c0230o5, 0);
                            if (E4.k.a((String) interfaceC0203a2.getValue(), "only")) {
                                e2.b(AbstractC0599v0.K(R.string.light_details_after_strobes, c0230o5), androidx.compose.foundation.layout.a.k(lVar, 0.0f, 8, 0.0f, 0.0f, 13), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3120, 0, 131060);
                                final int i27 = 1;
                                p020d2.n.f(AbstractC0599v0.K(R.string.light_details_stay_black, c0230o5), E4.k.a((String) interfaceC0203a7.getValue(), "black"), new D4.a() { // from class: N3.w0
                                    @Override // D4.a
                                    public final Object invoke() {
                                        switch (i27) {
                                            case 0:
                                                D3.j jVar3 = jVar2;
                                                InterfaceC0203a0 interfaceC0203a11 = interfaceC0203a7;
                                                interfaceC0203a11.setValue("never");
                                                D3.h hVar10 = jVar3.f806h;
                                                if (hVar10 != null) {
                                                    String str9 = (String) interfaceC0203a11.getValue();
                                                    E4.k.f("<set-?>", str9);
                                                    hVar10.f789d = str9;
                                                }
                                                break;
                                            case 1:
                                                D3.j jVar4 = jVar2;
                                                InterfaceC0203a0 interfaceC0203a12 = interfaceC0203a7;
                                                interfaceC0203a12.setValue("black");
                                                D3.h hVar11 = jVar4.f806h;
                                                if (hVar11 != null) {
                                                    String str10 = (String) interfaceC0203a12.getValue();
                                                    E4.k.f("<set-?>", str10);
                                                    hVar11.f790e = str10;
                                                }
                                                break;
                                            case 2:
                                                D3.j jVar5 = jVar2;
                                                InterfaceC0203a0 interfaceC0203a13 = interfaceC0203a7;
                                                interfaceC0203a13.setValue("ambient");
                                                D3.h hVar12 = jVar5.f806h;
                                                if (hVar12 != null) {
                                                    String str11 = (String) interfaceC0203a13.getValue();
                                                    E4.k.f("<set-?>", str11);
                                                    hVar12.f790e = str11;
                                                }
                                                break;
                                            case 3:
                                                D3.j jVar6 = jVar2;
                                                InterfaceC0203a0 interfaceC0203a14 = interfaceC0203a7;
                                                interfaceC0203a14.setValue("allow");
                                                D3.h hVar13 = jVar6.f806h;
                                                if (hVar13 != null) {
                                                    String str12 = (String) interfaceC0203a14.getValue();
                                                    E4.k.f("<set-?>", str12);
                                                    hVar13.f789d = str12;
                                                }
                                                break;
                                            default:
                                                D3.j jVar7 = jVar2;
                                                InterfaceC0203a0 interfaceC0203a15 = interfaceC0203a7;
                                                interfaceC0203a15.setValue("only");
                                                D3.h hVar14 = jVar7.f806h;
                                                if (hVar14 != null) {
                                                    String str13 = (String) interfaceC0203a15.getValue();
                                                    E4.k.f("<set-?>", str13);
                                                    hVar14.f789d = str13;
                                                }
                                                break;
                                        }
                                        return p084p4.x.f10867a;
                                    }
                                }, c0230o5, 0);
                                final int i28 = 2;
                                z5 = false;
                                p020d2.n.f(AbstractC0599v0.K(R.string.light_details_ambient_color, c0230o5), E4.k.a((String) interfaceC0203a7.getValue(), "ambient"), new D4.a() { // from class: N3.w0
                                    @Override // D4.a
                                    public final Object invoke() {
                                        switch (i28) {
                                            case 0:
                                                D3.j jVar3 = jVar2;
                                                InterfaceC0203a0 interfaceC0203a11 = interfaceC0203a7;
                                                interfaceC0203a11.setValue("never");
                                                D3.h hVar10 = jVar3.f806h;
                                                if (hVar10 != null) {
                                                    String str9 = (String) interfaceC0203a11.getValue();
                                                    E4.k.f("<set-?>", str9);
                                                    hVar10.f789d = str9;
                                                }
                                                break;
                                            case 1:
                                                D3.j jVar4 = jVar2;
                                                InterfaceC0203a0 interfaceC0203a12 = interfaceC0203a7;
                                                interfaceC0203a12.setValue("black");
                                                D3.h hVar11 = jVar4.f806h;
                                                if (hVar11 != null) {
                                                    String str10 = (String) interfaceC0203a12.getValue();
                                                    E4.k.f("<set-?>", str10);
                                                    hVar11.f790e = str10;
                                                }
                                                break;
                                            case 2:
                                                D3.j jVar5 = jVar2;
                                                InterfaceC0203a0 interfaceC0203a13 = interfaceC0203a7;
                                                interfaceC0203a13.setValue("ambient");
                                                D3.h hVar12 = jVar5.f806h;
                                                if (hVar12 != null) {
                                                    String str11 = (String) interfaceC0203a13.getValue();
                                                    E4.k.f("<set-?>", str11);
                                                    hVar12.f790e = str11;
                                                }
                                                break;
                                            case 3:
                                                D3.j jVar6 = jVar2;
                                                InterfaceC0203a0 interfaceC0203a14 = interfaceC0203a7;
                                                interfaceC0203a14.setValue("allow");
                                                D3.h hVar13 = jVar6.f806h;
                                                if (hVar13 != null) {
                                                    String str12 = (String) interfaceC0203a14.getValue();
                                                    E4.k.f("<set-?>", str12);
                                                    hVar13.f789d = str12;
                                                }
                                                break;
                                            default:
                                                D3.j jVar7 = jVar2;
                                                InterfaceC0203a0 interfaceC0203a15 = interfaceC0203a7;
                                                interfaceC0203a15.setValue("only");
                                                D3.h hVar14 = jVar7.f806h;
                                                if (hVar14 != null) {
                                                    String str13 = (String) interfaceC0203a15.getValue();
                                                    E4.k.f("<set-?>", str13);
                                                    hVar14.f789d = str13;
                                                }
                                                break;
                                        }
                                        return p084p4.x.f10867a;
                                    }
                                }, c0230o5, 0);
                            }
                            c0230o5.p(z5);
                            c0230o5.V(479276821);
                            if (!z9 && jVar2.f802d) {
                                X.s sVar = com.nanjoran.ilightshow.Services.M.f8305O.f8335v;
                                arrayList = new ArrayList();
                                listIterator = sVar.listIterator();
                                while (true) {
                                    yVar = (X.y) listIterator;
                                    if (yVar.hasNext()) {
                                        next = yVar.next();
                                        if (!((D3.l) next).f813d) {
                                            arrayList.add(next);
                                        }
                                    } else {
                                        arrayList2 = new ArrayList();
                                        size = arrayList.size();
                                        i3 = 0;
                                        while (i3 < size) {
                                            Object obj7 = arrayList.get(i3);
                                            i3++;
                                            p089q4.r.R(arrayList2, ((D3.l) obj7).f814e);
                                        }
                                        hashSet = new HashSet();
                                        arrayList3 = new ArrayList();
                                        size2 = arrayList2.size();
                                        i6 = 0;
                                        while (i6 < size2) {
                                            obj4 = arrayList2.get(i6);
                                            i6++;
                                            if (hashSet.add(((D3.j) obj4).f799a)) {
                                                arrayList3.add(obj4);
                                            }
                                        }
                                        ArrayList arrayList7 = new ArrayList();
                                        size3 = arrayList3.size();
                                        i7 = 0;
                                        while (i7 < size3) {
                                            Object obj8 = arrayList3.get(i7);
                                            i7++;
                                            jVar = (D3.j) obj8;
                                            if (E4.k.a(jVar.f799a, jVar2.f799a) && jVar.f802d && ((weakReference2 = jVar.f805g) == null || (aVar2 = (K3.a) weakReference2.get()) == null || (dVar = aVar2.type) == null || !dVar.a())) {
                                                D3.h hVar10 = jVar.f806h;
                                                if ((hVar10 != null ? hVar10.i : null) != null) {
                                                    if (E4.k.a(hVar10 != null ? hVar10.i : null, jVar2.f799a)) {
                                                    }
                                                }
                                                if (jVar.c().isEmpty()) {
                                                    arrayList7.add(obj8);
                                                }
                                            }
                                        }
                                        listN0 = p089q4.l.n0(arrayList7, new C0303z0(new C0301y0(), 0));
                                        if (!listN0.isEmpty()) {
                                            e2.b(AbstractC0599v0.K(R.string.light_details_slave_lights, c0230o5), androidx.compose.foundation.layout.a.k(lVar, 0.0f, f9, 0.0f, 0.0f, 13), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3120, 0, 131060);
                                            for (D3.j jVar3 : listN0) {
                                                str = jVar3.f799a;
                                                c0230o5.V(479311983);
                                                if (str != null) {
                                                    Z.o oVarK5 = androidx.compose.foundation.layout.a.k(lVar, 0.0f, 8, 0.0f, 0.0f, 13);
                                                    lVar2 = lVar;
                                                    p123x.U uA3 = p123x.T.a(AbstractC1078k.f13777a, fVar2, c0230o5, 48);
                                                    i8 = c0230o5.f3744P;
                                                    InterfaceC0225l0 interfaceC0225l0M5 = c0230o5.m();
                                                    Z.o oVarC5 = Z.a.c(c0230o5, oVarK5);
                                                    InterfaceC1102j.f14043g.getClass();
                                                    c1106n = C1101i.f14038b;
                                                    c0230o5.Z();
                                                    if (c0230o5.f3743O) {
                                                        c0230o5.l(c1106n);
                                                    } else {
                                                        c0230o5.i0();
                                                    }
                                                    C0208d.R(C1101i.f14041e, c0230o5, uA3);
                                                    C0208d.R(C1101i.f14040d, c0230o5, interfaceC0225l0M5);
                                                    c1100h = C1101i.f14042f;
                                                    if (c0230o5.f3743O || !E4.k.a(c0230o5.K(), Integer.valueOf(i8))) {
                                                        p012c.k.y(i8, c0230o5, i8, c1100h);
                                                    }
                                                    C0208d.R(C1101i.f14039c, c0230o5, oVarC5);
                                                    str2 = jVar3.f800b;
                                                    if (str2 == null) {
                                                        str3 = str;
                                                    } else {
                                                        str3 = str2;
                                                    }
                                                    e2.b(str3, null, 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3072, 0, 131062);
                                                    AbstractC1070c.b(c0230o5, p123x.V.a(lVar2, 1.0f));
                                                    boolean zContains = ((Set) interfaceC0203a10.getValue()).contains(str);
                                                    InterfaceC0203a0 interfaceC0203a11 = interfaceC0203a10;
                                                    C0299x0 c0299x0 = new C0299x0(str, jVar2, jVar3, interfaceC0203a11, 0);
                                                    interfaceC0203a1 = interfaceC0203a11;
                                                    J1.a(zContains, c0299x0, null, false, null, null, c0230o5, 0, RecurringDays.RECURRING_WEEKDAYS);
                                                    c0230o5.p(true);
                                                } else {
                                                    interfaceC0203a1 = interfaceC0203a10;
                                                    lVar2 = lVar;
                                                }
                                                c0230o5.p(false);
                                                interfaceC0203a10 = interfaceC0203a1;
                                                lVar = lVar2;
                                            }
                                        }
                                    }
                                }
                            }
                            Z.l lVar5 = lVar;
                            c0230o5.p(false);
                            L.L.c(androidx.compose.foundation.layout.a.k(lVar5, 0.0f, f9, 0.0f, 0.0f, 13), 0.0f, 0L, c0230o5, 6, 6);
                            strK2 = jVar2.f799a;
                            c0230o5.V(479357835);
                            if (strK2 == null) {
                                strK2 = AbstractC0599v0.K(R.string.light_details_unknown, c0230o5);
                            }
                            c0230o5.p(false);
                            String strL2 = AbstractC0599v0.L(R.string.light_details_light_id, new Object[]{strK2}, c0230o5);
                            long jQ2 = com.fasterxml.jackson.databind.deser.std.d0.q(12);
                            int i29 = p035g0.r.f9086m;
                            long j4 = p035g0.r.f9078d;
                            e2.b(strL2, androidx.compose.foundation.layout.a.k(lVar5, 0.0f, 12, 0.0f, 0.0f, 13), j4, jQ2, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3504, 0, 131056);
                            weakReference = jVar2.f805g;
                            if (weakReference != null || (aVar = (K3.a) weakReference.get()) == null) {
                                strK3 = null;
                            } else {
                                strK3 = aVar.id;
                            }
                            c0230o5.V(479364474);
                            if (strK3 == null) {
                                strK3 = AbstractC0599v0.K(R.string.light_details_unknown, c0230o5);
                            }
                            c0230o5.p(false);
                            e2.b(AbstractC0599v0.L(R.string.light_details_device_id, new Object[]{strK3}, c0230o5), androidx.compose.foundation.layout.a.k(lVar5, 0.0f, 4, 0.0f, 0.0f, 13), j4, com.fasterxml.jackson.databind.deser.std.d0.q(12), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3504, 0, 131056);
                            c0230o5.p(true);
                        } else {
                            lVar = lVar4;
                        }
                        z5 = false;
                        c0230o5.p(z5);
                        c0230o5.V(479276821);
                        if (!z9) {
                            X.s sVar2 = com.nanjoran.ilightshow.Services.M.f8305O.f8335v;
                            arrayList = new ArrayList();
                            listIterator = sVar2.listIterator();
                            while (true) {
                                yVar = (X.y) listIterator;
                                if (yVar.hasNext()) {
                                    next = yVar.next();
                                    if (!((D3.l) next).f813d) {
                                        arrayList.add(next);
                                    }
                                } else {
                                    arrayList2 = new ArrayList();
                                    size = arrayList.size();
                                    i3 = 0;
                                    while (i3 < size) {
                                        Object obj9 = arrayList.get(i3);
                                        i3++;
                                        p089q4.r.R(arrayList2, ((D3.l) obj9).f814e);
                                    }
                                    hashSet = new HashSet();
                                    arrayList3 = new ArrayList();
                                    size2 = arrayList2.size();
                                    i6 = 0;
                                    while (i6 < size2) {
                                        obj4 = arrayList2.get(i6);
                                        i6++;
                                        if (hashSet.add(((D3.j) obj4).f799a)) {
                                            arrayList3.add(obj4);
                                        }
                                    }
                                    ArrayList arrayList8 = new ArrayList();
                                    size3 = arrayList3.size();
                                    i7 = 0;
                                    while (i7 < size3) {
                                        Object obj10 = arrayList3.get(i7);
                                        i7++;
                                        jVar = (D3.j) obj10;
                                        if (E4.k.a(jVar.f799a, jVar2.f799a)) {
                                        }
                                    }
                                    listN0 = p089q4.l.n0(arrayList8, new C0303z0(new C0301y0(), 0));
                                    if (!listN0.isEmpty()) {
                                        e2.b(AbstractC0599v0.K(R.string.light_details_slave_lights, c0230o5), androidx.compose.foundation.layout.a.k(lVar, 0.0f, f9, 0.0f, 0.0f, 13), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3120, 0, 131060);
                                        while (r2.hasNext()) {
                                            str = jVar3.f799a;
                                            c0230o5.V(479311983);
                                            if (str != null) {
                                                Z.o oVarK6 = androidx.compose.foundation.layout.a.k(lVar, 0.0f, 8, 0.0f, 0.0f, 13);
                                                lVar2 = lVar;
                                                p123x.U uA4 = p123x.T.a(AbstractC1078k.f13777a, fVar2, c0230o5, 48);
                                                i8 = c0230o5.f3744P;
                                                InterfaceC0225l0 interfaceC0225l0M6 = c0230o5.m();
                                                Z.o oVarC6 = Z.a.c(c0230o5, oVarK6);
                                                InterfaceC1102j.f14043g.getClass();
                                                c1106n = C1101i.f14038b;
                                                c0230o5.Z();
                                                if (c0230o5.f3743O) {
                                                    c0230o5.l(c1106n);
                                                } else {
                                                    c0230o5.i0();
                                                }
                                                C0208d.R(C1101i.f14041e, c0230o5, uA4);
                                                C0208d.R(C1101i.f14040d, c0230o5, interfaceC0225l0M6);
                                                c1100h = C1101i.f14042f;
                                                if (c0230o5.f3743O) {
                                                    p012c.k.y(i8, c0230o5, i8, c1100h);
                                                } else {
                                                    p012c.k.y(i8, c0230o5, i8, c1100h);
                                                }
                                                C0208d.R(C1101i.f14039c, c0230o5, oVarC6);
                                                str2 = jVar3.f800b;
                                                if (str2 == null) {
                                                    str3 = str;
                                                } else {
                                                    str3 = str2;
                                                }
                                                e2.b(str3, null, 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3072, 0, 131062);
                                                AbstractC1070c.b(c0230o5, p123x.V.a(lVar2, 1.0f));
                                                boolean zContains2 = ((Set) interfaceC0203a10.getValue()).contains(str);
                                                InterfaceC0203a0 interfaceC0203a12 = interfaceC0203a10;
                                                C0299x0 c0299x1 = new C0299x0(str, jVar2, jVar3, interfaceC0203a12, 0);
                                                interfaceC0203a1 = interfaceC0203a12;
                                                J1.a(zContains2, c0299x1, null, false, null, null, c0230o5, 0, RecurringDays.RECURRING_WEEKDAYS);
                                                c0230o5.p(true);
                                            } else {
                                                interfaceC0203a1 = interfaceC0203a10;
                                                lVar2 = lVar;
                                            }
                                            c0230o5.p(false);
                                            interfaceC0203a10 = interfaceC0203a1;
                                            lVar = lVar2;
                                        }
                                    }
                                }
                            }
                        }
                        Z.l lVar6 = lVar;
                        c0230o5.p(false);
                        L.L.c(androidx.compose.foundation.layout.a.k(lVar6, 0.0f, f9, 0.0f, 0.0f, 13), 0.0f, 0L, c0230o5, 6, 6);
                        strK2 = jVar2.f799a;
                        c0230o5.V(479357835);
                        if (strK2 == null) {
                            strK2 = AbstractC0599v0.K(R.string.light_details_unknown, c0230o5);
                        }
                        c0230o5.p(false);
                        String strL3 = AbstractC0599v0.L(R.string.light_details_light_id, new Object[]{strK2}, c0230o5);
                        long jQ3 = com.fasterxml.jackson.databind.deser.std.d0.q(12);
                        int i210 = p035g0.r.f9086m;
                        long j6 = p035g0.r.f9078d;
                        e2.b(strL3, androidx.compose.foundation.layout.a.k(lVar6, 0.0f, 12, 0.0f, 0.0f, 13), j6, jQ3, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3504, 0, 131056);
                        weakReference = jVar2.f805g;
                        if (weakReference != null) {
                            strK3 = null;
                        } else {
                            strK3 = null;
                        }
                        c0230o5.V(479364474);
                        if (strK3 == null) {
                            strK3 = AbstractC0599v0.K(R.string.light_details_unknown, c0230o5);
                        }
                        c0230o5.p(false);
                        e2.b(AbstractC0599v0.L(R.string.light_details_device_id, new Object[]{strK3}, c0230o5), androidx.compose.foundation.layout.a.k(lVar6, 0.0f, 4, 0.0f, 0.0f, 13), j6, com.fasterxml.jackson.databind.deser.std.d0.q(12), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3504, 0, 131056);
                        c0230o5.p(true);
                    }
                    p012c.k.y(i21, c0230o5, i21, c1100h6);
                    C1100h c1100h8 = C1101i.f14039c;
                    C0208d.R(c1100h8, c0230o5, oVarC3);
                    e2.b(AbstractC0599v0.K(R.string.light_details_increase_color_change, c0230o5), null, 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3072, 0, 131062);
                    AbstractC1070c.b(c0230o5, p123x.V.a(lVar4, 1.0f));
                    final int i211 = 2;
                    J1.a(((Boolean) interfaceC0203a5.getValue()).booleanValue(), new D4.c() { // from class: N3.v0
                        @Override // D4.c
                        public final Object invoke(Object obj11) {
                            switch (i211) {
                                case 0:
                                    J4.a aVar6 = (J4.a) obj11;
                                    D3.j jVar4 = jVar2;
                                    E4.k.f("$light", jVar4);
                                    InterfaceC0203a0 interfaceC0203a13 = interfaceC0203a5;
                                    E4.k.f("$rangeSliderPosition$delegate", interfaceC0203a13);
                                    E4.k.f("it", aVar6);
                                    float fN3 = p081p0.c.N(aVar6.f1939a, 0.0f, 255.0f);
                                    float fN4 = p081p0.c.N(aVar6.f1940b, 0.0f, 255.0f);
                                    if (fN3 <= fN4) {
                                        interfaceC0203a13.setValue(new J4.a(fN3, fN4));
                                        D3.h hVar11 = jVar4.f806h;
                                        if (hVar11 != null) {
                                            hVar11.f786a = (int) fN3;
                                        }
                                        if (hVar11 != null) {
                                            hVar11.f787b = (int) fN4;
                                        }
                                    }
                                    break;
                                case 1:
                                    String str9 = (String) obj11;
                                    D3.j jVar5 = jVar2;
                                    E4.k.f("$light", jVar5);
                                    InterfaceC0203a0 interfaceC0203a14 = interfaceC0203a5;
                                    E4.k.f("$roomOverride$delegate", interfaceC0203a14);
                                    E4.k.f("it", str9);
                                    interfaceC0203a14.setValue(str9);
                                    D3.h hVar12 = jVar5.f806h;
                                    if (hVar12 != null) {
                                        hVar12.f793h = M4.l.i0(str9) ? null : str9;
                                    }
                                    if (M4.l.i0(str9)) {
                                        str9 = null;
                                    }
                                    jVar5.f801c = str9;
                                    break;
                                case 2:
                                    Boolean bool = (Boolean) obj11;
                                    boolean zBooleanValue = bool.booleanValue();
                                    D3.j jVar6 = jVar2;
                                    E4.k.f("$light", jVar6);
                                    InterfaceC0203a0 interfaceC0203a15 = interfaceC0203a5;
                                    E4.k.f("$alwaysChangeHue$delegate", interfaceC0203a15);
                                    interfaceC0203a15.setValue(bool);
                                    D3.h hVar13 = jVar6.f806h;
                                    if (hVar13 != null) {
                                        hVar13.f792g = zBooleanValue;
                                    }
                                    break;
                                default:
                                    Boolean bool2 = (Boolean) obj11;
                                    boolean zBooleanValue2 = bool2.booleanValue();
                                    D3.j jVar7 = jVar2;
                                    E4.k.f("$light", jVar7);
                                    InterfaceC0203a0 interfaceC0203a16 = interfaceC0203a5;
                                    E4.k.f("$ambientOnly$delegate", interfaceC0203a16);
                                    interfaceC0203a16.setValue(bool2);
                                    D3.h hVar14 = jVar7.f806h;
                                    if (hVar14 != null) {
                                        hVar14.f788c = zBooleanValue2;
                                    }
                                    break;
                            }
                            return p084p4.x.f10867a;
                        }
                    }, null, false, null, null, c0230o5, 0, RecurringDays.RECURRING_WEEKDAYS);
                    c0230o5.p(true);
                    Z.o oVarK7 = androidx.compose.foundation.layout.a.k(lVar4, 0.0f, f9, 0.0f, 0.0f, 13);
                    p123x.U uA5 = p123x.T.a(c1069b, fVar2, c0230o5, 48);
                    i = c0230o5.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M7 = c0230o5.m();
                    Z.o oVarC7 = Z.a.c(c0230o5, oVarK7);
                    c0230o5.Z();
                    if (c0230o5.f3743O) {
                        c0230o5.l(c1106n4);
                    } else {
                        c0230o5.i0();
                    }
                    C0208d.R(c1100h4, c0230o5, uA5);
                    C0208d.R(c1100h5, c0230o5, interfaceC0225l0M7);
                    if (c0230o5.f3743O) {
                        p012c.k.y(i, c0230o5, i, c1100h6);
                    } else {
                        p012c.k.y(i, c0230o5, i, c1100h6);
                    }
                    C0208d.R(c1100h8, c0230o5, oVarC7);
                    e2.b(AbstractC0599v0.K(R.string.light_details_ambient_only, c0230o5), null, 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3072, 0, 131062);
                    AbstractC1070c.b(c0230o5, p123x.V.a(lVar4, 1.0f));
                    final int i212 = 3;
                    J1.a(z10, new D4.c() { // from class: N3.v0
                        @Override // D4.c
                        public final Object invoke(Object obj11) {
                            switch (i212) {
                                case 0:
                                    J4.a aVar6 = (J4.a) obj11;
                                    D3.j jVar4 = jVar2;
                                    E4.k.f("$light", jVar4);
                                    InterfaceC0203a0 interfaceC0203a13 = interfaceC0203a4;
                                    E4.k.f("$rangeSliderPosition$delegate", interfaceC0203a13);
                                    E4.k.f("it", aVar6);
                                    float fN3 = p081p0.c.N(aVar6.f1939a, 0.0f, 255.0f);
                                    float fN4 = p081p0.c.N(aVar6.f1940b, 0.0f, 255.0f);
                                    if (fN3 <= fN4) {
                                        interfaceC0203a13.setValue(new J4.a(fN3, fN4));
                                        D3.h hVar11 = jVar4.f806h;
                                        if (hVar11 != null) {
                                            hVar11.f786a = (int) fN3;
                                        }
                                        if (hVar11 != null) {
                                            hVar11.f787b = (int) fN4;
                                        }
                                    }
                                    break;
                                case 1:
                                    String str9 = (String) obj11;
                                    D3.j jVar5 = jVar2;
                                    E4.k.f("$light", jVar5);
                                    InterfaceC0203a0 interfaceC0203a14 = interfaceC0203a4;
                                    E4.k.f("$roomOverride$delegate", interfaceC0203a14);
                                    E4.k.f("it", str9);
                                    interfaceC0203a14.setValue(str9);
                                    D3.h hVar12 = jVar5.f806h;
                                    if (hVar12 != null) {
                                        hVar12.f793h = M4.l.i0(str9) ? null : str9;
                                    }
                                    if (M4.l.i0(str9)) {
                                        str9 = null;
                                    }
                                    jVar5.f801c = str9;
                                    break;
                                case 2:
                                    Boolean bool = (Boolean) obj11;
                                    boolean zBooleanValue = bool.booleanValue();
                                    D3.j jVar6 = jVar2;
                                    E4.k.f("$light", jVar6);
                                    InterfaceC0203a0 interfaceC0203a15 = interfaceC0203a4;
                                    E4.k.f("$alwaysChangeHue$delegate", interfaceC0203a15);
                                    interfaceC0203a15.setValue(bool);
                                    D3.h hVar13 = jVar6.f806h;
                                    if (hVar13 != null) {
                                        hVar13.f792g = zBooleanValue;
                                    }
                                    break;
                                default:
                                    Boolean bool2 = (Boolean) obj11;
                                    boolean zBooleanValue2 = bool2.booleanValue();
                                    D3.j jVar7 = jVar2;
                                    E4.k.f("$light", jVar7);
                                    InterfaceC0203a0 interfaceC0203a16 = interfaceC0203a4;
                                    E4.k.f("$ambientOnly$delegate", interfaceC0203a16);
                                    interfaceC0203a16.setValue(bool2);
                                    D3.h hVar14 = jVar7.f806h;
                                    if (hVar14 != null) {
                                        hVar14.f788c = zBooleanValue2;
                                    }
                                    break;
                            }
                            return p084p4.x.f10867a;
                        }
                    }, null, jVar2.f802d, null, null, c0230o5, 0, 108);
                    c0230o5.p(true);
                    c0230o5.V(479191507);
                    if (z11) {
                        lVar = lVar4;
                        e2.b(AbstractC0599v0.K(R.string.light_details_strobe_mode, c0230o5), androidx.compose.foundation.layout.a.k(lVar, 0.0f, f9, 0.0f, 0.0f, 13), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3120, 0, 131060);
                        interfaceC0203a2 = interfaceC0203a0;
                        final int i213 = 3;
                        p020d2.n.f(AbstractC0599v0.K(R.string.light_details_allow_strobes, c0230o5), E4.k.a((String) interfaceC0203a0.getValue(), "allow"), new D4.a() { // from class: N3.w0
                            @Override // D4.a
                            public final Object invoke() {
                                switch (i213) {
                                    case 0:
                                        D3.j jVar4 = jVar2;
                                        InterfaceC0203a0 interfaceC0203a13 = interfaceC0203a2;
                                        interfaceC0203a13.setValue("never");
                                        D3.h hVar11 = jVar4.f806h;
                                        if (hVar11 != null) {
                                            String str9 = (String) interfaceC0203a13.getValue();
                                            E4.k.f("<set-?>", str9);
                                            hVar11.f789d = str9;
                                        }
                                        break;
                                    case 1:
                                        D3.j jVar5 = jVar2;
                                        InterfaceC0203a0 interfaceC0203a14 = interfaceC0203a2;
                                        interfaceC0203a14.setValue("black");
                                        D3.h hVar12 = jVar5.f806h;
                                        if (hVar12 != null) {
                                            String str10 = (String) interfaceC0203a14.getValue();
                                            E4.k.f("<set-?>", str10);
                                            hVar12.f790e = str10;
                                        }
                                        break;
                                    case 2:
                                        D3.j jVar6 = jVar2;
                                        InterfaceC0203a0 interfaceC0203a15 = interfaceC0203a2;
                                        interfaceC0203a15.setValue("ambient");
                                        D3.h hVar13 = jVar6.f806h;
                                        if (hVar13 != null) {
                                            String str11 = (String) interfaceC0203a15.getValue();
                                            E4.k.f("<set-?>", str11);
                                            hVar13.f790e = str11;
                                        }
                                        break;
                                    case 3:
                                        D3.j jVar7 = jVar2;
                                        InterfaceC0203a0 interfaceC0203a16 = interfaceC0203a2;
                                        interfaceC0203a16.setValue("allow");
                                        D3.h hVar14 = jVar7.f806h;
                                        if (hVar14 != null) {
                                            String str12 = (String) interfaceC0203a16.getValue();
                                            E4.k.f("<set-?>", str12);
                                            hVar14.f789d = str12;
                                        }
                                        break;
                                    default:
                                        D3.j jVar8 = jVar2;
                                        InterfaceC0203a0 interfaceC0203a17 = interfaceC0203a2;
                                        interfaceC0203a17.setValue("only");
                                        D3.h hVar15 = jVar8.f806h;
                                        if (hVar15 != null) {
                                            String str13 = (String) interfaceC0203a17.getValue();
                                            E4.k.f("<set-?>", str13);
                                            hVar15.f789d = str13;
                                        }
                                        break;
                                }
                                return p084p4.x.f10867a;
                            }
                        }, c0230o5, 0);
                        final int i214 = 4;
                        final int i215 = 0;
                        p020d2.n.f(AbstractC0599v0.K(R.string.light_details_only_strobes, c0230o5), E4.k.a((String) interfaceC0203a2.getValue(), "only"), new D4.a() { // from class: N3.w0
                            @Override // D4.a
                            public final Object invoke() {
                                switch (i214) {
                                    case 0:
                                        D3.j jVar4 = jVar2;
                                        InterfaceC0203a0 interfaceC0203a13 = interfaceC0203a2;
                                        interfaceC0203a13.setValue("never");
                                        D3.h hVar11 = jVar4.f806h;
                                        if (hVar11 != null) {
                                            String str9 = (String) interfaceC0203a13.getValue();
                                            E4.k.f("<set-?>", str9);
                                            hVar11.f789d = str9;
                                        }
                                        break;
                                    case 1:
                                        D3.j jVar5 = jVar2;
                                        InterfaceC0203a0 interfaceC0203a14 = interfaceC0203a2;
                                        interfaceC0203a14.setValue("black");
                                        D3.h hVar12 = jVar5.f806h;
                                        if (hVar12 != null) {
                                            String str10 = (String) interfaceC0203a14.getValue();
                                            E4.k.f("<set-?>", str10);
                                            hVar12.f790e = str10;
                                        }
                                        break;
                                    case 2:
                                        D3.j jVar6 = jVar2;
                                        InterfaceC0203a0 interfaceC0203a15 = interfaceC0203a2;
                                        interfaceC0203a15.setValue("ambient");
                                        D3.h hVar13 = jVar6.f806h;
                                        if (hVar13 != null) {
                                            String str11 = (String) interfaceC0203a15.getValue();
                                            E4.k.f("<set-?>", str11);
                                            hVar13.f790e = str11;
                                        }
                                        break;
                                    case 3:
                                        D3.j jVar7 = jVar2;
                                        InterfaceC0203a0 interfaceC0203a16 = interfaceC0203a2;
                                        interfaceC0203a16.setValue("allow");
                                        D3.h hVar14 = jVar7.f806h;
                                        if (hVar14 != null) {
                                            String str12 = (String) interfaceC0203a16.getValue();
                                            E4.k.f("<set-?>", str12);
                                            hVar14.f789d = str12;
                                        }
                                        break;
                                    default:
                                        D3.j jVar8 = jVar2;
                                        InterfaceC0203a0 interfaceC0203a17 = interfaceC0203a2;
                                        interfaceC0203a17.setValue("only");
                                        D3.h hVar15 = jVar8.f806h;
                                        if (hVar15 != null) {
                                            String str13 = (String) interfaceC0203a17.getValue();
                                            E4.k.f("<set-?>", str13);
                                            hVar15.f789d = str13;
                                        }
                                        break;
                                }
                                return p084p4.x.f10867a;
                            }
                        }, c0230o5, 0);
                        p020d2.n.f(AbstractC0599v0.K(R.string.light_details_never_strobe, c0230o5), E4.k.a((String) interfaceC0203a2.getValue(), "never"), new D4.a() { // from class: N3.w0
                            @Override // D4.a
                            public final Object invoke() {
                                switch (i215) {
                                    case 0:
                                        D3.j jVar4 = jVar2;
                                        InterfaceC0203a0 interfaceC0203a13 = interfaceC0203a2;
                                        interfaceC0203a13.setValue("never");
                                        D3.h hVar11 = jVar4.f806h;
                                        if (hVar11 != null) {
                                            String str9 = (String) interfaceC0203a13.getValue();
                                            E4.k.f("<set-?>", str9);
                                            hVar11.f789d = str9;
                                        }
                                        break;
                                    case 1:
                                        D3.j jVar5 = jVar2;
                                        InterfaceC0203a0 interfaceC0203a14 = interfaceC0203a2;
                                        interfaceC0203a14.setValue("black");
                                        D3.h hVar12 = jVar5.f806h;
                                        if (hVar12 != null) {
                                            String str10 = (String) interfaceC0203a14.getValue();
                                            E4.k.f("<set-?>", str10);
                                            hVar12.f790e = str10;
                                        }
                                        break;
                                    case 2:
                                        D3.j jVar6 = jVar2;
                                        InterfaceC0203a0 interfaceC0203a15 = interfaceC0203a2;
                                        interfaceC0203a15.setValue("ambient");
                                        D3.h hVar13 = jVar6.f806h;
                                        if (hVar13 != null) {
                                            String str11 = (String) interfaceC0203a15.getValue();
                                            E4.k.f("<set-?>", str11);
                                            hVar13.f790e = str11;
                                        }
                                        break;
                                    case 3:
                                        D3.j jVar7 = jVar2;
                                        InterfaceC0203a0 interfaceC0203a16 = interfaceC0203a2;
                                        interfaceC0203a16.setValue("allow");
                                        D3.h hVar14 = jVar7.f806h;
                                        if (hVar14 != null) {
                                            String str12 = (String) interfaceC0203a16.getValue();
                                            E4.k.f("<set-?>", str12);
                                            hVar14.f789d = str12;
                                        }
                                        break;
                                    default:
                                        D3.j jVar8 = jVar2;
                                        InterfaceC0203a0 interfaceC0203a17 = interfaceC0203a2;
                                        interfaceC0203a17.setValue("only");
                                        D3.h hVar15 = jVar8.f806h;
                                        if (hVar15 != null) {
                                            String str13 = (String) interfaceC0203a17.getValue();
                                            E4.k.f("<set-?>", str13);
                                            hVar15.f789d = str13;
                                        }
                                        break;
                                }
                                return p084p4.x.f10867a;
                            }
                        }, c0230o5, 0);
                        if (E4.k.a((String) interfaceC0203a2.getValue(), "only")) {
                            e2.b(AbstractC0599v0.K(R.string.light_details_after_strobes, c0230o5), androidx.compose.foundation.layout.a.k(lVar, 0.0f, 8, 0.0f, 0.0f, 13), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3120, 0, 131060);
                            final int i216 = 1;
                            p020d2.n.f(AbstractC0599v0.K(R.string.light_details_stay_black, c0230o5), E4.k.a((String) interfaceC0203a7.getValue(), "black"), new D4.a() { // from class: N3.w0
                                @Override // D4.a
                                public final Object invoke() {
                                    switch (i216) {
                                        case 0:
                                            D3.j jVar4 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a13 = interfaceC0203a7;
                                            interfaceC0203a13.setValue("never");
                                            D3.h hVar11 = jVar4.f806h;
                                            if (hVar11 != null) {
                                                String str9 = (String) interfaceC0203a13.getValue();
                                                E4.k.f("<set-?>", str9);
                                                hVar11.f789d = str9;
                                            }
                                            break;
                                        case 1:
                                            D3.j jVar5 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a14 = interfaceC0203a7;
                                            interfaceC0203a14.setValue("black");
                                            D3.h hVar12 = jVar5.f806h;
                                            if (hVar12 != null) {
                                                String str10 = (String) interfaceC0203a14.getValue();
                                                E4.k.f("<set-?>", str10);
                                                hVar12.f790e = str10;
                                            }
                                            break;
                                        case 2:
                                            D3.j jVar6 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a15 = interfaceC0203a7;
                                            interfaceC0203a15.setValue("ambient");
                                            D3.h hVar13 = jVar6.f806h;
                                            if (hVar13 != null) {
                                                String str11 = (String) interfaceC0203a15.getValue();
                                                E4.k.f("<set-?>", str11);
                                                hVar13.f790e = str11;
                                            }
                                            break;
                                        case 3:
                                            D3.j jVar7 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a16 = interfaceC0203a7;
                                            interfaceC0203a16.setValue("allow");
                                            D3.h hVar14 = jVar7.f806h;
                                            if (hVar14 != null) {
                                                String str12 = (String) interfaceC0203a16.getValue();
                                                E4.k.f("<set-?>", str12);
                                                hVar14.f789d = str12;
                                            }
                                            break;
                                        default:
                                            D3.j jVar8 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a17 = interfaceC0203a7;
                                            interfaceC0203a17.setValue("only");
                                            D3.h hVar15 = jVar8.f806h;
                                            if (hVar15 != null) {
                                                String str13 = (String) interfaceC0203a17.getValue();
                                                E4.k.f("<set-?>", str13);
                                                hVar15.f789d = str13;
                                            }
                                            break;
                                    }
                                    return p084p4.x.f10867a;
                                }
                            }, c0230o5, 0);
                            final int i217 = 2;
                            z5 = false;
                            p020d2.n.f(AbstractC0599v0.K(R.string.light_details_ambient_color, c0230o5), E4.k.a((String) interfaceC0203a7.getValue(), "ambient"), new D4.a() { // from class: N3.w0
                                @Override // D4.a
                                public final Object invoke() {
                                    switch (i217) {
                                        case 0:
                                            D3.j jVar4 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a13 = interfaceC0203a7;
                                            interfaceC0203a13.setValue("never");
                                            D3.h hVar11 = jVar4.f806h;
                                            if (hVar11 != null) {
                                                String str9 = (String) interfaceC0203a13.getValue();
                                                E4.k.f("<set-?>", str9);
                                                hVar11.f789d = str9;
                                            }
                                            break;
                                        case 1:
                                            D3.j jVar5 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a14 = interfaceC0203a7;
                                            interfaceC0203a14.setValue("black");
                                            D3.h hVar12 = jVar5.f806h;
                                            if (hVar12 != null) {
                                                String str10 = (String) interfaceC0203a14.getValue();
                                                E4.k.f("<set-?>", str10);
                                                hVar12.f790e = str10;
                                            }
                                            break;
                                        case 2:
                                            D3.j jVar6 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a15 = interfaceC0203a7;
                                            interfaceC0203a15.setValue("ambient");
                                            D3.h hVar13 = jVar6.f806h;
                                            if (hVar13 != null) {
                                                String str11 = (String) interfaceC0203a15.getValue();
                                                E4.k.f("<set-?>", str11);
                                                hVar13.f790e = str11;
                                            }
                                            break;
                                        case 3:
                                            D3.j jVar7 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a16 = interfaceC0203a7;
                                            interfaceC0203a16.setValue("allow");
                                            D3.h hVar14 = jVar7.f806h;
                                            if (hVar14 != null) {
                                                String str12 = (String) interfaceC0203a16.getValue();
                                                E4.k.f("<set-?>", str12);
                                                hVar14.f789d = str12;
                                            }
                                            break;
                                        default:
                                            D3.j jVar8 = jVar2;
                                            InterfaceC0203a0 interfaceC0203a17 = interfaceC0203a7;
                                            interfaceC0203a17.setValue("only");
                                            D3.h hVar15 = jVar8.f806h;
                                            if (hVar15 != null) {
                                                String str13 = (String) interfaceC0203a17.getValue();
                                                E4.k.f("<set-?>", str13);
                                                hVar15.f789d = str13;
                                            }
                                            break;
                                    }
                                    return p084p4.x.f10867a;
                                }
                            }, c0230o5, 0);
                        }
                        c0230o5.p(z5);
                        c0230o5.V(479276821);
                        if (!z9) {
                            X.s sVar3 = com.nanjoran.ilightshow.Services.M.f8305O.f8335v;
                            arrayList = new ArrayList();
                            listIterator = sVar3.listIterator();
                            while (true) {
                                yVar = (X.y) listIterator;
                                if (yVar.hasNext()) {
                                    next = yVar.next();
                                    if (!((D3.l) next).f813d) {
                                        arrayList.add(next);
                                    }
                                } else {
                                    arrayList2 = new ArrayList();
                                    size = arrayList.size();
                                    i3 = 0;
                                    while (i3 < size) {
                                        Object obj11 = arrayList.get(i3);
                                        i3++;
                                        p089q4.r.R(arrayList2, ((D3.l) obj11).f814e);
                                    }
                                    hashSet = new HashSet();
                                    arrayList3 = new ArrayList();
                                    size2 = arrayList2.size();
                                    i6 = 0;
                                    while (i6 < size2) {
                                        obj4 = arrayList2.get(i6);
                                        i6++;
                                        if (hashSet.add(((D3.j) obj4).f799a)) {
                                            arrayList3.add(obj4);
                                        }
                                    }
                                    ArrayList arrayList9 = new ArrayList();
                                    size3 = arrayList3.size();
                                    i7 = 0;
                                    while (i7 < size3) {
                                        Object obj12 = arrayList3.get(i7);
                                        i7++;
                                        jVar = (D3.j) obj12;
                                        if (E4.k.a(jVar.f799a, jVar2.f799a)) {
                                        }
                                    }
                                    listN0 = p089q4.l.n0(arrayList9, new C0303z0(new C0301y0(), 0));
                                    if (!listN0.isEmpty()) {
                                        e2.b(AbstractC0599v0.K(R.string.light_details_slave_lights, c0230o5), androidx.compose.foundation.layout.a.k(lVar, 0.0f, f9, 0.0f, 0.0f, 13), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3120, 0, 131060);
                                        while (r2.hasNext()) {
                                            str = jVar3.f799a;
                                            c0230o5.V(479311983);
                                            if (str != null) {
                                                Z.o oVarK8 = androidx.compose.foundation.layout.a.k(lVar, 0.0f, 8, 0.0f, 0.0f, 13);
                                                lVar2 = lVar;
                                                p123x.U uA6 = p123x.T.a(AbstractC1078k.f13777a, fVar2, c0230o5, 48);
                                                i8 = c0230o5.f3744P;
                                                InterfaceC0225l0 interfaceC0225l0M8 = c0230o5.m();
                                                Z.o oVarC8 = Z.a.c(c0230o5, oVarK8);
                                                InterfaceC1102j.f14043g.getClass();
                                                c1106n = C1101i.f14038b;
                                                c0230o5.Z();
                                                if (c0230o5.f3743O) {
                                                    c0230o5.l(c1106n);
                                                } else {
                                                    c0230o5.i0();
                                                }
                                                C0208d.R(C1101i.f14041e, c0230o5, uA6);
                                                C0208d.R(C1101i.f14040d, c0230o5, interfaceC0225l0M8);
                                                c1100h = C1101i.f14042f;
                                                if (c0230o5.f3743O) {
                                                    p012c.k.y(i8, c0230o5, i8, c1100h);
                                                } else {
                                                    p012c.k.y(i8, c0230o5, i8, c1100h);
                                                }
                                                C0208d.R(C1101i.f14039c, c0230o5, oVarC8);
                                                str2 = jVar3.f800b;
                                                if (str2 == null) {
                                                    str3 = str;
                                                } else {
                                                    str3 = str2;
                                                }
                                                e2.b(str3, null, 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3072, 0, 131062);
                                                AbstractC1070c.b(c0230o5, p123x.V.a(lVar2, 1.0f));
                                                boolean zContains3 = ((Set) interfaceC0203a10.getValue()).contains(str);
                                                InterfaceC0203a0 interfaceC0203a13 = interfaceC0203a10;
                                                C0299x0 c0299x2 = new C0299x0(str, jVar2, jVar3, interfaceC0203a13, 0);
                                                interfaceC0203a1 = interfaceC0203a13;
                                                J1.a(zContains3, c0299x2, null, false, null, null, c0230o5, 0, RecurringDays.RECURRING_WEEKDAYS);
                                                c0230o5.p(true);
                                            } else {
                                                interfaceC0203a1 = interfaceC0203a10;
                                                lVar2 = lVar;
                                            }
                                            c0230o5.p(false);
                                            interfaceC0203a10 = interfaceC0203a1;
                                            lVar = lVar2;
                                        }
                                    }
                                }
                            }
                        }
                        Z.l lVar7 = lVar;
                        c0230o5.p(false);
                        L.L.c(androidx.compose.foundation.layout.a.k(lVar7, 0.0f, f9, 0.0f, 0.0f, 13), 0.0f, 0L, c0230o5, 6, 6);
                        strK2 = jVar2.f799a;
                        c0230o5.V(479357835);
                        if (strK2 == null) {
                            strK2 = AbstractC0599v0.K(R.string.light_details_unknown, c0230o5);
                        }
                        c0230o5.p(false);
                        String strL4 = AbstractC0599v0.L(R.string.light_details_light_id, new Object[]{strK2}, c0230o5);
                        long jQ4 = com.fasterxml.jackson.databind.deser.std.d0.q(12);
                        int i218 = p035g0.r.f9086m;
                        long j7 = p035g0.r.f9078d;
                        e2.b(strL4, androidx.compose.foundation.layout.a.k(lVar7, 0.0f, 12, 0.0f, 0.0f, 13), j7, jQ4, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3504, 0, 131056);
                        weakReference = jVar2.f805g;
                        if (weakReference != null) {
                            strK3 = null;
                        } else {
                            strK3 = null;
                        }
                        c0230o5.V(479364474);
                        if (strK3 == null) {
                            strK3 = AbstractC0599v0.K(R.string.light_details_unknown, c0230o5);
                        }
                        c0230o5.p(false);
                        e2.b(AbstractC0599v0.L(R.string.light_details_device_id, new Object[]{strK3}, c0230o5), androidx.compose.foundation.layout.a.k(lVar7, 0.0f, 4, 0.0f, 0.0f, 13), j7, com.fasterxml.jackson.databind.deser.std.d0.q(12), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3504, 0, 131056);
                        c0230o5.p(true);
                    } else {
                        lVar = lVar4;
                    }
                    z5 = false;
                    c0230o5.p(z5);
                    c0230o5.V(479276821);
                    if (!z9) {
                        X.s sVar4 = com.nanjoran.ilightshow.Services.M.f8305O.f8335v;
                        arrayList = new ArrayList();
                        listIterator = sVar4.listIterator();
                        while (true) {
                            yVar = (X.y) listIterator;
                            if (yVar.hasNext()) {
                                next = yVar.next();
                                if (!((D3.l) next).f813d) {
                                    arrayList.add(next);
                                }
                            } else {
                                arrayList2 = new ArrayList();
                                size = arrayList.size();
                                i3 = 0;
                                while (i3 < size) {
                                    Object obj13 = arrayList.get(i3);
                                    i3++;
                                    p089q4.r.R(arrayList2, ((D3.l) obj13).f814e);
                                }
                                hashSet = new HashSet();
                                arrayList3 = new ArrayList();
                                size2 = arrayList2.size();
                                i6 = 0;
                                while (i6 < size2) {
                                    obj4 = arrayList2.get(i6);
                                    i6++;
                                    if (hashSet.add(((D3.j) obj4).f799a)) {
                                        arrayList3.add(obj4);
                                    }
                                }
                                ArrayList arrayList10 = new ArrayList();
                                size3 = arrayList3.size();
                                i7 = 0;
                                while (i7 < size3) {
                                    Object obj14 = arrayList3.get(i7);
                                    i7++;
                                    jVar = (D3.j) obj14;
                                    if (E4.k.a(jVar.f799a, jVar2.f799a)) {
                                    }
                                }
                                listN0 = p089q4.l.n0(arrayList10, new C0303z0(new C0301y0(), 0));
                                if (!listN0.isEmpty()) {
                                    e2.b(AbstractC0599v0.K(R.string.light_details_slave_lights, c0230o5), androidx.compose.foundation.layout.a.k(lVar, 0.0f, f9, 0.0f, 0.0f, 13), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3120, 0, 131060);
                                    while (r2.hasNext()) {
                                        str = jVar3.f799a;
                                        c0230o5.V(479311983);
                                        if (str != null) {
                                            Z.o oVarK9 = androidx.compose.foundation.layout.a.k(lVar, 0.0f, 8, 0.0f, 0.0f, 13);
                                            lVar2 = lVar;
                                            p123x.U uA7 = p123x.T.a(AbstractC1078k.f13777a, fVar2, c0230o5, 48);
                                            i8 = c0230o5.f3744P;
                                            InterfaceC0225l0 interfaceC0225l0M9 = c0230o5.m();
                                            Z.o oVarC9 = Z.a.c(c0230o5, oVarK9);
                                            InterfaceC1102j.f14043g.getClass();
                                            c1106n = C1101i.f14038b;
                                            c0230o5.Z();
                                            if (c0230o5.f3743O) {
                                                c0230o5.l(c1106n);
                                            } else {
                                                c0230o5.i0();
                                            }
                                            C0208d.R(C1101i.f14041e, c0230o5, uA7);
                                            C0208d.R(C1101i.f14040d, c0230o5, interfaceC0225l0M9);
                                            c1100h = C1101i.f14042f;
                                            if (c0230o5.f3743O) {
                                                p012c.k.y(i8, c0230o5, i8, c1100h);
                                            } else {
                                                p012c.k.y(i8, c0230o5, i8, c1100h);
                                            }
                                            C0208d.R(C1101i.f14039c, c0230o5, oVarC9);
                                            str2 = jVar3.f800b;
                                            if (str2 == null) {
                                                str3 = str;
                                            } else {
                                                str3 = str2;
                                            }
                                            e2.b(str3, null, 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3072, 0, 131062);
                                            AbstractC1070c.b(c0230o5, p123x.V.a(lVar2, 1.0f));
                                            boolean zContains4 = ((Set) interfaceC0203a10.getValue()).contains(str);
                                            InterfaceC0203a0 interfaceC0203a14 = interfaceC0203a10;
                                            C0299x0 c0299x3 = new C0299x0(str, jVar2, jVar3, interfaceC0203a14, 0);
                                            interfaceC0203a1 = interfaceC0203a14;
                                            J1.a(zContains4, c0299x3, null, false, null, null, c0230o5, 0, RecurringDays.RECURRING_WEEKDAYS);
                                            c0230o5.p(true);
                                        } else {
                                            interfaceC0203a1 = interfaceC0203a10;
                                            lVar2 = lVar;
                                        }
                                        c0230o5.p(false);
                                        interfaceC0203a10 = interfaceC0203a1;
                                        lVar = lVar2;
                                    }
                                }
                            }
                        }
                    }
                    Z.l lVar8 = lVar;
                    c0230o5.p(false);
                    L.L.c(androidx.compose.foundation.layout.a.k(lVar8, 0.0f, f9, 0.0f, 0.0f, 13), 0.0f, 0L, c0230o5, 6, 6);
                    strK2 = jVar2.f799a;
                    c0230o5.V(479357835);
                    if (strK2 == null) {
                        strK2 = AbstractC0599v0.K(R.string.light_details_unknown, c0230o5);
                    }
                    c0230o5.p(false);
                    String strL5 = AbstractC0599v0.L(R.string.light_details_light_id, new Object[]{strK2}, c0230o5);
                    long jQ5 = com.fasterxml.jackson.databind.deser.std.d0.q(12);
                    int i219 = p035g0.r.f9086m;
                    long j8 = p035g0.r.f9078d;
                    e2.b(strL5, androidx.compose.foundation.layout.a.k(lVar8, 0.0f, 12, 0.0f, 0.0f, 13), j8, jQ5, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3504, 0, 131056);
                    weakReference = jVar2.f805g;
                    if (weakReference != null) {
                        strK3 = null;
                    } else {
                        strK3 = null;
                    }
                    c0230o5.V(479364474);
                    if (strK3 == null) {
                        strK3 = AbstractC0599v0.K(R.string.light_details_unknown, c0230o5);
                    }
                    c0230o5.p(false);
                    e2.b(AbstractC0599v0.L(R.string.light_details_device_id, new Object[]{strK3}, c0230o5), androidx.compose.foundation.layout.a.k(lVar8, 0.0f, 4, 0.0f, 0.0f, 13), j8, com.fasterxml.jackson.databind.deser.std.d0.q(12), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 3504, 0, 131056);
                    c0230o5.p(true);
                }
                return xVar;
            case 2:
                return a(obj, obj2, obj3);
            default:
                p123x.O o7 = (p123x.O) obj;
                C0230o c0230o7 = (C0230o) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                E4.k.f("innerPadding", o7);
                if ((iIntValue3 & 14) == 0) {
                    iIntValue3 |= c0230o7.f(o7) ? 4 : 2;
                }
                if ((iIntValue3 & 91) == 18 && c0230o7.B()) {
                    c0230o7.P();
                    return xVar;
                }
                Z.l lVar9 = Z.l.f5957a;
                float f10 = 16;
                Z.o oVarG2 = androidx.compose.foundation.layout.a.g(lVar9, f10);
                FillElement fillElement3 = androidx.compose.foundation.layout.c.f6634a;
                Z.o oVarF = androidx.compose.foundation.layout.a.f(oVarG2.k(fillElement3), o7);
                C1071d c1071d = AbstractC1078k.f13779c;
                C1090x c1090xA3 = AbstractC1088v.a(c1071d, Z.b.f5943s, c0230o7, 0);
                int i30 = c0230o7.f3744P;
                InterfaceC0225l0 interfaceC0225l0M10 = c0230o7.m();
                Z.o oVarC10 = Z.a.c(c0230o7, oVarF);
                InterfaceC1102j.f14043g.getClass();
                C1106n c1106n5 = C1101i.f14038b;
                c0230o7.Z();
                if (c0230o7.f3743O) {
                    c0230o7.l(c1106n5);
                } else {
                    c0230o7.i0();
                }
                C1100h c1100h9 = C1101i.f14041e;
                C0208d.R(c1100h9, c0230o7, c1090xA3);
                C1100h c1100h10 = C1101i.f14040d;
                C0208d.R(c1100h10, c0230o7, interfaceC0225l0M10);
                C1100h c1100h11 = C1101i.f14042f;
                if (c0230o7.f3743O || !E4.k.a(c0230o7.K(), Integer.valueOf(i30))) {
                    p012c.k.y(i30, c0230o7, i30, c1100h11);
                }
                C1100h c1100h12 = C1101i.f14039c;
                C0208d.R(c1100h12, c0230o7, oVarC10);
                c0230o7.V(976422408);
                Object objK4 = c0230o7.K();
                N.U u8 = N.U.f3673m;
                if (objK4 == u6) {
                    objK4 = C0208d.K(-1, u8);
                    c0230o7.f0(objK4);
                }
                InterfaceC0203a0 interfaceC0203a15 = (InterfaceC0203a0) objK4;
                Object objD8 = AbstractC0013g0.d(976424424, c0230o7, false);
                if (objD8 == u6) {
                    objD8 = C0208d.K(Float.valueOf(0.0f), u8);
                    c0230o7.f0(objD8);
                }
                InterfaceC0203a0 interfaceC0203a16 = (InterfaceC0203a0) objD8;
                c0230o7.p(false);
                Z.e eVar = Z.b.f5944t;
                Z.o oVarG3 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.c.f6635b, f10);
                C1090x c1090xA4 = AbstractC1088v.a(c1071d, eVar, c0230o7, 48);
                int i31 = c0230o7.f3744P;
                InterfaceC0225l0 interfaceC0225l0M11 = c0230o7.m();
                Z.o oVarC11 = Z.a.c(c0230o7, oVarG3);
                c0230o7.Z();
                if (c0230o7.f3743O) {
                    c0230o7.l(c1106n5);
                } else {
                    c0230o7.i0();
                }
                C0208d.R(c1100h9, c0230o7, c1090xA4);
                C0208d.R(c1100h10, c0230o7, interfaceC0225l0M11);
                if (c0230o7.f3743O || !E4.k.a(c0230o7.K(), Integer.valueOf(i31))) {
                    p012c.k.y(i31, c0230o7, i31, c1100h11);
                }
                C0208d.R(c1100h12, c0230o7, oVarC11);
                Z.g gVar = Z.b.f5936l;
                Z.o oVarC12 = androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.a.k(lVar9, 0.0f, 55, 0.0f, 0.0f, 13).k(fillElement3), 1.0f);
                c0230o7.V(-1517719922);
                Object objK5 = c0230o7.K();
                if (objK5 == u6) {
                    objK5 = new C0259d(5, interfaceC0203a16);
                    c0230o7.f0(objK5);
                }
                c0230o7.p(false);
                Z.o oVarE = androidx.compose.ui.layout.a.e(oVarC12, (D4.c) objK5);
                p113v0.F fE = AbstractC1084q.e(gVar, false);
                int i32 = c0230o7.f3744P;
                InterfaceC0225l0 interfaceC0225l0M12 = c0230o7.m();
                Z.o oVarC13 = Z.a.c(c0230o7, oVarE);
                c0230o7.Z();
                if (c0230o7.f3743O) {
                    c0230o7.l(c1106n5);
                } else {
                    c0230o7.i0();
                }
                C0208d.R(c1100h9, c0230o7, fE);
                C0208d.R(c1100h10, c0230o7, interfaceC0225l0M12);
                if (c0230o7.f3743O || !E4.k.a(c0230o7.K(), Integer.valueOf(i32))) {
                    p012c.k.y(i32, c0230o7, i32, c1100h11);
                }
                C0208d.R(c1100h12, c0230o7, oVarC13);
                p027e3.a.D(androidx.compose.foundation.layout.c.h(lVar9, 2 * ((Number) interfaceC0203a16.getValue()).floatValue()), (Palette) obj5, interfaceC0203a15, c0230o7, 448);
                c0230o7.p(true);
                e2.b(AbstractC0599v0.K(R.string.palettes_editor_help, c0230o7), androidx.compose.foundation.layout.a.g(lVar9, f10), 0L, 0L, null, 0L, new R0.i(3), 0L, 0, false, 0, 0, ((g2) c0230o7.k(h2.f2777a)).f2756l, c0230o7, 48, 0, 65020);
                c0230o7.p(true);
                c0230o7.p(true);
                return xVar;
        }
    }
}
