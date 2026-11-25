package M0;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3423b;

    public h(int i, int i3) {
        this.f3422a = i;
        this.f3423b = i3;
        if (i < 0 || i3 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i3 + " respectively.").toString());
        }
    }

    @Override // M0.i
    public final void a(j jVar) {
        int i = 0;
        for (int i3 = 0; i3 < this.f3422a; i3++) {
            int i6 = i + 1;
            int i7 = jVar.f3425b;
            if (i7 <= i6) {
                i = i7;
                break;
            }
            i = (Character.isHighSurrogate(jVar.b((i7 - i6) + (-1))) && Character.isLowSurrogate(jVar.b(jVar.f3425b - i6))) ? i + 2 : i6;
        }
        int iC = 0;
        for (int i8 = 0; i8 < this.f3423b; i8++) {
            int i9 = iC + 1;
            int i10 = jVar.f3426c + i9;
            I0.d dVar = jVar.f3424a;
            if (i10 >= dVar.c()) {
                iC = dVar.c() - jVar.f3426c;
                break;
            }
            iC = (Character.isHighSurrogate(jVar.b((jVar.f3426c + i9) + (-1))) && Character.isLowSurrogate(jVar.b(jVar.f3426c + i9))) ? iC + 2 : i9;
        }
        int i11 = jVar.f3426c;
        jVar.a(i11, iC + i11);
        int i12 = jVar.f3425b;
        jVar.a(i12 - i, i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f3422a == hVar.f3422a && this.f3423b == hVar.f3423b;
    }

    public final int hashCode() {
        return (this.f3422a * 31) + this.f3423b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f3422a);
        sb.append(", lengthAfterCursor=");
        return AbstractC0013g0.k(sb, this.f3423b, ')');
    }
}
