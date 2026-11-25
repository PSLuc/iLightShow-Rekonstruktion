package N;

import P4.AbstractC0336x;
import P4.C0319f;
import android.view.Choreographer;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public final class B implements V {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final B f3554h = new B();
    public static final Choreographer i;

    static {
        W4.d dVar = P4.D.f4604a;
        i = (Choreographer) AbstractC0336x.r(U4.m.f5373a.f4704m, new C0251z(2, null));
    }

    @Override // N.V
    public final Object C(D4.c cVar, p111u4.d dVar) {
        C0319f c0319f = new C0319f(1, AbstractC0473d.F(dVar));
        c0319f.u();
        A a6 = new A(cVar, c0319f);
        i.postFrameCallback(a6);
        c0319f.w(new A2.e(14, a6));
        Object objT = c0319f.t();
        v4.a aVar = v4.a.f13292h;
        return objT;
    }

    @Override // p111u4.i
    public final p111u4.i D(p111u4.h hVar) {
        return S1.h0.t(this, hVar);
    }

    @Override // p111u4.i
    public final p111u4.g J(p111u4.h hVar) {
        return S1.h0.m(this, hVar);
    }

    @Override // p111u4.i
    public final Object T(Object obj, D4.e eVar) {
        return eVar.d(obj, this);
    }

    @Override // p111u4.i
    public final p111u4.i o(p111u4.i iVar) {
        return S1.h0.u(this, iVar);
    }
}
