package p035g0;

import O1.u;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class O extends AbstractC0712m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9050a;

    public O(long j4) {
        this.f9050a = j4;
    }

    @Override // p035g0.AbstractC0712m
    public final void a(float f6, long j4, u uVar) {
        uVar.l(1.0f);
        long jB = this.f9050a;
        if (f6 != 1.0f) {
            jB = r.b(r.d(jB) * f6, jB);
        }
        uVar.n(jB);
        if (((Shader) uVar.f4535c) != null) {
            uVar.q(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof O) {
            return r.c(this.f9050a, ((O) obj).f9050a);
        }
        return false;
    }

    public final int hashCode() {
        int i = r.f9086m;
        return Long.hashCode(this.f9050a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) r.i(this.f9050a)) + ')';
    }
}
