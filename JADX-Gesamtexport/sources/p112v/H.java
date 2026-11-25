package p112v;

import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class H extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public M f12815k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f12816l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M f12817m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12818n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(M m6, c cVar) {
        super(cVar);
        this.f12817m = m6;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f12816l = obj;
        this.f12818n |= Integer.MIN_VALUE;
        return M.B0(this.f12817m, this);
    }
}
