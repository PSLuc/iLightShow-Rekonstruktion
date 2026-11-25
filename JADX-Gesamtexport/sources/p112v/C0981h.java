package p112v;

import E4.k;
import P4.AbstractC0334v;
import P4.C0319f;
import S1.V;
import p129y.e;

/* JADX INFO: renamed from: v.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0981h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f12978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0319f f12979b;

    public C0981h(e eVar, C0319f c0319f) {
        this.f12978a = eVar;
        this.f12979b = c0319f;
    }

    public final String toString() {
        C0319f c0319f = this.f12979b;
        if (c0319f.f4651l.J(AbstractC0334v.i) != null) {
            throw new ClassCastException();
        }
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        V.t(16);
        String string = Integer.toString(iHashCode, 16);
        k.e("toString(this, checkRadix(radix))", string);
        sb.append(string);
        sb.append("(currentBounds()=");
        sb.append(this.f12978a.invoke());
        sb.append(", continuation=");
        sb.append(c0319f);
        sb.append(')');
        return sb.toString();
    }
}
