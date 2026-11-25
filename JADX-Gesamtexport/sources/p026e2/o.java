package p026e2;

import S1.C0355q;
import S1.C0360w;
import S1.EnumC0345g;
import p015c2.r;
import p046i2.C0766b;
import p046i2.I;
import p046i2.L;
import p077o2.l;
import p109u2.i;
import p109u2.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f8718p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f8719q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final I f8720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l f8721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f8722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f8723m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f8724n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j f8725o;

    static {
        long j4 = 0;
        for (r rVar : r.values()) {
            if (rVar.f7317h) {
                j4 |= rVar.i;
            }
        }
        f8718p = j4;
        f8719q = r.AUTO_DETECT_FIELDS.i | r.AUTO_DETECT_GETTERS.i | r.AUTO_DETECT_IS_GETTERS.i | r.AUTO_DETECT_SETTERS.i | r.AUTO_DETECT_CREATORS.i;
    }

    public o(a aVar, l lVar, I i, n nVar, g gVar, j jVar) {
        super(aVar, f8718p);
        this.f8720j = i;
        this.f8721k = lVar;
        this.f8723m = nVar;
        this.f8722l = h.f8699l;
        this.f8724n = gVar;
        this.f8725o = jVar;
    }

    @Override // p046i2.u
    public final Class a(Class cls) {
        return this.f8720j.a(cls);
    }

    @Override // p026e2.n
    public final f e(Class cls) {
        this.f8724n.getClass();
        return f.f8697a;
    }

    @Override // p026e2.n
    public final C0355q f(Class cls) {
        this.f8724n.getClass();
        return C0355q.f4971o;
    }

    @Override // p026e2.n
    public final L g(Class cls, C0766b c0766b) {
        L l6;
        EnumC0345g enumC0345g;
        boolean zU = i.u(cls);
        g gVar = this.f8724n;
        if (zU) {
            l6 = L.f9517n;
        } else {
            gVar.getClass();
            l6 = L.f9516m;
            long j4 = this.f8717h;
            long j6 = f8719q;
            if ((j4 & j6) != j6) {
                boolean zK = k(r.AUTO_DETECT_FIELDS);
                EnumC0345g enumC0345g2 = EnumC0345g.f4937j;
                if (zK) {
                    enumC0345g = enumC0345g2;
                } else {
                    enumC0345g = enumC0345g2;
                    l6 = new L(EnumC0345g.i, EnumC0345g.i, EnumC0345g.f4936h, EnumC0345g.f4936h, enumC0345g2);
                }
                if (!k(r.AUTO_DETECT_GETTERS) && l6.f9518h != enumC0345g) {
                    EnumC0345g enumC0345g3 = enumC0345g;
                    enumC0345g = enumC0345g3;
                    l6 = new L(enumC0345g3, l6.i, l6.f9519j, l6.f9520k, l6.f9521l);
                }
                if (!k(r.AUTO_DETECT_IS_GETTERS) && l6.i != enumC0345g) {
                    l6 = new L(l6.f9518h, enumC0345g, l6.f9519j, l6.f9520k, l6.f9521l);
                }
                if (!k(r.AUTO_DETECT_SETTERS) && l6.f9519j != enumC0345g) {
                    EnumC0345g enumC0345g4 = enumC0345g;
                    enumC0345g = enumC0345g4;
                    l6 = new L(l6.f9518h, l6.i, enumC0345g4, l6.f9520k, l6.f9521l);
                }
                if (!k(r.AUTO_DETECT_CREATORS) && l6.f9520k != enumC0345g) {
                    EnumC0345g enumC0345g5 = enumC0345g;
                    l6 = new L(l6.f9518h, l6.i, l6.f9519j, enumC0345g5, l6.f9521l);
                }
            }
        }
        L lB = d().b(c0766b, l6);
        gVar.getClass();
        return lB;
    }

    public final C0360w l(Class cls, C0766b c0766b) {
        C0360w c0360wH = d().H(c0766b);
        this.f8724n.getClass();
        C0360w c0360w = C0360w.f4978m;
        if (c0360wH == null) {
            return null;
        }
        return c0360wH;
    }

    public o(o oVar, long j4) {
        super(oVar, j4);
        this.f8720j = oVar.f8720j;
        this.f8721k = oVar.f8721k;
        this.f8723m = oVar.f8723m;
        this.f8722l = oVar.f8722l;
        this.f8724n = oVar.f8724n;
        this.f8725o = oVar.f8725o;
    }
}
