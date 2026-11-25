package p112v;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class D0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12794l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0968a0 f12795m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(C0968a0 c0968a0, d dVar) {
        super(2, dVar);
        this.f12795m = c0968a0;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new D0(this.f12795m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((D0) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12794l;
        if (i == 0) {
            V.O(obj);
            this.f12794l = 1;
            if (this.f12795m.c(this) == aVar) {
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
