package p092r1;

import D4.e;
import E4.k;
import S1.h0;
import p111u4.g;
import p111u4.h;
import p111u4.i;

/* JADX INFO: loaded from: classes.dex */
public final class X implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final X f11635h;
    public final J i;

    public X(X x6, J j4) {
        k.f("instance", j4);
        this.f11635h = x6;
        this.i = j4;
    }

    @Override // p111u4.i
    public final i D(h hVar) {
        return h0.t(this, hVar);
    }

    @Override // p111u4.i
    public final g J(h hVar) {
        return h0.m(this, hVar);
    }

    @Override // p111u4.i
    public final Object T(Object obj, e eVar) {
        return eVar.d(obj, this);
    }

    public final void a(J j4) {
        if (this.i == j4) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        X x6 = this.f11635h;
        if (x6 != null) {
            x6.a(j4);
        }
    }

    @Override // p111u4.g
    public final h getKey() {
        return W.f11634h;
    }

    @Override // p111u4.i
    public final i o(i iVar) {
        return h0.u(this, iVar);
    }
}
