package p5;

import B.AbstractC0013g0;
import java.net.InetSocketAddress;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class L extends O {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f10926n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final P f10927o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f10928p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10929q;

    public L(P p6, int i, int i3, int i6, byte[] bArr, InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        this.f10927o = p6;
        this.f10928p = i;
        this.f10926n = Arrays.copyOf(bArr, bArr.length);
        this.f10929q = i6;
        v(i3);
    }

    @Override // p5.O
    public final byte[] p() {
        return this.f10926n;
    }

    @Override // p5.O
    public final int r() {
        return this.f10926n.length;
    }

    @Override // p5.O
    public final int s() {
        return this.f10929q;
    }

    @Override // p5.O
    public final int t() {
        return this.f10928p;
    }

    @Override // p5.O
    public final String toString() {
        StringBuilder sb = new StringBuilder("\tFragmented Handshake Protocol");
        String str = m5.s.f10493b;
        sb.append(str);
        sb.append("\tType: ");
        sb.append(this.f10927o);
        sb.append(str);
        sb.append("\tPeer: ");
        sb.append((InetSocketAddress) this.f603h);
        sb.append(str);
        sb.append("\tMessage Sequence No: ");
        sb.append(this.i);
        sb.append(str);
        sb.append("\tFragment Offset: ");
        sb.append(this.f10929q);
        sb.append(str);
        sb.append("\tFragment Length: ");
        sb.append(this.f10926n.length);
        sb.append(str);
        sb.append("\tLength: ");
        return AbstractC0013g0.l(sb, this.f10928p, str);
    }

    @Override // p5.O
    public final P u() {
        return this.f10927o;
    }
}
