package E;

import G0.C0110f;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0110f f869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0110f f870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f871c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f872d = null;

    public f(C0110f c0110f, C0110f c0110f2) {
        this.f869a = c0110f;
        this.f870b = c0110f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return E4.k.a(this.f869a, fVar.f869a) && E4.k.a(this.f870b, fVar.f870b) && this.f871c == fVar.f871c && E4.k.a(this.f872d, fVar.f872d);
    }

    public final int hashCode() {
        int iM = p012c.k.m(this.f871c, (this.f870b.hashCode() + (this.f869a.hashCode() * 31)) * 31, 31);
        d dVar = this.f872d;
        return iM + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f869a) + ", substitution=" + ((Object) this.f870b) + ", isShowingSubstitution=" + this.f871c + ", layoutCache=" + this.f872d + ')';
    }
}
