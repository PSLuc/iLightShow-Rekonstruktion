package com.nanjoran.ilightshow.Services;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends p122w4.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public P0 f8287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public B3.f f8288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Uri.Builder f8289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f8290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f8291o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ P0 f8292p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8293q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(P0 p6, p122w4.c cVar) {
        super(cVar);
        this.f8292p = p6;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f8291o = obj;
        this.f8293q |= Integer.MIN_VALUE;
        return this.f8292p.c(null, this);
    }
}
