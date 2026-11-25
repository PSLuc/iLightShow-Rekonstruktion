package S4;

import L.W;

/* JADX INFO: renamed from: S4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0366c extends p122w4.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f5068k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W f5069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5070m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0366c(W w6, p111u4.d dVar) {
        super(dVar);
        this.f5069l = w6;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f5068k = obj;
        this.f5070m |= Integer.MIN_VALUE;
        return this.f5069l.m(null, this);
    }
}
