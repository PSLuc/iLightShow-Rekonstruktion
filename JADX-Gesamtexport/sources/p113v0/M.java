package p113v0;

import D4.c;
import S0.h;
import S0.k;
import S1.h0;
import p124x0.S;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13136a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(M m6, N n6) {
        m6.getClass();
        if (n6 instanceof S) {
            ((S) n6).O(m6.f13136a);
        }
    }

    public static void d(M m6, N n6, int i, int i3) {
        m6.getClass();
        long jC = h0.c(i, i3);
        a(m6, n6);
        n6.h0(h.c(jC, n6.f13140l), 0.0f, null);
    }

    public static void e(M m6, N n6, long j4) {
        m6.getClass();
        a(m6, n6);
        n6.h0(h.c(j4, n6.f13140l), 0.0f, null);
    }

    public static void f(M m6, N n6, int i, int i3) {
        long jC = h0.c(i, i3);
        if (m6.b() == k.f4897h || m6.c() == 0) {
            a(m6, n6);
            n6.h0(h.c(jC, n6.f13140l), 0.0f, null);
        } else {
            long jC2 = h0.c((m6.c() - n6.f13137h) - ((int) (jC >> 32)), (int) (jC & 4294967295L));
            a(m6, n6);
            n6.h0(h.c(jC2, n6.f13140l), 0.0f, null);
        }
    }

    public static void g(M m6, N n6, int i, int i3) {
        int i6 = P.f13144b;
        O o6 = O.i;
        long jC = h0.c(i, i3);
        if (m6.b() == k.f4897h || m6.c() == 0) {
            a(m6, n6);
            n6.h0(h.c(jC, n6.f13140l), 0.0f, o6);
        } else {
            long jC2 = h0.c((m6.c() - n6.f13137h) - ((int) (jC >> 32)), (int) (jC & 4294967295L));
            a(m6, n6);
            n6.h0(h.c(jC2, n6.f13140l), 0.0f, o6);
        }
    }

    public static void h(M m6, N n6, int i, int i3, c cVar, int i6) {
        if ((i6 & 8) != 0) {
            int i7 = P.f13144b;
            cVar = O.i;
        }
        m6.getClass();
        long jC = h0.c(i, i3);
        a(m6, n6);
        n6.h0(h.c(jC, n6.f13140l), 0.0f, cVar);
    }

    public abstract k b();

    public abstract int c();
}
