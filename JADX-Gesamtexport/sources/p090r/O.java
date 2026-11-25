package p090r;

import D4.c;
import E4.l;
import p096s.v0;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f11387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f11388b;

    /* JADX WARN: Multi-variable type inference failed */
    public O(c cVar, v0 v0Var) {
        this.f11387a = (l) cVar;
        this.f11388b = v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o6 = (O) obj;
        return this.f11387a.equals(o6.f11387a) && this.f11388b.equals(o6.f11388b);
    }

    public final int hashCode() {
        return this.f11388b.hashCode() + (this.f11387a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f11387a + ", animationSpec=" + this.f11388b + ')';
    }
}
