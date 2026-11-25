package p072n3;

import O1.C0308a;
import O1.w;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p060l3.b;
import p066m3.d;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f10548n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0308a f10550b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f10556h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public w f10559l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f10560m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f10552d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f10553e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10554f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f10557j = new IBinder.DeathRecipient() { // from class: n3.f
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            i iVar = this.f10544a;
            int i = 0;
            iVar.f10550b.c("reportBinderDeath", new Object[0]);
            if (iVar.i.get() != null) {
                throw new ClassCastException();
            }
            iVar.f10550b.c("%s : Binder has died.", iVar.f10551c);
            ArrayList arrayList = iVar.f10552d;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                RemoteException remoteException = new RemoteException(String.valueOf(iVar.f10551c).concat(" : Binder has died."));
                b bVar = ((e) obj).f10543h;
                if (bVar != null) {
                    bVar.a(remoteException);
                }
            }
            iVar.f10552d.clear();
            synchronized (iVar.f10554f) {
                iVar.c();
            }
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f10558k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10551c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [n3.f] */
    public i(Context context, C0308a c0308a, Intent intent) {
        this.f10549a = context;
        this.f10550b = c0308a;
        this.f10556h = intent;
    }

    public static void b(i iVar, d dVar) {
        d dVar2 = iVar.f10560m;
        ArrayList arrayList = iVar.f10552d;
        int i = 0;
        C0308a c0308a = iVar.f10550b;
        if (dVar2 != null || iVar.f10555g) {
            if (!iVar.f10555g) {
                dVar.run();
                return;
            } else {
                c0308a.c("Waiting to bind to the service.", new Object[0]);
                arrayList.add(dVar);
                return;
            }
        }
        c0308a.c("Initiate binding to the service.", new Object[0]);
        arrayList.add(dVar);
        w wVar = new w(iVar);
        iVar.f10559l = wVar;
        iVar.f10555g = true;
        if (iVar.f10549a.bindService(iVar.f10556h, wVar, 1)) {
            return;
        }
        c0308a.c("Failed to bind to the service.", new Object[0]);
        iVar.f10555g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zzu zzuVar = new zzu();
            b bVar = ((e) obj).f10543h;
            if (bVar != null) {
                bVar.a(zzuVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f10548n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f10551c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f10551c, 10);
                    handlerThread.start();
                    map.put(this.f10551c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f10551c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.f10553e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(new RemoteException(String.valueOf(this.f10551c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
