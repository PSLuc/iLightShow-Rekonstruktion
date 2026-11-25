package K;

import P4.InterfaceC0335w;
import S1.V;
import p096s.C0907c;
import p096s.v0;

/* JADX INFO: loaded from: classes.dex */
public final class x extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2027l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f2028m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v0 f2029n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, v0 v0Var, p111u4.d dVar) {
        super(2, dVar);
        this.f2028m = yVar;
        this.f2029n = v0Var;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new x(this.f2028m, this.f2029n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((x) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f2027l;
        if (i == 0) {
            V.O(obj);
            C0907c c0907c = (C0907c) this.f2028m.f2033d;
            Float f6 = new Float(0.0f);
            this.f2027l = 1;
            if (C0907c.a(c0907c, f6, this.f2029n, this) == aVar) {
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
