package p092r1;

import H1.d;
import X4.a;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class N extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f11611k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f11612l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11613m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f11614n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11615o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(d dVar, c cVar) {
        super(cVar);
        this.f11614n = dVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f11613m = obj;
        this.f11615o |= Integer.MIN_VALUE;
        return this.f11614n.n(this);
    }
}
