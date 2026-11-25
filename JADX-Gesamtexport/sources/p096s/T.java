package p096s;

import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class T extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Z f11886k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11887l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f11888m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11889n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(Z z5, c cVar) {
        super(cVar);
        this.f11888m = z5;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f11887l = obj;
        this.f11889n |= Integer.MIN_VALUE;
        return Z.r(this.f11888m, this);
    }
}
