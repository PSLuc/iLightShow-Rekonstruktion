package p5;

import java.net.InetSocketAddress;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class V extends O {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c0 f11003n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f11004o;

    public V(c0 c0Var, byte[] bArr, InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        this.f11003n = c0Var;
        this.f11004o = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // p5.O
    public final byte[] p() {
        m5.j jVar = new m5.j(false);
        c0 c0Var = this.f11003n;
        jVar.b(c0Var.i, 8);
        jVar.b(c0Var.f11036h, 8);
        byte[] bArr = this.f11004o;
        jVar.b(bArr.length, 8);
        jVar.c(bArr);
        return jVar.a();
    }

    @Override // p5.O
    public final int t() {
        return this.f11004o.length + 3;
    }

    @Override // p5.O
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\t\tServer Version: ");
        c0 c0Var = this.f11003n;
        sb.append(c0Var.i);
        sb.append(", ");
        sb.append(c0Var.f11036h);
        String str = m5.s.f10493b;
        sb.append(str);
        sb.append("\t\tCookie Length: ");
        byte[] bArr = this.f11004o;
        sb.append(bArr.length);
        sb.append(str);
        sb.append("\t\tCookie: ");
        sb.append(m5.s.b(0, bArr));
        sb.append(str);
        return sb.toString();
    }

    @Override // p5.O
    public final P u() {
        return P.HELLO_VERIFY_REQUEST;
    }
}
