package p096s;

/* JADX INFO: renamed from: s.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0921n extends AbstractC0924q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f12047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12048b;

    public C0921n(float f6, float f7) {
        this.f12047a = f6;
        this.f12048b = f7;
    }

    @Override // p096s.AbstractC0924q
    public final float a(int i) {
        if (i == 0) {
            return this.f12047a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f12048b;
    }

    @Override // p096s.AbstractC0924q
    public final int b() {
        return 2;
    }

    @Override // p096s.AbstractC0924q
    public final AbstractC0924q c() {
        return new C0921n(0.0f, 0.0f);
    }

    @Override // p096s.AbstractC0924q
    public final void d() {
        this.f12047a = 0.0f;
        this.f12048b = 0.0f;
    }

    @Override // p096s.AbstractC0924q
    public final void e(int i, float f6) {
        if (i == 0) {
            this.f12047a = f6;
        } else {
            if (i != 1) {
                return;
            }
            this.f12048b = f6;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0921n)) {
            return false;
        }
        C0921n c0921n = (C0921n) obj;
        return c0921n.f12047a == this.f12047a && c0921n.f12048b == this.f12048b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12048b) + (Float.hashCode(this.f12047a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f12047a + ", v2 = " + this.f12048b;
    }
}
