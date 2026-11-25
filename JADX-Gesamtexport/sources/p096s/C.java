package p096s;

import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
public final class C implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0930x f11814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11816e;

    public C(int i, int i3, InterfaceC0930x interfaceC0930x) {
        this.f11812a = i;
        this.f11813b = i3;
        this.f11814c = interfaceC0930x;
        this.f11815d = ((long) i) * 1000000;
        this.f11816e = ((long) i3) * 1000000;
    }

    @Override // p096s.A
    public final float b(long j4, float f6, float f7, float f8) {
        float fP = this.f11812a == 0 ? 1.0f : c.P(j4 - this.f11816e, 0L, this.f11815d) / this.f11815d;
        if (fP < 0.0f) {
            fP = 0.0f;
        }
        float fA = this.f11814c.a(fP <= 1.0f ? fP : 1.0f);
        w0 w0Var = x0.f12138a;
        return (f7 * fA) + ((1 - fA) * f6);
    }

    @Override // p096s.A
    public final float c(long j4, float f6, float f7, float f8) {
        long jP = c.P(j4 - this.f11816e, 0L, this.f11815d);
        if (jP < 0) {
            return 0.0f;
        }
        if (jP == 0) {
            return f8;
        }
        return (b(jP, f6, f7, f8) - b(jP - 1000000, f6, f7, f8)) * 1000.0f;
    }

    @Override // p096s.A
    public final long d(float f6, float f7, float f8) {
        return ((long) (this.f11813b + this.f11812a)) * 1000000;
    }
}
