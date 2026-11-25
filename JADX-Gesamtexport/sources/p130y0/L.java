package p130y0;

import p122w4.c;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class L extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f14267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f14268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14269m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(N n6, c cVar) {
        super(cVar);
        this.f14268l = n6;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f14267k = obj;
        this.f14269m |= Integer.MIN_VALUE;
        this.f14268l.a(null, this);
        return a.f13292h;
    }
}
