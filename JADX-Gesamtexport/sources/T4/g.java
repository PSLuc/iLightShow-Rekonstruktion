package T4;

import S1.V;
import S4.InterfaceC0369f;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f5270n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, p111u4.d dVar) {
        super(2, dVar);
        this.f5270n = hVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        g gVar = new g(this.f5270n, dVar);
        gVar.f5269m = obj;
        return gVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((g) b((InterfaceC0369f) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f5268l;
        if (i == 0) {
            V.O(obj);
            InterfaceC0369f interfaceC0369f = (InterfaceC0369f) this.f5269m;
            this.f5268l = 1;
            if (this.f5270n.h(interfaceC0369f, this) == aVar) {
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
