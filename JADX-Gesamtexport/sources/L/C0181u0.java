package L;

import N.C0208d;
import N.C0230o;

/* JADX INFO: renamed from: L.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0181u0 extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2924h = 0;
    public final /* synthetic */ long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G0.J f2925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ D4.e f2926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2927l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0181u0(long j4, G0.J j6, D4.e eVar, int i) {
        super(2);
        this.i = j4;
        this.f2925j = j6;
        this.f2926k = eVar;
        this.f2927l = i;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f2924h) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0208d.V(this.f2927l | 1);
                G0.J j4 = this.f2925j;
                D4.e eVar = this.f2926k;
                L.f(this.i, j4, eVar, (C0230o) obj, iV);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = C0208d.V(1);
                long j6 = this.i;
                int i = this.f2927l;
                S1.b(j6, this.f2925j, this.f2926k, (C0230o) obj, iV2, i);
                break;
        }
        return p084p4.x.f10867a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0181u0(long j4, G0.J j6, D4.e eVar, int i, int i3) {
        super(2);
        this.i = j4;
        this.f2925j = j6;
        this.f2926k = eVar;
        this.f2927l = i3;
    }
}
