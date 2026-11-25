package U4;

import P4.AbstractC0328o;
import P4.AbstractC0331s;
import P4.AbstractC0336x;
import P4.C;
import P4.C0327n;
import P4.L;
import P4.l0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class f extends C implements p122w4.d, p111u4.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5351o = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractC0331s f5352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p122w4.c f5353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f5354m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f5355n;

    public f(AbstractC0331s abstractC0331s, p122w4.c cVar) {
        super(-1);
        this.f5352k = abstractC0331s;
        this.f5353l = cVar;
        this.f5354m = a.f5343c;
        this.f5355n = a.k(cVar.e());
    }

    @Override // p122w4.d
    public final p122w4.d a() {
        p122w4.c cVar = this.f5353l;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // P4.C
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC0328o) {
            ((AbstractC0328o) obj).getClass();
            throw null;
        }
    }

    @Override // P4.C
    public final p111u4.d d() {
        return this;
    }

    @Override // p111u4.d
    public final p111u4.i e() {
        return this.f5353l.e();
    }

    @Override // p111u4.d
    public final void g(Object obj) {
        p122w4.c cVar = this.f5353l;
        p111u4.i iVarE = cVar.e();
        Throwable thA = p084p4.k.a(obj);
        Object c0327n = thA == null ? obj : new C0327n(thA, false);
        AbstractC0331s abstractC0331s = this.f5352k;
        if (abstractC0331s.Y()) {
            this.f5354m = c0327n;
            this.f4603j = 0;
            abstractC0331s.X(iVarE, this);
            return;
        }
        L lA = l0.a();
        if (lA.f4617j >= 4294967296L) {
            this.f5354m = c0327n;
            this.f4603j = 0;
            lA.a0(this);
            return;
        }
        lA.c0(true);
        try {
            p111u4.i iVarE2 = cVar.e();
            Object objL = a.l(iVarE2, this.f5355n);
            try {
                cVar.g(obj);
                a.f(iVarE2, objL);
                while (lA.e0()) {
                }
            } catch (Throwable th) {
                a.f(iVarE2, objL);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                k(th2, null);
            } finally {
                lA.Z(true);
            }
        }
    }

    @Override // P4.C
    public final Object l() {
        Object obj = this.f5354m;
        this.f5354m = a.f5343c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f5352k + ", " + AbstractC0336x.s(this.f5353l) + ']';
    }
}
