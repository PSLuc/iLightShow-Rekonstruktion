package p058l0;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class w extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f10360f;

    public w(float f6, float f7, float f8, float f9) {
        super(1);
        this.f10357c = f6;
        this.f10358d = f7;
        this.f10359e = f8;
        this.f10360f = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f10357c, wVar.f10357c) == 0 && Float.compare(this.f10358d, wVar.f10358d) == 0 && Float.compare(this.f10359e, wVar.f10359e) == 0 && Float.compare(this.f10360f, wVar.f10360f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10360f) + k.i(this.f10359e, k.i(this.f10358d, Float.hashCode(this.f10357c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f10357c);
        sb.append(", dy1=");
        sb.append(this.f10358d);
        sb.append(", dx2=");
        sb.append(this.f10359e);
        sb.append(", dy2=");
        return k.t(sb, this.f10360f, ')');
    }
}
