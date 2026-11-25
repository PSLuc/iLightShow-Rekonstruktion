package X;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Iterable, F4.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m f5702l = new m(0, 0, 0, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f5703h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f5705k;

    public m(long j4, long j6, int i, int[] iArr) {
        this.f5703h = j4;
        this.i = j6;
        this.f5704j = i;
        this.f5705k = iArr;
    }

    public final m c(m mVar) {
        int[] iArr;
        m mVar2 = f5702l;
        if (mVar == mVar2) {
            return this;
        }
        if (this == mVar2) {
            return mVar2;
        }
        int i = mVar.f5704j;
        int[] iArr2 = mVar.f5705k;
        long j4 = mVar.i;
        long j6 = mVar.f5703h;
        int i3 = this.f5704j;
        if (i == i3 && iArr2 == (iArr = this.f5705k)) {
            return new m(this.f5703h & (~j6), this.i & (~j4), i3, iArr);
        }
        if (iArr2 != null) {
            for (int i6 : iArr2) {
                this = this.g(i6);
            }
        }
        int i7 = mVar.f5704j;
        if (j4 != 0) {
            for (int i8 = 0; i8 < 64; i8++) {
                if (((1 << i8) & j4) != 0) {
                    this = this.g(i8 + i7);
                }
            }
        }
        if (j6 != 0) {
            for (int i9 = 0; i9 < 64; i9++) {
                if (((1 << i9) & j6) != 0) {
                    this = this.g(i9 + 64 + i7);
                }
            }
        }
        return this;
    }

    public final m g(int i) {
        int[] iArr;
        int iB;
        int i3 = this.f5704j;
        int i6 = i - i3;
        if (i6 >= 0 && i6 < 64) {
            long j4 = 1 << i6;
            long j6 = this.i;
            if ((j6 & j4) != 0) {
                return new m(this.f5703h, j6 & (~j4), i3, this.f5705k);
            }
        } else if (i6 >= 64 && i6 < 128) {
            long j7 = 1 << (i6 - 64);
            long j8 = this.f5703h;
            if ((j8 & j7) != 0) {
                return new m((~j7) & j8, this.i, i3, this.f5705k);
            }
        } else if (i6 < 0 && (iArr = this.f5705k) != null && (iB = t.b(iArr, i)) >= 0) {
            int length = iArr.length;
            int i7 = length - 1;
            if (i7 == 0) {
                return new m(this.f5703h, this.i, this.f5704j, null);
            }
            int[] iArr2 = new int[i7];
            if (iB > 0) {
                p089q4.k.c0(0, 0, iB, iArr, iArr2);
            }
            if (iB < i7) {
                p089q4.k.c0(iB, iB + 1, length, iArr, iArr2);
            }
            return new m(this.f5703h, this.i, this.f5704j, iArr2);
        }
        return this;
    }

    public final boolean i(int i) {
        int[] iArr;
        int i3 = i - this.f5704j;
        if (i3 >= 0 && i3 < 64) {
            return (this.i & (1 << i3)) != 0;
        }
        if (i3 < 64 || i3 >= 128) {
            return i3 <= 0 && (iArr = this.f5705k) != null && t.b(iArr, i) >= 0;
        }
        return (this.f5703h & (1 << (i3 - 64))) != 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return p006b.a.w(new l(this, null));
    }

    public final m j(m mVar) {
        int[] iArr;
        m mVarK = this;
        m mVarK2 = mVar;
        m mVar2 = f5702l;
        if (mVarK2 == mVar2) {
            return mVarK;
        }
        if (mVarK == mVar2) {
            return mVarK2;
        }
        int i = mVarK2.f5704j;
        long j4 = mVarK.i;
        long j6 = mVarK.f5703h;
        int[] iArr2 = mVarK2.f5705k;
        long j7 = mVarK2.i;
        long j8 = mVarK2.f5703h;
        int i3 = mVarK.f5704j;
        if (i == i3 && iArr2 == (iArr = mVarK.f5705k)) {
            return new m(j6 | j8, j4 | j7, i3, iArr);
        }
        int i6 = 0;
        int[] iArr3 = mVarK.f5705k;
        if (iArr3 == null) {
            if (iArr3 != null) {
                for (int i7 : iArr3) {
                    mVarK2 = mVarK2.k(i7);
                }
            }
            int i8 = mVarK.f5704j;
            if (j4 != 0) {
                for (int i9 = 0; i9 < 64; i9++) {
                    if (((1 << i9) & j4) != 0) {
                        mVarK2 = mVarK2.k(i9 + i8);
                    }
                }
            }
            if (j6 != 0) {
                while (i6 < 64) {
                    if (((1 << i6) & j6) != 0) {
                        mVarK2 = mVarK2.k(i6 + 64 + i8);
                    }
                    i6++;
                }
            }
            return mVarK2;
        }
        if (iArr2 != null) {
            for (int i10 : iArr2) {
                mVarK = mVarK.k(i10);
            }
        }
        int i11 = mVarK2.f5704j;
        if (j7 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if (((1 << i12) & j7) != 0) {
                    mVarK = mVarK.k(i12 + i11);
                }
            }
        }
        if (j8 != 0) {
            while (i6 < 64) {
                if (((1 << i6) & j8) != 0) {
                    mVarK = mVarK.k(i6 + 64 + i11);
                }
                i6++;
            }
        }
        return mVarK;
    }

    public final m k(int i) {
        int i3;
        long j4;
        int i6 = this.f5704j;
        int i7 = i - i6;
        long j6 = this.i;
        if (i7 < 0 || i7 >= 64) {
            long j7 = this.f5703h;
            if (i7 < 64 || i7 >= 128) {
                int[] iArrR0 = this.f5705k;
                if (i7 < 128) {
                    if (iArrR0 == null) {
                        return new m(j7, j6, i6, new int[]{i});
                    }
                    int iB = t.b(iArrR0, i);
                    if (iB < 0) {
                        int i8 = -(iB + 1);
                        int length = iArrR0.length;
                        int[] iArr = new int[length + 1];
                        p089q4.k.c0(0, 0, i8, iArrR0, iArr);
                        p089q4.k.c0(i8 + 1, i8, length, iArrR0, iArr);
                        iArr[i8] = i;
                        return new m(this.f5703h, this.i, this.f5704j, iArr);
                    }
                } else if (!i(i)) {
                    int i9 = ((i + 1) / 64) * 64;
                    int i10 = this.f5704j;
                    ArrayList arrayList = null;
                    long j8 = j7;
                    while (true) {
                        if (i10 >= i9) {
                            i3 = i10;
                            j4 = j6;
                            break;
                        }
                        if (j6 != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (iArrR0 != null) {
                                    for (int i11 : iArrR0) {
                                        arrayList.add(Integer.valueOf(i11));
                                    }
                                }
                            }
                            for (int i12 = 0; i12 < 64; i12++) {
                                if (((1 << i12) & j6) != 0) {
                                    arrayList.add(Integer.valueOf(i12 + i10));
                                }
                            }
                        }
                        if (j8 == 0) {
                            i3 = i9;
                            j4 = 0;
                            break;
                        }
                        i10 += 64;
                        j6 = j8;
                        j8 = 0;
                    }
                    if (arrayList != null) {
                        iArrR0 = p089q4.l.r0(arrayList);
                    }
                    return new m(j8, j4, i3, iArrR0).k(i);
                }
            } else {
                long j9 = 1 << (i7 - 64);
                if ((j7 & j9) == 0) {
                    return new m(j9 | j7, j6, i6, this.f5705k);
                }
            }
        } else {
            long j10 = 1 << i7;
            if ((j6 & j10) == 0) {
                return new m(this.f5703h, j6 | j10, i6, this.f5705k);
            }
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(p089q4.n.P(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = arrayList.get(i3);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
