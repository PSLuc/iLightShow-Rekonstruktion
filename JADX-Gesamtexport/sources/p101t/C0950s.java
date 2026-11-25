package p101t;

import B.C0031p0;
import D4.c;
import E4.l;
import p030f0.a;
import p030f0.f;
import p035g0.C0715p;
import p035g0.O;
import p044i0.b;
import p044i0.d;
import p044i0.h;
import p084p4.x;
import p124x0.F;

/* JADX INFO: renamed from: t.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0950s extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f12410h;
    public final /* synthetic */ O i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f12411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f12412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f12413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f12414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f12415n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f12416o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0950s(boolean z5, O o6, long j4, float f6, float f7, long j6, long j7, h hVar) {
        super(1);
        this.f12410h = z5;
        this.i = o6;
        this.f12411j = j4;
        this.f12412k = f6;
        this.f12413l = f7;
        this.f12414m = j6;
        this.f12415n = j7;
        this.f12416o = hVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        F f6 = (F) obj;
        f6.b();
        if (this.f12410h) {
            d.W(f6, this.i, 0L, 0L, this.f12411j, null, 246);
        } else {
            long j4 = this.f12411j;
            float fB = a.b(j4);
            float f7 = this.f12412k;
            if (fB < f7) {
                float f8 = this.f12413l;
                b bVar = f6.f13862h;
                float fD = f.d(bVar.f());
                float f9 = this.f12413l;
                float f10 = fD - f9;
                float fB2 = f.b(bVar.f()) - f9;
                O o6 = this.i;
                long j6 = this.f12411j;
                C0031p0 c0031p0 = bVar.i;
                long jL = c0031p0.l();
                c0031p0.f().l();
                try {
                    ((C0031p0) ((C0715p) c0031p0.i).i).f().f(f8, f8, f10, fB2, 0);
                    d.W(f6, o6, 0L, 0L, j6, null, 246);
                } finally {
                    c0031p0.f().i();
                    c0031p0.x(jL);
                }
            } else {
                d.W(f6, this.i, this.f12414m, this.f12415n, p081p0.c.B0(f7, j4), this.f12416o, 208);
            }
        }
        return x.f10867a;
    }
}
