package androidx.compose.foundation.layout;

import S0.e;
import Z.n;
import p012c.k;
import p123x.N;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class PaddingElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f6620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f6621d;

    public PaddingElement(float f6, float f7, float f8, float f9) {
        this.f6618a = f6;
        this.f6619b = f7;
        this.f6620c = f8;
        this.f6621d = f9;
        if ((f6 < 0.0f && !e.a(f6, Float.NaN)) || ((f7 < 0.0f && !e.a(f7, Float.NaN)) || ((f8 < 0.0f && !e.a(f8, Float.NaN)) || (f9 < 0.0f && !e.a(f9, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && e.a(this.f6618a, paddingElement.f6618a) && e.a(this.f6619b, paddingElement.f6619b) && e.a(this.f6620c, paddingElement.f6620c) && e.a(this.f6621d, paddingElement.f6621d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + k.i(this.f6621d, k.i(this.f6620c, k.i(this.f6619b, Float.hashCode(this.f6618a) * 31, 31), 31), 31);
    }

    @Override // p124x0.Q
    public final n l() {
        N n6 = new N();
        n6.f13703u = this.f6618a;
        n6.f13704v = this.f6619b;
        n6.f13705w = this.f6620c;
        n6.f13706x = this.f6621d;
        n6.f13707y = true;
        return n6;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        N n6 = (N) nVar;
        n6.f13703u = this.f6618a;
        n6.f13704v = this.f6619b;
        n6.f13705w = this.f6620c;
        n6.f13706x = this.f6621d;
        n6.f13707y = true;
    }
}
