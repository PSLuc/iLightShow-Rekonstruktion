package p046i2;

import p015c2.h;
import p035g0.C0715p;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends AbstractC0771g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0715p[] f9558k;

    public m(J j4, C0715p c0715p, C0715p[] c0715pArr) {
        super(j4, c0715p);
        this.f9558k = c0715pArr;
    }

    public abstract Class A(int i);

    public abstract Object u();

    public abstract Object v(Object[] objArr);

    public abstract Object w(Object obj);

    public final C0776l x(int i) {
        h hVarZ = z(i);
        C0715p[] c0715pArr = this.f9558k;
        return new C0776l(this, hVarZ, this.i, (c0715pArr == null || i < 0 || i >= c0715pArr.length) ? null : c0715pArr[i], i);
    }

    public abstract int y();

    public abstract h z(int i);
}
