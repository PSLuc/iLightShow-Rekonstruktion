package p096s;

import D4.c;
import D4.e;
import E4.k;
import P4.C0332t;
import P4.InterfaceC0335w;
import P4.T;
import S1.V;
import X4.a;
import androidx.compose.animation.core.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p084p4.x;
import p111u4.d;
import p111u4.g;
import p122w4.i;

/* JADX INFO: loaded from: classes.dex */
public final class M extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f11857l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f11858m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public N f11859n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11860o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f11861p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N f11862q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f11863r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public M(N n6, c cVar, d dVar) {
        super(2, dVar);
        this.f11862q = n6;
        this.f11863r = (i) cVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [D4.c, w4.i] */
    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        M m6 = new M(this.f11862q, this.f11863r, dVar);
        m6.f11861p = obj;
        return m6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((M) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [D4.c] */
    @Override // p122w4.a
    public final Object o(Object obj) {
        L l6;
        N n6;
        ?? r6;
        a aVar;
        N n7;
        Throwable th;
        L l7;
        a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        v4.a aVar3 = v4.a.f13292h;
        ?? r7 = this.f11860o;
        try {
            try {
                if (r7 == 0) {
                    V.O(obj);
                    g gVarJ = ((InterfaceC0335w) this.f11861p).d().J(C0332t.i);
                    k.c(gVarJ);
                    l6 = new L((T) gVarJ);
                    loop2: while (true) {
                        n6 = this.f11862q;
                        AtomicReference atomicReference3 = n6.f11864a;
                        L l8 = (L) atomicReference3.get();
                        if (l8 != null && AbstractC0916i.a(1, 1) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        do {
                            if (atomicReference3.compareAndSet(l8, l6)) {
                                if (l8 != null) {
                                    l8.f11856a.c(new MutationInterruptedException());
                                }
                                this.f11861p = l6;
                                X4.d dVar = n6.f11865b;
                                this.f11857l = dVar;
                                i iVar = this.f11863r;
                                this.f11858m = iVar;
                                this.f11859n = n6;
                                this.f11860o = 1;
                                if (dVar.c(this) != aVar3) {
                                    r6 = iVar;
                                    aVar = dVar;
                                    break loop2;
                                }
                                return aVar3;
                            }
                        } while (atomicReference3.get() == l8);
                    }
                } else {
                    if (r7 != 1) {
                        if (r7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        n7 = (N) this.f11858m;
                        a aVar4 = this.f11857l;
                        l7 = (L) this.f11861p;
                        try {
                            V.O(obj);
                            aVar2 = aVar4;
                            atomicReference2 = n7.f11864a;
                            while (!atomicReference2.compareAndSet(l7, null) && atomicReference2.get() == l7) {
                            }
                            ((X4.d) aVar2).e(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = n7.f11864a;
                            while (!atomicReference.compareAndSet(l7, null)) {
                            }
                            throw th;
                        }
                    }
                    N n8 = this.f11859n;
                    c cVar = (c) this.f11858m;
                    a aVar5 = this.f11857l;
                    L l9 = (L) this.f11861p;
                    V.O(obj);
                    n6 = n8;
                    l6 = l9;
                    r6 = cVar;
                    aVar = aVar5;
                }
                this.f11861p = l6;
                this.f11857l = aVar;
                this.f11858m = n6;
                this.f11859n = null;
                this.f11860o = 2;
                Object objInvoke = r6.invoke(this);
                if (objInvoke != aVar3) {
                    n7 = n6;
                    obj = objInvoke;
                    l7 = l6;
                    aVar2 = aVar;
                    atomicReference2 = n7.f11864a;
                    while (!atomicReference2.compareAndSet(l7, null)) {
                    }
                    ((X4.d) aVar2).e(null);
                    return obj;
                }
                return aVar3;
            } catch (Throwable th3) {
                n7 = n6;
                th = th3;
                l7 = l6;
                atomicReference = n7.f11864a;
                while (!atomicReference.compareAndSet(l7, null) && atomicReference.get() == l7) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((X4.d) r7).e(null);
            throw th4;
        }
    }
}
