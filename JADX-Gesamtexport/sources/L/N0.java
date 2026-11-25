package L;

import N.C0230o;
import kotlin.NoWhenBranchMatchedException;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public abstract class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N.W0 f2415a = new N.W0(E.f2253n);

    public static final p035g0.M a(int i, C0230o c0230o) {
        M0 m6 = (M0) c0230o.k(f2415a);
        switch (AbstractC0916i.d(i)) {
            case 0:
                return m6.f2410e;
            case 1:
                return b(m6.f2410e);
            case 2:
                return m6.f2406a;
            case 3:
                return b(m6.f2406a);
            case 4:
                return A.e.f6a;
            case 5:
                return m6.f2409d;
            case 6:
                A.d dVar = m6.f2409d;
                float f6 = (float) 0.0d;
                return A.d.b(dVar, new A.b(f6), null, new A.b(f6), 6);
            case 7:
                return b(m6.f2409d);
            case 8:
                return m6.f2408c;
            case 9:
                return p035g0.H.f9016a;
            case 10:
                return m6.f2407b;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final A.d b(A.d dVar) {
        float f6 = (float) 0.0d;
        return A.d.b(dVar, null, new A.b(f6), new A.b(f6), 3);
    }
}
