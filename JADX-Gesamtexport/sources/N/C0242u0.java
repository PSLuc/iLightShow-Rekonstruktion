package N;

import B.C0003b0;
import B.C0031p0;
import O1.C0308a;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import java.util.List;

/* JADX INFO: renamed from: N.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0242u0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public J2.b f3823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f3825n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0248x0 f3826o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0246w0 f3827p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ V f3828q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0242u0(C0248x0 c0248x0, C0246w0 c0246w0, V v6, p111u4.d dVar) {
        super(2, dVar);
        this.f3826o = c0248x0;
        this.f3827p = c0246w0;
        this.f3828q = v6;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0242u0 c0242u0 = new C0242u0(this.f3826o, this.f3827p, this.f3828q, dVar);
        c0242u0.f3825n = obj;
        return c0242u0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0242u0) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x011f A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:56:0x011b, B:58:0x011f, B:61:0x0124), top: B:95:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0145 A[Catch: all -> 0x0148, TryCatch #3 {all -> 0x0148, blocks: (B:72:0x0141, B:74:0x0145, B:77:0x014a), top: B:101:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Collection] */
    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        S4.P p6;
        Object obj2;
        T.b bVar;
        P4.T t6;
        Throwable th;
        J2.b bVar2;
        List listW;
        C0248x0 c0248x0;
        C0248x0 c0248x1;
        v4.a aVar = v4.a.f13292h;
        int i = this.f3824m;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = this.f3823l;
            t6 = (P4.T) this.f3825n;
            try {
                S1.V.O(obj);
                bVar2.c();
                c0248x1 = this.f3826o;
                synchronized (c0248x1.f3855b) {
                    try {
                        if (c0248x1.f3856c == t6) {
                            c0248x1.f3856c = null;
                        }
                        c0248x1.t();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                S4.P p7 = C0248x0.f3852v;
                U.b(this.f3826o.f3873u);
                return p084p4.x.f10867a;
            } catch (Throwable th3) {
                th = th3;
                bVar2.c();
                c0248x0 = this.f3826o;
                synchronized (c0248x0.f3855b) {
                    try {
                        if (c0248x0.f3856c == t6) {
                            c0248x0.f3856c = null;
                        }
                        c0248x0.t();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                S4.P p8 = C0248x0.f3852v;
                U.b(this.f3826o.f3873u);
                throw th;
            }
        }
        S1.V.O(obj);
        P4.T tI = AbstractC0336x.i(((InterfaceC0335w) this.f3825n).d());
        C0248x0 c0248x2 = this.f3826o;
        synchronized (c0248x2.f3855b) {
            Throwable th5 = c0248x2.f3857d;
            if (th5 != null) {
                throw th5;
            }
            if (((EnumC0236r0) c0248x2.f3870r.getValue()).compareTo(EnumC0236r0.i) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (c0248x2.f3856c != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            c0248x2.f3856c = tI;
            c0248x2.t();
        }
        C0003b0 c0003b0 = new C0003b0(10, this.f3826o);
        C0031p0 c0031p0 = X.o.f5708a;
        X.o.f(X.n.f5706j);
        synchronized (X.o.f5709b) {
            X.o.f5714g = p089q4.l.k0(X.o.f5714g, c0003b0);
        }
        J2.b bVar3 = new J2.b(c0003b0);
        S4.P p9 = C0248x0.f3852v;
        U u6 = this.f3826o.f3873u;
        do {
            p6 = C0248x0.f3852v;
            obj2 = (Q.e) p6.getValue();
            bVar = (T.b) obj2;
            S.c cVar = bVar.f5144j;
            if (!cVar.containsKey(u6)) {
                boolean zIsEmpty = bVar.isEmpty();
                U.b bVar4 = U.b.f5303a;
                if (zIsEmpty) {
                    bVar = new T.b(u6, u6, cVar.b(u6, new T.a(bVar4, bVar4)));
                } else {
                    Object obj3 = bVar.i;
                    Object obj4 = cVar.get(obj3);
                    E4.k.c(obj4);
                    bVar = new T.b(bVar.f5143h, u6, cVar.b(obj3, new T.a(((T.a) obj4).f5140a, u6)).b(u6, new T.a(obj3, bVar4)));
                }
            }
            if (obj2 == bVar) {
                break;
            }
            C0308a c0308a = T4.b.f5258b;
            if (obj2 == null) {
                obj2 = c0308a;
            }
        } while (!p6.i(obj2, bVar));
        try {
            C0248x0 c0248x3 = this.f3826o;
            synchronized (c0248x3.f3855b) {
                listW = c0248x3.w();
            }
            int size = listW.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((C0239t) listW.get(i3)).q();
            }
            C0240t0 c0240t0 = new C0240t0(this.f3827p, this.f3828q, null);
            this.f3825n = tI;
            this.f3823l = bVar3;
            this.f3824m = 1;
            if (AbstractC0336x.d(c0240t0, this) == aVar) {
                return aVar;
            }
            t6 = tI;
            bVar2 = bVar3;
            bVar2.c();
            c0248x1 = this.f3826o;
            synchronized (c0248x1.f3855b) {
                if (c0248x1.f3856c == t6) {
                    c0248x1.f3856c = null;
                }
                c0248x1.t();
                S4.P p10 = C0248x0.f3852v;
                U.b(this.f3826o.f3873u);
                return p084p4.x.f10867a;
            }
        } catch (Throwable th6) {
            t6 = tI;
            th = th6;
            bVar2 = bVar3;
            bVar2.c();
            c0248x0 = this.f3826o;
            synchronized (c0248x0.f3855b) {
                if (c0248x0.f3856c == t6) {
                    c0248x0.f3856c = null;
                }
                c0248x0.t();
                S4.P p11 = C0248x0.f3852v;
                U.b(this.f3826o.f3873u);
                throw th;
            }
        }
    }
}
