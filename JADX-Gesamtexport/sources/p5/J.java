package p5;

import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes.dex */
public final class J extends G {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0 f10923p;

    public J(byte[] bArr, q5.w wVar, byte[] bArr2, InetSocketAddress inetSocketAddress) {
        super(wVar, bArr2, inetSocketAddress);
        this.f10923p = d0.c(bArr);
    }

    @Override // p5.O
    public final byte[] p() {
        m5.j jVar = new m5.j(false);
        d0 d0Var = this.f10923p;
        jVar.b(d0Var.f10440a.length, 16);
        jVar.c(d0Var.f10440a);
        jVar.b(3, 8);
        jVar.b(this.f10918n.f11327h, 16);
        byte[] bArr = this.f10919o;
        jVar.b(bArr.length, 8);
        jVar.c(bArr);
        return jVar.a();
    }

    @Override // p5.O
    public final int t() {
        return this.f10919o.length + 4 + this.f10923p.f10440a.length + 2;
    }

    @Override // p5.G, p5.O
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        d0 d0Var = this.f10923p;
        if (d0Var.b()) {
            sb.append("\t\tPSK Identity Hint: psk hint not present");
        } else {
            sb.append("\t\tPSK Identity Hint: ");
            sb.append(d0Var);
        }
        sb.append(m5.s.f10493b);
        sb.append(super.toString());
        return sb.toString();
    }

    public J(d0 d0Var, q5.x xVar, InetSocketAddress inetSocketAddress) {
        super(xVar.f11345h, xVar.f11346j, inetSocketAddress);
        if (d0Var != null) {
            this.f10923p = d0Var;
            return;
        }
        throw new NullPointerException("PSK hint must not be null");
    }
}
