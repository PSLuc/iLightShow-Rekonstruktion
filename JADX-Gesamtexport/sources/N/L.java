package N;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f3625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3626b;

    public L() {
        this.f3625a = new int[10];
    }

    public int a() {
        int[] iArr = this.f3625a;
        int i = this.f3626b - 1;
        this.f3626b = i;
        return iArr[i];
    }

    public void b(int i) {
        int i3 = this.f3626b;
        int[] iArr = this.f3625a;
        if (i3 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            E4.k.e("copyOf(this, newSize)", iArrCopyOf);
            this.f3625a = iArrCopyOf;
        }
        int[] iArr2 = this.f3625a;
        int i6 = this.f3626b;
        this.f3626b = i6 + 1;
        iArr2[i6] = i;
    }

    public void c(int i, int i3, int i6) {
        int i7 = this.f3626b;
        int i8 = i7 + 3;
        int[] iArr = this.f3625a;
        if (i8 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            E4.k.e("copyOf(this, newSize)", iArrCopyOf);
            this.f3625a = iArrCopyOf;
        }
        int[] iArr2 = this.f3625a;
        iArr2[i7] = i + i6;
        iArr2[i7 + 1] = i3 + i6;
        iArr2[i7 + 2] = i6;
        this.f3626b = i8;
    }

    public void d(int i, int i3, int i6, int i7) {
        int i8 = this.f3626b;
        int i9 = i8 + 4;
        int[] iArr = this.f3625a;
        if (i9 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            E4.k.e("copyOf(this, newSize)", iArrCopyOf);
            this.f3625a = iArrCopyOf;
        }
        int[] iArr2 = this.f3625a;
        iArr2[i8] = i;
        iArr2[i8 + 1] = i3;
        iArr2[i8 + 2] = i6;
        iArr2[i8 + 3] = i7;
        this.f3626b = i9;
    }

    public void e(int i, int i3) {
        if (i < i3) {
            int i6 = i - 3;
            for (int i7 = i; i7 < i3; i7 += 3) {
                int[] iArr = this.f3625a;
                int i8 = iArr[i7];
                int i9 = iArr[i3];
                if (i8 < i9 || (i8 == i9 && iArr[i7 + 1] <= iArr[i3 + 1])) {
                    i6 += 3;
                    f(i6, i7);
                }
            }
            f(i6 + 3, i3);
            e(i, i6);
            e(i6 + 6, i3);
        }
    }

    public void f(int i, int i3) {
        int[] iArr = this.f3625a;
        int i6 = iArr[i];
        iArr[i] = iArr[i3];
        iArr[i3] = i6;
        int i7 = i + 1;
        int i8 = i3 + 1;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
        int i10 = i + 2;
        int i11 = i3 + 2;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }

    public L(int i) {
        this.f3625a = new int[i];
    }
}
