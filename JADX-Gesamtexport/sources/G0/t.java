package G0;

import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R0.p f1540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f1541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final R0.g f1542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1544h;
    public final R0.q i;

    public t(int i, int i3, long j4, R0.p pVar, v vVar, R0.g gVar, int i6, int i7, R0.q qVar) {
        this.f1537a = i;
        this.f1538b = i3;
        this.f1539c = j4;
        this.f1540d = pVar;
        this.f1541e = vVar;
        this.f1542f = gVar;
        this.f1543g = i6;
        this.f1544h = i7;
        this.i = qVar;
        if (S0.m.a(j4, S0.m.f4901c) || S0.m.c(j4) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + S0.m.c(j4) + ')').toString());
    }

    public final t a(t tVar) {
        if (tVar == null) {
            return this;
        }
        return u.a(this, tVar.f1537a, tVar.f1538b, tVar.f1539c, tVar.f1540d, tVar.f1541e, tVar.f1542f, tVar.f1543g, tVar.f1544h, tVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f1537a == tVar.f1537a && this.f1538b == tVar.f1538b && S0.m.a(this.f1539c, tVar.f1539c) && E4.k.a(this.f1540d, tVar.f1540d) && E4.k.a(this.f1541e, tVar.f1541e) && E4.k.a(this.f1542f, tVar.f1542f) && this.f1543g == tVar.f1543g && this.f1544h == tVar.f1544h && E4.k.a(this.i, tVar.i);
    }

    public final int hashCode() {
        int iC = AbstractC0916i.c(this.f1538b, Integer.hashCode(this.f1537a) * 31, 31);
        S0.n[] nVarArr = S0.m.f4900b;
        int iL = p012c.k.l(iC, 31, this.f1539c);
        R0.p pVar = this.f1540d;
        int iHashCode = (iL + (pVar != null ? pVar.hashCode() : 0)) * 31;
        v vVar = this.f1541e;
        int iHashCode2 = (iHashCode + (vVar != null ? vVar.hashCode() : 0)) * 31;
        R0.g gVar = this.f1542f;
        int iC2 = AbstractC0916i.c(this.f1544h, AbstractC0916i.c(this.f1543g, (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31, 31), 31);
        R0.q qVar = this.i;
        return iC2 + (qVar != null ? qVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) R0.i.a(this.f1537a)) + ", textDirection=" + ((Object) R0.k.a(this.f1538b)) + ", lineHeight=" + ((Object) S0.m.d(this.f1539c)) + ", textIndent=" + this.f1540d + ", platformStyle=" + this.f1541e + ", lineHeightStyle=" + this.f1542f + ", lineBreak=" + ((Object) R0.e.a(this.f1543g)) + ", hyphens=" + ((Object) R0.d.a(this.f1544h)) + ", textMotion=" + this.i + ')';
    }
}
