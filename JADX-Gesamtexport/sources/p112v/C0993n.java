package p112v;

import D4.e;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p101t.h0;
import p101t.i0;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: v.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0993n extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13031l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0997p f13032m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f13033n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1015y0 f13034o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0993n(C0997p c0997p, int i, C1015y0 c1015y0, d dVar) {
        super(2, dVar);
        this.f13032m = c0997p;
        this.f13033n = i;
        this.f13034o = c1015y0;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new C0993n(this.f13032m, this.f13033n, this.f13034o, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0993n) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f13031l;
        if (i == 0) {
            V.O(obj);
            C0997p c0997p = this.f13032m;
            i0 i0Var = c0997p.f13043c;
            C0995o c0995o = c0997p.f13042b;
            C0991m c0991m = new C0991m(c0997p, this.f13034o, null);
            this.f13031l = 1;
            i0Var.getClass();
            if (AbstractC0336x.d(new h0(this.f13033n, i0Var, c0991m, c0995o, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        return x.f10867a;
    }
}
