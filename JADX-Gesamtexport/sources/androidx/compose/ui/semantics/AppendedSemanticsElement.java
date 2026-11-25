package androidx.compose.ui.semantics;

import D4.c;
import E0.b;
import E4.k;
import Z.m;
import Z.n;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
public final class AppendedSemanticsElement extends Q implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f6737b;

    public AppendedSemanticsElement(c cVar, boolean z5) {
        this.f6736a = z5;
        this.f6737b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f6736a == appendedSemanticsElement.f6736a && k.a(this.f6737b, appendedSemanticsElement.f6737b);
    }

    public final int hashCode() {
        return this.f6737b.hashCode() + (Boolean.hashCode(this.f6736a) * 31);
    }

    @Override // p124x0.Q
    public final n l() {
        return new b(this.f6736a, false, this.f6737b);
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        b bVar = (b) nVar;
        bVar.f904u = this.f6736a;
        bVar.f906w = this.f6737b;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f6736a + ", properties=" + this.f6737b + ')';
    }
}
