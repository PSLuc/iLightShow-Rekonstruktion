package F;

import B.C0043w;
import N.T0;
import N.V0;
import P4.InterfaceC0335w;
import p096s.C0907c;

/* JADX INFO: loaded from: classes.dex */
public final class G extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f1093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V0 f1094n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0907c f1095o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(V0 v6, C0907c c0907c, p111u4.d dVar) {
        super(2, dVar);
        this.f1094n = v6;
        this.f1095o = c0907c;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        G g6 = new G(this.f1094n, this.f1095o, dVar);
        g6.f1093m = obj;
        return g6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((G) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f1092l;
        if (i == 0) {
            S1.V.O(obj);
            InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f1093m;
            S4.A a6 = new S4.A(new T0(new C0043w(12, this.f1094n), null));
            F f6 = new F(this.f1095o, 0, interfaceC0335w);
            this.f1092l = 1;
            if (a6.a(f6, this) == aVar) {
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
