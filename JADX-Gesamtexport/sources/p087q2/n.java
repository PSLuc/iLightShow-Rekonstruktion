package p087q2;

import T1.e;
import T1.k;
import V1.f;
import p015c2.E;

/* JADX INFO: loaded from: classes.dex */
public final class n extends q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11223h;

    public n(long j4) {
        this.f11223h = j4;
    }

    @Override // p087q2.b, p015c2.m
    public final void c(e eVar, E e6) {
        eVar.a0(this.f11223h);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof n) && ((n) obj).f11223h == this.f11223h;
    }

    public final int hashCode() {
        long j4 = this.f11223h;
        return ((int) j4) ^ ((int) (j4 >> 32));
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String j() {
        String str = f.f5498a;
        long j4 = this.f11223h;
        if (j4 > 2147483647L || j4 < -2147483648L) {
            return Long.toString(j4);
        }
        int i = (int) j4;
        String[] strArr = f.f5501d;
        if (i < strArr.length) {
            if (i >= 0) {
                return strArr[i];
            }
            int i3 = (-i) - 1;
            String[] strArr2 = f.f5502e;
            if (i3 < strArr2.length) {
                return strArr2[i3];
            }
        }
        return Integer.toString(i);
    }

    @Override // p087q2.u
    public final k p() {
        return k.VALUE_NUMBER_INT;
    }

    @Override // p087q2.q
    public final int q() {
        return (int) this.f11223h;
    }
}
