package p112v;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0968a0 f12873l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(C0968a0 c0968a0, d dVar) {
        super(2, dVar);
        this.f12873l = c0968a0;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new O0(this.f12873l, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        O0 o6 = (O0) b((InterfaceC0335w) obj, (d) obj2);
        x xVar = x.f10867a;
        o6.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        V.O(obj);
        C0968a0 c0968a0 = this.f12873l;
        c0968a0.i = true;
        c0968a0.f12948k.e(null);
        return x.f10867a;
    }
}
