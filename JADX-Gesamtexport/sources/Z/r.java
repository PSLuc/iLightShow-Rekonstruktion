package Z;

import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import P4.T;
import S1.V;
import java.util.concurrent.atomic.AtomicReference;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E4.l f5974n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5975o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p122w4.i f5976p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(D4.c cVar, AtomicReference atomicReference, D4.e eVar, p111u4.d dVar) {
        super(2, dVar);
        this.f5974n = (E4.l) cVar;
        this.f5975o = atomicReference;
        this.f5976p = (p122w4.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [D4.e, w4.i] */
    /* JADX WARN: Type inference failed for: r3v1, types: [D4.c, E4.l] */
    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        r rVar = new r(this.f5974n, this.f5975o, this.f5976p, dVar);
        rVar.f5973m = obj;
        return rVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((r) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r9v11, types: [D4.e, w4.i] */
    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        q qVar;
        q qVar2;
        v4.a aVar = v4.a.f13292h;
        int i = this.f5972l;
        AtomicReference atomicReference = this.f5975o;
        try {
            if (i == 0) {
                V.O(obj);
                InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f5973m;
                qVar = new q(AbstractC0336x.i(interfaceC0335w.d()), this.f5974n.invoke(interfaceC0335w));
                q qVar3 = (q) atomicReference.getAndSet(qVar);
                if (qVar3 != null) {
                    T t6 = qVar3.f5970a;
                    this.f5973m = qVar;
                    this.f5972l = 1;
                    t6.c(null);
                    Object objM = t6.M(this);
                    if (objM != aVar) {
                        objM = x.f10867a;
                    }
                    if (objM != aVar) {
                    }
                }
                return aVar;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar2 = (q) this.f5973m;
                try {
                    V.O(obj);
                    while (!atomicReference.compareAndSet(qVar2, null) && atomicReference.get() == qVar2) {
                    }
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    while (!atomicReference.compareAndSet(qVar2, null) && atomicReference.get() == qVar2) {
                    }
                    throw th;
                }
            }
            qVar = (q) this.f5973m;
            V.O(obj);
            ?? r9 = this.f5976p;
            Object obj2 = qVar.f5971b;
            this.f5973m = qVar;
            this.f5972l = 2;
            obj = r9.d(obj2, this);
            if (obj != aVar) {
                qVar2 = qVar;
                while (!atomicReference.compareAndSet(qVar2, null)) {
                }
                return obj;
            }
            return aVar;
        } catch (Throwable th2) {
            th = th2;
            qVar2 = qVar;
            while (!atomicReference.compareAndSet(qVar2, null)) {
            }
            throw th;
        }
    }
}
