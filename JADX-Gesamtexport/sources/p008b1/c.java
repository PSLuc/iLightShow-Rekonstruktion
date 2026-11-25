package p008b1;

import B.AbstractC0013g0;
import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f7046e = new c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7050d;

    public c(int i, int i3, int i6, int i7) {
        this.f7047a = i;
        this.f7048b = i3;
        this.f7049c = i6;
        this.f7050d = i7;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f7047a, cVar2.f7047a), Math.max(cVar.f7048b, cVar2.f7048b), Math.max(cVar.f7049c, cVar2.f7049c), Math.max(cVar.f7050d, cVar2.f7050d));
    }

    public static c b(int i, int i3, int i6, int i7) {
        return (i == 0 && i3 == 0 && i6 == 0 && i7 == 0) ? f7046e : new c(i, i3, i6, i7);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b.a(this.f7047a, this.f7048b, this.f7049c, this.f7050d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f7050d == cVar.f7050d && this.f7047a == cVar.f7047a && this.f7049c == cVar.f7049c && this.f7048b == cVar.f7048b;
    }

    public final int hashCode() {
        return (((((this.f7047a * 31) + this.f7048b) * 31) + this.f7049c) * 31) + this.f7050d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f7047a);
        sb.append(", top=");
        sb.append(this.f7048b);
        sb.append(", right=");
        sb.append(this.f7049c);
        sb.append(", bottom=");
        return AbstractC0013g0.k(sb, this.f7050d, '}');
    }
}
