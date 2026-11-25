package p092r1;

import X4.d;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f11624k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11625l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11626m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T f11627n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11628o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(T t6, c cVar) {
        super(cVar);
        this.f11627n = t6;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f11626m = obj;
        this.f11628o |= Integer.MIN_VALUE;
        return this.f11627n.c(null, this);
    }
}
