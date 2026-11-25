package p105t3;

import java.util.ArrayList;
import java.util.Iterator;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class o extends r implements Iterable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f12590h = new ArrayList();

    @Override // p105t3.r
    public final int c() {
        return l().c();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof o) && ((o) obj).f12590h.equals(this.f12590h);
        }
        return true;
    }

    public final int hashCode() {
        return this.f12590h.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f12590h.iterator();
    }

    @Override // p105t3.r
    public final long j() {
        return l().j();
    }

    @Override // p105t3.r
    public final String k() {
        return l().k();
    }

    public final r l() {
        ArrayList arrayList = this.f12590h;
        int size = arrayList.size();
        if (size == 1) {
            return (r) arrayList.get(0);
        }
        throw new IllegalStateException(k.r(size, "Array must have size 1, but has size "));
    }
}
