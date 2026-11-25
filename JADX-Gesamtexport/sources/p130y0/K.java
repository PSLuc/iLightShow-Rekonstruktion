package p130y0;

import C0.d;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class K implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f14265h;

    public K(d dVar) {
        this.f14265h = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        d dVar = this.f14265h;
        synchronized (dVar) {
            dVar.f602a.a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        d dVar = this.f14265h;
        synchronized (dVar) {
            dVar.f602a.a();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        d dVar = this.f14265h;
        synchronized (dVar) {
            dVar.f602a.a();
        }
    }
}
