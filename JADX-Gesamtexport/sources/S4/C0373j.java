package S4;

import S1.V;

/* JADX INFO: renamed from: S4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0373j implements InterfaceC0368e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0368e f5086h;
    public final /* synthetic */ p122w4.i i;

    /* JADX WARN: Multi-variable type inference failed */
    public C0373j(InterfaceC0368e interfaceC0368e, D4.f fVar) {
        this.f5086h = interfaceC0368e;
        this.i = (p122w4.i) fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v5, types: [D4.f, w4.i] */
    /* JADX WARN: Type inference failed for: r9v3, types: [D4.f, w4.i] */
    @Override // S4.InterfaceC0368e
    public final Object a(InterfaceC0369f interfaceC0369f, p111u4.d dVar) throws Throwable {
        C0372i c0372i;
        T4.s sVar;
        T4.s sVar2;
        if (dVar instanceof C0372i) {
            c0372i = (C0372i) dVar;
            int i = c0372i.f5082l;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0372i.f5082l = i - Integer.MIN_VALUE;
            } else {
                c0372i = new C0372i(this, dVar);
            }
        } else {
            c0372i = new C0372i(this, dVar);
        }
        Object obj = c0372i.f5081k;
        v4.a aVar = v4.a.f13292h;
        int i3 = c0372i.f5082l;
        try {
            try {
                if (i3 == 0) {
                    V.O(obj);
                    InterfaceC0368e interfaceC0368e = this.f5086h;
                    c0372i.f5084n = this;
                    c0372i.f5085o = interfaceC0369f;
                    c0372i.f5082l = 1;
                    if (interfaceC0368e.a(interfaceC0369f, c0372i) != aVar) {
                    }
                    return aVar;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        Throwable th = (Throwable) c0372i.f5084n;
                        V.O(obj);
                        throw th;
                    }
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar2 = (T4.s) c0372i.f5084n;
                    try {
                        V.O(obj);
                        sVar2.p();
                        return p084p4.x.f10867a;
                    } catch (Throwable th2) {
                        th = th2;
                        sVar2.p();
                        throw th;
                    }
                }
                interfaceC0369f = c0372i.f5085o;
                this = (C0373j) c0372i.f5084n;
                V.O(obj);
                ?? r8 = this.i;
                c0372i.f5084n = sVar;
                c0372i.f5085o = null;
                c0372i.f5082l = 3;
                if (r8.c(sVar, null, c0372i) != aVar) {
                    sVar2 = sVar;
                    sVar2.p();
                    return p084p4.x.f10867a;
                }
                return aVar;
            } catch (Throwable th3) {
                th = th3;
                sVar2 = sVar;
                sVar2.p();
                throw th;
            }
            p111u4.i iVar = c0372i.i;
            E4.k.c(iVar);
            sVar = new T4.s(interfaceC0369f, iVar);
        } catch (Throwable th4) {
            C0373j c0373j = this;
            S s6 = new S(th4);
            ?? r9 = c0373j.i;
            c0372i.f5084n = th4;
            c0372i.f5085o = null;
            c0372i.f5082l = 2;
            if (F.c(s6, r9, th4, c0372i) != aVar) {
                throw th4;
            }
        }
    }
}
