package p058l0;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class o extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f10333f;

    public o(float f6, float f7, float f8, float f9) {
        super(1);
        this.f10330c = f6;
        this.f10331d = f7;
        this.f10332e = f8;
        this.f10333f = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f10330c, oVar.f10330c) == 0 && Float.compare(this.f10331d, oVar.f10331d) == 0 && Float.compare(this.f10332e, oVar.f10332e) == 0 && Float.compare(this.f10333f, oVar.f10333f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10333f) + k.i(this.f10332e, k.i(this.f10331d, Float.hashCode(this.f10330c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f10330c);
        sb.append(", y1=");
        sb.append(this.f10331d);
        sb.append(", x2=");
        sb.append(this.f10332e);
        sb.append(", y2=");
        return k.t(sb, this.f10333f, ')');
    }
}
