package K;

import P4.InterfaceC0335w;
import S1.V;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f1961m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f1962n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p117w.o f1963o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o oVar, c cVar, p117w.o oVar2, p111u4.d dVar) {
        super(2, dVar);
        this.f1961m = oVar;
        this.f1962n = cVar;
        this.f1963o = oVar2;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new b(this.f1961m, this.f1962n, this.f1963o, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((b) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f1960l;
        p117w.o oVar = this.f1963o;
        c cVar = this.f1962n;
        try {
            if (i == 0) {
                V.O(obj);
                o oVar2 = this.f1961m;
                this.f1960l = 1;
                if (oVar2.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V.O(obj);
            }
            cVar.f1967m.remove(oVar);
            return p084p4.x.f10867a;
        } catch (Throwable th) {
            cVar.f1967m.remove(oVar);
            throw th;
        }
    }
}
