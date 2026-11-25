package p112v;

import B.S0;
import D4.e;
import P4.AbstractC0336x;
import S1.V;
import p084p4.x;
import p090r.C0870i;
import p091r0.A;
import p097s0.c;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class G extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12811l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f12812m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M f12813n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(M m6, d dVar) {
        super(2, dVar);
        this.f12813n = m6;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        G g6 = new G(this.f12813n, dVar);
        g6.f12812m = obj;
        return g6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((G) b((A) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12811l;
        if (i == 0) {
            V.O(obj);
            A a6 = (A) this.f12812m;
            c cVar = new c();
            M m6 = this.f12813n;
            E e6 = new E(m6, a6, new S0(m6, 6, cVar), new C0870i(cVar, 11, m6), new F(m6, 0), new F(m6, 1), new A2.d(cVar, 13, m6), null);
            this.f12811l = 1;
            if (AbstractC0336x.d(e6, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        return x.f10867a;
    }
}
