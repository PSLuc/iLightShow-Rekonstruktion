package p112v;

import p101t.m0;

/* JADX INFO: renamed from: v.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1007u0 implements InterfaceC0970b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1017z0 f13068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1011w0 f13069b;

    public C1007u0(C1017z0 c1017z0, C1011w0 c1011w0) {
        this.f13068a = c1017z0;
        this.f13069b = c1011w0;
    }

    @Override // p112v.InterfaceC0970b0
    public final float a(float f6) {
        C1017z0 c1017z0 = this.f13068a;
        long jD = c1017z0.d(c1017z0.g(f6));
        C1017z0 c1017z1 = this.f13069b.f13086a;
        c1017z1.f13110g = 2;
        m0 m0Var = c1017z1.f13105b;
        return c1017z0.c(c1017z0.f((m0Var == null || !(c1017z1.f13104a.d() || c1017z1.f13104a.a())) ? C1017z0.a(c1017z1, c1017z1.f13111h, jD, 2) : m0Var.d(jD, c1017z1.f13110g, c1017z1.f13112j)));
    }
}
