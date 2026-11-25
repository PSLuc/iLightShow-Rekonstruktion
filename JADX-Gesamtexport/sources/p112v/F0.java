package p112v;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0968a0 f12810l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(C0968a0 c0968a0, d dVar) {
        super(2, dVar);
        this.f12810l = c0968a0;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new F0(this.f12810l, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        F0 f6 = (F0) b((InterfaceC0335w) obj, (d) obj2);
        x xVar = x.f10867a;
        f6.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        V.O(obj);
        C0968a0 c0968a0 = this.f12810l;
        c0968a0.f12947j = true;
        c0968a0.f12948k.e(null);
        return x.f10867a;
    }
}
