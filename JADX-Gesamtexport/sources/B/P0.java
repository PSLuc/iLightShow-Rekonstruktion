package B;

import N.InterfaceC0203a0;
import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class P0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC0203a0 f204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f205m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f206n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f207o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p117w.m f208p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(InterfaceC0203a0 interfaceC0203a0, boolean z5, p117w.m mVar, p111u4.d dVar) {
        super(2, dVar);
        this.f206n = interfaceC0203a0;
        this.f207o = z5;
        this.f208p = mVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new P0(this.f206n, this.f207o, this.f208p, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((P0) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        InterfaceC0203a0 interfaceC0203a0;
        InterfaceC0203a0 interfaceC0203a1;
        v4.a aVar = v4.a.f13292h;
        int i = this.f205m;
        if (i == 0) {
            S1.V.O(obj);
            interfaceC0203a0 = this.f206n;
            p117w.o oVar = (p117w.o) interfaceC0203a0.getValue();
            if (oVar != null) {
                p117w.l pVar = this.f207o ? new p117w.p(oVar) : new p117w.n(oVar);
                p117w.m mVar = this.f208p;
                if (mVar != null) {
                    this.f204l = interfaceC0203a0;
                    this.f205m = 1;
                    if (mVar.a(pVar, this) == aVar) {
                        return aVar;
                    }
                    interfaceC0203a1 = interfaceC0203a0;
                }
                interfaceC0203a0.setValue(null);
            }
            return p084p4.x.f10867a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC0203a1 = this.f204l;
        S1.V.O(obj);
        interfaceC0203a0 = interfaceC0203a1;
        interfaceC0203a0.setValue(null);
        return p084p4.x.f10867a;
    }
}
