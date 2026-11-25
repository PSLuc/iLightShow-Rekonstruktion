package p015c2;

import T1.d;
import p009b2.f;
import p026e2.a;
import p026e2.g;
import p026e2.j;
import p026e2.n;
import p026e2.o;
import p046i2.I;
import p046i2.r;
import p046i2.s;
import p077o2.l;

/* JADX INFO: loaded from: classes.dex */
public final class C extends o {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f7197t = new f();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f7198u = n.b(D.class);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f7199r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7200s;

    public C(a aVar, l lVar, I i, p109u2.n nVar, g gVar, j jVar) {
        super(aVar, lVar, i, nVar, gVar, jVar);
        this.f7200s = f7198u;
        this.f7199r = f7197t;
    }

    public final o m(long j4) {
        return new C(this, j4, this.f7200s);
    }

    public final void n(Y1.f fVar) {
        int i = D.INDENT_OUTPUT.i;
        int i3 = this.f7200s;
        if ((i & i3) != 0 && fVar.f5181h == null) {
            f fVar2 = this.f7199r;
            if (fVar2 != null) {
                fVar2 = new f(fVar2);
            }
            if (fVar2 != null) {
                fVar.f5181h = fVar2;
            }
        }
        boolean z5 = (D.WRITE_BIGDECIMAL_AS_PLAIN.i & i3) != 0;
        if (z5) {
            int i6 = z5 ? d.WRITE_BIGDECIMAL_AS_PLAIN.i : 0;
            int i7 = i6;
            int i8 = fVar.f5305j;
            int i9 = (i6 & i7) | ((~i7) & i8);
            int i10 = i8 ^ i9;
            if (i10 != 0) {
                fVar.f5305j = i9;
                if ((U1.a.f5304m & i10) != 0) {
                    fVar.f5306k = d.WRITE_NUMBERS_AS_STRINGS.a(i9);
                    d dVar = d.ESCAPE_NON_ASCII;
                    if (dVar.a(i10)) {
                        if (dVar.a(i9)) {
                            fVar.f5815p = 127;
                        } else {
                            fVar.f5815p = 0;
                        }
                    }
                    d dVar2 = d.STRICT_DUPLICATE_DETECTION;
                    if (dVar2.a(i10)) {
                        if (dVar2.a(i9)) {
                            Y1.d dVar3 = fVar.f5307l;
                            if (dVar3.f5831d == null) {
                                dVar3.f5831d = new H1.d(fVar);
                                fVar.f5307l = dVar3;
                            }
                        } else {
                            Y1.d dVar4 = fVar.f5307l;
                            dVar4.f5831d = null;
                            fVar.f5307l = dVar4;
                        }
                    }
                }
                fVar.f5817r = true ^ d.QUOTE_FIELD_NAMES.a(i9);
                fVar.f5818s = d.WRITE_HEX_UPPER_CASE.a(i9);
            }
        }
    }

    public final r o(h hVar) {
        this.i.i.getClass();
        r rVarN = s.n(this, hVar);
        return (rVarN == null && (rVarN = s.m(this, hVar)) == null) ? new r(s.p(this, hVar, this, true)) : rVarN;
    }

    public final boolean p(D d6) {
        return (this.f7200s & d6.i) != 0;
    }

    public C(C c6, long j4, int i) {
        super(c6, j4);
        this.f7200s = i;
        this.f7199r = c6.f7199r;
    }
}
