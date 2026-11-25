package p053k0;

import E4.k;
import S0.h;
import S0.j;
import p015c2.AbstractC0473d;
import p030f0.f;
import p035g0.C0704e;
import p035g0.C0709j;
import p044i0.b;
import p044i0.d;
import p124x0.F;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0704e f9926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9928g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9929h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0709j f9930j;

    public a(C0704e c0704e, long j4) {
        int i;
        int i3;
        this.f9926e = c0704e;
        this.f9927f = j4;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i = (int) (j4 >> 32)) < 0 || (i3 = (int) (4294967295L & j4)) < 0 || i > c0704e.f9060a.getWidth() || i3 > c0704e.f9060a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f9929h = j4;
        this.i = 1.0f;
    }

    @Override // p053k0.b
    public final void a(float f6) {
        this.i = f6;
    }

    @Override // p053k0.b
    public final void b(C0709j c0709j) {
        this.f9930j = c0709j;
    }

    @Override // p053k0.b
    public final long d() {
        return AbstractC0473d.U(this.f9929h);
    }

    @Override // p053k0.b
    public final void e(F f6) {
        b bVar = f6.f13862h;
        d.I(f6, this.f9926e, this.f9927f, AbstractC0473d.b(Math.round(f.d(bVar.f())), Math.round(f.b(bVar.f()))), this.i, this.f9930j, this.f9928g, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.f9926e, aVar.f9926e) && h.a(0L, 0L) && j.a(this.f9927f, aVar.f9927f) && this.f9928g == aVar.f9928g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9928g) + p012c.k.l(p012c.k.l(this.f9926e.hashCode() * 31, 31, 0L), 31, this.f9927f);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f9926e);
        sb.append(", srcOffset=");
        sb.append((Object) h.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) j.b(this.f9927f));
        sb.append(", filterQuality=");
        int i = this.f9928g;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else {
            str = i == 3 ? "High" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
