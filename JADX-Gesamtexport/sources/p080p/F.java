package p080p;

import E4.k;
import java.util.Arrays;
import p085q.a;

/* JADX INFO: loaded from: classes.dex */
public final class F implements Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ boolean f10718h;
    public /* synthetic */ int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object[] f10719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ int f10720k;

    public F(int i) {
        int i3;
        int i6 = 4;
        while (true) {
            i3 = 40;
            if (i6 >= 32) {
                break;
            }
            int i7 = (1 << i6) - 12;
            if (40 <= i7) {
                i3 = i7;
                break;
            }
            i6++;
        }
        int i8 = i3 / 4;
        this.i = new int[i8];
        this.f10719j = new Object[i8];
    }

    public final void a(int i, Object obj) {
        int i3 = this.f10720k;
        if (i3 != 0 && i <= this.i[i3 - 1]) {
            e(i, obj);
            return;
        }
        if (this.f10718h && i3 >= this.i.length) {
            m.a(this);
        }
        int i6 = this.f10720k;
        if (i6 >= this.i.length) {
            int i7 = (i6 + 1) * 4;
            for (int i8 = 4; i8 < 32; i8++) {
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
            }
            int i10 = i7 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.i, i10);
            k.e("copyOf(this, newSize)", iArrCopyOf);
            this.i = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f10719j, i10);
            k.e("copyOf(this, newSize)", objArrCopyOf);
            this.f10719j = objArrCopyOf;
        }
        this.i[i6] = i;
        this.f10719j[i6] = obj;
        this.f10720k = i6 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final F clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        k.d("null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>", objClone);
        F f6 = (F) objClone;
        f6.i = (int[]) this.i.clone();
        f6.f10719j = (Object[]) this.f10719j.clone();
        return f6;
    }

    public final Object c(int i) {
        Object obj;
        int iA = a.a(this.f10720k, i, this.i);
        if (iA < 0 || (obj = this.f10719j[iA]) == m.f10745c) {
            return null;
        }
        return obj;
    }

    public final int d(int i) {
        if (this.f10718h) {
            m.a(this);
        }
        return this.i[i];
    }

    public final void e(int i, Object obj) {
        int iA = a.a(this.f10720k, i, this.i);
        if (iA >= 0) {
            this.f10719j[iA] = obj;
            return;
        }
        int i3 = ~iA;
        int i6 = this.f10720k;
        if (i3 < i6) {
            Object[] objArr = this.f10719j;
            if (objArr[i3] == m.f10745c) {
                this.i[i3] = i;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f10718h && i6 >= this.i.length) {
            m.a(this);
            i3 = ~a.a(this.f10720k, i, this.i);
        }
        int i7 = this.f10720k;
        if (i7 >= this.i.length) {
            int i8 = (i7 + 1) * 4;
            for (int i9 = 4; i9 < 32; i9++) {
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
            }
            int i11 = i8 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.i, i11);
            k.e("copyOf(this, newSize)", iArrCopyOf);
            this.i = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f10719j, i11);
            k.e("copyOf(this, newSize)", objArrCopyOf);
            this.f10719j = objArrCopyOf;
        }
        int i12 = this.f10720k;
        if (i12 - i3 != 0) {
            int[] iArr = this.i;
            int i13 = i3 + 1;
            p089q4.k.c0(i13, i3, i12, iArr, iArr);
            Object[] objArr2 = this.f10719j;
            p089q4.k.e0(objArr2, objArr2, i13, i3, this.f10720k);
        }
        this.i[i3] = i;
        this.f10719j[i3] = obj;
        this.f10720k++;
    }

    public final int f() {
        if (this.f10718h) {
            m.a(this);
        }
        return this.f10720k;
    }

    public final Object g(int i) {
        if (this.f10718h) {
            m.a(this);
        }
        return this.f10719j[i];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10720k * 28);
        sb.append('{');
        int i = this.f10720k;
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(d(i3));
            sb.append('=');
            Object objG = g(i3);
            if (objG != this) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        k.e("buffer.toString()", string);
        return string;
    }
}
