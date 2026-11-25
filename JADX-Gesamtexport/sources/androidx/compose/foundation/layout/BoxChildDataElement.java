package androidx.compose.foundation.layout;

import Z.g;
import Z.n;
import p123x.C1080m;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class BoxChildDataElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f6609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6610b;

    public BoxChildDataElement(g gVar, boolean z5) {
        this.f6609a = gVar;
        this.f6610b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && this.f6609a.equals(boxChildDataElement.f6609a) && this.f6610b == boxChildDataElement.f6610b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6610b) + (this.f6609a.hashCode() * 31);
    }

    @Override // p124x0.Q
    public final n l() {
        C1080m c1080m = new C1080m();
        c1080m.f13784u = this.f6609a;
        c1080m.f13785v = this.f6610b;
        return c1080m;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        C1080m c1080m = (C1080m) nVar;
        c1080m.f13784u = this.f6609a;
        c1080m.f13785v = this.f6610b;
    }
}
