package D0;

import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f715l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f716m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Runnable f717n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, Runnable runnable, p111u4.d dVar) {
        super(2, dVar);
        this.f716m = gVar;
        this.f717n = runnable;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new b(this.f716m, this.f717n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((b) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f715l;
        g gVar = this.f716m;
        x xVar = x.f10867a;
        if (i == 0) {
            V.O(obj);
            j jVar = gVar.f741e;
            this.f715l = 1;
            Object objB = jVar.b(0.0f - jVar.f748b, this);
            if (objB != aVar) {
                objB = xVar;
            }
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        l lVar = gVar.f739c;
        lVar.f751a.setValue(Boolean.FALSE);
        this.f717n.run();
        return xVar;
    }
}
