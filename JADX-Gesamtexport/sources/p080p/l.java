package p080p;

import E4.k;
import java.util.Arrays;
import p085q.a;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ boolean f10740h;
    public /* synthetic */ long[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object[] f10741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ int f10742k;

    public l(int i) {
        if (i == 0) {
            this.i = a.f11186b;
            this.f10741j = a.f11187c;
            return;
        }
        int i3 = i * 8;
        for (int i6 = 4; i6 < 32; i6++) {
            int i7 = (1 << i6) - 12;
            if (i3 <= i7) {
                i3 = i7;
                break;
            }
        }
        int i8 = i3 / 8;
        this.i = new long[i8];
        this.f10741j = new Object[i8];
    }

    public final long a(int i) {
        if (!(i >= 0 && i < this.f10742k)) {
            a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f10740h) {
            int i3 = this.f10742k;
            long[] jArr = this.i;
            Object[] objArr = this.f10741j;
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                Object obj = objArr[i7];
                if (obj != m.f10743a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f10740h = false;
            this.f10742k = i6;
        }
        return this.i[i];
    }

    public final void b(long j4, Object obj) {
        int iB = a.b(this.i, this.f10742k, j4);
        if (iB >= 0) {
            this.f10741j[iB] = obj;
            return;
        }
        int i = ~iB;
        int i3 = this.f10742k;
        Object obj2 = m.f10743a;
        if (i < i3) {
            Object[] objArr = this.f10741j;
            if (objArr[i] == obj2) {
                this.i[i] = j4;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f10740h) {
            long[] jArr = this.i;
            if (i3 >= jArr.length) {
                Object[] objArr2 = this.f10741j;
                int i6 = 0;
                for (int i7 = 0; i7 < i3; i7++) {
                    Object obj3 = objArr2[i7];
                    if (obj3 != obj2) {
                        if (i7 != i6) {
                            jArr[i6] = jArr[i7];
                            objArr2[i6] = obj3;
                            objArr2[i7] = null;
                        }
                        i6++;
                    }
                }
                this.f10740h = false;
                this.f10742k = i6;
                i = ~a.b(this.i, i6, j4);
            }
        }
        int i8 = this.f10742k;
        if (i8 >= this.i.length) {
            int i9 = (i8 + 1) * 8;
            for (int i10 = 4; i10 < 32; i10++) {
                int i11 = (1 << i10) - 12;
                if (i9 <= i11) {
                    i9 = i11;
                    break;
                }
            }
            int i12 = i9 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.i, i12);
            k.e("copyOf(this, newSize)", jArrCopyOf);
            this.i = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f10741j, i12);
            k.e("copyOf(this, newSize)", objArrCopyOf);
            this.f10741j = objArrCopyOf;
        }
        int i13 = this.f10742k - i;
        if (i13 != 0) {
            long[] jArr2 = this.i;
            int i14 = i + 1;
            k.f("<this>", jArr2);
            System.arraycopy(jArr2, i, jArr2, i14, i13);
            Object[] objArr3 = this.f10741j;
            p089q4.k.e0(objArr3, objArr3, i14, i, this.f10742k);
        }
        this.i[i] = j4;
        this.f10741j[i] = obj;
        this.f10742k++;
    }

    public final void c(long j4) {
        int iB = a.b(this.i, this.f10742k, j4);
        if (iB >= 0) {
            Object[] objArr = this.f10741j;
            Object obj = objArr[iB];
            Object obj2 = m.f10743a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f10740h = true;
            }
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        k.d("null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>", objClone);
        l lVar = (l) objClone;
        lVar.i = (long[]) this.i.clone();
        lVar.f10741j = (Object[]) this.f10741j.clone();
        return lVar;
    }

    public final int d() {
        if (this.f10740h) {
            int i = this.f10742k;
            long[] jArr = this.i;
            Object[] objArr = this.f10741j;
            int i3 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                Object obj = objArr[i6];
                if (obj != m.f10743a) {
                    if (i6 != i3) {
                        jArr[i3] = jArr[i6];
                        objArr[i3] = obj;
                        objArr[i6] = null;
                    }
                    i3++;
                }
            }
            this.f10740h = false;
            this.f10742k = i3;
        }
        return this.f10742k;
    }

    public final Object e(int i) {
        if (!(i >= 0 && i < this.f10742k)) {
            a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f10740h) {
            int i3 = this.f10742k;
            long[] jArr = this.i;
            Object[] objArr = this.f10741j;
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                Object obj = objArr[i7];
                if (obj != m.f10743a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f10740h = false;
            this.f10742k = i6;
        }
        return this.f10741j[i];
    }

    public final String toString() {
        if (d() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10742k * 28);
        sb.append('{');
        int i = this.f10742k;
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(a(i3));
            sb.append('=');
            Object objE = e(i3);
            if (objE != sb) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        k.e("StringBuilder(capacity).…builderAction).toString()", string);
        return string;
    }

    public /* synthetic */ l(Object obj) {
        this(10);
    }
}
