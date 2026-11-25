package p124x0;

import D4.a;
import E4.l;
import Z.n;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class X extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13969h;
    public final /* synthetic */ Y i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f13970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1096d f13971k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f13972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f13973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f13974n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f13975o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f13976p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(Y y2, n nVar, C1096d c1096d, long j4, r rVar, boolean z5, boolean z6, float f6, int i) {
        super(0);
        this.f13969h = i;
        this.i = y2;
        this.f13970j = nVar;
        this.f13971k = c1096d;
        this.f13972l = j4;
        this.f13973m = rVar;
        this.f13974n = z5;
        this.f13975o = z6;
        this.f13976p = f6;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f13969h) {
            case 0:
                n nVarD = AbstractC1098f.d(this.f13970j, this.f13971k.a());
                boolean z5 = this.f13975o;
                Y y2 = this.i;
                C1096d c1096d = this.f13971k;
                long j4 = this.f13972l;
                r rVar = this.f13973m;
                boolean z6 = this.f13974n;
                if (nVarD == null) {
                    y2.R0(c1096d, j4, rVar, z6, z5);
                } else {
                    y2.getClass();
                    float f6 = this.f13976p;
                    rVar.g(nVarD, f6, z5, new X(y2, nVarD, c1096d, j4, rVar, z6, z5, f6, 0));
                }
                break;
            default:
                this.i.c1(AbstractC1098f.d(this.f13970j, this.f13971k.a()), this.f13971k, this.f13972l, this.f13973m, this.f13974n, this.f13975o, this.f13976p);
                break;
        }
        return x.f10867a;
    }
}
