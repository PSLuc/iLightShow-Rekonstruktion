package p5;

import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes.dex */
public class F extends AbstractC0851p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f10917n;

    public F(byte[] bArr, InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        if (bArr == null) {
            throw new NullPointerException("encoded point cannot be null");
        }
        this.f10917n = bArr;
    }

    @Override // p5.O
    public final byte[] p() {
        m5.j jVar = new m5.j(false);
        x(jVar);
        return jVar.a();
    }

    @Override // p5.O
    public int t() {
        return this.f10917n.length + 1;
    }

    @Override // p5.O
    public String toString() {
        return super.toString() + "\t\tDiffie-Hellman public value: " + m5.s.b(0, this.f10917n) + m5.s.f10493b;
    }

    public void x(m5.j jVar) {
        byte[] bArr = this.f10917n;
        jVar.b(bArr.length, 8);
        jVar.c(bArr);
    }
}
