package androidx.compose.foundation.layout;

import D4.e;
import E4.l;
import Z.n;
import p012c.k;
import p096s.AbstractC0916i;
import p123x.f0;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class WrapContentElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f6631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6632c;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(int i, e eVar, Object obj) {
        this.f6630a = i;
        this.f6631b = (l) eVar;
        this.f6632c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f6630a == wrapContentElement.f6630a && this.f6632c.equals(wrapContentElement.f6632c);
    }

    public final int hashCode() {
        return this.f6632c.hashCode() + k.m(false, AbstractC0916i.d(this.f6630a) * 31, 31);
    }

    @Override // p124x0.Q
    public final n l() {
        f0 f0Var = new f0();
        f0Var.f13772u = this.f6630a;
        f0Var.f13773v = this.f6631b;
        return f0Var;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        f0 f0Var = (f0) nVar;
        f0Var.f13772u = this.f6630a;
        f0Var.f13773v = this.f6631b;
    }
}
