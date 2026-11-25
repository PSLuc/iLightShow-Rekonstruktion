package T0;

import E4.k;
import Z2.f;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f5148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f5149b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f5148a = fArr;
        this.f5149b = fArr2;
    }

    @Override // T0.a
    public final float a(float f6) {
        return f.c(f6, this.f5149b, this.f5148a);
    }

    @Override // T0.a
    public final float b(float f6) {
        return f.c(f6, this.f5148a, this.f5149b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f5148a, cVar.f5148a) && Arrays.equals(this.f5149b, cVar.f5149b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5149b) + (Arrays.hashCode(this.f5148a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f5148a);
        k.e("toString(this)", string);
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f5149b);
        k.e("toString(this)", string2);
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
