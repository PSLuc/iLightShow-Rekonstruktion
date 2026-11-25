package S4;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class M {
    public final boolean equals(Object obj) {
        if (!(obj instanceof M)) {
            return false;
        }
        ((M) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(0L) * 31);
    }

    public final String toString() {
        p095r4.b bVar = new p095r4.b(2);
        bVar.l();
        bVar.f11783j = true;
        if (bVar.i <= 0) {
            bVar = p095r4.b.f11781k;
        }
        return AbstractC0013g0.m(new StringBuilder("SharingStarted.WhileSubscribed("), p089q4.l.e0(bVar, null, null, null, null, 63), ')');
    }
}
