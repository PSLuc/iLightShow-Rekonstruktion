package L;

import p096s.AbstractC0931y;
import p096s.C0907c;
import p096s.C0927u;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p096s.v0 f2480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p096s.v0 f2481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p096s.v0 f2482c;

    static {
        C0927u c0927u = new C0927u(0.4f, 0.0f, 0.6f, 1.0f);
        f2480a = new p096s.v0(120, AbstractC0931y.f12146a, 2);
        f2481b = new p096s.v0(150, c0927u, 2);
        f2482c = new p096s.v0(120, c0927u, 2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
  0x0009: PHI (r1v1 s.v0) = (r1v0 s.v0), (r1v0 s.v0), (r1v0 s.v0), (r1v2 s.v0), (r1v2 s.v0), (r1v2 s.v0), (r1v2 s.v0) binds: [B:18:0x0020, B:21:0x0025, B:27:0x0031, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object a(C0907c c0907c, float f6, p117w.l lVar, p117w.l lVar2, p122w4.c cVar) {
        p096s.v0 v0Var;
        p096s.v0 v0Var2 = null;
        if (lVar2 != null) {
            boolean z5 = lVar2 instanceof p117w.o;
            v0Var = f2480a;
            if (z5 || (lVar2 instanceof p117w.b) || (lVar2 instanceof p117w.i) || (lVar2 instanceof p117w.e)) {
                v0Var2 = v0Var;
            }
        } else if (lVar != null) {
            boolean z6 = lVar instanceof p117w.o;
            v0Var = f2481b;
            if (z6 || (lVar instanceof p117w.b)) {
                v0Var2 = v0Var;
            } else if (lVar instanceof p117w.i) {
                v0Var2 = f2482c;
            } else if (lVar instanceof p117w.e) {
                v0Var2 = v0Var;
            }
        }
        p084p4.x xVar = p084p4.x.f10867a;
        if (v0Var2 != null) {
            Object objA = C0907c.a(c0907c, new S0.e(f6), v0Var2, cVar);
            if (objA == v4.a.f13292h) {
                return objA;
            }
        } else {
            Object objD = c0907c.d(new S0.e(f6), cVar);
            if (objD == v4.a.f13292h) {
                return objD;
            }
        }
        return xVar;
    }
}
