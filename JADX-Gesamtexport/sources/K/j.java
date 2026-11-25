package K;

import P4.InterfaceC0335w;
import S1.V;
import p096s.AbstractC0909d;
import p096s.AbstractC0931y;
import p096s.C0907c;
import p096s.v0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f1987m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, p111u4.d dVar) {
        super(2, dVar);
        this.f1987m = oVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new j(this.f1987m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((j) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f1986l;
        if (i == 0) {
            V.O(obj);
            C0907c c0907c = this.f1987m.f2003h;
            Float f6 = new Float(1.0f);
            v0 v0VarK = AbstractC0909d.k(225, 2, AbstractC0931y.f12146a);
            this.f1986l = 1;
            if (C0907c.a(c0907c, f6, v0VarK, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        return p084p4.x.f10867a;
    }
}
