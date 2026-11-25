package C;

import S1.V;
import p084p4.x;
import p091r0.A;
import p122w4.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f589n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, p111u4.d dVar2) {
        super(2, dVar2);
        this.f589n = dVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        b bVar = new b(this.f589n, dVar);
        bVar.f588m = obj;
        return bVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((b) b((A) obj, (p111u4.d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f587l;
        if (i == 0) {
            V.O(obj);
            A a6 = (A) this.f588m;
            a aVar2 = new a(this.f589n, null);
            this.f587l = 1;
            if (p006b.a.n(a6, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        return x.f10867a;
    }
}
