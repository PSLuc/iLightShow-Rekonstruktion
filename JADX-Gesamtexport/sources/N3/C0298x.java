package N3;

import L.AbstractC0149j0;
import L.e2;
import N.C0208d;
import N.C0227m0;
import N.C0230o;
import N.InterfaceC0225l0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.R;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.RecurringDays;
import p058l0.C0822e;
import p058l0.C0823f;
import p123x.AbstractC1084q;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: renamed from: N3.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0298x implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4316h;
    public static final C0298x i = new C0298x(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0298x f4299j = new C0298x(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0298x f4300k = new C0298x(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0298x f4301l = new C0298x(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0298x f4302m = new C0298x(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0298x f4303n = new C0298x(5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0298x f4304o = new C0298x(6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0298x f4305p = new C0298x(7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0298x f4306q = new C0298x(8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0298x f4307r = new C0298x(9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0298x f4308s = new C0298x(10);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0298x f4309t = new C0298x(11);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0298x f4310u = new C0298x(12);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0298x f4311v = new C0298x(13);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0298x f4312w = new C0298x(14);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0298x f4313x = new C0298x(15);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0298x f4314y = new C0298x(16);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0298x f4315z = new C0298x(17);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0298x f4291A = new C0298x(18);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0298x f4292B = new C0298x(19);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C0298x f4293C = new C0298x(20);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0298x f4294D = new C0298x(21);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C0298x f4295E = new C0298x(22);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final C0298x f4296F = new C0298x(23);
    public static final C0298x G = new C0298x(24);
    public static final C0298x H = new C0298x(25);
    public static final C0298x I = new C0298x(26);
    public static final C0298x J = new C0298x(27);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final C0298x f4297K = new C0298x(28);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final C0298x f4298L = new C0298x(29);

    public /* synthetic */ C0298x(int i3) {
        this.f4316h = i3;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        p084p4.x xVar = p084p4.x.f10867a;
        switch (this.f4316h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.brightness_title, c0230o), null, 0L, com.fasterxml.jackson.databind.deser.std.d0.q(24), L0.k.f3027l, 0L, null, 0L, 0, false, 0, 0, null, c0230o, 199680, 0, 131030);
                }
                break;
            case 1:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    AbstractC0149j0.b(p006b.a.u(), AbstractC0599v0.K(R.string.action_back, c0230o2), null, 0L, c0230o2, 0, 12);
                }
                break;
            case 2:
                C0230o c0230o3 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o3.B()) {
                    c0230o3.P();
                } else {
                    Z.l lVar = Z.l.f5957a;
                    p113v0.F fE = AbstractC1084q.e(Z.b.f5933h, false);
                    int i3 = c0230o3.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M = c0230o3.m();
                    Z.o oVarC = Z.a.c(c0230o3, lVar);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n = C1101i.f14038b;
                    c0230o3.Z();
                    if (c0230o3.f3743O) {
                        c0230o3.l(c1106n);
                    } else {
                        c0230o3.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o3, fE);
                    C0208d.R(C1101i.f14040d, c0230o3, interfaceC0225l0M);
                    C1100h c1100h = C1101i.f14042f;
                    if (c0230o3.f3743O || !E4.k.a(c0230o3.K(), Integer.valueOf(i3))) {
                        p012c.k.y(i3, c0230o3, i3, c1100h);
                    }
                    C0208d.R(C1101i.f14039c, c0230o3, oVarC);
                    G4.a.a(androidx.compose.foundation.layout.b.f6633a.b(), new defpackage.d(3), c0230o3, 48);
                    C0823f c0823fB = p006b.a.f7020j;
                    if (c0823fB == null) {
                        C0822e c0822e = new C0822e("Filled.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i6 = p058l0.G.f10217a;
                        p035g0.O o6 = new p035g0.O(p035g0.r.f9076b);
                        C0227m0 c0227m0 = new C0227m0(2);
                        c0227m0.i(6.0f, 19.0f);
                        c0227m0.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        c0227m0.f(8.0f);
                        c0227m0.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        c0227m0.m(7.0f);
                        c0227m0.e(6.0f);
                        c0227m0.n(12.0f);
                        c0227m0.b();
                        c0227m0.i(19.0f, 4.0f);
                        c0227m0.f(-3.5f);
                        c0227m0.h(-1.0f, -1.0f);
                        c0227m0.f(-5.0f);
                        c0227m0.h(-1.0f, 1.0f);
                        c0227m0.e(5.0f);
                        c0227m0.n(2.0f);
                        c0227m0.f(14.0f);
                        c0227m0.m(4.0f);
                        c0227m0.b();
                        C0822e.a(c0822e, c0227m0.f3729h, o6);
                        c0823fB = c0822e.b();
                        p006b.a.f7020j = c0823fB;
                    }
                    AbstractC0149j0.b(c0823fB, AbstractC0599v0.K(R.string.action_delete, c0230o3), null, p035g0.r.f9080f, c0230o3, 3072, 4);
                    c0230o3.p(true);
                }
                break;
            case 3:
                C0230o c0230o4 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o4.B()) {
                    c0230o4.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.delay_title, c0230o4), null, 0L, com.fasterxml.jackson.databind.deser.std.d0.q(24), L0.k.f3027l, 0L, null, 0L, 0, false, 0, 0, null, c0230o4, 199680, 0, 131030);
                }
                break;
            case 4:
                C0230o c0230o5 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o5.B()) {
                    c0230o5.P();
                } else {
                    AbstractC0149j0.b(p006b.a.u(), AbstractC0599v0.K(R.string.action_back, c0230o5), null, 0L, c0230o5, 0, 12);
                }
                break;
            case 5:
                C0230o c0230o6 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o6.B()) {
                    c0230o6.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.devices_delete_title, c0230o6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o6, 0, 0, 131070);
                }
                break;
            case 6:
                C0230o c0230o7 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o7.B()) {
                    c0230o7.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.devices_delete_message, c0230o7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o7, 0, 0, 131070);
                }
                break;
            case 7:
                C0230o c0230o8 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o8.B()) {
                    c0230o8.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.devices_add_hue_bridge_title, c0230o8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o8, 0, 0, 131070);
                }
                break;
            case 8:
                C0230o c0230o9 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o9.B()) {
                    c0230o9.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.devices_ip_address_hint, c0230o9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o9, 0, 0, 131070);
                }
                break;
            case 9:
                C0230o c0230o10 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o10.B()) {
                    c0230o10.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.devices_title, c0230o10), null, 0L, com.fasterxml.jackson.databind.deser.std.d0.q(24), L0.k.f3027l, 0L, null, 0L, 0, false, 0, 0, null, c0230o10, 199680, 0, 131030);
                }
                break;
            case 10:
                C0230o c0230o11 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o11.B()) {
                    c0230o11.P();
                } else {
                    AbstractC0149j0.b(p006b.a.u(), AbstractC0599v0.K(R.string.action_back, c0230o11), null, 0L, c0230o11, 0, 12);
                }
                break;
            case 11:
                C0230o c0230o12 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o12.B()) {
                    c0230o12.P();
                } else {
                    AbstractC0149j0.b(AbstractC0599v0.x(), AbstractC0599v0.K(R.string.action_add, c0230o12), null, 0L, c0230o12, 0, 12);
                }
                break;
            case 12:
                C0230o c0230o13 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o13.B()) {
                    c0230o13.P();
                } else {
                    AbstractC0149j0.b(S1.h0.o(), AbstractC0599v0.K(R.string.action_delete, c0230o13), null, 0L, c0230o13, 0, 12);
                }
                break;
            case 13:
                C0230o c0230o14 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o14.B()) {
                    c0230o14.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.settings_legacy_mode_warning_title, c0230o14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o14, 0, 0, 131070);
                }
                break;
            case 14:
                C0230o c0230o15 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o15.B()) {
                    c0230o15.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.fx_mode_legacy_warning_message, c0230o15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o15, 0, 0, 131070);
                }
                break;
            case 15:
                C0230o c0230o16 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o16.B()) {
                    c0230o16.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.fx_mode_title, c0230o16), null, 0L, com.fasterxml.jackson.databind.deser.std.d0.q(24), L0.k.f3027l, 0L, null, 0L, 0, false, 0, 0, null, c0230o16, 199680, 0, 131030);
                }
                break;
            case 16:
                C0230o c0230o17 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o17.B()) {
                    c0230o17.P();
                } else {
                    AbstractC0149j0.b(p006b.a.u(), AbstractC0599v0.K(R.string.action_back, c0230o17), null, 0L, c0230o17, 0, 12);
                }
                break;
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                C0230o c0230o18 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o18.B()) {
                    c0230o18.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.fx_size_title, c0230o18), null, 0L, com.fasterxml.jackson.databind.deser.std.d0.q(24), L0.k.f3027l, 0L, null, 0L, 0, false, 0, 0, null, c0230o18, 199680, 0, 131030);
                }
                break;
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                C0230o c0230o19 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o19.B()) {
                    c0230o19.P();
                } else {
                    AbstractC0149j0.b(p006b.a.u(), AbstractC0599v0.K(R.string.action_back, c0230o19), null, 0L, c0230o19, 0, 12);
                }
                break;
            case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                C0230o c0230o20 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o20.B()) {
                    c0230o20.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.intensity_title, c0230o20), null, 0L, com.fasterxml.jackson.databind.deser.std.d0.q(24), L0.k.f3027l, 0L, null, 0L, 0, false, 0, 0, null, c0230o20, 199680, 0, 131030);
                }
                break;
            case 20:
                C0230o c0230o21 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o21.B()) {
                    c0230o21.P();
                } else {
                    AbstractC0149j0.b(p006b.a.u(), AbstractC0599v0.K(R.string.action_back, c0230o21), null, 0L, c0230o21, 0, 12);
                }
                break;
            case 21:
                C0230o c0230o22 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o22.B()) {
                    c0230o22.P();
                } else {
                    AbstractC0149j0.b(p006b.a.u(), AbstractC0599v0.K(R.string.action_back, c0230o22), null, 0L, c0230o22, 0, 12);
                }
                break;
            case 22:
                C0230o c0230o23 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o23.B()) {
                    c0230o23.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.light_details_room_override, c0230o23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o23, 0, 0, 131070);
                }
                break;
            case 23:
                C0230o c0230o24 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o24.B()) {
                    c0230o24.P();
                } else {
                    AbstractC0149j0.b(p006b.a.u(), AbstractC0599v0.K(R.string.action_back, c0230o24), null, 0L, c0230o24, 0, 12);
                }
                break;
            case 24:
                C0230o c0230o25 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o25.B()) {
                    c0230o25.P();
                } else {
                    C0823f c0823fB2 = p027e3.a.f8735e;
                    if (c0823fB2 == null) {
                        C0822e c0822e2 = new C0822e("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i7 = p058l0.G.f10217a;
                        p035g0.O o7 = new p035g0.O(p035g0.r.f9076b);
                        C0227m0 c0227m1 = new C0227m0(2);
                        c0227m1.i(19.14f, 12.94f);
                        c0227m1.d(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
                        c0227m1.d(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
                        c0227m1.h(2.03f, -1.58f);
                        c0227m1.d(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
                        c0227m1.h(-1.92f, -3.32f);
                        c0227m1.d(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
                        c0227m1.h(-2.39f, 0.96f);
                        c0227m1.d(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
                        c0227m1.g(14.4f, 2.81f);
                        c0227m1.d(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
                        c0227m1.f(-3.84f);
                        c0227m1.d(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
                        c0227m1.g(9.25f, 5.35f);
                        c0227m1.c(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
                        c0227m1.g(5.24f, 5.33f);
                        c0227m1.d(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
                        c0227m1.g(2.74f, 8.87f);
                        c0227m1.c(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
                        c0227m1.h(2.03f, 1.58f);
                        c0227m1.c(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
                        c0227m1.k(0.02f, 0.64f, 0.07f, 0.94f);
                        c0227m1.h(-2.03f, 1.58f);
                        c0227m1.d(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
                        c0227m1.h(1.92f, 3.32f);
                        c0227m1.d(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
                        c0227m1.h(2.39f, -0.96f);
                        c0227m1.d(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
                        c0227m1.h(0.36f, 2.54f);
                        c0227m1.d(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
                        c0227m1.f(3.84f);
                        c0227m1.d(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
                        c0227m1.h(0.36f, -2.54f);
                        c0227m1.d(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
                        c0227m1.h(2.39f, 0.96f);
                        c0227m1.d(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
                        c0227m1.h(1.92f, -3.32f);
                        c0227m1.d(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
                        c0227m1.g(19.14f, 12.94f);
                        c0227m1.b();
                        c0227m1.i(12.0f, 15.6f);
                        c0227m1.d(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
                        c0227m1.k(1.62f, -3.6f, 3.6f, -3.6f);
                        c0227m1.k(3.6f, 1.62f, 3.6f, 3.6f);
                        c0227m1.j(13.98f, 15.6f, 12.0f, 15.6f);
                        c0227m1.b();
                        C0822e.a(c0822e2, c0227m1.f3729h, o7);
                        c0823fB2 = c0822e2.b();
                        p027e3.a.f8735e = c0823fB2;
                    }
                    AbstractC0149j0.b(c0823fB2, AbstractC0599v0.K(R.string.devices_title, c0230o25), null, 0L, c0230o25, 0, 12);
                }
                break;
            case 25:
                C0230o c0230o26 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o26.B()) {
                    c0230o26.P();
                } else {
                    S1.V.d(com.fasterxml.jackson.databind.deser.std.d0.z(R.drawable.ic_lighticonblue, c0230o26), AbstractC0599v0.K(R.string.action_selected, c0230o26), null, null, null, 0.0f, null, c0230o26, 8, RecurringDays.RECURRING_WEEKDAYS);
                }
                break;
            case 26:
                C0230o c0230o27 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o27.B()) {
                    c0230o27.P();
                } else {
                    S1.V.d(com.fasterxml.jackson.databind.deser.std.d0.z(R.drawable.ic_lighticongray, c0230o27), AbstractC0599v0.K(R.string.action_selected, c0230o27), null, null, null, 0.0f, null, c0230o27, 8, RecurringDays.RECURRING_WEEKDAYS);
                }
                break;
            case 27:
                C0230o c0230o28 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o28.B()) {
                    c0230o28.P();
                } else {
                    C0823f c0823fB3 = G4.a.f1689b;
                    if (c0823fB3 == null) {
                        C0822e c0822e3 = new C0822e("Filled.MoreHoriz", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i8 = p058l0.G.f10217a;
                        p035g0.O o8 = new p035g0.O(p035g0.r.f9076b);
                        C0227m0 c0227m2 = new C0227m0(2);
                        c0227m2.i(6.0f, 10.0f);
                        c0227m2.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        c0227m2.k(0.9f, 2.0f, 2.0f, 2.0f);
                        c0227m2.k(2.0f, -0.9f, 2.0f, -2.0f);
                        c0227m2.k(-0.9f, -2.0f, -2.0f, -2.0f);
                        c0227m2.b();
                        c0227m2.i(18.0f, 10.0f);
                        c0227m2.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        c0227m2.k(0.9f, 2.0f, 2.0f, 2.0f);
                        c0227m2.k(2.0f, -0.9f, 2.0f, -2.0f);
                        c0227m2.k(-0.9f, -2.0f, -2.0f, -2.0f);
                        c0227m2.b();
                        c0227m2.i(12.0f, 10.0f);
                        c0227m2.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        c0227m2.k(0.9f, 2.0f, 2.0f, 2.0f);
                        c0227m2.k(2.0f, -0.9f, 2.0f, -2.0f);
                        c0227m2.k(-0.9f, -2.0f, -2.0f, -2.0f);
                        c0227m2.b();
                        C0822e.a(c0822e3, c0227m2.f3729h, o8);
                        c0823fB3 = c0822e3.b();
                        G4.a.f1689b = c0823fB3;
                    }
                    AbstractC0149j0.b(c0823fB3, AbstractC0599v0.K(R.string.action_more, c0230o28), null, 0L, c0230o28, 0, 12);
                }
                break;
            case 28:
                C0230o c0230o29 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o29.B()) {
                    c0230o29.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.lights_more_than_10_title, c0230o29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o29, 0, 0, 131070);
                }
                break;
            default:
                C0230o c0230o30 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o30.B()) {
                    c0230o30.P();
                } else {
                    e2.b(AbstractC0599v0.K(R.string.lights_more_than_10_message, c0230o30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o30, 0, 0, 131070);
                }
                break;
        }
        return xVar;
    }
}
