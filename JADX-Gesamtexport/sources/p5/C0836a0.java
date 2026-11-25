package p5;

import java.net.InetSocketAddress;

/* JADX INFO: renamed from: p5.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0836a0 extends AbstractC0851p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d0 f11028n;

    public C0836a0(d0 d0Var, InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        this.f11028n = d0Var;
    }

    @Override // p5.O
    public final byte[] p() {
        m5.j jVar = new m5.j(false);
        d0 d0Var = this.f11028n;
        jVar.b(d0Var.f10440a.length, 16);
        jVar.c(d0Var.f10440a);
        return jVar.a();
    }

    @Override // p5.O
    public final int t() {
        return this.f11028n.f10440a.length + 2;
    }

    @Override // p5.O
    public final String toString() {
        return super.toString() + "\t\tPSK Identity: " + this.f11028n + m5.s.f10493b;
    }

    public C0836a0(byte[] bArr, InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        this.f11028n = d0.c(bArr);
    }
}
