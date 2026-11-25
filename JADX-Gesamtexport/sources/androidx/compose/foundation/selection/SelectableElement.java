package androidx.compose.foundation.selection;

import E0.e;
import E4.k;
import Z.n;
import p096s.AbstractC0916i;
import p101t.D;
import p117w.m;
import p124x0.AbstractC1098f;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class SelectableElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f6642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D f6643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f6645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D4.a f6646f;

    public SelectableElement(boolean z5, m mVar, D d6, boolean z6, e eVar, D4.a aVar) {
        this.f6641a = z5;
        this.f6642b = mVar;
        this.f6643c = d6;
        this.f6644d = z6;
        this.f6645e = eVar;
        this.f6646f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f6641a == selectableElement.f6641a && k.a(this.f6642b, selectableElement.f6642b) && k.a(this.f6643c, selectableElement.f6643c) && this.f6644d == selectableElement.f6644d && this.f6645e.equals(selectableElement.f6645e) && this.f6646f == selectableElement.f6646f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f6641a) * 31;
        m mVar = this.f6642b;
        return this.f6646f.hashCode() + AbstractC0916i.c(this.f6645e.f911a, p012c.k.m(this.f6644d, (((iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 31) + (this.f6643c != null ? -1 : 0)) * 31, 31), 31);
    }

    @Override // p124x0.Q
    public final n l() {
        e eVar = this.f6645e;
        p134z.b bVar = new p134z.b(this.f6642b, this.f6643c, this.f6644d, null, eVar, this.f6646f);
        bVar.f14606O = this.f6641a;
        return bVar;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        p134z.b bVar = (p134z.b) nVar;
        boolean z5 = bVar.f14606O;
        boolean z6 = this.f6641a;
        if (z5 != z6) {
            bVar.f14606O = z6;
            AbstractC1098f.n(bVar);
        }
        e eVar = this.f6645e;
        bVar.F0(this.f6642b, this.f6643c, this.f6644d, null, eVar, this.f6646f);
    }
}
