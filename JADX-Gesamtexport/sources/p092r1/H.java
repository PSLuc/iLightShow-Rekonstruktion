package p092r1;

import E4.u;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class H extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u f11583k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11584l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ J f11585m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11586n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(J j4, c cVar) {
        super(cVar);
        this.f11585m = j4;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f11584l = obj;
        this.f11586n |= Integer.MIN_VALUE;
        return this.f11585m.j(null, false, this);
    }
}
