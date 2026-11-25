package L;

import N.C0208d;
import N.C0230o;

/* JADX INFO: loaded from: classes.dex */
public final class T0 extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2497h;
    public final /* synthetic */ U0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Z.o f2498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ O0 f2499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f2500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2502n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T0(U0 u0, Object obj, Z.o oVar, O0 o6, boolean z5, int i, int i3) {
        super(2);
        this.f2497h = i3;
        this.i = u0;
        this.f2502n = obj;
        this.f2498j = oVar;
        this.f2499k = o6;
        this.f2500l = z5;
        this.f2501m = i;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f2497h) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0208d.V(this.f2501m | 1);
                C0188w1 c0188w1 = (C0188w1) this.f2502n;
                Z.o oVar = this.f2498j;
                this.i.c(c0188w1, oVar, this.f2499k, this.f2500l, (C0230o) obj, iV);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = C0208d.V(this.f2501m | 1);
                A0 a6 = (A0) this.f2502n;
                Z.o oVar2 = this.f2498j;
                this.i.b(a6, oVar2, this.f2499k, this.f2500l, (C0230o) obj, iV2);
                break;
        }
        return p084p4.x.f10867a;
    }
}
