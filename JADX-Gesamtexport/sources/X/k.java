package X;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f5692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f5693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f5694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5695e;

    public final int a(int i) {
        int i3 = this.f5691a + 1;
        int[] iArr = this.f5692b;
        int length = iArr.length;
        if (i3 > length) {
            int i6 = length * 2;
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            p089q4.k.f0(0, 0, 14, iArr, iArr2);
            p089q4.k.f0(0, 0, 14, this.f5693c, iArr3);
            this.f5692b = iArr2;
            this.f5693c = iArr3;
        }
        int i7 = this.f5691a;
        this.f5691a = i7 + 1;
        int length2 = this.f5694d.length;
        if (this.f5695e >= length2) {
            int i8 = length2 * 2;
            int[] iArr4 = new int[i8];
            int i9 = 0;
            while (i9 < i8) {
                int i10 = i9 + 1;
                iArr4[i9] = i10;
                i9 = i10;
            }
            p089q4.k.f0(0, 0, 14, this.f5694d, iArr4);
            this.f5694d = iArr4;
        }
        int i11 = this.f5695e;
        int[] iArr5 = this.f5694d;
        this.f5695e = iArr5[i11];
        int[] iArr6 = this.f5692b;
        iArr6[i7] = i;
        this.f5693c[i7] = i11;
        iArr5[i11] = i7;
        int i12 = iArr6[i7];
        while (i7 > 0) {
            int i13 = ((i7 + 1) >> 1) - 1;
            if (iArr6[i13] <= i12) {
                break;
            }
            b(i13, i7);
            i7 = i13;
        }
        return i11;
    }

    public final void b(int i, int i3) {
        int[] iArr = this.f5692b;
        int[] iArr2 = this.f5693c;
        int[] iArr3 = this.f5694d;
        int i6 = iArr[i];
        iArr[i] = iArr[i3];
        iArr[i3] = i6;
        int i7 = iArr2[i];
        iArr2[i] = iArr2[i3];
        iArr2[i3] = i7;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i3]] = i3;
    }
}
