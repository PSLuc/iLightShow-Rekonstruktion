package p5;

import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes.dex */
public final class I extends F {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d0 f10922o;

    public I(d0 d0Var, byte[] bArr, InetSocketAddress inetSocketAddress) {
        super(bArr, inetSocketAddress);
        if (d0Var == null) {
            throw new NullPointerException("identity cannot be null");
        }
        this.f10922o = d0Var;
    }

    @Override // p5.F, p5.O
    public final int t() {
        return this.f10922o.f10440a.length + 2 + super.t();
    }

    @Override // p5.F, p5.O
    public final String toString() {
        StringBuilder sb = new StringBuilder("\t\t Encoded identity value: ");
        sb.append(this.f10922o);
        String str = m5.s.f10493b;
        sb.append(str);
        return p012c.k.u(sb, super.toString(), str);
    }

    @Override // p5.F
    public final void x(m5.j jVar) {
        d0 d0Var = this.f10922o;
        jVar.b(d0Var.f10440a.length, 16);
        jVar.c(d0Var.f10440a);
        super.x(jVar);
    }
}
