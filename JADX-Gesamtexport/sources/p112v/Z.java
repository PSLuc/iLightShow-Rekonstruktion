package p112v;

import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0968a0 f12939k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f12940l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0968a0 f12941m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12942n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C0968a0 c0968a0, c cVar) {
        super(cVar);
        this.f12941m = c0968a0;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f12940l = obj;
        this.f12942n |= Integer.MIN_VALUE;
        return this.f12941m.d(this);
    }
}
