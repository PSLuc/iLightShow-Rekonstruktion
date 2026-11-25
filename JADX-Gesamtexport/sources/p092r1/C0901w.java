package p092r1;

import p122w4.c;

/* JADX INFO: renamed from: r1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0901w extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public J f11710k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11711l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11712m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J f11713n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11714o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0901w(J j4, c cVar) {
        super(cVar);
        this.f11713n = j4;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f11712m = obj;
        this.f11714o |= Integer.MIN_VALUE;
        return this.f11713n.h(this);
    }
}
