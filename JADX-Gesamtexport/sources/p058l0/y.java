package p058l0;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class y extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10366d;

    public y(float f6, float f7) {
        super(1);
        this.f10365c = f6;
        this.f10366d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f10365c, yVar.f10365c) == 0 && Float.compare(this.f10366d, yVar.f10366d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10366d) + (Float.hashCode(this.f10365c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f10365c);
        sb.append(", dy=");
        return k.t(sb, this.f10366d, ')');
    }
}
