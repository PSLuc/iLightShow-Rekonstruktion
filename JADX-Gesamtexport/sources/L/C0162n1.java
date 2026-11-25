package L;

import B.C0031p0;
import P4.AbstractC0336x;

/* JADX INFO: renamed from: L.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0162n1 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f2854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ A0 f2855n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p117w.m f2856o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p117w.m f2857p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0162n1(A0 a6, p117w.m mVar, p117w.m mVar2, p111u4.d dVar) {
        super(2, dVar);
        this.f2855n = a6;
        this.f2856o = mVar;
        this.f2857p = mVar2;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0162n1 c0162n1 = new C0162n1(this.f2855n, this.f2856o, this.f2857p, dVar);
        c0162n1.f2854m = obj;
        return c0162n1;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0162n1) b((p091r0.A) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f2853l;
        if (i == 0) {
            S1.V.O(obj);
            p091r0.A a6 = (p091r0.A) this.f2854m;
            A0 a7 = this.f2855n;
            C0159m1 c0159m1 = new C0159m1(a6, a7, new C0031p0(a7, this.f2856o, this.f2857p, 7), null);
            this.f2853l = 1;
            if (AbstractC0336x.d(c0159m1, this) == aVar) {
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
