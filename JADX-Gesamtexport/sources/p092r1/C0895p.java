package p092r1;

import D.C0052b;
import p111u4.d;
import p122w4.c;

/* JADX INFO: renamed from: r1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0895p extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f11683k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0052b f11685m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0895p(C0052b c0052b, d dVar) {
        super(dVar);
        this.f11685m = c0052b;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f11683k = obj;
        this.f11684l |= Integer.MIN_VALUE;
        return this.f11685m.m(null, this);
    }
}
