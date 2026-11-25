package p124x0;

import p081p0.c;
import p113v0.C1027j;
import p113v0.C1032o;
import p113v0.E;
import p113v0.G;
import p113v0.H;

/* JADX INFO: renamed from: x0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1114w extends InterfaceC1104l {
    default int c(M m6, E e6, int i) {
        return e(new C1032o(m6, m6.getLayoutDirection()), new C1027j(e6, 1, 2, 2), c.u(i, 0, 13)).d();
    }

    default int d(M m6, E e6, int i) {
        return e(new C1032o(m6, m6.getLayoutDirection()), new C1027j(e6, 1, 1, 2), c.u(0, i, 7)).f();
    }

    G e(H h6, E e6, long j4);

    default int h(M m6, E e6, int i) {
        return e(new C1032o(m6, m6.getLayoutDirection()), new C1027j(e6, 2, 1, 2), c.u(0, i, 7)).f();
    }

    default int i(M m6, E e6, int i) {
        return e(new C1032o(m6, m6.getLayoutDirection()), new C1027j(e6, 2, 2, 2), c.u(i, 0, 13)).d();
    }
}
