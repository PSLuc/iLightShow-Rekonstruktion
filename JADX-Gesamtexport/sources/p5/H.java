package p5;

import java.net.InetSocketAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public final class H extends G {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Logger f10920q = LoggerFactory.getLogger((Class<?>) H.class);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x0 f10921p;

    public H(x0 x0Var, q5.w wVar, byte[] bArr, InetSocketAddress inetSocketAddress) {
        super(wVar, bArr, inetSocketAddress);
        if (x0Var == null) {
            throw new NullPointerException("signature and hash algorithm cannot be null");
        }
        this.f10921p = x0Var;
    }

    @Override // p5.O
    public final byte[] p() {
        m5.j jVar = new m5.j(false);
        jVar.b(3, 8);
        jVar.b(this.f10918n.f11327h, 16);
        byte[] bArr = this.f10919o;
        jVar.b(bArr.length, 8);
        jVar.c(bArr);
        return jVar.a();
    }

    @Override // p5.O
    public final int t() {
        return this.f10919o.length + 4;
    }

    @Override // p5.G, p5.O
    public final String toString() {
        return super.toString() + this.f10921p.toString() + "---" + m5.s.f10493b;
    }
}
