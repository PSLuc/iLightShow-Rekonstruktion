package v5;

import E4.w;
import E4.x;
import N3.R0;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.nanjoran.ilightshow.Services.T;
import java.net.InetAddress;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import p005a4.C0402j;
import p005a4.C0407o;
import p005a4.J;
import p005a4.N;
import p005a4.O;
import p089q4.u;
import w5.AbstractC1065x;
import w5.B;
import w5.C1049g;
import w5.C1055m;
import w5.C1063v;
import w5.K;
import w5.X;

/* JADX INFO: loaded from: classes.dex */
public final class k extends d0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final d f13325D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ K4.e[] f13326E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final X f13327F;
    public static final w5.d0 G;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p091r0.d f13328A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p091r0.d f13329B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p091r0.d f13330C;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f13331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f13332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f13333m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f13334n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f13335o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Long[] f13336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InetAddress f13337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f13338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p091r0.d f13339s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p091r0.d f13340t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p091r0.d f13341u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p091r0.d f13342v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p091r0.d f13343w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p091r0.d f13344x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p091r0.d f13345y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p091r0.d f13346z;

    static {
        E4.n nVar = new E4.n(k.class, "reachable", "getReachable()Z", 0);
        x.f1075a.getClass();
        f13326E = new K4.e[]{nVar, new E4.n(k.class, "label", "getLabel()Ljava/lang/String;", 0), new E4.n(k.class, "color", "getColor()Lwo/lf/lifx/domain/HSBK;", 0), new E4.n(k.class, "power", "getPower()Lwo/lf/lifx/domain/PowerState;", 0), new E4.n(k.class, "group", "getGroup()Lwo/lf/lifx/domain/StateGroup;", 0), new E4.n(k.class, "location", "getLocation()Lwo/lf/lifx/domain/StateLocation;", 0), new E4.n(k.class, "hostFirmware", "getHostFirmware()Lwo/lf/lifx/api/FirmwareVersion;", 0), new E4.n(k.class, "wifiFirmware", "getWifiFirmware()Lwo/lf/lifx/api/FirmwareVersion;", 0), new E4.n(k.class, "productInfo", "getProductInfo()Lwo/lf/lifx/api/ProductInfo;", 0), new E4.n(k.class, "infraredBrightness", "getInfraredBrightness()S", 0), new E4.n(k.class, "zones", "getZones()Lwo/lf/lifx/api/Zones;", 0)};
        f13325D = new d();
        Byte[] bArr = new Byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) 48;
        }
        X x6 = new X();
        x6.f13550a = bArr;
        x6.f13551b = new byte[0];
        x6.f13552c = 0L;
        f13327F = x6;
        Byte[] bArr2 = new Byte[8];
        for (int i3 = 0; i3 < 8; i3++) {
            bArr2[i3] = (byte) 48;
        }
        w5.d0 d0Var = new w5.d0();
        d0Var.f13578a = bArr2;
        d0Var.f13579b = new byte[0];
        d0Var.f13580c = 0L;
        G = d0Var;
    }

    public k(long j4, q qVar, L3.c cVar) {
        InetAddress inetAddress = x5.a.f14146a;
        C1063v c1063v = AbstractC1065x.f13673a;
        K k3 = K.OFF;
        f13325D.getClass();
        f fVar = f.f13318c;
        s sVar = s.f13372d;
        t tVar = new t(0, u.f11237h);
        E4.k.f("address", inetAddress);
        X x6 = f13327F;
        E4.k.f("group", x6);
        w5.d0 d0Var = G;
        E4.k.f("location", d0Var);
        d dVar = d.f13308b;
        E4.k.f("source", qVar);
        E4.k.f("sourceChangeDispatcher", cVar);
        this.f13331k = j4;
        this.f13332l = qVar;
        this.f13333m = dVar;
        G4.a.z(new R0(6, this));
        d0.v(this);
        this.f13334n = new j(cVar);
        this.f13335o = new LinkedHashMap();
        Long[] lArr = new Long[80];
        for (int i = 0; i < 80; i++) {
            lArr[i] = 0L;
        }
        this.f13336p = lArr;
        this.f13337q = inetAddress;
        this.f13338r = 0L;
        this.f13339s = new p091r0.d(n.f13352k, Boolean.FALSE, this.f13334n);
        this.f13340t = new p091r0.d(n.f13350h, "", this.f13334n);
        this.f13341u = new p091r0.d(n.i, c1063v, this.f13334n);
        this.f13342v = new p091r0.d(n.f13351j, k3, this.f13334n);
        this.f13343w = new p091r0.d(n.f13353l, x6, this.f13334n);
        this.f13344x = new p091r0.d(n.f13354m, d0Var, this.f13334n);
        this.f13345y = new p091r0.d(n.f13355n, fVar, this.f13334n);
        this.f13346z = new p091r0.d(n.f13356o, fVar, this.f13334n);
        this.f13328A = new p091r0.d(n.f13357p, sVar, this.f13334n);
        this.f13329B = new p091r0.d(n.f13358q, (short) 0, this.f13334n);
        this.f13330C = new p091r0.d(n.f13359r, tVar, this.f13334n);
    }

    public final t J() {
        return (t) this.f13330C.h(this, f13326E[10]);
    }

    public final void K() {
        D4.a aVar = null;
        x5.b.c(new p011b4.e(new p022d4.b(new c(this, new B(), aVar, 1)), 1, new a(e.f13313n)));
        K4.e[] eVarArr = f13326E;
        K4.e eVar = eVarArr[8];
        p091r0.d dVar = this.f13328A;
        if (s.f13373e.contains(Integer.valueOf(((s) dVar.h(this, eVar)).f13376b))) {
            C1049g c1049g = new C1049g();
            c1049g.f13592a = (byte) 0;
            c1049g.f13593b = (byte) 255;
            x5.b.c(new p011b4.e(new p022d4.b(new c(this, c1049g, aVar, 1)), 1, new a(e.f13316q)));
        }
        if (s.f13374f.contains(Integer.valueOf(((s) dVar.h(this, eVarArr[8])).f13376b))) {
            C1055m c1055m = new C1055m();
            E4.s sVar = new E4.s();
            sVar.f1070h = false;
            E4.s sVar2 = new E4.s();
            sVar2.f1070h = true;
            w wVar = new w();
            p011b4.e eVar2 = new p011b4.e(new O(new C0402j(new J(new p022d4.b(new c(this, c1055m, aVar, 0)), new a(new T(1, this)), 1), new a(new m(sVar, sVar2, wVar)), 2)), 1, new a(new b(sVar2, wVar, 1)));
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            R3.l lVar = this.f13332l.f13364b;
            W3.b.a("unit is null", timeUnit);
            W3.b.a("scheduler is null", lVar);
            Object eVar3 = new p011b4.e(eVar2, 0, new p011b4.g(Math.max(0L, 100L), lVar));
            x5.b.c(new N(new C0402j(eVar3 instanceof X3.b ? ((X3.b) eVar3).a() : new C0407o(1, eVar3), new J2.b(19, new o(5)), 1)));
        }
    }

    public final void L(K k3) {
        this.f13342v.l(this, f13326E[3], k3);
    }

    public final void M() {
        this.f13339s.l(this, f13326E[0], Boolean.valueOf(this.f13338r > new Date().getTime() - 11000));
    }
}
