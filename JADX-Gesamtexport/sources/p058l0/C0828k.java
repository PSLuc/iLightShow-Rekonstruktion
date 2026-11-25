package p058l0;

import p012c.k;

/* JADX INFO: renamed from: l0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0828k extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f10322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f10323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f10324h;

    public C0828k(float f6, float f7, float f8, float f9, float f10, float f11) {
        super(2);
        this.f10319c = f6;
        this.f10320d = f7;
        this.f10321e = f8;
        this.f10322f = f9;
        this.f10323g = f10;
        this.f10324h = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0828k)) {
            return false;
        }
        C0828k c0828k = (C0828k) obj;
        return Float.compare(this.f10319c, c0828k.f10319c) == 0 && Float.compare(this.f10320d, c0828k.f10320d) == 0 && Float.compare(this.f10321e, c0828k.f10321e) == 0 && Float.compare(this.f10322f, c0828k.f10322f) == 0 && Float.compare(this.f10323g, c0828k.f10323g) == 0 && Float.compare(this.f10324h, c0828k.f10324h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10324h) + k.i(this.f10323g, k.i(this.f10322f, k.i(this.f10321e, k.i(this.f10320d, Float.hashCode(this.f10319c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f10319c);
        sb.append(", y1=");
        sb.append(this.f10320d);
        sb.append(", x2=");
        sb.append(this.f10321e);
        sb.append(", y2=");
        sb.append(this.f10322f);
        sb.append(", x3=");
        sb.append(this.f10323g);
        sb.append(", y3=");
        return k.t(sb, this.f10324h, ')');
    }
}
