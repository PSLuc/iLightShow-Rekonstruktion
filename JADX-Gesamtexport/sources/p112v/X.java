package p112v;

import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class X extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f12927k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0968a0 f12928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12929m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(C0968a0 c0968a0, c cVar) {
        super(cVar);
        this.f12928l = c0968a0;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f12927k = obj;
        this.f12929m |= Integer.MIN_VALUE;
        return this.f12928l.b(this);
    }
}
