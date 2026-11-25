package p101t;

import p122w4.c;

/* JADX INFO: renamed from: t.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0943k extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0946n f12364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f12365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f12366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0946n f12367n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12368o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0943k(C0946n c0946n, c cVar) {
        super(cVar);
        this.f12367n = c0946n;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f12366m = obj;
        this.f12368o |= Integer.MIN_VALUE;
        return this.f12367n.e(0L, null, this);
    }
}
