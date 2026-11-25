package androidx.compose.ui.graphics;

import A2.e;
import E4.k;
import Z.n;
import p035g0.M;
import p035g0.N;
import p035g0.P;
import p035g0.r;
import p124x0.AbstractC1098f;
import p124x0.Q;
import p124x0.Y;

/* JADX INFO: loaded from: classes.dex */
final class GraphicsLayerElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f6710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f6711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f6712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final M f6714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6715h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f6716j;

    public GraphicsLayerElement(float f6, float f7, float f8, float f9, float f10, long j4, M m6, boolean z5, long j6, long j7) {
        this.f6708a = f6;
        this.f6709b = f7;
        this.f6710c = f8;
        this.f6711d = f9;
        this.f6712e = f10;
        this.f6713f = j4;
        this.f6714g = m6;
        this.f6715h = z5;
        this.i = j6;
        this.f6716j = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f6708a, graphicsLayerElement.f6708a) == 0 && Float.compare(this.f6709b, graphicsLayerElement.f6709b) == 0 && Float.compare(this.f6710c, graphicsLayerElement.f6710c) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f6711d, graphicsLayerElement.f6711d) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f6712e, graphicsLayerElement.f6712e) == 0 && Float.compare(8.0f, 8.0f) == 0 && P.a(this.f6713f, graphicsLayerElement.f6713f) && k.a(this.f6714g, graphicsLayerElement.f6714g) && this.f6715h == graphicsLayerElement.f6715h && r.c(this.i, graphicsLayerElement.i) && r.c(this.f6716j, graphicsLayerElement.f6716j);
    }

    public final int hashCode() {
        int i = p012c.k.i(8.0f, p012c.k.i(this.f6712e, p012c.k.i(0.0f, p012c.k.i(0.0f, p012c.k.i(this.f6711d, p012c.k.i(0.0f, p012c.k.i(0.0f, p012c.k.i(this.f6710c, p012c.k.i(this.f6709b, Float.hashCode(this.f6708a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i3 = P.f9052c;
        int iM = p012c.k.m(this.f6715h, (this.f6714g.hashCode() + p012c.k.l(i, 31, this.f6713f)) * 31, 961);
        int i6 = r.f9086m;
        return Integer.hashCode(0) + p012c.k.l(p012c.k.l(iM, 31, this.i), 31, this.f6716j);
    }

    @Override // p124x0.Q
    public final n l() {
        N n6 = new N();
        n6.f9044u = this.f6708a;
        n6.f9045v = this.f6709b;
        n6.f9046w = this.f6710c;
        n6.f9047x = this.f6711d;
        n6.f9048y = this.f6712e;
        n6.f9049z = 8.0f;
        n6.f9038A = this.f6713f;
        n6.f9039B = this.f6714g;
        n6.f9040C = this.f6715h;
        n6.f9041D = this.i;
        n6.f9042E = this.f6716j;
        n6.f9043F = new e(25, n6);
        return n6;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        N n6 = (N) nVar;
        n6.f9044u = this.f6708a;
        n6.f9045v = this.f6709b;
        n6.f9046w = this.f6710c;
        n6.f9047x = this.f6711d;
        n6.f9048y = this.f6712e;
        n6.f9049z = 8.0f;
        n6.f9038A = this.f6713f;
        n6.f9039B = this.f6714g;
        n6.f9040C = this.f6715h;
        n6.f9041D = this.i;
        n6.f9042E = this.f6716j;
        Y y2 = AbstractC1098f.q(n6, 2).f13990t;
        if (y2 != null) {
            y2.h1(n6.f9043F, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.f6708a);
        sb.append(", scaleY=");
        sb.append(this.f6709b);
        sb.append(", alpha=");
        sb.append(this.f6710c);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f6711d);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f6712e);
        sb.append(", cameraDistance=8.0, transformOrigin=");
        sb.append((Object) P.d(this.f6713f));
        sb.append(", shape=");
        sb.append(this.f6714g);
        sb.append(", clip=");
        sb.append(this.f6715h);
        sb.append(", renderEffect=null, ambientShadowColor=");
        p012c.k.z(this.i, sb, ", spotShadowColor=");
        sb.append((Object) r.i(this.f6716j));
        sb.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb.toString();
    }
}
