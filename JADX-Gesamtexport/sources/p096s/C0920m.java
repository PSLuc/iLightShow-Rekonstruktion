package p096s;

/* JADX INFO: renamed from: s.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0920m extends AbstractC0924q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f12032a;

    public C0920m(float f6) {
        this.f12032a = f6;
    }

    @Override // p096s.AbstractC0924q
    public final float a(int i) {
        if (i == 0) {
            return this.f12032a;
        }
        return 0.0f;
    }

    @Override // p096s.AbstractC0924q
    public final int b() {
        return 1;
    }

    @Override // p096s.AbstractC0924q
    public final AbstractC0924q c() {
        return new C0920m(0.0f);
    }

    @Override // p096s.AbstractC0924q
    public final void d() {
        this.f12032a = 0.0f;
    }

    @Override // p096s.AbstractC0924q
    public final void e(int i, float f6) {
        if (i == 0) {
            this.f12032a = f6;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0920m) && ((C0920m) obj).f12032a == this.f12032a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12032a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f12032a;
    }
}
