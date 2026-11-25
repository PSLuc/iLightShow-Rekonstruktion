package V;

import E4.k;
import E4.l;
import N.C0222k;
import N.C0230o;
import N.C0235q0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f5391a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f5392b = new f(0, new long[0], new Object[0]);

    public static final int a(int i, int i3) {
        return i << (((i3 % 10) * 3) + 1);
    }

    public static final a b(C0230o c0230o, int i, l lVar) {
        a aVar;
        c0230o.T(Integer.rotateLeft(i, 1), f5391a);
        Object objK = c0230o.K();
        if (objK == C0222k.f3714a) {
            aVar = new a(i, lVar, true);
            c0230o.f0(aVar);
        } else {
            k.d("null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl", objK);
            aVar = (a) objK;
            aVar.h(lVar);
        }
        c0230o.p(false);
        return aVar;
    }

    public static final a c(int i, p084p4.e eVar, C0230o c0230o) {
        Object objK = c0230o.K();
        if (objK == C0222k.f3714a) {
            objK = new a(i, eVar, true);
            c0230o.f0(objK);
        }
        a aVar = (a) objK;
        aVar.h(eVar);
        return aVar;
    }

    public static final boolean d(C0235q0 c0235q0, C0235q0 c0235q1) {
        if (c0235q0 == null) {
            return true;
        }
        if (c0235q0 instanceof C0235q0) {
            return !c0235q0.b() || c0235q0.equals(c0235q1) || k.a(c0235q0.f3779c, c0235q1.f3779c);
        }
        return false;
    }
}
