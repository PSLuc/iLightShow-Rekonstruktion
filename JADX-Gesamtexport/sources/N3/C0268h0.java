package N3;

import P4.AbstractC0336x;
import P4.InterfaceC0335w;

/* JADX INFO: renamed from: N3.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0268h0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4182l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K3.a f4183m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D4.a f4184n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0268h0(K3.a aVar, D4.a aVar2, p111u4.d dVar) {
        super(2, dVar);
        this.f4183m = aVar;
        this.f4184n = aVar2;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new C0268h0(this.f4183m, this.f4184n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0268h0) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f4182l;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        S1.V.O(obj);
        do {
            K3.a aVar2 = this.f4183m;
            if (aVar2.getState() == K3.b.f2128h) {
                this.f4184n.invoke();
                return p084p4.x.f10867a;
            }
            aVar2.signup();
            this.f4182l = 1;
        } while (AbstractC0336x.e(1000L, this) != aVar);
        return aVar;
    }
}
