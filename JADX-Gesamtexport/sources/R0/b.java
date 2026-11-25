package R0;

import p035g0.AbstractC0712m;
import p035g0.K;
import p035g0.r;

/* JADX INFO: loaded from: classes.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f4731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4732b;

    public b(K k3, float f6) {
        this.f4731a = k3;
        this.f4732b = f6;
    }

    @Override // R0.n
    public final long a() {
        int i = r.f9086m;
        return r.f9085l;
    }

    @Override // R0.n
    public final AbstractC0712m b() {
        return this.f4731a;
    }

    @Override // R0.n
    public final float c() {
        return this.f4732b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return E4.k.a(this.f4731a, bVar.f4731a) && Float.compare(this.f4732b, bVar.f4732b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4732b) + (this.f4731a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f4731a);
        sb.append(", alpha=");
        return p012c.k.t(sb, this.f4732b, ')');
    }
}
