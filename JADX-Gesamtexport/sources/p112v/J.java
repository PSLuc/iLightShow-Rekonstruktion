package p112v;

import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class J extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public M f12837k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1004t f12838l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f12839m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M f12840n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12841o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(M m6, c cVar) {
        super(cVar);
        this.f12840n = m6;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f12839m = obj;
        this.f12841o |= Integer.MIN_VALUE;
        return M.D0(this.f12840n, null, this);
    }
}
