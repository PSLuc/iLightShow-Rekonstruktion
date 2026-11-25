package p091r0;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import p030f0.c;
import p030f0.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0879a f11504a = new C0879a(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0879a f11505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final StackTraceElement[] f11506c;

    static {
        new C0879a(1007);
        new C0879a(1008);
        f11505b = new C0879a(1002);
        f11506c = new StackTraceElement[0];
    }

    public static final boolean a(q qVar) {
        return !qVar.f11515h && qVar.f11511d;
    }

    public static final boolean b(q qVar) {
        return (qVar.b() || !qVar.f11515h || qVar.f11511d) ? false : true;
    }

    public static final boolean c(q qVar) {
        return qVar.f11515h && !qVar.f11511d;
    }

    public static final boolean d(q qVar, long j4) {
        long j6 = qVar.f11510c;
        float fD = c.d(j6);
        float fE = c.e(j6);
        return fD < 0.0f || fD > ((float) ((int) (j4 >> 32))) || fE < 0.0f || fE > ((float) ((int) (j4 & 4294967295L)));
    }

    public static final boolean e(q qVar, long j4, long j6) {
        if (qVar.i != 1) {
            return d(qVar, j4);
        }
        long j7 = qVar.f11510c;
        float fD = c.d(j7);
        float fE = c.e(j7);
        return fD < (-f.d(j6)) || fD > f.d(j6) + ((float) ((int) (j4 >> 32))) || fE < (-f.b(j6)) || fE > f.b(j6) + ((float) ((int) (j4 & 4294967295L)));
    }

    public static Z.o f(Z.o oVar, C0879a c0879a) {
        return oVar.k(new PointerHoverIconModifierElement(c0879a));
    }

    public static final long g(q qVar, boolean z5) {
        long jG = c.g(qVar.f11510c, qVar.f11514g);
        if (z5 || !qVar.b()) {
            return jG;
        }
        return 0L;
    }
}
