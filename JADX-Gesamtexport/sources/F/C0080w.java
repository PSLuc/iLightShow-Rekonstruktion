package F;

import B.C0025m0;
import B.D0;
import p124x0.AbstractC1098f;

/* JADX INFO: renamed from: F.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0080w extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1224l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f1225m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0025m0 f1226n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ D0 f1227o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0080w(C0025m0 c0025m0, D0 d1, p111u4.d dVar) {
        super(2, dVar);
        this.f1226n = c0025m0;
        this.f1227o = d1;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0080w c0080w = new C0080w(this.f1226n, this.f1227o, dVar);
        c0080w.f1225m = obj;
        return c0080w;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0080w) b((p091r0.A) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f1224l;
        if (i == 0) {
            S1.V.O(obj);
            p091r0.A a6 = (p091r0.A) this.f1225m;
            a6.getClass();
            C0079v c0079v = new C0079v(this.f1226n, new C0068j(AbstractC1098f.s(a6).f13852z), this.f1227o, null);
            this.f1224l = 1;
            if (p006b.a.n(a6, c0079v, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
        }
        return p084p4.x.f10867a;
    }
}
