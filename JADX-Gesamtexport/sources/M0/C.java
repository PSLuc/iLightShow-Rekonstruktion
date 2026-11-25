package M0;

import G0.C0110f;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0110f f3392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f3393b;

    public C(C0110f c0110f, q qVar) {
        this.f3392a = c0110f;
        this.f3393b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c6 = (C) obj;
        return E4.k.a(this.f3392a, c6.f3392a) && E4.k.a(this.f3393b, c6.f3393b);
    }

    public final int hashCode() {
        return this.f3393b.hashCode() + (this.f3392a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f3392a) + ", offsetMapping=" + this.f3393b + ')';
    }
}
