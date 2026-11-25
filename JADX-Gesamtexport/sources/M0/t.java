package M0;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class t implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3448b;

    public t(int i, int i3) {
        this.f3447a = i;
        this.f3448b = i3;
    }

    @Override // M0.i
    public final void a(j jVar) {
        if (jVar.f3427d != -1) {
            jVar.f3427d = -1;
            jVar.f3428e = -1;
        }
        I0.d dVar = jVar.f3424a;
        int iO = p081p0.c.O(this.f3447a, 0, dVar.c());
        int iO2 = p081p0.c.O(this.f3448b, 0, dVar.c());
        if (iO != iO2) {
            if (iO < iO2) {
                jVar.e(iO, iO2);
            } else {
                jVar.e(iO2, iO);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f3447a == tVar.f3447a && this.f3448b == tVar.f3448b;
    }

    public final int hashCode() {
        return (this.f3447a * 31) + this.f3448b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f3447a);
        sb.append(", end=");
        return AbstractC0013g0.k(sb, this.f3448b, ')');
    }
}
