package defpackage;

import p111u4.d;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class p extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f10705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f10707m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, d dVar) {
        super(dVar);
        this.f10707m = mVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f10705k = obj;
        this.f10706l |= Integer.MIN_VALUE;
        return this.f10707m.m(null, this);
    }
}
