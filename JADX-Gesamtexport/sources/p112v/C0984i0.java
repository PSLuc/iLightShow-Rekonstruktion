package p112v;

import O1.B;
import p122w4.c;

/* JADX INFO: renamed from: v.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0984i0 extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f12991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f12992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B f12993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12994n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0984i0(B b6, c cVar) {
        super(cVar);
        this.f12993m = b6;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f12992l = obj;
        this.f12994n |= Integer.MIN_VALUE;
        return this.f12993m.b(0L, 0L, this);
    }
}
