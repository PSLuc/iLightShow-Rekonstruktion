package M0;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3421b;

    public g(int i, int i3) {
        this.f3420a = i;
        this.f3421b = i3;
        if (i < 0 || i3 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i3 + " respectively.").toString());
        }
    }

    @Override // M0.i
    public final void a(j jVar) {
        int i = jVar.f3426c;
        int i3 = this.f3421b;
        int iC = i + i3;
        int i6 = (i ^ iC) & (i3 ^ iC);
        I0.d dVar = jVar.f3424a;
        if (i6 < 0) {
            iC = dVar.c();
        }
        jVar.a(jVar.f3426c, Math.min(iC, dVar.c()));
        int i7 = jVar.f3425b;
        int i8 = this.f3420a;
        int i9 = i7 - i8;
        if (((i8 ^ i7) & (i7 ^ i9)) < 0) {
            i9 = 0;
        }
        jVar.a(Math.max(0, i9), jVar.f3425b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f3420a == gVar.f3420a && this.f3421b == gVar.f3421b;
    }

    public final int hashCode() {
        return (this.f3420a * 31) + this.f3421b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f3420a);
        sb.append(", lengthAfterCursor=");
        return AbstractC0013g0.k(sb, this.f3421b, ')');
    }
}
