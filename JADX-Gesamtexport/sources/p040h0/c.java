package p040h0;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9221c;

    public c(int i, String str, long j4) {
        this.f9219a = str;
        this.f9220b = j4;
        this.f9221c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f6, float f7, float f8);

    public abstract float e(float f6, float f7, float f8);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f9221c == cVar.f9221c && k.a(this.f9219a, cVar.f9219a)) {
            return b.a(this.f9220b, cVar.f9220b);
        }
        return false;
    }

    public abstract long f(float f6, float f7, float f8, float f9, c cVar);

    public int hashCode() {
        int iHashCode = this.f9219a.hashCode() * 31;
        int i = b.f9218e;
        return p012c.k.l(iHashCode, 31, this.f9220b) + this.f9221c;
    }

    public final String toString() {
        return this.f9219a + " (id=" + this.f9221c + ", model=" + ((Object) b.b(this.f9220b)) + ')';
    }
}
