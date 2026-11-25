package N3;

import N.InterfaceC0203a0;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class X extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K3.a f4136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4137n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(K3.a aVar, InterfaceC0203a0 interfaceC0203a0, p111u4.d dVar) {
        super(2, dVar);
        this.f4136m = aVar;
        this.f4137n = interfaceC0203a0;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new X(this.f4136m, this.f4137n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((X) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
        return v4.a.f13292h;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f4135l;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        S1.V.O(obj);
        do {
            this.f4137n.setValue(this.f4136m.getState());
            this.f4135l = 1;
        } while (AbstractC0336x.e(1000L, this) != aVar);
        return aVar;
    }
}
