package I3;

import E4.k;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedHashMap f1866b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.a(this.f1865a, eVar.f1865a) && k.a(this.f1866b, eVar.f1866b);
    }

    public final int hashCode() {
        return this.f1866b.hashCode() + (this.f1865a.hashCode() * 31);
    }

    public final String toString() {
        return "SSDPMessage(host=" + this.f1865a + ", properties=" + this.f1866b + ")";
    }
}
