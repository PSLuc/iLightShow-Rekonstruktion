package p124x0;

import D4.a;
import E4.l;
import Z.n;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class W extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y f13963h;
    public final /* synthetic */ n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1096d f13964j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f13965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f13966l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f13967m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f13968n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Y y2, n nVar, C1096d c1096d, long j4, r rVar, boolean z5, boolean z6) {
        super(0);
        this.f13963h = y2;
        this.i = nVar;
        this.f13964j = c1096d;
        this.f13965k = j4;
        this.f13966l = rVar;
        this.f13967m = z5;
        this.f13968n = z6;
    }

    @Override // D4.a
    public final Object invoke() {
        this.f13963h.P0(AbstractC1098f.d(this.i, this.f13964j.a()), this.f13964j, this.f13965k, this.f13966l, this.f13967m, this.f13968n);
        return x.f10867a;
    }
}
