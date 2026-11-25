package v5;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13379b;

    public t(int i, List list) {
        this.f13378a = i;
        this.f13379b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f13378a == tVar.f13378a && this.f13379b.equals(tVar.f13379b);
    }

    public final int hashCode() {
        return this.f13379b.hashCode() + (Integer.hashCode(this.f13378a) * 31);
    }

    public final String toString() {
        return "Zones(count=" + this.f13378a + ", colors=" + this.f13379b + ")";
    }
}
