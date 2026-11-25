package p130y0;

import p122w4.c;
import v4.a;

/* JADX INFO: renamed from: y0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1151q extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f14447k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f14448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14449m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1151q(r rVar, c cVar) {
        super(cVar);
        this.f14448l = rVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f14447k = obj;
        this.f14449m |= Integer.MIN_VALUE;
        this.f14448l.E(null, this);
        return a.f13292h;
    }
}
