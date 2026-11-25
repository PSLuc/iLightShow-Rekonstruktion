package T4;

import B.C0047y;
import P4.InterfaceC0335w;
import S1.V;
import S4.InterfaceC0368e;
import S4.InterfaceC0369f;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5281l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5282m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f5283n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0369f f5284o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, InterfaceC0369f interfaceC0369f, p111u4.d dVar) {
        super(2, dVar);
        this.f5283n = mVar;
        this.f5284o = interfaceC0369f;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        l lVar = new l(this.f5283n, this.f5284o, dVar);
        lVar.f5282m = obj;
        return lVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((l) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f5281l;
        if (i == 0) {
            V.O(obj);
            InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f5282m;
            E4.w wVar = new E4.w();
            m mVar = this.f5283n;
            InterfaceC0368e interfaceC0368e = mVar.f5271k;
            C0047y c0047y = new C0047y(wVar, interfaceC0335w, mVar, this.f5284o, 1);
            this.f5281l = 1;
            if (interfaceC0368e.a(c0047y, this) == aVar) {
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
