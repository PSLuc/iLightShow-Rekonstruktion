package com.nanjoran.ilightshow.Services;

/* JADX INFO: loaded from: classes.dex */
public final class M0 extends p122w4.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public P0 f8340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P0 f8342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8343n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(P0 p6, p122w4.c cVar) {
        super(cVar);
        this.f8342m = p6;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f8341l = obj;
        this.f8343n |= Integer.MIN_VALUE;
        return this.f8342m.d(this);
    }
}
