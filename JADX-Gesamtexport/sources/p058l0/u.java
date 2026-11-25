package p058l0;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class u extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10354d;

    public u(float f6, float f7) {
        super(3);
        this.f10353c = f6;
        this.f10354d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f10353c, uVar.f10353c) == 0 && Float.compare(this.f10354d, uVar.f10354d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10354d) + (Float.hashCode(this.f10353c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f10353c);
        sb.append(", dy=");
        return k.t(sb, this.f10354d, ')');
    }
}
