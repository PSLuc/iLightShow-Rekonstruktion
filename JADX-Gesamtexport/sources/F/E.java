package F;

import P4.InterfaceC0335w;
import p096s.C0906b0;
import p096s.C0907c;

/* JADX INFO: loaded from: classes.dex */
public final class E extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0907c f1088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f1089n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C0907c c0907c, long j4, p111u4.d dVar) {
        super(2, dVar);
        this.f1088m = c0907c;
        this.f1089n = j4;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new E(this.f1088m, this.f1089n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((E) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f1087l;
        if (i == 0) {
            S1.V.O(obj);
            p030f0.c cVar = new p030f0.c(this.f1089n);
            C0906b0 c0906b0 = H.f1099d;
            this.f1087l = 1;
            if (C0907c.a(this.f1088m, cVar, c0906b0, this) == aVar) {
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
