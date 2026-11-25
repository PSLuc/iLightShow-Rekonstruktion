package N3;

import L.AbstractC0149j0;
import L.AbstractC0169q;
import L.e2;
import N.C0208d;
import N.C0230o;
import N.InterfaceC0225l0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.R;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.RecurringDays;
import p123x.AbstractC1070c;
import p123x.AbstractC1078k;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: renamed from: N3.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0293u0 implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4275h;
    public final /* synthetic */ D3.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ F1.I f4276j;

    public /* synthetic */ C0293u0(D3.j jVar, F1.I i, int i3) {
        this.f4275h = i3;
        this.i = jVar;
        this.f4276j = i;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        boolean z5;
        switch (this.f4275h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    AbstractC0169q.b(V.b.c(364354096, new C0266g0(1, this.i), c0230o), null, V.b.c(1810934962, new C0257c(this.f4276j, 11), c0230o), null, null, null, c0230o, 390, 122);
                }
                break;
            default:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    Z.f fVar = Z.b.f5942r;
                    Z.l lVar = Z.l.f5957a;
                    float f6 = 8;
                    Z.o oVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.c(lVar, 54), f6, 0.0f, 0.0f, 0.0f, 14);
                    p123x.U uA = p123x.T.a(AbstractC1078k.f13777a, fVar, c0230o2, 48);
                    int i = c0230o2.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M = c0230o2.m();
                    Z.o oVarC = Z.a.c(c0230o2, oVarK);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n = C1101i.f14038b;
                    c0230o2.Z();
                    if (c0230o2.f3743O) {
                        c0230o2.l(c1106n);
                    } else {
                        c0230o2.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o2, uA);
                    C0208d.R(C1101i.f14040d, c0230o2, interfaceC0225l0M);
                    C1100h c1100h = C1101i.f14042f;
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i))) {
                        p012c.k.y(i, c0230o2, i, c1100h);
                    }
                    C0208d.R(C1101i.f14039c, c0230o2, oVarC);
                    com.nanjoran.ilightshow.Services.M m6 = com.nanjoran.ilightshow.Services.M.f8305O;
                    X.s sVar = m6.f8339z;
                    D3.j jVar = this.i;
                    if (sVar.contains(jVar)) {
                        c0230o2.V(695653764);
                        D3.h hVar = jVar.f806h;
                        if (hVar == null || !hVar.f788c) {
                            z5 = false;
                            c0230o2.V(695903407);
                            S1.V.d(com.fasterxml.jackson.databind.deser.std.d0.z(R.drawable.ic_lighticonblue, c0230o2), null, null, null, null, 0.0f, null, c0230o2, 56, RecurringDays.RECURRING_WEEKDAYS);
                            c0230o2.p(false);
                        } else {
                            c0230o2.V(695724940);
                            z5 = false;
                            S1.V.d(com.fasterxml.jackson.databind.deser.std.d0.z(R.drawable.ic_lighticonambient, c0230o2), null, null, null, null, 0.0f, null, c0230o2, 56, RecurringDays.RECURRING_WEEKDAYS);
                            c0230o2.p(false);
                        }
                        c0230o2.p(z5);
                    } else {
                        z5 = false;
                        c0230o2.V(696116501);
                        S1.V.d(com.fasterxml.jackson.databind.deser.std.d0.z(R.drawable.ic_lighticonstrike, c0230o2), null, null, null, null, 0.0f, null, c0230o2, 56, RecurringDays.RECURRING_WEEKDAYS);
                        c0230o2.p(false);
                    }
                    String strK = jVar.f800b;
                    c0230o2.V(-2055748067);
                    if (strK == null) {
                        strK = AbstractC0599v0.K(R.string.lights_unknown, c0230o2);
                    }
                    c0230o2.p(z5);
                    e2.b(strK, androidx.compose.foundation.layout.a.g(lVar, f6), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o2, 48, 0, 131068);
                    C0230o c0230o3 = c0230o2;
                    AbstractC1070c.b(c0230o3, p123x.V.a(lVar, 1.0f));
                    c0230o3.V(-2055741416);
                    if (!jVar.f802d && m6.n()) {
                        AbstractC0149j0.b(S1.V.D(), null, null, p035g0.r.f9083j, c0230o3, 3120, 4);
                        c0230o3 = c0230o3;
                    }
                    c0230o3.p(false);
                    C0230o c0230o4 = c0230o3;
                    L.L.d(new A0(jVar, this.f4276j), null, false, null, null, K.f4013p, c0230o4, 196608, 30);
                    c0230o4.p(true);
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}
