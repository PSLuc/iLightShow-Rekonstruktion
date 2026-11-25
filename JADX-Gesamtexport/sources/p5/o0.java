package p5;

import java.net.InetSocketAddress;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends O {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c0 f11128n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f0 f11129o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t0 f11130p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q5.i f11131q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final EnumC0852q f11132r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final T f11133s;

    public o0(c0 c0Var, f0 f0Var, t0 t0Var, q5.i iVar, EnumC0852q enumC0852q, T t6, InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        if (c0Var == null) {
            throw new NullPointerException("Negotiated protocol version must not be null");
        }
        if (f0Var == null) {
            throw new NullPointerException("ServerHello message must contain a random");
        }
        if (t0Var == null) {
            throw new NullPointerException("ServerHello must be associated with a session ID");
        }
        if (iVar == null) {
            throw new NullPointerException("Negotiated cipher suite must not be null");
        }
        if (enumC0852q == null) {
            throw new NullPointerException("Negotiated compression method must not be null");
        }
        this.f11128n = c0Var;
        this.f11129o = f0Var;
        this.f11130p = t0Var;
        this.f11131q = iVar;
        this.f11132r = enumC0852q;
        this.f11133s = t6;
    }

    @Override // p5.O
    public final byte[] p() {
        m5.j jVar = new m5.j(false);
        c0 c0Var = this.f11128n;
        jVar.b(c0Var.i, 8);
        jVar.b(c0Var.f11036h, 8);
        jVar.c(this.f11129o.f10440a);
        t0 t0Var = this.f11130p;
        jVar.b(t0Var.f10440a.length, 8);
        jVar.c(t0Var.f10440a);
        jVar.b(this.f11131q.f11290h, 16);
        jVar.b(this.f11132r.f11137h, 8);
        T t6 = this.f11133s;
        if (t6 != null) {
            jVar.c(t6.e());
        }
        return jVar.a();
    }

    @Override // p5.O
    public final int t() {
        T t6 = this.f11133s;
        return this.f11130p.f10440a.length + 38 + ((t6 == null || t6.f11002a.isEmpty()) ? 0 : t6.d() + 2);
    }

    @Override // p5.O
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\t\tServer Version: ");
        c0 c0Var = this.f11128n;
        sb.append(c0Var.i);
        sb.append(", ");
        sb.append(c0Var.f11036h);
        String str = m5.s.f10493b;
        sb.append(str);
        sb.append("\t\tRandom:");
        sb.append(this.f11129o);
        sb.append(str);
        sb.append("\t\tSession ID Length: ");
        t0 t0Var = this.f11130p;
        sb.append(t0Var.f10440a.length);
        if (t0Var.f10440a.length > 0) {
            sb.append(str);
            sb.append("\t\tSession ID: ");
            sb.append(t0Var);
        }
        sb.append(str);
        sb.append("\t\tCipher Suite: ");
        sb.append(this.f11131q);
        sb.append(str);
        sb.append("\t\tCompression Method: ");
        sb.append(this.f11132r);
        T t6 = this.f11133s;
        if (t6 != null) {
            sb.append(str);
            sb.append(t6);
        }
        return sb.toString();
    }

    @Override // p5.O
    public final P u() {
        return P.SERVER_HELLO;
    }

    public final EnumC0843h x(int i) {
        AbstractC0844i abstractC0844i;
        EnumC0843h enumC0843h = EnumC0843h.X_509;
        T t6 = this.f11133s;
        if (t6 != null && (abstractC0844i = (AbstractC0844i) T.c(i, t6.f11002a)) != null) {
            List list = abstractC0844i.f11071c;
            if (!list.isEmpty()) {
                return (EnumC0843h) list.get(0);
            }
        }
        return enumC0843h;
    }
}
