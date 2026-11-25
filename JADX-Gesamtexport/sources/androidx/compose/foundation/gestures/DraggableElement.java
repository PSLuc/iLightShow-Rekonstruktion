package androidx.compose.foundation.gestures;

import D4.f;
import E4.k;
import L.C0188w1;
import Z.n;
import p112v.C0975e;
import p112v.N;
import p112v.T;
import p112v.W;
import p117w.m;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
public final class DraggableElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0188w1 f6591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f6592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f6594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N f6596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f6597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6598h;

    public DraggableElement(C0188w1 c0188w1, W w6, boolean z5, m mVar, boolean z6, N n6, f fVar, boolean z7) {
        this.f6591a = c0188w1;
        this.f6592b = w6;
        this.f6593c = z5;
        this.f6594d = mVar;
        this.f6595e = z6;
        this.f6596f = n6;
        this.f6597g = fVar;
        this.f6598h = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return k.a(this.f6591a, draggableElement.f6591a) && this.f6592b == draggableElement.f6592b && this.f6593c == draggableElement.f6593c && k.a(this.f6594d, draggableElement.f6594d) && this.f6595e == draggableElement.f6595e && k.a(this.f6596f, draggableElement.f6596f) && k.a(this.f6597g, draggableElement.f6597g) && this.f6598h == draggableElement.f6598h;
    }

    public final int hashCode() {
        int iM = p012c.k.m(this.f6593c, (this.f6592b.hashCode() + (this.f6591a.hashCode() * 31)) * 31, 31);
        m mVar = this.f6594d;
        return Boolean.hashCode(this.f6598h) + ((this.f6597g.hashCode() + ((this.f6596f.hashCode() + p012c.k.m(this.f6595e, (iM + (mVar != null ? mVar.hashCode() : 0)) * 31, 31)) * 31)) * 31);
    }

    @Override // p124x0.Q
    public final n l() {
        C0975e c0975e = C0975e.f12968j;
        W w6 = this.f6592b;
        T t6 = new T(c0975e, this.f6593c, this.f6594d, w6);
        t6.f12894E = this.f6591a;
        t6.f12895F = w6;
        t6.G = this.f6595e;
        t6.H = this.f6596f;
        t6.I = this.f6597g;
        t6.J = this.f6598h;
        return t6;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        boolean z5;
        boolean z6;
        T t6 = (T) nVar;
        C0975e c0975e = C0975e.f12968j;
        C0188w1 c0188w1 = t6.f12894E;
        C0188w1 c0188w2 = this.f6591a;
        if (k.a(c0188w1, c0188w2)) {
            z5 = false;
        } else {
            t6.f12894E = c0188w2;
            z5 = true;
        }
        W w6 = t6.f12895F;
        W w7 = this.f6592b;
        if (w6 != w7) {
            t6.f12895F = w7;
            z5 = true;
        }
        boolean z7 = t6.J;
        boolean z8 = this.f6598h;
        if (z7 != z8) {
            t6.J = z8;
            z6 = true;
        } else {
            z6 = z5;
        }
        t6.H = this.f6596f;
        t6.I = this.f6597g;
        t6.G = this.f6595e;
        t6.J0(c0975e, this.f6593c, this.f6594d, w7, z6);
    }
}
