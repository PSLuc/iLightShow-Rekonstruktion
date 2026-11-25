package p030f0;

import p012c.k;
import p027e3.a;
import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f8838e = new d(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8842d;

    public d(float f6, float f7, float f8, float f9) {
        this.f8839a = f6;
        this.f8840b = f7;
        this.f8841c = f8;
        this.f8842d = f9;
    }

    public final long a() {
        return c.y((c() / 2.0f) + this.f8839a, (b() / 2.0f) + this.f8840b);
    }

    public final float b() {
        return this.f8842d - this.f8840b;
    }

    public final float c() {
        return this.f8841c - this.f8839a;
    }

    public final d d(d dVar) {
        return new d(Math.max(this.f8839a, dVar.f8839a), Math.max(this.f8840b, dVar.f8840b), Math.min(this.f8841c, dVar.f8841c), Math.min(this.f8842d, dVar.f8842d));
    }

    public final boolean e() {
        return this.f8839a >= this.f8841c || this.f8840b >= this.f8842d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f8839a, dVar.f8839a) == 0 && Float.compare(this.f8840b, dVar.f8840b) == 0 && Float.compare(this.f8841c, dVar.f8841c) == 0 && Float.compare(this.f8842d, dVar.f8842d) == 0;
    }

    public final boolean f(d dVar) {
        return this.f8841c > dVar.f8839a && dVar.f8841c > this.f8839a && this.f8842d > dVar.f8840b && dVar.f8842d > this.f8840b;
    }

    public final d g(float f6, float f7) {
        return new d(this.f8839a + f6, this.f8840b + f7, this.f8841c + f6, this.f8842d + f7);
    }

    public final d h(long j4) {
        return new d(c.d(j4) + this.f8839a, c.e(j4) + this.f8840b, c.d(j4) + this.f8841c, c.e(j4) + this.f8842d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f8842d) + k.i(this.f8841c, k.i(this.f8840b, Float.hashCode(this.f8839a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + a.B0(this.f8839a) + ", " + a.B0(this.f8840b) + ", " + a.B0(this.f8841c) + ", " + a.B0(this.f8842d) + ')';
    }
}
