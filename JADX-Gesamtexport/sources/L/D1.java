package L;

import P4.InterfaceC0335w;
import p096s.C0907c;

/* JADX INFO: loaded from: classes.dex */
public final class D1 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2246l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0907c f2247m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f2248n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(C0907c c0907c, float f6, p111u4.d dVar) {
        super(2, dVar);
        this.f2247m = c0907c;
        this.f2248n = f6;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new D1(this.f2247m, this.f2248n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((D1) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f2246l;
        if (i == 0) {
            S1.V.O(obj);
            Float f6 = new Float(this.f2248n);
            p096s.v0 v0Var = J1.f2349f;
            this.f2246l = 1;
            if (C0907c.a(this.f2247m, f6, v0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
        }
        return p084p4.x.f10867a;
    }
}
