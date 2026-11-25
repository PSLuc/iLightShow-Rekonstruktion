package Z2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f6072g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static y f6073h;
    public static HandlerThread i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f6074a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile p038g3.d f6076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p016c3.a f6077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6079f;

    public y(Context context, Looper looper) {
        x xVar = new x(this);
        this.f6075b = context.getApplicationContext();
        p038g3.d dVar = new p038g3.d(looper, xVar);
        Looper.getMainLooper();
        this.f6076c = dVar;
        if (p016c3.a.f7347b == null) {
            synchronized (p016c3.a.f7346a) {
                try {
                    if (p016c3.a.f7347b == null) {
                        p016c3.a aVar = new p016c3.a();
                        new ConcurrentHashMap();
                        p016c3.a.f7347b = aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        p016c3.a aVar2 = p016c3.a.f7347b;
        n.b(aVar2);
        this.f6077d = aVar2;
        this.f6078e = 5000L;
        this.f6079f = 300000L;
    }

    public final W2.a a(v vVar, r rVar, String str) {
        W2.a aVarA;
        HashMap map = this.f6074a;
        synchronized (map) {
            try {
                w wVar = (w) map.get(vVar);
                if (wVar == null) {
                    wVar = new w(this, vVar);
                    wVar.f6064a.put(rVar, rVar);
                    aVarA = wVar.a(str, null);
                    map.put(vVar, wVar);
                } else {
                    this.f6076c.removeMessages(0, vVar);
                    if (wVar.f6064a.containsKey(rVar)) {
                        String string = vVar.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    wVar.f6064a.put(rVar, rVar);
                    int i3 = wVar.f6065b;
                    if (i3 == 1) {
                        rVar.onServiceConnected(wVar.f6069f, wVar.f6067d);
                    } else if (i3 == 2) {
                        aVarA = wVar.a(str, null);
                    }
                    aVarA = null;
                }
                if (wVar.f6066c) {
                    return W2.a.f5568m;
                }
                if (aVarA == null) {
                    aVarA = new W2.a(-1, null, null);
                }
                return aVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, ServiceConnection serviceConnection, boolean z5) {
        v vVar = new v(str, z5);
        n.c("ServiceConnection must not be null", serviceConnection);
        HashMap map = this.f6074a;
        synchronized (map) {
            try {
                w wVar = (w) map.get(vVar);
                if (wVar == null) {
                    String string = vVar.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!wVar.f6064a.containsKey(serviceConnection)) {
                    String string2 = vVar.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                wVar.f6064a.remove(serviceConnection);
                if (wVar.f6064a.isEmpty()) {
                    this.f6076c.sendMessageDelayed(this.f6076c.obtainMessage(0, vVar), this.f6078e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
