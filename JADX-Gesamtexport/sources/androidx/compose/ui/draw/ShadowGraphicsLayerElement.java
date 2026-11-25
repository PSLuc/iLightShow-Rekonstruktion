package androidx.compose.ui.draw;

import E4.k;
import S0.e;
import Z.n;
import p035g0.C0711l;
import p035g0.M;
import p035g0.r;
import p124x0.AbstractC1098f;
import p124x0.Q;
import p124x0.Y;

/* JADX INFO: loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f6690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6693e;

    public ShadowGraphicsLayerElement(float f6, M m6, boolean z5, long j4, long j6) {
        this.f6689a = f6;
        this.f6690b = m6;
        this.f6691c = z5;
        this.f6692d = j4;
        this.f6693e = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return e.a(this.f6689a, shadowGraphicsLayerElement.f6689a) && k.a(this.f6690b, shadowGraphicsLayerElement.f6690b) && this.f6691c == shadowGraphicsLayerElement.f6691c && r.c(this.f6692d, shadowGraphicsLayerElement.f6692d) && r.c(this.f6693e, shadowGraphicsLayerElement.f6693e);
    }

    public final int hashCode() {
        int iM = p012c.k.m(this.f6691c, (this.f6690b.hashCode() + (Float.hashCode(this.f6689a) * 31)) * 31, 31);
        int i = r.f9086m;
        return Long.hashCode(this.f6693e) + p012c.k.l(iM, 31, this.f6692d);
    }

    @Override // p124x0.Q
    public final n l() {
        return new C0711l(new A2.e(24, this));
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        C0711l c0711l = (C0711l) nVar;
        c0711l.f9072u = new A2.e(24, this);
        Y y2 = AbstractC1098f.q(c0711l, 2).f13990t;
        if (y2 != null) {
            y2.h1(c0711l.f9072u, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) e.b(this.f6689a));
        sb.append(", shape=");
        sb.append(this.f6690b);
        sb.append(", clip=");
        sb.append(this.f6691c);
        sb.append(", ambientColor=");
        p012c.k.z(this.f6692d, sb, ", spotColor=");
        sb.append((Object) r.i(this.f6693e));
        sb.append(')');
        return sb.toString();
    }
}
