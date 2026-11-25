package p096s;

import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Z f11910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f11911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11912m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f11913n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11914o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Z z5, c cVar) {
        super(cVar);
        this.f11913n = z5;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f11912m = obj;
        this.f11914o |= Integer.MIN_VALUE;
        return Z.t(this.f11913n, this);
    }
}
