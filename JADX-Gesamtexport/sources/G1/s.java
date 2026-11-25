package G1;

import F.F;
import F1.C0096m;
import N.C0209d0;
import N.InterfaceC0203a0;
import S1.V;
import S4.InterfaceC0368e;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class s extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f1650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f1651n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0209d0 f1652o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f1653p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f1654q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(i iVar, C0209d0 c0209d0, InterfaceC0203a0 interfaceC0203a0, InterfaceC0203a0 interfaceC0203a1, p111u4.d dVar) {
        super(2, dVar);
        this.f1651n = iVar;
        this.f1652o = c0209d0;
        this.f1653p = interfaceC0203a0;
        this.f1654q = interfaceC0203a1;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        s sVar = new s(this.f1651n, this.f1652o, this.f1653p, this.f1654q, dVar);
        sVar.f1650m = obj;
        return sVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((s) b((InterfaceC0368e) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        C0096m c0096m;
        v4.a aVar = v4.a.f13292h;
        int i = this.f1649l;
        i iVar = this.f1651n;
        InterfaceC0203a0 interfaceC0203a0 = this.f1654q;
        try {
            if (i == 0) {
                V.O(obj);
                InterfaceC0368e interfaceC0368e = (InterfaceC0368e) this.f1650m;
                C0209d0 c0209d0 = this.f1652o;
                c0209d0.j(0.0f);
                InterfaceC0203a0 interfaceC0203a1 = this.f1653p;
                C0096m c0096m2 = (C0096m) p089q4.l.h0((List) interfaceC0203a1.getValue());
                E4.k.c(c0096m2);
                iVar.g(c0096m2);
                iVar.g((C0096m) ((List) interfaceC0203a1.getValue()).get(((List) interfaceC0203a1.getValue()).size() - 2));
                F f6 = new F(interfaceC0203a0, 1, c0209d0);
                this.f1650m = c0096m2;
                this.f1649l = 1;
                if (interfaceC0368e.a(f6, this) == aVar) {
                    return aVar;
                }
                c0096m = c0096m2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0096m = (C0096m) this.f1650m;
                V.O(obj);
            }
            interfaceC0203a0.setValue(Boolean.FALSE);
            iVar.e(c0096m, false);
        } catch (CancellationException unused) {
            interfaceC0203a0.setValue(Boolean.FALSE);
        }
        return p084p4.x.f10867a;
    }
}
