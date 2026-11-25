package p126x2;

import D4.e;
import E4.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class v implements e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Collection f14119h = new ArrayList();

    public final void a(long j4, long j6) {
        Iterator it = this.f14119h.iterator();
        while (it.hasNext()) {
            ((e) it.next()).d(Long.valueOf(j4), Long.valueOf(j6));
        }
    }

    @Override // D4.e
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2) {
        a(((Number) obj).longValue(), ((Number) obj2).longValue());
        return x.f10867a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof v) && k.a(this.f14119h, ((v) obj).f14119h);
        }
        return true;
    }

    public final int hashCode() {
        Collection collection = this.f14119h;
        if (collection != null) {
            return collection.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Progress(handlers=" + this.f14119h + ")";
    }
}
