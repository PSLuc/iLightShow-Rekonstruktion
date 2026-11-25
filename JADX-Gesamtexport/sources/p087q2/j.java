package p087q2;

import T1.e;
import T1.k;
import V1.f;
import p015c2.E;

/* JADX INFO: loaded from: classes.dex */
public final class j extends q {
    public static final j[] i = new j[12];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11219h;

    static {
        for (int i3 = 0; i3 < 12; i3++) {
            i[i3] = new j(i3 - 1);
        }
    }

    public j(int i3) {
        this.f11219h = i3;
    }

    @Override // p087q2.b, p015c2.m
    public final void c(e eVar, E e6) {
        eVar.Z(this.f11219h);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof j) && ((j) obj).f11219h == this.f11219h;
    }

    public final int hashCode() {
        return this.f11219h;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String j() {
        String[] strArr = f.f5501d;
        int length = strArr.length;
        int i3 = this.f11219h;
        if (i3 < length) {
            if (i3 >= 0) {
                return strArr[i3];
            }
            int i6 = (-i3) - 1;
            String[] strArr2 = f.f5502e;
            if (i6 < strArr2.length) {
                return strArr2[i6];
            }
        }
        return Integer.toString(i3);
    }

    @Override // p087q2.u
    public final k p() {
        return k.VALUE_NUMBER_INT;
    }

    @Override // p087q2.q
    public final int q() {
        return this.f11219h;
    }
}
