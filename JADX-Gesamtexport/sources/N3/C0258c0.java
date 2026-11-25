package N3;

import L.J1;
import L.e2;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.InterfaceC0203a0;
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

/* JADX INFO: renamed from: N3.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0258c0 implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4158h;
    public final /* synthetic */ InterfaceC0203a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f4160k;

    public /* synthetic */ C0258c0(int i, InterfaceC0203a0 interfaceC0203a0, Object obj, Object obj2) {
        this.f4158h = i;
        this.i = interfaceC0203a0;
        this.f4159j = obj;
        this.f4160k = obj2;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f4158h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    c0230o.V(1737125371);
                    Object objK = c0230o.K();
                    if (objK == C0222k.f3714a) {
                        objK = new C0256b0(this.i, (InterfaceC0203a0) this.f4159j, (InterfaceC0203a0) this.f4160k, 0);
                        c0230o.f0(objK);
                    }
                    c0230o.p(false);
                    L.L.a((D4.a) objK, null, false, null, null, null, null, null, C.f3927a, c0230o, 805306374, 510);
                }
                break;
            case 1:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    c0230o2.V(-1983698970);
                    Object objK2 = c0230o2.K();
                    if (objK2 == C0222k.f3714a) {
                        objK2 = new C0256b0(this.i, (InterfaceC0203a0) this.f4159j, (InterfaceC0203a0) this.f4160k, 1);
                        c0230o2.f0(objK2);
                    }
                    c0230o2.p(false);
                    L.L.a((D4.a) objK2, null, false, null, null, null, null, null, U.f4113a, c0230o2, 805306374, 510);
                }
                break;
            default:
                C0230o c0230o3 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o3.B()) {
                    c0230o3.P();
                } else {
                    Z.f fVar = Z.b.f5942r;
                    Z.l lVar = Z.l.f5957a;
                    float f6 = 16;
                    Z.o oVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.c(lVar, 54), f6, 0.0f, f6, 0.0f, 10);
                    p123x.U uA = p123x.T.a(AbstractC1078k.f13777a, fVar, c0230o3, 48);
                    int i = c0230o3.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M = c0230o3.m();
                    Z.o oVarC = Z.a.c(c0230o3, oVarK);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n = C1101i.f14038b;
                    c0230o3.Z();
                    if (c0230o3.f3743O) {
                        c0230o3.l(c1106n);
                    } else {
                        c0230o3.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o3, uA);
                    C0208d.R(C1101i.f14040d, c0230o3, interfaceC0225l0M);
                    C1100h c1100h = C1101i.f14042f;
                    if (c0230o3.f3743O || !E4.k.a(c0230o3.K(), Integer.valueOf(i))) {
                        p012c.k.y(i, c0230o3, i, c1100h);
                    }
                    C0208d.R(C1101i.f14039c, c0230o3, oVarC);
                    e2.b(AbstractC0599v0.K(R.string.microphone_enable, c0230o3), lVar, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o3, 48, 0, 131068);
                    AbstractC1070c.b(c0230o3, p123x.V.a(lVar, 1.0f));
                    InterfaceC0203a0 interfaceC0203a0 = this.i;
                    J1.a(((Boolean) interfaceC0203a0.getValue()).booleanValue(), new C0271j(3, interfaceC0203a0, (G2.a) this.f4159j, (p018d.g) this.f4160k), null, false, null, null, c0230o3, 0, RecurringDays.RECURRING_WEEKDAYS);
                    c0230o3.p(true);
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}
