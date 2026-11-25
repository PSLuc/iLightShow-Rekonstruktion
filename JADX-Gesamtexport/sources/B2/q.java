package B2;

import p126x2.w;

/* JADX INFO: loaded from: classes.dex */
public final class q extends p122w4.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f532m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public r f533n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f534o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, p122w4.c cVar) {
        super(cVar);
        this.f532m = rVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f530k = obj;
        this.f531l |= Integer.MIN_VALUE;
        return this.f532m.B(null, this);
    }
}
