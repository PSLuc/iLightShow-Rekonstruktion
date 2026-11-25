package p5;

import c5.C0495p;
import java.net.InetSocketAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: renamed from: p5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0845j extends O {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Logger f11082p = LoggerFactory.getLogger((Class<?>) C0845j.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f11083n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final x0 f11084o;

    static {
        new C0495p(new W2.g(29));
    }

    public C0845j(x0 x0Var, InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        this.f11084o = x0Var;
    }

    @Override // p5.O
    public final byte[] p() {
        m5.j jVar = new m5.j(false);
        x0 x0Var = this.f11084o;
        jVar.b(p012c.k.d(x0Var.f11170b), 8);
        jVar.b(p012c.k.e(x0Var.f11171c), 8);
        jVar.b(this.f11083n.length, 16);
        jVar.c(this.f11083n);
        return jVar.a();
    }

    @Override // p5.O
    public final int t() {
        return this.f11083n.length + 4;
    }

    @Override // p5.O
    public final P u() {
        return P.CERTIFICATE_VERIFY;
    }
}
