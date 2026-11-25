package G1;

import F1.C0096m;
import N.C0209d0;
import N.InterfaceC0203a0;
import P4.InterfaceC0335w;
import S1.V;
import java.util.List;
import p096s.Z;

/* JADX INFO: loaded from: classes.dex */
public final class u extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f1657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f1658n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0209d0 f1659o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Z z5, InterfaceC0203a0 interfaceC0203a0, C0209d0 c0209d0, p111u4.d dVar) {
        super(2, dVar);
        this.f1657m = z5;
        this.f1658n = interfaceC0203a0;
        this.f1659o = c0209d0;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new u(this.f1657m, this.f1658n, this.f1659o, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((u) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f1656l;
        if (i == 0) {
            V.O(obj);
            InterfaceC0203a0 interfaceC0203a0 = this.f1658n;
            C0096m c0096m = (C0096m) ((List) interfaceC0203a0.getValue()).get(((List) interfaceC0203a0.getValue()).size() - 2);
            float fH = this.f1659o.h();
            this.f1656l = 1;
            if (this.f1657m.w(fH, c0096m, this) == aVar) {
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
