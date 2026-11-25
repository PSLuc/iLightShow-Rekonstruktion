package p103t1;

import h5.G;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f12445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public G f12446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f12447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f12448n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12449o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, c cVar2) {
        super(cVar2);
        this.f12448n = cVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f12447m = obj;
        this.f12449o |= Integer.MIN_VALUE;
        return c.a(this.f12448n, this);
    }
}
