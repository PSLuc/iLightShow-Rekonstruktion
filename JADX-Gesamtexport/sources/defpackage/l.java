package defpackage;

import p111u4.d;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class l extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f9956k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9957l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f9958m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, d dVar) {
        super(dVar);
        this.f9958m = mVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f9956k = obj;
        this.f9957l |= Integer.MIN_VALUE;
        return this.f9958m.m(null, this);
    }
}
