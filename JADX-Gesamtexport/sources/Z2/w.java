package Z2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.internal.zzaf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class w implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f6064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f6067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f6068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComponentName f6069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f6070g;

    public w(y yVar, v vVar) {
        Objects.requireNonNull(yVar);
        this.f6070g = yVar;
        this.f6068e = vVar;
        this.f6064a = new HashMap();
        this.f6065b = 2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #2 {all -> 0x0084, blocks: (B:6:0x0027, B:18:0x0061, B:21:0x006c, B:23:0x0070, B:29:0x0087, B:30:0x0089, B:31:0x0090, B:20:0x0067, B:9:0x003a, B:10:0x0043), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    public final W2.a a(String str, Executor executor) {
        boolean zBindService;
        try {
            Intent intentA = o.a(this.f6070g.f6075b, this.f6068e);
            this.f6065b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(p021d3.a.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                y yVar = this.f6070g;
                p016c3.a aVar = yVar.f6077d;
                Context context = yVar.f6075b;
                v vVar = this.f6068e;
                aVar.getClass();
                ComponentName component = intentA.getComponent();
                if (component != null) {
                    String packageName = component.getPackageName();
                    "com.google.android.gms".equals(packageName);
                    try {
                        zBindService = false;
                        if ((p027e3.b.a(context).f3068a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) == 0) {
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    this.f6066c = zBindService;
                    if (zBindService) {
                        yVar.f6076c.sendMessageDelayed(yVar.f6076c.obtainMessage(1, vVar), yVar.f6079f);
                        return W2.a.f5568m;
                    }
                    this.f6065b = 2;
                    try {
                        yVar.f6077d.a(yVar.f6075b, this);
                    } catch (IllegalArgumentException unused2) {
                    }
                    return new W2.a(16, null, null);
                }
                if (executor == null) {
                    executor = null;
                }
                zBindService = executor != null ? context.bindService(intentA, 4225, executor, this) : context.bindService(intentA, this, 4225);
                this.f6066c = zBindService;
                if (zBindService) {
                    yVar.f6076c.sendMessageDelayed(yVar.f6076c.obtainMessage(1, vVar), yVar.f6079f);
                    return W2.a.f5568m;
                }
                this.f6065b = 2;
                yVar.f6077d.a(yVar.f6075b, this);
                return new W2.a(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (zzaf e6) {
            return e6.f7804h;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        y yVar = this.f6070g;
        synchronized (yVar.f6074a) {
            try {
                yVar.f6076c.removeMessages(1, this.f6068e);
                this.f6067d = iBinder;
                this.f6069f = componentName;
                Iterator it = this.f6064a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f6065b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        y yVar = this.f6070g;
        synchronized (yVar.f6074a) {
            try {
                yVar.f6076c.removeMessages(1, this.f6068e);
                this.f6067d = null;
                this.f6069f = componentName;
                Iterator it = this.f6064a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f6065b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
