package M0;

import B.AbstractC0013g0;
import G0.C0110f;

/* JADX INFO: loaded from: classes.dex */
public final class u implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0110f f3449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3450b;

    public u(String str, int i) {
        this.f3449a = new C0110f(str, null, 6);
        this.f3450b = i;
    }

    @Override // M0.i
    public final void a(j jVar) {
        int i = jVar.f3427d;
        boolean z5 = i != -1;
        C0110f c0110f = this.f3449a;
        if (z5) {
            jVar.d(i, c0110f.f1494h, jVar.f3428e);
            String str = c0110f.f1494h;
            if (str.length() > 0) {
                jVar.e(i, str.length() + i);
            }
        } else {
            int i3 = jVar.f3425b;
            jVar.d(i3, c0110f.f1494h, jVar.f3426c);
            String str2 = c0110f.f1494h;
            if (str2.length() > 0) {
                jVar.e(i3, str2.length() + i3);
            }
        }
        int i6 = jVar.f3425b;
        int i7 = jVar.f3426c;
        int i8 = i6 == i7 ? i7 : -1;
        int i9 = this.f3450b;
        int iO = p081p0.c.O(i9 > 0 ? (i8 + i9) - 1 : (i8 + i9) - c0110f.f1494h.length(), 0, jVar.f3424a.c());
        jVar.f(iO, iO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return E4.k.a(this.f3449a.f1494h, uVar.f3449a.f1494h) && this.f3450b == uVar.f3450b;
    }

    public final int hashCode() {
        return (this.f3449a.f1494h.hashCode() * 31) + this.f3450b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f3449a.f1494h);
        sb.append("', newCursorPosition=");
        return AbstractC0013g0.k(sb, this.f3450b, ')');
    }
}
