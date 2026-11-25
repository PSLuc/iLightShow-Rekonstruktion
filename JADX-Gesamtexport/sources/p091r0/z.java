package p091r0;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class z extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ A f11550m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(A a6, d dVar) {
        super(2, dVar);
        this.f11550m = a6;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new z(this.f11550m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((z) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f11549l;
        if (i == 0) {
            V.O(obj);
            A a6 = this.f11550m;
            e eVar = a6.f11466x;
            this.f11549l = 1;
            if (eVar.d(a6, this) == aVar) {
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
