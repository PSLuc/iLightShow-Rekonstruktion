package p058l0;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class r extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f10345h;
    public final float i;

    public r(float f6, float f7, float f8, boolean z5, boolean z6, float f9, float f10) {
        super(3);
        this.f10340c = f6;
        this.f10341d = f7;
        this.f10342e = f8;
        this.f10343f = z5;
        this.f10344g = z6;
        this.f10345h = f9;
        this.i = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f10340c, rVar.f10340c) == 0 && Float.compare(this.f10341d, rVar.f10341d) == 0 && Float.compare(this.f10342e, rVar.f10342e) == 0 && this.f10343f == rVar.f10343f && this.f10344g == rVar.f10344g && Float.compare(this.f10345h, rVar.f10345h) == 0 && Float.compare(this.i, rVar.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + k.i(this.f10345h, k.m(this.f10344g, k.m(this.f10343f, k.i(this.f10342e, k.i(this.f10341d, Float.hashCode(this.f10340c) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f10340c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f10341d);
        sb.append(", theta=");
        sb.append(this.f10342e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f10343f);
        sb.append(", isPositiveArc=");
        sb.append(this.f10344g);
        sb.append(", arcStartDx=");
        sb.append(this.f10345h);
        sb.append(", arcStartDy=");
        return k.t(sb, this.i, ')');
    }
}
