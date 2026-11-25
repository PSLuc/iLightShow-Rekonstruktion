package F;

import p096s.AbstractC0916i;

/* JADX INFO: renamed from: F.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0072n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R0.h f1193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1195c;

    public C0072n(R0.h hVar, int i, long j4) {
        this.f1193a = hVar;
        this.f1194b = i;
        this.f1195c = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0072n)) {
            return false;
        }
        C0072n c0072n = (C0072n) obj;
        return this.f1193a == c0072n.f1193a && this.f1194b == c0072n.f1194b && this.f1195c == c0072n.f1195c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1195c) + AbstractC0916i.c(this.f1194b, this.f1193a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f1193a + ", offset=" + this.f1194b + ", selectableId=" + this.f1195c + ')';
    }
}
