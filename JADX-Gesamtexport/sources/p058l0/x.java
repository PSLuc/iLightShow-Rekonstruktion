package p058l0;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class x extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f10364f;

    public x(float f6, float f7, float f8, float f9) {
        super(2);
        this.f10361c = f6;
        this.f10362d = f7;
        this.f10363e = f8;
        this.f10364f = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f10361c, xVar.f10361c) == 0 && Float.compare(this.f10362d, xVar.f10362d) == 0 && Float.compare(this.f10363e, xVar.f10363e) == 0 && Float.compare(this.f10364f, xVar.f10364f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10364f) + k.i(this.f10363e, k.i(this.f10362d, Float.hashCode(this.f10361c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f10361c);
        sb.append(", dy1=");
        sb.append(this.f10362d);
        sb.append(", dx2=");
        sb.append(this.f10363e);
        sb.append(", dy2=");
        return k.t(sb, this.f10364f, ')');
    }
}
