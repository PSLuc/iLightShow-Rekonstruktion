package p096s;

import D4.e;
import P4.C0319f;
import P4.InterfaceC0335w;
import S1.V;
import X4.d;
import p084p4.x;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f12092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Z f12093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12094n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f12095o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Z z5, p111u4.d dVar) {
        super(2, dVar);
        this.f12095o = z5;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new r0(this.f12095o, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((r0) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, p4.f] */
    @Override // p122w4.a
    public final Object o(Object obj) {
        Z z5;
        d dVar;
        a aVar = a.f13292h;
        int i = this.f12094n;
        if (i == 0) {
            V.O(obj);
            Z z6 = this.f12095o;
            z6.getClass();
            ((X.x) u0.f12124a.getValue()).c(z6, p0.f12073j, z6.f11921n);
            d dVar2 = z6.f11924q;
            this.f12092l = dVar2;
            this.f12093m = z6;
            this.f12094n = 1;
            if (dVar2.c(this) == aVar) {
                return aVar;
            }
            z5 = z6;
            dVar = dVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z5 = this.f12093m;
            dVar = this.f12092l;
            V.O(obj);
        }
        try {
            z5.f11918k = z5.k();
            C0319f c0319f = z5.f11923p;
            if (c0319f != null) {
                c0319f.g(z5.k());
            }
            z5.f11923p = null;
            return x.f10867a;
        } finally {
            dVar.e(null);
        }
    }
}
