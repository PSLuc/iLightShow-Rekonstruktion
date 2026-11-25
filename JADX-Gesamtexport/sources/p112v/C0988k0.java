package p112v;

import D4.e;
import P4.InterfaceC0335w;
import S0.o;
import S1.V;
import p084p4.x;
import p101t.m0;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: v.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0988k0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1001r0 f13014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f13015n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0988k0(C1001r0 c1001r0, long j4, d dVar) {
        super(2, dVar);
        this.f13014m = c1001r0;
        this.f13015n = j4;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new C0988k0(this.f13014m, this.f13015n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0988k0) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    @Override // p122w4.a
    public final Object o(Object obj) {
        Object objO;
        a aVar = a.f13292h;
        int i = this.f13013l;
        x xVar = x.f10867a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            return xVar;
        }
        V.O(obj);
        C1017z0 c1017z0 = this.f13014m.I;
        this.f13013l = 1;
        W w6 = c1017z0.f13107d;
        W w7 = W.i;
        long j4 = this.f13015n;
        long jA = w6 == w7 ? o.a(j4, 0.0f, 0.0f, 1) : o.a(j4, 0.0f, 0.0f, 2);
        C1013x0 c1013x0 = new C1013x0(c1017z0, null);
        m0 m0Var = c1017z0.f13105b;
        if (m0Var == null || !(c1017z0.f13104a.d() || c1017z0.f13104a.a())) {
            C1013x0 c1013x1 = new C1013x0(c1017z0, this);
            c1013x1.f13095n = jA;
            objO = c1013x1.o(xVar);
            if (objO != aVar) {
                objO = xVar;
            }
        } else {
            objO = m0Var.e(jA, c1013x0, this);
            if (objO != aVar) {
                objO = xVar;
            }
        }
        return objO == aVar ? aVar : xVar;
    }
}
