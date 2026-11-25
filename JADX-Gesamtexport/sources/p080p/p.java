package p080p;

import E4.k;
import J4.d;
import java.util.Arrays;
import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f10758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10759b;

    public p(int i) {
        this.f10758a = i == 0 ? j.f10738a : new int[i];
    }

    public final void a(int i) {
        b(this.f10759b + 1);
        int[] iArr = this.f10758a;
        int i3 = this.f10759b;
        iArr[i3] = i;
        this.f10759b = i3 + 1;
    }

    public final void b(int i) {
        int[] iArr = this.f10758a;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
            k.e("copyOf(this, newSize)", iArrCopyOf);
            this.f10758a = iArrCopyOf;
        }
    }

    public final int c(int i) {
        if (i >= 0 && i < this.f10759b) {
            return this.f10758a[i];
        }
        StringBuilder sbV = p012c.k.v(i, "Index ", " must be in 0..");
        sbV.append(this.f10759b - 1);
        throw new IndexOutOfBoundsException(sbV.toString());
    }

    public final int d(int i) {
        int i3;
        if (i < 0 || i >= (i3 = this.f10759b)) {
            StringBuilder sbV = p012c.k.v(i, "Index ", " must be in 0..");
            sbV.append(this.f10759b - 1);
            throw new IndexOutOfBoundsException(sbV.toString());
        }
        int[] iArr = this.f10758a;
        int i6 = iArr[i];
        if (i != i3 - 1) {
            p089q4.k.c0(i, i + 1, i3, iArr, iArr);
        }
        this.f10759b--;
        return i6;
    }

    public final void e(int i, int i3) {
        if (i < 0 || i >= this.f10759b) {
            StringBuilder sbV = p012c.k.v(i, "set index ", " must be between 0 .. ");
            sbV.append(this.f10759b - 1);
            throw new IndexOutOfBoundsException(sbV.toString());
        }
        int[] iArr = this.f10758a;
        int i6 = iArr[i];
        iArr[i] = i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            int i = pVar.f10759b;
            int i3 = this.f10759b;
            if (i == i3) {
                int[] iArr = this.f10758a;
                int[] iArr2 = pVar.f10758a;
                d dVarD0 = c.D0(0, i3);
                int i6 = dVarD0.f1941h;
                int i7 = dVarD0.i;
                if (i6 > i7) {
                    return true;
                }
                while (iArr[i6] == iArr2[i6]) {
                    if (i6 == i7) {
                        return true;
                    }
                    i6++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f10758a;
        int i = this.f10759b;
        int iHashCode = 0;
        for (int i3 = 0; i3 < i; i3++) {
            iHashCode += Integer.hashCode(iArr[i3]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f10758a;
        int i = this.f10759b;
        for (int i3 = 0; i3 < i; i3++) {
            int i6 = iArr[i3];
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                String string = sb.toString();
                k.e("StringBuilder().apply(builderAction).toString()", string);
                return string;
            }
            if (i3 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i6);
        }
        sb.append((CharSequence) "]");
        String string2 = sb.toString();
        k.e("StringBuilder().apply(builderAction).toString()", string2);
        return string2;
    }

    public /* synthetic */ p() {
        this(16);
    }
}
