package p112v;

import p117w.b;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class I extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public M f12825k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1002s f12826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f12827m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f12828n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ M f12829o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12830p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(M m6, c cVar) {
        super(cVar);
        this.f12829o = m6;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f12828n = obj;
        this.f12830p |= Integer.MIN_VALUE;
        return M.C0(this.f12829o, null, this);
    }
}
