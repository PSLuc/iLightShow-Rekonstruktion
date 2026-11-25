package V;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f5397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f5398c;

    public f(int i, long[] jArr, Object[] objArr) {
        this.f5396a = i;
        this.f5397b = jArr;
        this.f5398c = objArr;
    }

    public final int a(long j4) {
        int i = this.f5396a - 1;
        if (i != -1) {
            long[] jArr = this.f5397b;
            int i3 = 0;
            if (i != 0) {
                while (i3 <= i) {
                    int i6 = (i3 + i) >>> 1;
                    long j6 = jArr[i6] - j4;
                    if (j6 < 0) {
                        i3 = i6 + 1;
                    } else {
                        if (j6 <= 0) {
                            return i6;
                        }
                        i = i6 - 1;
                    }
                }
                return -(i3 + 1);
            }
            long j7 = jArr[0];
            if (j7 == j4) {
                return 0;
            }
            if (j7 > j4) {
                return -2;
            }
        }
        return -1;
    }

    public final f b(long j4, Object obj) {
        long[] jArr;
        int i;
        Object[] objArr = this.f5398c;
        int i3 = 0;
        int i6 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i6++;
            }
        }
        int i7 = i6 + 1;
        long[] jArr2 = new long[i7];
        Object[] objArr2 = new Object[i7];
        if (i7 > 1) {
            int i8 = 0;
            while (true) {
                jArr = this.f5397b;
                i = this.f5396a;
                if (i3 >= i7 || i8 >= i) {
                    break;
                }
                long j6 = jArr[i8];
                Object obj3 = objArr[i8];
                if (j6 > j4) {
                    jArr2[i3] = j4;
                    objArr2[i3] = obj;
                    i3++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i3] = j6;
                    objArr2[i3] = obj3;
                    i3++;
                }
                i8++;
            }
            if (i8 == i) {
                jArr2[i6] = j4;
                objArr2[i6] = obj;
            } else {
                while (i3 < i7) {
                    long j7 = jArr[i8];
                    Object obj4 = objArr[i8];
                    if (obj4 != null) {
                        jArr2[i3] = j7;
                        objArr2[i3] = obj4;
                        i3++;
                    }
                    i8++;
                }
            }
        } else {
            jArr2[0] = j4;
            objArr2[0] = obj;
        }
        return new f(i7, jArr2, objArr2);
    }
}
