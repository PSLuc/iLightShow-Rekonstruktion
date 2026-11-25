package M3;

import E4.k;
import K.y;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

/* JADX INFO: loaded from: classes.dex */
public final class b implements NsdManager.DiscoveryListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f3490a;

    public b(y yVar) {
        this.f3490a = yVar;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStarted(String str) {
        k.f("regType", str);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStopped(String str) {
        k.f("serviceType", str);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceFound(NsdServiceInfo nsdServiceInfo) {
        k.f("service", nsdServiceInfo);
        nsdServiceInfo.toString();
        if (k.a(nsdServiceInfo.getServiceType(), "_nanoleafapi._tcp.")) {
            nsdServiceInfo.getServiceType();
            y yVar = this.f3490a;
            NsdManager nsdManager = (NsdManager) yVar.f2033d;
            k.c(nsdManager);
            nsdManager.resolveService(nsdServiceInfo, new a(yVar, nsdServiceInfo));
        }
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceLost(NsdServiceInfo nsdServiceInfo) {
        k.f("service", nsdServiceInfo);
        nsdServiceInfo.toString();
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStartDiscoveryFailed(String str, int i) {
        y yVar = this.f3490a;
        k.f("serviceType", str);
        try {
            NsdManager nsdManager = (NsdManager) yVar.f2033d;
            k.c(nsdManager);
            nsdManager.stopServiceDiscovery((b) yVar.f2034e);
        } catch (Exception e6) {
            e6.toString();
        }
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStopDiscoveryFailed(String str, int i) {
        y yVar = this.f3490a;
        k.f("serviceType", str);
        try {
            NsdManager nsdManager = (NsdManager) yVar.f2033d;
            k.c(nsdManager);
            nsdManager.stopServiceDiscovery((b) yVar.f2034e);
        } catch (Exception e6) {
            e6.toString();
        }
    }
}
