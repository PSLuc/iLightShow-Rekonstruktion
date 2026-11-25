package p101t;

import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public U f12266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f12267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ U f12268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12269n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(U u6, c cVar) {
        super(cVar);
        this.f12268m = u6;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f12267l = obj;
        this.f12269n |= Integer.MIN_VALUE;
        return U.z0(this.f12268m, this);
    }
}
