package p5;

import B.AbstractC0013g0;
import java.net.InetSocketAddress;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import org.eclipse.californium.scandium.dtls.HandshakeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f11072k = LoggerFactory.getLogger((Class<?>) i0.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC0857w f11073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f11074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public B f11079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f11080h;
    public C0855u i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InetSocketAddress f11081j;

    public i0(EnumC0857w enumC0857w, int i, long j4, B b6, C c6, boolean z5) {
        this(c0.f11035j, i, j4, 0L, c6 != null ? c6.f10894h : null, false);
        if (b6 == null) {
            throw new NullPointerException("Fragment must not be null");
        }
        if (c6 == null) {
            throw new NullPointerException("Session must not be null");
        }
        if (c6.f10894h == null) {
            throw new IllegalArgumentException("Session's peer address must not be null");
        }
        f(enumC0857w);
        if (z5) {
            this.i = c6.f10902q;
        }
        AbstractC0859y abstractC0859y = i == 0 ? AbstractC0859y.f11174j : c6.f10904s;
        byte[] bArrD = b6.d();
        if (bArrD == null) {
            throw new NullPointerException("fragment must not return null");
        }
        if (h()) {
            int length = bArrD.length;
            bArrD = Arrays.copyOf(bArrD, length + 1);
            bArrD[length] = (byte) this.f11073a.f11165h;
        }
        byte[] bArrC = abstractC0859y.c(this, bArrD);
        this.f11080h = bArrC;
        this.f11079g = b6;
        if (bArrC == null) {
            throw new IllegalArgumentException("Fragment missing encoded bytes!");
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0228 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x022a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0232  */
    public final void a(C c6) throws GeneralSecurityException, HandshakeException {
        EnumC0837b enumC0837b;
        InetSocketAddress inetSocketAddress;
        int i;
        int i3;
        P p6;
        O o6;
        int i6 = 1;
        B b6 = this.f11079g;
        Logger logger = f11072k;
        if (b6 != null) {
            logger.error("session already applied!");
            throw new IllegalArgumentException("session already applied!");
        }
        AbstractC0859y abstractC0859y = c6 == null ? AbstractC0859y.f11174j : c6.f10903r;
        EnumC0857w enumC0857w = this.f11073a;
        byte[] bArrB = abstractC0859y.b(this, this.f11080h);
        EnumC0857w enumC0857w2 = EnumC0857w.TLS12_CID;
        EnumC0835a enumC0835a = null;
        if (enumC0857w2 == this.f11073a) {
            int length = bArrB.length - 1;
            while (length >= 0 && bArrB[length] == 0) {
                length--;
            }
            if (length < 0) {
                throw new GeneralSecurityException("no inner type!");
            }
            byte b7 = bArrB[length];
            switch (b7) {
                case 20:
                    enumC0857w2 = EnumC0857w.CHANGE_CIPHER_SPEC;
                    break;
                case 21:
                    enumC0857w2 = EnumC0857w.ALERT;
                    break;
                case 22:
                    enumC0857w2 = EnumC0857w.HANDSHAKE;
                    break;
                case 23:
                    enumC0857w2 = EnumC0857w.APPLICATION_DATA;
                    break;
                case 24:
                default:
                    enumC0857w2 = null;
                    break;
                case 25:
                    break;
            }
            if (enumC0857w2 == null) {
                throw new GeneralSecurityException(p012c.k.r(b7, "unknown inner type! "));
            }
            bArrB = Arrays.copyOf(bArrB, length);
            enumC0857w = enumC0857w2;
        }
        int iOrdinal = enumC0857w.ordinal();
        int i7 = 8;
        if (iOrdinal != 0) {
            int i8 = 0;
            if (iOrdinal == 1) {
                InetSocketAddress inetSocketAddressD = d();
                m5.h hVar = new m5.h(bArrB, true);
                byte b8 = hVar.f(1)[0];
                byte b9 = hVar.f(1)[0];
                if (b8 == 1) {
                    enumC0837b = EnumC0837b.WARNING;
                } else if (b8 != 2) {
                    EnumC0837b enumC0837b2 = EnumC0837b.WARNING;
                    enumC0837b = null;
                } else {
                    enumC0837b = EnumC0837b.FATAL;
                }
                for (EnumC0835a enumC0835a2 : EnumC0835a.values()) {
                    if (enumC0835a2.f11027h == b9) {
                        enumC0835a = enumC0835a2;
                        if (enumC0837b != null) {
                            throw new HandshakeException(String.format("Unknown alert level code [%d]", Byte.valueOf(b8)), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddressD));
                        }
                        if (enumC0835a != null) {
                            throw new HandshakeException(String.format("Unknown alert description code [%d]", Byte.valueOf(b9)), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddressD));
                        }
                        this.f11079g = new C0838c(enumC0837b, enumC0835a, inetSocketAddressD);
                    }
                }
                if (enumC0837b != null) {
                    throw new HandshakeException(String.format("Unknown alert level code [%d]", Byte.valueOf(b8)), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddressD));
                }
                if (enumC0835a != null) {
                    throw new HandshakeException(String.format("Unknown alert description code [%d]", Byte.valueOf(b9)), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddressD));
                }
                this.f11079g = new C0838c(enumC0837b, enumC0835a, inetSocketAddressD);
            } else if (iOrdinal == 2) {
                InetSocketAddress inetSocketAddressD2 = d();
                Logger logger2 = O.f10931m;
                try {
                    m5.h hVar2 = new m5.h(bArrB, false);
                    O m6 = null;
                    O o7 = null;
                    int i9 = 0;
                    while (true) {
                        int iE = hVar2.e(i7);
                        P[] pArrValues = P.values();
                        int length2 = pArrValues.length;
                        int i10 = i8;
                        while (true) {
                            if (i10 < length2) {
                                i3 = i8;
                                p6 = pArrValues[i10];
                                i = i7;
                                if (p6.f10946h != iE) {
                                    i10 += i6;
                                    i8 = i3;
                                    i7 = i;
                                }
                            } else {
                                i = i7;
                                i3 = i8;
                                p6 = null;
                            }
                        }
                        if (p6 == null) {
                            throw new HandshakeException(String.format("Cannot parse unsupported message type %d", Integer.valueOf(iE)), new C0838c(EnumC0837b.FATAL, EnumC0835a.UNEXPECTED_MESSAGE, inetSocketAddressD2));
                        }
                        logger2.trace("Parsing HANDSHAKE message of type [{}]", p6);
                        int iE2 = hVar2.e(24);
                        int iE3 = hVar2.e(16);
                        int iE4 = hVar2.e(24);
                        int iE5 = hVar2.e(24);
                        int iA = hVar2.a() / 8;
                        if (iE5 > iA) {
                            throw new HandshakeException(String.format("Message %s fragment length %d exceed available data %d", p6, Integer.valueOf(iE5), Integer.valueOf(iA)), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddressD2));
                        }
                        m5.h hVarD = hVar2.d(iE5);
                        int length3 = bArrB.length - (hVar2.a() / 8);
                        if (iE2 != iE5) {
                            int i11 = iE5 + iE4;
                            if (i11 > iE2) {
                                throw new HandshakeException(String.format("Message %s fragment %d exceeds overall length %d", p6, Integer.valueOf(i11), Integer.valueOf(iE2)), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddressD2));
                            }
                            P p7 = p6;
                            inetSocketAddress = inetSocketAddressD2;
                            m6 = new L(p7, iE2, iE3, iE4, hVarD.f(-1), inetSocketAddressD2);
                        } else {
                            P p8 = p6;
                            inetSocketAddress = inetSocketAddressD2;
                            if (iE4 != 0) {
                                throw new HandshakeException("Message " + p8 + " unexpected fragment offset", new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
                            }
                            try {
                                m6 = O.q(p8, hVarD, null, inetSocketAddress);
                            } catch (N unused) {
                                m6 = new M(p8, inetSocketAddress);
                            }
                            m6.f10932j = Arrays.copyOfRange(bArrB, i9, length3);
                            m6.v(iE3);
                        }
                        if (o7 == null) {
                            o6 = m6;
                        } else {
                            m6.f10934l = m6;
                            o6 = o7;
                        }
                        try {
                            if (hVar2.b()) {
                                i9 = length3;
                                o7 = o6;
                                inetSocketAddressD2 = inetSocketAddress;
                                i7 = i;
                                i6 = 1;
                                i8 = i3;
                            } else {
                                this.f11079g = o6;
                            }
                        } catch (IllegalArgumentException e6) {
                            e = e6;
                            logger2.debug("Handshake message from peer [{}] malformed", inetSocketAddress, e);
                            throw new HandshakeException("Handshake message malformed, " + e.getMessage(), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
                        }
                    }
                } catch (IllegalArgumentException e7) {
                    e = e7;
                    inetSocketAddress = inetSocketAddressD2;
                }
            } else if (iOrdinal != 3) {
                logger.debug("Cannot decrypt message of unsupported type [{}]", this.f11073a);
            } else {
                this.f11079g = new C0839d(bArrB, d());
            }
        } else {
            InetSocketAddress inetSocketAddressD3 = d();
            int iE6 = new m5.h(bArrB, true).e(8);
            if (iE6 != 1) {
                throw new HandshakeException(p012c.k.r(iE6, "Unknown Change Cipher Spec code received: "), new C0838c(EnumC0837b.FATAL, EnumC0835a.HANDSHAKE_FAILURE, inetSocketAddressD3));
            }
            this.f11079g = new C0847l(inetSocketAddressD3);
        }
        this.f11073a = enumC0857w;
    }

    public final byte[] b(int i) {
        m5.j jVar = new m5.j(false);
        jVar.b(this.f11075c, 16);
        jVar.e(this.f11076d);
        if (h()) {
            jVar.b(25, 8);
        } else {
            jVar.b(this.f11073a.f11165h, 8);
        }
        c0 c0Var = this.f11074b;
        jVar.b(c0Var.i, 8);
        jVar.b(c0Var.f11036h, 8);
        if (h()) {
            C0855u c0855u = this.i;
            jVar.c(c0855u.f10440a);
            jVar.b(c0855u.f10440a.length, 8);
        }
        jVar.b(i, 16);
        return jVar.a();
    }

    public final B c() {
        B b6 = this.f11079g;
        if (b6 != null) {
            return b6;
        }
        throw new IllegalStateException("fragment not decoded!");
    }

    public final InetSocketAddress d() {
        InetSocketAddress inetSocketAddress = this.f11081j;
        if (inetSocketAddress != null) {
            return inetSocketAddress;
        }
        throw new NullPointerException("missing peer address!");
    }

    public final boolean e() {
        P p6;
        if (this.f11075c <= 0 && this.f11073a == EnumC0857w.HANDSHAKE) {
            byte[] bArr = this.f11080h;
            if (bArr.length != 0) {
                byte b6 = bArr[0];
                P[] pArrValues = P.values();
                int length = pArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        p6 = null;
                        break;
                    }
                    p6 = pArrValues[i];
                    if (p6.f10946h == b6) {
                        break;
                    }
                    i++;
                }
                if (p6 == P.CLIENT_HELLO) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(EnumC0857w enumC0857w) {
        if (enumC0857w == null) {
            throw new NullPointerException("Type must not be null");
        }
        int iOrdinal = enumC0857w.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            this.f11073a = enumC0857w;
        } else {
            throw new IllegalArgumentException("Not supported content type: " + enumC0857w);
        }
    }

    public final byte[] g() {
        m5.j jVar = new m5.j(false);
        if (h()) {
            jVar.b(25, 8);
        } else {
            jVar.b(this.f11073a.f11165h, 8);
        }
        c0 c0Var = this.f11074b;
        jVar.b(c0Var.i, 8);
        jVar.b(c0Var.f11036h, 8);
        jVar.b(this.f11075c, 16);
        jVar.e(this.f11076d);
        if (h()) {
            jVar.c(this.i.f10440a);
        }
        jVar.b(this.f11080h.length, 16);
        jVar.c(this.f11080h);
        return jVar.a();
    }

    public final boolean h() {
        C0855u c0855u = this.i;
        return (c0855u == null || c0855u.b()) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("==[ DTLS Record ]==============================================");
        String str = m5.s.f10493b;
        sb.append(str);
        sb.append("Content Type: ");
        sb.append(this.f11073a.toString());
        sb.append(str);
        sb.append("Peer address: ");
        sb.append(d());
        sb.append(str);
        sb.append("Version: ");
        c0 c0Var = this.f11074b;
        sb.append(c0Var.i);
        sb.append(", ");
        sb.append(c0Var.f11036h);
        sb.append(str);
        sb.append("Epoch: ");
        sb.append(this.f11075c);
        sb.append(str);
        sb.append("Sequence Number: ");
        sb.append(this.f11076d);
        C0855u c0855u = this.i;
        if (c0855u != null) {
            sb.append(str);
            sb.append("connection id: ");
            sb.append(c0855u.a());
        }
        sb.append(str);
        sb.append("Length: ");
        sb.append(this.f11080h.length);
        sb.append(str);
        sb.append("Fragment:");
        if (this.f11079g != null) {
            sb.append(str);
            sb.append(this.f11079g);
        } else {
            sb.append(str);
            sb.append("fragment is not decrypted yet");
        }
        return p012c.k.u(sb, str, "===============================================================");
    }

    public i0(c0 c0Var, int i, long j4, long j6, InetSocketAddress inetSocketAddress, boolean z5) {
        if (j4 > 281474976710655L) {
            throw new IllegalArgumentException(AbstractC0013g0.h("Sequence number must be 48 bits only! ", j4));
        }
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.h("Sequence number must not be less than 0! ", j4));
        }
        if (i >= 0) {
            this.f11074b = c0Var;
            this.f11075c = i;
            this.f11076d = j4;
            this.f11077e = j6;
            this.f11078f = z5;
            this.f11081j = inetSocketAddress;
            return;
        }
        throw new IllegalArgumentException(p012c.k.r(i, "Epoch must not be less than 0! "));
    }
}
