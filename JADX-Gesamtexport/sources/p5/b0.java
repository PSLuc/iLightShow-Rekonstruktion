package p5;

import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends q0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d0 f11032n;

    public b0(byte[] bArr, InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        this.f11032n = d0.c(bArr);
    }

    @Override // p5.O
    public final byte[] p() {
        m5.j jVar = new m5.j(false);
        d0 d0Var = this.f11032n;
        jVar.b(d0Var.f10440a.length, 16);
        jVar.c(d0Var.f10440a);
        return jVar.a();
    }

    @Override // p5.O
    public final int t() {
        return this.f11032n.f10440a.length + 2;
    }

    @Override // p5.O
    public final String toString() {
        return super.toString() + "\t\tPSK Identity Hint: " + this.f11032n + m5.s.f10493b;
    }
}
