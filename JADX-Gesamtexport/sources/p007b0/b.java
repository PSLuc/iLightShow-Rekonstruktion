package p007b0;

import R4.a;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f7024k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f7025l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f7026m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f7027n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7028o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, c cVar2) {
        super(cVar2);
        this.f7027n = cVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f7026m = obj;
        this.f7028o |= Integer.MIN_VALUE;
        return this.f7027n.a(this);
    }
}
