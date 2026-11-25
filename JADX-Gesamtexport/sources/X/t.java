package X;

import N.C0208d;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f5723a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f5724b = new Object();

    public static final void a(int i, int i3) {
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i3 + ')');
        }
    }

    public static final int b(int[] iArr, int i) {
        int length = iArr.length - 1;
        int i3 = 0;
        while (i3 <= length) {
            int i6 = (i3 + length) >>> 1;
            int i7 = iArr[i6];
            if (i > i7) {
                i3 = i6 + 1;
            } else {
                if (i >= i7) {
                    return i6;
                }
                length = i6 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static AbstractC0391h d() {
        return (AbstractC0391h) o.f5708a.get();
    }

    public static AbstractC0391h e(AbstractC0391h abstractC0391h) {
        if (abstractC0391h instanceof G) {
            G g6 = (G) abstractC0391h;
            if (g6.f5662t == C0208d.z()) {
                g6.f5660r = null;
                return abstractC0391h;
            }
        }
        if (abstractC0391h instanceof H) {
            H h6 = (H) abstractC0391h;
            if (h6.f5666h == C0208d.z()) {
                h6.f5665g = null;
                return abstractC0391h;
            }
        }
        AbstractC0391h abstractC0391hH = o.h(abstractC0391h, null, false);
        abstractC0391hH.j();
        return abstractC0391hH;
    }

    public static Object f(D4.a aVar, D4.c cVar) {
        AbstractC0391h g6;
        if (cVar == null) {
            return aVar.invoke();
        }
        AbstractC0391h abstractC0391h = (AbstractC0391h) o.f5708a.get();
        if (abstractC0391h instanceof G) {
            G g7 = (G) abstractC0391h;
            if (g7.f5662t == C0208d.z()) {
                D4.c cVar2 = g7.f5660r;
                D4.c cVar3 = g7.f5661s;
                try {
                    ((G) abstractC0391h).f5660r = o.l(cVar, cVar2, true);
                    ((G) abstractC0391h).f5661s = cVar3;
                    return aVar.invoke();
                } finally {
                    g7.f5660r = cVar2;
                    g7.f5661s = cVar3;
                }
            }
        }
        if (abstractC0391h == null || (abstractC0391h instanceof C0387d)) {
            g6 = new G(abstractC0391h instanceof C0387d ? (C0387d) abstractC0391h : null, cVar, null, true, false);
        } else {
            if (cVar == null) {
                return aVar.invoke();
            }
            g6 = abstractC0391h.t(cVar);
        }
        try {
            AbstractC0391h abstractC0391hJ = g6.j();
            try {
                Object objInvoke = aVar.invoke();
                AbstractC0391h.p(abstractC0391hJ);
                g6.c();
                return objInvoke;
            } catch (Throwable th) {
                AbstractC0391h.p(abstractC0391hJ);
                throw th;
            }
        } catch (Throwable th2) {
            g6.c();
            throw th2;
        }
    }

    public static void g(AbstractC0391h abstractC0391h, AbstractC0391h abstractC0391h2, D4.c cVar) {
        if (abstractC0391h != abstractC0391h2) {
            abstractC0391h2.getClass();
            AbstractC0391h.p(abstractC0391h);
            abstractC0391h2.c();
        } else if (abstractC0391h instanceof G) {
            ((G) abstractC0391h).f5660r = cVar;
        } else if (abstractC0391h instanceof H) {
            ((H) abstractC0391h).f5665g = cVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + abstractC0391h).toString());
        }
    }

    public static final void h() {
        throw new UnsupportedOperationException();
    }

    public abstract void c();
}
