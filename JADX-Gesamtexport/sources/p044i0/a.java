package p044i0;

import S0.b;
import S0.k;
import p030f0.f;
import p035g0.InterfaceC0714o;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f9381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f9382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0714o f9383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9384d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return E4.k.a(this.f9381a, aVar.f9381a) && this.f9382b == aVar.f9382b && E4.k.a(this.f9383c, aVar.f9383c) && f.a(this.f9384d, aVar.f9384d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f9384d) + ((this.f9383c.hashCode() + ((this.f9382b.hashCode() + (this.f9381a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f9381a + ", layoutDirection=" + this.f9382b + ", canvas=" + this.f9383c + ", size=" + ((Object) f.f(this.f9384d)) + ')';
    }
}
