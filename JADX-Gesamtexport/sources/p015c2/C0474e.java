package p015c2;

import p026e2.a;
import p026e2.c;
import p026e2.g;
import p026e2.j;
import p026e2.n;
import p026e2.o;
import p046i2.I;
import p046i2.r;
import p046i2.s;
import p077o2.l;
import p087q2.m;

/* JADX INFO: renamed from: c2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0474e extends o {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f7243u = n.b(g.class);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f7244r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f7245s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f7246t;

    public C0474e(a aVar, l lVar, I i, p109u2.n nVar, g gVar, c cVar, j jVar) {
        super(aVar, lVar, i, nVar, gVar, jVar);
        this.f7246t = f7243u;
        this.f7244r = m.f11222h;
        this.f7245s = cVar;
    }

    public final o m(long j4) {
        return new C0474e(this, j4, this.f7246t);
    }

    public final r n(h hVar) {
        this.i.i.getClass();
        r rVarN = s.n(this, hVar);
        return (rVarN == null && (rVarN = s.m(this, hVar)) == null) ? new r(s.p(this, hVar, this, false)) : rVarN;
    }

    public final r o(h hVar) {
        this.i.i.getClass();
        r rVarN = s.n(this, hVar);
        return (rVarN == null && (rVarN = s.m(this, hVar)) == null) ? new r(s.p(this, hVar, this, false)) : rVarN;
    }

    public final boolean p(g gVar) {
        return (this.f7246t & gVar.i) != 0;
    }

    public C0474e(C0474e c0474e, long j4, int i) {
        super(c0474e, j4);
        this.f7246t = i;
        this.f7244r = c0474e.f7244r;
        this.f7245s = c0474e.f7245s;
    }
}
