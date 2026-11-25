package S4;

import D.C0052b;
import S1.V;

/* JADX INFO: loaded from: classes.dex */
public final class A implements InterfaceC0368e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5014h = 0;
    public final Object i;

    public A(C0375l c0375l) {
        this.i = c0375l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Type inference failed for: r5v4, types: [D4.e, w4.i] */
    @Override // S4.InterfaceC0368e
    public final Object a(InterfaceC0369f interfaceC0369f, p111u4.d dVar) throws Throwable {
        C0364a c0364a;
        T4.s sVar;
        switch (this.f5014h) {
            case 0:
                if (dVar instanceof C0364a) {
                    c0364a = (C0364a) dVar;
                    int i = c0364a.f5064n;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0364a.f5064n = i - Integer.MIN_VALUE;
                    } else {
                        c0364a = new C0364a(this, dVar);
                    }
                } else {
                    c0364a = new C0364a(this, dVar);
                }
                Object obj = c0364a.f5062l;
                v4.a aVar = v4.a.f13292h;
                int i3 = c0364a.f5064n;
                p084p4.x xVar = p084p4.x.f10867a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = c0364a.f5061k;
                    try {
                        V.O(obj);
                        sVar.p();
                        return xVar;
                    } catch (Throwable th) {
                        th = th;
                        sVar.p();
                        throw th;
                    }
                }
                V.O(obj);
                p111u4.i iVar = c0364a.i;
                E4.k.c(iVar);
                T4.s sVar2 = new T4.s(interfaceC0369f, iVar);
                try {
                    c0364a.f5061k = sVar2;
                    c0364a.f5064n = 1;
                    try {
                        Object objD = ((p122w4.i) this.i).d(sVar2, c0364a);
                        if (objD != aVar) {
                            objD = xVar;
                        }
                        if (objD == aVar) {
                            return aVar;
                        }
                        sVar = sVar2;
                        sVar.p();
                        return xVar;
                    } catch (Throwable th2) {
                        th = th2;
                        sVar = sVar2;
                        sVar.p();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                break;
            default:
                Object objA = ((C0375l) this.i).a(new C0052b(2, interfaceC0369f), dVar);
                return objA == v4.a.f13292h ? objA : p084p4.x.f10867a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public A(D4.e eVar) {
        this.i = (p122w4.i) eVar;
    }
}
