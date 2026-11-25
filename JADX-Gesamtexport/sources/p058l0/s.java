package p058l0;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class s extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f10349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f10350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f10351h;

    public s(float f6, float f7, float f8, float f9, float f10, float f11) {
        super(2);
        this.f10346c = f6;
        this.f10347d = f7;
        this.f10348e = f8;
        this.f10349f = f9;
        this.f10350g = f10;
        this.f10351h = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f10346c, sVar.f10346c) == 0 && Float.compare(this.f10347d, sVar.f10347d) == 0 && Float.compare(this.f10348e, sVar.f10348e) == 0 && Float.compare(this.f10349f, sVar.f10349f) == 0 && Float.compare(this.f10350g, sVar.f10350g) == 0 && Float.compare(this.f10351h, sVar.f10351h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10351h) + k.i(this.f10350g, k.i(this.f10349f, k.i(this.f10348e, k.i(this.f10347d, Float.hashCode(this.f10346c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f10346c);
        sb.append(", dy1=");
        sb.append(this.f10347d);
        sb.append(", dx2=");
        sb.append(this.f10348e);
        sb.append(", dy2=");
        sb.append(this.f10349f);
        sb.append(", dx3=");
        sb.append(this.f10350g);
        sb.append(", dy3=");
        return k.t(sb, this.f10351h, ')');
    }
}
