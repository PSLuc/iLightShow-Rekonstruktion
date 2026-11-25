package p026e2;

import S1.A;
import S1.C0355q;
import java.io.Serializable;
import p015c2.B;
import p015c2.h;
import p015c2.r;
import p046i2.C0766b;
import p046i2.L;
import p046i2.s;
import p046i2.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements u, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f8717h;
    public final a i;

    static {
        A a6 = A.f4905l;
        C0355q c0355q = C0355q.f4971o;
    }

    public n(a aVar, long j4) {
        this.i = aVar;
        this.f8717h = j4;
    }

    public static int b(Class cls) {
        int iB = 0;
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            e eVar = (e) obj;
            if (eVar.a()) {
                iB |= eVar.b();
            }
        }
        return iB;
    }

    public final h c(Class cls) {
        return this.i.f8680h.j(cls);
    }

    public final B d() {
        return k(r.USE_ANNOTATIONS) ? this.i.f8681j : p046i2.B.f9474h;
    }

    public abstract f e(Class cls);

    public abstract C0355q f(Class cls);

    public abstract L g(Class cls, C0766b c0766b);

    public final void h() {
        this.i.getClass();
    }

    public final p046i2.r i(h hVar) {
        this.i.i.getClass();
        p046i2.r rVarN = s.n(this, hVar);
        return rVarN == null ? p046i2.r.f(hVar, this, s.o(this, hVar, this)) : rVarN;
    }

    public final p046i2.r j(Class cls) {
        return i(c(cls));
    }

    public final boolean k(r rVar) {
        return (this.f8717h & rVar.i) != 0;
    }

    public n(o oVar, long j4) {
        this.i = oVar.i;
        this.f8717h = j4;
    }
}
