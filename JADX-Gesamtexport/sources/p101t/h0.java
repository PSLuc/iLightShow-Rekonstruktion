package p101t;

import D4.e;
import E4.k;
import P4.C0332t;
import P4.InterfaceC0335w;
import P4.T;
import S1.V;
import X4.a;
import androidx.compose.foundation.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p084p4.x;
import p096s.AbstractC0916i;
import p111u4.d;
import p111u4.g;
import p122w4.i;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f12332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f12333m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f12334n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i0 f12335o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f12337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f12338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i0 f12339s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f12340t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12341u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(int i, i0 i0Var, e eVar, Object obj, d dVar) {
        super(2, dVar);
        this.f12338r = i;
        this.f12339s = i0Var;
        this.f12340t = (i) eVar;
        this.f12341u = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [D4.e, w4.i] */
    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        h0 h0Var = new h0(this.f12338r, this.f12339s, this.f12340t, this.f12341u, dVar);
        h0Var.f12337q = obj;
        return h0Var;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((h0) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4, types: [D4.e] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // p122w4.a
    public final Object o(Object obj) {
        g0 g0Var;
        i0 i0Var;
        Object obj2;
        ?? r6;
        a aVar;
        i0 i0Var2;
        Throwable th;
        g0 g0Var2;
        a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        v4.a aVar3 = v4.a.f13292h;
        ?? r7 = this.f12336p;
        try {
            try {
                if (r7 == 0) {
                    V.O(obj);
                    g gVarJ = ((InterfaceC0335w) this.f12337q).d().J(C0332t.i);
                    k.c(gVarJ);
                    g0Var = new g0(this.f12338r, (T) gVarJ);
                    loop2: while (true) {
                        i0Var = this.f12339s;
                        AtomicReference atomicReference3 = i0Var.f12345a;
                        g0 g0Var3 = (g0) atomicReference3.get();
                        if (g0Var3 != null && AbstractC0916i.a(g0Var.f12329a, g0Var3.f12329a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        do {
                            if (atomicReference3.compareAndSet(g0Var3, g0Var)) {
                                if (g0Var3 != null) {
                                    g0Var3.f12330b.c(new MutationInterruptedException());
                                }
                                this.f12337q = g0Var;
                                X4.d dVar = i0Var.f12346b;
                                this.f12332l = dVar;
                                i iVar = this.f12340t;
                                this.f12333m = iVar;
                                Object obj3 = this.f12341u;
                                this.f12334n = obj3;
                                this.f12335o = i0Var;
                                this.f12336p = 1;
                                if (dVar.c(this) != aVar3) {
                                    obj2 = obj3;
                                    aVar = dVar;
                                    r6 = iVar;
                                    break loop2;
                                }
                                return aVar3;
                            }
                        } while (atomicReference3.get() == g0Var3);
                    }
                } else {
                    if (r7 != 1) {
                        if (r7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i0Var2 = (i0) this.f12333m;
                        a aVar4 = this.f12332l;
                        g0Var2 = (g0) this.f12337q;
                        try {
                            V.O(obj);
                            aVar2 = aVar4;
                            atomicReference2 = i0Var2.f12345a;
                            while (!atomicReference2.compareAndSet(g0Var2, null) && atomicReference2.get() == g0Var2) {
                            }
                            ((X4.d) aVar2).e(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = i0Var2.f12345a;
                            while (!atomicReference.compareAndSet(g0Var2, null)) {
                            }
                            throw th;
                        }
                    }
                    i0 i0Var3 = this.f12335o;
                    obj2 = this.f12334n;
                    e eVar = (e) this.f12333m;
                    a aVar5 = this.f12332l;
                    g0 g0Var4 = (g0) this.f12337q;
                    V.O(obj);
                    r6 = eVar;
                    aVar = aVar5;
                    i0Var = i0Var3;
                    g0Var = g0Var4;
                }
                this.f12337q = g0Var;
                this.f12332l = aVar;
                this.f12333m = i0Var;
                this.f12334n = null;
                this.f12335o = null;
                this.f12336p = 2;
                Object objD = r6.d(obj2, this);
                if (objD != aVar3) {
                    i0Var2 = i0Var;
                    obj = objD;
                    g0Var2 = g0Var;
                    aVar2 = aVar;
                    atomicReference2 = i0Var2.f12345a;
                    while (!atomicReference2.compareAndSet(g0Var2, null)) {
                    }
                    ((X4.d) aVar2).e(null);
                    return obj;
                }
                return aVar3;
            } catch (Throwable th3) {
                i0Var2 = i0Var;
                th = th3;
                g0Var2 = g0Var;
                atomicReference = i0Var2.f12345a;
                while (!atomicReference.compareAndSet(g0Var2, null) && atomicReference.get() == g0Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((X4.d) r7).e(null);
            throw th4;
        }
    }
}
