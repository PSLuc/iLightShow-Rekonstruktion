package L;

import N.C0208d;
import N.C0230o;

/* JADX INFO: loaded from: classes.dex */
public final class O extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Z.o f2427h;
    public final /* synthetic */ float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f2428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2430l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Z.o oVar, float f6, long j4, int i, int i3) {
        super(2);
        this.f2427h = oVar;
        this.i = f6;
        this.f2428j = j4;
        this.f2429k = i;
        this.f2430l = i3;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0208d.V(this.f2429k | 1);
        Z.o oVar = this.f2427h;
        L.c(oVar, this.i, this.f2428j, (C0230o) obj, iV, this.f2430l);
        return p084p4.x.f10867a;
    }
}
