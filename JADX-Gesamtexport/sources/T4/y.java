package T4;

import S1.V;
import S4.InterfaceC0369f;

/* JADX INFO: loaded from: classes.dex */
public final class y extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0369f f5301n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(InterfaceC0369f interfaceC0369f, p111u4.d dVar) {
        super(2, dVar);
        this.f5301n = interfaceC0369f;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        y yVar = new y(this.f5301n, dVar);
        yVar.f5300m = obj;
        return yVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((y) b(obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f5299l;
        if (i == 0) {
            V.O(obj);
            Object obj2 = this.f5300m;
            this.f5299l = 1;
            if (this.f5301n.m(obj2, this) == aVar) {
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
