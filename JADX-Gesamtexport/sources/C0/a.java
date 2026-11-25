package C0;

import B.AbstractC0013g0;
import E4.k;
import p058l0.C0823f;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0823f f597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f598b;

    public a(C0823f c0823f, int i) {
        this.f597a = c0823f;
        this.f598b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.f597a, aVar.f597a) && this.f598b == aVar.f598b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f598b) + (this.f597a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f597a);
        sb.append(", configFlags=");
        return AbstractC0013g0.k(sb, this.f598b, ')');
    }
}
