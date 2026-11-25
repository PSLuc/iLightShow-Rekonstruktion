package p092r1;

import X4.d;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class P extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f11619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f11620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T f11622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11623o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(T t6, c cVar) {
        super(cVar);
        this.f11622n = t6;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f11621m = obj;
        this.f11623o |= Integer.MIN_VALUE;
        return this.f11622n.b(null, this);
    }
}
