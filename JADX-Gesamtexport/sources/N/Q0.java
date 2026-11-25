package N;

import P4.InterfaceC0335w;
import S4.InterfaceC0368e;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0368e f3654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0229n0 f3655n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(InterfaceC0368e interfaceC0368e, C0229n0 c0229n0, p111u4.d dVar) {
        super(2, dVar);
        this.f3654m = interfaceC0368e;
        this.f3655n = c0229n0;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new Q0(this.f3654m, this.f3655n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((Q0) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f3653l;
        if (i == 0) {
            S1.V.O(obj);
            P0 p6 = new P0(this.f3655n, 1);
            this.f3653l = 1;
            if (this.f3654m.a(p6, this) == aVar) {
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
