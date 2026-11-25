package D;

import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import P4.T;
import P4.i0;
import S1.V;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class p extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f697l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f698m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, p111u4.d dVar) {
        super(2, dVar);
        this.f698m = qVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        p pVar = new p(this.f698m, dVar);
        pVar.f697l = obj;
        return pVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((p) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        boolean z5;
        v4.a aVar = v4.a.f13292h;
        V.O(obj);
        InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f697l;
        q qVar = this.f698m;
        T t6 = (T) qVar.f699a.getAndSet(null);
        AtomicReference atomicReference = qVar.f699a;
        i0 i0VarO = AbstractC0336x.o(interfaceC0335w, null, new o(t6, qVar, null), 3);
        while (!atomicReference.compareAndSet(null, i0VarO)) {
            if (atomicReference.get() != null) {
                z5 = false;
                return Boolean.valueOf(z5);
            }
        }
        z5 = true;
        return Boolean.valueOf(z5);
    }
}
