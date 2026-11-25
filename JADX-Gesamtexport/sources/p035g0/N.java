package p035g0;

import A2.e;
import B.C0005c0;
import Z.n;
import p012c.k;
import p089q4.v;
import p113v0.E;
import p113v0.G;
import p113v0.H;
import p124x0.InterfaceC1114w;

/* JADX INFO: loaded from: classes.dex */
public final class N extends n implements InterfaceC1114w {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f9038A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public M f9039B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f9040C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f9041D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f9042E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public e f9043F;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f9044u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f9045v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f9046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f9047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f9048y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f9049z;

    @Override // p124x0.InterfaceC1114w
    public final G e(H h6, E e6, long j4) {
        p113v0.N nC = e6.c(j4);
        return h6.u(nC.f13137h, nC.i, v.f11238h, new C0005c0(nC, 28, this));
    }

    @Override // Z.n
    public final boolean o0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f9044u);
        sb.append(", scaleY=");
        sb.append(this.f9045v);
        sb.append(", alpha = ");
        sb.append(this.f9046w);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f9047x);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f9048y);
        sb.append(", cameraDistance=");
        sb.append(this.f9049z);
        sb.append(", transformOrigin=");
        sb.append((Object) P.d(this.f9038A));
        sb.append(", shape=");
        sb.append(this.f9039B);
        sb.append(", clip=");
        sb.append(this.f9040C);
        sb.append(", renderEffect=null, ambientShadowColor=");
        k.z(this.f9041D, sb, ", spotShadowColor=");
        sb.append((Object) r.i(this.f9042E));
        sb.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb.toString();
    }
}
