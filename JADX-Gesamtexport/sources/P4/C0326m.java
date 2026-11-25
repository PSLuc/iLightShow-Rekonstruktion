package P4;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: P4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0326m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f4658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D4.c f4659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f4661e;

    public C0326m(Object obj, F f6, D4.c cVar, Object obj2, Throwable th) {
        this.f4657a = obj;
        this.f4658b = f6;
        this.f4659c = cVar;
        this.f4660d = obj2;
        this.f4661e = th;
    }

    public static C0326m a(C0326m c0326m, F f6, CancellationException cancellationException, int i) {
        Object obj = c0326m.f4657a;
        if ((i & 2) != 0) {
            f6 = c0326m.f4658b;
        }
        F f7 = f6;
        D4.c cVar = c0326m.f4659c;
        Object obj2 = c0326m.f4660d;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = c0326m.f4661e;
        }
        c0326m.getClass();
        return new C0326m(obj, f7, cVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0326m)) {
            return false;
        }
        C0326m c0326m = (C0326m) obj;
        return E4.k.a(this.f4657a, c0326m.f4657a) && E4.k.a(this.f4658b, c0326m.f4658b) && E4.k.a(this.f4659c, c0326m.f4659c) && E4.k.a(this.f4660d, c0326m.f4660d) && E4.k.a(this.f4661e, c0326m.f4661e);
    }

    public final int hashCode() {
        Object obj = this.f4657a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        F f6 = this.f4658b;
        int iHashCode2 = (iHashCode + (f6 == null ? 0 : f6.hashCode())) * 31;
        D4.c cVar = this.f4659c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Object obj2 = this.f4660d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f4661e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f4657a + ", cancelHandler=" + this.f4658b + ", onCancellation=" + this.f4659c + ", idempotentResume=" + this.f4660d + ", cancelCause=" + this.f4661e + ')';
    }

    public /* synthetic */ C0326m(Object obj, F f6, D4.c cVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : f6, (i & 4) != 0 ? null : cVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
