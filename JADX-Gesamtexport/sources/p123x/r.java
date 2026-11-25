package p123x;

import D4.c;
import E4.l;
import S0.k;
import p084p4.x;
import p113v0.E;
import p113v0.H;
import p113v0.M;
import p113v0.N;

/* JADX INFO: loaded from: classes.dex */
public final class r extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ N f13797h;
    public final /* synthetic */ E i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ H f13798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f13800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1086t f13801m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(N n6, E e6, H h6, int i, int i3, C1086t c1086t) {
        super(1);
        this.f13797h = n6;
        this.i = e6;
        this.f13798j = h6;
        this.f13799k = i;
        this.f13800l = i3;
        this.f13801m = c1086t;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        k layoutDirection = this.f13798j.getLayoutDirection();
        Z.c cVar = this.f13801m.f13807a;
        AbstractC1084q.b((M) obj, this.f13797h, this.i, layoutDirection, this.f13799k, this.f13800l, cVar);
        return x.f10867a;
    }
}
