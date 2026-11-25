package R4;

import O1.C0308a;
import P4.AbstractC0336x;
import P4.C0319f;
import P4.p0;
import S1.V;
import U4.r;
import U4.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f4813h = d.f4839p;
    public C0319f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f4814j;

    public a(b bVar) {
        this.f4814j = bVar;
    }

    public final Object a(p122w4.c cVar) throws Throwable {
        j jVarO;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f4819n;
        b bVar = this.f4814j;
        j jVar = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            bVar.getClass();
            if (bVar.u(b.i.get(bVar), true)) {
                this.f4813h = d.f4835l;
                Throwable thP = bVar.p();
                if (thP == null) {
                    return Boolean.FALSE;
                }
                int i = s.f5378a;
                throw thP;
            }
            long andIncrement = b.f4815j.getAndIncrement(bVar);
            long j4 = d.f4826b;
            long j6 = andIncrement / j4;
            int i3 = (int) (andIncrement % j4);
            if (jVar.f5377j != j6) {
                jVarO = bVar.o(j6, jVar);
                if (jVarO == null) {
                    continue;
                }
            } else {
                jVarO = jVar;
            }
            Object objC = bVar.C(jVarO, i3, andIncrement, null);
            C0308a c0308a = d.f4836m;
            if (objC == c0308a) {
                throw new IllegalStateException("unreachable");
            }
            C0308a c0308a2 = d.f4838o;
            if (objC != c0308a2) {
                if (objC != d.f4837n) {
                    jVarO.a();
                    this.f4813h = objC;
                    return Boolean.TRUE;
                }
                b bVar2 = this.f4814j;
                C0319f c0319fJ = AbstractC0336x.j(AbstractC0473d.F(cVar));
                try {
                    this.i = c0319fJ;
                    Object objC2 = bVar2.C(jVarO, i3, andIncrement, this);
                    if (objC2 != c0308a) {
                        if (objC2 == c0308a2) {
                            if (andIncrement < bVar2.s()) {
                                jVarO.a();
                            }
                            j jVar2 = (j) b.f4819n.get(bVar2);
                            while (true) {
                                if (bVar2.u(b.i.get(bVar2), true)) {
                                    C0319f c0319f = this.i;
                                    E4.k.c(c0319f);
                                    this.i = null;
                                    this.f4813h = d.f4835l;
                                    Throwable thP2 = bVar.p();
                                    if (thP2 != null) {
                                        c0319f.g(V.v(thP2));
                                        break;
                                    }
                                    c0319f.g(Boolean.FALSE);
                                    break;
                                }
                                long andIncrement2 = b.f4815j.getAndIncrement(bVar2);
                                long j7 = d.f4826b;
                                long j8 = andIncrement2 / j7;
                                int i6 = (int) (andIncrement2 % j7);
                                if (jVar2.f5377j != j8) {
                                    j jVarO2 = bVar2.o(j8, jVar2);
                                    if (jVarO2 != null) {
                                        jVar2 = jVarO2;
                                    }
                                }
                                Object objC3 = bVar2.C(jVar2, i6, andIncrement2, this);
                                if (objC3 == d.f4836m) {
                                    b(jVar2, i6);
                                    break;
                                }
                                if (objC3 == d.f4838o) {
                                    if (andIncrement2 < bVar2.s()) {
                                        jVar2.a();
                                    }
                                } else {
                                    if (objC3 == d.f4837n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    jVar2.a();
                                    this.f4813h = objC3;
                                    this.i = null;
                                    bool = Boolean.TRUE;
                                }
                            }
                        } else {
                            jVarO.a();
                            this.f4813h = objC2;
                            this.i = null;
                            bool = Boolean.TRUE;
                        }
                        c0319fJ.C(bool, null);
                        break;
                    }
                    b(jVarO, i3);
                    Object objT = c0319fJ.t();
                    v4.a aVar = v4.a.f13292h;
                    return objT;
                } catch (Throwable th) {
                    c0319fJ.B();
                    throw th;
                }
            }
            if (andIncrement < bVar.s()) {
                jVarO.a();
            }
            jVar = jVarO;
        }
    }

    @Override // P4.p0
    public final void b(r rVar, int i) {
        C0319f c0319f = this.i;
        if (c0319f != null) {
            c0319f.b(rVar, i);
        }
    }

    public final Object c() throws Throwable {
        Object obj = this.f4813h;
        C0308a c0308a = d.f4839p;
        if (obj == c0308a) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f4813h = c0308a;
        if (obj != d.f4835l) {
            return obj;
        }
        Throwable thQ = this.f4814j.q();
        int i = s.f5378a;
        throw thQ;
    }
}
