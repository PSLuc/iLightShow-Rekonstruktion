package p5;

import java.net.InetSocketAddress;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class M extends O {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final P f10930n;

    public M(P p6, InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        this.f10930n = p6;
    }

    @Override // p5.O
    public byte[] p() {
        byte[] bArr = this.f10932j;
        return Arrays.copyOfRange(bArr, 12, bArr.length);
    }

    @Override // p5.O
    public int t() {
        return this.f10932j.length - 12;
    }

    @Override // p5.O
    public P u() {
        return this.f10930n;
    }
}
