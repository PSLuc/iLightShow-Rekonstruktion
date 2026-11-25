package p5;

import c5.C0495p;
import java.net.InetSocketAddress;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import org.eclipse.californium.scandium.dtls.HandshakeException;
import org.slf4j.Logger;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public class n0 extends Q {

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final F.L[] f11105C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public static final F.L[] f11106D0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public d0 f11107A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public q5.x f11108B0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final boolean f11109n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final boolean f11110o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f11111p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public PublicKey f11112q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final q5.k f11113r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final List f11114s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final List f11115t0;
    public final List u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final List f11116v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final List f11117w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public q5.j f11118x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public C0840e f11119y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public C0845j f11120z0;

    static {
        P p6 = P.CERTIFICATE;
        F.L l6 = new F.L(p6);
        P p7 = P.CLIENT_KEY_EXCHANGE;
        F.L l7 = new F.L(p7);
        F.L l8 = new F.L(P.CERTIFICATE_VERIFY);
        F.L l9 = new F.L(6);
        P p8 = P.FINISHED;
        f11105C0 = new F.L[]{l6, l7, l8, l9, new F.L(p8)};
        new F.L(p6);
        new F.L(p7);
        new F.L(6);
        new F.L(p8);
        f11106D0 = new F.L[]{new F.L(p7), new F.L(6), new F.L(p8)};
    }

    public n0(int i, C c6, n5.g gVar, ScheduledExecutorService scheduledExecutorService, C0854t c0854t, o5.a aVar) {
        super(false, i, c6, gVar, scheduledExecutorService, c0854t, aVar);
        this.f11109n0 = false;
        this.f11110o0 = false;
        this.f11111p0 = false;
        this.f11119y0 = null;
        this.f11120z0 = null;
        this.f11113r0 = aVar.f10695r;
        this.f11114s0 = aVar.f10696s;
        this.f11115t0 = aVar.f10698u;
        this.f11110o0 = aVar.i.booleanValue();
        this.f11111p0 = aVar.f10687j.booleanValue();
        this.f11109n0 = aVar.f10671E.booleanValue();
        this.u0 = aVar.f10691n;
        this.f11116v0 = aVar.f10690m;
        this.f11117w0 = aVar.f10697t;
    }

    public static ArrayList E(AbstractC0844i abstractC0844i, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            if (abstractC0844i != null) {
                for (EnumC0843h enumC0843h : abstractC0844i.f11071c) {
                    if (list.contains(enumC0843h)) {
                        arrayList.add(enumC0843h);
                    }
                }
            } else {
                EnumC0843h enumC0843h2 = EnumC0843h.X_509;
                if (list.contains(enumC0843h2)) {
                    arrayList.add(enumC0843h2);
                }
            }
        }
        return arrayList;
    }

    public final void F(C0850o c0850o, T t6) {
        List list;
        ArrayList arrayList;
        int i;
        m0 m0Var;
        int i3;
        C0848m c0848m;
        C c6 = this.f10995v;
        q5.i iVar = c6.f10898m;
        List listAsList = !iVar.equals(q5.i.f11286r) ? Arrays.asList(iVar) : this.f11114s0;
        ArrayList arrayList2 = new ArrayList();
        for (q5.i iVar2 : Collections.unmodifiableList(c0850o.f11125r)) {
            if (iVar2 != q5.i.f11286r && listAsList.contains(iVar2)) {
                arrayList2.add(iVar2);
            }
        }
        T t7 = c0850o.f11127t;
        ArrayList arrayListE = E(t7 != null ? (m0) T.c(21, t7.f11002a) : null, this.f11116v0);
        Principal principal = c6.f10895j;
        EnumC0843h enumC0843h = EnumC0843h.X_509;
        EnumC0843h enumC0843h2 = EnumC0843h.RAW_PUBLIC_KEY;
        if (principal != null) {
            ArrayList arrayList3 = new ArrayList();
            if (principal instanceof l5.d) {
                arrayList3.add(enumC0843h2);
                list = arrayList3;
            } else {
                list = arrayList3;
                if (principal instanceof l5.e) {
                    arrayList3.add(enumC0843h);
                    list = arrayList3;
                }
            }
        } else {
            list = this.u0;
        }
        T t8 = c0850o.f11127t;
        ArrayList arrayListE2 = E(t8 != null ? (C0848m) T.c(20, t8.f11002a) : null, list);
        ArrayList arrayList4 = new ArrayList();
        T t9 = c0850o.f11127t;
        y0 y0Var = t9 != null ? (y0) T.c(11, t9.f11002a) : null;
        List list2 = this.f11115t0;
        if (y0Var == null) {
            arrayList4.addAll(list2);
        } else {
            for (q5.w wVar : y0Var.f11176b) {
                if (list2.contains(wVar)) {
                    arrayList4.add(wVar);
                }
            }
        }
        T t10 = c0850o.f11127t;
        w0 w0Var = t10 != null ? (w0) T.c(14, t10.f11002a) : null;
        List list3 = this.f11117w0;
        if (w0Var == null) {
            arrayList = new ArrayList();
            arrayList.addAll(list3);
        } else {
            C0495p c0495p = x0.f11167f;
            ArrayList arrayList5 = new ArrayList();
            for (x0 x0Var : w0Var.f11166b) {
                if (list3.contains(x0Var)) {
                    arrayList5.add(x0Var);
                }
            }
            arrayList = arrayList5;
        }
        T t11 = c0850o.f11127t;
        A0 a6 = t11 != null ? (A0) T.c(12, t11.f11002a) : null;
        z0 z0Var = z0.UNCOMPRESSED;
        if (a6 != null && !a6.f10886b.contains(z0Var)) {
            z0Var = null;
        }
        q5.j jVar = new q5.j();
        boolean z5 = this.f11111p0;
        jVar.f11297a = z5;
        boolean z6 = this.f11110o0;
        jVar.f11298b = !z5 && z6;
        jVar.f11299c = arrayList2;
        jVar.f11300d = arrayListE;
        jVar.f11301e = arrayListE2;
        jVar.f11302f = arrayList4;
        jVar.f11303g = arrayList;
        jVar.f11304h = z0Var;
        q5.k kVar = this.f11113r0;
        kVar.getClass();
        int size = arrayList2.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList2.get(i6);
            i6++;
            q5.i iVar3 = (q5.i) obj;
            boolean zF = iVar3.f();
            ArrayList arrayList6 = jVar.f11302f;
            if (!zF || (!arrayList6.isEmpty() && jVar.f11304h != null)) {
                if (!iVar3.i()) {
                    ArrayList arrayList7 = jVar.f11299c;
                    arrayList7.clear();
                    arrayList7.add(iVar3);
                    this.f11118x0 = jVar;
                    q5.i iVar4 = (q5.i) jVar.f11299c.get(0);
                    if (iVar4 == null || q5.i.f11286r == iVar4) {
                        throw new IllegalArgumentException("Negotiated cipher suite must not be null");
                    }
                    c6.f10898m = iVar4;
                    if (iVar4.i()) {
                        c6.f10899n = null;
                        ArrayList arrayList8 = jVar.f11300d;
                        c6.f10911z = arrayList8.isEmpty() ? null : (EnumC0843h) arrayList8.get(0);
                        ArrayList arrayList9 = jVar.f11301e;
                        EnumC0843h enumC0843h3 = arrayList9.isEmpty() ? null : (EnumC0843h) arrayList9.get(0);
                        if (z5 || (z6 && enumC0843h3 != null)) {
                            ArrayList arrayList10 = jVar.f11301e;
                            c6.f10888A = arrayList10.isEmpty() ? null : (EnumC0843h) arrayList10.get(0);
                        }
                    }
                    EnumC0843h enumC0843h4 = c6.f10888A;
                    if (enumC0843h4 != null) {
                        T t12 = c0850o.f11127t;
                        if (t12 != null) {
                            i3 = 20;
                            c0848m = (C0848m) T.c(20, t12.f11002a);
                        } else {
                            i3 = 20;
                            c0848m = null;
                        }
                        if (c0848m != null) {
                            t6.a(new C0848m(i3, enumC0843h4));
                        }
                    }
                    EnumC0843h enumC0843h5 = c6.f10911z;
                    if (enumC0843h5 != null) {
                        T t13 = c0850o.f11127t;
                        if (t13 != null) {
                            i = 21;
                            m0Var = (m0) T.c(21, t13.f11002a);
                        } else {
                            i = 21;
                            m0Var = null;
                        }
                        if (m0Var != null) {
                            t6.a(new m0(i, enumC0843h5));
                        }
                    }
                    if (iVar4.f()) {
                        T t14 = c0850o.f11127t;
                        if ((t14 != null ? (A0) T.c(12, t14.f11002a) : null) != null) {
                            t6.a(A0.f10885c);
                        }
                    }
                    c6.f10889B = true;
                    this.f10976h.debug("Negotiated cipher suite [{}] with peer [{}]", iVar4.name(), c6.f10894h);
                    return;
                }
                if (kVar.f11306a) {
                    if (!jVar.f11300d.isEmpty()) {
                        boolean z7 = jVar.f11297a || jVar.f11298b;
                        ArrayList arrayList11 = jVar.f11301e;
                        if ((!z7 || !arrayList11.isEmpty()) && !jVar.f11303g.isEmpty()) {
                            if (iVar3.f11296o != 4) {
                                throw new IllegalArgumentException("Only ECDSA certificate based cipher suites are supported!");
                            }
                            q5.w wVar2 = q5.w.secp256r1;
                        }
                    }
                    kVar.f11306a = false;
                } else {
                    continue;
                }
            }
        }
        throw new HandshakeException("Client proposed unsupported cipher suites only", new C0838c(EnumC0837b.FATAL, EnumC0835a.HANDSHAKE_FAILURE, c6.f10894h));
    }

    public final void G(C0850o c0850o, T t6) {
        T t7 = c0850o.f11127t;
        t5.d dVar = null;
        j0 j0Var = t7 != null ? (j0) T.c(26, t7.f11002a) : null;
        Logger logger = this.f10976h;
        C c6 = this.f10995v;
        InetSocketAddress inetSocketAddress = (InetSocketAddress) c0850o.f603h;
        if (j0Var != null) {
            int i = j0Var.f11085b;
            c6.getClass();
            j0.d(i);
            c6.f10896k = Integer.valueOf(i);
            int i3 = c6.f10897l;
            t6.a(new j0(i3));
            logger.debug("Received record size limit [{} bytes] from peer [{}]", Integer.valueOf(i3), inetSocketAddress);
        }
        if (j0Var == null) {
            T t8 = c0850o.f11127t;
            Y y2 = t8 != null ? (Y) T.c(2, t8.f11002a) : null;
            if (y2 != null) {
                int i6 = y2.f11012b;
                int iG = p012c.k.g(i6);
                c6.getClass();
                if (iG < 0 || iG > 16384) {
                    throw new IllegalArgumentException("Max. fragment length must be in range [0...16384]");
                }
                c6.f10897l = iG;
                t6.a(y2);
                logger.debug("Negotiated max. fragment length [{} bytes] with peer [{}]", Integer.valueOf(p012c.k.g(i6)), inetSocketAddress);
            }
        }
        T t9 = c0850o.f11127t;
        r0 r0Var = t9 != null ? (r0) T.c(1, t9.f11002a) : null;
        if (r0Var != null) {
            if (!this.f10962T) {
                logger.debug("client [{}] included SNI in HELLO but SNI support is disabled", inetSocketAddress);
                return;
            }
            c6.G = null;
            t5.e eVar = r0Var.f11138b;
            c6.H = eVar;
            if (eVar != null) {
                for (t5.d dVar2 : eVar.f12603h) {
                    if (AbstractC0916i.b(dVar2.f12600a, 1)) {
                        dVar = dVar2;
                        break;
                    }
                }
                if (dVar != null) {
                    c6.G = new String(dVar.f12601b, t5.d.f12599d);
                }
            }
            t6.a(new r0(1));
            c6.I = true;
            logger.debug("using server name indication received from peer [{}]", inetSocketAddress);
        }
    }

    @Override // p5.Q, javax.security.auth.Destroyable
    public final void destroy() {
        t5.c.c(this.f11108B0);
        this.f11108B0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0417  */
    @Override // p5.Q
    public void f(O o6) throws GeneralSecurityException, HandshakeException {
        t0 t0Var;
        G j4;
        B c0840e;
        int i;
        int i3;
        int iOrdinal = o6.u().ordinal();
        boolean z5 = this.f11111p0;
        int i6 = 0;
        int i7 = 2;
        C c6 = this.f10995v;
        if (iOrdinal != 1) {
            if (iOrdinal == 4) {
                C0840e c0840e2 = (C0840e) o6;
                this.f11119y0 = c0840e2;
                PublicKey publicKey = c0840e2.f11046q;
                this.f11112q0 = publicKey;
                if (z5 && c0840e2.f11043n != null && publicKey == null) {
                    this.f10976h.debug("Client authentication failed: missing certificate!");
                    throw new HandshakeException("Client Certificate required!", new C0838c(EnumC0837b.FATAL, EnumC0835a.HANDSHAKE_FAILURE, c6.f10894h));
                }
                C(c0840e2);
                throw null;
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) o6.f603h;
            switch (iOrdinal) {
                case 8:
                    C0845j c0845j = (C0845j) o6;
                    this.f11120z0 = c0845j;
                    ArrayList arrayList = this.f10959Q;
                    arrayList.remove(arrayList.size() - 1);
                    PublicKey publicKey2 = this.f11112q0;
                    Logger logger = C0845j.f11082p;
                    try {
                        Signature signature = (Signature) x0.d(c0845j.f11084o.f11169a).b();
                        signature.initVerify(publicKey2);
                        int size = arrayList.size();
                        int i8 = 0;
                        while (i8 < size) {
                            Object obj = arrayList.get(i8);
                            i8++;
                            O o7 = (O) obj;
                            signature.update(o7.d());
                            logger.trace("  [{}] - {}", Integer.valueOf(i6), o7.u());
                            i6++;
                        }
                        if (signature.verify(c0845j.f11083n)) {
                            arrayList.add(c0845j);
                            c6.f10895j = new l5.d(this.f11112q0, null);
                            if (this.f10983l != null) {
                                this.f10975g0 = true;
                                return;
                            }
                            return;
                        }
                    } catch (GeneralSecurityException e6) {
                        logger.error("Could not verify the client's signature.", (Throwable) e6);
                    }
                    throw new HandshakeException("The client's CertificateVerify message could not be verified.", new C0838c(EnumC0837b.FATAL, EnumC0835a.HANDSHAKE_FAILURE, (InetSocketAddress) c0845j.f603h));
                case 9:
                    int iOrdinal2 = c6.b().ordinal();
                    if (iOrdinal2 == 7) {
                        d0 d0Var = ((C0836a0) o6).f11028n;
                        this.f11107A0 = d0Var;
                        t(v(d0Var, null));
                        return;
                    }
                    if (iOrdinal2 == 8) {
                        I i9 = (I) o6;
                        this.f11107A0 = i9.f10922o;
                        q5.x xVar = this.f11108B0;
                        byte[] bArr = i9.f10917n;
                        t5.b bVarC = xVar.c(Arrays.copyOf(bArr, bArr.length));
                        e0 e0VarV = v(this.f11107A0, bVarC);
                        t5.c.c(bVarC);
                        t(e0VarV);
                        return;
                    }
                    if (iOrdinal2 != 9) {
                        throw new HandshakeException("Unsupported key exchange algorithm " + c6.b().name(), new C0838c(EnumC0837b.FATAL, EnumC0835a.HANDSHAKE_FAILURE, inetSocketAddress));
                    }
                    q5.x xVar2 = this.f11108B0;
                    byte[] bArr2 = ((F) o6).f10917n;
                    t5.b bVarC2 = xVar2.c(Arrays.copyOf(bArr2, bArr2.length));
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
                    SecretKey secretKeyB0 = p027e3.a.b0(macD, bVarC2, bArr5);
                    t5.c.c(bVarC2);
                    q(secretKeyB0);
                    return;
                case 10:
                    K k3 = (K) o6;
                    if (q5.f.f11268k.equals(c6.b()) && z5 && (this.f11119y0 == null || this.f11120z0 == null)) {
                        throw new HandshakeException("Client did not send required authentication messages.", new C0838c(EnumC0837b.FATAL, EnumC0835a.HANDSHAKE_FAILURE, c6.f10894h));
                    }
                    this.f10950D += 2;
                    A a6 = new A(c6, this.f10950D);
                    MessageDigest messageDigestI = i();
                    try {
                        MessageDigest messageDigest = (MessageDigest) messageDigestI.clone();
                        k3.x(c6.f10898m.d(), this.f10983l, true, messageDigestI.digest());
                        D(a6, new C0847l(c6.f10894h));
                        A();
                        messageDigest.update(k3.d());
                        D(a6, new K(c6.f10898m.d(), this.f10983l, this.i, messageDigest.digest(), c6.f10894h));
                        this.f10999z = true;
                        a6.f10881n = false;
                        x(a6);
                        y();
                        return;
                    } catch (CloneNotSupportedException unused) {
                        throw new HandshakeException("Cannot create FINISHED message hash", new C0838c(EnumC0837b.FATAL, EnumC0835a.INTERNAL_ERROR, (InetSocketAddress) k3.f603h));
                    }
                default:
                    throw new HandshakeException(String.format("Received unexpected %s message from peer %s", o6.u(), inetSocketAddress), new C0838c(EnumC0837b.FATAL, EnumC0835a.UNEXPECTED_MESSAGE, inetSocketAddress));
            }
        }
        C0850o c0850o = (C0850o) o6;
        m();
        byte[] bArr6 = c0850o.f11124q;
        if (bArr6 != null && bArr6.length > 0) {
            i7 = 4;
        }
        this.f10950D = i7;
        A a7 = new A(c6, this.f10950D);
        c0 c0Var = c0850o.f11121n;
        c0 c0Var2 = c0.f11035j;
        c0Var.getClass();
        if (c0Var != c0Var2 && ((i = c0Var.i) != 254 ? i >= 254 : (i3 = c0Var.f11036h) >= 253 && i3 > 253)) {
            throw new HandshakeException("The server only supports DTLS v1.2", new C0838c(EnumC0837b.FATAL, EnumC0835a.PROTOCOL_VERSION, c6.f10894h));
        }
        this.f10979j = c0850o.f11122o;
        this.f10981k = new f0();
        if (this.f11109n0) {
            t0Var = t0.f11151e;
        } else {
            byte[] bArr7 = new byte[32];
            ((SecureRandom) q5.m.f11314b.get()).nextBytes(bArr7);
            t0Var = new t0(bArr7, 255);
        }
        t0 t0Var2 = t0Var;
        if (t0Var2 == null) {
            throw new NullPointerException("session identifier must not be null!");
        }
        if (!t0Var2.equals(c6.i)) {
            t5.c.b(c6.f10901p);
            c6.f10901p = null;
            c6.i = t0Var2;
        }
        List listUnmodifiableList = Collections.unmodifiableList(c0850o.f11126s);
        EnumC0852q enumC0852q = EnumC0852q.NULL;
        if (!listUnmodifiableList.contains(enumC0852q)) {
            throw new HandshakeException("Client does not support NULL compression method", new C0838c(EnumC0837b.FATAL, EnumC0835a.HANDSHAKE_FAILURE, (InetSocketAddress) c0850o.f603h));
        }
        c6.f10900o = enumC0852q;
        T t6 = new T();
        F(c0850o, t6);
        G(c0850o, t6);
        D(a7, new o0(c0Var2, this.f10981k, t0Var2, c6.f10898m, c6.f10900o, t6, c6.f10894h));
        boolean zI = c6.f10898m.i();
        EnumC0843h enumC0843h = EnumC0843h.X_509;
        EnumC0843h enumC0843h2 = EnumC0843h.RAW_PUBLIC_KEY;
        if (zI) {
            EnumC0843h enumC0843h3 = c6.f10911z;
            if (enumC0843h2 == enumC0843h3) {
                c0840e = new C0840e((PublicKey) null, c6.f10894h);
            } else {
                if (enumC0843h != enumC0843h3) {
                    throw new IllegalArgumentException("Certificate type " + c6.f10911z + " not supported!");
                }
                c0840e = new C0840e(this.f10961S, null, c6.f10894h);
            }
            D(a7, c0840e);
        }
        int iOrdinal3 = c6.b().ordinal();
        if (iOrdinal3 == 8) {
            try {
                ArrayList arrayList2 = this.f11118x0.f11302f;
                this.f11108B0 = new q5.x(arrayList2.isEmpty() ? null : (q5.w) arrayList2.get(0));
                j4 = new J(d0.f11037g, this.f11108B0, c6.f10894h);
            } catch (GeneralSecurityException e7) {
                throw new HandshakeException("Error performing EC Diffie Hellman key exchange: " + e7.getMessage(), new C0838c(EnumC0837b.FATAL, EnumC0835a.INTERNAL_ERROR, c6.f10894h));
            }
        } else if (iOrdinal3 != 9) {
            j4 = null;
        } else {
            try {
                ArrayList arrayList3 = this.f11118x0.f11302f;
                this.f11108B0 = new q5.x(arrayList3.isEmpty() ? null : (q5.w) arrayList3.get(0));
                x0 x0Var = c6.f10899n;
                q5.x xVar3 = this.f11108B0;
                f0 f0Var3 = this.f10979j;
                f0 f0Var4 = this.f10981k;
                j4 = new H(x0Var, xVar3.f11345h, xVar3.f11346j, c6.f10894h);
                Signature signature2 = (Signature) x0.d(x0Var.f11169a).b();
                signature2.initSign(null);
                signature2.update(f0Var3.f10440a);
                signature2.update(f0Var4.f10440a);
                int i10 = j4.f10918n.f11327h;
                signature2.update((byte) 3);
                signature2.update((byte) (i10 >> 8));
                signature2.update((byte) i10);
                byte[] bArr8 = j4.f10919o;
                signature2.update((byte) bArr8.length);
                signature2.update(bArr8);
                signature2.sign();
            } catch (GeneralSecurityException e8) {
                throw new HandshakeException("Error performing EC Diffie Hellman key exchange: " + e8.getMessage(), new C0838c(EnumC0837b.FATAL, EnumC0835a.INTERNAL_ERROR, c6.f10894h));
            }
        }
        if (j4 != null) {
            D(a7, j4);
        }
        if ((this.f11110o0 || z5) && c6.f10898m.i()) {
            ArrayList arrayList4 = this.f11118x0.f11301e;
            if ((arrayList4.isEmpty() ? null : (EnumC0843h) arrayList4.get(0)) != null) {
                C0842g c0842g = new C0842g(c6.f10894h);
                c0842g.f11055n.add(EnumC0841f.ECDSA_SIGN);
                EnumC0843h enumC0843h4 = c6.f10888A;
                ArrayList arrayList5 = c0842g.f11056o;
                List list = this.f11117w0;
                if (enumC0843h4 == enumC0843h) {
                    arrayList5.addAll(list);
                } else if (enumC0843h4 == enumC0843h2) {
                    arrayList5.addAll(x0.b(list));
                }
                D(a7, c0842g);
                this.f10974f0 = f11105C0;
            } else {
                this.f10974f0 = f11106D0;
            }
        } else {
            this.f10974f0 = f11106D0;
        }
        this.f10973e0 = -1;
        D(a7, new p0(c6.f10894h));
        x(a7);
    }

    @Override // p5.Q
    public final void q(SecretKey secretKey) {
        c(secretKey);
        t5.c.c(secretKey);
        if (this.f11111p0 && this.f10995v.b() == q5.f.f11268k && this.f11120z0 == null) {
            return;
        }
        this.f10975g0 = true;
    }
}
