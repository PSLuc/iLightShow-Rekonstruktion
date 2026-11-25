package S4;

import P4.InterfaceC0335w;
import S1.V;

/* JADX INFO: loaded from: classes.dex */
public final class w extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M f5135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0368e f5136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ P f5137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Float f5138p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(M m6, InterfaceC0368e interfaceC0368e, P p6, Float f6, p111u4.d dVar) {
        super(2, dVar);
        this.f5135m = m6;
        this.f5136n = interfaceC0368e;
        this.f5137o = p6;
        this.f5138p = f6;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new w(this.f5135m, this.f5136n, this.f5137o, this.f5138p, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((w) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba A[RETURN] */
    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f5134l;
        p084p4.x xVar = p084p4.x.f10867a;
        InterfaceC0368e interfaceC0368e = this.f5136n;
        P p6 = this.f5137o;
        if (i == 0) {
            V.O(obj);
            J j4 = I.f5041a;
            M m6 = this.f5135m;
            if (m6 == j4) {
                this.f5134l = 1;
                if (interfaceC0368e.a(p6, this) == aVar) {
                    return aVar;
                }
                return xVar;
            }
            if (m6 == I.f5042b) {
                T4.x xVarG = p6.g();
                u uVar = new u(2, null);
                this.f5134l = 2;
                if (F.h(xVarG, uVar, this) != aVar) {
                }
            } else {
                T4.x xVarG2 = p6.g();
                K k3 = new K(m6, null);
                int i3 = AbstractC0380q.f5113a;
                p111u4.j jVar = p111u4.j.f12751h;
                InterfaceC0368e interfaceC0368eF = F.f(F.f(new C0375l(new T4.m(k3, xVarG2, jVar, -2, 1), new L(2, null))));
                v vVar = new v(interfaceC0368e, p6, this.f5138p, null);
                this.f5134l = 4;
                Object objA = F.e(new T4.m(new C0379p(vVar, null), interfaceC0368eF, jVar, -2, 1), 0).a(T4.q.f5288h, this);
                if (objA != aVar) {
                    objA = xVar;
                }
                if (objA != aVar) {
                    objA = xVar;
                }
                if (objA != aVar) {
                    return xVar;
                }
            }
            return aVar;
        }
        if (i == 1) {
            V.O(obj);
            return xVar;
        }
        if (i != 2) {
            if (i == 3) {
                V.O(obj);
                return xVar;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            return xVar;
        }
        V.O(obj);
        this.f5134l = 3;
        if (interfaceC0368e.a(p6, this) == aVar) {
            return aVar;
        }
        return xVar;
    }
}
