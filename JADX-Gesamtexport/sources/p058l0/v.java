package p058l0;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class v extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10356d;

    public v(float f6, float f7) {
        super(3);
        this.f10355c = f6;
        this.f10356d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f10355c, vVar.f10355c) == 0 && Float.compare(this.f10356d, vVar.f10356d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10356d) + (Float.hashCode(this.f10355c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f10355c);
        sb.append(", dy=");
        return k.t(sb, this.f10356d, ')');
    }
}
