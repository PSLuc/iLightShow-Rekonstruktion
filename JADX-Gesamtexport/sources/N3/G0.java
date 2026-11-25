package N3;

import N.InterfaceC0203a0;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F1.I f3957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f3958n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(F1.I i, InterfaceC0203a0 interfaceC0203a0, p111u4.d dVar) {
        super(2, dVar);
        this.f3957m = i;
        this.f3958n = interfaceC0203a0;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new G0(this.f3957m, this.f3958n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((G0) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
        return v4.a.f13292h;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f3956l;
        if (i == 0) {
            S1.V.O(obj);
            com.nanjoran.ilightshow.Services.M.f8305O.l();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
        }
        do {
            InterfaceC0203a0 interfaceC0203a0 = this.f3958n;
            K4.e[] eVarArr = P0.f4082a;
            interfaceC0203a0.setValue(Boolean.valueOf(!((Boolean) interfaceC0203a0.getValue()).booleanValue()));
            this.f3956l = 1;
        } while (AbstractC0336x.e(1000L, this) != aVar);
        return aVar;
    }
}
