package p5;

import java.net.InetSocketAddress;
import java.security.MessageDigest;
import java.util.Collections;
import org.eclipse.californium.scandium.dtls.HandshakeException;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends n0 {

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public byte[] f11089E0;

    @Override // p5.n0, p5.Q
    public final void f(O o6) throws HandshakeException {
        int iOrdinal = o6.u().ordinal();
        C c6 = this.f10995v;
        if (iOrdinal != 1) {
            if (iOrdinal != 10) {
                P pU = o6.u();
                InetSocketAddress inetSocketAddress = (InetSocketAddress) o6.f603h;
                throw new HandshakeException(String.format("Received unexpected handshake message [%s] from peer %s", pU, inetSocketAddress), new C0838c(EnumC0837b.FATAL, EnumC0835a.UNEXPECTED_MESSAGE, inetSocketAddress));
            }
            ((K) o6).x(c6.f10898m.d(), this.f10983l, true, this.f11089E0);
            y();
            j();
            return;
        }
        C0850o c0850o = (C0850o) o6;
        m();
        boolean zContains = Collections.unmodifiableList(c0850o.f11125r).contains(c6.f10898m);
        InetSocketAddress inetSocketAddress2 = (InetSocketAddress) c0850o.f603h;
        if (!zContains) {
            throw new HandshakeException("Client wants to change cipher suite in resumed session", new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, inetSocketAddress2));
        }
        if (!Collections.unmodifiableList(c0850o.f11126s).contains(c6.f10900o)) {
            throw new HandshakeException("Client wants to change compression method in resumed session", new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, inetSocketAddress2));
        }
        this.f10979j = c0850o.f11122o;
        this.f10981k = new f0();
        q5.i iVar = c6.f10898m;
        T t6 = new T();
        F(c0850o, t6);
        G(c0850o, t6);
        this.f10950D += 2;
        A a6 = new A(c6, this.f10950D);
        D(a6, new o0(c0850o.f11121n, this.f10981k, c6.i, iVar, c6.f10900o, t6, (InetSocketAddress) c0850o.f603h));
        D(a6, new C0847l(inetSocketAddress2));
        MessageDigest messageDigestI = i();
        try {
            MessageDigest messageDigest = (MessageDigest) messageDigestI.clone();
            t5.b bVarA = t5.c.a(c6.f10901p);
            this.f10983l = bVarA;
            d(bVarA);
            A();
            B k3 = new K(c6.f10898m.d(), this.f10983l, false, messageDigestI.digest(), (InetSocketAddress) c0850o.f603h);
            D(a6, k3);
            messageDigest.update(k3.d());
            this.f11089E0 = messageDigest.digest();
            x(a6);
            this.f10974f0 = n0.f11106D0;
            this.f10973e0 = 0;
            this.f10975g0 = true;
        } catch (CloneNotSupportedException unused) {
            throw new HandshakeException("Cannot create FINISHED message hash", new C0838c(EnumC0837b.FATAL, EnumC0835a.INTERNAL_ERROR, inetSocketAddress2));
        }
    }
}
