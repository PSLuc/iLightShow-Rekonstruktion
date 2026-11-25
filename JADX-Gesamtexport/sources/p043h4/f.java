package p043h4;

import B.AbstractC0013g0;
import W3.b;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p027e3.a;
import u5.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f9307h;
    public static final /* synthetic */ f[] i;

    static {
        f fVar = new f("CANCELLED", 0);
        f9307h = fVar;
        i = new f[]{fVar};
    }

    public static void a(AtomicReference atomicReference) {
        c cVar;
        c cVar2 = (c) atomicReference.get();
        f fVar = f9307h;
        if (cVar2 == fVar || (cVar = (c) atomicReference.getAndSet(fVar)) == fVar || cVar == null) {
            return;
        }
        cVar.cancel();
    }

    public static void b(AtomicReference atomicReference, AtomicLong atomicLong, long j4) {
        c cVar = (c) atomicReference.get();
        if (cVar != null) {
            cVar.e(j4);
            return;
        }
        if (f(j4)) {
            a.O(atomicLong, j4);
            c cVar2 = (c) atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cVar2.e(andSet);
                }
            }
        }
    }

    public static void c(AtomicReference atomicReference, AtomicLong atomicLong, c cVar) {
        if (d(atomicReference, cVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                cVar.e(andSet);
            }
        }
    }

    public static boolean d(AtomicReference atomicReference, c cVar) {
        b.a("s is null", cVar);
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                cVar.cancel();
                if (atomicReference.get() == f9307h) {
                    return false;
                }
                G4.a.A(new ProtocolViolationException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean f(long j4) {
        if (j4 > 0) {
            return true;
        }
        G4.a.A(new IllegalArgumentException(AbstractC0013g0.h("n > 0 required but it was ", j4)));
        return false;
    }

    public static boolean g(c cVar, c cVar2) {
        if (cVar2 == null) {
            G4.a.A(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.cancel();
        G4.a.A(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) i.clone();
    }

    @Override // u5.c
    public final void cancel() {
    }

    @Override // u5.c
    public final void e(long j4) {
    }
}
