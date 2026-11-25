package p5;

import B.AbstractC0013g0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.net.DatagramPacket;
import java.net.InetSocketAddress;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.scandium.dtls.HandshakeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Logger f10868r = LoggerFactory.getLogger((Class<?>) A.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f10871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10874f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10876h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10877j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10878k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10879l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Z f10880m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10881n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f10882o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f10883p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ScheduledFuture f10884q;

    public A(C c6, int i) {
        this.f10881n = false;
        if (c6 == null) {
            throw new NullPointerException("Session must not be null");
        }
        if (c6.f10894h == null) {
            throw new NullPointerException("Peer address must not be null");
        }
        this.f10871c = c6;
        this.f10869a = new ArrayList();
        this.f10870b = new ArrayList();
        this.f10881n = true;
        this.f10872d = i;
    }

    public final void a() {
        if (this.f10880m != null) {
            ArrayList arrayList = this.f10869a;
            EnumC0857w enumC0857w = EnumC0857w.HANDSHAKE;
            int i = this.f10878k;
            arrayList.add(new i0(enumC0857w, i, this.f10871c.c(i), this.f10880m, this.f10871c, this.f10879l));
            int i3 = this.f10880m.f11013n;
            Logger logger = f10868r;
            if (i3 > 1) {
                logger.info("Add {} multi handshake message, epoch {} of {} bytes for [{}]", Integer.valueOf(i3), Integer.valueOf(this.f10878k), Integer.valueOf(this.f10880m.t()), (InetSocketAddress) this.f10880m.f603h);
            } else {
                logger.debug("Add {} multi handshake message, epoch {} of {} bytes for [{}]", Integer.valueOf(i3), Integer.valueOf(this.f10878k), Integer.valueOf(this.f10880m.t()), (InetSocketAddress) this.f10880m.f603h);
            }
            this.f10880m = null;
            this.f10878k = 0;
            this.f10879l = false;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final ArrayList b(int i, int i3, Boolean bool, Boolean bool2, boolean z5) {
        int iMin = i;
        m5.j jVar = new m5.j(iMin);
        ArrayList arrayList = new ArrayList();
        boolean zEquals = Boolean.TRUE.equals(bool);
        boolean zEquals2 = Boolean.FALSE.equals(bool2);
        boolean z6 = !zEquals2;
        if (z5) {
            iMin = Math.min(HueLog.LogComponent.APPCORE, iMin);
        }
        Object[] objArr = {Integer.valueOf(this.f10872d), Integer.valueOf(iMin), Integer.valueOf(i3), Boolean.valueOf(zEquals), Boolean.valueOf(z6)};
        Logger logger = f10868r;
        logger.info("Prepare flight {}, using max. datagram size {}, max. fragment size {} [mhm={}, mr={}]", objArr);
        C c6 = this.f10871c;
        InetSocketAddress inetSocketAddress = c6.f10894h;
        ArrayList arrayList2 = this.f10869a;
        try {
            int i6 = 0;
            if (this.f10875g == iMin && this.f10876h == i3 && this.f10877j == zEquals) {
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    i0 i0Var = (i0) arrayList2.get(i7);
                    int i8 = i0Var.f11075c;
                    arrayList2.set(i7, new i0(i0Var.f11073a, i8, c6.c(i8), i0Var.c(), this.f10871c, i0Var.h()));
                }
            } else {
                this.i = iMin;
                this.f10875g = iMin;
                this.f10876h = i3;
                this.f10877j = zEquals;
                arrayList2.clear();
                ArrayList arrayList3 = this.f10870b;
                int size = arrayList3.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList3.get(i9);
                    i9++;
                    e((C0860z) obj);
                }
                a();
            }
            logger.info("Effective max. datagram size {}", Integer.valueOf(this.i));
            int i10 = 0;
            while (i10 < arrayList2.size()) {
                i0 i0Var2 = (i0) arrayList2.get(i10);
                byte[] bArrG = i0Var2.g();
                if (bArrG.length > this.i) {
                    logger.error("{} record of {} bytes for peer [{}] exceeds max. datagram size [{}], discarding...", i0Var2.f11073a, Integer.valueOf(bArrG.length), inetSocketAddress, Integer.valueOf(this.i));
                } else {
                    logger.trace("Sending record of {} bytes to peer [{}]:\n{}", Integer.valueOf(bArrG.length), inetSocketAddress, i0Var2);
                    if (!zEquals2 && i0Var2.f11073a == EnumC0857w.CHANGE_CIPHER_SPEC && (i10 = i10 + 1) < arrayList2.size()) {
                        byte[] bArrG2 = ((i0) arrayList2.get(i10)).g();
                        int length = bArrG.length;
                        int length2 = bArrG2.length;
                        byte[] bArr = new byte[length + length2];
                        System.arraycopy(bArrG, i6, bArr, i6, length);
                        System.arraycopy(bArrG2, i6, bArr, length, length2);
                        bArrG = bArr;
                    }
                    if (jVar.f10452a.size() > ((zEquals2 || (z5 && bool2 == null)) ? i6 : this.i - bArrG.length)) {
                        byte[] bArrA = jVar.a();
                        arrayList.add(new DatagramPacket(bArrA, bArrA.length, inetSocketAddress.getAddress(), inetSocketAddress.getPort()));
                        logger.debug("Sending datagram of {} bytes to peer [{}]", Integer.valueOf(bArrA.length), inetSocketAddress);
                    }
                    jVar.c(bArrG);
                }
                i10++;
                i6 = 0;
            }
            byte[] bArrA2 = jVar.a();
            arrayList.add(new DatagramPacket(bArrA2, bArrA2.length, inetSocketAddress.getAddress(), inetSocketAddress.getPort()));
            logger.debug("Sending datagram of {} bytes to peer [{}]", Integer.valueOf(bArrA2.length), inetSocketAddress);
            return arrayList;
        } catch (GeneralSecurityException e6) {
            arrayList2.clear();
            throw new HandshakeException("Cannot create record", new C0838c(EnumC0837b.FATAL, EnumC0835a.INTERNAL_ERROR, c6.f10894h), e6);
        }
    }

    public final void c(ScheduledExecutorService scheduledExecutorService, O1.n nVar) {
        if (this.f10883p) {
            return;
        }
        if (!this.f10881n) {
            f10868r.trace("handshake flight to peer {}, no retransmission!", this.f10871c.f10894h);
            return;
        }
        ScheduledFuture scheduledFuture = this.f10884q;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isDone()) {
                this.f10884q.cancel(true);
            }
            this.f10884q = null;
        }
        try {
            this.f10884q = scheduledExecutorService.schedule(nVar, this.f10874f, TimeUnit.MILLISECONDS);
            f10868r.trace("handshake flight to peer {}, retransmission {} ms.", this.f10871c.f10894h, Integer.valueOf(this.f10874f));
        } catch (RejectedExecutionException unused) {
            f10868r.trace("handshake flight stopped by shutdown.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033 A[PHI: r2
  0x0033: PHI (r2v3 int) = (r2v2 int), (r2v14 int), (r2v14 int) binds: [B:3:0x0019, B:7:0x0024, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    public final void d(C0860z c0860z) {
        boolean z5;
        O o6 = (O) c0860z.f11178b;
        int iT = o6.t();
        int length = this.f10875g - 25;
        int i = this.f10876h;
        int i3 = 0;
        C c6 = this.f10871c;
        int i6 = c0860z.f11177a;
        if (i6 <= 0) {
            z5 = false;
        } else {
            q5.i iVar = c6.f10898m;
            if (iVar == null) {
                throw new IllegalStateException("Missing cipher suite.");
            }
            length -= iVar.f11294m;
            C0855u c0855u = c6.f10902q;
            if (c0855u == null || c0855u.b()) {
                z5 = false;
            } else {
                length -= c0855u.f10440a.length + 1;
                z5 = true;
            }
        }
        if (i > length) {
            i = length;
        } else {
            this.i = (this.f10875g - length) + i;
        }
        EnumC0857w enumC0857w = EnumC0857w.HANDSHAKE;
        ArrayList arrayList = this.f10869a;
        Logger logger = f10868r;
        InetSocketAddress inetSocketAddress = (InetSocketAddress) o6.f603h;
        if (iT > i) {
            a();
            logger.debug("Splitting up {} message of {} bytes for [{}] into multiple fragments of max. {} bytes", o6.u(), Integer.valueOf(iT), inetSocketAddress, Integer.valueOf(i));
            byte[] bArrP = o6.p();
            if (bArrP.length != iT) {
                throw new IllegalStateException(AbstractC0013g0.l(p012c.k.v(iT, "message length ", " differs from message "), bArrP.length, "!"));
            }
            Logger logger2 = logger;
            int i7 = o6.i;
            int i8 = 0;
            while (i8 < iT) {
                int i9 = i8 + i > iT ? iT - i8 : i;
                byte[] bArr = new byte[i9];
                System.arraycopy(bArrP, i8, bArr, i3, i9);
                Logger logger3 = logger2;
                L l6 = new L(o6.u(), iT, i7, i8, bArr, c6.f10894h);
                logger3.debug("fragment for offset {}, {} bytes", Integer.valueOf(i8), Integer.valueOf(l6.size()));
                int i10 = c0860z.f11177a;
                arrayList.add(new i0(enumC0857w, i10, c6.c(i10), (B) l6, this.f10871c, false));
                i7 = i7;
                i8 += i9;
                logger2 = logger3;
                i3 = 0;
            }
            return;
        }
        if (this.f10877j) {
            Z z6 = this.f10880m;
            if (z6 != null) {
                if (this.f10878k == i6 && this.f10879l == z5) {
                    if (o6.size() + z6.t() < i) {
                        Z z7 = this.f10880m;
                        z7.f11015p.f10934l = o6;
                        z7.f11015p = o6;
                        z7.f11014o = o6.size() + z7.f11014o;
                        z7.f11013n++;
                        logger.debug("Add multi-handshake-message {} message of {} bytes for [{}]", o6.u(), Integer.valueOf(iT), inetSocketAddress);
                        return;
                    }
                }
                a();
            }
            if (this.f10880m == null && iT + 12 < i) {
                Z z8 = new Z(c6.f10894h);
                this.f10880m = z8;
                z8.f10934l = o6;
                z8.f11015p = o6;
                z8.f11014o = o6.size() + z8.f11014o;
                z8.f11013n++;
                this.f10878k = i6;
                this.f10879l = z5;
                logger.debug("Start multi-handshake-message with {} message of {} bytes for [{}]", o6.u(), Integer.valueOf(iT), inetSocketAddress);
                return;
            }
        }
        int i11 = c0860z.f11177a;
        arrayList.add(new i0(enumC0857w, i11, c6.c(i11), o6, this.f10871c, z5));
        logger.debug("Add {} message of {} bytes for [{}]", o6.u(), Integer.valueOf(iT), inetSocketAddress);
    }

    public final void e(C0860z c0860z) throws HandshakeException {
        C c6 = this.f10871c;
        try {
            B b6 = c0860z.f11178b;
            int iOrdinal = b6.g().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 2) {
                    d(c0860z);
                    return;
                }
                throw new HandshakeException("Cannot create " + b6.g() + " record for flight", new C0838c(EnumC0837b.FATAL, EnumC0835a.INTERNAL_ERROR, c6.f10894h));
            }
            a();
            ArrayList arrayList = this.f10869a;
            EnumC0857w enumC0857wG = b6.g();
            int i = c0860z.f11177a;
            arrayList.add(new i0(enumC0857wG, i, c6.c(i), b6, this.f10871c, false));
            f10868r.debug("Add CCS message of {} bytes for [{}]", Integer.valueOf(b6.size()), b6.c());
        } catch (GeneralSecurityException e6) {
            throw new HandshakeException("Cannot create record", new C0838c(EnumC0837b.FATAL, EnumC0835a.INTERNAL_ERROR, c6.f10894h), e6);
        }
    }
}
