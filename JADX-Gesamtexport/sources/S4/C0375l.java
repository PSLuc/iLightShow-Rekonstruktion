package S4;

import L.W;
import S1.V;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p092r1.C0892m;
import p092r1.C0893n;

/* JADX INFO: renamed from: S4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0375l implements InterfaceC0368e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5093h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5094j;

    public /* synthetic */ C0375l(Object obj, int i, Object obj2) {
        this.f5093h = i;
        this.i = obj;
        this.f5094j = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r2v10, types: [D4.e, w4.i] */
    @Override // S4.InterfaceC0368e
    public final Object a(InterfaceC0369f interfaceC0369f, p111u4.d dVar) {
        C0374k c0374k;
        Throwable th;
        T4.s sVar;
        C0375l c0375l;
        C0377n c0377n;
        F.F f6;
        switch (this.f5093h) {
            case 0:
                if (dVar instanceof C0374k) {
                    c0374k = (C0374k) dVar;
                    int i = c0374k.f5088l;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0374k.f5088l = i - Integer.MIN_VALUE;
                    } else {
                        c0374k = new C0374k(this, dVar);
                    }
                } else {
                    c0374k = new C0374k(this, dVar);
                }
                Object obj = c0374k.f5087k;
                v4.a aVar = v4.a.f13292h;
                int i3 = c0374k.f5088l;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        V.O(obj);
                        return p084p4.x.f10867a;
                    }
                    sVar = c0374k.f5092p;
                    interfaceC0369f = c0374k.f5091o;
                    c0375l = c0374k.f5090n;
                    try {
                        V.O(obj);
                        sVar.p();
                        P p6 = (P) c0375l.f5094j;
                        c0374k.f5090n = null;
                        c0374k.f5091o = null;
                        c0374k.f5092p = null;
                        c0374k.f5088l = 2;
                        p6.a(interfaceC0369f, c0374k);
                        return aVar;
                    } catch (Throwable th2) {
                        th = th2;
                        sVar.p();
                        throw th;
                    }
                }
                V.O(obj);
                p111u4.i iVar = c0374k.i;
                E4.k.c(iVar);
                T4.s sVar2 = new T4.s(interfaceC0369f, iVar);
                try {
                    C0892m c0892m = (C0892m) this.i;
                    try {
                        c0374k.f5090n = this;
                        c0374k.f5091o = interfaceC0369f;
                        c0374k.f5092p = sVar2;
                        c0374k.f5088l = 1;
                        if (c0892m.d(sVar2, c0374k) == aVar) {
                            return aVar;
                        }
                        c0375l = this;
                        sVar = sVar2;
                        sVar.p();
                        P p7 = (P) c0375l.f5094j;
                        c0374k.f5090n = null;
                        c0374k.f5091o = null;
                        c0374k.f5092p = null;
                        c0374k.f5088l = 2;
                        p7.a(interfaceC0369f, c0374k);
                        return aVar;
                    } catch (Throwable th3) {
                        th = th3;
                        sVar = sVar2;
                        sVar.p();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
            case 1:
                Object objA = ((InterfaceC0368e) this.i).a(new W(new E4.s(), interfaceC0369f, (p122w4.i) this.f5094j), dVar);
                return objA == v4.a.f13292h ? objA : p084p4.x.f10867a;
            default:
                if (dVar instanceof C0377n) {
                    c0377n = (C0377n) dVar;
                    int i6 = c0377n.f5101l;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0377n.f5101l = i6 - Integer.MIN_VALUE;
                    } else {
                        c0377n = new C0377n(this, dVar);
                    }
                } else {
                    c0377n = new C0377n(this, dVar);
                }
                Object obj2 = c0377n.f5100k;
                v4.a aVar2 = v4.a.f13292h;
                int i7 = c0377n.f5101l;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f6 = c0377n.f5103n;
                    try {
                        V.O(obj2);
                    } catch (AbortFlowException e6) {
                        e = e6;
                        if (e.f9953h != f6) {
                            throw e;
                        }
                    }
                    break;
                } else {
                    V.O(obj2);
                    C0375l c0375l2 = (C0375l) this.i;
                    F.F f7 = new F.F((C0893n) this.f5094j, 3, interfaceC0369f);
                    try {
                        c0377n.f5103n = f7;
                        c0377n.f5101l = 1;
                        if (c0375l2.a(f7, c0377n) == aVar2) {
                            return aVar2;
                        }
                    } catch (AbortFlowException e7) {
                        e = e7;
                        f6 = f7;
                        if (e.f9953h != f6) {
                            throw e;
                        }
                    }
                }
                return p084p4.x.f10867a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0375l(InterfaceC0368e interfaceC0368e, D4.e eVar) {
        this.f5093h = 1;
        this.i = interfaceC0368e;
        this.f5094j = (p122w4.i) eVar;
    }
}
