package p096s;

import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class X extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Z f11905k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f11906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11907m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f11908n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11909o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Z z5, c cVar) {
        super(cVar);
        this.f11908n = z5;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f11907m = obj;
        this.f11909o |= Integer.MIN_VALUE;
        return Z.s(this.f11908n, this);
    }
}
