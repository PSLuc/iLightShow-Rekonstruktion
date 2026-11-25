package p112v;

import D4.c;
import E4.l;
import N.C0208d;
import N.C0217h0;
import N.U;
import P4.AbstractC0336x;
import p084p4.x;
import p101t.i0;
import v4.a;

/* JADX INFO: renamed from: v.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0997p implements InterfaceC1003s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f13041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0995o f13042b = new C0995o(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f13043c = new i0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0217h0 f13044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0217h0 f13045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0217h0 f13046f;

    /* JADX WARN: Multi-variable type inference failed */
    public C0997p(c cVar) {
        this.f13041a = (l) cVar;
        Boolean bool = Boolean.FALSE;
        U u6 = U.f3673m;
        this.f13044d = C0208d.K(bool, u6);
        this.f13045e = C0208d.K(bool, u6);
        this.f13046f = C0208d.K(bool, u6);
    }

    @Override // p112v.InterfaceC1003s0
    public final Object b(int i, C1015y0 c1015y0, p122w4.c cVar) {
        Object objD = AbstractC0336x.d(new C0993n(this, i, c1015y0, null), cVar);
        return objD == a.f13292h ? objD : x.f10867a;
    }

    @Override // p112v.InterfaceC1003s0
    public final boolean c() {
        return ((Boolean) this.f13044d.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [D4.c, E4.l] */
    @Override // p112v.InterfaceC1003s0
    public final float e(float f6) {
        return ((Number) this.f13041a.invoke(Float.valueOf(f6))).floatValue();
    }
}
