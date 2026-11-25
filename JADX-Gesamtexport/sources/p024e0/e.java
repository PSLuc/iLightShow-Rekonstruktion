package p024e0;

import B.L0;
import p012c.C;
import p080p.A;
import p080p.D;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L0 f8642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f8643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f8644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f8645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final A f8646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A f8647f;

    public e(L0 l6, C c6) {
        this.f8642a = l6;
        this.f8643b = c6;
        int i = D.f10715a;
        this.f8644c = new A();
        this.f8645d = new A();
        this.f8646e = new A();
        this.f8647f = new A();
    }

    public final boolean a() {
        return this.f8644c.h() || this.f8646e.h() || this.f8645d.h();
    }

    public final void b(A a6, Object obj) {
        if (a6.a(obj) && this.f8644c.f10711d + this.f8645d.f10711d + this.f8646e.f10711d == 1) {
            this.f8642a.invoke(new C(0, this, e.class, "invalidateNodes", "invalidateNodes()V", 0, 2));
        }
    }
}
