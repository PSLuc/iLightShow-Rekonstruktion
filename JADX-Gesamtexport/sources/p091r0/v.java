package p091r0;

import P4.i0;
import p122w4.a;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class v extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i0 f11535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11536l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f11537m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11538n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, a aVar) {
        super(aVar);
        this.f11537m = yVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f11536l = obj;
        this.f11538n |= Integer.MIN_VALUE;
        return this.f11537m.j(0L, null, this);
    }
}
