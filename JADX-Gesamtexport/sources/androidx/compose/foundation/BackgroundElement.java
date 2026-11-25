package androidx.compose.foundation;

import E4.k;
import Z.n;
import p035g0.AbstractC0712m;
import p035g0.M;
import p035g0.r;
import p035g0.z;
import p101t.C0948p;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class BackgroundElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0712m f6562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f6563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M f6564d;

    public BackgroundElement(long j4, z zVar, M m6, int i) {
        j4 = (i & 1) != 0 ? r.f9085l : j4;
        zVar = (i & 2) != 0 ? null : zVar;
        this.f6561a = j4;
        this.f6562b = zVar;
        this.f6563c = 1.0f;
        this.f6564d = m6;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && r.c(this.f6561a, backgroundElement.f6561a) && k.a(this.f6562b, backgroundElement.f6562b) && this.f6563c == backgroundElement.f6563c && k.a(this.f6564d, backgroundElement.f6564d);
    }

    public final int hashCode() {
        int i = r.f9086m;
        int iHashCode = Long.hashCode(this.f6561a) * 31;
        AbstractC0712m abstractC0712m = this.f6562b;
        return this.f6564d.hashCode() + p012c.k.i(this.f6563c, (iHashCode + (abstractC0712m != null ? abstractC0712m.hashCode() : 0)) * 31, 31);
    }

    @Override // p124x0.Q
    public final n l() {
        C0948p c0948p = new C0948p();
        c0948p.f12391u = this.f6561a;
        c0948p.f12392v = this.f6562b;
        c0948p.f12393w = this.f6563c;
        c0948p.f12394x = this.f6564d;
        c0948p.f12395y = 9205357640488583168L;
        return c0948p;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        C0948p c0948p = (C0948p) nVar;
        c0948p.f12391u = this.f6561a;
        c0948p.f12392v = this.f6562b;
        c0948p.f12393w = this.f6563c;
        c0948p.f12394x = this.f6564d;
    }
}
