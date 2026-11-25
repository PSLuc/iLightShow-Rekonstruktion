package p058l0;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class m extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10327d;

    public m(float f6, float f7) {
        super(3);
        this.f10326c = f6;
        this.f10327d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f10326c, mVar.f10326c) == 0 && Float.compare(this.f10327d, mVar.f10327d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10327d) + (Float.hashCode(this.f10326c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f10326c);
        sb.append(", y=");
        return k.t(sb, this.f10327d, ')');
    }
}
