package R0;

import com.fasterxml.jackson.databind.deser.std.d0;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f4756c = new p(d0.q(0), d0.q(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4758b;

    public p(long j4, long j6) {
        this.f4757a = j4;
        this.f4758b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return S0.m.a(this.f4757a, pVar.f4757a) && S0.m.a(this.f4758b, pVar.f4758b);
    }

    public final int hashCode() {
        S0.n[] nVarArr = S0.m.f4900b;
        return Long.hashCode(this.f4758b) + (Long.hashCode(this.f4757a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) S0.m.d(this.f4757a)) + ", restLine=" + ((Object) S0.m.d(this.f4758b)) + ')';
    }
}
