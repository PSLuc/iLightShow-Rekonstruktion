package M0;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class v implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3452b;

    public v(int i, int i3) {
        this.f3451a = i;
        this.f3452b = i3;
    }

    @Override // M0.i
    public final void a(j jVar) {
        int iO = p081p0.c.O(this.f3451a, 0, jVar.f3424a.c());
        int iO2 = p081p0.c.O(this.f3452b, 0, jVar.f3424a.c());
        if (iO < iO2) {
            jVar.f(iO, iO2);
        } else {
            jVar.f(iO2, iO);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f3451a == vVar.f3451a && this.f3452b == vVar.f3452b;
    }

    public final int hashCode() {
        return (this.f3451a * 31) + this.f3452b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f3451a);
        sb.append(", end=");
        return AbstractC0013g0.k(sb, this.f3452b, ')');
    }
}
