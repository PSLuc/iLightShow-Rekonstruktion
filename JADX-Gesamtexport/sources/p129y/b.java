package p129y;

import p030f0.d;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f14147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object[] f14148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14150n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f14151o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c f14152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14153q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, c cVar2) {
        super(cVar2);
        this.f14152p = cVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f14151o = obj;
        this.f14153q |= Integer.MIN_VALUE;
        return this.f14152p.a(null, this);
    }
}
