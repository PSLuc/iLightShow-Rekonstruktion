package G0;

import com.philips.lighting.hue.sdk.wrapper.HueLog;
import p035g0.AbstractC0712m;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R0.n f1428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L0.k f1430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L0.i f1431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L0.j f1432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L0.p f1433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f1435h;
    public final R0.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final R0.o f1436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final N0.b f1437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f1438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final R0.j f1439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p035g0.L f1440n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w f1441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p044i0.e f1442p;

    public C(long j4, long j6, L0.k kVar, L0.i iVar, L0.j jVar, L0.p pVar, String str, long j7, R0.a aVar, R0.o oVar, N0.b bVar, long j8, R0.j jVar2, p035g0.L l6, w wVar) {
        this(j4 != 16 ? new R0.c(j4) : R0.l.f4751a, j6, kVar, iVar, jVar, pVar, str, j7, aVar, oVar, bVar, j8, jVar2, l6, wVar, null);
    }

    public final boolean a(C c6) {
        if (this == c6) {
            return true;
        }
        return S0.m.a(this.f1429b, c6.f1429b) && E4.k.a(this.f1430c, c6.f1430c) && E4.k.a(this.f1431d, c6.f1431d) && E4.k.a(this.f1432e, c6.f1432e) && E4.k.a(this.f1433f, c6.f1433f) && E4.k.a(this.f1434g, c6.f1434g) && S0.m.a(this.f1435h, c6.f1435h) && E4.k.a(this.i, c6.i) && E4.k.a(this.f1436j, c6.f1436j) && E4.k.a(this.f1437k, c6.f1437k) && p035g0.r.c(this.f1438l, c6.f1438l) && E4.k.a(this.f1441o, c6.f1441o);
    }

    public final boolean b(C c6) {
        return E4.k.a(this.f1428a, c6.f1428a) && E4.k.a(this.f1439m, c6.f1439m) && E4.k.a(this.f1440n, c6.f1440n) && E4.k.a(this.f1442p, c6.f1442p);
    }

    public final C c(C c6) {
        if (c6 == null) {
            return this;
        }
        R0.n nVar = c6.f1428a;
        return D.a(this, nVar.a(), nVar.b(), nVar.c(), c6.f1429b, c6.f1430c, c6.f1431d, c6.f1432e, c6.f1433f, c6.f1434g, c6.f1435h, c6.i, c6.f1436j, c6.f1437k, c6.f1438l, c6.f1439m, c6.f1440n, c6.f1441o, c6.f1442p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c6 = (C) obj;
        return a(c6) && b(c6);
    }

    public final int hashCode() {
        R0.n nVar = this.f1428a;
        long jA = nVar.a();
        int i = p035g0.r.f9086m;
        int iHashCode = Long.hashCode(jA) * 31;
        AbstractC0712m abstractC0712mB = nVar.b();
        int iHashCode2 = (Float.hashCode(nVar.c()) + ((iHashCode + (abstractC0712mB != null ? abstractC0712mB.hashCode() : 0)) * 31)) * 31;
        S0.n[] nVarArr = S0.m.f4900b;
        int iL = p012c.k.l(iHashCode2, 31, this.f1429b);
        L0.k kVar = this.f1430c;
        int i3 = (iL + (kVar != null ? kVar.f3028h : 0)) * 31;
        L0.i iVar = this.f1431d;
        int iHashCode3 = (i3 + (iVar != null ? Integer.hashCode(iVar.f3023a) : 0)) * 31;
        L0.j jVar = this.f1432e;
        int iHashCode4 = (iHashCode3 + (jVar != null ? Integer.hashCode(jVar.f3024a) : 0)) * 31;
        L0.p pVar = this.f1433f;
        int iHashCode5 = (iHashCode4 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        String str = this.f1434g;
        int iL2 = p012c.k.l((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f1435h);
        R0.a aVar = this.i;
        int iHashCode6 = (iL2 + (aVar != null ? Float.hashCode(aVar.f4730a) : 0)) * 31;
        R0.o oVar = this.f1436j;
        int iHashCode7 = (iHashCode6 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        N0.b bVar = this.f1437k;
        int iL3 = p012c.k.l((iHashCode7 + (bVar != null ? bVar.f3878h.hashCode() : 0)) * 31, 31, this.f1438l);
        R0.j jVar2 = this.f1439m;
        int i6 = (iL3 + (jVar2 != null ? jVar2.f4749a : 0)) * 31;
        p035g0.L l6 = this.f1440n;
        int iHashCode8 = (i6 + (l6 != null ? l6.hashCode() : 0)) * 31;
        w wVar = this.f1441o;
        int iHashCode9 = (iHashCode8 + (wVar != null ? wVar.hashCode() : 0)) * 31;
        p044i0.e eVar = this.f1442p;
        return iHashCode9 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        R0.n nVar = this.f1428a;
        sb.append((Object) p035g0.r.i(nVar.a()));
        sb.append(", brush=");
        sb.append(nVar.b());
        sb.append(", alpha=");
        sb.append(nVar.c());
        sb.append(", fontSize=");
        sb.append((Object) S0.m.d(this.f1429b));
        sb.append(", fontWeight=");
        sb.append(this.f1430c);
        sb.append(", fontStyle=");
        sb.append(this.f1431d);
        sb.append(", fontSynthesis=");
        sb.append(this.f1432e);
        sb.append(", fontFamily=");
        sb.append(this.f1433f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f1434g);
        sb.append(", letterSpacing=");
        sb.append((Object) S0.m.d(this.f1435h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f1436j);
        sb.append(", localeList=");
        sb.append(this.f1437k);
        sb.append(", background=");
        p012c.k.z(this.f1438l, sb, ", textDecoration=");
        sb.append(this.f1439m);
        sb.append(", shadow=");
        sb.append(this.f1440n);
        sb.append(", platformStyle=");
        sb.append(this.f1441o);
        sb.append(", drawStyle=");
        sb.append(this.f1442p);
        sb.append(')');
        return sb.toString();
    }

    public C(R0.n nVar, long j4, L0.k kVar, L0.i iVar, L0.j jVar, L0.p pVar, String str, long j6, R0.a aVar, R0.o oVar, N0.b bVar, long j7, R0.j jVar2, p035g0.L l6, w wVar, p044i0.e eVar) {
        this.f1428a = nVar;
        this.f1429b = j4;
        this.f1430c = kVar;
        this.f1431d = iVar;
        this.f1432e = jVar;
        this.f1433f = pVar;
        this.f1434g = str;
        this.f1435h = j6;
        this.i = aVar;
        this.f1436j = oVar;
        this.f1437k = bVar;
        this.f1438l = j7;
        this.f1439m = jVar2;
        this.f1440n = l6;
        this.f1441o = wVar;
        this.f1442p = eVar;
    }

    public C(long j4, long j6, L0.k kVar, L0.i iVar, L0.j jVar, L0.p pVar, String str, long j7, R0.a aVar, R0.o oVar, N0.b bVar, long j8, R0.j jVar2, p035g0.L l6, int i) {
        this((i & 1) != 0 ? p035g0.r.f9085l : j4, (i & 2) != 0 ? S0.m.f4901c : j6, (i & 4) != 0 ? null : kVar, (i & 8) != 0 ? null : iVar, (i & 16) != 0 ? null : jVar, (i & 32) != 0 ? null : pVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? S0.m.f4901c : j7, (i & HueLog.LogComponent.STREAMDTLS) != 0 ? null : aVar, (i & HueLog.LogComponent.APPCORE) != 0 ? null : oVar, (i & 1024) != 0 ? null : bVar, (i & 2048) != 0 ? p035g0.r.f9085l : j8, (i & 4096) != 0 ? null : jVar2, (i & 8192) != 0 ? null : l6, (w) null);
    }
}
