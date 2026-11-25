package p5;

import B.AbstractC0013g0;
import B.C0031p0;
import c5.C0495p;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.Principal;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.security.auth.Destroyable;
import org.eclipse.californium.scandium.dtls.DtlsException;
import org.eclipse.californium.scandium.dtls.HandshakeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q implements Destroyable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f10947A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f10948B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final long f10949C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f10951E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f10952F;
    public final int G;
    public final int H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public O1.n f10954L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final ScheduledExecutorService f10955M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final n5.g f10956N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final C0854t f10957O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final C0031p0 f10958P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public h0 f10960R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final List f10961S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final boolean f10962T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final boolean f10963U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final boolean f10964V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final boolean f10965W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final boolean f10966X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Boolean f10967Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Boolean f10968Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f10969a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int f10970b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final int f10971c0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f10973e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public F.L[] f10974f0;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f0 f10979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f0 f10981k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public t5.b f10983l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public t5.b f10984l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t5.b f10985m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public Exception f10986m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t5.b f10987n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t5.b f10988o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t5.b f10989p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public t5.a f10990q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public t5.a f10991r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10992s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f10994u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C f10995v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r5.a f10996w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10997x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10998y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f10999z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Logger f10976h = LoggerFactory.getLogger(getClass());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ReentrantLock f10993t = new ReentrantLock();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f10950D = 0;
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final AtomicReference f10953K = new AtomicReference();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ArrayList f10959Q = new ArrayList();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final LinkedHashSet f10972d0 = new LinkedHashSet();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f10975g0 = false;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f10977h0 = false;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f10978i0 = false;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f10980j0 = false;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f10982k0 = false;

    public Q(boolean z5, int i, C c6, n5.g gVar, ScheduledExecutorService scheduledExecutorService, C0854t c0854t, o5.a aVar) {
        this.f10997x = 0;
        this.f10998y = 0;
        if (gVar == null) {
            throw new NullPointerException("Record layer must not be null");
        }
        if (scheduledExecutorService == null) {
            throw new NullPointerException("Timer must not be null");
        }
        if (c0854t == null) {
            throw new NullPointerException("Connection must not be null");
        }
        if (aVar == null) {
            throw new NullPointerException("Dtls Connector Config must not be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Initial message sequence number must not be negative");
        }
        this.i = z5;
        this.f10997x = i;
        this.f10998y = i;
        this.f10995v = c6;
        this.f10956N = gVar;
        this.f10955M = scheduledExecutorService;
        this.f10957O = c0854t;
        int iIntValue = aVar.f10683e.intValue();
        this.f10971c0 = iIntValue;
        this.f10969a0 = aVar.f10684f.intValue();
        this.f10970b0 = aVar.f10685g.intValue();
        this.f10952F = aVar.f10682d.intValue();
        this.f10967Y = null;
        this.f10968Z = null;
        this.G = aVar.f10700w.intValue();
        this.H = aVar.f10701x.intValue();
        this.f10962T = aVar.f10669C.booleanValue();
        this.f10963U = aVar.J.booleanValue();
        this.f10964V = aVar.f10673K.booleanValue();
        this.f10965W = aVar.f10675M.booleanValue();
        this.f10966X = aVar.f10680b.booleanValue();
        this.f10961S = aVar.f10694q;
        this.f10996w = aVar.f10693p;
        this.f10958P = new C0031p0(this);
        this.f10994u = c0854t.f11148g.getAddress() instanceof Inet6Address;
        int i3 = iIntValue * 2;
        for (int i6 = 0; i6 < this.f10970b0; i6++) {
            Logger logger = A.f10868r;
            if (iIntValue < 60000 && (iIntValue = iIntValue * 2) > 60000) {
                iIntValue = 60000;
            }
            i3 += iIntValue;
        }
        this.f10949C = TimeUnit.MILLISECONDS.toNanos(i3);
        C0853s c0853s = c0854t.f11143b;
        if (c0853s != null) {
            this.f10972d0.add(c0853s);
        }
    }

    public final void A() {
        boolean z5 = this.i;
        C c6 = this.f10995v;
        AbstractC0859y abstractC0859yA = z5 ? AbstractC0859y.a(c6.f10898m, c6.f10900o, this.f10988o, this.f10990q, this.f10985m) : AbstractC0859y.a(c6.f10898m, c6.f10900o, this.f10989p, this.f10991r, this.f10987n);
        if (abstractC0859yA == null) {
            c6.getClass();
            throw new NullPointerException("Write state must not be null");
        }
        t5.c.c(c6.f10904s);
        c6.f10904s = abstractC0859yA;
        int i = c6.f10906u + 1;
        c6.f10906u = i;
        c6.f10907v[i] = 0;
        C.f10887K.trace("Setting current write state to{}{}", m5.s.f10493b, abstractC0859yA);
    }

    public final ArrayList B() {
        ArrayList arrayList = this.J;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            u((i0) obj, arrayList);
        }
        if (!arrayList.isEmpty()) {
            this.f10976h.warn("{} left deferred records", Integer.valueOf(arrayList.size()));
            arrayList.clear();
        }
        return arrayList2;
    }

    public final void C(C0840e c0840e) throws HandshakeException {
        if (c0840e.f11043n == null) {
            new l5.d(c0840e.f11046q, null);
            throw null;
        }
        Logger logger = this.f10976h;
        C c6 = this.f10995v;
        logger.debug("Certificate validation failed: x509 could not be trusted!");
        throw new HandshakeException("Trust is not possible!", new C0838c(EnumC0837b.FATAL, EnumC0835a.UNEXPECTED_MESSAGE, c6.f10894h));
    }

    public final void D(A a6, B b6) throws HandshakeException {
        int iOrdinal = b6.g().ordinal();
        ArrayList arrayList = a6.f10870b;
        C c6 = this.f10995v;
        if (iOrdinal == 0) {
            arrayList.add(new C0860z(c6.f10906u, b6));
            return;
        }
        if (iOrdinal != 2) {
            throw new HandshakeException("Cannot create " + b6.g() + " record for flight", new C0838c(EnumC0837b.FATAL, EnumC0835a.INTERNAL_ERROR, c6.f10894h));
        }
        O o6 = (O) b6;
        o6.v(this.f10997x);
        this.f10997x++;
        if (c6.f10906u == 0) {
            this.f10959Q.add(o6);
        }
        arrayList.add(new C0860z(c6.f10906u, b6));
    }

    public final void a(k5.a aVar) {
        ArrayList arrayList = this.I;
        if (arrayList.size() < this.G) {
            arrayList.add(aVar);
        }
    }

    public final boolean b(i0 i0Var, Collection collection) {
        int length = (i0Var.h() ? i0Var.i.f10440a.length : 0) + 13 + i0Var.f11080h.length;
        int i = this.f10951E + length;
        int i3 = this.H;
        if (i < i3) {
            this.f10951E = i;
            collection.add(i0Var);
            return true;
        }
        this.f10976h.debug("Dropped incoming record from peer [{}], limit of {} bytes exceeded by {}+{} bytes!", i0Var.d(), Integer.valueOf(i3), Integer.valueOf(this.f10951E), Integer.valueOf(length));
        this.f10956N.getClass();
        n5.g.f10587z.debug("Discarding {} record [epoch {}, rseqn {}] dropped by handshaker for peer [{}]", i0Var.f11073a, Integer.valueOf(i0Var.f11075c), Long.valueOf(i0Var.f11076d), i0Var.d());
        return false;
    }

    public final void c(SecretKey secretKey) {
        g();
        this.f10983l = t5.c.a(secretKey);
        d(secretKey);
        C c6 = this.f10995v;
        if (c6.f10901p != null) {
            throw new IllegalStateException("master secret already available!");
        }
        if (!c6.i.b()) {
            byte[] encoded = secretKey.getEncoded();
            Arrays.fill(encoded, (byte) 0);
            if (encoded.length != 48) {
                throw new IllegalArgumentException(String.format("Master secret must consist of of exactly %d bytes but has %d bytes", 48, Integer.valueOf(encoded.length)));
            }
            c6.f10901p = t5.c.a(secretKey);
        }
        c6.f10893F = System.currentTimeMillis();
    }

    public final void d(SecretKey secretKey) {
        g();
        C c6 = this.f10995v;
        q5.i iVar = c6.f10898m;
        int i = iVar.f11292k.i;
        q5.e eVar = iVar.f11291j;
        int i3 = eVar.f11260j;
        int i6 = eVar.f11261k;
        int i7 = (i + i3 + i6) * 2;
        f0 f0Var = this.f10981k;
        f0 f0Var2 = this.f10979j;
        byte[] bArr = f0Var.f10440a;
        byte[] bArr2 = f0Var2.f10440a;
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length + length2];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, length2);
        Mac macD = c6.f10898m.d();
        byte[] bArr4 = q5.l.KEY_EXPANSION_LABEL.f11312h;
        try {
            macD.init(secretKey);
            byte[] bArrX = p027e3.a.X(macD, bArr4, bArr3, i7);
            macD.reset();
            Logger logger = t5.c.f12598a;
            this.f10985m = new t5.b(0, i, "Mac", bArrX);
            this.f10987n = new t5.b(i, i, "Mac", bArrX);
            int i8 = i + i;
            this.f10988o = new t5.b(i8, i3, "AES", bArrX);
            int i9 = i8 + i3;
            this.f10989p = new t5.b(i9, i3, "AES", bArrX);
            int i10 = i9 + i3;
            this.f10990q = new t5.a(bArrX, i10, i6);
            this.f10991r = new t5.a(bArrX, i10 + i6, i6);
            Arrays.fill(bArrX, (byte) 0);
        } catch (InvalidKeyException e6) {
            throw new IllegalArgumentException("Cannot run Pseudo Random Function with invalid key", e6);
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        t5.c.b(this.f10984l0);
        this.f10984l0 = null;
        t5.c.b(this.f10983l);
        this.f10983l = null;
        t5.c.b(this.f10988o);
        this.f10988o = null;
        t5.c.b(this.f10985m);
        this.f10985m = null;
        t5.c.c(this.f10990q);
        this.f10990q = null;
        t5.c.b(this.f10989p);
        this.f10989p = null;
        t5.c.b(this.f10987n);
        this.f10987n = null;
        t5.c.c(this.f10991r);
        this.f10991r = null;
        this.f10992s = true;
    }

    public final void e() {
        this.f10954L = null;
        A a6 = (A) this.f10953K.get();
        if (a6 != null) {
            a6.f10883p = true;
            ScheduledFuture scheduledFuture = a6.f10884q;
            if (scheduledFuture != null) {
                if (!scheduledFuture.isDone()) {
                    a6.f10884q.cancel(true);
                }
                a6.f10884q = null;
            }
        }
    }

    public abstract void f(O o6);

    public final void g() {
        if (this.f10992s) {
            if (this.f10980j0) {
                throw new IllegalStateException("secrets destroyed after failure!", this.f10986m0);
            }
            if (!this.f10977h0) {
                throw new IllegalStateException("secrets destroyed ???");
            }
            throw new IllegalStateException("secrets destroyed after success!");
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    public final void h(B b6) throws HandshakeException {
        F.L[] lArr;
        if (!this.f10963U || (lArr = this.f10974f0) == null) {
            return;
        }
        int i = this.f10973e0;
        int length = lArr.length;
        Logger logger = this.f10976h;
        C c6 = this.f10995v;
        if (i >= length) {
            logger.warn("Cannot process {} message from peer [{}], no more expected!", F.L.l(b6), c6.f10894h);
            throw new HandshakeException("Cannot process " + F.L.l(b6) + " handshake message, no more expected!", new C0838c(EnumC0837b.FATAL, EnumC0835a.INTERNAL_ERROR, c6.f10894h));
        }
        F.L l6 = lArr[i];
        l6.getClass();
        boolean z5 = true;
        boolean z6 = b6.g() == ((EnumC0857w) l6.f1106c) && (!(b6 instanceof O) || ((O) b6).u() == ((P) l6.f1107d));
        if (z6 || !l6.f1105b) {
            z5 = z6;
        } else {
            int i3 = this.f10973e0 + 1;
            F.L[] lArr2 = this.f10974f0;
            if (i3 < lArr2.length) {
                F.L l7 = lArr2[i3];
                l7.getClass();
                if (b6.g() == ((EnumC0857w) l7.f1106c) && (!(b6 instanceof O) || ((O) b6).u() == ((P) l7.f1107d))) {
                    this.f10973e0++;
                } else {
                    z5 = z6;
                }
            } else {
                z5 = z6;
            }
        }
        if (z5) {
            return;
        }
        logger.warn("Cannot process {} message from peer [{}], {} expected!", F.L.l(b6), c6.f10894h, l6);
        throw new HandshakeException("Cannot process " + F.L.l(b6) + " handshake message, " + l6 + " expected!", new C0838c(EnumC0837b.FATAL, EnumC0835a.INTERNAL_ERROR, c6.f10894h));
    }

    public final MessageDigest i() {
        MessageDigest messageDigest;
        q5.o oVar = this.f10995v.f10898m.f11293l.f11283h.f11280n;
        if (oVar != null) {
            messageDigest = (MessageDigest) oVar.a();
            messageDigest.reset();
        } else {
            messageDigest = null;
        }
        ArrayList arrayList = this.f10959Q;
        int size = arrayList.size();
        int i = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            O o6 = (O) obj;
            messageDigest.update(o6.d());
            this.f10976h.trace("  [{}] - {}", Integer.valueOf(i), o6.u());
            i++;
        }
        return messageDigest;
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.f10992s;
    }

    public final void j() {
        e();
        Iterator it = this.f10972d0.iterator();
        while (it.hasNext()) {
            ((u0) it.next()).b(this);
        }
        t5.c.c(this);
        this.f10976h.debug("handshake completed {}", this.f10957O);
    }

    public final void k(Exception exc) {
        if (this.f10986m0 == null) {
            this.f10986m0 = exc;
        }
        if (this.f10980j0 || this.f10986m0 != exc) {
            return;
        }
        this.f10976h.debug("handshake failed {}", this.f10957O, exc);
        this.f10980j0 = true;
        e();
        Iterator it = this.f10972d0.iterator();
        while (it.hasNext()) {
            ((u0) it.next()).c(this, exc);
        }
        t5.c.c(this.f10995v);
        t5.c.c(this);
    }

    public final void l(int i) {
        Iterator it = this.f10972d0.iterator();
        while (it.hasNext()) {
            ((u0) it.next()).getClass();
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            W2.g gVar = ((k5.a) obj).f9951c;
        }
    }

    public final void m() {
        this.f10976h.debug("handshake started {}", this.f10957O);
        Iterator it = this.f10972d0.iterator();
        while (it.hasNext()) {
            ((u0) it.next()).a(this);
        }
    }

    public final boolean n() {
        return (this.f10977h0 || this.f10953K.get() == null || this.f10948B >= System.nanoTime()) ? false : true;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return (this.f10978i0 || this.f10957O.d()) ? false : true;
    }

    public abstract void q(SecretKey secretKey);

    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    public final void r(i0 i0Var) throws HandshakeException {
        C c6 = this.f10995v;
        int i = c6.f10905t;
        int i3 = i0Var.f11075c;
        Logger logger = this.f10976h;
        if (i != i3) {
            logger.debug("Discarding {} message with wrong epoch received from peer [{}]:{}{}", i0Var.f11073a, i0Var.d(), m5.s.f10493b, i0Var);
            throw new IllegalArgumentException(AbstractC0013g0.g("processing record with wrong epoch! ", i3, i, " expected "));
        }
        if (i0Var.f11077e < this.f10947A) {
            logger.debug("Discarding {} message received from peer [{}] before last flight was sent:{}{}", i0Var.f11073a, i0Var.d(), m5.s.f10493b, i0Var);
            return;
        }
        C0031p0 c0031p0 = this.f10958P;
        c0031p0.getClass();
        Q q6 = (Q) c0031p0.f395k;
        int i6 = q6.f10995v.f10905t;
        if (i3 != i6) {
            throw new IllegalArgumentException(AbstractC0013g0.g("record epoch ", i3, i6, " doesn't match session "));
        }
        B bC = i0Var.c();
        int iOrdinal = bC.g().ordinal();
        Logger logger2 = q6.f10976h;
        i0 i0Var2 = null;
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                logger2.warn("Cannot process message of type [{}], discarding...", bC.g());
            } else {
                O o6 = (O) bC;
                int i7 = o6.i;
                int i8 = q6.f10998y;
                if (i7 == i8) {
                    i0Var2 = i0Var;
                } else if (i7 > i8) {
                    logger2.debug("Queued newer {} message from current epoch, message_seq [{}] > next_receive_seq [{}]", o6.u(), Integer.valueOf(i7), Integer.valueOf(q6.f10998y));
                    q6.b(i0Var, (TreeSet) c0031p0.f394j);
                } else {
                    logger2.debug("Discarding old {} message_seq [{}] < next_receive_seq [{}]", o6.u(), Integer.valueOf(i7), Integer.valueOf(q6.f10998y));
                }
            }
        } else if (q6.f10975g0) {
            i0Var2 = i0Var;
        } else if (((i0) c0031p0.i) == null) {
            logger2.debug("Change Cipher Spec is not expected and therefore kept for later processing!");
            c0031p0.i = i0Var;
        } else {
            logger2.debug("Change Cipher Spec is received again!");
        }
        if (i0Var2 != null) {
            C0854t c0854t = this.f10957O;
            if (this.f10993t.isHeldByCurrentThread()) {
                logger.warn("Called from doProcessMessage, return immediately to process next message!", new Throwable("recursion-protection"));
                return;
            }
            try {
                int i9 = c6.f10905t;
                i0 i0VarK = i0Var2;
                int i10 = 0;
                while (i0VarK != null) {
                    long j4 = i0VarK.f11076d;
                    if (this.f10967Y == null && i0VarK.f11078f) {
                        this.f10967Y = Boolean.TRUE;
                    }
                    B bC2 = i0VarK.c();
                    if (bC2.g() == EnumC0857w.CHANGE_CIPHER_SPEC) {
                        h(bC2);
                        logger.debug("Processing {} message from peer [{}]", bC2.g(), bC2.c());
                        z();
                        this.f10973e0++;
                        logger.debug("Processed {} message from peer [{}]", bC2.g(), bC2.c());
                    } else {
                        if (bC2.g() != EnumC0857w.HANDSHAKE) {
                            throw new HandshakeException(String.format("Received unexpected message [%s] from peer %s", bC2.g(), bC2.c()), new C0838c(EnumC0837b.FATAL, EnumC0835a.HANDSHAKE_FAILURE, bC2.c()));
                        }
                        if (!s(i9, i10, (O) bC2)) {
                            break;
                        }
                    }
                    c6.f(i9, j4);
                    c0031p0.c(j4);
                    i0VarK = c0031p0.k();
                    i10++;
                }
                if (c6.f10905t > i9) {
                    m5.q qVar = c0854t.f11147f;
                    ArrayList arrayListB = B();
                    if (this.f10951E > 0) {
                        throw new HandshakeException(String.format("Received unexpected message left from peer %s", i0Var2.d()), new C0838c(EnumC0837b.FATAL, EnumC0835a.HANDSHAKE_FAILURE, i0Var2.d()));
                    }
                    int size = arrayListB.size();
                    int i11 = 0;
                    while (i11 < size) {
                        int i12 = i11 + 1;
                        i0 i0Var3 = (i0) arrayListB.get(i11);
                        if (qVar == null || qVar.isShutdown()) {
                            this.f10956N.l(i0Var3, c0854t);
                        } else {
                            try {
                                qVar.execute(new O1.n(17, (Object) this, (Object) i0Var3, false));
                            } catch (RejectedExecutionException e6) {
                                logger.debug("Execution rejected while processing record [type: {}, peer: {}]", i0Var2.f11073a, i0Var2.d(), e6);
                                this.f10956N.l(i0Var3, c0854t);
                            }
                        }
                        i11 = i12;
                    }
                }
            } catch (RuntimeException e7) {
                logger.warn("Cannot process handshake message from peer [{}] due to [{}]", c6.f10894h, e7.getMessage(), e7);
                throw new HandshakeException("Cannot process handshake message, caused by " + e7.getMessage(), new C0838c(EnumC0837b.FATAL, EnumC0835a.INTERNAL_ERROR, c6.f10894h), e7);
            } catch (GeneralSecurityException e8) {
                logger.warn("Cannot process handshake message from peer [{}] due to [{}]", c6.f10894h, e8.getMessage(), e8);
                throw new HandshakeException("Cannot process handshake message, caused by " + e8.getMessage(), new C0838c(EnumC0837b.FATAL, EnumC0835a.INTERNAL_ERROR, c6.f10894h), e8);
            }
        }
    }

    public final boolean s(int i, int i3, O o6) throws HandshakeException {
        if (this.f10993t.isHeldByCurrentThread()) {
            this.f10976h.warn("Called from doProcessMessage, return immediately to process next message!", new Throwable("recursion-protection"));
            return false;
        }
        A a6 = (A) this.f10953K.get();
        if (a6 != null) {
            this.f10976h.debug("response for flight {} started", Integer.valueOf(a6.f10872d));
            a6.f10882o = true;
        }
        while (o6 != null) {
            h(o6);
            if (o6.u() == P.FINISHED && i == 0) {
                this.f10976h.debug("FINISH with epoch 0 from peer [{}]!", this.f10995v.f10894h);
                throw new HandshakeException("FINISH with epoch 0!", new C0838c(EnumC0837b.FATAL, EnumC0835a.UNEXPECTED_MESSAGE, this.f10995v.f10894h));
            }
            if (o6 instanceof L) {
                L l6 = (L) o6;
                P p6 = l6.f10927o;
                Logger logger = this.f10976h;
                logger.debug("Processing {} message fragment ...", p6);
                int i6 = this.f10952F;
                int i7 = l6.f10928p;
                if (i7 > i6) {
                    throw new IllegalArgumentException("Fragmented message length exceeded (" + i7 + " > " + i6 + ")!");
                }
                try {
                    int i8 = l6.i;
                    h0 h0Var = this.f10960R;
                    if (h0Var == null) {
                        this.f10960R = new h0(l6);
                    } else {
                        if (h0Var.i != i8) {
                            throw new IllegalArgumentException("Current reassemble message has different seqn " + this.f10960R.i + " != " + i8);
                        }
                        h0Var.x(l6);
                    }
                    h0 h0Var2 = this.f10960R;
                    g0 g0Var = (g0) h0Var2.f11068q.get(0);
                    if (g0Var.f11059a == 0 && h0Var2.f11066o.length <= g0Var.f11061c) {
                        h0 h0Var3 = this.f10960R;
                        logger.debug("Successfully re-assembled {} message", h0Var3.f11067p);
                        this.f10960R = null;
                        o6 = h0Var3;
                    } else {
                        o6 = null;
                    }
                    if (o6 == null) {
                        break;
                    }
                } catch (IllegalArgumentException e6) {
                    throw new HandshakeException(e6.getMessage(), new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, (InetSocketAddress) l6.f603h));
                }
            }
            if (o6 instanceof M) {
                M m6 = (M) o6;
                C c6 = this.f10995v;
                C0495p c0495p = c6.f10889B ? new C0495p(c6.f10898m.i, c6.f10888A) : null;
                Logger logger2 = O.f10931m;
                InetSocketAddress inetSocketAddress = (InetSocketAddress) m6.f603h;
                try {
                    P pU = m6.u();
                    logger2.trace("Parsing HANDSHAKE message of type [{}]", pU);
                    byte[] bArrD = m6.d();
                    O oQ = O.q(pU, new m5.h(m6.p(), false), c0495p, inetSocketAddress);
                    oQ.f10932j = bArrD;
                    oQ.v(m6.i);
                    oQ.f10934l = m6.f10934l;
                    o6 = oQ;
                } catch (IllegalArgumentException e7) {
                    logger2.debug("Handshake message from peer [{}] malformed", inetSocketAddress, e7);
                    throw new HandshakeException("Handshake message malformed, " + e7.getMessage(), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
                }
            }
            if (this.f10999z) {
                if (a6 != null) {
                    this.f10976h.debug("Received ({}) FINISHED message again, retransmitting last flight...", this.f10995v.f10894h);
                    a6.f10873e++;
                    x(a6);
                    return false;
                }
                Exception exc = this.f10986m0;
                if (exc != null) {
                    this.f10976h.error("last flight missing, handshake already failed! {}", o6, exc);
                    return false;
                }
                if (i3 == 0) {
                    this.f10976h.error("last flight missing, resend failed! {}", o6);
                    return false;
                }
                this.f10976h.error("last flight missing, resend for buffered message {} failed! {}", Integer.valueOf(i3), o6);
                return false;
            }
            if (this.f10976h.isDebugEnabled()) {
                StringBuilder sb = new StringBuilder();
                sb.append(String.format("Processing %s message from peer [%s], seqn: [%d]", o6.u(), (InetSocketAddress) o6.f603h, Integer.valueOf(o6.i)));
                if (this.f10976h.isTraceEnabled()) {
                    sb.append(":");
                    sb.append(m5.s.f10493b);
                    sb.append(o6);
                }
                this.f10976h.debug(sb.toString());
            }
            if (i == 0) {
                this.f10959Q.add(o6);
            }
            this.f10993t.lock();
            try {
                f(o6);
                this.f10993t.unlock();
                this.f10976h.debug("Processed {} message from peer [{}]", o6.u(), (InetSocketAddress) o6.f603h);
                if (!this.f10999z) {
                    this.f10998y++;
                    this.f10973e0++;
                }
                o6 = o6.f10934l;
                if (this.f10968Z == null && o6 != null) {
                    this.f10968Z = Boolean.TRUE;
                }
            } catch (Throwable th) {
                this.f10993t.unlock();
                throw th;
            }
        }
        return true;
    }

    public final void t(e0 e0Var) {
        if (!this.f10982k0) {
            throw new IllegalStateException("psk secret not pending!");
        }
        this.f10982k0 = false;
        try {
            g();
            boolean z5 = this.f10962T;
            C c6 = this.f10995v;
            String str = z5 ? c6.G : null;
            d0 d0Var = e0Var.f11049b;
            t5.b bVar = e0Var.f11048a;
            if (bVar == null) {
                C0838c c0838c = new C0838c(EnumC0837b.FATAL, EnumC0835a.UNKNOWN_PSK_IDENTITY, c6.f10894h);
                if (str == null) {
                    throw new HandshakeException("No pre-shared key found for [identity: " + d0Var + "]", c0838c);
                }
                throw new HandshakeException("No pre-shared key found for [virtual host: " + str + ", identity: " + d0Var + "]", c0838c);
            }
            Logger logger = this.f10976h;
            if (str != null) {
                logger.trace("client [{}] uses PSK identity [{}] for server [{}]", c6.f10894h, d0Var, str);
            } else {
                logger.trace("client [{}] uses PSK identity [{}]", c6.f10894h, d0Var);
            }
            c6.f10895j = z5 ? new l5.c(str, d0Var.f11039f, true) : new l5.c(null, d0Var.f11039f, false);
            if ("PSK".equals(bVar.i)) {
                Mac macD = c6.f10898m.d();
                t5.b bVarC0 = p027e3.a.c0(this.f10984l0, bVar);
                f0 f0Var = this.f10979j;
                f0 f0Var2 = this.f10981k;
                byte[] bArr = f0Var.f10440a;
                byte[] bArr2 = f0Var2.f10440a;
                int length = bArr.length;
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length + length2];
                System.arraycopy(bArr, 0, bArr3, 0, length);
                System.arraycopy(bArr2, 0, bArr3, length, length2);
                t5.b bVarB0 = p027e3.a.b0(macD, bVarC0, bArr3);
                t5.c.c(bVarC0);
                t5.c.c(bVar);
                bVar = bVarB0;
            }
            q(bVar);
            t5.c.b(this.f10984l0);
            this.f10984l0 = null;
        } catch (Throwable th) {
            t5.c.b(this.f10984l0);
            this.f10984l0 = null;
            throw th;
        }
    }

    public final void u(i0 i0Var, AbstractCollection abstractCollection) {
        if (abstractCollection.remove(i0Var)) {
            int length = (i0Var.h() ? i0Var.i.f10440a.length : 0) + 13 + i0Var.f11080h.length;
            int i = this.f10951E;
            if (i >= length) {
                this.f10951E = i - length;
            } else {
                this.f10976h.warn("deferred processed incoming records corrupted for peer [{}]! Removing {} bytes exceeds available {} bytes!", i0Var.d(), Integer.valueOf(length), Integer.valueOf(this.f10951E));
                throw new IllegalArgumentException("deferred processing of incoming records corrupted!");
            }
        }
    }

    public final e0 v(d0 d0Var, t5.b bVar) {
        boolean z5 = this.f10962T;
        C c6 = this.f10995v;
        t5.e eVar = z5 ? c6.H : null;
        String str = c6.f10898m.f11293l.f11283h.f11275h;
        this.f10982k0 = true;
        this.f10984l0 = t5.c.a(bVar);
        C0855u c0855u = this.f10957O.f11149h;
        f0 f0Var = this.f10979j;
        f0 f0Var2 = this.f10981k;
        byte[] bArr = f0Var.f10440a;
        byte[] bArr2 = f0Var2.f10440a;
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length + length2];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, length2);
        e0 e0Var = this.f10996w.f11804a;
        t5.b bVarA = eVar != null ? e0Var.a(d0Var) : e0Var.a(d0Var);
        if (bVarA != null) {
            q5.t tVar = (q5.t) r5.a.f11803b.q(str);
            t5.b bVarC0 = p027e3.a.c0(bVar, bVarA);
            t5.b bVarB0 = p027e3.a.b0((Mac) tVar.a(), bVarC0, bArr3);
            t5.c.c(bVarC0);
            t5.c.c(bVarA);
            bVarA = bVarB0;
        }
        return new e0(c0855u, d0Var, bVarA);
    }

    public void w() {
    }

    public final void x(A a6) {
        int i = a6.f10872d;
        C c6 = this.f10995v;
        n5.g gVar = this.f10956N;
        e();
        try {
            a6.f10874f = this.f10971c0;
            long jNanoTime = System.nanoTime();
            this.f10947A = jNanoTime;
            this.f10948B = this.f10949C + jNanoTime;
            int iD = gVar.d(this.f10994u);
            Integer num = c6.f10896k;
            ArrayList arrayListB = a6.b(iD, num != null ? num.intValue() : c6.f10897l, this.f10968Z, this.f10967Y, false);
            this.f10976h.trace("Sending flight of {} message(s) to peer [{}] using {} datagram(s) of max. {} bytes", Integer.valueOf(a6.f10870b.size()), c6.f10894h, Integer.valueOf(arrayListB.size()), Integer.valueOf(iD));
            int size = arrayListB.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayListB.get(i3);
                i3++;
                gVar.r((DatagramPacket) obj);
            }
            this.f10953K.set(a6);
            if (a6.f10881n) {
                O1.n nVar = new O1.n(this, a6);
                this.f10954L = nVar;
                a6.c(this.f10955M, nVar);
            }
        } catch (IOException e6) {
            k(new Exception(AbstractC0013g0.f(i, "handshake flight ", " failed!"), e6));
        } catch (HandshakeException e7) {
            k(new Exception(AbstractC0013g0.f(i, "handshake flight ", " failed!"), e7));
        }
    }

    public final void y() {
        if (this.f10977h0) {
            return;
        }
        C c6 = this.f10995v;
        AbstractC0859y abstractC0859y = c6.f10906u == 0 ? AbstractC0859y.f11174j : c6.f10904s;
        abstractC0859y.getClass();
        boolean zEquals = q5.i.f11286r.equals(abstractC0859y.f11175h);
        C0854t c0854t = this.f10957O;
        if (zEquals) {
            InetSocketAddress inetSocketAddress = c0854t.f11148g;
            k(new DtlsException("Failed establishing a incomplete session."));
            return;
        }
        this.f10976h.debug("session established {}", c0854t);
        Principal principal = c6.f10895j;
        if (principal instanceof l5.a) {
            c6.f10895j = ((l5.a) principal).a(new l5.b());
        }
        this.f10977h0 = true;
        Iterator it = this.f10972d0.iterator();
        while (it.hasNext()) {
            ((u0) it.next()).d(this, c6);
        }
    }

    public final void z() {
        AbstractC0859y abstractC0859yA;
        if (this.i) {
            C c6 = this.f10995v;
            abstractC0859yA = AbstractC0859y.a(c6.f10898m, c6.f10900o, this.f10989p, this.f10991r, this.f10987n);
        } else {
            C c7 = this.f10995v;
            abstractC0859yA = AbstractC0859y.a(c7.f10898m, c7.f10900o, this.f10988o, this.f10990q, this.f10985m);
        }
        C c8 = this.f10995v;
        if (abstractC0859yA == null) {
            c8.getClass();
            throw new NullPointerException("Read state must not be null");
        }
        t5.c.c(c8.f10903r);
        c8.f10903r = abstractC0859yA;
        c8.f10892E = 0L;
        c8.f10890C = -1L;
        c8.f10891D = 0L;
        c8.f10905t++;
        C.f10887K.trace("Setting current read state to{}{}", m5.s.f10493b, abstractC0859yA);
    }
}
