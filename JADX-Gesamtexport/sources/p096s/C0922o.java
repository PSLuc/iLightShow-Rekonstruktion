package p096s;

import p012c.k;

/* JADX INFO: renamed from: s.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0922o extends AbstractC0924q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f12053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12055c;

    public C0922o(float f6, float f7, float f8) {
        this.f12053a = f6;
        this.f12054b = f7;
        this.f12055c = f8;
    }

    @Override // p096s.AbstractC0924q
    public final float a(int i) {
        if (i == 0) {
            return this.f12053a;
        }
        if (i == 1) {
            return this.f12054b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.f12055c;
    }

    @Override // p096s.AbstractC0924q
    public final int b() {
        return 3;
    }

    @Override // p096s.AbstractC0924q
    public final AbstractC0924q c() {
        return new C0922o(0.0f, 0.0f, 0.0f);
    }

    @Override // p096s.AbstractC0924q
    public final void d() {
        this.f12053a = 0.0f;
        this.f12054b = 0.0f;
        this.f12055c = 0.0f;
    }

    @Override // p096s.AbstractC0924q
    public final void e(int i, float f6) {
        if (i == 0) {
            this.f12053a = f6;
        } else if (i == 1) {
            this.f12054b = f6;
        } else {
            if (i != 2) {
                return;
            }
            this.f12055c = f6;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0922o)) {
            return false;
        }
        C0922o c0922o = (C0922o) obj;
        return c0922o.f12053a == this.f12053a && c0922o.f12054b == this.f12054b && c0922o.f12055c == this.f12055c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12055c) + k.i(this.f12054b, Float.hashCode(this.f12053a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f12053a + ", v2 = " + this.f12054b + ", v3 = " + this.f12055c;
    }
}
