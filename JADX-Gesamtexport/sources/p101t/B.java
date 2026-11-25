package p101t;

import B.C0047y;
import D4.e;
import E4.u;
import P4.InterfaceC0335w;
import S1.V;
import S4.E;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class B extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C f12222m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C c6, d dVar) {
        super(2, dVar);
        this.f12222m = c6;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new B(this.f12222m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((B) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        a aVar = a.f13292h;
        int i = this.f12221l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            return x.f10867a;
        }
        V.O(obj);
        u uVar = new u();
        u uVar2 = new u();
        u uVar3 = new u();
        C c6 = this.f12222m;
        E e6 = c6.f12223u.f13392a;
        C0047y c0047y = new C0047y(uVar, uVar2, uVar3, c6, 2);
        this.f12221l = 1;
        e6.getClass();
        E.j(e6, c0047y, this);
        return aVar;
    }
}
