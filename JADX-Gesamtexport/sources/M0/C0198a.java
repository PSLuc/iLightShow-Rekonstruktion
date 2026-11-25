package M0;

import B.AbstractC0013g0;
import G0.C0110f;

/* JADX INFO: renamed from: M0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0198a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0110f f3395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3396b;

    public C0198a(C0110f c0110f, int i) {
        this.f3395a = c0110f;
        this.f3396b = i;
    }

    @Override // M0.i
    public final void a(j jVar) {
        int i = jVar.f3427d;
        boolean z5 = i != -1;
        C0110f c0110f = this.f3395a;
        if (z5) {
            jVar.d(i, c0110f.f1494h, jVar.f3428e);
        } else {
            jVar.d(jVar.f3425b, c0110f.f1494h, jVar.f3426c);
        }
        int i3 = jVar.f3425b;
        int i6 = jVar.f3426c;
        int i7 = i3 == i6 ? i6 : -1;
        int i8 = this.f3396b;
        int iO = p081p0.c.O(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - c0110f.f1494h.length(), 0, jVar.f3424a.c());
        jVar.f(iO, iO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0198a)) {
            return false;
        }
        C0198a c0198a = (C0198a) obj;
        return E4.k.a(this.f3395a.f1494h, c0198a.f3395a.f1494h) && this.f3396b == c0198a.f3396b;
    }

    public final int hashCode() {
        return (this.f3395a.f1494h.hashCode() * 31) + this.f3396b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f3395a.f1494h);
        sb.append("', newCursorPosition=");
        return AbstractC0013g0.k(sb, this.f3396b, ')');
    }

    public C0198a(String str, int i) {
        this(new C0110f(str, null, 6), i);
    }
}
