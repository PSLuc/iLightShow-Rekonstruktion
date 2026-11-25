package p092r1;

import X4.d;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class r extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public J f11690k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f11691l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11692m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J f11693n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11694o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(J j4, c cVar) {
        super(cVar);
        this.f11693n = j4;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f11692m = obj;
        this.f11694o |= Integer.MIN_VALUE;
        return J.b(this.f11693n, this);
    }
}
