package L;

import P4.InterfaceC0335w;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class X extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2558l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f2559m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p117w.m f2560n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0125b0 f2561o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(p117w.m mVar, C0125b0 c0125b0, p111u4.d dVar) {
        super(2, dVar);
        this.f2560n = mVar;
        this.f2561o = c0125b0;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        X x6 = new X(this.f2560n, this.f2561o, dVar);
        x6.f2559m = obj;
        return x6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((X) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        v4.a aVar = v4.a.f13292h;
        int i = this.f2558l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
            return p084p4.x.f10867a;
        }
        S1.V.O(obj);
        InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f2559m;
        ArrayList arrayList = new ArrayList();
        S4.E e6 = this.f2560n.f13392a;
        W w6 = new W(arrayList, interfaceC0335w, this.f2561o, 0);
        this.f2558l = 1;
        e6.getClass();
        S4.E.j(e6, w6, this);
        return aVar;
    }
}
