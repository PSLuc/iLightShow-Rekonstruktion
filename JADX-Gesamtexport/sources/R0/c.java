package R0;

import p035g0.AbstractC0712m;
import p035g0.r;

/* JADX INFO: loaded from: classes.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4733a;

    public c(long j4) {
        this.f4733a = j4;
        if (j4 == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    @Override // R0.n
    public final long a() {
        return this.f4733a;
    }

    @Override // R0.n
    public final AbstractC0712m b() {
        return null;
    }

    @Override // R0.n
    public final float c() {
        return r.d(this.f4733a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && r.c(this.f4733a, ((c) obj).f4733a);
    }

    public final int hashCode() {
        int i = r.f9086m;
        return Long.hashCode(this.f4733a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) r.i(this.f4733a)) + ')';
    }
}
