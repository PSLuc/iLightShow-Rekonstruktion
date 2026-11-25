package p5;

import java.net.InetSocketAddress;

/* JADX INFO: renamed from: p5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0847l extends C1.b {
    public final EnumC0846k i;

    public C0847l(InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        this.i = EnumC0846k.f11086h;
    }

    @Override // p5.B
    public final byte[] d() {
        m5.j jVar = new m5.j(false);
        this.i.getClass();
        jVar.b(1, 8);
        return jVar.a();
    }

    @Override // p5.B
    public final EnumC0857w g() {
        return EnumC0857w.CHANGE_CIPHER_SPEC;
    }

    @Override // p5.B
    public final int size() {
        return 1;
    }

    public final String toString() {
        return "\tChange Cipher Spec Message\n";
    }
}
