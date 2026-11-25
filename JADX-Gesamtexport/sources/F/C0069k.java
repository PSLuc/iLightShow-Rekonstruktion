package F;

import S1.h0;

/* JADX INFO: renamed from: F.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0069k implements V0.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z.c f1185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0070l f1186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1187c = 0;

    public C0069k(Z.c cVar, InterfaceC0070l interfaceC0070l) {
        this.f1185a = cVar;
        this.f1186b = interfaceC0070l;
    }

    @Override // V0.A
    public final long a(S0.i iVar, long j4, S0.k kVar, long j6) {
        long jA = this.f1186b.a();
        if (!p081p0.c.s0(jA)) {
            jA = this.f1187c;
        }
        this.f1187c = jA;
        return S0.h.c(S0.h.c(h0.c(iVar.f4892a, iVar.f4893b), h0.w(jA)), this.f1185a.a(j6, 0L, kVar));
    }
}
