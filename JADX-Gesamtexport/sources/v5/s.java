package v5;

import B.AbstractC0013g0;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.List;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f13372d = new s(0, 0, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f13373e = p089q4.m.M(0, 31, 32, 38);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f13374f = p089q4.m.M(0, 29, 30, 45, 46);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13377c;

    static {
        d0.v(55);
    }

    public s(int i, int i3, int i6) {
        this.f13375a = i;
        this.f13376b = i3;
        this.f13377c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f13375a == sVar.f13375a && this.f13376b == sVar.f13376b && this.f13377c == sVar.f13377c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13377c) + AbstractC0916i.c(this.f13376b, Integer.hashCode(this.f13375a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductInfo(vendorId=");
        sb.append(this.f13375a);
        sb.append(", productId=");
        sb.append(this.f13376b);
        sb.append(", version=");
        return AbstractC0013g0.l(sb, this.f13377c, ")");
    }
}
