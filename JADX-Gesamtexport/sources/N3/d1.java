package N3;

import L.A1;
import L.e2;
import N.C0208d;
import N.C0230o;
import N.InterfaceC0225l0;
import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.R;
import com.nanjoran.ilightshow.Services.AbstractC0697x;
import com.nanjoran.ilightshow.Services.AbstractC0698y;
import com.nanjoran.ilightshow.Services.AppConfig;
import com.nanjoran.ilightshow.Services.AppConfigWrapper;
import com.nanjoran.ilightshow.Services.C0691q;
import com.nanjoran.ilightshow.Services.EntitlementQuotaConfig;
import com.nanjoran.ilightshow.Services.EntitlementsConfig;
import p123x.AbstractC1070c;
import p123x.AbstractC1078k;
import p123x.AbstractC1088v;
import p123x.C1069b;
import p123x.C1071d;
import p123x.C1090x;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f4163h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ F1.I f4164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f4165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f4166l;

    public d1(boolean z5, boolean z6, F1.I i, Context context, String str) {
        this.f4163h = z5;
        this.i = z6;
        this.f4164j = i;
        this.f4165k = context;
        this.f4166l = str;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0425 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0427  */
    /* JADX WARN: Code duplicated, block: B:72:0x0470  */
    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z5;
        float f6;
        C1071d c1071d;
        Z.l lVar;
        Z.e eVar;
        boolean z6;
        int i;
        C0230o c0230o;
        AppConfig config;
        EntitlementsConfig entitlements;
        EntitlementQuotaConfig quota;
        Integer advancedSecondsPerPeriod;
        int i3;
        C0230o c0230o2;
        int i6;
        C0230o c0230o3;
        C0230o c0230o4;
        C0230o c0230o5;
        p123x.O o6 = (p123x.O) obj;
        C0230o c0230o6 = (C0230o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        E4.k.f("innerPadding", o6);
        if ((iIntValue & 14) == 0) {
            iIntValue |= c0230o6.f(o6) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && c0230o6.B()) {
            c0230o6.P();
        } else {
            Z.l lVar2 = Z.l.f5957a;
            float f7 = 16;
            Z.o oVarG = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.f(com.fasterxml.jackson.databind.deser.std.d0.G(), o6), f7);
            C1071d c1071d2 = AbstractC1078k.f13779c;
            Z.e eVar2 = Z.b.f5943s;
            C1090x c1090xA = AbstractC1088v.a(c1071d2, eVar2, c0230o6, 0);
            int iE = C0208d.E(c0230o6);
            InterfaceC0225l0 interfaceC0225l0X = c0230o6.x();
            Z.o oVarC = Z.a.c(c0230o6, oVarG);
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106nA = C1101i.a();
            c0230o6.Z();
            if (c0230o6.A()) {
                c0230o6.l(c1106nA);
            } else {
                c0230o6.i0();
            }
            C0208d.R(C1101i.c(), c0230o6, c1090xA);
            C0208d.R(C1101i.e(), c0230o6, interfaceC0225l0X);
            C1100h c1100hB = C1101i.b();
            if (c0230o6.A() || !E4.k.a(c0230o6.K(), Integer.valueOf(iE))) {
                p012c.k.y(iE, c0230o6, iE, c1100hB);
            }
            C0208d.R(C1101i.d(), c0230o6, oVarC);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
            }
            Z.o oVarA = S1.h0.A(new LayoutWeightElement(1.0f, true), S1.h0.v(c0230o6));
            C1090x c1090xA2 = AbstractC1088v.a(AbstractC1078k.g(f7), eVar2, c0230o6, 6);
            int iE2 = C0208d.E(c0230o6);
            InterfaceC0225l0 interfaceC0225l0X2 = c0230o6.x();
            Z.o oVarC2 = Z.a.c(c0230o6, oVarA);
            C1106n c1106nA2 = C1101i.a();
            c0230o6.Z();
            if (c0230o6.A()) {
                c0230o6.l(c1106nA2);
            } else {
                c0230o6.i0();
            }
            C0208d.R(C1101i.c(), c0230o6, c1090xA2);
            C0208d.R(C1101i.e(), c0230o6, interfaceC0225l0X2);
            C1100h c1100hB2 = C1101i.b();
            if (c0230o6.A() || !E4.k.a(c0230o6.K(), Integer.valueOf(iE2))) {
                p012c.k.y(iE2, c0230o6, iE2, c1100hB2);
            }
            C0208d.R(C1101i.d(), c0230o6, oVarC2);
            com.nanjoran.ilightshow.Services.E0 e6 = com.nanjoran.ilightshow.Services.E0.f8249o;
            AbstractC0698y.g().getClass();
            boolean zD = com.nanjoran.ilightshow.Services.E0.d();
            boolean z7 = this.f4163h;
            boolean z8 = this.i;
            if (zD) {
                c0230o6.V(-641889228);
                String strK = AbstractC0599v0.K(R.string.paywall_welcome_v3, c0230o6);
                G0.J j4 = new G0.J(0L, com.fasterxml.jackson.databind.deser.std.d0.q(24), null, 0L, 0, 0L, 16777213);
                L0.k kVar = L0.k.i;
                f6 = f7;
                c1071d = c1071d2;
                lVar = lVar2;
                i = 16;
                z6 = z7;
                z5 = z8;
                eVar = eVar2;
                e2.b(strK, null, 0L, 0L, S1.V.z(), 0L, null, 0L, 0, false, 0, 0, j4, c0230o6, 196608, 1572864, 65502);
                c0230o = c0230o6;
                c0230o.s();
            } else {
                z5 = z8;
                f6 = f7;
                c1071d = c1071d2;
                lVar = lVar2;
                eVar = eVar2;
                z6 = z7;
                i = 16;
                if (z6) {
                    c0230o6.V(-641674677);
                    e2.b(AbstractC0599v0.K(R.string.paywall_trial_ended_title, c0230o6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, new G0.J(0L, com.fasterxml.jackson.databind.deser.std.d0.q(24), null, 0L, 0, 0L, 16777213), c0230o6, 0, 1572864, 65534);
                    c0230o = c0230o6;
                    c0230o.s();
                } else if (z5) {
                    c0230o6.V(-641487468);
                    String strK2 = AbstractC0599v0.K(R.string.paywall_welcome_v3, c0230o6);
                    G0.J j6 = new G0.J(0L, com.fasterxml.jackson.databind.deser.std.d0.q(24), null, 0L, 0, 0L, 16777213);
                    L0.k kVar2 = L0.k.i;
                    e2.b(strK2, null, 0L, 0L, S1.V.z(), 0L, null, 0L, 0, false, 0, 0, j6, c0230o6, 196608, 1572864, 65502);
                    c0230o = c0230o6;
                    c0230o.s();
                } else if (AbstractC0698y.g().a() == com.nanjoran.ilightshow.Services.F0.STARTER_PACK) {
                    c0230o6.V(-641233454);
                    e2.b(AbstractC0599v0.K(R.string.paywall_upgrade_v3, c0230o6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, new G0.J(0L, com.fasterxml.jackson.databind.deser.std.d0.q(24), null, 0L, 0, 0L, 16777213), c0230o6, 0, 1572864, 65534);
                    c0230o = c0230o6;
                    c0230o.s();
                } else {
                    c0230o6.V(-641070332);
                    e2.b(AbstractC0599v0.K(R.string.paywall_sync_more_lights_fx_plus, c0230o6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, new G0.J(0L, com.fasterxml.jackson.databind.deser.std.d0.q(24), null, 0L, 0, 0L, 16777213), c0230o6, 0, 1572864, 65534);
                    c0230o = c0230o6;
                    c0230o.s();
                }
            }
            AbstractC0698y.g().getClass();
            if (com.nanjoran.ilightshow.Services.E0.d()) {
                c0230o.V(-640830640);
                C0230o c0230o7 = c0230o;
                e2.b(AbstractC0599v0.K(R.string.paywall_beta_message, c0230o), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, new G0.J(0L, com.fasterxml.jackson.databind.deser.std.d0.q(i), null, 0L, 0, 0L, 16777213), c0230o7, 0, 1572864, 65534);
                c0230o = c0230o7;
                c0230o.s();
            } else if (AbstractC0698y.g().a() == com.nanjoran.ilightshow.Services.F0.STARTER_PACK) {
                c0230o.V(-640603379);
                C0230o c0230o8 = c0230o;
                e2.b(AbstractC0599v0.K(R.string.paywall_starter_message, c0230o), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, new G0.J(0L, com.fasterxml.jackson.databind.deser.std.d0.q(i), null, 0L, 0, 0L, 16777213), c0230o8, 0, 1572864, 65534);
                c0230o = c0230o8;
                c0230o.s();
            } else if (z5) {
                com.nanjoran.ilightshow.Services.F0 f0A = AbstractC0698y.g().a();
                com.nanjoran.ilightshow.Services.F0.i.getClass();
                if (f0A != C0691q.c() && !z6) {
                    c0230o.V(-640336438);
                    AppConfigWrapper appConfigWrapperA = AbstractC0697x.a();
                    C0230o c0230o9 = c0230o;
                    e2.b(AbstractC0599v0.L(R.string.paywall_free_trial_message, new Object[]{Integer.valueOf(((appConfigWrapperA == null || (config = appConfigWrapperA.getConfig()) == null || (entitlements = config.getEntitlements()) == null || (quota = entitlements.getQuota()) == null || (advancedSecondsPerPeriod = quota.getAdvancedSecondsPerPeriod()) == null) ? 1200 : advancedSecondsPerPeriod.intValue()) / 60)}, c0230o), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, new G0.J(0L, com.fasterxml.jackson.databind.deser.std.d0.q(i), null, 0L, 0, 0L, 16777213), c0230o9, 0, 1572864, 65534);
                    c0230o = c0230o9;
                    c0230o.s();
                } else if (z6) {
                    c0230o.V(-640112215);
                    C0230o c0230o10 = c0230o;
                    e2.b(AbstractC0599v0.K(R.string.paywall_trial_ended_message, c0230o), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, new G0.J(0L, com.fasterxml.jackson.databind.deser.std.d0.q(i), null, 0L, 0, 0L, 16777213), c0230o10, 0, 1572864, 65534);
                    c0230o = c0230o10;
                    c0230o.s();
                } else {
                    c0230o.V(-639951728);
                    c0230o.s();
                }
            } else if (z6) {
                c0230o.V(-640112215);
                C0230o c0230o11 = c0230o;
                e2.b(AbstractC0599v0.K(R.string.paywall_trial_ended_message, c0230o), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, new G0.J(0L, com.fasterxml.jackson.databind.deser.std.d0.q(i), null, 0L, 0, 0L, 16777213), c0230o11, 0, 1572864, 65534);
                c0230o = c0230o11;
                c0230o.s();
            } else {
                c0230o.V(-639951728);
                c0230o.s();
            }
            float f8 = 8;
            Z.o oVarB = androidx.compose.foundation.a.b(com.fasterxml.jackson.databind.deser.std.d0.k(lVar, A.e.a(f8)), m1.c(), p035g0.H.f9016a);
            C1090x c1090xA3 = AbstractC1088v.a(c1071d, eVar, c0230o, 0);
            int iE3 = C0208d.E(c0230o);
            InterfaceC0225l0 interfaceC0225l0X3 = c0230o.x();
            Z.o oVarC3 = Z.a.c(c0230o, oVarB);
            C1106n c1106nA3 = C1101i.a();
            c0230o.Z();
            if (c0230o.A()) {
                c0230o.l(c1106nA3);
            } else {
                c0230o.i0();
            }
            C0208d.R(C1101i.c(), c0230o, c1090xA3);
            C0208d.R(C1101i.e(), c0230o, interfaceC0225l0X3);
            C1100h c1100hB3 = C1101i.b();
            if (c0230o.A() || !E4.k.a(c0230o.K(), Integer.valueOf(iE3))) {
                p012c.k.y(iE3, c0230o, iE3, c1100hB3);
            }
            C0208d.R(C1101i.d(), c0230o, oVarC3);
            Z.f fVar = Z.b.f5942r;
            float f9 = 12;
            Z.o oVarG2 = androidx.compose.foundation.layout.a.g(lVar, f9);
            C1069b c1069b = AbstractC1078k.f13777a;
            p123x.U uA = p123x.T.a(c1069b, fVar, c0230o, 48);
            int iE4 = C0208d.E(c0230o);
            InterfaceC0225l0 interfaceC0225l0X4 = c0230o.x();
            Z.o oVarC4 = Z.a.c(c0230o, oVarG2);
            C1106n c1106nA4 = C1101i.a();
            c0230o.Z();
            if (c0230o.A()) {
                c0230o.l(c1106nA4);
            } else {
                c0230o.i0();
            }
            C0208d.R(C1101i.c(), c0230o, uA);
            C0208d.R(C1101i.e(), c0230o, interfaceC0225l0X4);
            C1100h c1100hB4 = C1101i.b();
            if (c0230o.A() || !E4.k.a(c0230o.K(), Integer.valueOf(iE4))) {
                p012c.k.y(iE4, c0230o, iE4, c1100hB4);
            }
            C0208d.R(C1101i.d(), c0230o, oVarC4);
            C1090x c1090xA4 = AbstractC1088v.a(c1071d, eVar, c0230o, 0);
            int iE5 = C0208d.E(c0230o);
            InterfaceC0225l0 interfaceC0225l0X5 = c0230o.x();
            Z.o oVarC5 = Z.a.c(c0230o, lVar);
            C1106n c1106nA5 = C1101i.a();
            c0230o.Z();
            if (c0230o.A()) {
                c0230o.l(c1106nA5);
            } else {
                c0230o.i0();
            }
            C0208d.R(C1101i.c(), c0230o, c1090xA4);
            C0208d.R(C1101i.e(), c0230o, interfaceC0225l0X5);
            C1100h c1100hB5 = C1101i.b();
            if (c0230o.A() || !E4.k.a(c0230o.K(), Integer.valueOf(iE5))) {
                p012c.k.y(iE5, c0230o, iE5, c1100hB5);
            }
            C0208d.R(C1101i.d(), c0230o, oVarC5);
            String strK3 = AbstractC0599v0.K(R.string.paywall_standard_fx, c0230o);
            long jQ = com.fasterxml.jackson.databind.deser.std.d0.q(i);
            L0.k kVar3 = L0.k.i;
            C0230o c0230o12 = c0230o;
            Z.e eVar3 = eVar;
            C1071d c1071d3 = c1071d;
            e2.b(strK3, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, new G0.J(0L, jQ, S1.V.z(), 0L, 0, 0L, 16777209), c0230o12, 0, 1572864, 65534);
            String strK4 = AbstractC0599v0.K(R.string.paywall_standard_fx_description, c0230o12);
            G0.J j7 = new G0.J(0L, com.fasterxml.jackson.databind.deser.std.d0.q(14), null, 0L, 0, 0L, 16777213);
            int i7 = p035g0.r.f9086m;
            e2.b(strK4, null, Z2.f.k(), 0L, null, 0L, null, 0L, 0, false, 0, 0, j7, c0230o12, 384, 1572864, 65530);
            c0230o12.r();
            AbstractC1070c.b(c0230o12, p123x.V.a(lVar, 1.0f));
            AbstractC0698y.g().getClass();
            if (com.nanjoran.ilightshow.Services.E0.d()) {
                c0230o12.V(1325912550);
                String strK5 = AbstractC0599v0.K(R.string.paywall_free_in_beta, c0230o12);
                long jD = p035g0.H.d(4294954788L);
                L0.k kVarZ = S1.V.z();
                c0230o2 = c0230o12;
                i3 = R.string.paywall_purchased;
                e2.b(strK5, null, jD, 0L, kVarZ, 0L, null, 0L, 0, false, 0, 0, null, c0230o2, 196992, 0, 131034);
                c0230o2.s();
            } else {
                i3 = R.string.paywall_purchased;
                if (AbstractC0698y.g().a() != com.nanjoran.ilightshow.Services.F0.NONE) {
                    c0230o12.V(1326143593);
                    c0230o2 = c0230o12;
                    e2.b(AbstractC0599v0.K(i3, c0230o12), null, p035g0.H.d(4278508340L), 0L, S1.V.z(), 0L, null, 0L, 0, false, 0, 0, null, c0230o2, 196992, 0, 131034);
                    c0230o2.s();
                } else {
                    c0230o12.V(1326316821);
                    c0230o2 = c0230o12;
                    e2.b(AbstractC0599v0.K(R.string.paywall_free, c0230o12), null, Z2.f.k(), 0L, S1.V.z(), 0L, null, 0L, 0, false, 0, 0, null, c0230o2, 196992, 0, 131034);
                    c0230o2.s();
                }
            }
            c0230o2.r();
            float f10 = 1;
            C0230o c0230o13 = c0230o2;
            L.L.c(androidx.compose.foundation.layout.a.i(lVar, f9, 0.0f, 2), f10, p035g0.r.b(0.7f, Z2.f.k()), c0230o13, 438, 0);
            Z.o oVarG3 = androidx.compose.foundation.layout.a.g(lVar, f9);
            p123x.U uA2 = p123x.T.a(c1069b, fVar, c0230o13, 48);
            int iE6 = C0208d.E(c0230o13);
            InterfaceC0225l0 interfaceC0225l0X6 = c0230o13.x();
            Z.o oVarC6 = Z.a.c(c0230o13, oVarG3);
            C1106n c1106nA6 = C1101i.a();
            c0230o13.Z();
            if (c0230o13.A()) {
                c0230o13.l(c1106nA6);
            } else {
                c0230o13.i0();
            }
            C0208d.R(C1101i.c(), c0230o13, uA2);
            C0208d.R(C1101i.e(), c0230o13, interfaceC0225l0X6);
            C1100h c1100hB6 = C1101i.b();
            if (c0230o13.A() || !E4.k.a(c0230o13.K(), Integer.valueOf(iE6))) {
                p012c.k.y(iE6, c0230o13, iE6, c1100hB6);
            }
            C0208d.R(C1101i.d(), c0230o13, oVarC6);
            C1090x c1090xA5 = AbstractC1088v.a(c1071d3, eVar3, c0230o13, 0);
            int iE7 = C0208d.E(c0230o13);
            InterfaceC0225l0 interfaceC0225l0X7 = c0230o13.x();
            Z.o oVarC7 = Z.a.c(c0230o13, lVar);
            C1106n c1106nA7 = C1101i.a();
            c0230o13.Z();
            if (c0230o13.A()) {
                c0230o13.l(c1106nA7);
            } else {
                c0230o13.i0();
            }
            C0208d.R(C1101i.c(), c0230o13, c1090xA5);
            C0208d.R(C1101i.e(), c0230o13, interfaceC0225l0X7);
            C1100h c1100hB7 = C1101i.b();
            if (c0230o13.A() || !E4.k.a(c0230o13.K(), Integer.valueOf(iE7))) {
                p012c.k.y(iE7, c0230o13, iE7, c1100hB7);
            }
            C0208d.R(C1101i.d(), c0230o13, oVarC7);
            e2.b(AbstractC0599v0.K(R.string.paywall_unlimited_lights, c0230o13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, new G0.J(0L, com.fasterxml.jackson.databind.deser.std.d0.q(i), S1.V.z(), 0L, 0, 0L, 16777209), c0230o13, 0, 1572864, 65534);
            e2.b(AbstractC0599v0.K(R.string.paywall_one_for_free, c0230o13), null, Z2.f.k(), 0L, null, 0L, null, 0L, 0, false, 0, 0, new G0.J(0L, com.fasterxml.jackson.databind.deser.std.d0.q(14), null, 0L, 0, 0L, 16777213), c0230o13, 384, 1572864, 65530);
            c0230o13.r();
            AbstractC1070c.b(c0230o13, p123x.V.a(lVar, 1.0f));
            AbstractC0698y.g().getClass();
            if (com.nanjoran.ilightshow.Services.E0.d()) {
                c0230o13.V(1327446182);
                i6 = R.string.paywall_free_in_beta;
                c0230o3 = c0230o13;
                e2.b(AbstractC0599v0.K(R.string.paywall_free_in_beta, c0230o13), null, p035g0.H.d(4294954788L), 0L, S1.V.z(), 0L, null, 0L, 0, false, 0, 0, null, c0230o3, 196992, 0, 131034);
                c0230o3.s();
            } else if (AbstractC0698y.g().a() != com.nanjoran.ilightshow.Services.F0.NONE) {
                c0230o13.V(1327677225);
                String strK6 = AbstractC0599v0.K(i3, c0230o13);
                long jD2 = p035g0.H.d(4278508340L);
                L0.k kVarZ2 = S1.V.z();
                c0230o3 = c0230o13;
                i6 = R.string.paywall_free_in_beta;
                e2.b(strK6, null, jD2, 0L, kVarZ2, 0L, null, 0L, 0, false, 0, 0, null, c0230o3, 196992, 0, 131034);
                c0230o3.s();
            } else {
                i6 = R.string.paywall_free_in_beta;
                c0230o13.V(1327850949);
                c0230o3 = c0230o13;
                e2.b(AbstractC0599v0.K(R.string.main_upgrade_required, c0230o13), null, p035g0.H.d(4294954788L), 0L, S1.V.z(), 0L, null, 0L, 0, false, 0, 0, null, c0230o3, 196992, 0, 131034);
                c0230o3.s();
            }
            c0230o3.r();
            C0230o c0230o14 = c0230o3;
            L.L.c(androidx.compose.foundation.layout.a.i(lVar, f9, 0.0f, 2), f10, p035g0.r.b(0.7f, Z2.f.k()), c0230o14, 438, 0);
            Z.o oVarG4 = androidx.compose.foundation.layout.a.g(lVar, f9);
            p123x.U uA3 = p123x.T.a(c1069b, fVar, c0230o14, 48);
            int iE8 = C0208d.E(c0230o14);
            InterfaceC0225l0 interfaceC0225l0X8 = c0230o14.x();
            Z.o oVarC8 = Z.a.c(c0230o14, oVarG4);
            C1106n c1106nA8 = C1101i.a();
            c0230o14.Z();
            if (c0230o14.A()) {
                c0230o14.l(c1106nA8);
            } else {
                c0230o14.i0();
            }
            C0208d.R(C1101i.c(), c0230o14, uA3);
            C0208d.R(C1101i.e(), c0230o14, interfaceC0225l0X8);
            C1100h c1100hB8 = C1101i.b();
            if (c0230o14.A() || !E4.k.a(c0230o14.K(), Integer.valueOf(iE8))) {
                p012c.k.y(iE8, c0230o14, iE8, c1100hB8);
            }
            C0208d.R(C1101i.d(), c0230o14, oVarC8);
            C1090x c1090xA6 = AbstractC1088v.a(c1071d3, eVar3, c0230o14, 0);
            int iE9 = C0208d.E(c0230o14);
            InterfaceC0225l0 interfaceC0225l0X9 = c0230o14.x();
            Z.o oVarC9 = Z.a.c(c0230o14, lVar);
            C1106n c1106nA9 = C1101i.a();
            c0230o14.Z();
            if (c0230o14.A()) {
                c0230o14.l(c1106nA9);
            } else {
                c0230o14.i0();
            }
            C0208d.R(C1101i.c(), c0230o14, c1090xA6);
            C0208d.R(C1101i.e(), c0230o14, interfaceC0225l0X9);
            C1100h c1100hB9 = C1101i.b();
            if (c0230o14.A() || !E4.k.a(c0230o14.K(), Integer.valueOf(iE9))) {
                p012c.k.y(iE9, c0230o14, iE9, c1100hB9);
            }
            C0208d.R(C1101i.d(), c0230o14, oVarC9);
            e2.b(AbstractC0599v0.K(R.string.paywall_advanced_effects, c0230o14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, new G0.J(0L, com.fasterxml.jackson.databind.deser.std.d0.q(i), S1.V.z(), 0L, 0, 0L, 16777209), c0230o14, 0, 1572864, 65534);
            e2.b(AbstractC0599v0.K(R.string.paywall_new_in_v3, c0230o14), null, Z2.f.k(), 0L, null, 0L, null, 0L, 0, false, 0, 0, new G0.J(0L, com.fasterxml.jackson.databind.deser.std.d0.q(14), null, 0L, 0, 0L, 16777213), c0230o14, 384, 1572864, 65530);
            e2.b(AbstractC0599v0.K(R.string.paywall_advanced_effects_description, c0230o14), null, Z2.f.k(), 0L, null, 0L, null, 0L, 0, false, 0, 0, new G0.J(0L, com.fasterxml.jackson.databind.deser.std.d0.q(14), null, 0L, 0, 0L, 16777213), c0230o14, 384, 1572864, 65530);
            c0230o14.r();
            AbstractC1070c.b(c0230o14, p123x.V.a(lVar, 1.0f));
            C1090x c1090xA7 = AbstractC1088v.a(c1071d3, eVar3, c0230o14, 0);
            int iE10 = C0208d.E(c0230o14);
            InterfaceC0225l0 interfaceC0225l0X10 = c0230o14.x();
            Z.o oVarC10 = Z.a.c(c0230o14, lVar);
            C1106n c1106nA10 = C1101i.a();
            c0230o14.Z();
            if (c0230o14.A()) {
                c0230o14.l(c1106nA10);
            } else {
                c0230o14.i0();
            }
            C0208d.R(C1101i.c(), c0230o14, c1090xA7);
            C0208d.R(C1101i.e(), c0230o14, interfaceC0225l0X10);
            C1100h c1100hB10 = C1101i.b();
            if (c0230o14.A() || !E4.k.a(c0230o14.K(), Integer.valueOf(iE10))) {
                p012c.k.y(iE10, c0230o14, iE10, c1100hB10);
            }
            C0208d.R(C1101i.d(), c0230o14, oVarC10);
            AbstractC0698y.g().getClass();
            if (com.nanjoran.ilightshow.Services.E0.d()) {
                c0230o14.V(986322143);
                e2.b(AbstractC0599v0.K(i6, c0230o14), null, p035g0.H.d(4294954788L), 0L, S1.V.z(), 0L, null, 0L, 0, false, 0, 0, null, c0230o14, 196992, 0, 131034);
                c0230o4 = c0230o14;
                c0230o4.s();
            } else if (AbstractC0698y.g().a() == com.nanjoran.ilightshow.Services.F0.STARTER_PACK) {
                c0230o14.V(986569089);
                e2.b(AbstractC0599v0.K(R.string.paywall_upgrade_v3, c0230o14), null, p035g0.H.d(4294954788L), 0L, S1.V.z(), 0L, null, 0L, 0, false, 0, 0, null, c0230o14, 196992, 0, 131034);
                c0230o4 = c0230o14;
                c0230o4.s();
            } else {
                c0230o14.V(986751710);
                e2.b(AbstractC0599v0.K(R.string.main_upgrade_required, c0230o14), null, p035g0.H.d(4294954788L), 0L, S1.V.z(), 0L, null, 0L, 0, false, 0, 0, null, c0230o14, 196992, 0, 131034);
                c0230o4 = c0230o14;
                c0230o4.s();
            }
            c0230o4.r();
            c0230o4.r();
            c0230o4.r();
            C0230o c0230o15 = c0230o4;
            e2.b(AbstractC0599v0.K(R.string.paywall_comparison_title, c0230o4), androidx.compose.foundation.layout.a.k(lVar, 0.0f, f6, 0.0f, 0.0f, 13), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(i), S1.V.z(), 0L, null, 0L, 0, false, 0, 0, null, c0230o15, 199728, 0, 131028);
            G4.a.b(0, c0230o15);
            c0230o15.r();
            Z.o oVarB2 = androidx.compose.foundation.layout.c.b(lVar);
            C1090x c1090xA8 = AbstractC1088v.a(AbstractC1078k.g(f6), eVar3, c0230o15, 6);
            int iE11 = C0208d.E(c0230o15);
            InterfaceC0225l0 interfaceC0225l0X11 = c0230o15.x();
            Z.o oVarC11 = Z.a.c(c0230o15, oVarB2);
            C1106n c1106nA11 = C1101i.a();
            c0230o15.Z();
            if (c0230o15.A()) {
                c0230o15.l(c1106nA11);
            } else {
                c0230o15.i0();
            }
            C0208d.R(C1101i.c(), c0230o15, c1090xA8);
            C0208d.R(C1101i.e(), c0230o15, interfaceC0225l0X11);
            C1100h c1100hB11 = C1101i.b();
            if (c0230o15.A() || !E4.k.a(c0230o15.K(), Integer.valueOf(iE11))) {
                p012c.k.y(iE11, c0230o15, iE11, c1100hB11);
            }
            C0208d.R(C1101i.d(), c0230o15, oVarC11);
            AbstractC0698y.g().getClass();
            boolean zD2 = com.nanjoran.ilightshow.Services.E0.d();
            F1.I i8 = this.f4164j;
            if (zD2) {
                c0230o15.V(-634449011);
                A1.b(new C0255b(i8, 28), com.fasterxml.jackson.databind.deser.std.d0.k(lVar, A.e.a(f8)), false, null, 0L, 0L, 0.0f, 0.0f, null, S.f4095b, c0230o15, 0, 1020);
                c0230o5 = c0230o15;
                c0230o5.s();
            } else {
                c0230o15.V(-633102061);
                if (!z5 || z6) {
                    c0230o15.V(-631738650);
                    A1.b(new V(this.f4165k, 3), com.fasterxml.jackson.databind.deser.std.d0.k(lVar, A.e.a(f8)), false, null, 0L, 0L, 0.0f, 0.0f, null, V.b.c(-1150548179, new c1(this.f4166l, 0), c0230o15), c0230o15, 0, 1020);
                    c0230o5 = c0230o15;
                    c0230o5.s();
                } else {
                    c0230o15.V(-633163720);
                    A1.b(new C0255b(i8, 29), com.fasterxml.jackson.databind.deser.std.d0.k(lVar, A.e.a(f8)), false, null, 0L, 0L, 0.0f, 0.0f, null, S.f4096c, c0230o15, 0, 1020);
                    c0230o5 = c0230o15;
                    c0230o5.s();
                }
                if (z6) {
                    c0230o5.V(-630312340);
                    C0230o c0230o16 = c0230o5;
                    A1.b(new b1(i8, 0), com.fasterxml.jackson.databind.deser.std.d0.k(lVar, A.e.a(f8)), false, null, 0L, 0L, 0.0f, 0.0f, null, S.f4097d, c0230o16, 0, 1020);
                    c0230o5 = c0230o16;
                    c0230o5.s();
                } else if (z5 && AbstractC0698y.g().a() == com.nanjoran.ilightshow.Services.F0.STARTER_PACK) {
                    c0230o5.V(-628781126);
                    C0230o c0230o17 = c0230o5;
                    A1.b(new b1(i8, 1), com.fasterxml.jackson.databind.deser.std.d0.k(lVar, A.e.a(f8)), false, null, 0L, 0L, 0.0f, 0.0f, null, S.f4098e, c0230o17, 0, 1020);
                    c0230o5 = c0230o17;
                    c0230o5.s();
                } else {
                    c0230o5.V(-627868176);
                    c0230o5.s();
                }
                c0230o5.s();
            }
            c0230o5.r();
            c0230o5.r();
        }
        return p084p4.x.f10867a;
    }
}
