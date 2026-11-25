package p5;

import java.net.InetSocketAddress;

/* JADX INFO: renamed from: p5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0839d extends C1.b {
    public final byte[] i;

    public C0839d(byte[] bArr, InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        if (bArr == null) {
            throw new NullPointerException("data must not be null!");
        }
        this.i = bArr;
    }

    @Override // p5.B
    public final byte[] d() {
        return this.i;
    }

    @Override // p5.B
    public final EnumC0857w g() {
        return EnumC0857w.APPLICATION_DATA;
    }

    @Override // p5.B
    public final int size() {
        return this.i.length;
    }

    public final String toString() {
        return "\tApplication Data: " + m5.s.a(this.i) + m5.s.f10493b;
    }
}
