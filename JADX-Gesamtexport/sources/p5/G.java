package p5;

import c5.C0495p;
import java.net.InetSocketAddress;
import org.eclipse.californium.scandium.dtls.HandshakeException;

/* JADX INFO: loaded from: classes.dex */
public abstract class G extends q0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q5.w f10918n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f10919o;

    public G(q5.w wVar, byte[] bArr, InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        if (bArr == null) {
            throw new NullPointerException("encoded point cannot be null!");
        }
        this.f10918n = wVar;
        this.f10919o = bArr;
    }

    public static C0495p x(m5.h hVar, InetSocketAddress inetSocketAddress) {
        int i = 16;
        int iE = hVar.e(8);
        if (iE != 3) {
            throw new HandshakeException(String.format("Curve type [%s] received in ServerKeyExchange message from peer [%s] is unsupported", Integer.valueOf(iE), inetSocketAddress), new C0838c(EnumC0837b.FATAL, EnumC0835a.HANDSHAKE_FAILURE, inetSocketAddress));
        }
        int iE2 = hVar.e(16);
        q5.w wVar = q5.w.secp256r1;
        q5.w wVar2 = (q5.w) q5.x.f11343w.get(Integer.valueOf(iE2));
        if (wVar2 == null || !wVar2.f11329k) {
            throw new HandshakeException(String.format("Server used unsupported elliptic curve (%d) for ECDH", Integer.valueOf(iE2)), new C0838c(EnumC0837b.FATAL, EnumC0835a.HANDSHAKE_FAILURE, inetSocketAddress));
        }
        return new C0495p(wVar2, i, hVar.f(hVar.e(8)));
    }

    @Override // p5.O
    public String toString() {
        return super.toString() + "\t\tDiffie-Hellman public key: " + this.f10918n.name() + "-" + m5.s.b(10, this.f10919o) + m5.s.f10493b;
    }
}
