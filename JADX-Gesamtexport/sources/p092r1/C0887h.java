package p092r1;

import H1.d;
import p122w4.c;

/* JADX INFO: renamed from: r1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0887h extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f11652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f11654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11655n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0887h(d dVar, c cVar) {
        super(cVar);
        this.f11654m = dVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f11653l = obj;
        this.f11655n |= Integer.MIN_VALUE;
        return this.f11654m.e(this);
    }
}
