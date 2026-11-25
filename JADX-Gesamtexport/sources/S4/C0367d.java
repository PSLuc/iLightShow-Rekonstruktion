package S4;

import L.W;

/* JADX INFO: renamed from: S4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0367d implements InterfaceC0368e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC0368e f5071h;

    public C0367d(InterfaceC0368e interfaceC0368e) {
        this.f5071h = interfaceC0368e;
    }

    @Override // S4.InterfaceC0368e
    public final Object a(InterfaceC0369f interfaceC0369f, p111u4.d dVar) {
        E4.w wVar = new E4.w();
        wVar.f1074h = T4.b.f5258b;
        Object objA = this.f5071h.a(new W(this, wVar, interfaceC0369f, 1), dVar);
        return objA == v4.a.f13292h ? objA : p084p4.x.f10867a;
    }
}
