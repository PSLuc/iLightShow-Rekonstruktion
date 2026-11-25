package N;

import B.AbstractC0013g0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E0 f3564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f3565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f3567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3571h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final L f3572j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3573k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3574l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3575m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3576n;

    public D0(E0 e6) {
        this.f3564a = e6;
        this.f3565b = e6.f3578h;
        int i = e6.i;
        this.f3566c = i;
        this.f3567d = e6.f3579j;
        this.f3568e = e6.f3580k;
        this.f3571h = i;
        this.i = -1;
        this.f3572j = new L();
    }

    public final C0206c a(int i) {
        ArrayList arrayList = this.f3564a.f3584o;
        int iQ = C0208d.Q(arrayList, i, this.f3566c);
        if (iQ >= 0) {
            return (C0206c) arrayList.get(iQ);
        }
        C0206c c0206c = new C0206c(i);
        arrayList.add(-(iQ + 1), c0206c);
        return c0206c;
    }

    public final Object b(int[] iArr, int i) {
        int length;
        if (!C0208d.k(iArr, i)) {
            return C0222k.f3714a;
        }
        int i3 = i * 5;
        if (i3 >= iArr.length) {
            length = iArr.length;
        } else {
            int i6 = iArr[i3 + 4];
            int i7 = 1;
            switch (iArr[i3 + 1] >> 29) {
                case 0:
                    i7 = 0;
                    break;
                case 1:
                case 2:
                case 4:
                    break;
                case 3:
                case 5:
                case 6:
                    i7 = 2;
                    break;
                default:
                    i7 = 3;
                    break;
            }
            length = i7 + i6;
        }
        return this.f3567d[length];
    }

    public final void c() {
        int i;
        this.f3569f = true;
        E0 e6 = this.f3564a;
        e6.getClass();
        if (this.f3564a != e6 || (i = e6.f3581l) <= 0) {
            C0208d.w("Unexpected reader close()");
            throw null;
        }
        e6.f3581l = i - 1;
    }

    public final void d() {
        if (this.f3573k == 0) {
            if (!(this.f3570g == this.f3571h)) {
                C0208d.w("endGroup() not called at the end of a group");
                throw null;
            }
            int i = this.i;
            int[] iArr = this.f3565b;
            int iP = C0208d.p(iArr, i);
            this.i = iP;
            int i3 = this.f3566c;
            this.f3571h = iP < 0 ? i3 : C0208d.j(iArr, iP) + iP;
            int iA = this.f3572j.a();
            if (iA < 0) {
                this.f3574l = 0;
                this.f3575m = 0;
            } else {
                this.f3574l = iA;
                this.f3575m = iP >= i3 - 1 ? this.f3568e : C0208d.i(iArr, iP + 1);
            }
        }
    }

    public final Object e() {
        int i = this.f3570g;
        if (i < this.f3571h) {
            return b(this.f3565b, i);
        }
        return 0;
    }

    public final int f() {
        int i = this.f3570g;
        if (i >= this.f3571h) {
            return 0;
        }
        return this.f3565b[i * 5];
    }

    public final Object g(int i, int i3) {
        int[] iArr = this.f3565b;
        int iR = C0208d.r(iArr, i);
        int i6 = i + 1;
        int i7 = iR + i3;
        return i7 < (i6 < this.f3566c ? iArr[(i6 * 5) + 4] : this.f3568e) ? this.f3567d[i7] : C0222k.f3714a;
    }

    public final Object h() {
        int i;
        if (this.f3573k > 0 || (i = this.f3574l) >= this.f3575m) {
            this.f3576n = false;
            return C0222k.f3714a;
        }
        this.f3576n = true;
        this.f3574l = i + 1;
        return this.f3567d[i];
    }

    public final Object i(int i) {
        int[] iArr = this.f3565b;
        if (!C0208d.m(iArr, i)) {
            return null;
        }
        if (!C0208d.m(iArr, i)) {
            return C0222k.f3714a;
        }
        return this.f3567d[iArr[(i * 5) + 4]];
    }

    public final Object j(int[] iArr, int i) {
        if (!C0208d.l(iArr, i)) {
            return null;
        }
        Object[] objArr = this.f3567d;
        int i3 = i * 5;
        int i6 = iArr[i3 + 4];
        int i7 = 1;
        switch (iArr[i3 + 1] >> 30) {
            case 0:
                i7 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case 5:
            case 6:
                i7 = 2;
                break;
            default:
                i7 = 3;
                break;
        }
        return objArr[i7 + i6];
    }

    public final void k(int i) {
        if (!(this.f3573k == 0)) {
            C0208d.w("Cannot reposition while in an empty region");
            throw null;
        }
        this.f3570g = i;
        int[] iArr = this.f3565b;
        int i3 = this.f3566c;
        int iP = i < i3 ? C0208d.p(iArr, i) : -1;
        this.i = iP;
        if (iP < 0) {
            this.f3571h = i3;
        } else {
            this.f3571h = C0208d.j(iArr, iP) + iP;
        }
        this.f3574l = 0;
        this.f3575m = 0;
    }

    public final int l() {
        if (!(this.f3573k == 0)) {
            C0208d.w("Cannot skip while in an empty region");
            throw null;
        }
        int i = this.f3570g;
        int[] iArr = this.f3565b;
        int iO = C0208d.m(iArr, i) ? 1 : C0208d.o(iArr, this.f3570g);
        int i3 = this.f3570g;
        this.f3570g = C0208d.j(iArr, i3) + i3;
        return iO;
    }

    public final void m() {
        if (!(this.f3573k == 0)) {
            C0208d.w("Cannot skip the enclosing group while in an empty region");
            throw null;
        }
        this.f3570g = this.f3571h;
        this.f3574l = 0;
        this.f3575m = 0;
    }

    public final void n() {
        if (this.f3573k <= 0) {
            int i = this.i;
            int i3 = this.f3570g;
            int[] iArr = this.f3565b;
            if (!(C0208d.p(iArr, i3) == i)) {
                C0208d.S("Invalid slot table detected");
                throw null;
            }
            int i6 = this.f3574l;
            int i7 = this.f3575m;
            L l6 = this.f3572j;
            if (i6 == 0 && i7 == 0) {
                l6.b(-1);
            } else {
                l6.b(i6);
            }
            this.i = i3;
            this.f3571h = C0208d.j(iArr, i3) + i3;
            int i8 = i3 + 1;
            this.f3570g = i8;
            this.f3574l = C0208d.r(iArr, i3);
            this.f3575m = i3 >= this.f3566c - 1 ? this.f3568e : C0208d.i(iArr, i8);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f3570g);
        sb.append(", key=");
        sb.append(f());
        sb.append(", parent=");
        sb.append(this.i);
        sb.append(", end=");
        return AbstractC0013g0.k(sb, this.f3571h, ')');
    }
}
