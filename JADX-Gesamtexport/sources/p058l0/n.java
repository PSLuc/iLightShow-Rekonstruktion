package p058l0;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class n extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10329d;

    public n(float f6, float f7) {
        super(3);
        this.f10328c = f6;
        this.f10329d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f10328c, nVar.f10328c) == 0 && Float.compare(this.f10329d, nVar.f10329d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10329d) + (Float.hashCode(this.f10328c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f10328c);
        sb.append(", y=");
        return k.t(sb, this.f10329d, ')');
    }
}
