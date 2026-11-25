package T4;

import P4.InterfaceC0335w;
import S1.V;
import S4.InterfaceC0369f;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f5273m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0369f f5274n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f5275o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, InterfaceC0369f interfaceC0369f, Object obj, p111u4.d dVar) {
        super(2, dVar);
        this.f5273m = mVar;
        this.f5274n = interfaceC0369f;
        this.f5275o = obj;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new j(this.f5273m, this.f5274n, this.f5275o, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((j) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [D4.f, w4.i] */
    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f5272l;
        if (i == 0) {
            V.O(obj);
            ?? r6 = this.f5273m.f5285l;
            this.f5272l = 1;
            if (r6.c(this.f5274n, this.f5275o, this) == aVar) {
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
