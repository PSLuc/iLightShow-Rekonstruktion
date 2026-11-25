package p090r;

import D4.c;
import E4.l;
import Z.g;
import p096s.v0;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f11433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f11434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f11435c;

    /* JADX WARN: Multi-variable type inference failed */
    public t(g gVar, c cVar, v0 v0Var) {
        this.f11433a = gVar;
        this.f11434b = (l) cVar;
        this.f11435c = v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f11433a.equals(tVar.f11433a) && this.f11434b.equals(tVar.f11434b) && this.f11435c.equals(tVar.f11435c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f11435c.hashCode() + ((this.f11434b.hashCode() + (this.f11433a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f11433a + ", size=" + this.f11434b + ", animationSpec=" + this.f11435c + ", clip=true)";
    }
}
