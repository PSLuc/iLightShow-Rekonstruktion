package p090r;

import B.C0026n;
import D4.c;
import E4.l;
import S0.h;
import S1.h0;
import p035g0.O;
import p044i0.d;
import p044i0.e;
import p084p4.x;
import p113v0.M;
import p113v0.N;
import p124x0.F;

/* JADX INFO: loaded from: classes.dex */
public final class C extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11355h;
    public final /* synthetic */ long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f11356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f11357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f11358l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(Object obj, long j4, long j6, Object obj2, int i) {
        super(1);
        this.f11355h = i;
        this.f11357k = obj;
        this.i = j4;
        this.f11356j = j6;
        this.f11358l = obj2;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f11355h) {
            case 0:
                M m6 = (M) obj;
                long j4 = this.i;
                long j6 = this.f11356j;
                C0026n c0026n = (C0026n) this.f11358l;
                N n6 = (N) this.f11357k;
                m6.getClass();
                long jC = h0.c(((int) (j4 >> 32)) + ((int) (j6 >> 32)), ((int) (j4 & 4294967295L)) + ((int) (j6 & 4294967295L)));
                M.a(m6, n6);
                n6.h0(h.c(jC, n6.f13140l), 0.0f, c0026n);
                break;
            default:
                F f6 = (F) obj;
                f6.b();
                d.q(f6, (O) this.f11357k, this.i, this.f11356j, 0.0f, (e) this.f11358l, 104);
                break;
        }
        return x.f10867a;
    }
}
