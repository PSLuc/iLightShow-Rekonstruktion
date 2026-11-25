package K;

import F.F;
import P4.InterfaceC0335w;
import S1.V;
import S4.E;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f1973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p117w.m f1974n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1.b f1975o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p117w.m mVar, C1.b bVar, p111u4.d dVar) {
        super(2, dVar);
        this.f1974n = mVar;
        this.f1975o = bVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        f fVar = new f(this.f1974n, this.f1975o, dVar);
        fVar.f1973m = obj;
        return fVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((f) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        v4.a aVar = v4.a.f13292h;
        int i = this.f1972l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            return p084p4.x.f10867a;
        }
        V.O(obj);
        InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f1973m;
        E e6 = this.f1974n.f13392a;
        F f6 = new F(this.f1975o, 2, interfaceC0335w);
        this.f1972l = 1;
        e6.getClass();
        E.j(e6, f6, this);
        return aVar;
    }
}
