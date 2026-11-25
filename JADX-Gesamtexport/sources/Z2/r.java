package Z2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f6054b;

    public r(com.google.android.gms.common.internal.a aVar, int i) {
        Objects.requireNonNull(aVar);
        this.f6054b = aVar;
        this.f6053a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i3;
        if (iBinder == null) {
            com.google.android.gms.common.internal.a aVar = this.f6054b;
            synchronized (aVar.f7787f) {
                i = aVar.f7793m;
            }
            if (i == 3) {
                aVar.f7800t = true;
                i3 = 5;
            } else {
                i3 = 4;
            }
            p pVar = aVar.f7786e;
            pVar.sendMessage(pVar.obtainMessage(i3, aVar.f7802v.get(), 16));
            return;
        }
        com.google.android.gms.common.internal.a aVar2 = this.f6054b;
        synchronized (aVar2.f7788g) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.f7789h = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof m)) ? new m(iBinder) : (m) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar3 = this.f6054b;
        int i6 = this.f6053a;
        aVar3.getClass();
        t tVar = new t(aVar3, 0, null);
        p pVar2 = aVar3.f7786e;
        pVar2.sendMessage(pVar2.obtainMessage(7, i6, -1, tVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar = this.f6054b;
        synchronized (aVar.f7788g) {
            aVar.f7789h = null;
        }
        com.google.android.gms.common.internal.a aVar2 = this.f6054b;
        int i = this.f6053a;
        p pVar = aVar2.f7786e;
        pVar.sendMessage(pVar.obtainMessage(6, i, 1));
    }
}
