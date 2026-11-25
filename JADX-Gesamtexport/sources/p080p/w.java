package p080p;

import A2.e;
import E4.k;
import J4.d;
import java.util.Arrays;
import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f10794a = new Object[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10795b;

    public final void a(Object obj) {
        int i = this.f10795b + 1;
        Object[] objArr = this.f10794a;
        if (objArr.length < i) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i, (objArr.length * 3) / 2));
            k.e("copyOf(this, newSize)", objArrCopyOf);
            this.f10794a = objArrCopyOf;
        }
        Object[] objArr2 = this.f10794a;
        int i3 = this.f10795b;
        objArr2[i3] = obj;
        this.f10795b = i3 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            int i = wVar.f10795b;
            int i3 = this.f10795b;
            if (i == i3) {
                Object[] objArr = this.f10794a;
                Object[] objArr2 = wVar.f10794a;
                d dVarD0 = c.D0(0, i3);
                int i6 = dVarD0.f1941h;
                int i7 = dVarD0.i;
                if (i6 > i7) {
                    return true;
                }
                while (k.a(objArr[i6], objArr2[i6])) {
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
        Object[] objArr = this.f10794a;
        int i = this.f10795b;
        int iHashCode = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        e eVar = new e(27, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f10794a;
        int i = this.f10795b;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                String string = sb.toString();
                k.e("StringBuilder().apply(builderAction).toString()", string);
                return string;
            }
            if (i3 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) eVar.invoke(obj));
        }
        sb.append((CharSequence) "]");
        String string2 = sb.toString();
        k.e("StringBuilder().apply(builderAction).toString()", string2);
        return string2;
    }
}
