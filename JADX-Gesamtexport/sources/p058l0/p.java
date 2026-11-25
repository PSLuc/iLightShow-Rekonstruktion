package p058l0;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class p extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f10337f;

    public p(float f6, float f7, float f8, float f9) {
        super(2);
        this.f10334c = f6;
        this.f10335d = f7;
        this.f10336e = f8;
        this.f10337f = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f10334c, pVar.f10334c) == 0 && Float.compare(this.f10335d, pVar.f10335d) == 0 && Float.compare(this.f10336e, pVar.f10336e) == 0 && Float.compare(this.f10337f, pVar.f10337f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10337f) + k.i(this.f10336e, k.i(this.f10335d, Float.hashCode(this.f10334c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f10334c);
        sb.append(", y1=");
        sb.append(this.f10335d);
        sb.append(", x2=");
        sb.append(this.f10336e);
        sb.append(", y2=");
        return k.t(sb, this.f10337f, ')');
    }
}
