package p5;

import B.AbstractC0013g0;
import java.net.InetSocketAddress;
import java.security.Principal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;
import okhttp3.internal.http2.Http2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Destroyable {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final Logger f10887K = LoggerFactory.getLogger((Class<?>) C.class);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public EnumC0843h f10888A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f10889B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public volatile long f10890C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public volatile long f10891D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public volatile long f10892E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f10893F;
    public String G;
    public t5.e H;
    public boolean I;
    public final String J;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InetSocketAddress f10894h;
    public t0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Principal f10895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f10896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public q5.i f10898m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x0 f10899n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EnumC0852q f10900o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t5.b f10901p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0855u f10902q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AbstractC0859y f10903r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AbstractC0859y f10904s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10905t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10906u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long[] f10907v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10908w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f10909x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10910y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public EnumC0843h f10911z;

    public C(InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, 0L, System.currentTimeMillis());
    }

    public final void a() {
        String strA = this.i.b() ? "TIME:" + Long.toString(this.f10893F) : this.i.a();
        InetSocketAddress inetSocketAddress = this.f10894h;
        String str = this.G;
        String[] strArr = {"DTLS_SESSION_ID", strA, "DTLS_CIPHER", this.f10898m.name(), "DTLS_EPOCH", Integer.toString(this.f10906u), "DTLS_HANDSHAKE_TIMESTAMP", this.J};
        if ((strArr.length & 1) != 0) {
            throw new IllegalArgumentException(AbstractC0013g0.l(new StringBuilder("number of attributes must be even, not "), strArr.length, "!"));
        }
        HashMap map = new HashMap();
        for (int i = 0; i < strArr.length; i += 2) {
            String str2 = strArr[i];
            int i3 = i + 1;
            String str3 = strArr[i3];
            if (str2 == null) {
                throw new NullPointerException((i3 / 2) + ". key is null");
            }
            if (str2.isEmpty()) {
                throw new IllegalArgumentException((i3 / 2) + ". key is empty");
            }
            if (str3 == null) {
                throw new NullPointerException((i3 / 2) + ". value is null");
            }
            if (((String) map.put(str2, str3)) != null) {
                throw new IllegalArgumentException((i3 / 2) + ". key '" + str2 + "' is provided twice");
            }
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("missing peer socket address, must not be null!");
        }
        if (str != null) {
            str.toLowerCase();
        }
        Iterator it = Collections.unmodifiableMap(new HashMap(map)).keySet().iterator();
        while (it.hasNext() && ((String) it.next()).startsWith(Marker.ANY_MARKER)) {
        }
    }

    public final q5.f b() {
        q5.i iVar = this.f10898m;
        if (iVar != null) {
            return iVar.i;
        }
        throw new IllegalStateException("Cipher suite has not been set (yet)");
    }

    public final long c(int i) {
        long[] jArr = this.f10907v;
        long j4 = jArr[i];
        if (j4 >= 281474976710655L) {
            throw new IllegalStateException("Maximum sequence number for epoch has been reached");
        }
        jArr[i] = 1 + j4;
        return j4;
    }

    public final v0 d() {
        AbstractC0859y abstractC0859y = this.f10906u == 0 ? AbstractC0859y.f11174j : this.f10904s;
        abstractC0859y.getClass();
        if (q5.i.f11286r.equals(abstractC0859y.f11175h)) {
            throw new IllegalStateException("session has no valid crypto params, not fully negotiated yet?");
        }
        if (this.i.b()) {
            return null;
        }
        AbstractC0859y abstractC0859y2 = abstractC0859y;
        return new v0(abstractC0859y2.f11175h, abstractC0859y2.i, this.f10901p, this.H, this.f10895j, this.f10893F);
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() throws DestroyFailedException {
        t5.c.b(this.f10901p);
        this.f10901p = null;
        AbstractC0859y abstractC0859y = this.f10903r;
        C0858x c0858x = AbstractC0859y.f11174j;
        if (abstractC0859y != c0858x) {
            abstractC0859y.destroy();
            this.f10903r = c0858x;
        }
        AbstractC0859y abstractC0859y2 = this.f10904s;
        if (abstractC0859y2 != c0858x) {
            abstractC0859y2.destroy();
            this.f10904s = c0858x;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (r8 >= r5.f10909x) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(long r6, long r8, int r10) {
        /*
            r5 = this;
            int r0 = r5.f10905t
            long r0 = (long) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 0
            if (r0 >= 0) goto L9
            goto L33
        L9:
            if (r0 <= 0) goto Lc
            goto L33
        Lc:
            long r2 = r5.f10891D
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r2 = 1
            if (r0 >= 0) goto L1f
            if (r10 >= 0) goto L16
            goto L1e
        L16:
            long r5 = r5.f10891D
            long r3 = (long) r10
            long r5 = r5 - r3
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 <= 0) goto L33
        L1e:
            return r2
        L1f:
            boolean r10 = r5.f10910y
            if (r10 == 0) goto L34
            int r10 = r5.f10908w
            long r3 = (long) r10
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L2b
            goto L33
        L2b:
            if (r6 != 0) goto L34
            long r6 = r5.f10909x
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
        L33:
            return r1
        L34:
            long r6 = r5.f10890C
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 <= 0) goto L3b
            goto L71
        L3b:
            long r6 = r5.f10891D
            long r6 = r8 - r6
            r3 = 1
            int r6 = (int) r6
            long r6 = r3 << r6
            org.slf4j.Logger r10 = p5.C.f10887K
            boolean r0 = r10.isDebugEnabled()
            if (r0 == 0) goto L69
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.String r9 = java.lang.Long.toBinaryString(r6)
            long r3 = r5.f10892E
            java.lang.String r0 = java.lang.Long.toBinaryString(r3)
            long r3 = r5.f10891D
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r9, r0, r3}
            java.lang.String r9 = "Checking sequence no [{}] using bit mask [{}] against received records [{}] with lower boundary [{}]"
            r10.debug(r9, r8)
        L69:
            long r8 = r5.f10892E
            long r8 = r8 & r6
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 != 0) goto L71
            r1 = r2
        L71:
            r5 = r1 ^ 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.C.e(long, long, int):boolean");
    }

    public final boolean f(long j4, long j6) {
        int i = this.f10905t;
        if (j4 != i) {
            return j4 > ((long) i);
        }
        boolean z5 = j6 > this.f10890C;
        if (z5) {
            this.f10890C = j6;
            long jMax = Math.max(0L, j6 - 63);
            long j7 = jMax - this.f10891D;
            if (j7 > 0) {
                this.f10892E >>>= (int) j7;
                this.f10891D = jMax;
            }
        }
        this.f10892E = (1 << ((int) (j6 - this.f10891D))) | this.f10892E;
        f10887K.debug("Updated receive window with sequence number [{}]: new upper boundary [{}], new bit vector [{}]", Long.valueOf(j6), Long.valueOf(this.f10890C), Long.toBinaryString(this.f10892E));
        return z5;
    }

    public final void g(String str) {
        this.H = null;
        this.G = str;
        if (str != null) {
            t5.d dVarA = t5.d.a(1, str.getBytes(t5.d.f12599d));
            t5.e eVar = new t5.e();
            eVar.c(dVarA);
            this.H = eVar;
        }
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        t5.b bVar = this.f10901p;
        Logger logger = t5.c.f12598a;
        if (bVar != null ? bVar.isDestroyed() : true) {
            AbstractC0859y abstractC0859y = this.f10903r;
            if (abstractC0859y == null || abstractC0859y.isDestroyed()) {
                AbstractC0859y abstractC0859y2 = this.f10904s;
                if (abstractC0859y2 == null || abstractC0859y2.isDestroyed()) {
                    return true;
                }
            }
        }
        return false;
    }

    public C(t0 t0Var, InetSocketAddress inetSocketAddress, v0 v0Var, long j4) {
        this(inetSocketAddress, j4, v0Var.f11159n);
        this.i = t0Var;
        this.f10901p = t5.c.a(v0Var.i);
        this.f10895j = v0Var.f11158m;
        this.f10898m = v0Var.f11155j;
        this.H = v0Var.f11157l;
        this.f10900o = v0Var.f11156k;
    }

    public C(InetSocketAddress inetSocketAddress, long j4, long j6) {
        this.f10897l = Http2.INITIAL_MAX_FRAME_SIZE;
        this.f10898m = q5.i.f11286r;
        this.f10900o = EnumC0852q.NULL;
        this.f10901p = null;
        this.f10902q = null;
        C0858x c0858x = AbstractC0859y.f11174j;
        this.f10903r = c0858x;
        this.f10904s = c0858x;
        this.f10905t = 0;
        this.f10906u = 0;
        long[] jArr = new long[2];
        this.f10907v = jArr;
        EnumC0843h enumC0843h = EnumC0843h.X_509;
        this.f10911z = enumC0843h;
        this.f10888A = enumC0843h;
        this.f10889B = false;
        this.f10890C = -1L;
        this.f10891D = 0L;
        this.f10892E = 0L;
        if (inetSocketAddress == null) {
            throw new NullPointerException("Peer address must not be null");
        }
        if (j4 >= 0 && j4 <= 281474976710655L) {
            this.f10893F = j6;
            this.J = Long.toString(System.currentTimeMillis());
            this.f10894h = inetSocketAddress;
            jArr[0] = j4;
            return;
        }
        throw new IllegalArgumentException("Initial sequence number must be greater than 0 and less than 2^48");
    }
}
