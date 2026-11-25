package p113v0;

import Z.m;
import p081p0.c;
import p124x0.M;

/* JADX INFO: loaded from: classes.dex */
public interface r extends m {
    default int c(M m6, E e6, int i) {
        return e(new C1032o(m6, m6.getLayoutDirection()), new C1027j(e6, 1, 2, 1), c.u(i, 0, 13)).d();
    }

    default int d(M m6, E e6, int i) {
        return e(new C1032o(m6, m6.getLayoutDirection()), new C1027j(e6, 1, 1, 1), c.u(0, i, 7)).f();
    }

    G e(H h6, E e6, long j4);

    default int h(M m6, E e6, int i) {
        return e(new C1032o(m6, m6.getLayoutDirection()), new C1027j(e6, 2, 1, 1), c.u(0, i, 7)).f();
    }

    default int i(M m6, E e6, int i) {
        return e(new C1032o(m6, m6.getLayoutDirection()), new C1027j(e6, 2, 2, 1), c.u(i, 0, 13)).d();
    }
}
