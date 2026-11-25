package p112v;

import D4.e;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: v.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1015y0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f13100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1017z0 f13101n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i f13102o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1015y0(C1017z0 c1017z0, e eVar, d dVar) {
        super(2, dVar);
        this.f13101n = c1017z0;
        this.f13102o = (i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [D4.e, w4.i] */
    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C1015y0 c1015y0 = new C1015y0(this.f13101n, this.f13102o, dVar);
        c1015y0.f13100m = obj;
        return c1015y0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C1015y0) b((InterfaceC0970b0) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [D4.e, w4.i] */
    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f13099l;
        if (i == 0) {
            V.O(obj);
            InterfaceC0970b0 interfaceC0970b0 = (InterfaceC0970b0) this.f13100m;
            C1017z0 c1017z0 = this.f13101n;
            c1017z0.f13111h = interfaceC0970b0;
            this.f13099l = 1;
            if (this.f13102o.d(c1017z0.i, this) == aVar) {
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
