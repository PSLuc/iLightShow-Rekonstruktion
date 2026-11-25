package p5;

import java.net.InetSocketAddress;
import java.security.MessageDigest;
import java.util.Arrays;
import org.eclipse.californium.scandium.dtls.HandshakeException;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends C0849n {

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public static final F.L[] f11087E0 = {new F.L(P.HELLO_VERIFY_REQUEST, 0), new F.L(P.SERVER_HELLO), new F.L(6), new F.L(P.FINISHED)};

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f11088D0;

    @Override // p5.C0849n
    public final void H(o0 o0Var) throws HandshakeException {
        C c6 = this.f10995v;
        boolean zEquals = c6.i.equals(o0Var.f11130p);
        InetSocketAddress inetSocketAddress = (InetSocketAddress) o0Var.f603h;
        if (!zEquals) {
            this.f10976h.debug("Server [{}] refuses to resume session [{}], performing full handshake instead...", inetSocketAddress, c6.i);
            this.f11088D0 = true;
            this.f10974f0 = C0849n.f11090B0;
            super.H(o0Var);
            return;
        }
        if (!o0Var.f11132r.equals(c6.f10900o)) {
            throw new HandshakeException("Server wants to change compression method in resumed session", new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, inetSocketAddress));
        }
        if (!o0Var.f11131q.equals(c6.f10898m)) {
            throw new HandshakeException("Server wants to change cipher suite in resumed session", new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, inetSocketAddress));
        }
        J(o0Var);
        this.f10981k = o0Var.f11129o;
        this.f10975g0 = true;
        t5.b bVarA = t5.c.a(c6.f10901p);
        this.f10983l = bVarA;
        d(bVarA);
    }

    @Override // p5.C0849n
    public final void I() throws HandshakeException {
        m();
        c0 c0Var = c0.f11035j;
        C c6 = this.f10995v;
        C0850o c0850o = new C0850o(c0Var, c6.i, Arrays.asList(c6.f10898m), this.f11101w0, this.f11100v0, this.f11102x0, this.f11099t0, c6.f10894h);
        c0850o.x((c6.f10906u == 0 ? AbstractC0859y.f11174j : c6.f10904s).i);
        this.f10979j = c0850o.f11122o;
        c0850o.x(c6.f10900o);
        E(c0850o);
        this.f11097r0 = c0850o;
        this.f10950D = 1;
        A a6 = new A(c6, this.f10950D);
        D(a6, c0850o);
        x(a6);
        this.f10974f0 = f11087E0;
        this.f10973e0 = 0;
    }

    @Override // p5.C0849n, p5.Q
    public final void f(O o6) throws HandshakeException {
        if (this.f11088D0) {
            super.f(o6);
            return;
        }
        int iOrdinal = o6.u().ordinal();
        if (iOrdinal == 2) {
            H((o0) o6);
            return;
        }
        if (iOrdinal == 3) {
            G((V) o6);
            return;
        }
        if (iOrdinal != 10) {
            P pU = o6.u();
            InetSocketAddress inetSocketAddress = (InetSocketAddress) o6.f603h;
            throw new HandshakeException(String.format("Received unexpected handshake message [%s] from peer %s", pU, inetSocketAddress), new C0838c(EnumC0837b.FATAL, EnumC0835a.UNEXPECTED_MESSAGE, inetSocketAddress));
        }
        K k3 = (K) o6;
        InetSocketAddress inetSocketAddress2 = (InetSocketAddress) k3.f603h;
        this.f10950D += 2;
        int i = this.f10950D;
        C c6 = this.f10995v;
        A a6 = new A(c6, i);
        MessageDigest messageDigestI = i();
        try {
            MessageDigest messageDigest = (MessageDigest) messageDigestI.clone();
            k3.x(c6.f10898m.d(), this.f10983l, false, messageDigestI.digest());
            D(a6, new C0847l(inetSocketAddress2));
            A();
            messageDigest.update(k3.f10932j);
            this.f11104z0 = messageDigest.digest();
            D(a6, new K(c6.f10898m.d(), this.f10983l, this.i, this.f11104z0, (InetSocketAddress) k3.f603h));
            this.f10999z = true;
            a6.f10881n = false;
            x(a6);
            y();
        } catch (CloneNotSupportedException unused) {
            throw new HandshakeException("Cannot create FINISHED message hash", new C0838c(EnumC0837b.FATAL, EnumC0835a.INTERNAL_ERROR, inetSocketAddress2));
        }
    }
}
