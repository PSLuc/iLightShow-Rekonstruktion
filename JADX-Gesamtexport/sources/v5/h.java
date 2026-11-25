package v5;

import w5.C1064w;
import w5.InterfaceC1067z;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1064w f13321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1067z f13322b;

    public h(C1064w c1064w, InterfaceC1067z interfaceC1067z) {
        E4.k.f("payload", interfaceC1067z);
        this.f13321a = c1064w;
        this.f13322b = interfaceC1067z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return E4.k.a(this.f13321a, hVar.f13321a) && E4.k.a(this.f13322b, hVar.f13322b);
    }

    public final int hashCode() {
        return this.f13322b.hashCode() + (this.f13321a.hashCode() * 31);
    }

    public final String toString() {
        return "LifxMessage(header=" + this.f13321a + ", payload=" + this.f13322b + ")";
    }
}
