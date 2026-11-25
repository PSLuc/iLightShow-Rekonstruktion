package N;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E0 f3589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f3590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f3591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f3592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f3593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p080p.q f3594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3596h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3601n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3602o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final L f3603p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final L f3604q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final L f3605r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p080p.q f3606s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3607t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3608u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3609v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3610w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0227m0 f3611x;

    public G0(E0 e6) {
        this.f3589a = e6;
        int[] iArr = e6.f3578h;
        this.f3590b = iArr;
        Object[] objArr = e6.f3579j;
        this.f3591c = objArr;
        this.f3592d = e6.f3584o;
        this.f3593e = e6.f3585p;
        this.f3594f = e6.f3586q;
        int i = e6.i;
        this.f3595g = i;
        this.f3596h = (iArr.length / 5) - i;
        int i3 = e6.f3580k;
        this.f3598k = i3;
        this.f3599l = objArr.length - i3;
        this.f3600m = i;
        this.f3603p = new L();
        this.f3604q = new L();
        this.f3605r = new L();
        this.f3608u = i;
        this.f3609v = -1;
    }

    public static int h(int i, int i3, int i6, int i7) {
        return i > i3 ? -(((i7 - i6) - i) + 1) : i;
    }

    public final boolean A() {
        C0206c c0206cI;
        if (this.f3601n != 0) {
            C0208d.w("Cannot remove group while inserting");
            throw null;
        }
        int i = this.f3607t;
        int i3 = this.i;
        int iF = f(this.f3590b, p(i));
        int iP = p(this.f3607t);
        int iJ = C0208d.j(this.f3590b, iP) + this.f3607t;
        this.f3607t = iJ;
        this.i = f(this.f3590b, p(iJ));
        int iO = C0208d.m(this.f3590b, iP) ? 1 : C0208d.o(this.f3590b, iP);
        int i6 = this.f3609v;
        HashMap map = this.f3593e;
        if (map != null && (c0206cI = I(i6)) != null) {
        }
        C0227m0 c0227m0 = this.f3611x;
        if (c0227m0 != null) {
            while (true) {
                ArrayList arrayList = c0227m0.f3729h;
                if (arrayList.isEmpty() || ((Number) p089q4.l.X(arrayList)).intValue() < i) {
                    break;
                }
                c0227m0.l();
            }
        }
        boolean zB = B(i, this.f3607t - i);
        C(iF, this.i - iF, i - 1);
        this.f3607t = i;
        this.i = i3;
        this.f3602o -= iO;
        return zB;
    }

    public final boolean B(int i, int i3) {
        boolean z5 = false;
        if (i3 > 0) {
            ArrayList arrayList = this.f3592d;
            u(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f3593e;
                int i6 = i + i3;
                int iN = C0208d.n(this.f3592d, i6, m() - this.f3596h);
                if (iN >= this.f3592d.size()) {
                    iN--;
                }
                int i7 = iN + 1;
                int i8 = 0;
                while (iN >= 0) {
                    C0206c c0206c = (C0206c) this.f3592d.get(iN);
                    int iC = c(c0206c);
                    if (iC < i) {
                        break;
                    }
                    if (iC < i6) {
                        c0206c.f3685a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i8 == 0) {
                            i8 = iN + 1;
                        }
                        i7 = iN;
                    }
                    iN--;
                }
                z5 = i7 < i8;
                if (z5) {
                    this.f3592d.subList(i7, i8).clear();
                }
            }
            this.f3595g = i;
            this.f3596h += i3;
            int i9 = this.f3600m;
            if (i9 > i) {
                this.f3600m = Math.max(i, i9 - i3);
            }
            int i10 = this.f3608u;
            if (i10 >= this.f3595g) {
                this.f3608u = i10 - i3;
            }
            int i11 = this.f3609v;
            if (i11 >= 0 && C0208d.h(this.f3590b, p(i11))) {
                K(i11);
            }
        }
        return z5;
    }

    public final void C(int i, int i3, int i6) {
        if (i3 > 0) {
            int i7 = this.f3599l;
            int i8 = i + i3;
            v(i8, i6);
            this.f3598k = i;
            this.f3599l = i7 + i3;
            p089q4.k.j0(i, i8, this.f3591c);
            int i9 = this.f3597j;
            if (i9 >= i) {
                this.f3597j = i9 - i3;
            }
        }
    }

    public final void D() {
        int i = this.f3608u;
        this.f3607t = i;
        this.i = f(this.f3590b, p(i));
    }

    public final int E(int[] iArr, int i) {
        if (i >= m()) {
            return this.f3591c.length - this.f3599l;
        }
        int iR = C0208d.r(iArr, i);
        return iR < 0 ? (this.f3591c.length - this.f3599l) + iR + 1 : iR;
    }

    public final int F(int i, int i3) {
        int iE = E(this.f3590b, p(i));
        int i6 = iE + i3;
        if (i6 >= iE && i6 < f(this.f3590b, p(i + 1))) {
            return i6;
        }
        C0208d.w("Write to an invalid slot index " + i3 + " for group " + i);
        throw null;
    }

    public final void G() {
        if (this.f3601n != 0) {
            C0208d.w("Key must be supplied when inserting");
            throw null;
        }
        U u6 = C0222k.f3714a;
        H(0, u6, u6, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(int i, Object obj, Object obj2, boolean z5) {
        int i3;
        HashMap map;
        C0206c c0206cI;
        int i6 = this.f3609v;
        byte b6 = this.f3601n > 0;
        this.f3605r.b(this.f3602o);
        U u6 = C0222k.f3714a;
        if (b6 == true) {
            int i7 = this.f3607t;
            int iF = f(this.f3590b, p(i7));
            r(1);
            this.i = iF;
            this.f3597j = iF;
            int iP = p(i7);
            int i8 = obj != u6 ? 1 : 0;
            int i9 = (z5 || obj2 == u6) ? 0 : 1;
            int iH = h(iF, this.f3598k, this.f3599l, this.f3591c.length);
            if (iH >= 0 && this.f3600m < i7) {
                iH = -(((this.f3591c.length - this.f3599l) - iH) + 1);
            }
            int[] iArr = this.f3590b;
            int i10 = this.f3609v;
            int i11 = z5 ? 1073741824 : 0;
            int i12 = i8 != 0 ? 536870912 : 0;
            int i13 = i9 != 0 ? 268435456 : 0;
            int i14 = iP * 5;
            iArr[i14] = i;
            iArr[i14 + 1] = i11 | i12 | i13;
            iArr[i14 + 2] = i10;
            iArr[i14 + 3] = 0;
            iArr[i14 + 4] = iH;
            int i15 = (z5 ? 1 : 0) + i8 + i9;
            if (i15 > 0) {
                s(i15, i7);
                Object[] objArr = this.f3591c;
                int i16 = this.i;
                if (z5) {
                    objArr[i16] = obj2;
                    i16++;
                }
                if (i8 != 0) {
                    objArr[i16] = obj;
                    i16++;
                }
                if (i9 != 0) {
                    objArr[i16] = obj2;
                    i16++;
                }
                this.i = i16;
            }
            this.f3602o = 0;
            i3 = i7 + 1;
            this.f3609v = i7;
            this.f3607t = i3;
            if (i6 >= 0 && (map = this.f3593e) != null && (c0206cI = I(i6)) != null) {
            }
        } else {
            this.f3603p.b(i6);
            this.f3604q.b((m() - this.f3596h) - this.f3608u);
            int i17 = this.f3607t;
            int iP2 = p(i17);
            if (!E4.k.a(obj2, u6)) {
                if (z5) {
                    L(this.f3607t, obj2);
                } else {
                    J(obj2);
                }
            }
            this.i = E(this.f3590b, iP2);
            this.f3597j = f(this.f3590b, p(this.f3607t + 1));
            this.f3602o = C0208d.o(this.f3590b, iP2);
            this.f3609v = i17;
            this.f3607t = i17 + 1;
            i3 = i17 + this.f3590b[(iP2 * 5) + 3];
        }
        this.f3608u = i3;
    }

    public final C0206c I(int i) {
        ArrayList arrayList;
        int iQ;
        if (i < 0 || i >= n() || (iQ = C0208d.Q((arrayList = this.f3592d), i, n())) < 0) {
            return null;
        }
        return (C0206c) arrayList.get(iQ);
    }

    public final void J(Object obj) {
        int iP = p(this.f3607t);
        if (!C0208d.k(this.f3590b, iP)) {
            C0208d.w("Updating the data of a group that was not created with a data slot");
            throw null;
        }
        Object[] objArr = this.f3591c;
        int[] iArr = this.f3590b;
        int iF = f(iArr, iP);
        int i = 1;
        switch (iArr[(iP * 5) + 1] >> 29) {
            case 0:
                i = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case 5:
            case 6:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        objArr[g(i + iF)] = obj;
    }

    public final void K(int i) {
        if (i >= 0) {
            C0227m0 c0227m0 = this.f3611x;
            if (c0227m0 == null) {
                c0227m0 = new C0227m0(0);
                this.f3611x = c0227m0;
            }
            c0227m0.a(i);
        }
    }

    public final void L(int i, Object obj) {
        int iP = p(i);
        int[] iArr = this.f3590b;
        if (iP < iArr.length && C0208d.m(iArr, iP)) {
            this.f3591c[g(f(this.f3590b, iP))] = obj;
            return;
        }
        C0208d.w("Updating the node of a group at " + i + " that was not created with as a node group");
        throw null;
    }

    public final void a(int i) {
        boolean z5 = false;
        if (!(i >= 0)) {
            C0208d.w("Cannot seek backwards");
            throw null;
        }
        if (!(this.f3601n <= 0)) {
            C0208d.T("Cannot call seek() while inserting");
            throw null;
        }
        if (i == 0) {
            return;
        }
        int i3 = this.f3607t + i;
        if (i3 >= this.f3609v && i3 <= this.f3608u) {
            z5 = true;
        }
        if (z5) {
            this.f3607t = i3;
            int iF = f(this.f3590b, p(i3));
            this.i = iF;
            this.f3597j = iF;
            return;
        }
        C0208d.w("Cannot seek outside the current group (" + this.f3609v + '-' + this.f3608u + ')');
        throw null;
    }

    public final C0206c b(int i) {
        ArrayList arrayList = this.f3592d;
        int iQ = C0208d.Q(arrayList, i, n());
        if (iQ >= 0) {
            return (C0206c) arrayList.get(iQ);
        }
        if (i > this.f3595g) {
            i = -(n() - i);
        }
        C0206c c0206c = new C0206c(i);
        arrayList.add(-(iQ + 1), c0206c);
        return c0206c;
    }

    public final int c(C0206c c0206c) {
        int i = c0206c.f3685a;
        return i < 0 ? n() + i : i;
    }

    public final void d() {
        int i = this.f3601n;
        this.f3601n = i + 1;
        if (i == 0) {
            this.f3604q.b((m() - this.f3596h) - this.f3608u);
        }
    }

    public final void e(boolean z5) {
        this.f3610w = true;
        if (z5 && this.f3603p.f3626b == 0) {
            u(n());
            v(this.f3591c.length - this.f3599l, this.f3595g);
            int i = this.f3598k;
            p089q4.k.j0(i, this.f3599l + i, this.f3591c);
            z();
        }
        int[] iArr = this.f3590b;
        int i3 = this.f3595g;
        Object[] objArr = this.f3591c;
        int i6 = this.f3598k;
        ArrayList arrayList = this.f3592d;
        HashMap map = this.f3593e;
        p080p.q qVar = this.f3594f;
        E0 e6 = this.f3589a;
        e6.getClass();
        if (!e6.f3582m) {
            C0208d.S("Unexpected writer close()");
            throw null;
        }
        e6.f3582m = false;
        e6.f3578h = iArr;
        e6.i = i3;
        e6.f3579j = objArr;
        e6.f3580k = i6;
        e6.f3584o = arrayList;
        e6.f3585p = map;
        e6.f3586q = qVar;
    }

    public final int f(int[] iArr, int i) {
        if (i >= m()) {
            return this.f3591c.length - this.f3599l;
        }
        int i3 = C0208d.i(iArr, i);
        return i3 < 0 ? (this.f3591c.length - this.f3599l) + i3 + 1 : i3;
    }

    public final int g(int i) {
        return i < this.f3598k ? i : i + this.f3599l;
    }

    public final void i() {
        p080p.w wVar;
        boolean z5 = this.f3601n > 0;
        int i = this.f3607t;
        int i3 = this.f3608u;
        int i6 = this.f3609v;
        int iP = p(i6);
        int i7 = this.f3602o;
        int i8 = i - i6;
        boolean zM = C0208d.m(this.f3590b, iP);
        L l6 = this.f3605r;
        if (z5) {
            p080p.q qVar = this.f3606s;
            if (qVar != null && (wVar = (p080p.w) qVar.f(i6)) != null) {
                Object[] objArr = wVar.f10794a;
                int i9 = wVar.f10795b;
                for (int i10 = 0; i10 < i9; i10++) {
                    y(objArr[i10]);
                }
            }
            C0208d.s(iP, i8, this.f3590b);
            C0208d.t(iP, i7, this.f3590b);
            int iA = l6.a();
            if (zM) {
                i7 = 1;
            }
            this.f3602o = iA + i7;
            int iX = x(this.f3590b, i6);
            this.f3609v = iX;
            int iN = iX < 0 ? n() : p(iX + 1);
            int iF = iN >= 0 ? f(this.f3590b, iN) : 0;
            this.i = iF;
            this.f3597j = iF;
            return;
        }
        if (i != i3) {
            C0208d.w("Expected to be at the end of a group");
            throw null;
        }
        int[] iArr = this.f3590b;
        int i11 = iArr[(iP * 5) + 3];
        int iO = C0208d.o(iArr, iP);
        C0208d.s(iP, i8, this.f3590b);
        C0208d.t(iP, i7, this.f3590b);
        int iA2 = this.f3603p.a();
        this.f3608u = (m() - this.f3596h) - this.f3604q.a();
        this.f3609v = iA2;
        int iX2 = x(this.f3590b, i6);
        int iA3 = l6.a();
        this.f3602o = iA3;
        if (iX2 == iA2) {
            this.f3602o = iA3 + (zM ? 0 : i7 - iO);
            return;
        }
        int i12 = i8 - i11;
        int i13 = zM ? 0 : i7 - iO;
        if (i12 != 0 || i13 != 0) {
            while (iX2 != 0 && iX2 != iA2 && (i13 != 0 || i12 != 0)) {
                int iP2 = p(iX2);
                if (i12 != 0) {
                    int[] iArr2 = this.f3590b;
                    C0208d.s(iP2, iArr2[(iP2 * 5) + 3] + i12, iArr2);
                }
                if (i13 != 0) {
                    int[] iArr3 = this.f3590b;
                    C0208d.t(iP2, C0208d.o(iArr3, iP2) + i13, iArr3);
                }
                if (C0208d.m(this.f3590b, iP2)) {
                    i13 = 0;
                }
                iX2 = x(this.f3590b, iX2);
            }
        }
        this.f3602o += i13;
    }

    public final void j() {
        int i = this.f3601n;
        if (!(i > 0)) {
            C0208d.T("Unbalanced begin/end insert");
            throw null;
        }
        int i3 = i - 1;
        this.f3601n = i3;
        if (i3 == 0) {
            if (this.f3605r.f3626b == this.f3603p.f3626b) {
                this.f3608u = (m() - this.f3596h) - this.f3604q.a();
            } else {
                C0208d.w("startGroup/endGroup mismatch while inserting");
                throw null;
            }
        }
    }

    public final void k(int i) {
        boolean z5 = false;
        if (!(this.f3601n <= 0)) {
            C0208d.w("Cannot call ensureStarted() while inserting");
            throw null;
        }
        int i3 = this.f3609v;
        if (i3 != i) {
            if (i >= i3 && i < this.f3608u) {
                z5 = true;
            }
            if (!z5) {
                C0208d.w("Started group at " + i + " must be a subgroup of the group at " + i3);
                throw null;
            }
            int i6 = this.f3607t;
            int i7 = this.i;
            int i8 = this.f3597j;
            this.f3607t = i;
            G();
            this.f3607t = i6;
            this.i = i7;
            this.f3597j = i8;
        }
    }

    public final void l(int i, int i3, int i6) {
        if (i >= this.f3595g) {
            i = -((n() - i) + 2);
        }
        while (i6 < i3) {
            this.f3590b[(p(i6) * 5) + 2] = i;
            int i7 = this.f3590b[(p(i6) * 5) + 3] + i6;
            l(i6, i7, i6 + 1);
            i6 = i7;
        }
    }

    public final int m() {
        return this.f3590b.length / 5;
    }

    public final int n() {
        return m() - this.f3596h;
    }

    public final int o() {
        return this.f3591c.length - this.f3599l;
    }

    public final int p(int i) {
        return i < this.f3595g ? i : i + this.f3596h;
    }

    public final int q(int i) {
        return C0208d.j(this.f3590b, p(i));
    }

    public final void r(int i) {
        if (i > 0) {
            int i3 = this.f3607t;
            u(i3);
            int i6 = this.f3595g;
            int i7 = this.f3596h;
            int[] iArr = this.f3590b;
            int length = iArr.length / 5;
            int i8 = length - i7;
            if (i7 < i) {
                int iMax = Math.max(Math.max(length * 2, i8 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i9 = iMax - i8;
                p089q4.k.c0(0, 0, i6 * 5, iArr, iArr2);
                p089q4.k.c0((i6 + i9) * 5, (i7 + i6) * 5, length * 5, iArr, iArr2);
                this.f3590b = iArr2;
                i7 = i9;
            }
            int i10 = this.f3608u;
            if (i10 >= i6) {
                this.f3608u = i10 + i;
            }
            int i11 = i6 + i;
            this.f3595g = i11;
            this.f3596h = i7 - i;
            int iH = h(i8 > 0 ? f(this.f3590b, p(i3 + i)) : 0, this.f3600m >= i6 ? this.f3598k : 0, this.f3599l, this.f3591c.length);
            for (int i12 = i6; i12 < i11; i12++) {
                this.f3590b[(i12 * 5) + 4] = iH;
            }
            int i13 = this.f3600m;
            if (i13 >= i6) {
                this.f3600m = i13 + i;
            }
        }
    }

    public final void s(int i, int i3) {
        if (i > 0) {
            v(this.i, i3);
            int i6 = this.f3598k;
            int i7 = this.f3599l;
            if (i7 < i) {
                Object[] objArr = this.f3591c;
                int length = objArr.length;
                int i8 = length - i7;
                int iMax = Math.max(Math.max(length * 2, i8 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i9 = 0; i9 < iMax; i9++) {
                    objArr2[i9] = null;
                }
                int i10 = iMax - i8;
                p089q4.k.e0(objArr, objArr2, 0, 0, i6);
                p089q4.k.e0(objArr, objArr2, i6 + i10, i7 + i6, length);
                this.f3591c = objArr2;
                i7 = i10;
            }
            int i11 = this.f3597j;
            if (i11 >= i6) {
                this.f3597j = i11 + i;
            }
            this.f3598k = i6 + i;
            this.f3599l = i7 - i;
        }
    }

    public final void t(E0 e6, int i) {
        byte b6 = 0;
        byte b7 = 0;
        boolean z5 = false;
        C0208d.P(this.f3601n > 0);
        if (i == 0 && this.f3607t == 0 && this.f3589a.i == 0) {
            int[] iArr = e6.f3578h;
            int i3 = iArr[(i * 5) + 3];
            int i6 = e6.i;
            if (i3 == i6) {
                int[] iArr2 = this.f3590b;
                Object[] objArr = this.f3591c;
                ArrayList arrayList = this.f3592d;
                HashMap map = this.f3593e;
                p080p.q qVar = this.f3594f;
                Object[] objArr2 = e6.f3579j;
                int i7 = e6.f3580k;
                HashMap map2 = e6.f3585p;
                p080p.q qVar2 = e6.f3586q;
                this.f3590b = iArr;
                this.f3591c = objArr2;
                this.f3592d = e6.f3584o;
                this.f3595g = i6;
                this.f3596h = (iArr.length / 5) - i6;
                this.f3598k = i7;
                this.f3599l = objArr2.length - i7;
                this.f3600m = i6;
                this.f3593e = map2;
                this.f3594f = qVar2;
                e6.f3578h = iArr2;
                e6.i = b7 == true ? 1 : 0;
                e6.f3579j = objArr;
                e6.f3580k = b6 == true ? 1 : 0;
                e6.f3584o = arrayList;
                e6.f3585p = map;
                e6.f3586q = qVar;
                return;
            }
        }
        G0 g0J = e6.j();
        try {
            C0208d.H(g0J, i, this, true, true, false);
        } finally {
            g0J.e(z5);
        }
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f3607t + " end=" + this.f3608u + " size = " + n() + " gap=" + this.f3595g + '-' + (this.f3595g + this.f3596h) + ')';
    }

    public final void u(int i) {
        C0206c c0206c;
        int i3;
        C0206c c0206c2;
        int i6;
        int i7;
        int i8 = this.f3596h;
        int i9 = this.f3595g;
        if (i9 != i) {
            if (!this.f3592d.isEmpty()) {
                int iM = m() - this.f3596h;
                if (i9 < i) {
                    for (int iN = C0208d.n(this.f3592d, i9, iM); iN < this.f3592d.size() && (i6 = (c0206c2 = (C0206c) this.f3592d.get(iN)).f3685a) < 0 && (i7 = i6 + iM) < i; iN++) {
                        c0206c2.f3685a = i7;
                    }
                } else {
                    for (int iN2 = C0208d.n(this.f3592d, i, iM); iN2 < this.f3592d.size() && (i3 = (c0206c = (C0206c) this.f3592d.get(iN2)).f3685a) >= 0; iN2++) {
                        c0206c.f3685a = -(iM - i3);
                    }
                }
            }
            if (i8 > 0) {
                int[] iArr = this.f3590b;
                int i10 = i * 5;
                int i11 = i8 * 5;
                int i12 = i9 * 5;
                if (i < i9) {
                    p089q4.k.c0(i11 + i10, i10, i12, iArr, iArr);
                } else {
                    p089q4.k.c0(i12, i12 + i11, i10 + i11, iArr, iArr);
                }
            }
            if (i < i9) {
                i9 = i + i8;
            }
            int iM2 = m();
            C0208d.P(i9 < iM2);
            while (i9 < iM2) {
                int i13 = (i9 * 5) + 2;
                int i14 = this.f3590b[i13];
                int iN3 = i14 > -2 ? i14 : (n() + i14) - (-2);
                if (iN3 >= i) {
                    iN3 = -((n() - iN3) - (-2));
                }
                if (iN3 != i14) {
                    this.f3590b[i13] = iN3;
                }
                i9++;
                if (i9 == i) {
                    i9 += i8;
                }
            }
        }
        this.f3595g = i;
    }

    public final void v(int i, int i3) {
        int i6 = this.f3599l;
        int i7 = this.f3598k;
        int i8 = this.f3600m;
        if (i7 != i) {
            Object[] objArr = this.f3591c;
            if (i < i7) {
                p089q4.k.e0(objArr, objArr, i + i6, i, i7);
            } else {
                p089q4.k.e0(objArr, objArr, i7, i7 + i6, i + i6);
            }
        }
        int iMin = Math.min(i3 + 1, n());
        if (i8 != iMin) {
            int length = this.f3591c.length - i6;
            if (iMin < i8) {
                int iP = p(iMin);
                int iP2 = p(i8);
                int i9 = this.f3595g;
                while (iP < iP2) {
                    int[] iArr = this.f3590b;
                    int i10 = (iP * 5) + 4;
                    int i11 = iArr[i10];
                    if (i11 < 0) {
                        C0208d.w("Unexpected anchor value, expected a positive anchor");
                        throw null;
                    }
                    iArr[i10] = -((length - i11) + 1);
                    iP++;
                    if (iP == i9) {
                        iP += this.f3596h;
                    }
                }
            } else {
                int iP3 = p(i8);
                int iP4 = p(iMin);
                while (iP3 < iP4) {
                    int[] iArr2 = this.f3590b;
                    int i12 = (iP3 * 5) + 4;
                    int i13 = iArr2[i12];
                    if (i13 >= 0) {
                        C0208d.w("Unexpected anchor value, expected a negative anchor");
                        throw null;
                    }
                    iArr2[i12] = i13 + length + 1;
                    iP3++;
                    if (iP3 == this.f3595g) {
                        iP3 += this.f3596h;
                    }
                }
            }
            this.f3600m = iMin;
        }
        this.f3598k = i;
    }

    public final Object w(int i) {
        int iP = p(i);
        if (C0208d.m(this.f3590b, iP)) {
            return this.f3591c[g(f(this.f3590b, iP))];
        }
        return null;
    }

    public final int x(int[] iArr, int i) {
        int iP = C0208d.p(iArr, p(i));
        return iP > -2 ? iP : (n() + iP) - (-2);
    }

    public final Object y(Object obj) {
        if (this.f3601n > 0) {
            s(1, this.f3609v);
        }
        Object[] objArr = this.f3591c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[g(i)];
        int i3 = this.i;
        if (i3 <= this.f3597j) {
            this.f3591c[g(i3 - 1)] = obj;
            return obj2;
        }
        C0208d.w("Writing to an invalid slot");
        throw null;
    }

    public final void z() {
        boolean z5;
        C0227m0 c0227m0 = this.f3611x;
        if (c0227m0 != null) {
            while (!c0227m0.f3729h.isEmpty()) {
                int iL = c0227m0.l();
                int iP = p(iL);
                int iQ = iL + 1;
                int iQ2 = q(iL) + iL;
                while (true) {
                    if (iQ >= iQ2) {
                        z5 = false;
                        break;
                    } else {
                        if ((this.f3590b[(p(iQ) * 5) + 1] & 201326592) != 0) {
                            z5 = true;
                            break;
                        }
                        iQ += q(iQ);
                    }
                }
                if (C0208d.h(this.f3590b, iP) != z5) {
                    int[] iArr = this.f3590b;
                    int i = (iP * 5) + 1;
                    if (z5) {
                        iArr[i] = iArr[i] | 67108864;
                    } else {
                        iArr[i] = iArr[i] & (-67108865);
                    }
                    int iX = x(iArr, iL);
                    if (iX >= 0) {
                        c0227m0.a(iX);
                    }
                }
            }
        }
    }
}
