package G0;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final J f1471d = new J(0, 0, null, 0, 0, 0, 16777215);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f1472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f1473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f1474c;

    public J(C c6, t tVar, x xVar) {
        this.f1472a = c6;
        this.f1473b = tVar;
        this.f1474c = xVar;
    }

    public static J a(J j4, long j6, long j7, L0.k kVar, L0.p pVar, long j8, long j9, R0.g gVar, int i) {
        R0.n cVar;
        x xVar = L.L.f2394a;
        long jA = (i & 1) != 0 ? j4.f1472a.f1428a.a() : j6;
        long j10 = (i & 2) != 0 ? j4.f1472a.f1429b : j7;
        L0.k kVar2 = (i & 4) != 0 ? j4.f1472a.f1430c : kVar;
        C c6 = j4.f1472a;
        L0.i iVar = c6.f1431d;
        L0.j jVar = c6.f1432e;
        L0.p pVar2 = (i & 32) != 0 ? c6.f1433f : pVar;
        String str = c6.f1434g;
        long j11 = (i & 128) != 0 ? c6.f1435h : j8;
        R0.a aVar = c6.i;
        R0.o oVar = c6.f1436j;
        N0.b bVar = c6.f1437k;
        long j12 = c6.f1438l;
        R0.j jVar2 = c6.f1439m;
        p035g0.L l6 = c6.f1440n;
        p044i0.e eVar = c6.f1442p;
        t tVar = j4.f1473b;
        int i3 = tVar.f1537a;
        int i6 = tVar.f1538b;
        long j13 = (i & 131072) != 0 ? tVar.f1539c : j9;
        R0.p pVar3 = tVar.f1540d;
        x xVar2 = (i & 524288) != 0 ? j4.f1474c : xVar;
        R0.g gVar2 = (i & 1048576) != 0 ? tVar.f1542f : gVar;
        int i7 = tVar.f1543g;
        int i8 = tVar.f1544h;
        R0.q qVar = tVar.i;
        if (p035g0.r.c(jA, c6.f1428a.a())) {
            cVar = c6.f1428a;
        } else {
            cVar = jA != 16 ? new R0.c(jA) : R0.l.f4751a;
        }
        return new J(new C(cVar, j10, kVar2, iVar, jVar, pVar2, str, j11, aVar, oVar, bVar, j12, jVar2, l6, xVar2 != null ? xVar2.f1550a : null, eVar), new t(i3, i6, j13, pVar3, xVar2 != null ? xVar2.f1551b : null, gVar2, i7, i8, qVar), xVar2);
    }

    public static J e(J j4, long j6, long j7, L0.k kVar, long j8, int i, long j9, int i3) {
        long j10 = (i3 & 2) != 0 ? S0.m.f4901c : j7;
        L0.k kVar2 = (i3 & 4) != 0 ? null : kVar;
        long j11 = (i3 & 128) != 0 ? S0.m.f4901c : j8;
        long j12 = p035g0.r.f9085l;
        int i6 = (32768 & i3) != 0 ? Integer.MIN_VALUE : i;
        long j13 = (i3 & 131072) != 0 ? S0.m.f4901c : j9;
        C cA = D.a(j4.f1472a, j6, null, Float.NaN, j10, kVar2, null, null, null, null, j11, null, null, null, j12, null, null, null, null);
        t tVarA = u.a(j4.f1473b, i6, Integer.MIN_VALUE, j13, null, null, null, 0, Integer.MIN_VALUE, null);
        return (j4.f1472a == cA && j4.f1473b == tVarA) ? j4 : new J(cA, tVarA);
    }

    public final long b() {
        return this.f1472a.f1428a.a();
    }

    public final boolean c(J j4) {
        if (this != j4) {
            return E4.k.a(this.f1473b, j4.f1473b) && this.f1472a.a(j4.f1472a);
        }
        return true;
    }

    public final J d(J j4) {
        return (j4 == null || j4.equals(f1471d)) ? this : new J(this.f1472a.c(j4.f1472a), this.f1473b.a(j4.f1473b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j4 = (J) obj;
        return E4.k.a(this.f1472a, j4.f1472a) && E4.k.a(this.f1473b, j4.f1473b) && E4.k.a(this.f1474c, j4.f1474c);
    }

    public final int hashCode() {
        int iHashCode = (this.f1473b.hashCode() + (this.f1472a.hashCode() * 31)) * 31;
        x xVar = this.f1474c;
        return iHashCode + (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) p035g0.r.i(b()));
        sb.append(", brush=");
        C c6 = this.f1472a;
        sb.append(c6.f1428a.b());
        sb.append(", alpha=");
        sb.append(c6.f1428a.c());
        sb.append(", fontSize=");
        sb.append((Object) S0.m.d(c6.f1429b));
        sb.append(", fontWeight=");
        sb.append(c6.f1430c);
        sb.append(", fontStyle=");
        sb.append(c6.f1431d);
        sb.append(", fontSynthesis=");
        sb.append(c6.f1432e);
        sb.append(", fontFamily=");
        sb.append(c6.f1433f);
        sb.append(", fontFeatureSettings=");
        sb.append(c6.f1434g);
        sb.append(", letterSpacing=");
        sb.append((Object) S0.m.d(c6.f1435h));
        sb.append(", baselineShift=");
        sb.append(c6.i);
        sb.append(", textGeometricTransform=");
        sb.append(c6.f1436j);
        sb.append(", localeList=");
        sb.append(c6.f1437k);
        sb.append(", background=");
        p012c.k.z(c6.f1438l, sb, ", textDecoration=");
        sb.append(c6.f1439m);
        sb.append(", shadow=");
        sb.append(c6.f1440n);
        sb.append(", drawStyle=");
        sb.append(c6.f1442p);
        sb.append(", textAlign=");
        t tVar = this.f1473b;
        sb.append((Object) R0.i.a(tVar.f1537a));
        sb.append(", textDirection=");
        sb.append((Object) R0.k.a(tVar.f1538b));
        sb.append(", lineHeight=");
        sb.append((Object) S0.m.d(tVar.f1539c));
        sb.append(", textIndent=");
        sb.append(tVar.f1540d);
        sb.append(", platformStyle=");
        sb.append(this.f1474c);
        sb.append(", lineHeightStyle=");
        sb.append(tVar.f1542f);
        sb.append(", lineBreak=");
        sb.append((Object) R0.e.a(tVar.f1543g));
        sb.append(", hyphens=");
        sb.append((Object) R0.d.a(tVar.f1544h));
        sb.append(", textMotion=");
        sb.append(tVar.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public J(C c6, t tVar) {
        w wVar = c6.f1441o;
        v vVar = tVar.f1541e;
        this(c6, tVar, (wVar == null && vVar == null) ? null : new x(wVar, vVar));
    }

    public J(long j4, long j6, L0.k kVar, long j7, int i, long j8, int i3) {
        this(new C((i3 & 1) != 0 ? p035g0.r.f9085l : j4, (i3 & 2) != 0 ? S0.m.f4901c : j6, (i3 & 4) != 0 ? null : kVar, (L0.i) null, (L0.j) null, (i3 & 32) != 0 ? null : L0.p.f3031a, (String) null, (i3 & 128) != 0 ? S0.m.f4901c : j7, (R0.a) null, (R0.o) null, (N0.b) null, p035g0.r.f9085l, (R0.j) null, (p035g0.L) null, (w) null), new t((32768 & i3) != 0 ? Integer.MIN_VALUE : i, Integer.MIN_VALUE, (i3 & 131072) != 0 ? S0.m.f4901c : j8, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }
}
