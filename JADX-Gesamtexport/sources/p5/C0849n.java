package p5;

import java.net.InetSocketAddress;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import org.eclipse.californium.scandium.dtls.HandshakeException;
import org.slf4j.Logger;

/* JADX INFO: renamed from: p5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0849n extends Q {

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final F.L[] f11090B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final F.L[] f11091C0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public x0 f11092A0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final c0 f11093n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f11094o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public G f11095p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AbstractC0851p f11096q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public C0850o f11097r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final List f11098s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final List f11099t0;
    public final boolean u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final List f11100v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final List f11101w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final List f11102x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public C0842g f11103y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public byte[] f11104z0;

    static {
        P p6 = P.HELLO_VERIFY_REQUEST;
        F.L l6 = new F.L(p6, 0);
        P p7 = P.SERVER_HELLO;
        F.L l7 = new F.L(p7);
        F.L l8 = new F.L(P.CERTIFICATE);
        P p8 = P.SERVER_KEY_EXCHANGE;
        F.L l9 = new F.L(p8);
        F.L l10 = new F.L(P.CERTIFICATE_REQUEST, 0);
        P p9 = P.SERVER_HELLO_DONE;
        F.L l11 = new F.L(p9);
        F.L l12 = new F.L(6);
        P p10 = P.FINISHED;
        f11090B0 = new F.L[]{l6, l7, l8, l9, l10, l11, l12, new F.L(p10)};
        f11091C0 = new F.L[]{new F.L(p6, 0), new F.L(p7), new F.L(p8, 0), new F.L(p9), new F.L(6), new F.L(p10)};
    }

    public C0849n(C c6, n5.g gVar, ScheduledExecutorService scheduledExecutorService, C0854t c0854t, o5.a aVar, boolean z5) {
        super(true, 0, c6, gVar, scheduledExecutorService, c0854t, aVar);
        this.f11093n0 = c0.f11035j;
        this.f11097r0 = null;
        this.f11103y0 = null;
        this.f11104z0 = null;
        this.f11098s0 = aVar.f10696s;
        this.f11099t0 = aVar.f10698u;
        this.u0 = aVar.f10674L.booleanValue();
        this.f11102x0 = aVar.f10691n;
        this.f11100v0 = aVar.f10690m;
        this.f11101w0 = aVar.f10697t;
        this.f11094o0 = z5;
    }

    public final void E(C0850o c0850o) {
        if (this.f10962T) {
            C c6 = this.f10995v;
            if (c6.H != null) {
                this.f10976h.debug("adding SNI extension to CLIENT_HELLO message [{}]", c6.G);
                r0 r0Var = new r0(c6.H);
                T t6 = c0850o.f11127t;
                if (t6 != null) {
                    t6.a(r0Var);
                }
            }
        }
    }

    public final d0 F() throws HandshakeException {
        boolean z5 = this.f10962T;
        C c6 = this.f10995v;
        t5.e eVar = z5 ? c6.H : null;
        if (eVar != null && !c6.I) {
            this.f10976h.warn("client is configured to use SNI but server does not support it, PSK authentication is likely to fail");
        }
        InetSocketAddress inetSocketAddress = c6.f10894h;
        d0 d0Var = this.f10996w.f11804a.f11049b;
        if (d0Var != null) {
            return d0Var;
        }
        C0838c c0838c = new C0838c(EnumC0837b.FATAL, EnumC0835a.HANDSHAKE_FAILURE, inetSocketAddress);
        if (eVar != null) {
            throw new HandshakeException(String.format("No Identity found for peer [address: %s, virtual host: %s]", c6.f10894h, c6.G), c0838c);
        }
        throw new HandshakeException(String.format("No Identity found for peer [address: %s]", c6.f10894h), c0838c);
    }

    public final void G(V v6) {
        this.f10959Q.clear();
        C0850o c0850o = this.f11097r0;
        c0850o.getClass();
        byte[] bArr = v6.f11004o;
        if (bArr == null) {
            throw new NullPointerException("cookie must not be null!");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("cookie must not be empty!");
        }
        c0850o.f11124q = Arrays.copyOf(bArr, bArr.length);
        c0850o.f10933k = null;
        this.f10950D = 3;
        A a6 = new A(this.f10995v, this.f10950D);
        D(a6, this.f11097r0);
        x(a6);
        this.f10973e0--;
    }

    public void H(o0 o0Var) {
        this.f10981k = o0Var.f11129o;
        C c6 = this.f10995v;
        t0 t0Var = o0Var.f11130p;
        if (t0Var == null) {
            c6.getClass();
            throw new NullPointerException("session identifier must not be null!");
        }
        if (!t0Var.equals(c6.i)) {
            t5.c.b(c6.f10901p);
            c6.f10901p = null;
            c6.i = t0Var;
        }
        List list = this.f11098s0;
        q5.i iVar = o0Var.f11131q;
        boolean zContains = list.contains(iVar);
        InetSocketAddress inetSocketAddress = (InetSocketAddress) o0Var.f603h;
        if (!zContains) {
            throw new HandshakeException("Server wants to use not supported cipher suite " + iVar, new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, inetSocketAddress));
        }
        if (iVar == null || q5.i.f11286r == iVar) {
            throw new IllegalArgumentException("Negotiated cipher suite must not be null");
        }
        c6.f10898m = iVar;
        EnumC0852q enumC0852q = EnumC0852q.NULL;
        EnumC0852q enumC0852q2 = o0Var.f11132r;
        if (enumC0852q2 != enumC0852q) {
            throw new HandshakeException("Server wants to use not supported compression method " + enumC0852q2, new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, inetSocketAddress));
        }
        c6.f10900o = enumC0852q2;
        J(o0Var);
        c6.f10911z = o0Var.x(20);
        T t6 = o0Var.f11133s;
        c6.I = (t6 == null || T.c(1, t6.f11002a) == null) ? false : true;
        c6.f10889B = true;
        if (iVar.i()) {
            return;
        }
        this.f10974f0 = f11091C0;
    }

    public void I() {
        m();
        C c6 = this.f10995v;
        InetSocketAddress inetSocketAddress = c6.f10894h;
        C0850o c0850o = new C0850o(this.f11093n0, null, this.f11098s0, this.f11101w0, this.f11100v0, this.f11102x0, this.f11099t0, inetSocketAddress);
        this.f10979j = c0850o.f11122o;
        c0850o.x(EnumC0852q.NULL);
        E(c0850o);
        this.f10950D = 1;
        this.f11097r0 = c0850o;
        A a6 = new A(c6, this.f10950D);
        D(a6, c0850o);
        x(a6);
        this.f10974f0 = f11090B0;
        this.f10973e0 = 0;
    }

    public final void J(o0 o0Var) {
        T t6 = o0Var.f11133s;
        InetSocketAddress inetSocketAddress = (InetSocketAddress) o0Var.f603h;
        if (t6 != null) {
            ArrayList arrayList = t6.f11002a;
            if (!arrayList.isEmpty()) {
                T t7 = this.f11097r0.f11127t;
                if (t7 != null) {
                    ArrayList arrayList2 = t7.f11002a;
                    if (!arrayList2.isEmpty()) {
                        for (S s6 : Collections.unmodifiableList(arrayList)) {
                            if (T.c(s6.f11000a, arrayList2) == null) {
                                throw new HandshakeException("Server wants " + p012c.k.C(s6.f11000a) + ", but client not!", new C0838c(EnumC0837b.FATAL, EnumC0835a.UNSUPPORTED_EXTENSION, inetSocketAddress));
                            }
                        }
                    }
                }
                throw new HandshakeException("Server wants extensions, but client not!", new C0838c(EnumC0837b.FATAL, EnumC0835a.UNSUPPORTED_EXTENSION, inetSocketAddress));
            }
        }
        A0 a6 = t6 != null ? (A0) T.c(12, t6.f11002a) : null;
        if (a6 != null) {
            if (!a6.f10886b.contains(z0.UNCOMPRESSED)) {
                throw new HandshakeException("Server wants to use only not supported EC point formats!", new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, inetSocketAddress));
            }
        }
        j0 j0Var = t6 != null ? (j0) T.c(26, t6.f11002a) : null;
        C c6 = this.f10995v;
        if (j0Var != null) {
            int i = j0Var.f11085b;
            c6.getClass();
            j0.d(i);
            c6.f10896k = Integer.valueOf(i);
        }
        Y y2 = t6 != null ? (Y) T.c(2, t6.f11002a) : null;
        if (y2 != null) {
            if (j0Var != null) {
                throw new HandshakeException("Server wants to use record size limit and max. fragment size", new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, inetSocketAddress));
            }
            p012c.k.c(y2.f11012b);
            throw null;
        }
        EnumC0843h enumC0843hX = o0Var.x(21);
        List list = this.f11102x0;
        if (!(list != null ? list.contains(enumC0843hX) : enumC0843hX == EnumC0843h.X_509)) {
            throw new HandshakeException("Server wants to use not supported server certificate type " + enumC0843hX, new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, inetSocketAddress));
        }
        c6.f10888A = enumC0843hX;
    }

    @Override // p5.Q
    public void f(O o6) {
        int iOrdinal = o6.u().ordinal();
        C c6 = this.f10995v;
        if (iOrdinal == 10) {
            ((K) o6).x(c6.f10898m.d(), this.f10983l, false, this.f11104z0);
            y();
            j();
            return;
        }
        Logger logger = this.f10976h;
        InetSocketAddress inetSocketAddress = (InetSocketAddress) o6.f603h;
        switch (iOrdinal) {
            case 2:
                H((o0) o6);
                return;
            case 3:
                G((V) o6);
                return;
            case 4:
                C((C0840e) o6);
                throw null;
            case 5:
                int iOrdinal2 = c6.b().ordinal();
                if (iOrdinal2 == 0) {
                    logger.info("Received unexpected ServerKeyExchange message in NULL key exchange mode.");
                    return;
                }
                if (iOrdinal2 != 7) {
                    if (iOrdinal2 == 8) {
                        this.f11095p0 = (J) o6;
                        return;
                    }
                    if (iOrdinal2 == 9) {
                        c6.f10895j = new l5.d(null, null);
                        this.f11095p0 = (H) o6;
                        return;
                    } else {
                        throw new HandshakeException("Unsupported key exchange algorithm " + c6.b().name(), new C0838c(EnumC0837b.FATAL, EnumC0835a.HANDSHAKE_FAILURE, inetSocketAddress));
                    }
                }
                return;
            case 6:
                this.f11103y0 = (C0842g) o6;
                return;
            case 7:
                this.f10950D += 2;
                q5.x xVar = this.f11095p0 == null ? null : new q5.x(this.f11095p0.f10918n);
                int iOrdinal3 = c6.b().ordinal();
                if (iOrdinal3 == 7) {
                    d0 d0VarF = F();
                    logger.trace("Using PSK identity: {}", d0VarF);
                    this.f11096q0 = new C0836a0(d0VarF, c6.f10894h);
                    t(v(d0VarF, null));
                } else if (iOrdinal3 == 8) {
                    d0 d0VarF2 = F();
                    logger.trace("Using ECDHE PSK identity: {}", d0VarF2);
                    this.f11096q0 = new I(d0VarF2, xVar.f11346j, c6.f10894h);
                    byte[] bArr = this.f11095p0.f10919o;
                    t5.b bVarC = xVar.c(Arrays.copyOf(bArr, bArr.length));
                    e0 e0VarV = v(d0VarF2, bVarC);
                    t5.c.c(bVarC);
                    t(e0VarV);
                } else {
                    if (iOrdinal3 != 9) {
                        throw new HandshakeException("Unknown key exchange algorithm: " + c6.b(), new C0838c(EnumC0837b.FATAL, EnumC0835a.HANDSHAKE_FAILURE, c6.f10894h));
                    }
                    this.f11096q0 = new F(xVar.f11346j, c6.f10894h);
                    byte[] bArr2 = this.f11095p0.f10919o;
                    t5.b bVarC2 = xVar.c(Arrays.copyOf(bArr2, bArr2.length));
                    Mac macD = c6.f10898m.d();
                    f0 f0Var = this.f10979j;
                    f0 f0Var2 = this.f10981k;
                    byte[] bArr3 = f0Var.f10440a;
                    byte[] bArr4 = f0Var2.f10440a;
                    int length = bArr3.length;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length + length2];
                    System.arraycopy(bArr3, 0, bArr5, 0, length);
                    System.arraycopy(bArr4, 0, bArr5, length, length2);
                    t5.b bVarB0 = p027e3.a.b0(macD, bVarC2, bArr5);
                    t5.c.c(bVarC2);
                    q(bVarB0);
                }
                t5.c.c(xVar);
                return;
            default:
                throw new HandshakeException(String.format("Received unexpected handshake message [%s] from peer %s", o6.u(), inetSocketAddress), new C0838c(EnumC0837b.FATAL, EnumC0835a.UNEXPECTED_MESSAGE, inetSocketAddress));
        }
    }

    @Override // p5.Q
    public final boolean o() {
        return this.f11094o0;
    }

    @Override // p5.Q
    public final boolean p() {
        return !this.f11094o0 && super.p();
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0133  */
    /* JADX WARN: Code duplicated, block: B:62:0x013d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0146  */
    @Override // p5.Q
    public final void q(SecretKey secretKey) throws HandshakeException {
        boolean zContains;
        List list;
        List list2;
        List listUnmodifiableList;
        B c0840e;
        x0 x0VarC;
        boolean z5;
        c(secretKey);
        t5.c.c(secretKey);
        int i = this.f10950D;
        C c6 = this.f10995v;
        A a6 = new A(c6, i);
        C0842g c0842g = this.f11103y0;
        byte[] bArr = m5.d.f10439d;
        EnumC0843h enumC0843h = EnumC0843h.X_509;
        if (c0842g != null) {
            List list3 = this.f11101w0;
            if (list3.isEmpty()) {
                list3 = x0.f11168g;
            }
            C0842g c0842g2 = this.f11103y0;
            c0842g2.getClass();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = c0842g2.f11056o;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                x0 x0Var = (x0) obj;
                if (!list3.contains(x0Var)) {
                    arrayList.add(x0Var);
                }
            }
            arrayList2.removeAll(arrayList);
            EnumC0843h enumC0843h2 = EnumC0843h.RAW_PUBLIC_KEY;
            EnumC0843h enumC0843h3 = c6.f10911z;
            if (enumC0843h2 == enumC0843h3) {
                Logger logger = this.f10976h;
                if (logger.isDebugEnabled()) {
                    logger.debug("sending CERTIFICATE message with client RawPublicKey [{}] to server", m5.s.b(0, bArr));
                }
                c0840e = new C0840e((PublicKey) null, c6.f10894h);
            } else {
                if (enumC0843h != enumC0843h3) {
                    throw new IllegalArgumentException("Certificate type " + c6.f10911z + " not supported!");
                }
                List list4 = Collections.EMPTY_LIST;
                List list5 = this.f10961S;
                if (list5 != null) {
                    C0842g c0842g3 = this.f11103y0;
                    c0842g3.getClass();
                    X509Certificate x509Certificate = (X509Certificate) list5.get(0);
                    String algorithm = x509Certificate.getPublicKey().getAlgorithm();
                    Iterator it = c0842g3.f11055n.iterator();
                    Boolean boolValueOf = null;
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        Logger logger2 = C0842g.f11054r;
                        if (zHasNext) {
                            EnumC0841f enumC0841f = (EnumC0841f) it.next();
                            enumC0841f.getClass();
                            String strA = m5.b.a(algorithm, algorithm);
                            String[] strArr = enumC0841f.f11053j;
                            list = list4;
                            int length = strArr.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 < length) {
                                    int i7 = length;
                                    if (strArr[i6].equalsIgnoreCase(strA)) {
                                        if (enumC0841f.i) {
                                            if (boolValueOf == null) {
                                                boolValueOf = Boolean.valueOf(m5.e.a(x509Certificate, true));
                                            }
                                            if (!boolValueOf.booleanValue()) {
                                                logger2.error("type: {}, requires missing signing capability!", enumC0841f);
                                            }
                                        }
                                        logger2.debug("type: {}, is compatible with KeyAlgorithm[{}] and meets signing requirements", enumC0841f, algorithm);
                                        ArrayList arrayList3 = c0842g3.f11056o;
                                        x0VarC = x0.c(arrayList3, x509Certificate.getPublicKey());
                                        if (x0VarC != null) {
                                            Iterator it2 = list5.iterator();
                                            loop3: while (true) {
                                                if (!it2.hasNext()) {
                                                    z5 = true;
                                                    break;
                                                }
                                                String sigAlgName = ((X509Certificate) it2.next()).getSigAlgName();
                                                Iterator it3 = arrayList3.iterator();
                                                do {
                                                    if (!it3.hasNext()) {
                                                        z5 = false;
                                                        break loop3;
                                                    }
                                                } while (!((x0) it3.next()).f11169a.equalsIgnoreCase(sigAlgName));
                                            }
                                            if (!z5) {
                                            }
                                        }
                                        this.f11092A0 = x0VarC;
                                        if (x0VarC != null) {
                                            list2 = list5;
                                        }
                                        if (this.u0) {
                                            listUnmodifiableList = Collections.unmodifiableList(this.f11103y0.f11057p);
                                        } else {
                                            listUnmodifiableList = null;
                                        }
                                        c0840e = new C0840e(list2, listUnmodifiableList, c6.f10894h);
                                    } else {
                                        i6++;
                                        length = i7;
                                    }
                                } else {
                                    logger2.debug("type: {}, is not compatible with KeyAlgorithm[{}]: {}", enumC0841f, algorithm);
                                }
                                list4 = list;
                            }
                        } else {
                            list = list4;
                            logger2.debug("certificate [{}] with public key {} is not of any supported type", x509Certificate, algorithm);
                        }
                        x0VarC = null;
                        this.f11092A0 = x0VarC;
                        if (x0VarC != null) {
                            list2 = list5;
                        }
                        if (this.u0) {
                            listUnmodifiableList = Collections.unmodifiableList(this.f11103y0.f11057p);
                        } else {
                            listUnmodifiableList = null;
                        }
                        c0840e = new C0840e(list2, listUnmodifiableList, c6.f10894h);
                    }
                } else {
                    list = list4;
                }
                list2 = list;
                if (this.u0) {
                    listUnmodifiableList = Collections.unmodifiableList(this.f11103y0.f11057p);
                } else {
                    listUnmodifiableList = null;
                }
                c0840e = new C0840e(list2, listUnmodifiableList, c6.f10894h);
            }
            D(a6, c0840e);
        }
        D(a6, this.f11096q0);
        if (this.f11103y0 != null && this.f11092A0 != null) {
            EnumC0843h enumC0843h4 = c6.f10911z;
            List list6 = this.f11100v0;
            if (list6 != null) {
                zContains = list6.contains(enumC0843h4);
            } else {
                zContains = enumC0843h4 == enumC0843h;
            }
            if (!zContains) {
                throw new HandshakeException("Server wants to use not supported client certificate type " + enumC0843h4, new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, c6.f10894h));
            }
            x0 x0Var2 = this.f11092A0;
            ArrayList arrayList4 = this.f10959Q;
            C0845j c0845j = new C0845j(x0Var2, c6.f10894h);
            Logger logger3 = C0845j.f11082p;
            c0845j.f11083n = bArr;
            try {
                Signature signature = (Signature) x0.d(c0845j.f11084o.f11169a).b();
                try {
                    signature.initSign(null);
                    int size2 = arrayList4.size();
                    int i8 = 0;
                    int i9 = 0;
                    while (i9 < size2) {
                        Object obj2 = arrayList4.get(i9);
                        i9++;
                        O o6 = (O) obj2;
                        signature.update(o6.d());
                        logger3.trace("  [{}] - {}", Integer.valueOf(i8), o6.u());
                        i8++;
                    }
                    c0845j.f11083n = signature.sign();
                } catch (InvalidKeyException unused) {
                    throw null;
                }
            } catch (Exception e6) {
                logger3.error("Could not create signature.", (Throwable) e6);
            }
            c0845j.f11083n = c0845j.f11083n;
            D(a6, c0845j);
        }
        D(a6, new C0847l(c6.f10894h));
        A();
        MessageDigest messageDigestI = i();
        try {
            MessageDigest messageDigest = (MessageDigest) messageDigestI.clone();
            B k3 = new K(c6.f10898m.d(), this.f10983l, this.i, messageDigestI.digest(), c6.f10894h);
            D(a6, k3);
            messageDigest.update(k3.d());
            this.f11104z0 = messageDigest.digest();
            x(a6);
            this.f10975g0 = true;
        } catch (CloneNotSupportedException unused2) {
            throw new HandshakeException("Cannot create FINISHED message", new C0838c(EnumC0837b.FATAL, EnumC0835a.INTERNAL_ERROR, c6.f10894h));
        }
    }

    @Override // p5.Q
    public final void w() {
        this.f11094o0 = false;
    }
}
