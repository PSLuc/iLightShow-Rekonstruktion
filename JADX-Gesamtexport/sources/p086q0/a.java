package p086q0;

import B.C0031p0;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f11190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0031p0 f11191l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11192m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C0031p0 c0031p0, c cVar) {
        super(cVar);
        this.f11191l = c0031p0;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f11190k = obj;
        this.f11192m |= Integer.MIN_VALUE;
        return this.f11191l.d(0L, 0L, this);
    }
}
