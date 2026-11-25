package X;

import N.C0210e;

/* JADX INFO: loaded from: classes.dex */
public abstract class C implements B {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0210e f5649h = new C0210e(0);

    public final boolean d(int i) {
        return (this.f5649h.get() & i) != 0;
    }

    public final void f(int i) {
        C0210e c0210e;
        int i3;
        do {
            c0210e = this.f5649h;
            i3 = c0210e.get();
            if ((i3 & i) != 0) {
                return;
            }
        } while (!c0210e.compareAndSet(i3, i3 | i));
    }
}
