package p130y0;

import C0.a;
import C0.c;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class J implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Configuration f14264h;
    public final /* synthetic */ c i;

    public J(Configuration configuration, c cVar) {
        this.f14264h = configuration;
        this.i = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f14264h;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.i.f601a.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f598b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.i.f601a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.i.f601a.clear();
    }
}
