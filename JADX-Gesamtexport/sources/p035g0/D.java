package p035g0;

import E4.k;
import S1.V;
import p030f0.d;
import p030f0.e;

/* JADX INFO: loaded from: classes.dex */
public final class D extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f9011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0706g f9012b;

    public D(e eVar) {
        C0706g c0706gH;
        this.f9011a = eVar;
        if (V.E(eVar)) {
            c0706gH = null;
        } else {
            c0706gH = H.h();
            F.b(c0706gH, eVar);
        }
        this.f9012b = c0706gH;
    }

    @Override // p035g0.E
    public final d a() {
        e eVar = this.f9011a;
        return new d(eVar.f8843a, eVar.f8844b, eVar.f8845c, eVar.f8846d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            return k.a(this.f9011a, ((D) obj).f9011a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9011a.hashCode();
    }
}
