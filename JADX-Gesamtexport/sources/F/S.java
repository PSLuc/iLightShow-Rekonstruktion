package F;

import B.C0044w0;
import B.D0;
import P4.AbstractC0336x;

/* JADX INFO: loaded from: classes.dex */
public final class S extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f1143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D0 f1144n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(D0 d1, p111u4.d dVar) {
        super(2, dVar);
        this.f1144n = d1;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        S s6 = new S(this.f1144n, dVar);
        s6.f1143m = obj;
        return s6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((S) b((p091r0.A) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        v4.a aVar = v4.a.f13292h;
        int i = this.f1142l;
        p084p4.x xVar = p084p4.x.f10867a;
        if (i == 0) {
            S1.V.O(obj);
            p091r0.A a6 = (p091r0.A) this.f1143m;
            this.f1142l = 1;
            Object objD = AbstractC0336x.d(new C0044w0(a6, this.f1144n, null), this);
            if (objD != aVar) {
                objD = xVar;
            }
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
        }
        return xVar;
    }
}
