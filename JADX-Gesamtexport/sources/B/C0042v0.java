package B;

import P4.InterfaceC0335w;
import p112v.C1014y;
import p112v.C1016z;

/* JADX INFO: renamed from: B.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0042v0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f460l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p091r0.A f461m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D0 f462n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0042v0(p091r0.A a6, D0 d1, p111u4.d dVar) {
        super(2, dVar);
        this.f461m = a6;
        this.f462n = d1;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new C0042v0(this.f461m, this.f462n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0042v0) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f460l;
        p084p4.x xVar = p084p4.x.f10867a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
            return xVar;
        }
        S1.V.O(obj);
        this.f460l = 1;
        D0 d1 = this.f462n;
        C0046x0 c0046x0 = new C0046x0(d1, 0);
        C0048y0 c0048y0 = new C0048y0(d1, 0);
        C0048y0 c0048y1 = new C0048y0(d1, 1);
        C0003b0 c0003b0 = new C0003b0(1, d1);
        float f6 = p112v.D.f12793a;
        Object objN = p006b.a.n(this.f461m, new p112v.A(C1014y.f13097j, new E4.v(), null, new C1016z(c0046x0, 0), c0003b0, c0048y1, new F.V(c0048y0, 1), null), this);
        if (objN != aVar) {
            objN = xVar;
        }
        if (objN != aVar) {
            objN = xVar;
        }
        if (objN != aVar) {
            objN = xVar;
        }
        return objN == aVar ? aVar : xVar;
    }
}
