package V;

import E4.k;
import S1.V;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5393a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f5393a);
        sb.append(")@");
        int iHashCode = hashCode();
        V.t(16);
        String string = Integer.toString(iHashCode, 16);
        k.e("toString(this, checkRadix(radix))", string);
        sb.append(string);
        return sb.toString();
    }
}
