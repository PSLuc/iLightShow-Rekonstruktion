package androidx.lifecycle;

import B.C0043w;
import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class K implements J1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J1.e f6960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f6962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p084p4.m f6963d;

    public K(J1.e eVar, V v6) {
        E4.k.f("savedStateRegistry", eVar);
        this.f6960a = eVar;
        this.f6963d = G4.a.z(new C0043w(27, v6));
    }

    @Override // J1.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f6962c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((L) this.f6963d.getValue()).f6964b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((G) entry.getValue()).f6954e.a();
            if (!E4.k.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f6961b = false;
        return bundle;
    }

    public final void b() {
        if (this.f6961b) {
            return;
        }
        Bundle bundleB = this.f6960a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f6962c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleB != null) {
            bundle.putAll(bundleB);
        }
        this.f6962c = bundle;
        this.f6961b = true;
    }
}
