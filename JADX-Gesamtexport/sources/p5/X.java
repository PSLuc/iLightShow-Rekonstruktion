package p5;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f11006f = LoggerFactory.getLogger((Class<?>) X.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5.o f11007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f11008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f11009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public W4.i f11010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11011e = "";

    public X(int i, long j4) {
        m5.o oVar = new m5.o(i, j4);
        this.f11007a = oVar;
        oVar.f10471f = false;
        oVar.f10472g = false;
        this.f11009c = new ConcurrentHashMap();
        this.f11008b = new ConcurrentHashMap();
        oVar.f10473h.add(new W(this));
        f11006f.info("Created new InMemoryConnectionStore [capacity: {}, connection expiration threshold: {}s]", Integer.valueOf(i), Long.valueOf(j4));
    }

    public final void a(C0854t c0854t) {
        InetSocketAddress inetSocketAddress = c0854t.f11148g;
        Logger logger = f11006f;
        if (inetSocketAddress == null) {
            logger.debug("{}connection: {} - missing address!", this.f11011e, c0854t.f11149h);
            return;
        }
        C0854t c0854t2 = (C0854t) this.f11008b.put(inetSocketAddress, c0854t);
        if (c0854t2 == null || c0854t2 == c0854t) {
            logger.debug("{}connection: {} - {} added!", this.f11011e, c0854t.f11149h, inetSocketAddress);
            return;
        }
        O1.n nVar = new O1.n(c0854t2, 22, inetSocketAddress);
        logger.debug("{}connection: {} - {} added! {} removed from address.", this.f11011e, c0854t.f11149h, inetSocketAddress, c0854t2.f11149h);
        if (c0854t2.e()) {
            c0854t2.f11147f.execute(nVar);
        } else {
            nVar.run();
        }
    }

    public final synchronized C0854t b(t0 t0Var) {
        C0854t c0854t;
        try {
            c0854t = (C0854t) this.f11009c.get(t0Var);
            if (c0854t != null) {
                C c6 = c0854t.i;
                if (c6 == null) {
                    f11006f.warn("{}connection {} lost session {}!", this.f11011e, c0854t.f11149h, t0Var);
                } else if (!c6.i.equals(t0Var)) {
                    f11006f.warn("{}connection {} changed session {}!={}!", this.f11011e, c0854t.f11149h, t0Var, c6.i);
                }
                m5.o oVar = this.f11007a;
                C0855u c0855u = c0854t.f11149h;
                if (c0855u == null) {
                    oVar.getClass();
                } else {
                    m5.n nVar = (m5.n) oVar.f10467b.get(c0855u);
                    if (nVar != null) {
                        m5.n nVar2 = oVar.f10469d;
                        nVar.a();
                        nVar.f10463c = System.nanoTime();
                        nVar.f10464d = nVar2;
                        m5.n nVar3 = nVar2.f10465e;
                        nVar.f10465e = nVar3;
                        nVar3.f10464d = nVar;
                        nVar.f10464d.f10465e = nVar;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0854t;
    }

    public final synchronized C0854t c(InetSocketAddress inetSocketAddress) {
        C0854t c0854t;
        try {
            c0854t = (C0854t) this.f11008b.get(inetSocketAddress);
            if (c0854t == null) {
                f11006f.debug("{}connection: missing connection for {}!", this.f11011e, inetSocketAddress);
            } else {
                InetSocketAddress inetSocketAddress2 = c0854t.f11148g;
                if (inetSocketAddress2 == null) {
                    f11006f.warn("{}connection {} lost ip-address {}!", this.f11011e, c0854t.f11149h, inetSocketAddress);
                } else if (!inetSocketAddress2.equals(inetSocketAddress)) {
                    f11006f.warn("{}connection {} changed ip-address {}!={}!", this.f11011e, c0854t.f11149h, inetSocketAddress, inetSocketAddress2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0854t;
    }

    public final synchronized C0854t d(C0855u c0855u) {
        C0854t c0854t;
        try {
            c0854t = (C0854t) this.f11007a.c(c0855u);
            if (c0854t == null) {
                f11006f.debug("{}connection: missing connection for {}!", this.f11011e, c0855u);
            } else {
                C0855u c0855u2 = c0854t.f11149h;
                if (c0855u2 == null) {
                    f11006f.warn("{}connection lost cid {}!", this.f11011e, c0855u);
                } else if (!c0855u2.equals(c0855u)) {
                    f11006f.warn("{}connection changed cid {}!={}!", this.f11011e, c0855u2, c0855u);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0854t;
    }

    public final synchronized boolean e(C0854t c0854t) {
        C0855u c0855u;
        try {
            if (!c0854t.e()) {
                throw new IllegalStateException("Connection is not executing!");
            }
            C0855u c0855u2 = c0854t.f11149h;
            if (c0855u2 == null) {
                if (this.f11010d == null) {
                    throw new IllegalStateException("Connection id generator must be attached before!");
                }
                int i = 0;
                while (true) {
                    c0855u = null;
                    if (i >= 10) {
                        break;
                    }
                    W4.i iVar = this.f11010d;
                    if (iVar.f5628a > 0) {
                        byte[] bArr = new byte[iVar.f5628a];
                        ((Random) q5.m.f11315c.get()).nextBytes(bArr);
                        c0855u = new C0855u(bArr, 255);
                    }
                    if (this.f11007a.c(c0855u) == null) {
                        break;
                    }
                    i++;
                }
                c0855u2 = c0855u;
                if (c0855u2 == null) {
                    throw new IllegalStateException("Connection ids exhausted!");
                }
                c0854t.f11149h = c0855u2;
            } else {
                if (c0855u2.b()) {
                    throw new IllegalStateException("Connection must have a none empty connection id!");
                }
                if (this.f11007a.c(c0855u2) != null) {
                    throw new IllegalStateException("Connection id already used! " + c0855u2);
                }
            }
            if (!this.f11007a.e(c0855u2, c0854t)) {
                f11006f.warn("{}connection store is full! {} max. entries.", this.f11011e, Integer.valueOf(this.f11007a.f10468c));
                return false;
            }
            Logger logger = f11006f;
            if (logger.isTraceEnabled()) {
                logger.trace("{}connection: add {} (size {})", this.f11011e, c0854t, Integer.valueOf(this.f11007a.f10467b.size()), new Throwable("connection added!"));
            } else {
                logger.debug("{}connection: add {} (size {})", this.f11011e, c0855u2, Integer.valueOf(this.f11007a.f10467b.size()));
            }
            a(c0854t);
            C c6 = c0854t.i;
            if (c6 != null) {
                f(c6, c0854t);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(C c6, C0854t c0854t) {
        C0854t c0854t2;
        try {
            t0 t0Var = c6.i;
            if (!t0Var.b() && (c0854t2 = (C0854t) this.f11009c.put(t0Var, c0854t)) != null && c0854t2 != c0854t) {
                O1.n nVar = new O1.n(21, (Object) this, (Object) c0854t2, false);
                if (c0854t2.e()) {
                    c0854t2.f11147f.execute(nVar);
                } else {
                    nVar.run();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0001, B:5:0x0008, B:16:0x0029, B:18:0x0037, B:25:0x00a1, B:27:0x00a5, B:28:0x00af, B:30:0x00b3, B:32:0x00bd, B:33:0x00be, B:21:0x0062, B:23:0x006a, B:24:0x0082, B:7:0x000d, B:9:0x0017, B:11:0x001b), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0037 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0001, B:5:0x0008, B:16:0x0029, B:18:0x0037, B:25:0x00a1, B:27:0x00a5, B:28:0x00af, B:30:0x00b3, B:32:0x00bd, B:33:0x00be, B:21:0x0062, B:23:0x006a, B:24:0x0082, B:7:0x000d, B:9:0x0017, B:11:0x001b), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0062 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0001, B:5:0x0008, B:16:0x0029, B:18:0x0037, B:25:0x00a1, B:27:0x00a5, B:28:0x00af, B:30:0x00b3, B:32:0x00bd, B:33:0x00be, B:21:0x0062, B:23:0x006a, B:24:0x0082, B:7:0x000d, B:9:0x0017, B:11:0x001b), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x006a A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0001, B:5:0x0008, B:16:0x0029, B:18:0x0037, B:25:0x00a1, B:27:0x00a5, B:28:0x00af, B:30:0x00b3, B:32:0x00bd, B:33:0x00be, B:21:0x0062, B:23:0x006a, B:24:0x0082, B:7:0x000d, B:9:0x0017, B:11:0x001b), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0082 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0001, B:5:0x0008, B:16:0x0029, B:18:0x0037, B:25:0x00a1, B:27:0x00a5, B:28:0x00af, B:30:0x00b3, B:32:0x00bd, B:33:0x00be, B:21:0x0062, B:23:0x006a, B:24:0x0082, B:7:0x000d, B:9:0x0017, B:11:0x001b), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a5 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0001, B:5:0x0008, B:16:0x0029, B:18:0x0037, B:25:0x00a1, B:27:0x00a5, B:28:0x00af, B:30:0x00b3, B:32:0x00bd, B:33:0x00be, B:21:0x0062, B:23:0x006a, B:24:0x0082, B:7:0x000d, B:9:0x0017, B:11:0x001b), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b3 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0001, B:5:0x0008, B:16:0x0029, B:18:0x0037, B:25:0x00a1, B:27:0x00a5, B:28:0x00af, B:30:0x00b3, B:32:0x00bd, B:33:0x00be, B:21:0x0062, B:23:0x006a, B:24:0x0082, B:7:0x000d, B:9:0x0017, B:11:0x001b), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0001, B:5:0x0008, B:16:0x0029, B:18:0x0037, B:25:0x00a1, B:27:0x00a5, B:28:0x00af, B:30:0x00b3, B:32:0x00bd, B:33:0x00be, B:21:0x0062, B:23:0x006a, B:24:0x0082, B:7:0x000d, B:9:0x0017, B:11:0x001b), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00be A[Catch: all -> 0x0060, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0001, B:5:0x0008, B:16:0x0029, B:18:0x0037, B:25:0x00a1, B:27:0x00a5, B:28:0x00af, B:30:0x00b3, B:32:0x00bd, B:33:0x00be, B:21:0x0062, B:23:0x006a, B:24:0x0082, B:7:0x000d, B:9:0x0017, B:11:0x001b), top: B:38:0x0001 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00be, please report this as an issue */
    public final synchronized boolean g(C0854t c0854t, boolean z5) {
        C0854t c0854t2;
        boolean z6;
        List listShutdownNow;
        Logger logger;
        ArrayList arrayList;
        C c6;
        InetSocketAddress inetSocketAddress;
        try {
            m5.o oVar = this.f11007a;
            C0855u c0855u = c0854t.f11149h;
            if (c0855u == null) {
                oVar.getClass();
            } else {
                ConcurrentHashMap concurrentHashMap = oVar.f10467b;
                m5.n nVar = (m5.n) concurrentHashMap.get(c0855u);
                if (nVar != null && nVar.f10462b == c0854t) {
                    concurrentHashMap.remove(c0855u);
                    nVar.a();
                    c0854t2 = c0854t;
                }
                if (c0854t2 == c0854t) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    listShutdownNow = c0854t.f11147f.shutdownNow();
                    logger = f11006f;
                    if (logger.isTraceEnabled()) {
                        logger.trace("{}connection: remove {} (size {}, left jobs: {})", this.f11011e, c0854t, Integer.valueOf(this.f11007a.f10467b.size()), Integer.valueOf(((ArrayList) listShutdownNow).size()), new Throwable("connection removed!"));
                    } else {
                        arrayList = (ArrayList) listShutdownNow;
                        if (arrayList.isEmpty()) {
                            logger.debug("{}connection: remove {} (size {})", this.f11011e, c0854t, Integer.valueOf(this.f11007a.f10467b.size()));
                        } else {
                            logger.debug("{}connection: remove {} (size {}, left jobs: {})", this.f11011e, c0854t, Integer.valueOf(this.f11007a.f10467b.size()), Integer.valueOf(arrayList.size()));
                        }
                    }
                    c6 = c0854t.i;
                    if (c6 != null) {
                        this.f11009c.remove(c6.i, c0854t);
                        t5.c.c(c6);
                    }
                    inetSocketAddress = c0854t.f11148g;
                    if (inetSocketAddress != null) {
                        this.f11008b.remove(inetSocketAddress, c0854t);
                        c0854t.g(null);
                    }
                    if (z5) {
                        synchronized (this) {
                        }
                    }
                }
            }
            c0854t2 = null;
            if (c0854t2 == c0854t) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                listShutdownNow = c0854t.f11147f.shutdownNow();
                logger = f11006f;
                if (logger.isTraceEnabled()) {
                    logger.trace("{}connection: remove {} (size {}, left jobs: {})", this.f11011e, c0854t, Integer.valueOf(this.f11007a.f10467b.size()), Integer.valueOf(((ArrayList) listShutdownNow).size()), new Throwable("connection removed!"));
                } else {
                    arrayList = (ArrayList) listShutdownNow;
                    if (arrayList.isEmpty()) {
                        logger.debug("{}connection: remove {} (size {})", this.f11011e, c0854t, Integer.valueOf(this.f11007a.f10467b.size()));
                    } else {
                        logger.debug("{}connection: remove {} (size {}, left jobs: {})", this.f11011e, c0854t, Integer.valueOf(this.f11007a.f10467b.size()), Integer.valueOf(arrayList.size()));
                    }
                }
                c6 = c0854t.i;
                if (c6 != null) {
                    this.f11009c.remove(c6.i, c0854t);
                    t5.c.c(c6);
                }
                inetSocketAddress = c0854t.f11148g;
                if (inetSocketAddress != null) {
                    this.f11008b.remove(inetSocketAddress, c0854t);
                    c0854t.g(null);
                }
                if (z5) {
                    synchronized (this) {
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return z6;
    }

    public final synchronized void h(C c6, C0854t c0854t) {
        t0 t0Var = c6.i;
        if (!t0Var.b()) {
            this.f11009c.remove(t0Var, c0854t);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:7:0x0006, B:9:0x000d, B:16:0x0039, B:19:0x0047, B:21:0x004d, B:23:0x0060, B:24:0x0069, B:27:0x0071, B:10:0x0011, B:13:0x001d), top: B:32:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:7:0x0006, B:9:0x000d, B:16:0x0039, B:19:0x0047, B:21:0x004d, B:23:0x0060, B:24:0x0069, B:27:0x0071, B:10:0x0011, B:13:0x001d), top: B:32:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x004d A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:7:0x0006, B:9:0x000d, B:16:0x0039, B:19:0x0047, B:21:0x004d, B:23:0x0060, B:24:0x0069, B:27:0x0071, B:10:0x0011, B:13:0x001d), top: B:32:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0060 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:7:0x0006, B:9:0x000d, B:16:0x0039, B:19:0x0047, B:21:0x004d, B:23:0x0060, B:24:0x0069, B:27:0x0071, B:10:0x0011, B:13:0x001d), top: B:32:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0071 A[Catch: all -> 0x0045, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0045, blocks: (B:7:0x0006, B:9:0x000d, B:16:0x0039, B:19:0x0047, B:21:0x004d, B:23:0x0060, B:24:0x0069, B:27:0x0071, B:10:0x0011, B:13:0x001d), top: B:32:0x0006 }] */
    public final synchronized boolean i(C0854t c0854t, InetSocketAddress inetSocketAddress) {
        boolean z5;
        InetSocketAddress inetSocketAddress2;
        if (c0854t == null) {
            return false;
        }
        try {
            m5.o oVar = this.f11007a;
            C0855u c0855u = c0854t.f11149h;
            if (c0855u != null) {
                m5.n nVar = (m5.n) oVar.f10467b.get(c0855u);
                if (nVar != null) {
                    m5.n nVar2 = oVar.f10469d;
                    nVar.a();
                    nVar.f10463c = System.nanoTime();
                    nVar.f10464d = nVar2;
                    m5.n nVar3 = nVar2.f10465e;
                    nVar.f10465e = nVar3;
                    nVar3.f10464d = nVar;
                    nVar.f10464d.f10465e = nVar;
                    z5 = true;
                }
                if (z5) {
                    f11006f.debug("{}connection: {} - {} update failed!", this.f11011e, c0854t.f11149h, inetSocketAddress);
                    return false;
                }
                if (inetSocketAddress == null) {
                    f11006f.debug("{}connection: {} updated usage!", this.f11011e, c0854t.f11149h);
                } else if (!c0854t.a(inetSocketAddress)) {
                    inetSocketAddress2 = c0854t.f11148g;
                    f11006f.debug("{}connection: {} updated, address changed from {} to {}!", this.f11011e, c0854t.f11149h, inetSocketAddress2, inetSocketAddress);
                    if (inetSocketAddress2 != null) {
                        this.f11008b.remove(inetSocketAddress2, c0854t);
                        c0854t.g(null);
                    }
                    c0854t.g(inetSocketAddress);
                    a(c0854t);
                }
                return true;
            }
            oVar.getClass();
            z5 = false;
            if (z5) {
                f11006f.debug("{}connection: {} - {} update failed!", this.f11011e, c0854t.f11149h, inetSocketAddress);
                return false;
            }
            if (inetSocketAddress == null) {
                f11006f.debug("{}connection: {} updated usage!", this.f11011e, c0854t.f11149h);
            } else if (!c0854t.a(inetSocketAddress)) {
                inetSocketAddress2 = c0854t.f11148g;
                f11006f.debug("{}connection: {} updated, address changed from {} to {}!", this.f11011e, c0854t.f11149h, inetSocketAddress2, inetSocketAddress);
                if (inetSocketAddress2 != null) {
                    this.f11008b.remove(inetSocketAddress2, c0854t);
                    c0854t.g(null);
                }
                c0854t.g(inetSocketAddress);
                a(c0854t);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
