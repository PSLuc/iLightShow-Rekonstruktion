package H0;

import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1704c;

    public m(boolean z5, int i, int i3) {
        this.f1702a = i;
        this.f1703b = i3;
        this.f1704c = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f1702a == mVar.f1702a && this.f1703b == mVar.f1703b && this.f1704c == mVar.f1704c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1704c) + AbstractC0916i.c(this.f1703b, Integer.hashCode(this.f1702a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f1702a + ", end=" + this.f1703b + ", isRtl=" + this.f1704c + ')';
    }
}
