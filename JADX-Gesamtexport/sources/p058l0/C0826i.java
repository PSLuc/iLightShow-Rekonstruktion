package p058l0;

import p012c.k;

/* JADX INFO: renamed from: l0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0826i extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f10317h;
    public final float i;

    public C0826i(float f6, float f7, float f8, boolean z5, boolean z6, float f9, float f10) {
        super(3);
        this.f10312c = f6;
        this.f10313d = f7;
        this.f10314e = f8;
        this.f10315f = z5;
        this.f10316g = z6;
        this.f10317h = f9;
        this.i = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0826i)) {
            return false;
        }
        C0826i c0826i = (C0826i) obj;
        return Float.compare(this.f10312c, c0826i.f10312c) == 0 && Float.compare(this.f10313d, c0826i.f10313d) == 0 && Float.compare(this.f10314e, c0826i.f10314e) == 0 && this.f10315f == c0826i.f10315f && this.f10316g == c0826i.f10316g && Float.compare(this.f10317h, c0826i.f10317h) == 0 && Float.compare(this.i, c0826i.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + k.i(this.f10317h, k.m(this.f10316g, k.m(this.f10315f, k.i(this.f10314e, k.i(this.f10313d, Float.hashCode(this.f10312c) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f10312c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f10313d);
        sb.append(", theta=");
        sb.append(this.f10314e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f10315f);
        sb.append(", isPositiveArc=");
        sb.append(this.f10316g);
        sb.append(", arcStartX=");
        sb.append(this.f10317h);
        sb.append(", arcStartY=");
        return k.t(sb, this.i, ')');
    }
}
