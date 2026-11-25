package L;

import B.C0031p0;
import P4.InterfaceC0335w;

/* JADX INFO: renamed from: L.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0153k1 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0031p0 f2813m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E4.s f2814n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p117w.d f2815o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0153k1(C0031p0 c0031p0, E4.s sVar, p117w.d dVar, p111u4.d dVar2) {
        super(2, dVar2);
        this.f2813m = c0031p0;
        this.f2814n = sVar;
        this.f2815o = dVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new C0153k1(this.f2813m, this.f2814n, this.f2815o, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0153k1) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f2812l;
        if (i == 0) {
            S1.V.O(obj);
            boolean z5 = this.f2814n.f1070h;
            C0031p0 c0031p0 = this.f2813m;
            p117w.m mVar = (p117w.m) (z5 ? c0031p0.f394j : c0031p0.f395k);
            this.f2812l = 1;
            if (mVar.a(this.f2815o, this) == aVar) {
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
