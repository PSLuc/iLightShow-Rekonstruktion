package E0;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f907d = new d(0.0f, new J4.a(0.0f, 0.0f), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J4.a f909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f910c;

    public d(float f6, J4.a aVar, int i) {
        this.f908a = f6;
        this.f909b = aVar;
        this.f910c = i;
        if (Float.isNaN(f6)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final J4.a a() {
        return this.f909b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f908a == dVar.f908a && E4.k.a(this.f909b, dVar.f909b) && this.f910c == dVar.f910c;
    }

    public final int hashCode() {
        return ((this.f909b.hashCode() + (Float.hashCode(this.f908a) * 31)) * 31) + this.f910c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.f908a);
        sb.append(", range=");
        sb.append(this.f909b);
        sb.append(", steps=");
        return AbstractC0013g0.k(sb, this.f910c, ')');
    }
}
