package p096s;

import p012c.k;

/* JADX INFO: renamed from: s.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0923p extends AbstractC0924q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f12067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f12070d;

    public C0923p(float f6, float f7, float f8, float f9) {
        this.f12067a = f6;
        this.f12068b = f7;
        this.f12069c = f8;
        this.f12070d = f9;
    }

    @Override // p096s.AbstractC0924q
    public final float a(int i) {
        if (i == 0) {
            return this.f12067a;
        }
        if (i == 1) {
            return this.f12068b;
        }
        if (i == 2) {
            return this.f12069c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f12070d;
    }

    @Override // p096s.AbstractC0924q
    public final int b() {
        return 4;
    }

    @Override // p096s.AbstractC0924q
    public final AbstractC0924q c() {
        return new C0923p(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // p096s.AbstractC0924q
    public final void d() {
        this.f12067a = 0.0f;
        this.f12068b = 0.0f;
        this.f12069c = 0.0f;
        this.f12070d = 0.0f;
    }

    @Override // p096s.AbstractC0924q
    public final void e(int i, float f6) {
        if (i == 0) {
            this.f12067a = f6;
            return;
        }
        if (i == 1) {
            this.f12068b = f6;
        } else if (i == 2) {
            this.f12069c = f6;
        } else {
            if (i != 3) {
                return;
            }
            this.f12070d = f6;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0923p)) {
            return false;
        }
        C0923p c0923p = (C0923p) obj;
        return c0923p.f12067a == this.f12067a && c0923p.f12068b == this.f12068b && c0923p.f12069c == this.f12069c && c0923p.f12070d == this.f12070d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12070d) + k.i(this.f12069c, k.i(this.f12068b, Float.hashCode(this.f12067a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f12067a + ", v2 = " + this.f12068b + ", v3 = " + this.f12069c + ", v4 = " + this.f12070d;
    }
}
