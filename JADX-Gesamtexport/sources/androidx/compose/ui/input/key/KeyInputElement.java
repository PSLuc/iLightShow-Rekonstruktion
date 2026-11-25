package androidx.compose.ui.input.key;

import D4.c;
import E4.k;
import E4.l;
import Z.n;
import p081p0.e;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class KeyInputElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f6717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f6718b;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(c cVar, c cVar2) {
        this.f6717a = cVar;
        this.f6718b = (l) cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return k.a(this.f6717a, keyInputElement.f6717a) && k.a(this.f6718b, keyInputElement.f6718b);
    }

    public final int hashCode() {
        c cVar = this.f6717a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        l lVar = this.f6718b;
        return iHashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    @Override // p124x0.Q
    public final n l() {
        e eVar = new e();
        eVar.f10833u = this.f6717a;
        eVar.f10834v = this.f6718b;
        return eVar;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        e eVar = (e) nVar;
        eVar.f10833u = this.f6717a;
        eVar.f10834v = this.f6718b;
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f6717a + ", onPreKeyEvent=" + this.f6718b + ')';
    }
}
