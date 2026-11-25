package com.nanjoran.ilightshow.Services;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0671g0 extends p122w4.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f8394k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8395l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0673h0 f8396m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0671g0(C0673h0 c0673h0, p111u4.d dVar) {
        super(dVar);
        this.f8396m = c0673h0;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f8394k = obj;
        this.f8395l |= Integer.MIN_VALUE;
        return this.f8396m.m(null, this);
    }
}
