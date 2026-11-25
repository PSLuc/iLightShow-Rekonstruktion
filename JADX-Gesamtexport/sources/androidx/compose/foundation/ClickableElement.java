package androidx.compose.foundation;

import E4.k;
import Z.n;
import p101t.C0954w;
import p101t.D;
import p117w.m;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class ClickableElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f6568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f6569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E0.e f6572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D4.a f6573f;

    public ClickableElement(m mVar, D d6, boolean z5, String str, E0.e eVar, D4.a aVar) {
        this.f6568a = mVar;
        this.f6569b = d6;
        this.f6570c = z5;
        this.f6571d = str;
        this.f6572e = eVar;
        this.f6573f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return k.a(this.f6568a, clickableElement.f6568a) && k.a(this.f6569b, clickableElement.f6569b) && this.f6570c == clickableElement.f6570c && k.a(this.f6571d, clickableElement.f6571d) && k.a(this.f6572e, clickableElement.f6572e) && this.f6573f == clickableElement.f6573f;
    }

    public final int hashCode() {
        m mVar = this.f6568a;
        int iM = p012c.k.m(this.f6570c, (((mVar != null ? mVar.hashCode() : 0) * 31) + (this.f6569b != null ? -1 : 0)) * 31, 31);
        String str = this.f6571d;
        int iHashCode = (iM + (str != null ? str.hashCode() : 0)) * 31;
        E0.e eVar = this.f6572e;
        return this.f6573f.hashCode() + ((iHashCode + (eVar != null ? Integer.hashCode(eVar.f911a) : 0)) * 31);
    }

    @Override // p124x0.Q
    public final n l() {
        return new C0954w(this.f6568a, this.f6569b, this.f6570c, this.f6571d, this.f6572e, this.f6573f);
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        ((C0954w) nVar).F0(this.f6568a, this.f6569b, this.f6570c, this.f6571d, this.f6572e, this.f6573f);
    }
}
