package O;

import F.C0071m;
import N.C0208d;
import N.C0237s;
import N.G0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p027e3.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4342k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4344m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4346o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4347p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4348q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C[] f4341j = new C[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f4343l = new int[16];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object[] f4345n = new Object[16];

    public static final int F0(D d6, int i) {
        d6.getClass();
        if (i == 0) {
            return 0;
        }
        return (-1) >>> (32 - i);
    }

    public final void G0() {
        this.f4342k = 0;
        this.f4344m = 0;
        p089q4.k.j0(0, this.f4346o, this.f4345n);
        this.f4346o = 0;
    }

    public final void H0(p091r0.d dVar, G0 g6, C0237s c0237s) {
        D d6;
        int i;
        if (J0()) {
            C0071m c0071m = new C0071m(this);
            do {
                d6 = (D) c0071m.f1192e;
                C c6 = d6.f4341j[c0071m.f1189b];
                E4.k.c(c6);
                c6.a(c0071m, dVar, g6, c0237s);
                int i3 = c0071m.f1189b;
                if (i3 >= d6.f4342k) {
                    break;
                }
                C c7 = d6.f4341j[i3];
                E4.k.c(c7);
                c0071m.f1190c += c7.f4339a;
                c0071m.f1191d += c7.f4340b;
                i = c0071m.f1189b + 1;
                c0071m.f1189b = i;
            } while (i < d6.f4342k);
        }
        G0();
    }

    public final boolean I0() {
        return this.f4342k == 0;
    }

    public final boolean J0() {
        return this.f4342k != 0;
    }

    public final C K0() {
        C c6 = this.f4341j[this.f4342k - 1];
        E4.k.c(c6);
        return c6;
    }

    public final void L0(C c6) {
        int i = c6.f4339a;
        int i3 = c6.f4340b;
        if (i == 0 && i3 == 0) {
            M0(c6);
            return;
        }
        C0208d.S("Cannot push " + c6 + " without arguments because it expects " + i + " ints and " + i3 + " objects.");
        throw null;
    }

    public final void M0(C c6) {
        this.f4347p = 0;
        this.f4348q = 0;
        int i = this.f4342k;
        C[] cArr = this.f4341j;
        if (i == cArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(cArr, i + (i > 1024 ? 1024 : i));
            E4.k.e("copyOf(this, newSize)", objArrCopyOf);
            this.f4341j = (C[]) objArrCopyOf;
        }
        int i3 = this.f4344m + c6.f4339a;
        int[] iArr = this.f4343l;
        int length = iArr.length;
        if (i3 > length) {
            int i6 = length + (length > 1024 ? 1024 : length);
            if (i6 >= i3) {
                i3 = i6;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i3);
            E4.k.e("copyOf(this, newSize)", iArrCopyOf);
            this.f4343l = iArrCopyOf;
        }
        int i7 = this.f4346o;
        int i8 = c6.f4340b;
        int i9 = i7 + i8;
        Object[] objArr = this.f4345n;
        int length2 = objArr.length;
        if (i9 > length2) {
            int i10 = length2 + (length2 <= 1024 ? length2 : 1024);
            if (i10 >= i9) {
                i9 = i10;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i9);
            E4.k.e("copyOf(this, newSize)", objArrCopyOf2);
            this.f4345n = objArrCopyOf2;
        }
        C[] cArr2 = this.f4341j;
        int i11 = this.f4342k;
        this.f4342k = i11 + 1;
        cArr2[i11] = c6;
        this.f4344m += c6.f4339a;
        this.f4346o += i8;
    }
}
