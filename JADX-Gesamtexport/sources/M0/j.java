package M0;

import B.AbstractC0013g0;
import F.C0071m;
import G0.C0110f;
import G0.I;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I0.d f3424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3428e;

    public j(C0110f c0110f, long j4) {
        String str = c0110f.f1494h;
        I0.d dVar = new I0.d();
        dVar.f1808d = str;
        dVar.f1806b = -1;
        dVar.f1807c = -1;
        this.f3424a = dVar;
        this.f3425b = I.e(j4);
        this.f3426c = I.d(j4);
        this.f3427d = -1;
        this.f3428e = -1;
        int iE = I.e(j4);
        int iD = I.d(j4);
        String str2 = c0110f.f1494h;
        if (iE < 0 || iE > str2.length()) {
            StringBuilder sbV = p012c.k.v(iE, "start (", ") offset is outside of text region ");
            sbV.append(str2.length());
            throw new IndexOutOfBoundsException(sbV.toString());
        }
        if (iD < 0 || iD > str2.length()) {
            StringBuilder sbV2 = p012c.k.v(iD, "end (", ") offset is outside of text region ");
            sbV2.append(str2.length());
            throw new IndexOutOfBoundsException(sbV2.toString());
        }
        if (iE > iD) {
            throw new IllegalArgumentException(AbstractC0013g0.g("Do not set reversed range: ", iE, iD, " > "));
        }
    }

    public final void a(int i, int i3) {
        long jD = AbstractC0599v0.d(i, i3);
        this.f3424a.i(i, "", i3);
        long jF = d0.F(AbstractC0599v0.d(this.f3425b, this.f3426c), jD);
        h(I.e(jF));
        g(I.d(jF));
        int i6 = this.f3427d;
        if (i6 != -1) {
            long jF2 = d0.F(AbstractC0599v0.d(i6, this.f3428e), jD);
            if (I.b(jF2)) {
                this.f3427d = -1;
                this.f3428e = -1;
            } else {
                this.f3427d = I.e(jF2);
                this.f3428e = I.d(jF2);
            }
        }
    }

    public final char b(int i) {
        I0.d dVar = this.f3424a;
        C0071m c0071m = (C0071m) dVar.f1809e;
        if (c0071m != null && i >= dVar.f1806b) {
            int iC = c0071m.f1189b - c0071m.c();
            int i3 = dVar.f1806b;
            if (i >= iC + i3) {
                return ((String) dVar.f1808d).charAt(i - ((iC - dVar.f1807c) + i3));
            }
            int i6 = i - i3;
            int i7 = c0071m.f1190c;
            return i6 < i7 ? ((char[]) c0071m.f1192e)[i6] : ((char[]) c0071m.f1192e)[(i6 - i7) + c0071m.f1191d];
        }
        return ((String) dVar.f1808d).charAt(i);
    }

    public final I c() {
        int i = this.f3427d;
        if (i != -1) {
            return new I(AbstractC0599v0.d(i, this.f3428e));
        }
        return null;
    }

    public final void d(int i, String str, int i3) {
        I0.d dVar = this.f3424a;
        if (i < 0 || i > dVar.c()) {
            StringBuilder sbV = p012c.k.v(i, "start (", ") offset is outside of text region ");
            sbV.append(dVar.c());
            throw new IndexOutOfBoundsException(sbV.toString());
        }
        if (i3 < 0 || i3 > dVar.c()) {
            StringBuilder sbV2 = p012c.k.v(i3, "end (", ") offset is outside of text region ");
            sbV2.append(dVar.c());
            throw new IndexOutOfBoundsException(sbV2.toString());
        }
        if (i > i3) {
            throw new IllegalArgumentException(AbstractC0013g0.g("Do not set reversed range: ", i, i3, " > "));
        }
        dVar.i(i, str, i3);
        h(str.length() + i);
        g(str.length() + i);
        this.f3427d = -1;
        this.f3428e = -1;
    }

    public final void e(int i, int i3) {
        I0.d dVar = this.f3424a;
        if (i < 0 || i > dVar.c()) {
            StringBuilder sbV = p012c.k.v(i, "start (", ") offset is outside of text region ");
            sbV.append(dVar.c());
            throw new IndexOutOfBoundsException(sbV.toString());
        }
        if (i3 < 0 || i3 > dVar.c()) {
            StringBuilder sbV2 = p012c.k.v(i3, "end (", ") offset is outside of text region ");
            sbV2.append(dVar.c());
            throw new IndexOutOfBoundsException(sbV2.toString());
        }
        if (i >= i3) {
            throw new IllegalArgumentException(AbstractC0013g0.g("Do not set reversed or empty range: ", i, i3, " > "));
        }
        this.f3427d = i;
        this.f3428e = i3;
    }

    public final void f(int i, int i3) {
        I0.d dVar = this.f3424a;
        if (i < 0 || i > dVar.c()) {
            StringBuilder sbV = p012c.k.v(i, "start (", ") offset is outside of text region ");
            sbV.append(dVar.c());
            throw new IndexOutOfBoundsException(sbV.toString());
        }
        if (i3 < 0 || i3 > dVar.c()) {
            StringBuilder sbV2 = p012c.k.v(i3, "end (", ") offset is outside of text region ");
            sbV2.append(dVar.c());
            throw new IndexOutOfBoundsException(sbV2.toString());
        }
        if (i > i3) {
            throw new IllegalArgumentException(AbstractC0013g0.g("Do not set reversed range: ", i, i3, " > "));
        }
        h(i);
        g(i3);
    }

    public final void g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(p012c.k.r(i, "Cannot set selectionEnd to a negative value: ").toString());
        }
        this.f3426c = i;
    }

    public final void h(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(p012c.k.r(i, "Cannot set selectionStart to a negative value: ").toString());
        }
        this.f3425b = i;
    }

    public final String toString() {
        return this.f3424a.toString();
    }
}
