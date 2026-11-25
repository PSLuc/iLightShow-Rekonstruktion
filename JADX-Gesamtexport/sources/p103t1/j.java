package p103t1;

import h5.F;
import h5.x;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class j extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x f12480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x f12481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public F f12482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f12483n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f12484o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12485p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, c cVar) {
        super(cVar);
        this.f12484o = kVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f12483n = obj;
        this.f12485p |= Integer.MIN_VALUE;
        return this.f12484o.b(null, this);
    }
}
