package Y2;

import D.x;
import Z2.y;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p080p.C0834f;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Handler.Callback {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Status f5871o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f5872p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f5873q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static c f5874r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Z2.h f5877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p010b3.c f5878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f5879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final W2.d f5880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f5881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f5882h;
    public final AtomicInteger i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f5883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0834f f5884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0834f f5885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p038g3.d f5886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f5887n;

    public c(Context context, Looper looper) {
        W2.d dVar = W2.d.f5579c;
        this.f5875a = 10000L;
        this.f5876b = false;
        this.f5882h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.f5883j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f5884k = new C0834f(null);
        this.f5885l = new C0834f(null);
        this.f5887n = true;
        this.f5879e = context;
        p038g3.d dVar2 = new p038g3.d(looper, this);
        Looper.getMainLooper();
        this.f5886m = dVar2;
        this.f5880f = dVar;
        this.f5881g = new x(26);
        PackageManager packageManager = context.getPackageManager();
        if (p027e3.a.i == null) {
            p027e3.a.i = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (p027e3.a.i.booleanValue()) {
            this.f5887n = false;
        }
        dVar2.sendMessage(dVar2.obtainMessage(6));
    }

    public static Status b(a aVar, W2.a aVar2) {
        return new Status(17, p012c.k.s("API: ", (String) aVar.f5865b.f707j, " is not available on this device. Connection failed with: ", String.valueOf(aVar2)), aVar2.f5570j, aVar2);
    }

    public static c d(Context context) {
        c cVar;
        HandlerThread handlerThread;
        synchronized (f5873q) {
            if (f5874r == null) {
                synchronized (y.f6072g) {
                    try {
                        handlerThread = y.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            y.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = y.i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = W2.d.f5578b;
                f5874r = new c(applicationContext, looper);
            }
            cVar = f5874r;
        }
        return cVar;
    }

    public final boolean a(W2.a aVar, int i) {
        boolean zBooleanValue;
        PendingIntent activity;
        Boolean bool;
        W2.d dVar = this.f5880f;
        Context context = this.f5879e;
        dVar.getClass();
        synchronized (p027e3.a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = p027e3.a.f8731a;
            if (context2 == null || (bool = p027e3.a.f8732b) == null || context2 != applicationContext) {
                p027e3.a.f8732b = null;
                boolean zIsInstantApp = applicationContext.getPackageManager().isInstantApp();
                p027e3.a.f8732b = Boolean.valueOf(zIsInstantApp);
                p027e3.a.f8731a = applicationContext;
                zBooleanValue = zIsInstantApp;
            } else {
                zBooleanValue = bool.booleanValue();
            }
        }
        if (!zBooleanValue) {
            int i3 = aVar.i;
            if (i3 == 0 || (activity = aVar.f5570j) == null) {
                Intent intentA = dVar.a(i3, context, null);
                activity = intentA != null ? PendingIntent.getActivity(context, 0, intentA, 201326592) : null;
            }
            if (activity != null) {
                int i6 = aVar.i;
                int i7 = GoogleApiActivity.i;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                dVar.f(context, i6, PendingIntent.getActivity(context, 0, intent, p038g3.c.f9182a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final h c(p010b3.c cVar) {
        ConcurrentHashMap concurrentHashMap = this.f5883j;
        a aVar = cVar.f7100e;
        h hVar = (h) concurrentHashMap.get(aVar);
        if (hVar == null) {
            hVar = new h(this, cVar);
            concurrentHashMap.put(aVar, hVar);
        }
        if (hVar.f5893b.j()) {
            this.f5885l.add(aVar);
        }
        hVar.m();
        return hVar;
    }

    public final void e(W2.a aVar, int i) {
        if (a(aVar, i)) {
            return;
        }
        p038g3.d dVar = this.f5886m;
        dVar.sendMessage(dVar.obtainMessage(5, i, 0, aVar));
    }

    /* JADX WARN: Code duplicated, block: B:208:0x0385  */
    /* JADX WARN: Code duplicated, block: B:210:0x038b  */
    /* JADX WARN: Code duplicated, block: B:212:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:214:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:79:0x0110  */
    /* JADX WARN: Code duplicated, block: B:81:0x0114  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 Y2.h, still in use, count: 2, list:
          (r2v6 Y2.h) from 0x037d: IGET (r2v6 Y2.h) A[WRAPPED] Y2.h.g int
          (r2v6 Y2.h) from 0x0383: PHI (r2 I:??) = (r2v3 Y2.h), (r2v6 Y2.h) binds: [B:206:0x0382, B:268:0x0383] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r12) {
        /*
            Method dump skipped, instruction units count: 1166
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.c.handleMessage(android.os.Message):boolean");
    }
}
