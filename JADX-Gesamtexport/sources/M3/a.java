package M3;

import E4.k;
import K.y;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.spotify.sdk.android.auth.AuthorizationClient;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements NsdManager.ResolveListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f3488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NsdServiceInfo f3489b;

    public a(y yVar, NsdServiceInfo nsdServiceInfo) {
        this.f3488a = yVar;
        this.f3489b = nsdServiceInfo;
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
        k.f("serviceInfo", nsdServiceInfo);
        NsdManager nsdManager = (NsdManager) this.f3488a.f2033d;
        if (nsdManager != null) {
            nsdManager.resolveService(this.f3489b, this);
        }
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
        byte[] bArr;
        k.f("serviceInfo", nsdServiceInfo);
        nsdServiceInfo.toString();
        Map<String, byte[]> attributes = nsdServiceInfo.getAttributes();
        if (attributes == null || (bArr = attributes.get(AuthorizationClient.PlayStoreParams.ID)) == null) {
            return;
        }
        Charset charset = M4.a.f3520a;
        String str = new String(bArr, charset);
        int port = nsdServiceInfo.getPort();
        InetAddress host = nsdServiceInfo.getHost();
        byte[] bArr2 = attributes.get("md");
        d dVar = new d(str, host.getHostAddress(), nsdServiceInfo.getServiceName(), port, bArr2 != null ? new String(bArr2, charset) : null);
        y yVar = this.f3488a;
        Iterator it = ((ArrayList) yVar.f2030a).iterator();
        k.e("iterator(...)", it);
        boolean z5 = false;
        while (it.hasNext()) {
            Object next = it.next();
            k.e("next(...)", next);
            if (str.equals(((d) next).f3493a)) {
                z5 = true;
            }
        }
        if (z5) {
            return;
        }
        ((ArrayList) yVar.f2030a).add(dVar);
    }
}
