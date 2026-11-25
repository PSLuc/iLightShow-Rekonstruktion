package N3;

import L.AbstractC0169q;
import N.C0208d;
import N.C0230o;
import N.InterfaceC0225l0;
import com.nanjoran.ilightshow.Services.Palette;
import com.nanjoran.ilightshow.Services.PaletteColor;
import java.util.Iterator;
import p123x.AbstractC1070c;
import p123x.AbstractC1078k;
import p123x.AbstractC1084q;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4142h = 0;
    public final /* synthetic */ Palette i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ F1.I f4143j;

    public Y0(F1.I i, Palette palette) {
        this.f4143j = i;
        this.i = palette;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f4142h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    V.a aVar = Q.f4089f;
                    F1.I i = this.f4143j;
                    AbstractC0169q.b(aVar, null, V.b.c(1157865821, new C0257c(i, 18), c0230o), V.b.c(967582406, new C0284p0(this.i, 3, i), c0230o), null, null, c0230o, 3462, 114);
                }
                break;
            default:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    Z.l lVar = Z.l.f5957a;
                    long j4 = p035g0.r.f9077c;
                    W2.g gVar = p035g0.H.f9016a;
                    Z.o oVarB = androidx.compose.foundation.a.b(lVar, j4, gVar);
                    p113v0.F fE = AbstractC1084q.e(Z.b.f5933h, false);
                    int i3 = c0230o2.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M = c0230o2.m();
                    Z.o oVarC = Z.a.c(c0230o2, oVarB);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n = C1101i.f14038b;
                    c0230o2.Z();
                    if (c0230o2.f3743O) {
                        c0230o2.l(c1106n);
                    } else {
                        c0230o2.i0();
                    }
                    C1100h c1100h = C1101i.f14041e;
                    C0208d.R(c1100h, c0230o2, fE);
                    C1100h c1100h2 = C1101i.f14040d;
                    C0208d.R(c1100h2, c0230o2, interfaceC0225l0M);
                    C1100h c1100h3 = C1101i.f14042f;
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i3))) {
                        p012c.k.y(i3, c0230o2, i3, c1100h3);
                    }
                    C1100h c1100h4 = C1101i.f14039c;
                    C0208d.R(c1100h4, c0230o2, oVarC);
                    Z.f fVar = Z.b.f5942r;
                    p123x.U uA = p123x.T.a(AbstractC1078k.f13777a, fVar, c0230o2, 48);
                    int i6 = c0230o2.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M2 = c0230o2.m();
                    Z.o oVarC2 = Z.a.c(c0230o2, lVar);
                    c0230o2.Z();
                    if (c0230o2.f3743O) {
                        c0230o2.l(c1106n);
                    } else {
                        c0230o2.i0();
                    }
                    C0208d.R(c1100h, c0230o2, uA);
                    C0208d.R(c1100h2, c0230o2, interfaceC0225l0M2);
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i6))) {
                        p012c.k.y(i6, c0230o2, i6, c1100h3);
                    }
                    C0208d.R(c1100h4, c0230o2, oVarC2);
                    c0230o2.V(-364382218);
                    Palette palette = this.i;
                    Iterator it = p089q4.l.o0(5, palette.getColors()).iterator();
                    while (it.hasNext()) {
                        AbstractC1084q.a(androidx.compose.foundation.a.b(p123x.V.a(androidx.compose.foundation.layout.c.c(lVar, 70), 1.0f), ((PaletteColor) it.next()).m2toAndroidColor0d7_KjU(), gVar), c0230o2, 0);
                    }
                    c0230o2.p(false);
                    c0230o2.p(true);
                    p123x.U uA2 = p123x.T.a(AbstractC1078k.f13777a, fVar, c0230o2, 48);
                    int i7 = c0230o2.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M3 = c0230o2.m();
                    Z.o oVarC3 = Z.a.c(c0230o2, lVar);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n2 = C1101i.f14038b;
                    c0230o2.Z();
                    if (c0230o2.f3743O) {
                        c0230o2.l(c1106n2);
                    } else {
                        c0230o2.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o2, uA2);
                    C0208d.R(C1101i.f14040d, c0230o2, interfaceC0225l0M3);
                    C1100h c1100h5 = C1101i.f14042f;
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i7))) {
                        p012c.k.y(i7, c0230o2, i7, c1100h5);
                    }
                    C0208d.R(C1101i.f14039c, c0230o2, oVarC3);
                    AbstractC1070c.b(c0230o2, p123x.V.a(lVar, 1.0f));
                    L.L.d(new X0(this.f4143j, palette), null, false, null, null, Q.f4088e, c0230o2, 196608, 30);
                    c0230o2.p(true);
                    c0230o2.p(true);
                }
                break;
        }
        return p084p4.x.f10867a;
    }

    public Y0(Palette palette, F1.I i) {
        this.i = palette;
        this.f4143j = i;
    }
}
