package S0;

import com.fasterxml.jackson.databind.deser.std.d0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4885h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final T0.a f4886j;

    public d(float f6, float f7, T0.a aVar) {
        this.f4885h = f6;
        this.i = f7;
        this.f4886j = aVar;
    }

    @Override // S0.b
    public final float C(long j4) {
        if (n.a(m.b(j4), 4294967296L)) {
            return this.f4886j.b(m.c(j4));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // S0.b
    public final float a() {
        return this.f4885h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f4885h, dVar.f4885h) == 0 && Float.compare(this.i, dVar.i) == 0 && E4.k.a(this.f4886j, dVar.f4886j);
    }

    public final int hashCode() {
        return this.f4886j.hashCode() + p012c.k.i(this.i, Float.hashCode(this.f4885h) * 31, 31);
    }

    @Override // S0.b
    public final float n() {
        return this.i;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f4885h + ", fontScale=" + this.i + ", converter=" + this.f4886j + ')';
    }

    @Override // S0.b
    public final long v(float f6) {
        return d0.y(this.f4886j.a(f6), 4294967296L);
    }
}
