package G1;

import F1.C0096m;
import N.InterfaceC0203a0;
import P4.InterfaceC0335w;
import S1.V;
import S4.P;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f1632l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f1633m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ X.s f1634n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InterfaceC0203a0 interfaceC0203a0, p pVar, X.s sVar, p111u4.d dVar) {
        super(2, dVar);
        this.f1632l = interfaceC0203a0;
        this.f1633m = pVar;
        this.f1634n = sVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new m(this.f1632l, this.f1633m, this.f1634n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        m mVar = (m) b((InterfaceC0335w) obj, (p111u4.d) obj2);
        p084p4.x xVar = p084p4.x.f10867a;
        mVar.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        V.O(obj);
        for (C0096m c0096m : (Set) this.f1632l.getValue()) {
            p pVar = this.f1633m;
            if (!((List) ((P) pVar.b().f1373e.f5139h).getValue()).contains(c0096m) && !this.f1634n.contains(c0096m)) {
                pVar.b().b(c0096m);
            }
        }
        return p084p4.x.f10867a;
    }
}
