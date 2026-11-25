package N;

/* JADX INFO: renamed from: N.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0231o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f3770a;

    public AbstractC0231o0(D4.a aVar) {
        this.f3770a = new S(aVar);
    }

    public abstract C0233p0 a(Object obj);

    public Y0 b() {
        return this.f3770a;
    }

    public final Y0 c(C0233p0 c0233p0, Y0 y2) {
        Y0 y6;
        Object obj;
        Object obj2 = null;
        if (!(y2 instanceof H)) {
            if (y2 instanceof X0) {
                boolean z5 = c0233p0.f3772b;
                Object obj3 = c0233p0.f3775e;
                if ((z5 || obj3 != null) && !c0233p0.f3774d) {
                    if (z5) {
                        obj3 = null;
                    } else if (obj3 == null) {
                        C0208d.x("Unexpected form of a provided value");
                        throw null;
                    }
                    X0 x6 = (X0) y2;
                    boolean zA = E4.k.a(obj3, x6.f3678a);
                    y6 = x6;
                    if (!zA) {
                    }
                }
            } else if (y2 instanceof C0249y) {
                c0233p0.getClass();
                ((C0249y) y2).getClass();
            }
            y6 = null;
        } else if (c0233p0.f3774d) {
            H h6 = (H) y2;
            C0217h0 c0217h0 = h6.f3612a;
            if (c0233p0.f3772b) {
                obj = null;
            } else {
                obj = c0233p0.f3775e;
                if (obj == null) {
                    C0208d.x("Unexpected form of a provided value");
                    throw null;
                }
            }
            c0217h0.setValue(obj);
            y6 = h6;
        } else {
            y6 = null;
        }
        if (y6 != null) {
            return y6;
        }
        boolean z6 = c0233p0.f3774d;
        Object obj4 = c0233p0.f3775e;
        if (z6) {
            L0 l6 = c0233p0.f3773c;
            if (l6 == null) {
                l6 = U.f3673m;
            }
            return new H(C0208d.K(obj4, l6));
        }
        if (!c0233p0.f3772b) {
            if (obj4 == null) {
                C0208d.x("Unexpected form of a provided value");
                throw null;
            }
            obj2 = obj4;
        }
        return new X0(obj2);
    }
}
