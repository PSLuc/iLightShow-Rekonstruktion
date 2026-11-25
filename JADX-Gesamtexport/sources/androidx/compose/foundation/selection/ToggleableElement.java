package androidx.compose.foundation.selection;

import D4.c;
import E0.e;
import E4.k;
import Z.n;
import p096s.AbstractC0916i;
import p117w.m;
import p124x0.AbstractC1098f;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class ToggleableElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f6648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f6650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f6651e;

    public ToggleableElement(boolean z5, m mVar, boolean z6, e eVar, c cVar) {
        this.f6647a = z5;
        this.f6648b = mVar;
        this.f6649c = z6;
        this.f6650d = eVar;
        this.f6651e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f6647a == toggleableElement.f6647a && k.a(this.f6648b, toggleableElement.f6648b) && this.f6649c == toggleableElement.f6649c && this.f6650d.equals(toggleableElement.f6650d) && this.f6651e == toggleableElement.f6651e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f6647a) * 31;
        m mVar = this.f6648b;
        return this.f6651e.hashCode() + AbstractC0916i.c(this.f6650d.f911a, p012c.k.m(this.f6649c, (iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 961, 31), 31);
    }

    @Override // p124x0.Q
    public final n l() {
        e eVar = this.f6650d;
        return new p134z.c(this.f6647a, this.f6648b, this.f6649c, eVar, this.f6651e);
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        p134z.c cVar = (p134z.c) nVar;
        boolean z5 = cVar.f14607O;
        boolean z6 = this.f6647a;
        if (z5 != z6) {
            cVar.f14607O = z6;
            AbstractC1098f.n(cVar);
        }
        cVar.f14608P = this.f6651e;
        cVar.F0(this.f6648b, null, this.f6649c, null, this.f6650d, cVar.f14609Q);
    }
}
