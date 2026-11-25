package p112v;

import E4.v;
import p122w4.c;

/* JADX INFO: renamed from: v.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1005t0 extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v f13064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f13065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1017z0 f13066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13067n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005t0(C1017z0 c1017z0, c cVar) {
        super(cVar);
        this.f13066m = c1017z0;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f13065l = obj;
        this.f13067n |= Integer.MIN_VALUE;
        return this.f13066m.b(0L, this);
    }
}
