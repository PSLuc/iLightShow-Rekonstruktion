package D3;

import com.nanjoran.ilightshow.Services.M;
import com.nanjoran.ilightshow.Services.lights.hue.DeviceHueBridge;
import java.lang.ref.WeakReference;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class b extends j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f764l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Date f765m;

    @Override // D3.j
    public final void a(d dVar) {
        WeakReference weakReference = this.f805g;
        K3.a aVar = weakReference != null ? (K3.a) weakReference.get() : null;
        DeviceHueBridge deviceHueBridge = aVar instanceof DeviceHueBridge ? (DeviceHueBridge) aVar : null;
        if (deviceHueBridge != null) {
            deviceHueBridge.send(dVar, this);
        }
    }

    @Override // D3.j
    public final boolean d() {
        h hVar;
        return M.f8305O.n() && this.f802d && (hVar = this.f806h) != null && !hVar.f788c;
    }
}
