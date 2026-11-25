package p5;

import B.AbstractC0013g0;
import c5.C0495p;
import java.net.InetSocketAddress;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Arrays;
import javax.security.auth.x500.X500Principal;
import org.eclipse.californium.scandium.dtls.HandshakeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class O extends C1.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Logger f10931m = LoggerFactory.getLogger((Class<?>) O.class);
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f10932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f10933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public O f10934l;

    /* JADX WARN: Code duplicated, block: B:127:0x03ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:128:0x03cb  */
    public static O q(P p6, m5.h hVar, C0495p c0495p, InetSocketAddress inetSocketAddress) throws HandshakeException {
        EnumC0852q enumC0852q;
        EnumC0852q enumC0852q2;
        O v6;
        O c0842g;
        EnumC0841f enumC0841f;
        O c0840e;
        switch (p6.ordinal()) {
            case 0:
                c0842g = new U(inetSocketAddress);
                if (hVar.b()) {
                    throw new HandshakeException(String.format("Too many bytes, %d left, message not completely parsed! message type %s", Integer.valueOf(hVar.f(-1).length), p6), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
                }
                return c0842g;
            case 1:
                C0850o c0850o = new C0850o(inetSocketAddress);
                c0850o.f11121n = c0.a(hVar.e(8), hVar.e(8));
                c0850o.f11122o = new f0(hVar.f(32));
                c0850o.f11123p = new t0(hVar.f(hVar.e(8)), 255);
                c0850o.f11124q = hVar.f(hVar.e(8));
                m5.h hVarD = hVar.d(hVar.e(16));
                q5.i iVar = q5.i.f11284p;
                ArrayList arrayList = new ArrayList();
                while (hVarD.b()) {
                    q5.i iVarE = q5.i.e(hVarD.e(16));
                    if (iVarE != null) {
                        arrayList.add(iVarE);
                    }
                }
                c0850o.f11125r = arrayList;
                m5.h hVarD2 = hVar.d(hVar.e(8));
                EnumC0852q enumC0852q3 = EnumC0852q.NULL;
                ArrayList arrayList2 = new ArrayList();
                while (hVarD2.b()) {
                    int iE = hVarD2.e(8);
                    if (iE == 0) {
                        enumC0852q = EnumC0852q.NULL;
                    } else if (iE != 1) {
                        EnumC0852q.f11135k.debug("Unknown compression method code: {}", Integer.valueOf(iE));
                        enumC0852q = null;
                    } else {
                        enumC0852q = EnumC0852q.DEFLATE;
                    }
                    if (enumC0852q != null) {
                        arrayList2.add(enumC0852q);
                    }
                }
                c0850o.f11126s = arrayList2;
                c0842g = c0850o;
                if (hVar.b()) {
                    c0850o.f11127t = T.b(hVar, inetSocketAddress);
                    c0842g = c0850o;
                }
                if (hVar.b()) {
                    return c0842g;
                }
                throw new HandshakeException(String.format("Too many bytes, %d left, message not completely parsed! message type %s", Integer.valueOf(hVar.f(-1).length), p6), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
            case 2:
                c0 c0VarA = c0.a(hVar.e(8), hVar.e(8));
                f0 f0Var = new f0(hVar.f(32));
                t0 t0Var = new t0(hVar.f(hVar.e(8)), 255);
                int iE2 = hVar.e(16);
                q5.i iVarE2 = q5.i.e(iE2);
                if (iVarE2 == null) {
                    throw new HandshakeException(AbstractC0013g0.i("Server selected unknown cipher suite [", Integer.toHexString(iE2), "]"), new C0838c(EnumC0837b.FATAL, EnumC0835a.HANDSHAKE_FAILURE, inetSocketAddress));
                }
                if (iVarE2 == q5.i.f11286r) {
                    throw new HandshakeException("Server tries to negotiate NULL cipher suite", new C0838c(EnumC0837b.FATAL, EnumC0835a.HANDSHAKE_FAILURE, inetSocketAddress));
                }
                int iE3 = hVar.e(8);
                if (iE3 == 0) {
                    enumC0852q2 = EnumC0852q.NULL;
                } else if (iE3 != 1) {
                    EnumC0852q.f11135k.debug("Unknown compression method code: {}", Integer.valueOf(iE3));
                    enumC0852q2 = null;
                } else {
                    enumC0852q2 = EnumC0852q.DEFLATE;
                }
                c0842g = new o0(c0VarA, f0Var, t0Var, iVarE2, enumC0852q2, hVar.b() ? T.b(hVar, inetSocketAddress) : null, inetSocketAddress);
                if (hVar.b()) {
                    return c0842g;
                }
                throw new HandshakeException(String.format("Too many bytes, %d left, message not completely parsed! message type %s", Integer.valueOf(hVar.f(-1).length), p6), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
            case 3:
                v6 = new V(c0.a(hVar.e(8), hVar.e(8)), hVar.f(hVar.e(8)), inetSocketAddress);
                c0842g = v6;
                if (hVar.b()) {
                    return c0842g;
                }
                throw new HandshakeException(String.format("Too many bytes, %d left, message not completely parsed! message type %s", Integer.valueOf(hVar.f(-1).length), p6), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
            case 4:
                if (c0495p == null) {
                    throw new N("HandshakeParameter must not be null!");
                }
                EnumC0843h enumC0843h = EnumC0843h.RAW_PUBLIC_KEY;
                Logger logger = C0840e.f11040s;
                EnumC0843h enumC0843h2 = (EnumC0843h) c0495p.f7476j;
                if (enumC0843h != enumC0843h2) {
                    if (EnumC0843h.X_509 != enumC0843h2) {
                        throw new IllegalArgumentException("Certificate type " + enumC0843h2 + " not supported!");
                    }
                    logger.debug("Parsing X.509 CERTIFICATE message");
                    ArrayList arrayList3 = new ArrayList();
                    m5.h hVarD3 = hVar.d(hVar.e(24));
                    try {
                        CertificateFactory certificateFactory = (CertificateFactory) C0840e.f11042u.b();
                        while (hVarD3.b()) {
                            arrayList3.add(certificateFactory.generateCertificate(hVarD3.c(hVarD3.e(24))));
                        }
                        c0840e = new C0840e(certificateFactory.generateCertPath(arrayList3), inetSocketAddress);
                    } catch (GeneralSecurityException e6) {
                        throw new HandshakeException("Cannot parse X.509 certificate chain provided by peer", new C0838c(EnumC0837b.FATAL, EnumC0835a.BAD_CERTIFICATE, inetSocketAddress), e6);
                    }
                    break;
                } else {
                    logger.debug("Parsing RawPublicKey CERTIFICATE message");
                    c0840e = new C0840e(hVar.f(hVar.e(24)), inetSocketAddress);
                }
                c0842g = c0840e;
                if (hVar.b()) {
                    return c0842g;
                }
                throw new HandshakeException(String.format("Too many bytes, %d left, message not completely parsed! message type %s", Integer.valueOf(hVar.f(-1).length), p6), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
            case 5:
                if (c0495p == null) {
                    throw new N("HandshakeParameter must not be null!");
                }
                int iOrdinal = ((q5.f) c0495p.i).ordinal();
                if (iOrdinal == 7) {
                    c0840e = new b0(hVar.f(hVar.e(16)), inetSocketAddress);
                    c0842g = c0840e;
                    if (hVar.b()) {
                        return c0842g;
                    }
                    throw new HandshakeException(String.format("Too many bytes, %d left, message not completely parsed! message type %s", Integer.valueOf(hVar.f(-1).length), p6), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
                }
                if (iOrdinal != 8) {
                    if (iOrdinal != 9) {
                        throw new HandshakeException("Unsupported key exchange algorithm", new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, inetSocketAddress));
                    }
                    Logger logger2 = H.f10920q;
                    C0495p c0495pX = G.x(hVar, inetSocketAddress);
                    x0 x0Var = new x0(5, 4, null);
                    if (hVar.b()) {
                        x0 x0Var2 = new x0(hVar.e(8), hVar.e(8));
                        hVar.f(hVar.e(16));
                        x0Var = x0Var2;
                    }
                    v6 = new H(x0Var, (q5.w) c0495pX.i, (byte[]) c0495pX.f7476j, inetSocketAddress);
                } else {
                    if (inetSocketAddress == null) {
                        throw new NullPointerException("peer address cannot be null");
                    }
                    byte[] bArrF = hVar.f(hVar.e(16));
                    C0495p c0495pX2 = G.x(hVar, inetSocketAddress);
                    v6 = new J(bArrF, (q5.w) c0495pX2.i, (byte[]) c0495pX2.f7476j, inetSocketAddress);
                }
                c0842g = v6;
                if (hVar.b()) {
                    return c0842g;
                }
                throw new HandshakeException(String.format("Too many bytes, %d left, message not completely parsed! message type %s", Integer.valueOf(hVar.f(-1).length), p6), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
            case 6:
                Logger logger3 = C0842g.f11054r;
                ArrayList arrayList4 = new ArrayList();
                m5.h hVarD4 = hVar.d(hVar.e(8));
                while (hVarD4.b()) {
                    int iE4 = hVarD4.e(8);
                    EnumC0841f[] enumC0841fArrValues = EnumC0841f.values();
                    int length = enumC0841fArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            enumC0841f = null;
                        }
                        enumC0841f = enumC0841fArrValues[i];
                        if (enumC0841f.f11052h == iE4) {
                        }
                        i++;
                        break;
                        break;
                    }
                    arrayList4.add(enumC0841f);
                }
                ArrayList arrayList5 = new ArrayList();
                m5.h hVarD5 = hVar.d(hVar.e(16));
                while (hVarD5.b()) {
                    arrayList5.add(new x0(hVarD5.e(8), hVarD5.e(8)));
                }
                ArrayList arrayList6 = new ArrayList();
                m5.h hVarD6 = hVar.d(hVar.e(16));
                while (hVarD6.b()) {
                    arrayList6.add(new X500Principal(hVarD6.f(hVarD6.e(16))));
                }
                c0842g = new C0842g(arrayList4, arrayList5, arrayList6, inetSocketAddress);
                if (hVar.b()) {
                    return c0842g;
                }
                throw new HandshakeException(String.format("Too many bytes, %d left, message not completely parsed! message type %s", Integer.valueOf(hVar.f(-1).length), p6), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
            case 7:
                c0842g = new p0(inetSocketAddress);
                if (hVar.b()) {
                    return c0842g;
                }
                throw new HandshakeException(String.format("Too many bytes, %d left, message not completely parsed! message type %s", Integer.valueOf(hVar.f(-1).length), p6), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
            case 8:
                Logger logger4 = C0845j.f11082p;
                x0 x0Var3 = new x0(hVar.e(8), hVar.e(8));
                byte[] bArrF2 = hVar.f(hVar.e(16));
                C0845j c0845j = new C0845j(x0Var3, inetSocketAddress);
                c0845j.f11083n = Arrays.copyOf(bArrF2, bArrF2.length);
                c0840e = c0845j;
                c0842g = c0840e;
                if (hVar.b()) {
                    return c0842g;
                }
                throw new HandshakeException(String.format("Too many bytes, %d left, message not completely parsed! message type %s", Integer.valueOf(hVar.f(-1).length), p6), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
            case 9:
                if (c0495p == null) {
                    throw new N("HandshakeParameter must not be null!");
                }
                int iOrdinal2 = ((q5.f) c0495p.i).ordinal();
                if (iOrdinal2 == 7) {
                    c0840e = new C0836a0(hVar.f(hVar.e(16)), inetSocketAddress);
                } else {
                    if (iOrdinal2 == 8) {
                        if (inetSocketAddress == null) {
                            throw new NullPointerException("peer address cannot be null");
                        }
                        v6 = new I(d0.c(hVar.f(hVar.e(16))), hVar.f(hVar.e(8)), inetSocketAddress);
                        c0842g = v6;
                        if (hVar.b()) {
                            return c0842g;
                        }
                        throw new HandshakeException(String.format("Too many bytes, %d left, message not completely parsed! message type %s", Integer.valueOf(hVar.f(-1).length), p6), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
                    }
                    if (iOrdinal2 != 9) {
                        throw new HandshakeException("Unknown key exchange algorithm", new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, inetSocketAddress));
                    }
                    c0840e = new F(hVar.f(hVar.e(8)), inetSocketAddress);
                }
                c0842g = c0840e;
                if (hVar.b()) {
                    return c0842g;
                }
                throw new HandshakeException(String.format("Too many bytes, %d left, message not completely parsed! message type %s", Integer.valueOf(hVar.f(-1).length), p6), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
            case 10:
                c0842g = new K(hVar, inetSocketAddress);
                if (hVar.b()) {
                    return c0842g;
                }
                throw new HandshakeException(String.format("Too many bytes, %d left, message not completely parsed! message type %s", Integer.valueOf(hVar.f(-1).length), p6), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
            default:
                throw new HandshakeException("Cannot parse unsupported message type " + p6, new C0838c(EnumC0837b.FATAL, EnumC0835a.UNEXPECTED_MESSAGE, inetSocketAddress));
        }
    }

    @Override // p5.B
    public byte[] d() {
        byte[] bArr = this.f10932j;
        if (bArr != null) {
            return bArr;
        }
        if (this.f10933k == null) {
            m5.j jVar = new m5.j(r() + 12);
            w(jVar);
            this.f10933k = jVar.a();
        }
        return this.f10933k;
    }

    @Override // p5.B
    public final EnumC0857w g() {
        return EnumC0857w.HANDSHAKE;
    }

    public abstract byte[] p();

    public int r() {
        return t();
    }

    public int s() {
        return 0;
    }

    @Override // p5.B
    public final int size() {
        return r() + 12;
    }

    public abstract int t();

    public String toString() {
        StringBuilder sb = new StringBuilder("\tHandshake Protocol");
        String str = m5.s.f10493b;
        sb.append(str);
        sb.append("\tType: ");
        sb.append(u());
        sb.append(str);
        sb.append("\tPeer: ");
        sb.append((InetSocketAddress) this.f603h);
        sb.append(str);
        sb.append("\tMessage Sequence No: ");
        sb.append(this.i);
        sb.append(str);
        sb.append("\tLength: ");
        sb.append(t());
        sb.append(str);
        return sb.toString();
    }

    public abstract P u();

    public final void v(int i) {
        if (this.f10933k != null) {
            throw new IllegalStateException("message is already serialized!");
        }
        this.i = i;
    }

    public final void w(m5.j jVar) {
        jVar.b(u().f10946h, 8);
        jVar.b(t(), 24);
        jVar.b(this.i, 16);
        jVar.b(s(), 24);
        jVar.b(r(), 24);
        jVar.c(p());
    }
}
