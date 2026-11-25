package n5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.PortUnreachableException;
import java.net.SocketAddress;
import java.net.SocketException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m5.k;
import m5.m;
import m5.n;
import m5.o;
import m5.p;
import m5.q;
import m5.s;
import org.eclipse.californium.elements.exception.EndpointUnconnectedException;
import org.eclipse.californium.scandium.dtls.HandshakeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p057l.B0;
import p5.B;
import p5.C;
import p5.C0838c;
import p5.C0839d;
import p5.C0850o;
import p5.C0854t;
import p5.C0855u;
import p5.EnumC0835a;
import p5.EnumC0837b;
import p5.EnumC0857w;
import p5.O;
import p5.Q;
import p5.T;
import p5.V;
import p5.X;
import p5.c0;
import p5.i0;
import p5.l0;
import p5.n0;
import p5.r0;
import p5.t0;
import p5.v0;
import q5.i;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f10584A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final long f10585B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Logger f10586y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Logger f10587z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5.a f10588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f10589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f10591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10595h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f10596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedList f10597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ScheduledFuture f10598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InetSocketAddress f10599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10601o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f10602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f10603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f10604r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile DatagramSocket f10605s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ScheduledExecutorService f10606t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f10607u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e f10608v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ExecutorService f10609w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10610x;

    static {
        Logger logger = LoggerFactory.getLogger((Class<?>) g.class);
        f10586y = logger;
        f10587z = LoggerFactory.getLogger(logger.getName() + ".drops");
        if (i.f11288t == 0) {
            int iMax = 0;
            for (i iVar : i.values()) {
                if (iVar.g()) {
                    iMax = Math.max(iMax, iVar.f11294m);
                }
            }
            i.f11288t = iMax;
        }
        f10584A = i.f11288t + 16409;
        f10585B = TimeUnit.SECONDS.toMillis(60L);
    }

    public g(o5.a aVar) {
        X x6 = new X(aVar.f10702y.intValue(), aVar.f10703z.longValue());
        String str = aVar.I;
        synchronized (x6) {
            x6.f11011e = s.c(str);
        }
        this.f10591d = new AtomicInteger();
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f10596j = atomicInteger;
        this.f10597k = new LinkedList();
        this.f10600n = 576;
        this.f10601o = 1280;
        this.f10602p = f10584A;
        this.f10603q = new a();
        this.f10604r = new Object();
        this.f10607u = new AtomicBoolean(false);
        this.f10588a = aVar;
        atomicInteger.set(aVar.f10699v.intValue());
        this.f10592e = aVar.f10688k.booleanValue();
        this.f10593f = aVar.f10689l;
        int iIntValue = aVar.G.intValue();
        this.f10594g = iIntValue;
        this.f10595h = aVar.f10672F.booleanValue() || iIntValue != 0;
        this.i = aVar.H.booleanValue();
        this.f10589b = x6;
        if (x6.f11010d != null) {
            throw new IllegalStateException("Connection id generator already attached!");
        }
        int iNumberOfLeadingZeros = (39 - Integer.numberOfLeadingZeros(x6.f11007a.f10468c)) / 8;
        x6.f11010d = new W4.i(iNumberOfLeadingZeros + (iNumberOfLeadingZeros < 3 ? 2 : 3));
        this.f10608v = new e(this, x6);
        int iIntValue2 = aVar.f10702y.intValue();
        long jIntValue = aVar.f10670D.intValue();
        long j4 = ((((long) iIntValue2) * jIntValue) + 50) / 100;
        if (j4 == 0 && jIntValue > 0) {
            j4 = 1;
        }
        this.f10590c = (int) j4;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:102:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x015d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0164  */
    /* JADX WARN: Code duplicated, block: B:90:0x0167  */
    /* JADX WARN: Code duplicated, block: B:91:0x016a  */
    /* JADX WARN: Code duplicated, block: B:93:0x016e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0175  */
    /* JADX WARN: Code duplicated, block: B:96:0x0191  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011a, code lost:
    
        if (r21.f11150j != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(n5.g r17, long r18, k5.a r20, p5.C0854t r21) {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.g.a(n5.g, long, k5.a, p5.t):void");
    }

    public final void b(i0 i0Var, HandshakeException handshakeException) {
        byte[] bArr = i0Var.f11080h;
        Logger logger = f10587z;
        boolean zIsTraceEnabled = logger.isTraceEnabled();
        int i = i0Var.f11075c;
        if (zIsTraceEnabled) {
            logger.trace("Discarding received {} record (epoch {}, payload: {}) from peer [{}]: ", i0Var.f11073a, Integer.valueOf(i), s.b(64, bArr), i0Var.d(), handshakeException);
        } else if (logger.isDebugEnabled()) {
            logger.debug("Discarding received {} record (epoch {}, payload: {}) from peer [{}]: {}", i0Var.f11073a, Integer.valueOf(i), s.b(16, bArr), i0Var.d(), handshakeException.getMessage());
        }
    }

    public final C0854t c(InetSocketAddress inetSocketAddress, C0855u c0855u, boolean z5) {
        ExecutorService executorService;
        C0854t c0854tD;
        synchronized (this) {
            executorService = this.f10609w;
        }
        synchronized (this.f10589b) {
            try {
                if (c0855u != null) {
                    c0854tD = this.f10589b.d(c0855u);
                } else {
                    C0854t c0854tC = this.f10589b.c(inetSocketAddress);
                    if (c0854tC == null && z5) {
                        f10586y.trace("create new connection for {}", inetSocketAddress);
                        C0854t c0854t = new C0854t(inetSocketAddress, new q(executorService));
                        c0854t.f();
                        if (!this.f10607u.get() || this.f10589b.e(c0854t)) {
                            return c0854t;
                        }
                        return null;
                    }
                    c0854tD = c0854tC;
                }
                if (c0854tD == null) {
                    f10586y.trace("no connection available for {},{}", inetSocketAddress, c0855u);
                } else if (c0854tD.e() || !this.f10607u.get()) {
                    f10586y.trace("connection available for {},{}", inetSocketAddress, c0855u);
                } else {
                    f10586y.trace("revive connection for {},{}", inetSocketAddress, c0855u);
                    q qVar = new q(executorService);
                    if (c0854tD.e()) {
                        throw new IllegalStateException("Serial executor already available!");
                    }
                    c0854tD.f11147f = qVar;
                    c0854tD.f();
                }
                return c0854tD;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int d(boolean z5) {
        int i = z5 ? 128 : 64;
        int i3 = z5 ? this.f10601o : this.f10600n;
        int i6 = i3 - i;
        if (i6 < 64) {
            throw new IllegalStateException(String.format("%s, datagram size %d, mtu %d", z5 ? "IPV6" : "IPv4", Integer.valueOf(i6), Integer.valueOf(i3)));
        }
        return i6;
    }

    public final void e(HandshakeException handshakeException, EnumC0837b enumC0837b, EnumC0835a enumC0835a, C0854t c0854t, i0 i0Var) {
        EnumC0837b enumC0837b2 = EnumC0837b.FATAL;
        if (!enumC0837b2.equals(enumC0837b)) {
            if (i0Var != null) {
                b(i0Var, handshakeException);
                return;
            }
            return;
        }
        if (EnumC0835a.UNKNOWN_PSK_IDENTITY == enumC0835a) {
            if (i0Var != null) {
                b(i0Var, handshakeException);
                return;
            }
            return;
        }
        Q qB = c0854t.b();
        if (qB != null) {
            Logger logger = f10586y;
            if (logger.isTraceEnabled()) {
                logger.trace("Aborting handshake with peer [{}]:", c0854t.f11148g, handshakeException);
            } else if (logger.isDebugEnabled()) {
                logger.debug("Aborting handshake with peer [{}]: {}", c0854t.f11148g, handshakeException.getMessage());
            }
            qB.e();
            qB.f10986m0 = handshakeException;
            C c6 = qB.f10995v;
            C0838c c0838c = new C0838c(enumC0837b2, enumC0835a, c0854t.f11148g);
            if (c0854t.d()) {
                C c7 = c0854t.i;
                C c8 = qB.f10995v;
                if (c7 == c8) {
                    C0838c c0838c2 = handshakeException.f10704h;
                    if (c0838c2 == null || c0838c2.f11034j != EnumC0835a.CLOSE_NOTIFY) {
                        logger.warn("Handshake with [{}] failed after session was established! {}", c8.f10894h, c0838c2);
                    } else {
                        logger.debug("Handshake with [{}] closed after session was established!", c8.f10894h);
                    }
                } else {
                    logger.warn("Handshake with [{}] failed, but has an established session!", c8.f10894h);
                }
                o(c0838c, c6);
            } else {
                x(c0854t, c0838c, c6);
            }
            qB.k(handshakeException);
        }
    }

    public final void f(Q q6) {
        e eVar = this.f10608v;
        if (eVar != null) {
            q6.f10972d0.add(eVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0097, code lost:
    
        if (r1 != null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(p5.C0850o r9, p5.i0 r10, p057l.B0 r11) {
        /*
            r8 = this;
            n5.a r0 = r8.f10603q
            byte[] r1 = r9.f11124q     // Catch: java.security.GeneralSecurityException -> L38
            int r2 = r1.length     // Catch: java.security.GeneralSecurityException -> L38
            org.slf4j.Logger r3 = n5.g.f10586y
            r4 = 1
            r5 = 0
            if (r2 <= 0) goto L61
            byte[] r11 = r0.a(r9)     // Catch: java.security.GeneralSecurityException -> L38
            boolean r2 = java.security.MessageDigest.isEqual(r11, r1)     // Catch: java.security.GeneralSecurityException -> L38
            if (r2 == 0) goto L17
            goto L99
        L17:
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r0.f10570d     // Catch: java.security.GeneralSecurityException -> L38
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r6 = r2.readLock()     // Catch: java.security.GeneralSecurityException -> L38
            r6.lock()     // Catch: java.security.GeneralSecurityException -> L38
            t5.b r0 = r0.f10569c     // Catch: java.lang.Throwable -> L58
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r2.readLock()     // Catch: java.security.GeneralSecurityException -> L38
            r2.unlock()     // Catch: java.security.GeneralSecurityException -> L38
            if (r0 == 0) goto L2f
            byte[] r5 = n5.a.b(r9, r0)     // Catch: java.security.GeneralSecurityException -> L38
        L2f:
            if (r5 == 0) goto L3a
            boolean r0 = java.security.MessageDigest.isEqual(r5, r1)     // Catch: java.security.GeneralSecurityException -> L38
            if (r0 == 0) goto L3a
            goto L99
        L38:
            r8 = move-exception
            goto L9f
        L3a:
            boolean r0 = r3.isDebugEnabled()     // Catch: java.security.GeneralSecurityException -> L38
            if (r0 == 0) goto L56
            java.lang.String r0 = "provided cookie must {} match {}. Send verify request to {}"
            r2 = 6
            java.lang.String r1 = m5.s.b(r2, r1)     // Catch: java.security.GeneralSecurityException -> L38
            java.lang.String r2 = m5.s.b(r2, r11)     // Catch: java.security.GeneralSecurityException -> L38
            java.net.InetSocketAddress r4 = r10.d()     // Catch: java.security.GeneralSecurityException -> L38
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r4}     // Catch: java.security.GeneralSecurityException -> L38
            r3.debug(r0, r1)     // Catch: java.security.GeneralSecurityException -> L38
        L56:
            r5 = r11
            goto L9a
        L58:
            r8 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r10 = r2.readLock()     // Catch: java.security.GeneralSecurityException -> L38
            r10.unlock()     // Catch: java.security.GeneralSecurityException -> L38
            throw r8     // Catch: java.security.GeneralSecurityException -> L38
        L61:
            int r0 = r8.f10590c
            if (r0 <= 0) goto L9a
            java.util.concurrent.atomic.AtomicInteger r1 = r8.f10591d     // Catch: java.security.GeneralSecurityException -> L38
            int r1 = r1.get()     // Catch: java.security.GeneralSecurityException -> L38
            java.lang.String r2 = "pending fast resumptions [{}], threshold [{}]"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)     // Catch: java.security.GeneralSecurityException -> L38
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch: java.security.GeneralSecurityException -> L38
            r3.trace(r2, r6, r7)     // Catch: java.security.GeneralSecurityException -> L38
            if (r1 >= r0) goto L9a
            p5.X r0 = r8.f10589b     // Catch: java.security.GeneralSecurityException -> L38
            p5.t0 r1 = r9.f11123p     // Catch: java.security.GeneralSecurityException -> L38
            monitor-enter(r0)     // Catch: java.security.GeneralSecurityException -> L38
            if (r1 == 0) goto L91
            boolean r2 = r1.b()     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L88
            goto L91
        L88:
            p5.t r1 = r0.b(r1)     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r0)     // Catch: java.security.GeneralSecurityException -> L38
            goto L93
        L8e:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.security.GeneralSecurityException -> L38
        L91:
            monitor-exit(r0)     // Catch: java.security.GeneralSecurityException -> L38
            r1 = r5
        L93:
            r11.f9968d = r1     // Catch: java.security.GeneralSecurityException -> L38
            r11.f9965a = r4     // Catch: java.security.GeneralSecurityException -> L38
            if (r1 == 0) goto L9a
        L99:
            return r4
        L9a:
            r11 = 0
            r8.p(r9, r10, r5)     // Catch: java.security.GeneralSecurityException -> L38
            return r11
        L9f:
            org.eclipse.californium.scandium.dtls.DtlsHandshakeException r10 = new org.eclipse.californium.scandium.dtls.DtlsHandshakeException
            p5.a r11 = p5.EnumC0835a.INTERNAL_ERROR
            p5.b r0 = p5.EnumC0837b.FATAL
            java.lang.Object r9 = r9.f603h
            java.lang.String r9 = "Cannot compute cookie for peer"
            r10.<init>(r9, r8)
            if (r11 == 0) goto Lb9
            if (r0 == 0) goto Lb1
            throw r10
        Lb1:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "Level must not be null"
            r8.<init>(r9)
            throw r8
        Lb9:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "Description must not be null"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.g.g(p5.o, p5.i0, l.B0):boolean");
    }

    public final void h(i0 i0Var, C0854t c0854t, C c6) {
        C0838c c0838c = (C0838c) i0Var.c();
        Q qB = c0854t.b();
        f10586y.trace("Processing {} ALERT from [{}]: {}", c0838c.i, c0838c.f11033h, c0838c.f11034j);
        EnumC0835a enumC0835a = EnumC0835a.CLOSE_NOTIFY;
        HandshakeException handshakeException = null;
        if (enumC0835a.equals(c0838c.f11034j)) {
            if (c0854t.d()) {
                InetSocketAddress inetSocketAddressD = i0Var.d();
                if (this.f10589b.c(inetSocketAddressD) == c0854t) {
                    inetSocketAddressD = null;
                }
                if (!c6.f(i0Var.f11075c, i0Var.f11076d) && this.i) {
                    inetSocketAddressD = null;
                }
                if (qB != null) {
                    qB.j();
                }
                c0854t.f11146e = System.nanoTime();
                this.f10589b.i(c0854t, inetSocketAddressD);
            } else {
                handshakeException = new HandshakeException("Received 'close notify'", c0838c);
                if (qB != null) {
                    qB.e();
                    qB.f10986m0 = handshakeException;
                }
            }
            if (!c0854t.f11150j) {
                if (c6.f10894h != null) {
                    o(new C0838c(EnumC0837b.WARNING, enumC0835a, c0838c.f11033h), c6);
                }
                if (c0854t.d()) {
                    C c7 = c0854t.i;
                    if (c7 != null) {
                        int i = i0Var.f11075c;
                        long j4 = i0Var.f11076d;
                        c7.f10910y = true;
                        c7.f10908w = i;
                        c7.f10909x = j4;
                    }
                } else {
                    this.f10589b.g(c0854t, true);
                }
            }
        } else if (EnumC0837b.FATAL.equals(c0838c.i)) {
            handshakeException = new HandshakeException("Received 'fatal alert'", c0838c);
            if (qB != null) {
                qB.e();
                qB.f10986m0 = handshakeException;
            }
            this.f10589b.g(c0854t, true);
        }
        synchronized (this.f10604r) {
        }
        if (handshakeException == null || qB == null) {
            return;
        }
        qB.k(handshakeException);
    }

    public final void i(i0 i0Var, C0854t c0854t) {
        Q qB = c0854t.b();
        C c6 = c0854t.i;
        if (c6 == null || c0854t.f11150j) {
            if (qB != null) {
                qB.b(i0Var, qB.J);
                return;
            } else {
                f10587z.debug("Discarding APPLICATION_DATA record received from peer [{}]", i0Var.d());
                return;
            }
        }
        InetSocketAddress inetSocketAddressD = i0Var.d();
        if (this.f10589b.c(inetSocketAddressD) == c0854t) {
            inetSocketAddressD = null;
        }
        InetSocketAddress inetSocketAddress = (c6.f((long) i0Var.f11075c, i0Var.f11076d) || !this.i) ? inetSocketAddressD : null;
        if (qB != null) {
            qB.j();
        }
        c0854t.f11146e = System.nanoTime();
        this.f10589b.i(c0854t, inetSocketAddress);
    }

    public final void j(i0 i0Var, C0854t c0854t) {
        Q qB = c0854t.b();
        if (qB == null) {
            f10587z.debug("Received CHANGE_CIPHER_SPEC record from peer [{}] with no handshake going on", i0Var.d());
            return;
        }
        try {
            qB.r(i0Var);
        } catch (HandshakeException e6) {
            C0838c c0838c = e6.f10704h;
            e(e6, c0838c.i, c0838c.f11034j, c0854t, i0Var);
        }
    }

    public final void k(i0 i0Var, C0854t c0854t) {
        f10586y.trace("Received {} record from peer [{}]", i0Var.f11073a, i0Var.d());
        try {
            if (i0Var.e()) {
                throw new IllegalArgumentException("new CLIENT_HELLO must be processed by processClientHello!");
            }
            int iOrdinal = ((O) i0Var.c()).u().ordinal();
            boolean z5 = true;
            if (iOrdinal == 0) {
                if (c0854t.f11142a.get() == null) {
                    z5 = false;
                }
                if (z5) {
                    f10587z.debug("Ignoring HELLO_REQUEST received from [{}] while already in an ongoing handshake with peer", c0854t.f11148g);
                    return;
                } else {
                    o(new C0838c(EnumC0837b.WARNING, EnumC0835a.NO_RENEGOTIATION, c0854t.f11148g), c0854t.i);
                    return;
                }
            }
            if (iOrdinal == 1) {
                f10587z.debug("Reject re-negotiation from peer {}", i0Var.d());
                o(new C0838c(EnumC0837b.WARNING, EnumC0835a.NO_RENEGOTIATION, i0Var.d()), c0854t.i);
            } else {
                Q qB = c0854t.b();
                if (qB != null) {
                    qB.r(i0Var);
                } else {
                    f10587z.debug("Discarding HANDSHAKE message [epoch={}] from peer [{}], no ongoing handshake!", Integer.valueOf(i0Var.f11075c), i0Var.d());
                }
            }
        } catch (HandshakeException e6) {
            C0838c c0838c = e6.f10704h;
            e(e6, c0838c.i, c0838c.f11034j, c0854t, i0Var);
        }
    }

    public final void l(i0 i0Var, C0854t c0854t) {
        try {
            if (i0Var.i == null && !c0854t.a(i0Var.d())) {
                f10587z.info("Drop received record {}, connection changed address {} => {}! (shift {}ms)", i0Var.f11073a, i0Var.d(), c0854t.f11148g, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - i0Var.f11077e)));
                return;
            }
            int i = i0Var.f11075c;
            Logger logger = f10586y;
            logger.trace("Received DTLS record of type [{}], length: {}, [epoche:{},rseqn:{}]", i0Var.f11073a, Integer.valueOf(i0Var.f11080h.length), Integer.valueOf(i), Long.valueOf(i0Var.f11076d));
            Q qB = c0854t.b();
            if (qB != null && qB.n()) {
                qB.k(new Exception("handshake already expired!"));
                if (this.f10589b.d(c0854t.f11149h) != c0854t) {
                    f10587z.debug("Discarding {} record [epoch {}, rseqn {}] received from peer [{}], handshake expired!", i0Var.f11073a, Integer.valueOf(i), Long.valueOf(i0Var.f11076d), i0Var.d(), Integer.valueOf(i));
                    return;
                }
                qB = null;
            }
            C c6 = c0854t.c(i);
            if (c6 == null) {
                if (qB != null && qB.f10995v.f10905t == 0 && i == 1) {
                    qB.b(i0Var, qB.J);
                    return;
                } else {
                    f10587z.debug("Discarding {} record [epoch {}, rseqn {}] received from peer [{}] without an active session", i0Var.f11073a, Integer.valueOf(i), Long.valueOf(i0Var.f11076d), i0Var.d());
                    return;
                }
            }
            C c7 = c0854t.i;
            boolean z5 = c7 != null && c7.f10910y;
            if ((this.f10595h || z5) && !c6.e(i, i0Var.f11076d, this.f10594g)) {
                if (z5) {
                    f10587z.debug("Discarding {} record [epoch {}, rseqn {}] received from closed peer [{}]", i0Var.f11073a, Integer.valueOf(i), Long.valueOf(i0Var.f11076d), i0Var.d());
                    return;
                } else {
                    f10587z.debug("Discarding duplicate {} record [epoch {}, rseqn {}] received from peer [{}]", i0Var.f11073a, Integer.valueOf(i), Long.valueOf(i0Var.f11076d), i0Var.d());
                    return;
                }
            }
            EnumC0857w enumC0857w = i0Var.f11073a;
            if (enumC0857w == EnumC0857w.TLS12_CID && i == 0) {
                f10587z.debug("Discarding TLS_CID record received from peer [{}] during handshake", i0Var.d());
                return;
            }
            if (i0Var.f11079g == null || enumC0857w != EnumC0857w.APPLICATION_DATA) {
                i0Var.a(c6);
            }
            if (qB != null && qB.o()) {
                if (c0854t.d()) {
                    this.f10589b.h(c0854t.i, c0854t);
                }
                if (c0854t.i == null) {
                    throw new IllegalStateException("No session established nor ticket available!");
                }
                c0854t.i = null;
                c0854t.f11150j = false;
                qB.w();
                logger.trace("handshake probe successful {}", c0854t.f11148g);
            }
            int iOrdinal = i0Var.f11073a.ordinal();
            if (iOrdinal == 0) {
                j(i0Var, c0854t);
                return;
            }
            if (iOrdinal == 1) {
                h(i0Var, c0854t, c6);
                return;
            }
            if (iOrdinal == 2) {
                k(i0Var, c0854t);
            } else if (iOrdinal != 3) {
                f10587z.debug("Discarding record of unsupported type [{}] from peer [{}]", i0Var.f11073a, i0Var.d());
            } else {
                i(i0Var, c0854t);
            }
        } catch (RuntimeException e6) {
            f10586y.warn("Unexpected error occurred while processing record from peer [{}]", i0Var.d(), e6);
            w(c0854t, EnumC0837b.FATAL, EnumC0835a.INTERNAL_ERROR);
        } catch (GeneralSecurityException e7) {
            f10587z.debug("Discarding {} received from peer [{}] caused by {}", i0Var.f11073a, i0Var.d(), e7.getMessage());
            f10586y.debug("error occurred while processing record from peer [{}]", i0Var.d(), e7);
        } catch (HandshakeException e8) {
            f10586y.debug("error occurred while processing record from peer [{}]", i0Var.d(), e8);
        }
    }

    public final void m(C0850o c0850o, i0 i0Var, B0 b6) throws HandshakeException {
        v0 v0Var;
        C0854t c0854tB;
        InetSocketAddress inetSocketAddressD = i0Var.d();
        Logger logger = f10586y;
        logger.trace("Client [{}] wants to resume session with ID [{}]", inetSocketAddressD, c0850o.f11123p);
        C0854t c0854t = (C0854t) b6.f9967c;
        if (c0854t == null) {
            throw new NullPointerException("connection by address must not be null!");
        }
        if (!c0854t.a(inetSocketAddressD)) {
            throw new IllegalArgumentException("connection must have records address!");
        }
        boolean zEquals = true;
        if (!b6.f9965a) {
            X x6 = this.f10589b;
            t0 t0Var = c0850o.f11123p;
            synchronized (x6) {
                if (t0Var != null) {
                    c0854tB = t0Var.b() ? null : x6.b(t0Var);
                }
            }
            b6.f9968d = c0854tB;
            b6.f9965a = true;
        }
        C0854t c0854t2 = (C0854t) b6.f9968d;
        if (c0854t2 == null || c0854t2.i == null) {
            v0Var = null;
        } else {
            v0 v0VarD = c0854t2.d() ? c0854t2.i.d() : null;
            if (v0VarD != null && this.f10588a.f10669C.booleanValue()) {
                t5.e eVar = v0VarD.f11157l;
                T t6 = c0850o.f11127t;
                r0 r0Var = t6 != null ? (r0) T.c(1, t6.f11002a) : null;
                t5.e eVar2 = r0Var != null ? r0Var.f11138b : null;
                if (eVar != null) {
                    zEquals = eVar.equals(eVar2);
                } else if (eVar2 != null) {
                    zEquals = false;
                }
            }
            if (zEquals || v0VarD == null) {
                v0Var = v0VarD;
            } else {
                t5.c.c(v0VarD);
                v0Var = null;
            }
        }
        if (v0Var == null) {
            logger.trace("Client [{}] tries to resume non-existing session [ID={}], performing full handshake instead ...", inetSocketAddressD, c0850o.f11123p);
            u(c0850o, i0Var, c0854t);
            return;
        }
        v0 v0Var2 = v0Var;
        l0 l0Var = new l0(c0850o.i, new C(c0850o.f11123p, inetSocketAddressD, v0Var, i0Var.f11076d), this, this.f10606t, c0854t, this.f10588a);
        f(l0Var);
        t5.c.c(v0Var2);
        if (c0854t2.d()) {
            if (b6.f9966b) {
                this.f10589b.g(c0854t2, false);
            } else if (c0850o.f11124q.length == 0) {
                this.f10591d.incrementAndGet();
                l0Var.f10972d0.add(new c(this));
            }
        }
        l0Var.r(i0Var);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084 A[Catch: RejectedExecutionException -> 0x0092, TRY_LEAVE, TryCatch #1 {RejectedExecutionException -> 0x0092, blocks: (B:26:0x0080, B:28:0x0084), top: B:44:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0095 A[Catch: RejectedExecutionException -> 0x008f, TryCatch #0 {RejectedExecutionException -> 0x008f, blocks: (B:30:0x0088, B:36:0x0095, B:37:0x00a9), top: B:43:0x0082 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x0095, please report this as an issue */
    public final void n(k5.a aVar) throws Exception {
        C0854t c0854t;
        Exception illegalArgumentException;
        long jNanoTime;
        AtomicInteger atomicInteger;
        q qVar;
        byte[] bArr = aVar.f9949a;
        Exception illegalStateException = null;
        if (this.f10607u.get()) {
            if (bArr.length > 16384) {
                illegalArgumentException = new IllegalArgumentException("Message data must not exceed 16384 bytes");
            } else {
                boolean z5 = this.f10592e;
                boolean z6 = !z5;
                if (!z5) {
                    String str = (String) ((Map) aVar.f9950b.f395k).get("*DTLS_HANDSHAKE_MODE");
                    if (str == null) {
                        str = this.f10593f;
                    }
                    z6 = !str.equals("none");
                }
                C0854t c0854tC = c(aVar.a(), null, z6);
                if (c0854tC == null) {
                    if (!z6) {
                        if (z5) {
                            aVar.b(new EndpointUnconnectedException("server only, connection missing!"));
                            return;
                        } else {
                            aVar.b(new EndpointUnconnectedException("connection missing!"));
                            return;
                        }
                    }
                    illegalStateException = new IllegalStateException("connection store is exhausted!");
                }
                c0854t = c0854tC;
            }
            if (illegalStateException == null) {
                aVar.b(illegalStateException);
                throw illegalStateException;
            }
            jNanoTime = System.nanoTime();
            atomicInteger = this.f10596j;
            if (atomicInteger.decrementAndGet() >= 0) {
                atomicInteger.incrementAndGet();
                f10587z.warn("Outbound message overflow! Dropping outbound message to peer [{}]", aVar.a());
                aVar.b(new IllegalStateException("Outbound message overflow!"));
                return;
            }
            try {
                qVar = c0854t.f11147f;
                try {
                    if (qVar != null) {
                        qVar.execute(new d(this, jNanoTime, aVar, c0854t));
                        return;
                    } else {
                        throw new NullPointerException("missing executor for connection! " + c0854t.f11148g);
                    }
                } catch (RejectedExecutionException e6) {
                    e = e6;
                }
            } catch (RejectedExecutionException e7) {
                e = e7;
            }
        } else {
            illegalArgumentException = new IllegalStateException("connector must be started before sending messages is possible");
        }
        c0854t = null;
        illegalStateException = illegalArgumentException;
        if (illegalStateException == null) {
            aVar.b(illegalStateException);
            throw illegalStateException;
        }
        jNanoTime = System.nanoTime();
        atomicInteger = this.f10596j;
        if (atomicInteger.decrementAndGet() >= 0) {
            atomicInteger.incrementAndGet();
            f10587z.warn("Outbound message overflow! Dropping outbound message to peer [{}]", aVar.a());
            aVar.b(new IllegalStateException("Outbound message overflow!"));
            return;
        }
        qVar = c0854t.f11147f;
        if (qVar != null) {
            qVar.execute(new d(this, jNanoTime, aVar, c0854t));
            return;
        } else {
            throw new NullPointerException("missing executor for connection! " + c0854t.f11148g);
        }
        f10586y.debug("Execution rejected while sending application record [peer: {}]", aVar.a(), e);
        aVar.b(new InterruptedIOException("Connector is not running."));
    }

    public final void o(C0838c c0838c, C c6) {
        C c7;
        if (c6 == null) {
            throw new IllegalArgumentException("Session must not be NULL");
        }
        try {
            try {
                boolean z5 = c6.f10906u > 0;
                f10586y.trace("send ALERT {} for peer {}.", c0838c, c6.f10894h);
                EnumC0857w enumC0857w = EnumC0857w.ALERT;
                int i = c6.f10906u;
                c7 = c6;
                try {
                    s(new i0(enumC0857w, i, c6.c(i), c0838c, c7, z5));
                } catch (GeneralSecurityException e6) {
                    e = e6;
                    f10587z.warn("Cannot create ALERT message for peer [{}]", c7.f10894h, e);
                }
            } catch (GeneralSecurityException e7) {
                e = e7;
                c7 = c6;
            }
        } catch (IOException unused) {
        }
    }

    public final void p(C0850o c0850o, i0 i0Var, byte[] bArr) {
        f10586y.trace("Verifying client IP address [{}] using HELLO_VERIFY_REQUEST", i0Var.d());
        if (bArr == null) {
            bArr = this.f10603q.a(c0850o);
        }
        c0 c0Var = c0.f11035j;
        V v6 = new V(c0Var, bArr, i0Var.d());
        v6.v(c0850o.i);
        EnumC0857w enumC0857w = EnumC0857w.HANDSHAKE;
        InetSocketAddress inetSocketAddressD = i0Var.d();
        i0 i0Var2 = new i0(c0Var, 0, i0Var.f11076d, 0L, inetSocketAddressD, false);
        if (inetSocketAddressD == null) {
            throw new NullPointerException("Peer address must not be null");
        }
        i0Var2.f(enumC0857w);
        i0Var2.f11079g = v6;
        byte[] bArrD = v6.d();
        i0Var2.f11080h = bArrD;
        if (bArrD == null) {
            throw new IllegalArgumentException("Fragment missing encoded bytes!");
        }
        try {
            s(i0Var2);
        } catch (IOException unused) {
        }
    }

    public final void q(k5.a aVar, C0854t c0854t, C c6) {
        try {
            f10586y.trace("send {}-{} using {}-{}", c0854t.f11149h, c0854t.f11148g, c6.i, c6.f10894h);
            c6.a();
            W2.g gVar = aVar.f9951c;
            EnumC0857w enumC0857w = EnumC0857w.APPLICATION_DATA;
            int i = c6.f10906u;
            s(new i0(enumC0857w, i, c6.c(i), (B) new C0839d(aVar.f9949a, aVar.a()), c6, true));
            c0854t.f11146e = System.nanoTime();
        } catch (IOException e6) {
            aVar.b(e6);
        } catch (GeneralSecurityException e7) {
            f10587z.warn("Cannot send APPLICATION record to peer [{}]", aVar.a(), e7);
            aVar.b(e7);
        }
    }

    public final void r(DatagramPacket datagramPacket) {
        DatagramSocket datagramSocket = this.f10605s;
        if (datagramSocket != null && !datagramSocket.isClosed()) {
            try {
                datagramSocket.send(datagramPacket);
                return;
            } catch (PortUnreachableException unused) {
                if (!datagramSocket.isClosed()) {
                    f10586y.warn("Could not send record, destination {} unreachable!", s.d((InetSocketAddress) datagramPacket.getSocketAddress()));
                }
            } catch (IOException e6) {
                if (!datagramSocket.isClosed()) {
                    f10586y.warn("Could not send record", (Throwable) e6);
                    throw e6;
                }
            }
        }
        InetSocketAddress inetSocketAddress = this.f10599m;
        if (inetSocketAddress == null) {
            inetSocketAddress = this.f10588a.f10679a;
        }
        f10587z.debug("Socket [{}] is closed, discarding packet ...", inetSocketAddress);
        throw new IOException("Socket closed.");
    }

    public final void s(i0 i0Var) {
        byte[] bArrG = i0Var.g();
        r(new DatagramPacket(bArrG, bArrG.length, i0Var.d()));
    }

    public final void t(InetSocketAddress inetSocketAddress) throws SocketException {
        if (this.f10607u.get()) {
            return;
        }
        DatagramSocket datagramSocket = new DatagramSocket((SocketAddress) null);
        this.f10588a.getClass();
        this.f10605s = datagramSocket;
        this.f10596j.set(this.f10588a.f10699v.intValue());
        if (inetSocketAddress.getPort() != 0 && this.f10588a.f10681c.booleanValue()) {
            Logger logger = f10586y;
            logger.info("Enable address reuse for socket!");
            datagramSocket.setReuseAddress(true);
            if (!datagramSocket.getReuseAddress()) {
                logger.warn("Enable address reuse for socket failed!");
            }
        }
        this.f10588a.getClass();
        try {
            this.f10588a.getClass();
        } catch (IllegalArgumentException e6) {
            f10586y.error("failed to apply {}", (Object) null, e6);
        }
        int receiveBufferSize = datagramSocket.getReceiveBufferSize();
        int sendBufferSize = datagramSocket.getSendBufferSize();
        datagramSocket.bind(inetSocketAddress);
        if (this.f10599m != null && (!datagramSocket.getLocalAddress().equals(this.f10599m.getAddress()) || datagramSocket.getLocalPort() != this.f10599m.getPort())) {
            X x6 = this.f10589b;
            if (x6 != null) {
                synchronized (x6) {
                    o oVar = x6.f11007a;
                    m<C0854t> mVar = oVar.f10466a;
                    if (mVar == null) {
                        mVar = new m(0, oVar);
                        oVar.f10466a = mVar;
                    }
                    for (C0854t c0854t : mVar) {
                        if (c0854t.f11148g != null && !c0854t.f11150j) {
                            c0854t.f11150j = true;
                            X.f11006f.debug("{}connection: mark for resumption {}!", x6.f11011e, c0854t);
                        }
                    }
                }
            } else {
                synchronized (x6) {
                    try {
                        o oVar2 = x6.f11007a;
                        m mVar2 = oVar2.f10466a;
                        if (mVar2 == null) {
                            mVar2 = new m(0, oVar2);
                            oVar2.f10466a = mVar2;
                        }
                        Iterator it = mVar2.iterator();
                        while (it.hasNext()) {
                            q qVar = ((C0854t) it.next()).f11147f;
                            if (qVar != null) {
                                qVar.shutdownNow();
                            }
                        }
                        o oVar3 = x6.f11007a;
                        oVar3.f10467b.clear();
                        n nVar = new n();
                        oVar3.f10469d = nVar;
                        nVar.f10465e = nVar;
                        nVar.f10464d = nVar;
                        x6.f11009c.clear();
                        x6.f11008b.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        this.f10588a.getClass();
        this.f10588a.getClass();
        InetAddress address = inetSocketAddress.getAddress();
        if (address.isAnyLocalAddress()) {
            p.a();
            this.f10600n = p.f10476c;
            p.a();
            this.f10601o = p.f10477d;
            f10586y.info("multiple network interfaces, using smallest MTU [IPv4 {}, IPv6 {}]", Integer.valueOf(this.f10600n), Integer.valueOf(this.f10601o));
        } else {
            NetworkInterface byInetAddress = NetworkInterface.getByInetAddress(address);
            boolean z5 = address instanceof Inet6Address;
            if (byInetAddress == null || byInetAddress.getMTU() <= 0) {
                if (z5) {
                    p.a();
                    int i = p.f10477d;
                    this.f10601o = i;
                    f10586y.info("Cannot determine MTU of network interface, using minimum MTU [{}] of IPv6 instead", Integer.valueOf(i));
                } else {
                    p.a();
                    int i3 = p.f10476c;
                    this.f10600n = i3;
                    f10586y.info("Cannot determine MTU of network interface, using minimum MTU [{}] of IPv4 instead", Integer.valueOf(i3));
                }
            } else if (z5) {
                this.f10601o = byInetAddress.getMTU();
            } else {
                this.f10600n = byInetAddress.getMTU();
            }
        }
        if (this.f10602p > this.f10588a.f10686h.intValue()) {
            if (this.f10600n > this.f10588a.f10686h.intValue()) {
                Integer num = this.f10588a.f10686h;
                this.f10600n = num.intValue();
                f10586y.info("Limit MTU IPv4[{}]", num);
            }
            if (this.f10601o > this.f10588a.f10686h.intValue()) {
                Integer num2 = this.f10588a.f10686h;
                this.f10601o = num2.intValue();
                f10586y.info("Limit MTU IPv6[{}]", num2);
            }
        } else {
            int i6 = this.f10600n;
            int i7 = this.f10602p;
            if (i6 > i7) {
                this.f10600n = i7;
                f10586y.info("Buffersize MTU IPv4[{}]", Integer.valueOf(i7));
            }
            int i8 = this.f10601o;
            int i9 = this.f10602p;
            if (i8 > i9) {
                this.f10601o = i9;
                f10586y.info("Buffersize MTU IPv6[{}]", Integer.valueOf(i9));
            }
        }
        this.f10599m = new InetSocketAddress(datagramSocket.getLocalAddress(), datagramSocket.getLocalPort());
        ExecutorService executorService = this.f10609w;
        if (executorService instanceof ScheduledExecutorService) {
            this.f10606t = (ScheduledExecutorService) executorService;
        } else {
            m5.f fVar = new m5.f("DTLS-Timer-" + this.f10599m + "#", m5.f.f10445l);
            k.f10455a.trace("create scheduled single thread pool");
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(fVar);
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.execute(k.f10456b);
            this.f10606t = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        }
        if (this.f10609w == null) {
            int iIntValue = this.f10588a.f10667A.intValue();
            if (iIntValue > 1) {
                int i10 = iIntValue - 1;
                m5.f fVar2 = new m5.f("DTLS-Worker-" + this.f10599m + "#", m5.f.f10445l);
                k.f10455a.trace("create thread pool of {} threads", Integer.valueOf(i10));
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i10, fVar2);
                executorServiceNewFixedThreadPool.execute(k.f10456b);
                this.f10609w = executorServiceNewFixedThreadPool;
            } else {
                this.f10609w = this.f10606t;
            }
            this.f10610x = true;
        }
        this.f10607u.set(true);
        int iIntValue2 = this.f10588a.f10668B.intValue();
        for (int i11 = 0; i11 < iIntValue2; i11++) {
            StringBuilder sbV = p012c.k.v(i11, "DTLS-Receiver-", "-");
            sbV.append(this.f10599m);
            f fVar3 = new f(this, sbV.toString());
            fVar3.setDaemon(true);
            fVar3.start();
            this.f10597k.add(fVar3);
        }
        f10586y.info("DTLSConnector listening on {}, recv buf = {}, send buf = {}, recv packet size = {}, MTU = {}", this.f10599m, Integer.valueOf(receiveBufferSize), Integer.valueOf(sendBufferSize), Integer.valueOf(this.f10602p), "IPv4 " + this.f10600n + " / IPv6 " + this.f10601o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DTLS-");
        DatagramSocket datagramSocket = this.f10605s;
        int localPort = datagramSocket == null ? -1 : datagramSocket.getLocalPort();
        sb.append(s.d(localPort < 0 ? this.f10588a.f10679a : new InetSocketAddress(datagramSocket.getLocalAddress(), localPort)));
        return sb.toString();
    }

    public final void u(C0850o c0850o, i0 i0Var, C0854t c0854t) throws HandshakeException {
        n0 n0Var = new n0(c0850o.i, new C(i0Var.d(), i0Var.f11076d, System.currentTimeMillis()), this, this.f10606t, c0854t, this.f10588a);
        f(n0Var);
        n0Var.r(i0Var);
    }

    public final void v() {
        int i;
        ExecutorService executorService;
        ExecutorService executorService2;
        ScheduledExecutorService scheduledExecutorService;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                i = 0;
                executorService = null;
                if (this.f10607u.compareAndSet(true, false)) {
                    ScheduledFuture scheduledFuture = this.f10598l;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f10598l = null;
                    }
                    f10586y.info("Stopping DTLS connector on [{}]", this.f10599m);
                    Iterator it = this.f10597k.iterator();
                    while (it.hasNext()) {
                        ((Thread) it.next()).interrupt();
                    }
                    if (this.f10605s != null) {
                        this.f10605s.close();
                        this.f10605s = null;
                    }
                    this.f10600n = 576;
                    this.f10601o = 1280;
                    X x6 = this.f10589b;
                    synchronized (x6) {
                        o oVar = x6.f11007a;
                        m mVar = oVar.f10466a;
                        if (mVar == null) {
                            mVar = new m(0, oVar);
                            oVar.f10466a = mVar;
                        }
                        Iterator it2 = mVar.iterator();
                        while (it2.hasNext()) {
                            q qVar = ((C0854t) it2.next()).f11147f;
                            if (qVar != null) {
                                qVar.s(arrayList);
                            }
                        }
                    }
                    ExecutorService executorService3 = this.f10609w;
                    ScheduledExecutorService scheduledExecutorService2 = this.f10606t;
                    if (executorService3 != scheduledExecutorService2) {
                        arrayList.addAll(scheduledExecutorService2.shutdownNow());
                        scheduledExecutorService = this.f10606t;
                        this.f10606t = null;
                    } else {
                        scheduledExecutorService = null;
                    }
                    if (this.f10610x) {
                        arrayList.addAll(this.f10609w.shutdownNow());
                        ExecutorService executorService4 = this.f10609w;
                        this.f10609w = null;
                        this.f10610x = false;
                        executorService = executorService4;
                    }
                    for (Thread thread : this.f10597k) {
                        thread.interrupt();
                        try {
                            thread.join(500L);
                        } catch (InterruptedException unused) {
                        }
                    }
                    this.f10597k.clear();
                    ExecutorService executorService5 = executorService;
                    executorService = scheduledExecutorService;
                    executorService2 = executorService5;
                } else {
                    executorService2 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executorService != null) {
            try {
                if (!executorService.awaitTermination(500L, TimeUnit.MILLISECONDS)) {
                    f10586y.warn("Shutdown DTLS connector on [{}] timer not terminated in time!", this.f10599m);
                }
            } catch (InterruptedException unused2) {
            }
        }
        if (executorService2 != null) {
            try {
                if (!executorService2.awaitTermination(500L, TimeUnit.MILLISECONDS)) {
                    f10586y.warn("Shutdown DTLS connector on [{}] executor not terminated in time!", this.f10599m);
                }
            } catch (InterruptedException unused3) {
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((Runnable) obj).run();
            } catch (Exception e6) {
                f10586y.warn("Shutdown DTLS connector:", (Throwable) e6);
            }
        }
    }

    public final void w(C0854t c0854t, EnumC0837b enumC0837b, EnumC0835a enumC0835a) {
        if (c0854t.d()) {
            x(c0854t, new C0838c(enumC0837b, enumC0835a, c0854t.f11148g), c0854t.i);
        } else if (c0854t.f11142a.get() != null) {
            x(c0854t, new C0838c(enumC0837b, enumC0835a, c0854t.f11148g), c0854t.b().f10995v);
        }
    }

    public final void x(C0854t c0854t, C0838c c0838c, C c6) {
        if (c6 == null) {
            throw new IllegalArgumentException("Session must not be null, if alert message is to be sent");
        }
        f10586y.trace("Terminating connection with peer [{}], reason [{}]", c0854t.f11148g, c0838c.f11034j);
        o(c0838c, c6);
        if (c0838c.i == EnumC0837b.WARNING && c0838c.f11034j == EnumC0835a.CLOSE_NOTIFY) {
            c0854t.f11150j = true;
        } else {
            this.f10589b.g(c0854t, true);
        }
    }
}
