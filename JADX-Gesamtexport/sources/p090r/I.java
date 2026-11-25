package p090r;

import p096s.v0;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f11379a;

    public I(v0 v0Var) {
        this.f11379a = v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i = (I) obj;
        i.getClass();
        return Float.compare(0.0f, 0.0f) == 0 && this.f11379a.equals(i.f11379a);
    }

    public final int hashCode() {
        return this.f11379a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f11379a + ')';
    }
}
