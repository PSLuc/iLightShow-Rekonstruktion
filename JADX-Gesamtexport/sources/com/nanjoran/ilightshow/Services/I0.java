package com.nanjoran.ilightshow.Services;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends p122w4.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f8271k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public B3.f f8272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Context f8273m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8274n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f8275o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ P0 f8276p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8277q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(P0 p6, p122w4.c cVar) {
        super(cVar);
        this.f8276p = p6;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f8275o = obj;
        this.f8277q |= Integer.MIN_VALUE;
        return this.f8276p.b(null, false, this);
    }
}
