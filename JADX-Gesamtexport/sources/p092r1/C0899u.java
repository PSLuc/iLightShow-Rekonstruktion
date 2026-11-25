package p092r1;

import X4.d;
import p122w4.c;

/* JADX INFO: renamed from: r1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0899u extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public J f11703k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f11704l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11705m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J f11706n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11707o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0899u(J j4, c cVar) {
        super(cVar);
        this.f11706n = j4;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f11705m = obj;
        this.f11707o |= Integer.MIN_VALUE;
        return J.d(this.f11706n, this);
    }
}
