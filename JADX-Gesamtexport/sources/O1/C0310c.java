package O1;

import B.C0025m0;
import F.C0068j;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.google.android.gms.internal.play_billing.A1;
import com.google.android.gms.internal.play_billing.AbstractC0577k;
import com.google.android.gms.internal.play_billing.AbstractC0594t;
import com.google.android.gms.internal.play_billing.AbstractC0602x;
import com.google.android.gms.internal.play_billing.B1;
import com.google.android.gms.internal.play_billing.C0559d1;
import com.google.android.gms.internal.play_billing.C0562e1;
import com.google.android.gms.internal.play_billing.C0565f1;
import com.google.android.gms.internal.play_billing.C0568g1;
import com.google.android.gms.internal.play_billing.C0585o;
import com.google.android.gms.internal.play_billing.C0600w;
import com.google.android.gms.internal.play_billing.InterfaceC0554c;
import com.google.android.gms.internal.play_billing.V;
import com.google.android.gms.internal.play_billing.X;
import com.google.android.gms.internal.play_billing.k1;
import com.google.android.gms.internal.play_billing.m1;
import com.google.android.gms.internal.play_billing.n1;
import com.nanjoran.ilightshow.Services.D0;
import com.nanjoran.ilightshow.Services.E0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p015c2.AbstractC0473d;

/* JADX INFO: renamed from: O1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0310c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile InterfaceC0311d f4459A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ExecutorService f4460B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Long f4461C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final AbstractC0473d f4462D;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4466d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile E f4468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f4469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D.x f4470h;
    public volatile InterfaceC0554c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile r f4471j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4472k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4474m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4475n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4476o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4477p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4478q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4479r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4480s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4481t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4482u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4483v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4484w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final W2.g f4485x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f4486y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f4487z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4463a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f4464b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f4467e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4473l = 0;

    public C0310c(W2.g gVar, Context context, D0 d1, C0309b c0309b) {
        long jNextLong = new Random().nextLong();
        this.f4461C = Long.valueOf(jNextLong);
        this.f4462D = AbstractC0577k.f7954a;
        this.f4465c = "8.1.0";
        String strW = w();
        this.f4466d = strW;
        this.f4469g = context.getApplicationContext();
        m1 m1VarA = n1.A();
        m1VarA.c();
        n1.y((n1) m1VarA.i);
        if (strW != null) {
            m1VarA.c();
            n1.z((n1) m1VarA.i, strW);
        }
        String packageName = this.f4469g.getPackageName();
        m1VarA.c();
        n1.r((n1) m1VarA.i, packageName);
        m1VarA.c();
        n1.o((n1) m1VarA.i, jNextLong);
        boolean z5 = c0309b.f4458d;
        m1VarA.c();
        n1.x((n1) m1VarA.i, z5);
        int i = Build.VERSION.SDK_INT;
        m1VarA.c();
        n1.B((n1) m1VarA.i, i);
        m1VarA.d();
        x(m1VarA, context);
        try {
            int i3 = this.f4469g.getPackageManager().getPackageInfo(this.f4469g.getPackageName(), 0).versionCode;
            m1VarA.c();
            n1.C((n1) m1VarA.i, i3);
        } catch (Throwable unused) {
            AbstractC0602x.h("BillingClient");
        }
        this.f4470h = new D.x(this.f4469g, (n1) m1VarA.a());
        if (d1 == null) {
            int i6 = AbstractC0602x.f8015a;
            Log.isLoggable("BillingClient", 5);
        }
        this.f4468f = new E(this.f4469g, d1, this.f4470h);
        this.f4485x = gVar;
        this.f4487z = false;
        this.f4469g.getPackageName();
        this.f4486y = c0309b.f4458d;
    }

    public static Future f(Callable callable, long j4, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new n(futureSubmit, 2, runnable), (long) (j4 * 0.95d));
            return futureSubmit;
        } catch (Exception unused) {
            AbstractC0602x.h("BillingClient");
            return null;
        }
    }

    public static void p(C0310c c0310c, int i) {
        if (i != 0) {
            c0310c.k(0);
            return;
        }
        synchronized (c0310c.f4463a) {
            try {
                if (c0310c.f4464b == 3) {
                    return;
                }
                c0310c.k(2);
                E e6 = c0310c.f4468f != null ? c0310c.f4468f : null;
                if (e6 != null) {
                    boolean z5 = c0310c.f4482u;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    e6.f4444a = z5;
                    D d6 = (D) e6.f4449f;
                    Context context = (Context) e6.f4445b;
                    d6.a(context, intentFilter2);
                    if (!e6.f4444a) {
                        ((D) e6.f4448e).a(context, intentFilter);
                        return;
                    }
                    D d7 = (D) e6.f4448e;
                    synchronized (d7) {
                        try {
                            if (d7.f4441a) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(d7, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != d7.f4442b ? 4 : 2);
                            } else {
                                context.registerReceiver(d7, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                            }
                            d7.f4441a = true;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String w() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void x(m1 m1Var, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i = (int) (memoryInfo.totalMem / 1048576);
                m1Var.c();
                n1.w((n1) m1Var.i, i);
                String str = Build.BRAND;
                m1Var.c();
                n1.s((n1) m1Var.i);
                String str2 = Build.MODEL;
                m1Var.c();
                n1.v((n1) m1Var.i);
                String str3 = Build.MANUFACTURER;
                m1Var.c();
                n1.u((n1) m1Var.i);
                String str4 = Build.FINGERPRINT;
                m1Var.c();
                n1.t((n1) m1Var.i);
            }
        } catch (RuntimeException unused) {
            AbstractC0602x.h("BillingClient");
        }
    }

    public final void A(int i, g gVar, long j4) {
        try {
            int i3 = y.f4542a;
            try {
                this.f4470h.r(y.b(i, 2, gVar, null, k1.BROADCAST_ACTION_UNSPECIFIED), this.f4473l, j4);
            } catch (Throwable unused) {
                AbstractC0602x.h("BillingClient");
            }
        } catch (Throwable unused2) {
            AbstractC0602x.h("BillingClient");
        }
    }

    public final void B(int i, int i3, g gVar, String str) {
        try {
            int i6 = y.f4542a;
            h(y.b(i, i3, gVar, str, k1.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable unused) {
            AbstractC0602x.h("BillingClient");
        }
    }

    public final void C(int i, g gVar, long j4, boolean z5) {
        try {
            int i3 = y.f4542a;
            try {
                this.f4470h.t(y.b(i, 2, gVar, null, k1.BROADCAST_ACTION_UNSPECIFIED), this.f4473l, j4, z5);
            } catch (Throwable unused) {
                AbstractC0602x.h("BillingClient");
            }
        } catch (Throwable unused2) {
            AbstractC0602x.h("BillingClient");
        }
    }

    public final void D(int i, g gVar, String str, long j4, boolean z5) {
        try {
            int i3 = y.f4542a;
            try {
                this.f4470h.t(y.b(i, 2, gVar, str, k1.BROADCAST_ACTION_UNSPECIFIED), this.f4473l, j4, z5);
            } catch (Throwable unused) {
                AbstractC0602x.h("BillingClient");
            }
        } catch (Throwable unused2) {
            AbstractC0602x.h("BillingClient");
        }
    }

    public final void E(g gVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f4467e.post(new n(this, 1, gVar));
    }

    public void a(C0308a c0308a, J2.b bVar) {
        if (f(new B2.m(this, bVar, c0308a, 2), 30000L, new n(this, 0, bVar), q(), e()) == null) {
            g gVarT = t();
            z(25, 3, gVarT);
            bVar.d(gVarT);
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:139:0x032f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0337  */
    /* JADX WARN: Code duplicated, block: B:143:0x033f  */
    /* JADX WARN: Code duplicated, block: B:146:0x034a  */
    /* JADX WARN: Code duplicated, block: B:149:0x036a  */
    /* JADX WARN: Code duplicated, block: B:152:0x037c  */
    /* JADX WARN: Code duplicated, block: B:155:0x038e  */
    /* JADX WARN: Code duplicated, block: B:158:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:160:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:161:0x03af  */
    /* JADX WARN: Code duplicated, block: B:163:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:167:0x03cc A[LOOP:1: B:165:0x03c6->B:167:0x03cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:170:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:175:0x0422  */
    /* JADX WARN: Code duplicated, block: B:177:0x0428  */
    /* JADX WARN: Code duplicated, block: B:180:0x0434  */
    /* JADX WARN: Code duplicated, block: B:182:0x0450  */
    /* JADX WARN: Code duplicated, block: B:184:0x045e  */
    /* JADX WARN: Code duplicated, block: B:186:0x046b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0470  */
    /* JADX WARN: Code duplicated, block: B:191:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:193:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:208:0x04fc A[EDGE_INSN: B:208:0x04fc->B:209:0x04fe BREAK  A[LOOP:3: B:201:0x04d2->B:207:0x04f7]] */
    /* JADX WARN: Code duplicated, block: B:211:0x0504  */
    /* JADX WARN: Code duplicated, block: B:213:0x0509  */
    /* JADX WARN: Code duplicated, block: B:217:0x053a  */
    /* JADX WARN: Code duplicated, block: B:220:0x0545  */
    /* JADX WARN: Code duplicated, block: B:223:0x0550  */
    /* JADX WARN: Code duplicated, block: B:226:0x055b  */
    /* JADX WARN: Code duplicated, block: B:236:0x0593  */
    /* JADX WARN: Code duplicated, block: B:238:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:241:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:244:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:245:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:247:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:257:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:259:0x0602 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:261:0x0607  */
    /* JADX WARN: Code duplicated, block: B:263:0x060b  */
    /* JADX WARN: Code duplicated, block: B:264:0x060e  */
    /* JADX WARN: Code duplicated, block: B:266:0x062a  */
    /* JADX WARN: Code duplicated, block: B:280:0x0668 A[Catch: Exception -> 0x0656, CancellationException | TimeoutException -> 0x0659, TryCatch #1 {CancellationException | TimeoutException -> 0x0659, blocks: (B:270:0x064f, B:280:0x0668, B:282:0x0684, B:309:0x06f7, B:309:0x06f7, B:305:0x06e0, B:305:0x06e0, B:296:0x06b4, B:296:0x06b4, B:315:0x0703, B:315:0x0703), top: B:333:0x0646 }] */
    /* JADX WARN: Code duplicated, block: B:282:0x0684 A[Catch: Exception -> 0x0656, CancellationException | TimeoutException -> 0x0659, TRY_LEAVE, TryCatch #1 {CancellationException | TimeoutException -> 0x0659, blocks: (B:270:0x064f, B:280:0x0668, B:282:0x0684, B:309:0x06f7, B:309:0x06f7, B:305:0x06e0, B:305:0x06e0, B:296:0x06b4, B:296:0x06b4, B:315:0x0703, B:315:0x0703), top: B:333:0x0646 }] */
    /* JADX WARN: Code duplicated, block: B:284:0x0692  */
    /* JADX WARN: Code duplicated, block: B:288:0x069d  */
    /* JADX WARN: Code duplicated, block: B:289:0x069e A[Catch: all -> 0x06ad, TryCatch #8 {all -> 0x06ad, blocks: (B:286:0x0695, B:289:0x069e, B:291:0x06a2, B:294:0x06af), top: B:336:0x0695 }] */
    /* JADX WARN: Code duplicated, block: B:291:0x06a2 A[Catch: all -> 0x06ad, TryCatch #8 {all -> 0x06ad, blocks: (B:286:0x0695, B:289:0x069e, B:291:0x06a2, B:294:0x06af), top: B:336:0x0695 }] */
    /* JADX WARN: Code duplicated, block: B:294:0x06af A[Catch: all -> 0x06ad, TRY_LEAVE, TryCatch #8 {all -> 0x06ad, blocks: (B:286:0x0695, B:289:0x069e, B:291:0x06a2, B:294:0x06af), top: B:336:0x0695 }] */
    /* JADX WARN: Code duplicated, block: B:298:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:301:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:315:0x0703 A[Catch: Exception -> 0x0656, CancellationException | TimeoutException -> 0x0659, CancellationException | TimeoutException -> 0x0659, TRY_LEAVE, TryCatch #1 {CancellationException | TimeoutException -> 0x0659, blocks: (B:270:0x064f, B:280:0x0668, B:282:0x0684, B:309:0x06f7, B:309:0x06f7, B:305:0x06e0, B:305:0x06e0, B:296:0x06b4, B:296:0x06b4, B:315:0x0703, B:315:0x0703), top: B:333:0x0646 }] */
    /* JADX WARN: Code duplicated, block: B:336:0x0695 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x06d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x0648 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x0523 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16, types: [int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r27v0, types: [O1.c] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r5v10, types: [long] */
    /* JADX WARN: Type inference failed for: r5v11, types: [long] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [O1.h] */
    /* JADX WARN: Type inference failed for: r5v6, types: [O1.h] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:326:0x076c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public O1.g b(android.app.Activity r28, final N.P r29) {
        /*
            Method dump skipped, instruction units count: 1912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.C0310c.b(android.app.Activity, N.P):O1.g");
    }

    public void c(j jVar, D0 d1) {
        int i = 3;
        if (f(new B2.m(this, d1, jVar, i), 30000L, new n(this, i, d1), q(), e()) == null) {
            g gVarT = t();
            z(25, 7, gVarT);
            com.google.android.gms.internal.play_billing.r rVar = AbstractC0594t.i;
            d1.a(gVarT, new C0025m0(C0600w.f8010l));
        }
    }

    public void d(E0 e6) {
        l(e6, 0);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.f4460B == null) {
                this.f4460B = Executors.newFixedThreadPool(AbstractC0602x.f8015a, new o(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4460B;
    }

    public final void g(J2.b bVar, g gVar, int i, Exception exc) {
        AbstractC0602x.h("BillingClient");
        B(i, 3, gVar, y.a(exc));
        bVar.d(gVar);
    }

    public final void h(C0562e1 c0562e1) {
        try {
            D.x xVar = this.f4470h;
            int i = this.f4473l;
            xVar.getClass();
            try {
                m1 m1Var = (m1) ((n1) xVar.i).j();
                m1Var.c();
                n1.D((n1) m1Var.i, i);
                xVar.i = (n1) m1Var.a();
                xVar.q(c0562e1);
            } catch (Throwable unused) {
                AbstractC0602x.h("BillingLogger");
            }
        } catch (Throwable unused2) {
            AbstractC0602x.h("BillingClient");
        }
    }

    public final void i(C0568g1 c0568g1) {
        try {
            D.x xVar = this.f4470h;
            int i = this.f4473l;
            xVar.getClass();
            try {
                m1 m1Var = (m1) ((n1) xVar.i).j();
                m1Var.c();
                n1.D((n1) m1Var.i, i);
                n1 n1Var = (n1) m1Var.a();
                xVar.i = n1Var;
                try {
                    xVar.w(c0568g1, n1Var);
                } catch (Throwable unused) {
                    AbstractC0602x.h("BillingLogger");
                }
            } catch (Throwable unused2) {
                AbstractC0602x.h("BillingLogger");
            }
        } catch (Throwable unused3) {
            AbstractC0602x.h("BillingClient");
        }
    }

    public final void j(int i, int i3, g gVar) {
        try {
            int i6 = y.f4542a;
            C0559d1 c0559d1 = (C0559d1) y.b(i, 6, gVar, null, k1.BROADCAST_ACTION_UNSPECIFIED).j();
            A1 a1P = B1.p();
            a1P.d(i3 > 0);
            a1P.e(i3);
            c0559d1.e(a1P);
            h((C0562e1) c0559d1.a());
        } catch (Throwable unused) {
            AbstractC0602x.h("BillingClient");
        }
    }

    public final void k(int i) {
        String str;
        String str2;
        synchronized (this.f4463a) {
            try {
                if (this.f4464b == 3) {
                    return;
                }
                int i3 = this.f4464b;
                if (i3 == 0) {
                    str = "DISCONNECTED";
                } else if (i3 != 1) {
                    str = i3 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str = "CONNECTING";
                }
                if (i == 0) {
                    str2 = "DISCONNECTED";
                } else if (i != 1) {
                    str2 = i != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str2 = "CONNECTING";
                }
                AbstractC0602x.g("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.f4464b = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(InterfaceC0311d interfaceC0311d, int i) {
        int i3;
        g gVarS;
        g gVar;
        synchronized (this.f4463a) {
            try {
                if (o()) {
                    gVarS = s(i);
                } else {
                    if (this.f4464b == 1) {
                        int i6 = AbstractC0602x.f8015a;
                        Log.isLoggable("BillingClient", 5);
                        gVar = A.f4424d;
                        j(37, i, gVar);
                    } else if (this.f4464b == 3) {
                        int i7 = AbstractC0602x.f8015a;
                        Log.isLoggable("BillingClient", 5);
                        gVar = A.f4429j;
                        j(38, i, gVar);
                    } else {
                        k(1);
                        if (i == 0) {
                            this.f4459A = interfaceC0311d;
                            i = 0;
                        }
                        m();
                        AbstractC0602x.g("BillingClient", "Starting in-app billing setup.");
                        this.f4471j = new r(this, interfaceC0311d, i);
                        r rVar = this.f4471j;
                        synchronized (rVar.f4527e.f4463a) {
                            C0585o c0585o = rVar.f4524b;
                            c0585o.f7979c = 0L;
                            c0585o.f7978b = false;
                            c0585o.a();
                        }
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.f4469g.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            i3 = 41;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            i3 = 40;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    Log.isLoggable("BillingClient", 5);
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f4465c);
                                    synchronized (this.f4463a) {
                                        try {
                                            if (this.f4464b == 2) {
                                                gVarS = s(i);
                                            } else if (this.f4464b != 1) {
                                                Log.isLoggable("BillingClient", 5);
                                                gVar = A.f4429j;
                                                j(105, i, gVar);
                                            } else {
                                                r rVar2 = this.f4471j;
                                                if (i > 0 ? this.f4469g.bindService(intent2, 1, e(), rVar2) : this.f4469g.bindService(intent2, rVar2, 1)) {
                                                    AbstractC0602x.g("BillingClient", "Service was bonded successfully.");
                                                    gVarS = null;
                                                } else {
                                                    Log.isLoggable("BillingClient", 5);
                                                    i3 = 39;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                Log.isLoggable("BillingClient", 5);
                            }
                        }
                        k(0);
                        AbstractC0602x.g("BillingClient", "Billing service unavailable on device.");
                        g gVar2 = A.f4422b;
                        j(i3, i, gVar2);
                        gVarS = gVar2;
                    }
                    gVarS = gVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (gVarS != null) {
            interfaceC0311d.c(gVarS);
        }
    }

    public final void m() {
        synchronized (this.f4463a) {
            if (this.f4471j != null) {
                try {
                    try {
                        this.f4469g.unbindService(this.f4471j);
                        this.i = null;
                        this.f4471j = null;
                    } catch (Throwable unused) {
                        AbstractC0602x.h("BillingClient");
                        this.i = null;
                        this.f4471j = null;
                    }
                } catch (Throwable th) {
                    this.i = null;
                    this.f4471j = null;
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092 A[SYNTHETIC] */
    public final boolean n() {
        long j4;
        long jPow;
        AbstractC0473d abstractC0473d = this.f4462D;
        if (abstractC0473d == null) {
            throw new NullPointerException("ticker");
        }
        long jY = abstractC0473d.Y();
        long j6 = 30000;
        long jConvert = 30000;
        int i = 1;
        while (i <= 3) {
            try {
                long jMax = Math.max(0L, jConvert);
                if (jMax <= 0) {
                    int i3 = AbstractC0602x.f8015a;
                    Log.isLoggable("BillingClient", 5);
                    return o();
                }
                try {
                    int i6 = ((g) u(i).get(jMax, TimeUnit.MILLISECONDS)).f4493a;
                    if (i6 == 0) {
                        AbstractC0602x.g("BillingClient", "Reconnection succeeded with result: " + i6);
                        return o();
                    }
                    int i7 = AbstractC0602x.f8015a;
                    Log.isLoggable("BillingClient", 5);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    long jY2 = (abstractC0473d.Y() - jY) + 0;
                    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                    jConvert = j6 - timeUnit.convert(jY2, timeUnit2);
                    j4 = j6;
                    jPow = ((long) Math.pow(2.0d, i - 1)) * 1000;
                    if (jConvert < jPow) {
                        Log.isLoggable("BillingClient", 5);
                        return o();
                    }
                    if (i >= 3 && jPow > 0) {
                        try {
                            Thread.sleep(jPow);
                            jConvert = j4 - timeUnit.convert((abstractC0473d.Y() - jY) + 0, timeUnit2);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            AbstractC0602x.h("BillingClient");
                        }
                    }
                    i++;
                    j6 = j4;
                } catch (Exception e6) {
                    e = e6;
                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    AbstractC0602x.h("BillingClient");
                }
            } catch (Exception e7) {
                e = e7;
            }
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            AbstractC0602x.h("BillingClient");
            TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
            long jY3 = (abstractC0473d.Y() - jY) + 0;
            TimeUnit timeUnit4 = TimeUnit.NANOSECONDS;
            jConvert = j6 - timeUnit3.convert(jY3, timeUnit4);
            j4 = j6;
            jPow = ((long) Math.pow(2.0d, i - 1)) * 1000;
            if (jConvert < jPow) {
                Log.isLoggable("BillingClient", 5);
                return o();
            }
            if (i >= 3) {
            }
            i++;
            j6 = j4;
        }
        int i8 = AbstractC0602x.f8015a;
        Log.isLoggable("BillingClient", 5);
        return o();
    }

    public final boolean o() {
        boolean z5;
        synchronized (this.f4463a) {
            try {
                z5 = false;
                if (this.f4464b == 2 && this.i != null && this.f4471j != null) {
                    z5 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z5;
    }

    public final Handler q() {
        return Looper.myLooper() == null ? this.f4467e : new Handler(Looper.myLooper());
    }

    public final C0068j r(g gVar, int i, Exception exc) {
        AbstractC0602x.h("BillingClient");
        B(i, 7, gVar, y.a(exc));
        return new C0068j(gVar.f4493a, gVar.f4495c, new ArrayList(), new ArrayList());
    }

    public final g s(int i) {
        AbstractC0602x.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        C0565f1 c0565f1R = C0568g1.r();
        c0565f1R.c();
        C0568g1.q((C0568g1) c0565f1R.i, 6);
        A1 a1P = B1.p();
        a1P.c();
        B1.o((B1) a1P.i);
        a1P.d(i > 0);
        a1P.e(i);
        c0565f1R.c();
        C0568g1.p((C0568g1) c0565f1R.i, (B1) a1P.a());
        i((C0568g1) c0565f1R.a());
        return A.i;
    }

    public final g t() {
        int[] iArr = {0, 3};
        synchronized (this.f4463a) {
            for (int i = 0; i < 2; i++) {
                if (this.f4464b == iArr[i]) {
                    return A.f4429j;
                }
            }
            return A.f4428h;
        }
    }

    public final X u(int i) {
        if (this.f4486y && !o()) {
            return d0.I(new K3.e(i, 2, this));
        }
        AbstractC0602x.g("BillingClient", "Already connected or not opted into auto reconnection.");
        return new V(A.i);
    }

    public final void v() {
        if (TextUtils.isEmpty(null)) {
            this.f4469g.getPackageName();
        }
    }

    public final D.x y(g gVar, int i, Exception exc) {
        B(i, 9, gVar, y.a(exc));
        AbstractC0602x.h("BillingClient");
        return new D.x(15, gVar, null, false);
    }

    public final void z(int i, int i3, g gVar) {
        try {
            int i6 = y.f4542a;
            h(y.b(i, i3, gVar, null, k1.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable unused) {
            AbstractC0602x.h("BillingClient");
        }
    }

    public C0310c(W2.g gVar, Context context, C0309b c0309b) {
        long jNextLong = new Random().nextLong();
        this.f4461C = Long.valueOf(jNextLong);
        this.f4462D = AbstractC0577k.f7954a;
        this.f4465c = "8.1.0";
        String strW = w();
        this.f4466d = strW;
        this.f4469g = context.getApplicationContext();
        m1 m1VarA = n1.A();
        m1VarA.c();
        n1.y((n1) m1VarA.i);
        if (strW != null) {
            m1VarA.c();
            n1.z((n1) m1VarA.i, strW);
        }
        String packageName = this.f4469g.getPackageName();
        m1VarA.c();
        n1.r((n1) m1VarA.i, packageName);
        m1VarA.c();
        n1.o((n1) m1VarA.i, jNextLong);
        boolean z5 = c0309b.f4458d;
        m1VarA.c();
        n1.x((n1) m1VarA.i, z5);
        int i = Build.VERSION.SDK_INT;
        m1VarA.c();
        n1.B((n1) m1VarA.i, i);
        m1VarA.d();
        x(m1VarA, context);
        try {
            int i3 = this.f4469g.getPackageManager().getPackageInfo(this.f4469g.getPackageName(), 0).versionCode;
            m1VarA.c();
            n1.C((n1) m1VarA.i, i3);
        } catch (Throwable unused) {
            AbstractC0602x.h("BillingClient");
        }
        this.f4470h = new D.x(this.f4469g, (n1) m1VarA.a());
        int i6 = AbstractC0602x.f8015a;
        Log.isLoggable("BillingClient", 5);
        this.f4468f = new E(this.f4469g, (D0) null, this.f4470h);
        this.f4485x = gVar;
        this.f4469g.getPackageName();
        this.f4486y = c0309b.f4458d;
    }
}
