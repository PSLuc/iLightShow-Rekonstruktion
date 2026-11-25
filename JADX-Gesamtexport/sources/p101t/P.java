package p101t;

import p117w.i;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class P extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public U f12261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i f12262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f12263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U f12264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12265o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(U u6, c cVar) {
        super(cVar);
        this.f12264n = u6;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f12263m = obj;
        this.f12265o |= Integer.MIN_VALUE;
        return U.y0(this.f12264n, this);
    }
}
