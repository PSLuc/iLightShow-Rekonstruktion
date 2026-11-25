package p5;

import java.net.InetSocketAddress;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import org.eclipse.californium.scandium.dtls.HandshakeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public final class K extends O {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Logger f10924o = LoggerFactory.getLogger((Class<?>) K.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f10925n;

    public K(Mac mac, t5.b bVar, boolean z5, byte[] bArr, InetSocketAddress inetSocketAddress) {
        byte[] bArrX;
        super(inetSocketAddress);
        if (z5) {
            q5.l lVar = q5.l.CLIENT_FINISHED_LABEL;
            byte[] bArr2 = lVar.f11312h;
            int i = lVar.i;
            try {
                mac.init(bVar);
                bArrX = p027e3.a.X(mac, bArr2, bArr, i);
                mac.reset();
            } catch (InvalidKeyException e6) {
                throw new IllegalArgumentException("Cannot run Pseudo Random Function with invalid key", e6);
            }
        } else {
            q5.l lVar2 = q5.l.SERVER_FINISHED_LABEL;
            byte[] bArr3 = lVar2.f11312h;
            int i3 = lVar2.i;
            try {
                mac.init(bVar);
                bArrX = p027e3.a.X(mac, bArr3, bArr, i3);
                mac.reset();
            } catch (InvalidKeyException e7) {
                throw new IllegalArgumentException("Cannot run Pseudo Random Function with invalid key", e7);
            }
        }
        this.f10925n = bArrX;
    }

    @Override // p5.O
    public final byte[] p() {
        return this.f10925n;
    }

    @Override // p5.O
    public final int t() {
        return this.f10925n.length;
    }

    @Override // p5.O
    public final String toString() {
        return super.toString() + "\t\tVerify Data: " + m5.s.b(0, this.f10925n) + m5.s.f10493b;
    }

    @Override // p5.O
    public final P u() {
        return P.FINISHED;
    }

    public final void x(Mac mac, t5.b bVar, boolean z5, byte[] bArr) throws HandshakeException {
        byte[] bArrX;
        if (z5) {
            q5.l lVar = q5.l.CLIENT_FINISHED_LABEL;
            byte[] bArr2 = lVar.f11312h;
            int i = lVar.i;
            try {
                mac.init(bVar);
                bArrX = p027e3.a.X(mac, bArr2, bArr, i);
                mac.reset();
            } catch (InvalidKeyException e6) {
                throw new IllegalArgumentException("Cannot run Pseudo Random Function with invalid key", e6);
            }
        } else {
            q5.l lVar2 = q5.l.SERVER_FINISHED_LABEL;
            byte[] bArr3 = lVar2.f11312h;
            int i3 = lVar2.i;
            try {
                mac.init(bVar);
                bArrX = p027e3.a.X(mac, bArr3, bArr, i3);
                mac.reset();
            } catch (InvalidKeyException e7) {
                throw new IllegalArgumentException("Cannot run Pseudo Random Function with invalid key", e7);
            }
        }
        byte[] bArr4 = this.f10925n;
        if (MessageDigest.isEqual(bArrX, bArr4)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Verification of peer's [");
        InetSocketAddress inetSocketAddress = (InetSocketAddress) this.f603h;
        sb.append(inetSocketAddress);
        sb.append("] FINISHED message failed");
        Logger logger = f10924o;
        if (logger.isTraceEnabled()) {
            String str = m5.s.f10493b;
            sb.append(str);
            sb.append("Expected: ");
            sb.append(m5.s.b(0, bArrX));
            sb.append(str);
            sb.append("Received: ");
            sb.append(m5.s.b(0, bArr4));
        }
        logger.debug(sb.toString());
        throw new HandshakeException("Verification of FINISHED message failed", new C0838c(EnumC0837b.FATAL, EnumC0835a.HANDSHAKE_FAILURE, inetSocketAddress));
    }

    public K(m5.h hVar, InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        this.f10925n = hVar.f(-1);
    }
}
