package p086q0;

import B.C0031p0;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f11193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0031p0 f11194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11195m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C0031p0 c0031p0, c cVar) {
        super(cVar);
        this.f11194l = c0031p0;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f11193k = obj;
        this.f11195m |= Integer.MIN_VALUE;
        return this.f11194l.e(0L, this);
    }
}
