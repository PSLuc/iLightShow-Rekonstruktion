package A2;

import B.AbstractC0013g0;
import B.C0005c0;
import B.S0;
import B.c1;
import E0.i;
import E0.j;
import E4.k;
import E4.l;
import F1.B;
import F1.C0096m;
import G1.h;
import L.AbstractC0136f;
import L.AbstractC0174s;
import L.L;
import N.C0;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.D0;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import N.U;
import O.C0304a;
import O.C0305b;
import S1.h0;
import V0.y;
import W.g;
import X.s;
import Z.o;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.EnumC0453m;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.github.kittinunf.fuel.core.FuelError;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.R;
import com.spotify.sdk.android.auth.AccountsQueryParameters;
import com.spotify.sdk.android.auth.LoginActivity;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p020d2.n;
import p084p4.x;
import p090r.C0867f;
import p091r0.q;
import p112v.M;
import p113v0.C1036t;
import p113v0.F;
import p113v0.Y;
import p123x.AbstractC1078k;
import p123x.AbstractC1084q;
import p123x.C1072e;
import p123x.C1086t;
import p123x.C1087u;
import p123x.O;
import p123x.T;
import p123x.V;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;
import p126x2.r;
import p126x2.t;
import p126x2.u;
import p126x2.w;
import p126x2.z;

/* JADX INFO: loaded from: classes.dex */
public final class d extends l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f20h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f21j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, int i3, Object obj, Object obj2) {
        super(2);
        this.f20h = i3;
        this.i = obj;
        this.f21j = obj2;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) throws Throwable {
        U u6 = C0222k.f3714a;
        Z.l lVar = Z.l.f5957a;
        int i = 6;
        int i3 = 2;
        x xVar = x.f10867a;
        Object obj3 = this.f21j;
        Object obj4 = this.i;
        switch (this.f20h) {
            case 0:
                w wVar = (w) obj;
                z zVar = (z) obj2;
                k.f(LoginActivity.REQUEST_KEY, wVar);
                k.f(LoginActivity.RESPONSE_KEY, zVar);
                int i6 = zVar.f14135b;
                D4.e eVar = (D4.e) obj3;
                if (i6 / 100 != 3 || k.a(wVar.f().f14124e, Boolean.FALSE)) {
                    return (z) eVar.d(wVar, zVar);
                }
                t tVar = zVar.f14137d;
                Collection collection = (Collection) tVar.get("Location");
                if (collection.isEmpty()) {
                    collection = (Collection) tVar.get("Content-Location");
                }
                String str = (String) p089q4.l.g0(collection);
                if (str == null || str.length() == 0) {
                    return (z) eVar.d(wVar, zVar);
                }
                URL url = new URI((String) p089q4.l.X(M4.l.u0(str, new char[]{'?'}))).isAbsolute() ? new URL(str) : new URL(wVar.q(), str);
                u uVarX = f.f23a.contains(Integer.valueOf(i6)) ? u.GET : wVar.x();
                String string = url.toString();
                k.e("newUrl.toString()", string);
                A0.b bVar = new A0.b(uVarX, string, null);
                r rVar = (r) ((e) obj4).i;
                rVar.getClass();
                w wVarA = rVar.a(bVar.u());
                Map map = t.i;
                w wVarO = wVarA.o(AbstractC0599v0.w(wVar.l()));
                if (!k.a(url.getHost(), wVar.q().getHost())) {
                    wVarO.l().remove("Authorization");
                }
                w wVarA2 = wVarO.k(wVar.f().f14120a).a(wVar.f().f14121b);
                if (uVarX == wVar.x() && !wVar.j().isEmpty() && !wVar.j().a()) {
                    wVarA2 = wVarA2.v(wVar.j());
                }
                return (z) eVar.d(wVar, wVarA2.y().i);
            case 1:
                ((Number) obj2).intValue();
                n.h((o) obj4, (V.a) obj3, (C0230o) obj, C0208d.V(49));
                return xVar;
            case 2:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    ((G1.o) obj4).f1638r.c((C0096m) obj3, c0230o, 0);
                }
                return xVar;
            case 3:
                ((Number) obj2).intValue();
                p027e3.a.J((s) obj4, (List) obj3, (C0230o) obj, C0208d.V(1));
                return xVar;
            case 4:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    p081p0.c.z((g) obj4, (V.a) obj3, c0230o2, 0);
                }
                return xVar;
            case 5:
                C0230o c0230o3 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o3.B()) {
                    c0230o3.P();
                } else {
                    C0096m c0096m = (C0096m) obj4;
                    B b6 = c0096m.i;
                    k.d("null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination", b6);
                    ((h) b6).f1620q.k((C0867f) obj3, c0096m, c0230o3, 0);
                }
                return xVar;
            case 6:
                ((Number) obj2).intValue();
                h0.e((G2.a) obj4, (EnumC0453m) obj3, (C0230o) obj, 1);
                return xVar;
            case 7:
                C0230o c0230o4 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o4.B()) {
                    c0230o4.P();
                } else {
                    String strI = L.i(R.string.m3c_dialog, c0230o4);
                    o oVarJ = androidx.compose.foundation.layout.c.j((Z.l) obj4, AbstractC0136f.f2714a, Float.NaN, AbstractC0136f.f2715b, Float.NaN);
                    c0230o4.W(-874813489);
                    boolean zF = c0230o4.f(strI);
                    Object objK = c0230o4.K();
                    if (zF || objK == u6) {
                        objK = new j(strI, i3);
                        c0230o4.f0(objK);
                    }
                    c0230o4.p(false);
                    o oVarK = oVarJ.k(i.a(lVar, false, (D4.c) objK));
                    c0230o4.W(733328855);
                    C1086t c1086tF = AbstractC1084q.f(Z.b.f5933h, true, c0230o4, 48);
                    c0230o4.W(-1323940314);
                    int i7 = c0230o4.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M = c0230o4.m();
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n = C1101i.f14038b;
                    V.a aVarH = p113v0.U.h(oVarK);
                    c0230o4.Z();
                    if (c0230o4.f3743O) {
                        c0230o4.l(c1106n);
                    } else {
                        c0230o4.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o4, c1086tF);
                    C0208d.R(C1101i.f14040d, c0230o4, interfaceC0225l0M);
                    C1100h c1100h = C1101i.f14042f;
                    if (c0230o4.f3743O || !k.a(c0230o4.K(), Integer.valueOf(i7))) {
                        p012c.k.y(i7, c0230o4, i7, c1100h);
                    }
                    AbstractC0013g0.p(0, aVarH, new C0(c0230o4), c0230o4, 2058660585);
                    ((V.a) obj3).d(c0230o4, 0);
                    c0230o4.p(false);
                    c0230o4.p(true);
                    c0230o4.p(false);
                    c0230o4.p(false);
                }
                return xVar;
            case 8:
                C0230o c0230o5 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o5.B()) {
                    c0230o5.P();
                } else {
                    o oVarF = androidx.compose.foundation.layout.a.f(androidx.compose.foundation.layout.c.a(lVar, AbstractC0174s.f2905c, AbstractC0174s.f2906d), (O) obj4);
                    C1072e c1072e = AbstractC1078k.f13781e;
                    Z.f fVar = Z.b.f5942r;
                    c0230o5.W(693286680);
                    p123x.U uA = T.a(c1072e, fVar, c0230o5, 54);
                    c0230o5.W(-1323940314);
                    int i8 = c0230o5.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M2 = c0230o5.m();
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n2 = C1101i.f14038b;
                    V.a aVarH2 = p113v0.U.h(oVarF);
                    c0230o5.Z();
                    if (c0230o5.f3743O) {
                        c0230o5.l(c1106n2);
                    } else {
                        c0230o5.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o5, uA);
                    C0208d.R(C1101i.f14040d, c0230o5, interfaceC0225l0M2);
                    C1100h c1100h2 = C1101i.f14042f;
                    if (c0230o5.f3743O || !k.a(c0230o5.K(), Integer.valueOf(i8))) {
                        p012c.k.y(i8, c0230o5, i8, c1100h2);
                    }
                    AbstractC0013g0.p(0, aVarH2, new C0(c0230o5), c0230o5, 2058660585);
                    ((D4.f) obj3).c(V.f13719a, c0230o5, 6);
                    AbstractC0013g0.q(c0230o5, false, true, false, false);
                }
                return xVar;
            case 9:
                C0230o c0230o6 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o6.B()) {
                    c0230o6.P();
                } else {
                    o oVarA = i.a(lVar, false, V0.c.f5412l);
                    y yVar = (y) obj4;
                    boolean zH = c0230o6.h(yVar);
                    Object objK2 = c0230o6.K();
                    if (zH || objK2 == u6) {
                        objK2 = new V0.j(yVar, 1);
                        c0230o6.f0(objK2);
                    }
                    o oVarE = androidx.compose.ui.layout.a.e(oVarA, (D4.c) objK2);
                    float f6 = yVar.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f6 != 1.0f) {
                        oVarE = androidx.compose.ui.graphics.a.b(oVarE, 0.0f, 0.0f, f6, 0.0f, 0.0f, null, true, 126971);
                    }
                    o oVar = oVarE;
                    V.a aVarC = V.b.c(606497925, new V0.d(i3, (InterfaceC0203a0) obj3), c0230o6);
                    V0.f fVar2 = V0.f.f5421c;
                    int i9 = c0230o6.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M3 = c0230o6.m();
                    o oVarC = Z.a.c(c0230o6, oVar);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n3 = C1101i.f14038b;
                    c0230o6.Z();
                    if (c0230o6.f3743O) {
                        c0230o6.l(c1106n3);
                    } else {
                        c0230o6.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o6, fVar2);
                    C0208d.R(C1101i.f14040d, c0230o6, interfaceC0225l0M3);
                    C1100h c1100h3 = C1101i.f14042f;
                    if (c0230o6.f3743O || !k.a(c0230o6.K(), Integer.valueOf(i9))) {
                        p012c.k.y(i9, c0230o6, i9, c1100h3);
                    }
                    C0208d.R(C1101i.f14039c, c0230o6, oVarC);
                    aVarC.d(c0230o6, 6);
                    c0230o6.p(true);
                }
                return xVar;
            case 10:
                ((Number) obj2).intValue();
                ((p107u.g) obj4).a((p107u.a) obj3, (C0230o) obj, C0208d.V(1));
                return xVar;
            case 11:
                ((Number) obj2).intValue();
                p107u.o.a((p107u.a) obj4, (V.a) obj3, (C0230o) obj, C0208d.V(385));
                return xVar;
            case 12:
                C0230o c0230o7 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o7.B()) {
                    c0230o7.P();
                } else {
                    p107u.a aVar = (p107u.a) obj4;
                    p107u.o.a(aVar, V.b.c(1156688164, new S0((C0005c0) obj3, 5, aVar), c0230o7), c0230o7, 384);
                }
                return xVar;
            case 13:
                long j4 = ((p030f0.c) obj2).f8837a;
                d0.i((p097s0.c) obj4, (q) obj);
                R4.b bVar2 = ((M) obj3).f12859A;
                if (bVar2 != null) {
                    bVar2.j(new p112v.r(j4));
                }
                return xVar;
            case 14:
                C0230o c0230o8 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o8.B()) {
                    c0230o8.P();
                } else {
                    Boolean bool = (Boolean) ((C1036t) obj4).f13185f.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    c0230o8.Y(bool);
                    boolean zG = c0230o8.g(zBooleanValue);
                    c0230o8.V(-869707859);
                    if (zBooleanValue) {
                        ((D4.e) obj3).d(c0230o8, 0);
                    } else {
                        if (!(c0230o8.f3754k == 0)) {
                            C0208d.w("No nodes can be emitted before calling dactivateToEndGroup");
                            throw null;
                        }
                        if (!c0230o8.f3743O) {
                            if (zG) {
                                D0 d1 = c0230o8.f3738F;
                                int i10 = d1.f3570g;
                                int i11 = d1.f3571h;
                                C0305b c0305b = c0230o8.f3740L;
                                c0305b.getClass();
                                c0305b.d(false);
                                C0304a c0304a = c0305b.f4351b;
                                c0304a.getClass();
                                c0304a.f4349j.L0(O.f.f4365c);
                                C0208d.q(c0230o8.f3761r, i10, i11);
                                c0230o8.f3738F.m();
                            } else {
                                c0230o8.O();
                            }
                        }
                    }
                    c0230o8.p(false);
                    if (c0230o8.f3767x && c0230o8.f3738F.i == c0230o8.f3768y) {
                        c0230o8.f3768y = -1;
                        c0230o8.f3767x = false;
                    }
                    c0230o8.p(false);
                }
                return xVar;
            case 15:
                C0230o c0230o9 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o9.B()) {
                    c0230o9.P();
                } else {
                    ((V.a) obj4).c((C1087u) obj3, c0230o9, 0);
                }
                return xVar;
            case 16:
                Y y2 = (Y) obj;
                long j6 = ((S0.a) obj2).f4883a;
                return ((F) obj4).c(y2, y2.m(xVar, new V.a(-1945019079, new d((V.a) obj3, 15, new C1087u(y2, j6)), true)), j6);
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                FuelError fuelError = (FuelError) obj;
                z zVar2 = (z) obj2;
                k.f(AccountsQueryParameters.ERROR, fuelError);
                k.f(LoginActivity.RESPONSE_KEY, zVar2);
                p126x2.x xVarF = ((w) obj4).f();
                c1 c1Var = new c1(this, zVar2, fuelError, i);
                xVarF.getClass();
                xVarF.f14131m.execute(new L2.o(c1Var));
                return xVar;
            default:
                ((Number) obj2).intValue();
                AndroidCompositionLocals_androidKt.a((p130y0.r) obj4, (V.a) obj3, (C0230o) obj, C0208d.V(1));
                return xVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, int i, Object obj2) {
        super(2);
        this.f20h = i;
        this.i = obj;
        this.f21j = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p107u.a aVar, C0005c0 c0005c0) {
        super(2);
        this.f20h = 12;
        this.i = aVar;
        this.f21j = c0005c0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(w wVar, D4.f fVar) {
        super(2);
        this.f20h = 17;
        this.i = wVar;
        this.f21j = (l) fVar;
    }
}
